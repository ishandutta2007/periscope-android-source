// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package o;

import android.os.Parcel;
import com.google.android.gms.iid.MessengerCompat;

public final class bn
    implements android.os.Parcelable.Creator
{

    public bn()
    {
    }

    public final Object createFromParcel(Parcel parcel)
    {
        parcel = parcel.readStrongBinder();
        if (parcel != null)
        {
            return new MessengerCompat(parcel);
        } else
        {
            return null;
        }
    }

    public final Object[] newArray(int i)
    {
        return new MessengerCompat[i];
    }
}
