// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1;

import java.io.IOException;

public class ASN1Exception extends IOException
{

    private Throwable VU;

    ASN1Exception(String s)
    {
        super(s);
    }

    ASN1Exception(String s, IllegalArgumentException illegalargumentexception)
    {
        super(s);
        VU = illegalargumentexception;
    }

    public Throwable getCause()
    {
        return VU;
    }
}
