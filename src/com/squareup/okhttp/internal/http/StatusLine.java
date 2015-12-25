// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.http;

import com.squareup.okhttp.Protocol;
import com.squareup.okhttp.Response;
import java.net.ProtocolException;

public final class StatusLine
{

    public static final int HTTP_CONTINUE = 100;
    public static final int HTTP_PERM_REDIRECT = 308;
    public static final int HTTP_TEMP_REDIRECT = 307;
    public final int code;
    public final String message;
    public final Protocol protocol;

    public StatusLine(Protocol protocol1, int i, String s)
    {
        protocol = protocol1;
        code = i;
        message = s;
    }

    public static StatusLine get(Response response)
    {
        return new StatusLine(response.protocol(), response.code(), response.message());
    }

    public static StatusLine parse(String s)
    {
        NumberFormatException numberformatexception;
        Protocol protocol1;
        byte byte0;
        if (s.startsWith("HTTP/1."))
        {
            if (s.length() < 9 || s.charAt(8) != ' ')
            {
                throw new ProtocolException((new StringBuilder("Unexpected status line: ")).append(s).toString());
            }
            int i = s.charAt(7) - 48;
            byte0 = 9;
            if (i == 0)
            {
                protocol1 = Protocol.HTTP_1_0;
            } else
            if (i == 1)
            {
                protocol1 = Protocol.HTTP_1_1;
            } else
            {
                throw new ProtocolException((new StringBuilder("Unexpected status line: ")).append(s).toString());
            }
        } else
        if (s.startsWith("ICY "))
        {
            protocol1 = Protocol.HTTP_1_0;
            byte0 = 4;
        } else
        {
            throw new ProtocolException((new StringBuilder("Unexpected status line: ")).append(s).toString());
        }
        if (s.length() < byte0 + 3)
        {
            throw new ProtocolException((new StringBuilder("Unexpected status line: ")).append(s).toString());
        }
        int j;
        try
        {
            j = Integer.parseInt(s.substring(byte0, byte0 + 3));
        }
        // Misplaced declaration of an exception variable
        catch (NumberFormatException numberformatexception)
        {
            throw new ProtocolException((new StringBuilder("Unexpected status line: ")).append(s).toString());
        }
        String s1 = "";
        if (s.length() > byte0 + 3)
        {
            if (s.charAt(byte0 + 3) != ' ')
            {
                throw new ProtocolException((new StringBuilder("Unexpected status line: ")).append(s).toString());
            }
            s1 = s.substring(byte0 + 4);
        }
        return new StatusLine(protocol1, j, s1);
    }

    public final String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        String s;
        if (protocol == Protocol.HTTP_1_0)
        {
            s = "HTTP/1.0";
        } else
        {
            s = "HTTP/1.1";
        }
        stringbuilder.append(s);
        stringbuilder.append(' ').append(code);
        if (message != null)
        {
            stringbuilder.append(' ').append(message);
        }
        return stringbuilder.toString();
    }
}
