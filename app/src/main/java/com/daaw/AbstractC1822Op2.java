package com.daaw;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.daaw.Op2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1822Op2 {
    public static int a(SQLiteDatabase sQLiteDatabase, int i) {
        int i2 = 0;
        if (i == 2) {
            return 0;
        }
        Cursor cursorH = h(sQLiteDatabase, i);
        if (cursorH.getCount() > 0) {
            cursorH.moveToNext();
            i2 = cursorH.getInt(cursorH.getColumnIndexOrThrow("value"));
        }
        cursorH.close();
        return i2;
    }

    public static long b(SQLiteDatabase sQLiteDatabase, int i) {
        long j;
        Cursor cursorH = h(sQLiteDatabase, 2);
        if (cursorH.getCount() > 0) {
            cursorH.moveToNext();
            j = cursorH.getLong(cursorH.getColumnIndexOrThrow("value"));
        } else {
            j = 0;
        }
        cursorH.close();
        return j;
    }

    public static ArrayList c(SQLiteDatabase sQLiteDatabase) {
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = sQLiteDatabase.query("offline_signal_contents", new String[]{"serialized_proto_data"}, null, null, null, null, null);
        while (cursorQuery.moveToNext()) {
            try {
                arrayList.add(C5613jD1.W(cursorQuery.getBlob(cursorQuery.getColumnIndexOrThrow("serialized_proto_data"))));
            } catch (C8939v43 e) {
                AbstractC4274eT1.zzg("Unable to deserialize proto from offline signals database:");
                AbstractC4274eT1.zzg(e.getMessage());
            }
        }
        cursorQuery.close();
        return arrayList;
    }

    public static void d(SQLiteDatabase sQLiteDatabase, long j, byte[] bArr) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(DiagnosticsEntry.Event.TIMESTAMP_KEY, Long.valueOf(j));
        contentValues.put("serialized_proto_data", bArr);
        if (sQLiteDatabase.update("offline_signal_contents", contentValues, "timestamp = ?", new String[]{String.valueOf(j)}) == 0) {
            sQLiteDatabase.insert("offline_signal_contents", null, contentValues);
        }
    }

    public static void e(SQLiteDatabase sQLiteDatabase) {
        i(sQLiteDatabase, "failed_requests", 0);
        i(sQLiteDatabase, "total_requests", 0);
        i(sQLiteDatabase, "completed_requests", 0);
        ContentValues contentValues = new ContentValues();
        contentValues.put("statistic_name", "last_successful_request_time");
        contentValues.put("value", (Long) 0L);
        sQLiteDatabase.insert("offline_signal_statistics", null, contentValues);
    }

    public static void f(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.delete("offline_signal_contents", null, null);
        j(sQLiteDatabase, "failed_requests", 0);
        j(sQLiteDatabase, "total_requests", 0);
        j(sQLiteDatabase, "completed_requests", 0);
    }

    public static void g(SQLiteDatabase sQLiteDatabase, boolean z, boolean z2) {
        if (!z2) {
            sQLiteDatabase.execSQL(String.format("UPDATE offline_signal_statistics SET value = value+1 WHERE statistic_name = '%s'", "total_requests"));
            return;
        }
        sQLiteDatabase.execSQL(String.format("UPDATE offline_signal_statistics SET value = value+1 WHERE statistic_name = '%s'", "completed_requests"));
        if (z) {
            return;
        }
        sQLiteDatabase.execSQL(String.format("UPDATE offline_signal_statistics SET value = value+1 WHERE statistic_name = '%s'", "failed_requests"));
    }

    public static Cursor h(SQLiteDatabase sQLiteDatabase, int i) {
        String[] strArr = {"value"};
        String[] strArr2 = new String[1];
        if (i == 0) {
            strArr2[0] = "failed_requests";
        } else if (i == 1) {
            strArr2[0] = "total_requests";
        } else if (i != 2) {
            strArr2[0] = "completed_requests";
        } else {
            strArr2[0] = "last_successful_request_time";
        }
        return sQLiteDatabase.query("offline_signal_statistics", strArr, "statistic_name = ?", strArr2, null, null, null);
    }

    public static void i(SQLiteDatabase sQLiteDatabase, String str, int i) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("statistic_name", str);
        contentValues.put("value", (Integer) 0);
        sQLiteDatabase.insert("offline_signal_statistics", null, contentValues);
    }

    public static void j(SQLiteDatabase sQLiteDatabase, String str, int i) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("value", (Integer) 0);
        sQLiteDatabase.update("offline_signal_statistics", contentValues, "statistic_name = ?", new String[]{str});
    }
}
