// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.digits.sdk.android;

import android.app.Activity;
import android.view.View;

// Referenced classes of package com.digits.sdk.android:
//            ContactsActivityDelegateImpl, ContactsController

class this._cls0
    implements android.view.ateImpl._cls2
{

    final ContactsActivityDelegateImpl this$0;

    public void onClick(View view)
    {
        controller.startUploadService(activity);
        activity.finish();
    }

    ()
    {
        this$0 = ContactsActivityDelegateImpl.this;
        super();
    }
}
