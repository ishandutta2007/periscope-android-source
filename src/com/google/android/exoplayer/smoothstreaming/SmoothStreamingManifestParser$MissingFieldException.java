// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.smoothstreaming;

import com.google.android.exoplayer.ParserException;

// Referenced classes of package com.google.android.exoplayer.smoothstreaming:
//            SmoothStreamingManifestParser

public static class  extends ParserException
{

    public (String s)
    {
        super((new StringBuilder("Missing required field: ")).append(s).toString());
    }
}
