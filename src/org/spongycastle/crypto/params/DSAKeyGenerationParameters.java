// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.params;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.spongycastle.crypto.KeyGenerationParameters;

// Referenced classes of package org.spongycastle.crypto.params:
//            DSAParameters

public class DSAKeyGenerationParameters extends KeyGenerationParameters
{

    public DSAParameters axf;

    public DSAKeyGenerationParameters(SecureRandom securerandom, DSAParameters dsaparameters)
    {
        super(securerandom, dsaparameters.amM.bitLength() - 1);
        axf = dsaparameters;
    }
}
