// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.params;

import org.spongycastle.crypto.CipherParameters;

// Referenced classes of package org.spongycastle.crypto.params:
//            DSAParameters

public class CramerShoupParameters
    implements CipherParameters
{

    public boolean equals(Object obj)
    {
        if (!(obj instanceof DSAParameters))
        {
            return false;
        } else
        {
            obj = (CramerShoupParameters)obj;
            throw new NullPointerException();
        }
    }

    public int hashCode()
    {
        throw new NullPointerException();
    }
}
