// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.gcm;

import android.os.Bundle;
import android.os.Parcel;

// Referenced classes of package com.google.android.gms.gcm:
//            Task

public class PeriodicTask extends Task
{
    public static class Builder extends Task.Builder
    {

        private long zzaCG;
        private long zzaCH;

        static long zza(Builder builder)
        {
            return builder.zzaCG;
        }

        static long zzb(Builder builder)
        {
            return builder.zzaCH;
        }

        public PeriodicTask build()
        {
            checkConditions();
            return new PeriodicTask(this, null);
        }

        public volatile Task build()
        {
            return build();
        }

        protected void checkConditions()
        {
            super.checkConditions();
            if (zzaCG == -1L)
            {
                throw new IllegalArgumentException("Must call setPeriod(long) to establish an execution interval for this periodic task.");
            }
            if (zzaCH == -1L)
            {
                zzaCH = (long)((float)zzaCG * 0.1F);
            }
        }

        public Builder setExtras(Bundle bundle)
        {
            extras = bundle;
            return this;
        }

        public volatile Task.Builder setExtras(Bundle bundle)
        {
            return setExtras(bundle);
        }

        public Builder setFlex(long l)
        {
            zzaCH = l;
            return this;
        }

        public Builder setPeriod(long l)
        {
            zzaCG = l;
            return this;
        }

        public Builder setPersisted(boolean flag)
        {
            isPersisted = flag;
            return this;
        }

        public volatile Task.Builder setPersisted(boolean flag)
        {
            return setPersisted(flag);
        }

        public Builder setRequiredNetwork(int i)
        {
            requiredNetworkState = i;
            return this;
        }

        public volatile Task.Builder setRequiredNetwork(int i)
        {
            return setRequiredNetwork(i);
        }

        public Builder setRequiresCharging(boolean flag)
        {
            requiresCharging = flag;
            return this;
        }

        public volatile Task.Builder setRequiresCharging(boolean flag)
        {
            return setRequiresCharging(flag);
        }

        public Builder setService(Class class1)
        {
            gcmTaskService = class1.getName();
            return this;
        }

        public volatile Task.Builder setService(Class class1)
        {
            return setService(class1);
        }

        public Builder setTag(String s)
        {
            tag = s;
            return this;
        }

        public volatile Task.Builder setTag(String s)
        {
            return setTag(s);
        }

        public Builder setUpdateCurrent(boolean flag)
        {
            updateCurrent = flag;
            return this;
        }

        public volatile Task.Builder setUpdateCurrent(boolean flag)
        {
            return setUpdateCurrent(flag);
        }

        public Builder()
        {
            zzaCG = -1L;
            zzaCH = -1L;
            isPersisted = true;
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new _cls1();
    protected long mFlexInSeconds;
    protected long mIntervalInSeconds;

    private PeriodicTask(Parcel parcel)
    {
        super(parcel);
        mIntervalInSeconds = -1L;
        mFlexInSeconds = -1L;
        mIntervalInSeconds = parcel.readLong();
        mFlexInSeconds = parcel.readLong();
    }

    PeriodicTask(Parcel parcel, _cls1 _pcls1)
    {
        this(parcel);
    }

    private PeriodicTask(Builder builder)
    {
        super(builder);
        mIntervalInSeconds = -1L;
        mFlexInSeconds = -1L;
        mIntervalInSeconds = Builder.zza(builder);
        mFlexInSeconds = Builder.zzb(builder);
    }

    PeriodicTask(Builder builder, _cls1 _pcls1)
    {
        this(builder);
    }

    public long getFlex()
    {
        return mFlexInSeconds;
    }

    public long getPeriod()
    {
        return mIntervalInSeconds;
    }

    public void toBundle(Bundle bundle)
    {
        super.toBundle(bundle);
        bundle.putLong("period", mIntervalInSeconds);
        bundle.putLong("period_flex", mFlexInSeconds);
    }

    public String toString()
    {
        return (new StringBuilder()).append(super.toString()).append(" period=").append(getPeriod()).append(" flex=").append(getFlex()).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        super.writeToParcel(parcel, i);
        parcel.writeLong(mIntervalInSeconds);
        parcel.writeLong(mFlexInSeconds);
    }


    private class _cls1
        implements android.os.Parcelable.Creator
    {

        public final Object createFromParcel(Parcel parcel)
        {
            return zzeu(parcel);
        }

        public final Object[] newArray(int i)
        {
            return zzgE(i);
        }

        public final PeriodicTask zzeu(Parcel parcel)
        {
            return new PeriodicTask(parcel, null);
        }

        public final PeriodicTask[] zzgE(int i)
        {
            return new PeriodicTask[i];
        }

        _cls1()
        {
        }
    }

}
