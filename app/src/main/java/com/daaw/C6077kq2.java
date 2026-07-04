package com.daaw;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzbt;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.daaw.kq2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6077kq2 extends SQLiteOpenHelper {
    public final Context B;
    public final PS2 C;

    public C6077kq2(Context context, PS2 ps2) {
        super(context, "AdMobOfflineBufferedPings.db", (SQLiteDatabase.CursorFactory) null, ((Integer) zzba.zzc().b(AbstractC9820yE1.f8)).intValue());
        this.B = context;
        this.C = ps2;
    }

    public static final void I(SQLiteDatabase sQLiteDatabase, String str) {
        sQLiteDatabase.delete("offline_buffered_pings", "gws_query_id = ? AND event_state = ?", new String[]{str, Integer.toString(0)});
    }

    public static void N(SQLiteDatabase sQLiteDatabase, C5680jT1 c5680jT1) throws Throwable {
        SQLiteDatabase sQLiteDatabase2;
        sQLiteDatabase.beginTransaction();
        try {
            sQLiteDatabase2 = sQLiteDatabase;
        } catch (Throwable th) {
            th = th;
            sQLiteDatabase2 = sQLiteDatabase;
        }
        try {
            Cursor cursorQuery = sQLiteDatabase2.query("offline_buffered_pings", new String[]{"url"}, "event_state = 1", null, null, null, "timestamp ASC", null);
            int count = cursorQuery.getCount();
            String[] strArr = new String[count];
            int i = 0;
            while (cursorQuery.moveToNext()) {
                int columnIndex = cursorQuery.getColumnIndex("url");
                if (columnIndex != -1) {
                    strArr[i] = cursorQuery.getString(columnIndex);
                }
                i++;
            }
            cursorQuery.close();
            sQLiteDatabase2.delete("offline_buffered_pings", "event_state = ?", new String[]{Integer.toString(1)});
            sQLiteDatabase2.setTransactionSuccessful();
            sQLiteDatabase2.endTransaction();
            for (int i2 = 0; i2 < count; i2++) {
                c5680jT1.zza(strArr[i2]);
            }
        } catch (Throwable th2) {
            th = th2;
            Throwable th3 = th;
            sQLiteDatabase2.endTransaction();
            throw th3;
        }
    }

    public static /* synthetic */ Void c(C5680jT1 c5680jT1, SQLiteDatabase sQLiteDatabase) throws Throwable {
        N(sQLiteDatabase, c5680jT1);
        return null;
    }

    public static /* synthetic */ void o(SQLiteDatabase sQLiteDatabase, String str, C5680jT1 c5680jT1) throws Throwable {
        ContentValues contentValues = new ContentValues();
        contentValues.put("event_state", (Integer) 1);
        sQLiteDatabase.update("offline_buffered_pings", contentValues, "gws_query_id = ?", new String[]{str});
        N(sQLiteDatabase, c5680jT1);
    }

    public final void F(final C5680jT1 c5680jT1, final String str) {
        l(new InterfaceC9554xH2() { // from class: com.daaw.fq2
            @Override // com.daaw.InterfaceC9554xH2
            public final Object zza(Object obj) {
                this.a.s((SQLiteDatabase) obj, c5680jT1, str);
                return null;
            }
        });
    }

    public final /* synthetic */ Void a(C6635mq2 c6635mq2, SQLiteDatabase sQLiteDatabase) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(DiagnosticsEntry.Event.TIMESTAMP_KEY, Long.valueOf(c6635mq2.a));
        contentValues.put("gws_query_id", c6635mq2.b);
        contentValues.put("url", c6635mq2.c);
        contentValues.put("event_state", Integer.valueOf(c6635mq2.d - 1));
        sQLiteDatabase.insert("offline_buffered_pings", null, contentValues);
        zzt.zzp();
        zzbt zzbtVarZzy = com.google.android.gms.ads.internal.util.zzt.zzy(this.B);
        if (zzbtVarZzy != null) {
            try {
                zzbtVarZzy.zze(BinderC7744qp0.Z2(this.B));
            } catch (RemoteException e) {
                zze.zzb("Failed to schedule offline ping sender.", e);
            }
        }
        return null;
    }

    public final void d(final String str) {
        l(new InterfaceC9554xH2() { // from class: com.daaw.iq2
            @Override // com.daaw.InterfaceC9554xH2
            public final Object zza(Object obj) {
                C6077kq2.I((SQLiteDatabase) obj, str);
                return null;
            }
        });
    }

    public final void j(final C6635mq2 c6635mq2) {
        l(new InterfaceC9554xH2() { // from class: com.daaw.eq2
            @Override // com.daaw.InterfaceC9554xH2
            public final Object zza(Object obj) {
                this.a.a(c6635mq2, (SQLiteDatabase) obj);
                return null;
            }
        });
    }

    public final void l(InterfaceC9554xH2 interfaceC9554xH2) {
        AbstractC7360pS2.r(this.C.S0(new Callable() { // from class: com.daaw.gq2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.getWritableDatabase();
            }
        }), new C5789jq2(this, interfaceC9554xH2), this.C);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE offline_buffered_pings (timestamp INTEGER PRIMARY_KEY, gws_query_id TEXT, url TEXT, event_state INTEGER)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_buffered_pings");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_buffered_pings");
    }

    public final void s(final SQLiteDatabase sQLiteDatabase, final C5680jT1 c5680jT1, final String str) {
        this.C.execute(new Runnable() { // from class: com.daaw.hq2
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                C6077kq2.o(sQLiteDatabase, str, c5680jT1);
            }
        });
    }
}
