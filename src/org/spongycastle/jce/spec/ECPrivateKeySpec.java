// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jce.spec;

import java.math.BigInteger;

// Referenced classes of package org.spongycastle.jce.spec:
//            ECKeySpec, ECParameterSpec

public class ECPrivateKeySpec extends ECKeySpec
{

    public BigInteger awZ;

    public ECPrivateKeySpec(BigInteger biginteger, ECParameterSpec ecparameterspec)
    {
        super(ecparameterspec);
        awZ = biginteger;
    }
}
