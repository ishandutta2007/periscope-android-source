// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package o;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.SharedPreferences;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import java.io.File;

final class rd extends ContextWrapper
{

    private final String QS;
    private final String QT;

    public rd(Context context, String s, String s1)
    {
        super(context);
        QT = s;
        QS = s1;
    }

    public final File getCacheDir()
    {
        return new File(super.getCacheDir(), QS);
    }

    public final File getDatabasePath(String s)
    {
        File file = new File(super.getDatabasePath(s).getParentFile(), QS);
        file.mkdirs();
        return new File(file, s);
    }

    public final File getExternalCacheDir()
    {
        return new File(super.getExternalCacheDir(), QS);
    }

    public final File getExternalFilesDir(String s)
    {
        return new File(super.getExternalFilesDir(s), QS);
    }

    public final File getFilesDir()
    {
        return new File(super.getFilesDir(), QS);
    }

    public final SharedPreferences getSharedPreferences(String s, int i)
    {
        return super.getSharedPreferences((new StringBuilder()).append(QT).append(":").append(s).toString(), i);
    }

    public final SQLiteDatabase openOrCreateDatabase(String s, int i, android.database.sqlite.SQLiteDatabase.CursorFactory cursorfactory)
    {
        return SQLiteDatabase.openOrCreateDatabase(getDatabasePath(s), cursorfactory);
    }

    public final SQLiteDatabase openOrCreateDatabase(String s, int i, android.database.sqlite.SQLiteDatabase.CursorFactory cursorfactory, DatabaseErrorHandler databaseerrorhandler)
    {
        return SQLiteDatabase.openOrCreateDatabase(getDatabasePath(s).getPath(), cursorfactory, databaseerrorhandler);
    }
}
