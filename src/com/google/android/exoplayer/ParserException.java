// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer;

import java.io.IOException;

public class ParserException extends IOException
{

    public ParserException(String s)
    {
        super(s);
    }

    public ParserException(String s, Throwable throwable)
    {
        super(s, throwable);
    }

    public ParserException(Throwable throwable)
    {
        super(throwable);
    }
}
