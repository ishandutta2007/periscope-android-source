// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jce.exception;

import java.security.cert.CertPathBuilderException;

// Referenced classes of package org.spongycastle.jce.exception:
//            ExtException

public class ExtCertPathBuilderException extends CertPathBuilderException
    implements ExtException
{

    private Throwable VU;

    public ExtCertPathBuilderException(String s, Exception exception)
    {
        super(s);
        VU = exception;
    }

    public Throwable getCause()
    {
        return VU;
    }
}
