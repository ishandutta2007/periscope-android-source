// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal;

import java.util.concurrent.ThreadFactory;

final class val.daemon
    implements ThreadFactory
{

    final boolean val$daemon;
    final String val$name;

    public final Thread newThread(Runnable runnable)
    {
        runnable = new Thread(runnable, val$name);
        runnable.setDaemon(val$daemon);
        return runnable;
    }

    ()
    {
        val$name = s;
        val$daemon = flag;
        super();
    }
}
