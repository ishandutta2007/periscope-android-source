// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package o;

import java.nio.charset.Charset;

public final class wq
{

    public static final Charset UTF_8 = Charset.forName("UTF-8");

    public static void checkOffsetAndCount(long l, long l1, long l2)
    {
        if ((l1 | l2) < 0L || l1 > l || l - l1 < l2)
        {
            throw new ArrayIndexOutOfBoundsException(String.format("size=%s offset=%s byteCount=%s", new Object[] {
                Long.valueOf(l), Long.valueOf(l1), Long.valueOf(l2)
            }));
        } else
        {
            return;
        }
    }

    public static short _mth02CA(short word0)
    {
        word0 = 0xffff & word0;
        return (short)(word0 >>> 8 & 0xff | (word0 & 0xff) << 8);
    }

    public static boolean _mth02CA(byte abyte0[], int i, byte abyte1[], int j, int k)
    {
        for (int l = 0; l < k; l++)
        {
            if (abyte0[l + i] != abyte1[l + j])
            {
                return false;
            }
        }

        return true;
    }

    public static int _mth05F2(int i)
    {
        return (0xff000000 & i) >>> 24 | (0xff0000 & i) >>> 8 | (0xff00 & i) << 8 | (i & 0xff) << 24;
    }

    public static void _mth141D(Throwable throwable)
    {
        throw throwable;
    }

}
