// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package o;

import java.math.BigDecimal;

// Referenced classes of package o:
//            jd, mq, ms, iy, 
//            mt

final class lp extends jd
{

    lp()
    {
    }

    private static BigDecimal _mth141D(mq mq1)
    {
        if (mq1._mth13A2() == ms.JO)
        {
            mq1.nextNull();
            return null;
        }
        try
        {
            mq1 = new BigDecimal(mq1.nextString());
        }
        // Misplaced declaration of an exception variable
        catch (mq mq1)
        {
            throw new iy(mq1);
        }
        return mq1;
    }

    public final Object read(mq mq1)
    {
        return _mth141D(mq1);
    }

    public final void write(mt mt1, Object obj)
    {
        mt1._mth02CA((BigDecimal)obj);
    }
}
