// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.x509.util;


public class StreamParsingException extends Exception
{

    private Throwable aPu;

    public StreamParsingException(String s, Exception exception)
    {
        super(s);
        aPu = exception;
    }

    public Throwable getCause()
    {
        return aPu;
    }
}
