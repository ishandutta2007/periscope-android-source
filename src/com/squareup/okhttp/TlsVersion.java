// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp;


public final class TlsVersion extends Enum
{

    private static final TlsVersion $VALUES[];
    public static final TlsVersion SSL_3_0;
    public static final TlsVersion TLS_1_0;
    public static final TlsVersion TLS_1_1;
    public static final TlsVersion TLS_1_2;
    final String javaName;

    private TlsVersion(String s, int i, String s1)
    {
        super(s, i);
        javaName = s1;
    }

    public static TlsVersion forJavaName(String s)
    {
        byte byte0 = -1;
        switch (s.hashCode())
        {
        case -503070502: 
            if (s.equals("TLSv1.2"))
            {
                byte0 = 0;
            }
            break;

        case -503070503: 
            if (s.equals("TLSv1.1"))
            {
                byte0 = 1;
            }
            break;

        case 79923350: 
            if (s.equals("TLSv1"))
            {
                byte0 = 2;
            }
            break;

        case 79201641: 
            if (s.equals("SSLv3"))
            {
                byte0 = 3;
            }
            break;
        }
        switch (byte0)
        {
        case 0: // '\0'
            return TLS_1_2;

        case 1: // '\001'
            return TLS_1_1;

        case 2: // '\002'
            return TLS_1_0;

        case 3: // '\003'
            return SSL_3_0;
        }
        throw new IllegalArgumentException((new StringBuilder("Unexpected TLS version: ")).append(s).toString());
    }

    public static TlsVersion valueOf(String s)
    {
        return (TlsVersion)Enum.valueOf(com/squareup/okhttp/TlsVersion, s);
    }

    public static TlsVersion[] values()
    {
        return (TlsVersion[])$VALUES.clone();
    }

    static 
    {
        TLS_1_2 = new TlsVersion("TLS_1_2", 0, "TLSv1.2");
        TLS_1_1 = new TlsVersion("TLS_1_1", 1, "TLSv1.1");
        TLS_1_0 = new TlsVersion("TLS_1_0", 2, "TLSv1");
        SSL_3_0 = new TlsVersion("SSL_3_0", 3, "SSLv3");
        $VALUES = (new TlsVersion[] {
            TLS_1_2, TLS_1_1, TLS_1_0, SSL_3_0
        });
    }
}
