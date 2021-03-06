// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.twitter.sdk.android.core;

import com.twitter.sdk.android.core.internal.oauth.OAuth2Service;
import com.twitter.sdk.android.core.internal.oauth.OAuth2Token;

// Referenced classes of package com.twitter.sdk.android.core:
//            SessionManager, Callback, AppSession, Result, 
//            TwitterException

class GuestAuthClient
{
    class CallbackWrapper extends Callback
    {

        private final SessionManager appSessionManager;
        private final Callback callback;
        final GuestAuthClient this$0;

        public void failure(TwitterException twitterexception)
        {
            if (callback != null)
            {
                callback.failure(twitterexception);
            }
        }

        public void success(Result result)
        {
            AppSession appsession = new AppSession((OAuth2Token)result.data);
            appSessionManager.setSession(appsession.getId(), appsession);
            if (callback != null)
            {
                callback.success(new Result(appsession, result.response));
            }
        }

        CallbackWrapper(SessionManager sessionmanager, Callback callback1)
        {
            this$0 = GuestAuthClient.this;
            super();
            appSessionManager = sessionmanager;
            callback = callback1;
        }
    }


    private final OAuth2Service service;

    GuestAuthClient(OAuth2Service oauth2service)
    {
        if (oauth2service == null)
        {
            throw new IllegalArgumentException("OAuth2Service must not be null");
        } else
        {
            service = oauth2service;
            return;
        }
    }

    void authorize(SessionManager sessionmanager, Callback callback)
    {
        if (sessionmanager == null)
        {
            throw new IllegalArgumentException("SessionManager must not be null");
        } else
        {
            service.requestGuestAuthToken(new CallbackWrapper(sessionmanager, callback));
            return;
        }
    }
}
