// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package retrofit.client;


public final class Header
{

    private final String name;
    private final String value;

    public Header(String s, String s1)
    {
        name = s;
        value = s1;
    }

    public final boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (obj == null || getClass() != obj.getClass())
        {
            return false;
        }
        obj = (Header)obj;
        if (name == null ? ((Header) (obj)).name != null : !name.equals(((Header) (obj)).name))
        {
            return false;
        }
        return value == null ? ((Header) (obj)).value == null : value.equals(((Header) (obj)).value);
    }

    public final String getName()
    {
        return name;
    }

    public final String getValue()
    {
        return value;
    }

    public final int hashCode()
    {
        int i;
        if (name != null)
        {
            i = name.hashCode();
        } else
        {
            i = 0;
        }
        int j;
        if (value != null)
        {
            j = value.hashCode();
        } else
        {
            j = 0;
        }
        return i * 31 + j;
    }

    public final String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        String s;
        if (name != null)
        {
            s = name;
        } else
        {
            s = "";
        }
        stringbuilder = stringbuilder.append(s).append(": ");
        if (value != null)
        {
            s = value;
        } else
        {
            s = "";
        }
        return stringbuilder.append(s).toString();
    }
}
