// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package o;

import java.io.File;
import java.util.Comparator;

final class abe
    implements Comparator
{

    abe()
    {
    }

    public final int compare(Object obj, Object obj1)
    {
        obj = (File)obj;
        obj1 = (File)obj1;
        return Long.compare(((File) (obj)).lastModified(), ((File) (obj1)).lastModified());
    }
}
