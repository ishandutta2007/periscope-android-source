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
        Object obj = BigInteger.valueOf(1L);
        BigInteger biginteger2 = SECNamedCurves._mth1505("0066647EDE6C332C7F8C0923BB58213B333B20E9CE4281FE115F7D8F90AD");
        byte abyte0[] = Hex._mth1508("74D59FF07F6B413D0EA14B344B20A2DB049B50C3");
        BigInteger biginteger = SECNamedCurves._mth1505("01000000000000000000000000000013E974E72F8A6922031D2603CFE0D7");
        BigInteger biginteger1 = BigInteger.valueOf(2L);
        obj = SECNamedCurves._mth02CA(new org.spongycastle.math.ec.(233, 74, ((BigInteger) (obj)), biginteger2, biginteger, biginteger1));
        return new X9ECParameters(((ECCurve) (obj)), ((ECCurve) (obj))._mth01C3(Hex._mth1508("0400FAC9DFCBAC8313BB2139F1BB755FEF65BC391F8B36F8F8EB7371FD558B01006A08A41903350678E58528BEBF8A0BEFF867A7CA36716F7E01F81052")), biginteger, biginteger1, abyte0);
    }

    r()
    {
    }
}
