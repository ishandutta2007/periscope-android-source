// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer;


// Referenced classes of package com.google.android.exoplayer:
//            ExoPlayer, ExoPlaybackException

public static interface n
{

    public abstract void onPlayWhenReadyCommitted();

    public abstract void onPlayerError(ExoPlaybackException exoplaybackexception);

    public abstract void onPlayerSeekComplete();

    public abstract void onPlayerStateChanged(boolean flag, int i);
}
