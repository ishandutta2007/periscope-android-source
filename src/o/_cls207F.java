// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package o;

import android.view.View;

public interface _cls207F
{

    public abstract boolean onNestedFling(View view, float f, float f1, boolean flag);

    public abstract boolean onNestedPreFling(View view, float f, float f1);

    public abstract void onNestedPreScroll(View view, int i, int j, int ai[]);

    public abstract void onNestedScroll(View view, int i, int j, int k, int l);

    public abstract void onNestedScrollAccepted(View view, View view1, int i);

    public abstract boolean onStartNestedScroll(View view, View view1, int i);

    public abstract void onStopNestedScroll(View view);
}
