// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.x509;

import org.spongycastle.asn1.ASN1Encodable;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.x509.Attribute;

public class X509Attribute extends ASN1Object
{

    Attribute aPT;

    X509Attribute(ASN1Encodable asn1encodable)
    {
        aPT = Attribute._mth1D35(asn1encodable);
    }

    public final ASN1Primitive _mth0427()
    {
        return aPT._mth0427();
    }
}
