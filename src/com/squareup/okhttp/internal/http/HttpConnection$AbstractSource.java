// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.http;

import com.squareup.okhttp.Connection;
import com.squareup.okhttp.internal.Internal;
import com.squareup.okhttp.internal.Util;
import java.net.Socket;
import o.vv;
import o.wn;
import o.wo;

// Referenced classes of package com.squareup.okhttp.internal.http:
//            HttpConnection

abstract class <init>
    implements wn
{

    protected boolean closed;
    final HttpConnection this$0;

    protected final void endOfInput(boolean flag)
    {
        if (HttpConnection.access$400(HttpConnection.this) != 5)
        {
            throw new IllegalStateException((new StringBuilder("state: ")).append(HttpConnection.access$400(HttpConnection.this)).toString());
        }
        HttpConnection.access$402(HttpConnection.this, 0);
        if (flag && HttpConnection.access$600(HttpConnection.this) == 1)
        {
            HttpConnection.access$602(HttpConnection.this, 0);
            Internal.instance.recycle(HttpConnection.access$700(HttpConnection.this), HttpConnection.access$800(HttpConnection.this));
            return;
        }
        if (HttpConnection.access$600(HttpConnection.this) == 2)
        {
            HttpConnection.access$402(HttpConnection.this, 6);
            HttpConnection.access$800(HttpConnection.this).getSocket().close();
        }
    }

    public wo timeout()
    {
        return HttpConnection.access$500(HttpConnection.this).timeout();
    }

    protected final void unexpectedEndOfInput()
    {
        Util.closeQuietly(HttpConnection.access$800(HttpConnection.this).getSocket());
        HttpConnection.access$402(HttpConnection.this, 6);
    }

    private ()
    {
        this$0 = HttpConnection.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
