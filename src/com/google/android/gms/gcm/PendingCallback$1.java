// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.gcm;

import android.os.Parcel;

// Referenced classes of package com.google.android.gms.gcm:
//            PendingCallback

final class 
    implements android.os.
{

    public final Object createFromParcel(Parcel parcel)
    {
        return zzet(parcel);
    }

    public final Object[] newArray(int i)
    {
        return zzgD(i);
    }

    public final PendingCallback zzet(Parcel parcel)
    {
        return new PendingCallback(parcel);
    }

    public final PendingCallback[] zzgD(int i)
    {
        return new PendingCallback[i];
    }

    ()
    {
    }
}
