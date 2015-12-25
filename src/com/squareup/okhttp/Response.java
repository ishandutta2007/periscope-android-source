// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp;

import com.squareup.okhttp.internal.http.OkHeaders;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.squareup.okhttp:
//            CacheControl, Headers, Request, ResponseBody, 
//            Handshake, Protocol

public final class Response
{
    public static class Builder
    {

        private ResponseBody body;
        private Response cacheResponse;
        private int code;
        private Handshake handshake;
        private Headers.Builder headers;
        private String message;
        private Response networkResponse;
        private Response priorResponse;
        private Protocol protocol;
        private Request request;

        private void checkPriorResponse(Response response)
        {
            if (response.body != null)
            {
                throw new IllegalArgumentException("priorResponse.body != null");
            } else
            {
                return;
            }
        }

        private void checkSupportResponse(String s, Response response)
        {
            if (response.body != null)
            {
                throw new IllegalArgumentException((new StringBuilder()).append(s).append(".body != null").toString());
            }
            if (response.networkResponse != null)
            {
                throw new IllegalArgumentException((new StringBuilder()).append(s).append(".networkResponse != null").toString());
            }
            if (response.cacheResponse != null)
            {
                throw new IllegalArgumentException((new StringBuilder()).append(s).append(".cacheResponse != null").toString());
            }
            if (response.priorResponse != null)
            {
                throw new IllegalArgumentException((new StringBuilder()).append(s).append(".priorResponse != null").toString());
            } else
            {
                return;
            }
        }

        public Builder addHeader(String s, String s1)
        {
            headers.add(s, s1);
            return this;
        }

        public Builder body(ResponseBody responsebody)
        {
            body = responsebody;
            return this;
        }

        public Response build()
        {
            if (request == null)
            {
                throw new IllegalStateException("request == null");
            }
            if (protocol == null)
            {
                throw new IllegalStateException("protocol == null");
            }
            if (code < 0)
            {
                throw new IllegalStateException((new StringBuilder("code < 0: ")).append(code).toString());
            } else
            {
                return new Response(this, null);
            }
        }

        public Builder cacheResponse(Response response)
        {
            if (response != null)
            {
                checkSupportResponse("cacheResponse", response);
            }
            cacheResponse = response;
            return this;
        }

        public Builder code(int i)
        {
            code = i;
            return this;
        }

        public Builder handshake(Handshake handshake1)
        {
            handshake = handshake1;
            return this;
        }

        public Builder header(String s, String s1)
        {
            headers.set(s, s1);
            return this;
        }

        public Builder headers(Headers headers1)
        {
            headers = headers1.newBuilder();
            return this;
        }

        public Builder message(String s)
        {
            message = s;
            return this;
        }

        public Builder networkResponse(Response response)
        {
            if (response != null)
            {
                checkSupportResponse("networkResponse", response);
            }
            networkResponse = response;
            return this;
        }

        public Builder priorResponse(Response response)
        {
            if (response != null)
            {
                checkPriorResponse(response);
            }
            priorResponse = response;
            return this;
        }

        public Builder protocol(Protocol protocol1)
        {
            protocol = protocol1;
            return this;
        }

        public Builder removeHeader(String s)
        {
            headers.removeAll(s);
            return this;
        }

        public Builder request(Request request1)
        {
            request = request1;
            return this;
        }











        public Builder()
        {
            code = -1;
            headers = new Headers.Builder();
        }

        private Builder(Response response)
        {
            code = -1;
            request = response.request;
            protocol = response.protocol;
            code = response.code;
            message = response.message;
            handshake = response.handshake;
            headers = response.headers.newBuilder();
            body = response.body;
            networkResponse = response.networkResponse;
            cacheResponse = response.cacheResponse;
            priorResponse = response.priorResponse;
        }

        Builder(Response response, _cls1 _pcls1)
        {
            this(response);
        }
    }


    private final ResponseBody body;
    private volatile CacheControl cacheControl;
    private Response cacheResponse;
    private final int code;
    private final Handshake handshake;
    private final Headers headers;
    private final String message;
    private Response networkResponse;
    private final Response priorResponse;
    private final Protocol protocol;
    private final Request request;

    private Response(Builder builder)
    {
        request = builder.request;
        protocol = builder.protocol;
        code = builder.code;
        message = builder.message;
        handshake = builder.handshake;
        headers = builder.headers.build();
        body = builder.body;
        networkResponse = builder.networkResponse;
        cacheResponse = builder.cacheResponse;
        priorResponse = builder.priorResponse;
    }

    Response(Builder builder, _cls1 _pcls1)
    {
        this(builder);
    }

    public final ResponseBody body()
    {
        return body;
    }

    public final CacheControl cacheControl()
    {
        CacheControl cachecontrol = cacheControl;
        if (cachecontrol != null)
        {
            return cachecontrol;
        } else
        {
            CacheControl cachecontrol1 = CacheControl.parse(headers);
            cacheControl = cachecontrol1;
            return cachecontrol1;
        }
    }

    public final Response cacheResponse()
    {
        return cacheResponse;
    }

    public final List challenges()
    {
        String s;
        if (code == 401)
        {
            s = "WWW-Authenticate";
        } else
        if (code == 407)
        {
            s = "Proxy-Authenticate";
        } else
        {
            return Collections.emptyList();
        }
        return OkHeaders.parseChallenges(headers(), s);
    }

    public final int code()
    {
        return code;
    }

    public final Handshake handshake()
    {
        return handshake;
    }

    public final String header(String s)
    {
        return header(s, null);
    }

    public final String header(String s, String s1)
    {
        s = headers.get(s);
        if (s != null)
        {
            return s;
        } else
        {
            return s1;
        }
    }

    public final Headers headers()
    {
        return headers;
    }

    public final List headers(String s)
    {
        return headers.values(s);
    }

    public final boolean isRedirect()
    {
        switch (code)
        {
        case 300: 
        case 301: 
        case 302: 
        case 303: 
        case 307: 
        case 308: 
            return true;
        }
        return false;
    }

    public final boolean isSuccessful()
    {
        return code >= 200 && code < 300;
    }

    public final String message()
    {
        return message;
    }

    public final Response networkResponse()
    {
        return networkResponse;
    }

    public final Builder newBuilder()
    {
        return new Builder(this, null);
    }

    public final Response priorResponse()
    {
        return priorResponse;
    }

    public final Protocol protocol()
    {
        return protocol;
    }

    public final Request request()
    {
        return request;
    }

    public final String toString()
    {
        return (new StringBuilder("Response{protocol=")).append(protocol).append(", code=").append(code).append(", message=").append(message).append(", url=").append(request.urlString()).append('}').toString();
    }










}
