// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jcajce.provider.symmetric;

import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.crypto.engines.NoekeonEngine;
import org.spongycastle.jcajce.provider.symmetric.util.BaseBlockCipher;
import org.spongycastle.jcajce.provider.symmetric.util.BlockCipherProvider;

// Referenced classes of package org.spongycastle.jcajce.provider.symmetric:
//            Noekeon

public static class _cls1 extends BaseBlockCipher
{

    public pherProvider()
    {
        class _cls1
            implements BlockCipherProvider
        {

            public final BlockCipher _mth1627()
            {
                return new NoekeonEngine();
            }

            _cls1()
            {
            }
        }

        super(new _cls1());
    }
}
