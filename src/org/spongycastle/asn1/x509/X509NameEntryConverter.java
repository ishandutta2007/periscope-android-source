// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1.x509;

import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.ASN1Primitive;

public abstract class X509NameEntryConverter
{

    public X509NameEntryConverter()
    {
    }

    public abstract ASN1Primitive _mth02CA(ASN1ObjectIdentifier asn1objectidentifier, String s);
}
