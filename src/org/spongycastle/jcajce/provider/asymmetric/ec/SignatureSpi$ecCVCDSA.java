// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jcajce.provider.asymmetric.ec;

import org.spongycastle.crypto.digests.SHA1Digest;
import org.spongycastle.crypto.signers.ECDSASigner;

// Referenced classes of package org.spongycastle.jcajce.provider.asymmetric.ec:
//            SignatureSpi

public static class ncoder extends SignatureSpi
{

    public ncoder()
    {
        super(new SHA1Digest(), new ECDSASigner(), new ncoder((byte)0));
    }
}
