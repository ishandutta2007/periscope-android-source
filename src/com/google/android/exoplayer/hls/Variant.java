// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.hls;

import com.google.android.exoplayer.chunk.Format;
import com.google.android.exoplayer.chunk.FormatWrapper;

public final class Variant
    implements FormatWrapper
{

    public final Format format;
    public final String url;

    public Variant(int i, String s, int j, String s1, int k, int l)
    {
        url = s;
        format = new Format(Integer.toString(i), "application/x-mpegURL", k, l, -1F, -1, -1, j, null, s1);
    }

    public final Format getFormat()
    {
        return format;
    }
}
