// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.params;

import java.math.BigInteger;

// Referenced classes of package org.spongycastle.crypto.params:
//            ECKeyParameters, ECDomainParameters

public class ECPrivateKeyParameters extends ECKeyParameters
{

    public BigInteger awZ;

    public ECPrivateKeyParameters(BigInteger biginteger, ECDomainParameters ecdomainparameters)
    {
        super(true, ecdomainparameters);
        awZ = biginteger;
    }
}
