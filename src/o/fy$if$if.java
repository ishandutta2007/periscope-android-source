// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package o;

import android.os.IBinder;
import android.os.Parcel;

// Referenced classes of package o:
//            fy

static final class zznJ
    implements fy
{

    private IBinder zznJ;

    public final IBinder asBinder()
    {
        return zznJ;
    }

    public final boolean FB85()
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        int i;
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IOnMyLocationButtonClickListener");
        zznJ.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        i = parcel1.readInt();
        boolean flag;
        if (i != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        parcel1.recycle();
        parcel.recycle();
        return flag;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    IBinder(IBinder ibinder)
    {
        zznJ = ibinder;
    }
}
