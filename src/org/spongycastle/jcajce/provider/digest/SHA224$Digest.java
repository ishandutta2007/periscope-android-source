// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jcajce.provider.digest;

import org.spongycastle.crypto.digests.SHA224Digest;

// Referenced classes of package org.spongycastle.jcajce.provider.digest:
//            BCMessageDigest, SHA224

public static class t extends BCMessageDigest
    implements Cloneable
{

    public Object clone()
    {
        t t = (t)super.clone();
        t.amS = new SHA224Digest((SHA224Digest)amS);
        return t;
    }

    public t()
    {
        super(new SHA224Digest());
    }
}
