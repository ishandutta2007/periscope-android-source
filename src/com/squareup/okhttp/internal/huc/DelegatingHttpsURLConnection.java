// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.huc;

import com.squareup.okhttp.Handshake;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.Permission;
import java.security.Principal;
import java.security.cert.Certificate;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

abstract class DelegatingHttpsURLConnection extends HttpsURLConnection
{

    private final HttpURLConnection _flddelegate;

    public DelegatingHttpsURLConnection(HttpURLConnection httpurlconnection)
    {
        super(httpurlconnection.getURL());
        _flddelegate = httpurlconnection;
    }

    public void addRequestProperty(String s, String s1)
    {
        _flddelegate.addRequestProperty(s, s1);
    }

    public void connect()
    {
        connected = true;
        _flddelegate.connect();
    }

    public void disconnect()
    {
        _flddelegate.disconnect();
    }

    public boolean getAllowUserInteraction()
    {
        return _flddelegate.getAllowUserInteraction();
    }

    public String getCipherSuite()
    {
        Handshake handshake1 = handshake();
        if (handshake1 != null)
        {
            return handshake1.cipherSuite();
        } else
        {
            return null;
        }
    }

    public int getConnectTimeout()
    {
        return _flddelegate.getConnectTimeout();
    }

    public Object getContent()
    {
        return _flddelegate.getContent();
    }

    public Object getContent(Class aclass[])
    {
        return _flddelegate.getContent(aclass);
    }

    public String getContentEncoding()
    {
        return _flddelegate.getContentEncoding();
    }

    public int getContentLength()
    {
        return _flddelegate.getContentLength();
    }

    public String getContentType()
    {
        return _flddelegate.getContentType();
    }

    public long getDate()
    {
        return _flddelegate.getDate();
    }

    public boolean getDefaultUseCaches()
    {
        return _flddelegate.getDefaultUseCaches();
    }

    public boolean getDoInput()
    {
        return _flddelegate.getDoInput();
    }

    public boolean getDoOutput()
    {
        return _flddelegate.getDoOutput();
    }

    public InputStream getErrorStream()
    {
        return _flddelegate.getErrorStream();
    }

    public long getExpiration()
    {
        return _flddelegate.getExpiration();
    }

    public String getHeaderField(int i)
    {
        return _flddelegate.getHeaderField(i);
    }

    public String getHeaderField(String s)
    {
        return _flddelegate.getHeaderField(s);
    }

    public long getHeaderFieldDate(String s, long l)
    {
        return _flddelegate.getHeaderFieldDate(s, l);
    }

    public int getHeaderFieldInt(String s, int i)
    {
        return _flddelegate.getHeaderFieldInt(s, i);
    }

    public String getHeaderFieldKey(int i)
    {
        return _flddelegate.getHeaderFieldKey(i);
    }

    public Map getHeaderFields()
    {
        return _flddelegate.getHeaderFields();
    }

    public abstract HostnameVerifier getHostnameVerifier();

    public long getIfModifiedSince()
    {
        return _flddelegate.getIfModifiedSince();
    }

    public InputStream getInputStream()
    {
        return _flddelegate.getInputStream();
    }

    public boolean getInstanceFollowRedirects()
    {
        return _flddelegate.getInstanceFollowRedirects();
    }

    public long getLastModified()
    {
        return _flddelegate.getLastModified();
    }

    public Certificate[] getLocalCertificates()
    {
        Object obj = handshake();
        if (obj == null)
        {
            return null;
        }
        obj = ((Handshake) (obj)).localCertificates();
        if (!((List) (obj)).isEmpty())
        {
            return (Certificate[])((List) (obj)).toArray(new Certificate[((List) (obj)).size()]);
        } else
        {
            return null;
        }
    }

    public Principal getLocalPrincipal()
    {
        Handshake handshake1 = handshake();
        if (handshake1 != null)
        {
            return handshake1.localPrincipal();
        } else
        {
            return null;
        }
    }

    public OutputStream getOutputStream()
    {
        return _flddelegate.getOutputStream();
    }

    public Principal getPeerPrincipal()
    {
        Handshake handshake1 = handshake();
        if (handshake1 != null)
        {
            return handshake1.peerPrincipal();
        } else
        {
            return null;
        }
    }

    public Permission getPermission()
    {
        return _flddelegate.getPermission();
    }

    public int getReadTimeout()
    {
        return _flddelegate.getReadTimeout();
    }

    public String getRequestMethod()
    {
        return _flddelegate.getRequestMethod();
    }

    public Map getRequestProperties()
    {
        return _flddelegate.getRequestProperties();
    }

    public String getRequestProperty(String s)
    {
        return _flddelegate.getRequestProperty(s);
    }

    public int getResponseCode()
    {
        return _flddelegate.getResponseCode();
    }

    public String getResponseMessage()
    {
        return _flddelegate.getResponseMessage();
    }

    public abstract SSLSocketFactory getSSLSocketFactory();

    public Certificate[] getServerCertificates()
    {
        Object obj = handshake();
        if (obj == null)
        {
            return null;
        }
        obj = ((Handshake) (obj)).peerCertificates();
        if (!((List) (obj)).isEmpty())
        {
            return (Certificate[])((List) (obj)).toArray(new Certificate[((List) (obj)).size()]);
        } else
        {
            return null;
        }
    }

    public URL getURL()
    {
        return _flddelegate.getURL();
    }

    public boolean getUseCaches()
    {
        return _flddelegate.getUseCaches();
    }

    protected abstract Handshake handshake();

    public void setAllowUserInteraction(boolean flag)
    {
        _flddelegate.setAllowUserInteraction(flag);
    }

    public void setChunkedStreamingMode(int i)
    {
        _flddelegate.setChunkedStreamingMode(i);
    }

    public void setConnectTimeout(int i)
    {
        _flddelegate.setConnectTimeout(i);
    }

    public void setDefaultUseCaches(boolean flag)
    {
        _flddelegate.setDefaultUseCaches(flag);
    }

    public void setDoInput(boolean flag)
    {
        _flddelegate.setDoInput(flag);
    }

    public void setDoOutput(boolean flag)
    {
        _flddelegate.setDoOutput(flag);
    }

    public void setFixedLengthStreamingMode(int i)
    {
        _flddelegate.setFixedLengthStreamingMode(i);
    }

    public abstract void setHostnameVerifier(HostnameVerifier hostnameverifier);

    public void setIfModifiedSince(long l)
    {
        _flddelegate.setIfModifiedSince(l);
    }

    public void setInstanceFollowRedirects(boolean flag)
    {
        _flddelegate.setInstanceFollowRedirects(flag);
    }

    public void setReadTimeout(int i)
    {
        _flddelegate.setReadTimeout(i);
    }

    public void setRequestMethod(String s)
    {
        _flddelegate.setRequestMethod(s);
    }

    public void setRequestProperty(String s, String s1)
    {
        _flddelegate.setRequestProperty(s, s1);
    }

    public abstract void setSSLSocketFactory(SSLSocketFactory sslsocketfactory);

    public void setUseCaches(boolean flag)
    {
        _flddelegate.setUseCaches(flag);
    }

    public String toString()
    {
        return _flddelegate.toString();
    }

    public boolean usingProxy()
    {
        return _flddelegate.usingProxy();
    }
}
