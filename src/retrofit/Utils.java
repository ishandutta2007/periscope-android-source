// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package retrofit;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executor;
import retrofit.client.Request;
import retrofit.client.Response;
import retrofit.mime.TypedByteArray;
import retrofit.mime.TypedInput;
import retrofit.mime.TypedOutput;

final class Utils
{
    static class SynchronousExecutor
        implements Executor
    {

        public void execute(Runnable runnable)
        {
            runnable.run();
        }

        SynchronousExecutor()
        {
        }
    }


    private static final int BUFFER_SIZE = 4096;

    private Utils()
    {
    }

    static Request readBodyToBytesIfNecessary(Request request)
    {
        Object obj = request.getBody();
        if (obj == null || (obj instanceof TypedByteArray))
        {
            return request;
        } else
        {
            String s = ((TypedOutput) (obj)).mimeType();
            ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
            ((TypedOutput) (obj)).writeTo(bytearrayoutputstream);
            obj = new TypedByteArray(s, bytearrayoutputstream.toByteArray());
            return new Request(request.getMethod(), request.getUrl(), request.getHeaders(), ((TypedOutput) (obj)));
        }
    }

    static Response readBodyToBytesIfNecessary(Response response)
    {
        Object obj;
        String s;
        obj = response.getBody();
        if (obj == null || (obj instanceof TypedByteArray))
        {
            return response;
        }
        s = ((TypedInput) (obj)).mimeType();
        obj = ((TypedInput) (obj)).in();
        response = replaceResponseBody(response, new TypedByteArray(s, streamToBytes(((InputStream) (obj)))));
        if (obj != null)
        {
            try
            {
                ((InputStream) (obj)).close();
            }
            catch (IOException ioexception)
            {
                return response;
            }
        }
        return response;
        response;
        if (obj != null)
        {
            try
            {
                ((InputStream) (obj)).close();
            }
            catch (IOException ioexception1) { }
        }
        throw response;
    }

    static Response replaceResponseBody(Response response, TypedInput typedinput)
    {
        return new Response(response.getUrl(), response.getStatus(), response.getReason(), response.getHeaders(), typedinput);
    }

    static byte[] streamToBytes(InputStream inputstream)
    {
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        if (inputstream != null)
        {
            byte abyte0[] = new byte[4096];
            do
            {
                int i = inputstream.read(abyte0);
                if (i == -1)
                {
                    break;
                }
                bytearrayoutputstream.write(abyte0, 0, i);
            } while (true);
        }
        return bytearrayoutputstream.toByteArray();
    }

    static void validateServiceClass(Class class1)
    {
        if (!class1.isInterface())
        {
            throw new IllegalArgumentException("Only interface endpoint definitions are supported.");
        }
        if (class1.getInterfaces().length > 0)
        {
            throw new IllegalArgumentException("Interface definitions must not extend other interfaces.");
        } else
        {
            return;
        }
    }
}
