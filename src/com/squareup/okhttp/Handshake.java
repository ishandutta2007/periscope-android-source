// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp;

import com.squareup.okhttp.internal.Util;
import java.security.Principal;
import java.security.cert.X509Certificate;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;

public final class Handshake
{

    private final String cipherSuite;
    private final List localCertificates;
    private final List peerCertificates;

    private Handshake(String s, List list, List list1)
    {
        cipherSuite = s;
        peerCertificates = list;
        localCertificates = list1;
    }

    public static Handshake get(String s, List list, List list1)
    {
        if (s == null)
        {
            throw new IllegalArgumentException("cipherSuite == null");
        } else
        {
            return new Handshake(s, Util.immutableList(list), Util.immutableList(list1));
        }
    }

    public static Handshake get(SSLSession sslsession)
    {
        SSLPeerUnverifiedException sslpeerunverifiedexception;
        String s = sslsession.getCipherSuite();
        if (s == null)
        {
            throw new IllegalStateException("cipherSuite == null");
        }
        java.security.cert.Certificate acertificate[];
        try
        {
            acertificate = sslsession.getPeerCertificates();
        }
        // Misplaced declaration of an exception variable
        catch (SSLPeerUnverifiedException sslpeerunverifiedexception)
        {
            acertificate = null;
        }
        List list;
        if (acertificate != null)
        {
            list = Util.immutableList(acertificate);
        } else
        {
            list = Collections.emptyList();
        }
        sslsession = sslsession.getLocalCertificates();
        if (sslsession != null)
        {
            sslsession = Util.immutableList(sslsession);
        } else
        {
            sslsession = Collections.emptyList();
        }
        return new Handshake(s, list, sslsession);
    }

    public final String cipherSuite()
    {
        return cipherSuite;
    }

    public final boolean equals(Object obj)
    {
        if (!(obj instanceof Handshake))
        {
            return false;
        }
        obj = (Handshake)obj;
        return cipherSuite.equals(((Handshake) (obj)).cipherSuite) && peerCertificates.equals(((Handshake) (obj)).peerCertificates) && localCertificates.equals(((Handshake) (obj)).localCertificates);
    }

    public final int hashCode()
    {
        return ((cipherSuite.hashCode() + 527) * 31 + peerCertificates.hashCode()) * 31 + localCertificates.hashCode();
    }

    public final List localCertificates()
    {
        return localCertificates;
    }

    public final Principal localPrincipal()
    {
        if (!localCertificates.isEmpty())
        {
            return ((X509Certificate)localCertificates.get(0)).getSubjectX500Principal();
        } else
        {
            return null;
        }
    }

    public final List peerCertificates()
    {
        return peerCertificates;
    }

    public final Principal peerPrincipal()
    {
        if (!peerCertificates.isEmpty())
        {
            return ((X509Certificate)peerCertificates.get(0)).getSubjectX500Principal();
        } else
        {
            return null;
        }
    }
}
