// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import o.0E1C;

public final class BinderWrapper
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new _cls0E1C();
    private IBinder zzaeJ;

    public BinderWrapper()
    {
        zzaeJ = null;
    }

    public BinderWrapper(IBinder ibinder)
    {
        zzaeJ = null;
        zzaeJ = ibinder;
    }

    private BinderWrapper(Parcel parcel)
    {
        zzaeJ = null;
        zzaeJ = parcel.readStrongBinder();
    }

    public BinderWrapper(Parcel parcel, byte byte0)
    {
        this(parcel);
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeStrongBinder(zzaeJ);
    }

}
