// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package retrofit;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import o.ig;
import retrofit.client.UrlConnectionClient;
import retrofit.converter.Converter;
import retrofit.converter.GsonConverter;

// Referenced classes of package retrofit:
//            Platform

static class <init> extends Platform
{

    Executor defaultCallbackExecutor()
    {
        return new ousExecutor();
    }

    retrofit.client.r defaultClient()
    {
        final Object client;
        if (Platform.access$300())
        {
            client = entInstantiator.instantiate();
        } else
        {
            client = new UrlConnectionClient();
        }
        class _cls1
            implements retrofit.client.Client.Provider
        {

            final Platform.Base this$0;
            final Client val$client;

            public Client get()
            {
                return client;
            }

            _cls1()
            {
                this$0 = Platform.Base.this;
                client = client1;
                super();
            }
        }

        return new _cls1();
    }

    Converter defaultConverter()
    {
        return new GsonConverter(new ig());
    }

    Executor defaultHttpExecutor()
    {
        class _cls2
            implements ThreadFactory
        {

            final Platform.Base this$0;

            public Thread newThread(final Runnable r)
            {
                class _cls1
                    implements Runnable
                {

                    final _cls2 this$1;
                    final Runnable val$r;

                    public void run()
                    {
                        Thread.currentThread().setPriority(1);
                        r.run();
                    }

                        _cls1()
                        {
                            this$1 = _cls2.this;
                            r = runnable;
                            super();
                        }
                }

                return new Thread(new _cls1(), "Retrofit-Idle");
            }

            _cls2()
            {
                this$0 = Platform.Base.this;
                super();
            }
        }

        return Executors.newCachedThreadPool(new _cls2());
    }

    g defaultLog()
    {
        class _cls3
            implements RestAdapter.Log
        {

            final Platform.Base this$0;

            public void log(String s)
            {
                System.out.println(s);
            }

            _cls3()
            {
                this$0 = Platform.Base.this;
                super();
            }
        }

        return new _cls3();
    }

    private g()
    {
    }

    g(g g)
    {
        this();
    }
}
