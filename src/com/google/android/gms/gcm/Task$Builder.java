// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.gcm;

import android.os.Bundle;

// Referenced classes of package com.google.android.gms.gcm:
//            Task, zzc, GcmNetworkManager

public static abstract class zzaCT
{

    protected Bundle extras;
    protected String gcmTaskService;
    protected boolean isPersisted;
    protected int requiredNetworkState;
    protected boolean requiresCharging;
    protected String tag;
    protected boolean updateCurrent;
    protected zzc zzaCT;

    public abstract Task build();

    protected void checkConditions()
    {
        boolean flag;
        if (gcmTaskService != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            throw new IllegalArgumentException(String.valueOf("Must provide an endpoint for this task by calling setService(ComponentName)."));
        }
        GcmNetworkManager.zzdh(tag);
        Task.zza(zzaCT);
        if (isPersisted)
        {
            Task.zzA(extras);
        }
    }

    public abstract extras setExtras(Bundle bundle);

    public abstract extras setPersisted(boolean flag);

    public abstract extras setRequiredNetwork(int i);

    public abstract extras setRequiresCharging(boolean flag);

    public abstract extras setService(Class class1);

    public abstract extras setTag(String s);

    public abstract extras setUpdateCurrent(boolean flag);

    public ager()
    {
        zzaCT = zzc.zzaCI;
    }
}
