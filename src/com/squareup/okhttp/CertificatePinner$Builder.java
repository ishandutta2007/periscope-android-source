// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import o.vw;

// Referenced classes of package com.squareup.okhttp:
//            CertificatePinner

public static final class 
{

    private final Map hostnameToPins = new LinkedHashMap();

    public final transient  add(String s, String as[])
    {
        if (s == null)
        {
            throw new IllegalArgumentException("hostname == null");
        }
        ArrayList arraylist = new ArrayList();
        s = (List)hostnameToPins.put(s, Collections.unmodifiableList(arraylist));
        if (s != null)
        {
            arraylist.addAll(s);
        }
        int j = as.length;
        for (int i = 0; i < j; i++)
        {
            s = as[i];
            if (!s.startsWith("sha1/"))
            {
                throw new IllegalArgumentException((new StringBuilder("pins must start with 'sha1/': ")).append(s).toString());
            }
            vw vw1 = vw._mth02E2(s.substring(5));
            if (vw1 == null)
            {
                throw new IllegalArgumentException((new StringBuilder("pins must be base64: ")).append(s).toString());
            }
            arraylist.add(vw1);
        }

        return this;
    }

    public final CertificatePinner build()
    {
        return new CertificatePinner(this, null);
    }


    public ()
    {
    }
}
