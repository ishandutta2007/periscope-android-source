// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.codahale.metrics;


// Referenced classes of package com.codahale.metrics:
//            ThreadLocalRandom

final class  extends ThreadLocal
{

    protected final ThreadLocalRandom initialValue()
    {
        return new ThreadLocalRandom();
    }

    protected final volatile Object initialValue()
    {
        return initialValue();
    }

    ()
    {
    }
}
