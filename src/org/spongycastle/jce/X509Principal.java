// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jce;

import java.io.IOException;
import java.security.Principal;
import org.spongycastle.asn1.ASN1InputStream;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.x500.X500Name;
import org.spongycastle.asn1.x509.X509Name;

public class X509Principal extends X509Name
    implements Principal
{

    public X509Principal(X500Name x500name)
    {
        super((ASN1Sequence)x500name._mth0427());
    }

    public X509Principal(X509Name x509name)
    {
        super((ASN1Sequence)x509name._mth0427());
    }

    public X509Principal(byte abyte0[])
    {
        super(_mth02CB(new ASN1InputStream(abyte0)));
    }

    private static ASN1Sequence _mth02CB(ASN1InputStream asn1inputstream)
    {
        try
        {
            asn1inputstream = ASN1Sequence._mth141F(asn1inputstream._mth04B7());
        }
        // Misplaced declaration of an exception variable
        catch (ASN1InputStream asn1inputstream)
        {
            throw new IOException((new StringBuilder("not an ASN.1 Sequence: ")).append(asn1inputstream).toString());
        }
        return asn1inputstream;
    }

    public byte[] getEncoded()
    {
        byte abyte0[];
        try
        {
            abyte0 = getEncoded("DER");
        }
        catch (IOException ioexception)
        {
            throw new RuntimeException(ioexception.toString());
        }
        return abyte0;
    }

    public String getName()
    {
        return toString();
    }
}
