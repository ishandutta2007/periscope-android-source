// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.upstream;


public interface TransferListener
{

    public abstract void onBytesTransferred(int i);

    public abstract void onTransferEnd();

    public abstract void onTransferStart();
}
