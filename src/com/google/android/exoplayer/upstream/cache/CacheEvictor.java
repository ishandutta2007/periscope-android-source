// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.upstream.cache;


// Referenced classes of package com.google.android.exoplayer.upstream.cache:
//            Cache

public interface CacheEvictor
    extends Cache.Listener
{

    public abstract void onStartFile(Cache cache, String s, long l, long l1);
}
