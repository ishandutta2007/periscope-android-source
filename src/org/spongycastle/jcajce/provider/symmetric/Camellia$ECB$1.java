// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jcajce.provider.symmetric;

import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.crypto.engines.CamelliaEngine;
import org.spongycastle.jcajce.provider.symmetric.util.BlockCipherProvider;

class rProvider
    implements BlockCipherProvider
{

    public final BlockCipher _mth1627()
    {
        return new CamelliaEngine();
    }

    rProvider()
    {
    }
}
