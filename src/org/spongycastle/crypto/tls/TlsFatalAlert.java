// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.tls;

import java.io.IOException;

public class TlsFatalAlert extends IOException
{

    short aBX;

    public TlsFatalAlert(short word0)
    {
        aBX = word0;
    }
}
