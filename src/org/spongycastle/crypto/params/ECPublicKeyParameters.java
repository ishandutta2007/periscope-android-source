// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.params;

import org.spongycastle.math.ec.ECPoint;

// Referenced classes of package org.spongycastle.crypto.params:
//            ECKeyParameters, ECDomainParameters

public class ECPublicKeyParameters extends ECKeyParameters
{

    public ECPoint axk;

    public ECPublicKeyParameters(ECPoint ecpoint, ECDomainParameters ecdomainparameters)
    {
        super(false, ecdomainparameters);
        axk = ecpoint._mth0188();
    }
}
