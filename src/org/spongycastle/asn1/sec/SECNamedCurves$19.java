// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1.sec;

import java.math.BigInteger;
import org.spongycastle.asn1.x9.X9ECParameters;
import org.spongycastle.asn1.x9.X9ECParametersHolder;
import org.spongycastle.math.ec.ECCurve;
import org.spongycastle.util.encoders.Hex;

// Referenced classes of package org.spongycastle.asn1.sec:
//            SECNamedCurves

final class r extends X9ECParametersHolder
{

    protected final X9ECParameters _mth098C()
    {
        Object obj = SECNamedCurves._mth1505("03E5A88919D7CAFCBF415F07C2176573B2");
        BigInteger biginteger2 = SECNamedCurves._mth1505("04B8266A46C55657AC734CE38F018F2192");
        byte abyte0[] = Hex._mth1508("985BD3ADBAD4D696E676875615175A21B43A97E3");
        BigInteger biginteger = SECNamedCurves._mth1505("0400000000000000016954A233049BA98F");
        BigInteger biginteger1 = BigInteger.valueOf(2L);
        obj = SECNamedCurves._mth02CA(new org.spongycastle.math.ec.(131, 2, 3, 8, ((BigInteger) (obj)), biginteger2, biginteger, biginteger1));
        return new X9ECParameters(((ECCurve) (obj)), ((ECCurve) (obj))._mth01C3(Hex._mth1508("040356DCD8F2F95031AD652D23951BB366A80648F06D867940A5366D9E265DE9EB240F")), biginteger, biginteger1, abyte0);
    }

    r()
    {
    }
}
