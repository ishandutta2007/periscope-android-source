// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jcajce.provider.digest;

import org.spongycastle.crypto.digests.MD2Digest;

// Referenced classes of package org.spongycastle.jcajce.provider.digest:
//            BCMessageDigest, MD2

public static class gest extends BCMessageDigest
    implements Cloneable
{

    public Object clone()
    {
        gest gest = (gest)super.clone();
        gest.amS = new MD2Digest((MD2Digest)amS);
        return gest;
    }

    public gest()
    {
        super(new MD2Digest());
    }
}
