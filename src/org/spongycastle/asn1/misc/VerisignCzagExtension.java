// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1.misc;

import org.spongycastle.asn1.DERIA5String;

public class VerisignCzagExtension extends DERIA5String
{

    public VerisignCzagExtension(DERIA5String deria5string)
    {
        super(deria5string.getString());
    }

    public String toString()
    {
        return (new StringBuilder("VerisignCzagExtension: ")).append(getString()).toString();
    }
}
