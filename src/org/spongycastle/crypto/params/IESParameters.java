// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.params;

import org.spongycastle.crypto.CipherParameters;

public class IESParameters
    implements CipherParameters
{

    public byte axp[];
    public byte axq[];
    public int axr;

    public IESParameters(byte abyte0[], byte abyte1[], int i)
    {
        axp = abyte0;
        axq = abyte1;
        axr = i;
    }
}
