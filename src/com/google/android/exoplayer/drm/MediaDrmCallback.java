// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.drm;

import java.util.UUID;

public interface MediaDrmCallback
{

    public abstract byte[] executeKeyRequest(UUID uuid, android.media.MediaDrm.KeyRequest keyrequest);

    public abstract byte[] executeProvisionRequest(UUID uuid, android.media.MediaDrm.ProvisionRequest provisionrequest);
}
