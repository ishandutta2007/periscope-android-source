// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jcajce.provider.symmetric;

import org.spongycastle.jcajce.provider.config.ConfigurableProvider;
import org.spongycastle.jcajce.provider.util.AlgorithmProvider;

// Referenced classes of package org.spongycastle.jcajce.provider.symmetric:
//            RC5

public static class ider extends AlgorithmProvider
{

    private static final String PREFIX = org/spongycastle/jcajce/provider/symmetric/RC5.getName();

    public final void _mth02CA(ConfigurableProvider configurableprovider)
    {
        configurableprovider._mth0640("Cipher.RC5", (new StringBuilder()).append(PREFIX).append("$ECB32").toString());
        configurableprovider._mth0640("Alg.Alias.Cipher.RC5-32", "RC5");
        configurableprovider._mth0640("Cipher.RC5-64", (new StringBuilder()).append(PREFIX).append("$ECB64").toString());
        configurableprovider._mth0640("KeyGenerator.RC5", (new StringBuilder()).append(PREFIX).append("$KeyGen32").toString());
        configurableprovider._mth0640("Alg.Alias.KeyGenerator.RC5-32", "RC5");
        configurableprovider._mth0640("KeyGenerator.RC5-64", (new StringBuilder()).append(PREFIX).append("$KeyGen64").toString());
        configurableprovider._mth0640("AlgorithmParameters.RC5", (new StringBuilder()).append(PREFIX).append("$AlgParams").toString());
        configurableprovider._mth0640("AlgorithmParameters.RC5-64", (new StringBuilder()).append(PREFIX).append("$AlgParams").toString());
        configurableprovider._mth0640("Mac.RC5MAC", (new StringBuilder()).append(PREFIX).append("$Mac32").toString());
        configurableprovider._mth0640("Alg.Alias.Mac.RC5", "RC5MAC");
        configurableprovider._mth0640("Mac.RC5MAC/CFB8", (new StringBuilder()).append(PREFIX).append("$CFB8Mac32").toString());
        configurableprovider._mth0640("Alg.Alias.Mac.RC5/CFB8", "RC5MAC/CFB8");
    }


    public ider()
    {
    }
}
