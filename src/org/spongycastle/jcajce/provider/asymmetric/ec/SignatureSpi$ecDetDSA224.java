// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jcajce.provider.asymmetric.ec;

import org.spongycastle.crypto.digests.SHA224Digest;
import org.spongycastle.crypto.signers.ECDSASigner;
import org.spongycastle.crypto.signers.HMacDSAKCalculator;

// Referenced classes of package org.spongycastle.jcajce.provider.asymmetric.ec:
//            SignatureSpi

public static class r extends SignatureSpi
{

    public r()
    {
        super(new SHA224Digest(), new ECDSASigner(new HMacDSAKCalculator(new SHA224Digest())), new r((byte)0));
    }
}
