// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal;

import java.net.InetAddress;

public interface Network
{

    public static final Network DEFAULT = new _cls1();

    public abstract InetAddress[] resolveInetAddresses(String s);


    private class _cls1
        implements Network
    {

        public final InetAddress[] resolveInetAddresses(String s)
        {
            if (s == null)
            {
                throw new UnknownHostException("host == null");
            } else
            {
                return InetAddress.getAllByName(s);
            }
        }

        _cls1()
        {
        }
    }

}
