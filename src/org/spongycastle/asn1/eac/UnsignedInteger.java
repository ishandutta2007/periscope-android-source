// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1.eac;

import java.math.BigInteger;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.DEROctetString;
import org.spongycastle.asn1.DERTaggedObject;

public class UnsignedInteger extends ASN1Object
{

    private int Wk;
    private BigInteger YU;

    public UnsignedInteger(int i, BigInteger biginteger)
    {
        Wk = i;
        YU = biginteger;
    }

    public final ASN1Primitive _mth0427()
    {
        int i = Wk;
        byte abyte0[] = YU.toByteArray();
        if (abyte0[0] == 0)
        {
            byte abyte1[] = new byte[abyte0.length - 1];
            System.arraycopy(abyte0, 1, abyte1, 0, abyte1.length);
            abyte0 = abyte1;
        }
        return new DERTaggedObject(false, i, new DEROctetString(abyte0));
    }
}
