// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package o;

import java.util.concurrent.ThreadFactory;

// Referenced classes of package o:
//            td

public static final class 
    implements ThreadFactory
{

    private final int SZ = 10;

    public final Thread newThread(Runnable runnable)
    {
        runnable = new Thread(runnable);
        runnable.setPriority(SZ);
        runnable.setName("Queue");
        return runnable;
    }

    public (int i)
    {
    }
}
