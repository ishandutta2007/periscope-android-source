// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jcajce.provider.asymmetric.rsa;

import org.spongycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.spongycastle.crypto.digests.MD4Digest;
import org.spongycastle.crypto.encodings.PKCS1Encoding;
import org.spongycastle.crypto.engines.RSABlindedEngine;

// Referenced classes of package org.spongycastle.jcajce.provider.asymmetric.rsa:
//            DigestSignatureSpi

public static class t> extends DigestSignatureSpi
{

    public ()
    {
        super(PKCSObjectIdentifiers.abB, new MD4Digest(), new PKCS1Encoding(new RSABlindedEngine()));
    }
}