// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jcajce.provider.symmetric;

import org.spongycastle.crypto.CipherKeyGenerator;
import org.spongycastle.crypto.engines.VMPCKSA3Engine;
import org.spongycastle.jcajce.provider.config.ConfigurableProvider;
import org.spongycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.spongycastle.jcajce.provider.symmetric.util.BaseStreamCipher;
import org.spongycastle.jcajce.provider.util.AlgorithmProvider;

public final class VMPCKSA3
{
    public static class Base extends BaseStreamCipher
    {

        public Base()
        {
            super(new VMPCKSA3Engine(), 16);
        }
    }

    public static class KeyGen extends BaseKeyGenerator
    {

        public KeyGen()
        {
            super("VMPC-KSA3", 128, new CipherKeyGenerator());
        }
    }

    public static class Mappings extends AlgorithmProvider
    {

        private static final String PREFIX = org/spongycastle/jcajce/provider/symmetric/VMPCKSA3.getName();

        public final void _mth02CA(ConfigurableProvider configurableprovider)
        {
            configurableprovider._mth0640("Cipher.VMPC-KSA3", (new StringBuilder()).append(PREFIX).append("$Base").toString());
            configurableprovider._mth0640("KeyGenerator.VMPC-KSA3", (new StringBuilder()).append(PREFIX).append("$KeyGen").toString());
        }


        public Mappings()
        {
        }
    }


    private VMPCKSA3()
    {
    }
}
