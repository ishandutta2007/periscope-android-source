// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package o;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Enumeration;
import java.util.HashMap;
import javax.security.auth.x500.X500Principal;

public final class um
{

    final KeyStore TP;
    private final HashMap TQ;

    public um(InputStream inputstream, String s)
    {
        inputstream = _mth02CA(inputstream, s);
        TQ = _mth02CA(inputstream);
        TP = inputstream;
    }

    private static KeyStore _mth02CA(InputStream inputstream, String s)
    {
        KeyStore keystore;
        try
        {
            keystore = KeyStore.getInstance("BKS");
            inputstream = new BufferedInputStream(inputstream);
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            throw new AssertionError(inputstream);
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            throw new AssertionError(inputstream);
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            throw new AssertionError(inputstream);
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            throw new AssertionError(inputstream);
        }
        keystore.load(inputstream, s.toCharArray());
        inputstream.close();
        return keystore;
        s;
        inputstream.close();
        throw s;
    }

    private static HashMap _mth02CA(KeyStore keystore)
    {
        HashMap hashmap;
        Enumeration enumeration;
        hashmap = new HashMap();
        enumeration = keystore.aliases();
_L1:
        X509Certificate x509certificate;
        if (!enumeration.hasMoreElements())
        {
            break MISSING_BLOCK_LABEL_56;
        }
        x509certificate = (X509Certificate)keystore.getCertificate((String)enumeration.nextElement());
        if (x509certificate != null)
        {
            try
            {
                hashmap.put(x509certificate.getSubjectX500Principal(), x509certificate);
            }
            // Misplaced declaration of an exception variable
            catch (KeyStore keystore)
            {
                throw new AssertionError(keystore);
            }
        }
          goto _L1
        return hashmap;
    }

    public final boolean _mth02CB(X509Certificate x509certificate)
    {
        X509Certificate x509certificate1 = (X509Certificate)TQ.get(x509certificate.getSubjectX500Principal());
        return x509certificate1 != null && x509certificate1.getPublicKey().equals(x509certificate.getPublicKey());
    }

    public final X509Certificate _mth02CE(X509Certificate x509certificate)
    {
        X509Certificate x509certificate1 = (X509Certificate)TQ.get(x509certificate.getIssuerX500Principal());
        if (x509certificate1 == null)
        {
            return null;
        }
        if (x509certificate1.getSubjectX500Principal().equals(x509certificate.getSubjectX500Principal()))
        {
            return null;
        }
        try
        {
            x509certificate.verify(x509certificate1.getPublicKey());
        }
        // Misplaced declaration of an exception variable
        catch (X509Certificate x509certificate)
        {
            return null;
        }
        return x509certificate1;
    }
}
