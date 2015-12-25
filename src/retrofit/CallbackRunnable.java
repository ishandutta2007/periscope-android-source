// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package retrofit;

import java.util.concurrent.Executor;

// Referenced classes of package retrofit:
//            RetrofitError, ErrorHandler, Callback, ResponseWrapper

abstract class CallbackRunnable
    implements Runnable
{

    private final Callback callback;
    private final Executor callbackExecutor;
    private final ErrorHandler errorHandler;

    CallbackRunnable(Callback callback1, Executor executor, ErrorHandler errorhandler)
    {
        callback = callback1;
        callbackExecutor = executor;
        errorHandler = errorhandler;
    }

    public abstract ResponseWrapper obtainResponse();

    public final void run()
    {
        try
        {
            final ResponseWrapper wrapper = obtainResponse();
            callbackExecutor.execute(new _cls1());
            return;
        }
        catch (final RetrofitError handled)
        {
            Throwable throwable = errorHandler.handleError(handled);
            if (throwable != handled)
            {
                handled = RetrofitError.unexpectedError(handled.getUrl(), throwable);
            }
            callbackExecutor.execute(new _cls2());
            return;
        }
    }


    private class _cls1
        implements Runnable
    {

        final CallbackRunnable this$0;
        final ResponseWrapper val$wrapper;

        public void run()
        {
            callback.success(wrapper.responseBody, wrapper.response);
        }

        _cls1()
        {
            this$0 = CallbackRunnable.this;
            wrapper = responsewrapper;
            super();
        }
    }


    private class _cls2
        implements Runnable
    {

        final CallbackRunnable this$0;
        final RetrofitError val$handled;

        public void run()
        {
            callback.failure(handled);
        }

        _cls2()
        {
            this$0 = CallbackRunnable.this;
            handled = retrofiterror;
            super();
        }
    }

}
