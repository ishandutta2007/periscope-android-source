// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.localytics.android;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.location.Location;
import java.util.Date;
import java.util.Map;
import o.02C9;

// Referenced classes of package com.localytics.android:
//            LocalyticsManager, Constants, AnalyticsListener, MessagingListener, 
//            PushNotificationOptions

public class Localytics
{
    public static final class InAppMessageDismissButtonLocation extends Enum
    {

        private static final InAppMessageDismissButtonLocation $VALUES[];
        public static final InAppMessageDismissButtonLocation LEFT;
        public static final InAppMessageDismissButtonLocation RIGHT;

        public static InAppMessageDismissButtonLocation valueOf(String s)
        {
            return (InAppMessageDismissButtonLocation)Enum.valueOf(com/localytics/android/Localytics$InAppMessageDismissButtonLocation, s);
        }

        public static InAppMessageDismissButtonLocation[] values()
        {
            return (InAppMessageDismissButtonLocation[])$VALUES.clone();
        }

        static 
        {
            LEFT = new InAppMessageDismissButtonLocation("LEFT", 0);
            RIGHT = new InAppMessageDismissButtonLocation("RIGHT", 1);
            $VALUES = (new InAppMessageDismissButtonLocation[] {
                LEFT, RIGHT
            });
        }

        private InAppMessageDismissButtonLocation(String s, int i)
        {
            super(s, i);
        }
    }

    static final class Log
    {

        static int d(String s)
        {
            if (Constants.IS_LOGGING_ENABLED)
            {
                return android.util.Log.d("Localytics", s);
            } else
            {
                return -1;
            }
        }

        static int d(String s, Throwable throwable)
        {
            if (Constants.IS_LOGGING_ENABLED)
            {
                return android.util.Log.d("Localytics", s, throwable);
            } else
            {
                return -1;
            }
        }

        static int e(String s)
        {
            if (Constants.IS_LOGGING_ENABLED)
            {
                return android.util.Log.e("Localytics", s);
            } else
            {
                return -1;
            }
        }

        static int e(String s, Throwable throwable)
        {
            if (Constants.IS_LOGGING_ENABLED)
            {
                return android.util.Log.e("Localytics", s, throwable);
            } else
            {
                return -1;
            }
        }

        static int i(String s)
        {
            if (Constants.IS_LOGGING_ENABLED)
            {
                return android.util.Log.i("Localytics", s);
            } else
            {
                return -1;
            }
        }

        static int i(String s, Throwable throwable)
        {
            if (Constants.IS_LOGGING_ENABLED)
            {
                return android.util.Log.i("Localytics", s, throwable);
            } else
            {
                return -1;
            }
        }

        static int v(String s)
        {
            if (Constants.IS_LOGGING_ENABLED)
            {
                return android.util.Log.v("Localytics", s);
            } else
            {
                return -1;
            }
        }

        static int v(String s, Throwable throwable)
        {
            if (Constants.IS_LOGGING_ENABLED)
            {
                return android.util.Log.v("Localytics", s, throwable);
            } else
            {
                return -1;
            }
        }

        static int w(String s)
        {
            if (Constants.IS_LOGGING_ENABLED)
            {
                return android.util.Log.w("Localytics", s);
            } else
            {
                return -1;
            }
        }

        static int w(String s, Throwable throwable)
        {
            if (Constants.IS_LOGGING_ENABLED)
            {
                return android.util.Log.w("Localytics", s, throwable);
            } else
            {
                return -1;
            }
        }

        static int w(Throwable throwable)
        {
            if (Constants.IS_LOGGING_ENABLED)
            {
                return android.util.Log.w("Localytics", throwable);
            } else
            {
                return -1;
            }
        }

        static int wtf(String s)
        {
            if (Constants.IS_LOGGING_ENABLED)
            {
                return android.util.Log.wtf("Localytics", s);
            } else
            {
                return -1;
            }
        }

        static int wtf(String s, Throwable throwable)
        {
            if (Constants.IS_LOGGING_ENABLED)
            {
                return android.util.Log.wtf("Localytics", s, throwable);
            } else
            {
                return -1;
            }
        }

        static int wtf(Throwable throwable)
        {
            if (Constants.IS_LOGGING_ENABLED)
            {
                return android.util.Log.wtf("Localytics", throwable);
            } else
            {
                return -1;
            }
        }

        Log()
        {
        }
    }

    public static final class ProfileScope extends Enum
    {

        private static final ProfileScope $VALUES[];
        public static final ProfileScope APPLICATION;
        public static final ProfileScope ORGANIZATION;
        private final String scope;

        public static ProfileScope valueOf(String s)
        {
            return (ProfileScope)Enum.valueOf(com/localytics/android/Localytics$ProfileScope, s);
        }

        public static ProfileScope[] values()
        {
            return (ProfileScope[])$VALUES.clone();
        }

        public final String getScope()
        {
            return scope;
        }

        static 
        {
            ORGANIZATION = new ProfileScope("ORGANIZATION", 0, "org");
            APPLICATION = new ProfileScope("APPLICATION", 1, "app");
            $VALUES = (new ProfileScope[] {
                ORGANIZATION, APPLICATION
            });
        }

        private ProfileScope(String s, int i, String s1)
        {
            super(s, i);
            scope = s1;
        }
    }


    public Localytics()
    {
    }

    public static void addAnalyticsListener(AnalyticsListener analyticslistener)
    {
        LocalyticsManager.getInstance().addAnalyticsListener(analyticslistener);
    }

    public static void addMessagingListener(MessagingListener messaginglistener)
    {
        LocalyticsManager.getInstance().addMessagingListener(messaginglistener);
    }

    public static void addProfileAttributesToSet(String s, long al[])
    {
        addProfileAttributesToSet(s, al, ProfileScope.APPLICATION);
    }

    public static void addProfileAttributesToSet(String s, long al[], ProfileScope profilescope)
    {
        LocalyticsManager.getInstance().addProfileAttributesToSet(s, al, profilescope);
    }

    public static void addProfileAttributesToSet(String s, String as[])
    {
        addProfileAttributesToSet(s, as, ProfileScope.APPLICATION);
    }

    public static void addProfileAttributesToSet(String s, String as[], ProfileScope profilescope)
    {
        LocalyticsManager.getInstance().addProfileAttributesToSet(s, as, profilescope);
    }

    public static void addProfileAttributesToSet(String s, Date adate[])
    {
        addProfileAttributesToSet(s, adate, ProfileScope.APPLICATION);
    }

    public static void addProfileAttributesToSet(String s, Date adate[], ProfileScope profilescope)
    {
        LocalyticsManager.getInstance().addProfileAttributesToSet(s, adate, profilescope);
    }

    public static void clearInAppMessageDisplayActivity()
    {
        LocalyticsManager.getInstance().clearInAppMessageDisplayActivity();
    }

    public static void closeSession()
    {
        LocalyticsManager.getInstance().closeSession();
    }

    static void decrementActivityCounter()
    {
        LocalyticsManager.getInstance().decrementActivityCounter();
    }

    public static void decrementProfileAttribute(String s, long l)
    {
        decrementProfileAttribute(s, l, ProfileScope.APPLICATION);
    }

    public static void decrementProfileAttribute(String s, long l, ProfileScope profilescope)
    {
        LocalyticsManager.getInstance().incrementProfileAttribute(s, -1L * l, profilescope);
    }

    public static void deleteProfileAttribute(String s)
    {
        deleteProfileAttribute(s, ProfileScope.APPLICATION);
    }

    public static void deleteProfileAttribute(String s, ProfileScope profilescope)
    {
        LocalyticsManager.getInstance().deleteProfileAttribute(s, profilescope);
    }

    public static void dismissCurrentInAppMessage()
    {
        LocalyticsManager.getInstance().dismissCurrentInAppMessage();
    }

    public static String getAnalyticsHost()
    {
        return Constants.ANALYTICS_HOST;
    }

    public static String getAppKey()
    {
        return LocalyticsManager.getInstance().getAppKey();
    }

    public static String getCustomDimension(int i)
    {
        return LocalyticsManager.getInstance().getCustomDimension(i);
    }

    public static String getCustomerId()
    {
        return getIdentifier("customer_id");
    }

    public static String getIdentifier(String s)
    {
        return LocalyticsManager.getInstance().getIdentifier(s);
    }

    public static InAppMessageDismissButtonLocation getInAppMessageDismissButtonLocation()
    {
        return LocalyticsManager.getInstance().getInAppMessageDismissButtonLocation();
    }

    public static String getInstallId()
    {
        return LocalyticsManager.getInstance().getInstallationId();
    }

    public static String getLibraryVersion()
    {
        return "androida_3.5.0";
    }

    public static String getMessagingHost()
    {
        return Constants.MARKETING_HOST;
    }

    public static String getProfilesHost()
    {
        return Constants.PROFILES_HOST;
    }

    public static String getPushRegistrationId()
    {
        return LocalyticsManager.getInstance().getPushRegistrationId();
    }

    public static long getSessionTimeoutInterval()
    {
        return Constants.SESSION_EXPIRATION / 1000L;
    }

    static void handleNotificationReceived(Intent intent)
    {
        LocalyticsManager.getInstance().handleNotificationReceived(intent);
    }

    public static void handlePushNotificationOpened(Intent intent)
    {
        LocalyticsManager.getInstance().handlePushNotificationOpened(intent);
    }

    public static void handlePushNotificationReceived(Intent intent)
    {
        LocalyticsManager.getInstance().tagPushReceivedEvent(intent);
    }

    static void handleRegistration(Intent intent)
    {
        LocalyticsManager.getInstance().handleRegistration(intent);
    }

    public static void handleTestMode(Intent intent)
    {
        LocalyticsManager.getInstance().handleTestMode(intent);
    }

    static void incrementActivityCounter()
    {
        LocalyticsManager.getInstance().incrementActivityCounter();
    }

    public static void incrementProfileAttribute(String s, long l)
    {
        incrementProfileAttribute(s, l, ProfileScope.APPLICATION);
    }

    public static void incrementProfileAttribute(String s, long l, ProfileScope profilescope)
    {
        LocalyticsManager.getInstance().incrementProfileAttribute(s, l, profilescope);
    }

    public static void integrate(Context context)
    {
        integrate(context, null);
    }

    public static void integrate(Context context, String s)
    {
        if (context == null)
        {
            throw new IllegalArgumentException("context cannot be null");
        } else
        {
            LocalyticsManager.getInstance().integrate(context, s);
            return;
        }
    }

    static boolean isAppInForeground()
    {
        return LocalyticsManager.getInstance().isAppInForeground();
    }

    static boolean isAutoIntegrate()
    {
        return LocalyticsManager.getInstance().isAutoIntegrate();
    }

    public static boolean isLoggingEnabled()
    {
        return Constants.IS_LOGGING_ENABLED;
    }

    public static boolean isOptedOut()
    {
        return LocalyticsManager.getInstance().isOptedOut();
    }

    public static boolean isPushDisabled()
    {
        return LocalyticsManager.getInstance().isPushDisabled();
    }

    public static boolean isTestModeEnabled()
    {
        return LocalyticsManager.getInstance().isTestModeEnabled();
    }

    public static void openSession()
    {
        LocalyticsManager.getInstance().openSession();
    }

    public static void registerPush(String s)
    {
        LocalyticsManager.getInstance().registerPush(s);
    }

    static void registerPush(String s, long l)
    {
        LocalyticsManager.getInstance().registerPush(s, l);
    }

    public static void removeAnalyticsListener(AnalyticsListener analyticslistener)
    {
        LocalyticsManager.getInstance().removeAnalyticsListener(analyticslistener);
    }

    public static void removeMessagingListener(MessagingListener messaginglistener)
    {
        LocalyticsManager.getInstance().removeMessagingListener(messaginglistener);
    }

    public static void removeProfileAttributesFromSet(String s, long al[])
    {
        removeProfileAttributesFromSet(s, al, ProfileScope.APPLICATION);
    }

    public static void removeProfileAttributesFromSet(String s, long al[], ProfileScope profilescope)
    {
        LocalyticsManager.getInstance().removeProfileAttributesFromSet(s, al, profilescope);
    }

    public static void removeProfileAttributesFromSet(String s, String as[])
    {
        removeProfileAttributesFromSet(s, as, ProfileScope.APPLICATION);
    }

    public static void removeProfileAttributesFromSet(String s, String as[], ProfileScope profilescope)
    {
        LocalyticsManager.getInstance().removeProfileAttributesFromSet(s, as, profilescope);
    }

    public static void removeProfileAttributesFromSet(String s, Date adate[])
    {
        removeProfileAttributesFromSet(s, adate, ProfileScope.APPLICATION);
    }

    public static void removeProfileAttributesFromSet(String s, Date adate[], ProfileScope profilescope)
    {
        LocalyticsManager.getInstance().removeProfileAttributesFromSet(s, adate, profilescope);
    }

    public static void setAnalyticsHost(String s)
    {
        Constants.ANALYTICS_HOST = s;
    }

    public static void setCustomDimension(int i, String s)
    {
        LocalyticsManager.getInstance().setCustomDimension(i, s);
    }

    public static void setCustomerEmail(String s)
    {
        setSpecialCustomerIdentifierAndAttribute("email", s);
    }

    public static void setCustomerFirstName(String s)
    {
        setSpecialCustomerIdentifierAndAttribute("first_name", s);
    }

    public static void setCustomerFullName(String s)
    {
        setSpecialCustomerIdentifierAndAttribute("full_name", s);
    }

    public static void setCustomerId(String s)
    {
        setIdentifier("customer_id", s);
    }

    public static void setCustomerLastName(String s)
    {
        setSpecialCustomerIdentifierAndAttribute("last_name", s);
    }

    public static void setIdentifier(String s, String s1)
    {
        LocalyticsManager.getInstance().setIdentifier(s, s1);
    }

    public static void setInAppMessageDismissButtonImage(Resources resources, int i)
    {
        LocalyticsManager.getInstance().setInAppMessageDismissButtonImage(resources, i);
    }

    public static void setInAppMessageDismissButtonImage(Resources resources, Bitmap bitmap)
    {
        LocalyticsManager.getInstance().setInAppMessageDismissButtonImage(resources, bitmap);
    }

    public static void setInAppMessageDismissButtonLocation(InAppMessageDismissButtonLocation inappmessagedismissbuttonlocation)
    {
        LocalyticsManager.getInstance().setInAppMessageDismissButtonLocation(inappmessagedismissbuttonlocation);
    }

    public static void setInAppMessageDisplayActivity(_cls02C9 _pcls02c9)
    {
        LocalyticsManager.getInstance().setInAppMessageDisplayActivity(_pcls02c9);
    }

    static void setIsAutoIntegrate(boolean flag)
    {
        LocalyticsManager.getInstance().setIsAutoIntegrate(flag);
    }

    public static void setLocation(Location location)
    {
        LocalyticsManager.getInstance().setLocation(location);
    }

    public static void setLoggingEnabled(boolean flag)
    {
        Constants.IS_LOGGING_ENABLED = flag;
    }

    public static void setMessagingHost(String s)
    {
        Constants.MARKETING_HOST = s;
    }

    public static void setOptedOut(boolean flag)
    {
        LocalyticsManager.getInstance().setOptedOut(flag);
    }

    public static void setProfileAttribute(String s, long l)
    {
        setProfileAttribute(s, l, ProfileScope.APPLICATION);
    }

    public static void setProfileAttribute(String s, long l, ProfileScope profilescope)
    {
        LocalyticsManager.getInstance().setProfileAttribute(s, l, profilescope);
    }

    public static void setProfileAttribute(String s, String s1)
    {
        setProfileAttribute(s, s1, ProfileScope.APPLICATION);
    }

    public static void setProfileAttribute(String s, String s1, ProfileScope profilescope)
    {
        LocalyticsManager.getInstance().setProfileAttribute(s, s1, profilescope);
    }

    public static void setProfileAttribute(String s, Date date)
    {
        setProfileAttribute(s, date, ProfileScope.APPLICATION);
    }

    public static void setProfileAttribute(String s, Date date, ProfileScope profilescope)
    {
        LocalyticsManager.getInstance().setProfileAttribute(s, date, profilescope);
    }

    public static void setProfileAttribute(String s, long al[])
    {
        setProfileAttribute(s, al, ProfileScope.APPLICATION);
    }

    public static void setProfileAttribute(String s, long al[], ProfileScope profilescope)
    {
        LocalyticsManager.getInstance().setProfileAttribute(s, al, profilescope);
    }

    public static void setProfileAttribute(String s, String as[])
    {
        setProfileAttribute(s, as, ProfileScope.APPLICATION);
    }

    public static void setProfileAttribute(String s, String as[], ProfileScope profilescope)
    {
        LocalyticsManager.getInstance().setProfileAttribute(s, as, profilescope);
    }

    public static void setProfileAttribute(String s, Date adate[])
    {
        setProfileAttribute(s, adate, ProfileScope.APPLICATION);
    }

    public static void setProfileAttribute(String s, Date adate[], ProfileScope profilescope)
    {
        LocalyticsManager.getInstance().setProfileAttribute(s, adate, profilescope);
    }

    public static void setProfilesHost(String s)
    {
        Constants.PROFILES_HOST = s;
    }

    public static void setPushDisabled(boolean flag)
    {
        LocalyticsManager.getInstance().setPushDisabled(flag);
    }

    public static void setPushNotificationOptions(PushNotificationOptions pushnotificationoptions)
    {
        LocalyticsManager.getInstance().setPushNotificationOptions(pushnotificationoptions);
    }

    public static void setPushRegistrationId(String s)
    {
        LocalyticsManager.getInstance().setPushRegistrationId(s);
    }

    public static void setSessionTimeoutInterval(long l)
    {
        Constants.SESSION_EXPIRATION = 1000L * l;
    }

    private static void setSpecialCustomerIdentifierAndAttribute(String s, String s1)
    {
        setProfileAttribute((new StringBuilder("$")).append(s).toString(), s1, ProfileScope.ORGANIZATION);
        setIdentifier(s, s1);
    }

    public static void setTestModeEnabled(boolean flag)
    {
        LocalyticsManager.getInstance().setTestModeEnabled(flag);
    }

    public static void tagEvent(String s)
    {
        tagEvent(s, null, 0L);
    }

    public static void tagEvent(String s, Map map)
    {
        tagEvent(s, map, 0L);
    }

    public static void tagEvent(String s, Map map, long l)
    {
        LocalyticsManager.getInstance().tagEvent(s, map, l);
    }

    public static void tagScreen(String s)
    {
        LocalyticsManager.getInstance().tagScreen(s);
    }

    public static void triggerInAppMessage(String s)
    {
        triggerInAppMessage(s, null);
    }

    public static void triggerInAppMessage(String s, Map map)
    {
        LocalyticsManager.getInstance().triggerInAppMessage(s, map, false);
    }

    public static void upload()
    {
        LocalyticsManager.getInstance().upload();
    }
}
