// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1.smime;

import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.pkcs.PKCSObjectIdentifiers;

public class SMIMECapabilities extends ASN1Object
{

    public final ASN1Primitive _mth0427()
    {
        return null;
    }

    static 
    {
        ASN1ObjectIdentifier asn1objectidentifier = PKCSObjectIdentifiers.acc;
        asn1objectidentifier = PKCSObjectIdentifiers.acd;
        asn1objectidentifier = PKCSObjectIdentifiers.ace;
        new ASN1ObjectIdentifier("1.3.14.3.2.7");
        asn1objectidentifier = PKCSObjectIdentifiers.abw;
        asn1objectidentifier = PKCSObjectIdentifiers.abx;
    }
}
