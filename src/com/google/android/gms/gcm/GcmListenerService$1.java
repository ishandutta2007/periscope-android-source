// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.gcm;

import android.content.Intent;

// Referenced classes of package com.google.android.gms.gcm:
//            GcmListenerService

class val.intent
    implements Runnable
{

    final Intent val$intent;
    final GcmListenerService zzaCg;

    public void run()
    {
        GcmListenerService.zza(zzaCg, val$intent);
    }

    (Intent intent1)
    {
        zzaCg = final_gcmlistenerservice;
        val$intent = intent1;
        super();
    }
}
