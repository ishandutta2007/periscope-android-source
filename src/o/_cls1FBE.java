// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package o;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;

abstract class _cls1FBE extends Activity
{

    _cls1FBE()
    {
    }

    abstract View dispatchFragmentsOnCreateView(View view, String s, Context context, AttributeSet attributeset);

    public void onCreate(Bundle bundle)
    {
        if (android.os.Build.VERSION.SDK_INT < 11 && getLayoutInflater().getFactory() == null)
        {
            getLayoutInflater().setFactory(this);
        }
        super.onCreate(bundle);
    }

    public View onCreateView(String s, Context context, AttributeSet attributeset)
    {
        View view = dispatchFragmentsOnCreateView(null, s, context, attributeset);
        if (view == null)
        {
            return super.onCreateView(s, context, attributeset);
        } else
        {
            return view;
        }
    }
}
