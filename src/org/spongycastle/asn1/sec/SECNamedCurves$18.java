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
        Object obj = SECNamedCurves._mth1505("07A11B09A76B562144418FF3FF8C2570B8");
        BigInteger biginteger2 = SECNamedCurves._mth1505("0217C05610884B63B9C6C7291678F9D341");
        byte abyte0[] = Hex._mth1508("4D696E676875615175985BD3ADBADA21B43A97E2");
        BigInteger biginteger = SECNamedCurves._mth1505("0400000000000000023123953A9464B54D");
        BigInteger biginteger1 = BigInteger.valueOf(2L);
        obj = SECNamedCurves._mth02CA(new org.spongycastle.math.ec.(131, 2, 3, 8, ((BigInteger) (obj)), biginteger2, biginteger, biginteger1));
        return new X9ECParameters(((ECCurve) (obj)), ((ECCurve) (obj))._mth01C3(Hex._mth1508("040081BAF91FDF9833C40F9C181343638399078C6E7EA38C001F73C8134B1B4EF9E150")), biginteger, biginteger1, abyte0);
    }

    r()
    {
    }
}
