// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package retrofit;

import rx.Subscriber;

// Referenced classes of package retrofit:
//            RetrofitError, ResponseWrapper, RxSupport, ErrorHandler, 
//            RequestInterceptorTape

class t>
    implements Runnable
{

    final RxSupport this$0;
    final RequestInterceptorTape val$interceptorTape;
    final voker val$invoker;
    final Subscriber val$subscriber;

    public void run()
    {
        boolean flag = val$subscriber.isUnsubscribed();
        if (flag)
        {
            return;
        }
        try
        {
            ResponseWrapper responsewrapper = val$invoker.invoke(val$interceptorTape);
            val$subscriber.onNext(responsewrapper.responseBody);
            val$subscriber.onCompleted();
            return;
        }
        catch (RetrofitError retrofiterror)
        {
            val$subscriber.onError(RxSupport.access$300(RxSupport.this).handleError(retrofiterror));
        }
        return;
    }

    ceptorTape()
    {
        this$0 = final_rxsupport;
        val$subscriber = subscriber1;
        val$invoker = voker;
        val$interceptorTape = RequestInterceptorTape.this;
        super();
    }
}
