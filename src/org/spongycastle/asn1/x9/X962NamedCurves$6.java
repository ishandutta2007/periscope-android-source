// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1.x9;

import java.math.BigInteger;
import org.spongycastle.math.ec.ECCurve;
import org.spongycastle.util.encoders.Hex;

// Referenced classes of package org.spongycastle.asn1.x9:
//            X9ECParametersHolder, X9ECParameters

final class er extends X9ECParametersHolder
{

    protected final X9ECParameters _mth098C()
    {
        BigInteger biginteger = new BigInteger("7fffffffffffffffffffffff7fffff975deb41b3a6057c3c432146526551", 16);
        BigInteger biginteger1 = BigInteger.valueOf(1L);
        org.spongycastle.math.ec.er er = new org.spongycastle.math.ec.er(new BigInteger("883423532389192164791648750360308885314476597252960362792450860609699839"), new BigInteger("7fffffffffffffffffffffff7fffffffffff8000000000007ffffffffffc", 16), new BigInteger("255705fa2a306654b1f4cb03d6a750a30c250102d4988717d9ba15ab6d3e", 16), biginteger, biginteger1);
        return new X9ECParameters(er, er._mth01C3(Hex._mth1508("036768ae8e18bb92cfcf005c949aa2c6d94853d0e660bbf854b1c9505fe95a")), biginteger, biginteger1, Hex._mth1508("7d7374168ffe3471b60a857686a19475d3bfa2ff"));
    }

    er()
    {
    }
}
