// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jcajce.provider.symmetric;

import org.spongycastle.crypto.BufferedBlockCipher;
import org.spongycastle.crypto.engines.RC6Engine;
import org.spongycastle.crypto.modes.CFBBlockCipher;
import org.spongycastle.jcajce.provider.symmetric.util.BaseBlockCipher;

// Referenced classes of package org.spongycastle.jcajce.provider.symmetric:
//            RC6

public static class  extends BaseBlockCipher
{

    public eBlockCipher()
    {
        super(new BufferedBlockCipher(new CFBBlockCipher(new RC6Engine(), 128)), 128);
    }
}
