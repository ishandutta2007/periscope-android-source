// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.spdy;


// Referenced classes of package com.squareup.okhttp.internal.spdy:
//            Huffman

static final class terminalBits
{

    private final terminalBits children[];
    private final int symbol;
    private final int terminalBits;




    ()
    {
        children = new children[256];
        symbol = 0;
        terminalBits = 0;
    }

    terminalBits(int i, int j)
    {
        children = null;
        symbol = i;
        i = j & 7;
        if (i == 0)
        {
            i = 8;
        }
        terminalBits = i;
    }
}
