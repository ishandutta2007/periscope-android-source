// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1.dvcs;

import org.spongycastle.asn1.ASN1Choice;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.DERTaggedObject;

public class CertEtcToken extends ASN1Object
    implements ASN1Choice
{

    private static final boolean Yw[] = {
        0, 1, 0, 1, 0, 1, 0, 0, 1
    };

    public String toString()
    {
        return (new StringBuilder("CertEtcToken {\n")).append(null).append("}\n").toString();
    }

    public final ASN1Primitive _mth0427()
    {
        return new DERTaggedObject(Yw[0], 0, null);
    }

}
