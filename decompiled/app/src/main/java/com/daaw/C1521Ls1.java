package com.daaw;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.zzac;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.Ls1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1521Ls1 extends Be3 {
    public static final String[] f = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};
    public static final String[] g = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};
    public static final String[] h = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;", "e_tag", "ALTER TABLE apps ADD COLUMN e_tag TEXT;", "session_stitching_token", "ALTER TABLE apps ADD COLUMN session_stitching_token TEXT;", "sgtm_upload_enabled", "ALTER TABLE apps ADD COLUMN sgtm_upload_enabled INTEGER;", "target_os_version", "ALTER TABLE apps ADD COLUMN target_os_version INTEGER;", "session_stitching_token_hash", "ALTER TABLE apps ADD COLUMN session_stitching_token_hash INTEGER;"};
    public static final String[] i = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};
    public static final String[] j = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};
    public static final String[] k = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};
    public static final String[] l = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};
    public static final String[] m = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};
    public final C4681fs1 d;
    public final C7970re3 e;

    public C1521Ls1(C8812uf3 c8812uf3) {
        super(c8812uf3);
        this.e = new C7970re3(this.a.p());
        this.a.z();
        this.d = new C4681fs1(this, this.a.v(), "google_app_measurement.db");
    }

    public static final void H(ContentValues contentValues, String str, Object obj) {
        AbstractC7506py0.f("value");
        AbstractC7506py0.l(obj);
        if (obj instanceof String) {
            contentValues.put("value", (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put("value", (Long) obj);
        } else {
            if (!(obj instanceof Double)) {
                throw new IllegalArgumentException("Invalid value type");
            }
            contentValues.put("value", (Double) obj);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v41, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v2, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v31, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v34, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v35 */
    /* JADX WARN: Type inference failed for: r5v36 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v9 */
    public final void G(String str, long j2, long j3, C6302lf3 c6302lf3) throws Throwable {
        String str2;
        String string;
        String str3;
        String[] strArr;
        AbstractC7506py0.l(c6302lf3);
        d();
        e();
        ?? r3 = 0;
        string = null;
        string = null;
        String string2 = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabaseP = P();
                str2 = "";
                try {
                    if (TextUtils.isEmpty(null)) {
                        Cursor cursorRawQuery = sQLiteDatabaseP.rawQuery("select app_id, metadata_fingerprint from raw_events where " + (j3 != -1 ? "rowid <= ? and " : "") + "app_id in (select app_id from apps where config_fetched_time >= ?) order by rowid limit 1;", j3 != -1 ? new String[]{String.valueOf(j3), String.valueOf(j2)} : new String[]{String.valueOf(j2)});
                        if (!cursorRawQuery.moveToFirst()) {
                            cursorRawQuery.close();
                            return;
                        }
                        string2 = cursorRawQuery.getString(0);
                        string = cursorRawQuery.getString(1);
                        cursorRawQuery.close();
                        str2 = cursorRawQuery;
                    } else {
                        Cursor cursorRawQuery2 = sQLiteDatabaseP.rawQuery("select metadata_fingerprint from raw_events where app_id = ?" + (j3 != -1 ? " and rowid <= ?" : "") + " order by rowid limit 1;", j3 != -1 ? new String[]{null, String.valueOf(j3)} : new String[]{null});
                        if (!cursorRawQuery2.moveToFirst()) {
                            cursorRawQuery2.close();
                            return;
                        } else {
                            string = cursorRawQuery2.getString(0);
                            cursorRawQuery2.close();
                            str2 = cursorRawQuery2;
                        }
                    }
                    ?? r16 = str2;
                    try {
                        Cursor cursorQuery = sQLiteDatabaseP.query("raw_events_metadata", new String[]{"metadata"}, "app_id = ? and metadata_fingerprint = ?", new String[]{string2, string}, null, null, "rowid", "2");
                        try {
                            if (!cursorQuery.moveToFirst()) {
                                this.a.w().n().b("Raw event metadata record is missing. appId", C6675mz2.z(string2));
                                cursorQuery.close();
                                return;
                            }
                            try {
                                C8762uU2 c8762uU2 = (C8762uU2) ((QT2) Af3.E(C8762uU2.S1(), cursorQuery.getBlob(0))).l();
                                if (cursorQuery.moveToNext()) {
                                    this.a.w().t().b("Get multiple raw event metadata records, expected one. appId", C6675mz2.z(string2));
                                }
                                cursorQuery.close();
                                AbstractC7506py0.l(c8762uU2);
                                c6302lf3.a = c8762uU2;
                                if (j3 != -1) {
                                    str3 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?";
                                    strArr = new String[]{string2, string, String.valueOf(j3)};
                                } else {
                                    str3 = "app_id = ? and metadata_fingerprint = ?";
                                    strArr = new String[]{string2, string};
                                }
                                Cursor cursorQuery2 = sQLiteDatabaseP.query("raw_events", new String[]{"rowid", "name", DiagnosticsEntry.Event.TIMESTAMP_KEY, "data"}, str3, strArr, null, null, "rowid", null);
                                try {
                                    if (!cursorQuery2.moveToFirst()) {
                                        this.a.w().t().b("Raw event data disappeared while in transaction. appId", C6675mz2.z(string2));
                                        cursorQuery2.close();
                                        return;
                                    }
                                    do {
                                        long j4 = cursorQuery2.getLong(0);
                                        try {
                                            IN2 in2 = (IN2) Af3.E(C6507mO2.F(), cursorQuery2.getBlob(3));
                                            in2.y(cursorQuery2.getString(1));
                                            in2.C(cursorQuery2.getLong(2));
                                            if (!c6302lf3.a(j4, (C6507mO2) in2.l())) {
                                                cursorQuery2.close();
                                                return;
                                            }
                                        } catch (IOException e) {
                                            this.a.w().n().c("Data loss. Failed to merge raw event. appId", C6675mz2.z(string2), e);
                                        }
                                    } while (cursorQuery2.moveToNext());
                                    cursorQuery2.close();
                                    return;
                                } catch (SQLiteException e2) {
                                    e = e2;
                                    str2 = cursorQuery2;
                                } catch (Throwable th) {
                                    th = th;
                                    r3 = cursorQuery2;
                                    if (r3 != 0) {
                                        r3.close();
                                    }
                                    throw th;
                                }
                            } catch (IOException e3) {
                                this.a.w().n().c("Data loss. Failed to merge raw event metadata. appId", C6675mz2.z(string2), e3);
                                cursorQuery.close();
                                return;
                            }
                        } catch (SQLiteException e4) {
                            e = e4;
                            str2 = cursorQuery;
                        } catch (Throwable th2) {
                            th = th2;
                            r3 = cursorQuery;
                        }
                    } catch (SQLiteException e5) {
                        e = e5;
                        str2 = r16;
                    } catch (Throwable th3) {
                        th = th3;
                        r3 = r16;
                    }
                } catch (SQLiteException e6) {
                    e = e6;
                }
            } catch (SQLiteException e7) {
                e = e7;
                str2 = 0;
            } catch (Throwable th4) {
                th = th4;
            }
            this.a.w().n().c("Data loss. Error selecting raw event. appId", C6675mz2.z(string2), e);
            if (str2 != 0) {
                str2.close();
            }
        } catch (Throwable th5) {
            th = th5;
            r3 = str2;
        }
    }

    public final long I(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                Cursor cursorRawQuery = P().rawQuery(str, strArr);
                if (!cursorRawQuery.moveToFirst()) {
                    throw new SQLiteException("Database returned empty set");
                }
                long j2 = cursorRawQuery.getLong(0);
                cursorRawQuery.close();
                return j2;
            } catch (SQLiteException e) {
                this.a.w().n().c("Database error", str, e);
                throw e;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    public final int J(String str, String str2) {
        AbstractC7506py0.f(str);
        AbstractC7506py0.f(str2);
        d();
        e();
        try {
            return P().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            this.a.w().n().d("Error deleting conditional property", C6675mz2.z(str), this.a.D().f(str2), e);
            return 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long K(java.lang.String r3, java.lang.String[] r4, long r5) {
        /*
            r2 = this;
            android.database.sqlite.SQLiteDatabase r0 = r2.P()
            r1 = 0
            android.database.Cursor r1 = r0.rawQuery(r3, r4)     // Catch: java.lang.Throwable -> L18 android.database.sqlite.SQLiteException -> L1a
            boolean r4 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L18 android.database.sqlite.SQLiteException -> L1a
            if (r4 == 0) goto L1c
            r4 = 0
            long r3 = r1.getLong(r4)     // Catch: java.lang.Throwable -> L18 android.database.sqlite.SQLiteException -> L1a
            r1.close()
            return r3
        L18:
            r3 = move-exception
            goto L30
        L1a:
            r4 = move-exception
            goto L20
        L1c:
            r1.close()
            return r5
        L20:
            com.daaw.wU2 r5 = r2.a     // Catch: java.lang.Throwable -> L18
            com.daaw.mz2 r5 = r5.w()     // Catch: java.lang.Throwable -> L18
            com.daaw.dy2 r5 = r5.n()     // Catch: java.lang.Throwable -> L18
            java.lang.String r6 = "Database error"
            r5.c(r6, r3, r4)     // Catch: java.lang.Throwable -> L18
            throw r4     // Catch: java.lang.Throwable -> L18
        L30:
            if (r1 == 0) goto L35
            r1.close()
        L35:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C1521Ls1.K(java.lang.String, java.lang.String[], long):long");
    }

    public final long L(String str, String str2) {
        long jK;
        AbstractC7506py0.f(str);
        AbstractC7506py0.f("first_open_count");
        d();
        e();
        SQLiteDatabase sQLiteDatabaseP = P();
        sQLiteDatabaseP.beginTransaction();
        long j2 = 0;
        try {
            try {
                jK = K("select first_open_count from app2 where app_id=?", new String[]{str}, -1L);
            } catch (Throwable th) {
                sQLiteDatabaseP.endTransaction();
                throw th;
            }
        } catch (SQLiteException e) {
            e = e;
        }
        if (jK == -1) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", str);
            contentValues.put("first_open_count", (Integer) 0);
            contentValues.put("previous_install_count", (Integer) 0);
            if (sQLiteDatabaseP.insertWithOnConflict("app2", null, contentValues, 5) == -1) {
                this.a.w().n().c("Failed to insert column (got -1). appId", C6675mz2.z(str), "first_open_count");
                sQLiteDatabaseP.endTransaction();
                return -1L;
            }
            jK = 0;
            this.a.w().n().d("Error inserting column. appId", C6675mz2.z(str), "first_open_count", e);
            sQLiteDatabaseP.endTransaction();
            return j2;
        }
        try {
            ContentValues contentValues2 = new ContentValues();
            contentValues2.put("app_id", str);
            contentValues2.put("first_open_count", Long.valueOf(1 + jK));
            if (sQLiteDatabaseP.update("app2", contentValues2, "app_id = ?", new String[]{str}) == 0) {
                this.a.w().n().c("Failed to update column (got 0). appId", C6675mz2.z(str), "first_open_count");
                sQLiteDatabaseP.endTransaction();
                return -1L;
            }
            sQLiteDatabaseP.setTransactionSuccessful();
            sQLiteDatabaseP.endTransaction();
            return jK;
        } catch (SQLiteException e2) {
            e = e2;
            j2 = jK;
        }
    }

    public final long M() {
        return K("select max(bundle_end_timestamp) from queue", null, 0L);
    }

    public final long N() {
        return K("select max(timestamp) from raw_events", null, 0L);
    }

    public final long O(String str) {
        AbstractC7506py0.f(str);
        return K("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0L);
    }

    public final SQLiteDatabase P() {
        d();
        try {
            return this.d.getWritableDatabase();
        } catch (SQLiteException e) {
            this.a.w().t().b("Error opening database", e);
            throw e;
        }
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x00bf: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]) (LINE:192), block:B:38:0x00bf */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.os.Bundle Q(java.lang.String r8) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 224
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C1521Ls1.Q(java.lang.String):android.os.Bundle");
    }

    public final C8110s73 R(String str) {
        Cursor cursorQuery;
        AbstractC7506py0.f(str);
        d();
        e();
        Cursor cursor = null;
        try {
            cursorQuery = P().query("apps", new String[]{"app_instance_id", "gmp_app_id", "resettable_device_id_hash", "last_bundle_index", "last_bundle_start_timestamp", "last_bundle_end_timestamp", "app_version", "app_store", "gmp_version", "dev_cert_hash", "measurement_enabled", "day", "daily_public_events_count", "daily_events_count", "daily_conversions_count", "config_fetched_time", "failed_config_fetch_time", "app_version_int", "firebase_instance_id", "daily_error_events_count", "daily_realtime_events_count", "health_monitor_sample", "android_id", "adid_reporting_enabled", "admob_app_id", "dynamite_version", "safelisted_events", "ga_app_id", "session_stitching_token", "sgtm_upload_enabled", "target_os_version", "session_stitching_token_hash"}, "app_id=?", new String[]{str}, null, null, null);
        } catch (SQLiteException e) {
            e = e;
            cursorQuery = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            try {
                if (!cursorQuery.moveToFirst()) {
                    cursorQuery.close();
                    return null;
                }
                C8110s73 c8110s73 = new C8110s73(this.b.b0(), str);
                boolean z = false;
                c8110s73.j(cursorQuery.getString(0));
                c8110s73.y(cursorQuery.getString(1));
                c8110s73.H(cursorQuery.getString(2));
                c8110s73.D(cursorQuery.getLong(3));
                c8110s73.E(cursorQuery.getLong(4));
                c8110s73.C(cursorQuery.getLong(5));
                c8110s73.l(cursorQuery.getString(6));
                c8110s73.k(cursorQuery.getString(7));
                c8110s73.z(cursorQuery.getLong(8));
                c8110s73.u(cursorQuery.getLong(9));
                c8110s73.F(cursorQuery.isNull(10) || cursorQuery.getInt(10) != 0);
                c8110s73.t(cursorQuery.getLong(11));
                c8110s73.r(cursorQuery.getLong(12));
                c8110s73.q(cursorQuery.getLong(13));
                c8110s73.o(cursorQuery.getLong(14));
                c8110s73.n(cursorQuery.getLong(15));
                c8110s73.w(cursorQuery.getLong(16));
                c8110s73.m(cursorQuery.isNull(17) ? -2147483648L : cursorQuery.getInt(17));
                c8110s73.x(cursorQuery.getString(18));
                c8110s73.p(cursorQuery.getLong(19));
                c8110s73.s(cursorQuery.getLong(20));
                c8110s73.B(cursorQuery.getString(21));
                c8110s73.i(cursorQuery.isNull(23) || cursorQuery.getInt(23) != 0);
                c8110s73.h(cursorQuery.getString(24));
                c8110s73.v(cursorQuery.isNull(25) ? 0L : cursorQuery.getLong(25));
                if (!cursorQuery.isNull(26)) {
                    c8110s73.I(Arrays.asList(cursorQuery.getString(26).split(",", -1)));
                }
                C6054kn3.b();
                if (this.a.z().B(str, AbstractC1311Jr2.q0) || this.a.z().B(null, AbstractC1311Jr2.o0)) {
                    c8110s73.J(cursorQuery.getString(28));
                }
                On3.b();
                if (this.a.z().B(null, AbstractC1311Jr2.s0)) {
                    if (!cursorQuery.isNull(29) && cursorQuery.getInt(29) != 0) {
                        z = true;
                    }
                    c8110s73.L(z);
                }
                C4932gm3.b();
                if (this.a.z().B(null, AbstractC1311Jr2.G0)) {
                    c8110s73.M(cursorQuery.getLong(30));
                }
                if (this.a.z().B(null, AbstractC1311Jr2.J0)) {
                    c8110s73.K(cursorQuery.getLong(31));
                }
                c8110s73.f();
                if (cursorQuery.moveToNext()) {
                    this.a.w().n().b("Got multiple records for app, expected one. appId", C6675mz2.z(str));
                }
                cursorQuery.close();
                return c8110s73;
            } catch (Throwable th2) {
                th = th2;
                cursor = cursorQuery;
            }
        } catch (SQLiteException e2) {
            e = e2;
            this.a.w().n().c("Error querying app. appId", C6675mz2.z(str), e);
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return null;
        }
        th = th2;
        cursor = cursorQuery;
        if (cursor != null) {
            cursor.close();
        }
        throw th;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x012a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.measurement.internal.zzac S(java.lang.String r26, java.lang.String r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 302
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C1521Ls1.S(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.zzac");
    }

    public final C9993yr1 T(long j2, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        return U(j2, str, 1L, false, false, z3, false, z5);
    }

    public final C9993yr1 U(long j2, String str, long j3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        AbstractC7506py0.f(str);
        d();
        e();
        String[] strArr = {str};
        C9993yr1 c9993yr1 = new C9993yr1();
        Cursor cursor = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabaseP = P();
                Cursor cursorQuery = sQLiteDatabaseP.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count"}, "app_id=?", new String[]{str}, null, null, null);
                if (!cursorQuery.moveToFirst()) {
                    this.a.w().t().b("Not updating daily counts, app is not known. appId", C6675mz2.z(str));
                    cursorQuery.close();
                    return c9993yr1;
                }
                if (cursorQuery.getLong(0) == j2) {
                    c9993yr1.b = cursorQuery.getLong(1);
                    c9993yr1.a = cursorQuery.getLong(2);
                    c9993yr1.c = cursorQuery.getLong(3);
                    c9993yr1.d = cursorQuery.getLong(4);
                    c9993yr1.e = cursorQuery.getLong(5);
                }
                if (z) {
                    c9993yr1.b += j3;
                }
                if (z2) {
                    c9993yr1.a += j3;
                }
                if (z3) {
                    c9993yr1.c += j3;
                }
                if (z4) {
                    c9993yr1.d += j3;
                }
                if (z5) {
                    c9993yr1.e += j3;
                }
                ContentValues contentValues = new ContentValues();
                contentValues.put("day", Long.valueOf(j2));
                contentValues.put("daily_public_events_count", Long.valueOf(c9993yr1.a));
                contentValues.put("daily_events_count", Long.valueOf(c9993yr1.b));
                contentValues.put("daily_conversions_count", Long.valueOf(c9993yr1.c));
                contentValues.put("daily_error_events_count", Long.valueOf(c9993yr1.d));
                contentValues.put("daily_realtime_events_count", Long.valueOf(c9993yr1.e));
                sQLiteDatabaseP.update("apps", contentValues, "app_id=?", strArr);
                cursorQuery.close();
                return c9993yr1;
            } catch (SQLiteException e) {
                this.a.w().n().c("Error updating daily counts. appId", C6675mz2.z(str), e);
                if (0 != 0) {
                    cursor.close();
                }
                return c9993yr1;
            }
        } finally {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0133  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.daaw.C8900uw1 V(java.lang.String r30, java.lang.String r31) {
        /*
            Method dump skipped, instruction units count: 311
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C1521Ls1.V(java.lang.String, java.lang.String):com.daaw.uw1");
    }

    public final If3 X(String str, String str2) {
        Throwable th;
        String str3;
        String str4;
        SQLiteException sQLiteException;
        Cursor cursorQuery;
        AbstractC7506py0.f(str);
        AbstractC7506py0.f(str2);
        d();
        e();
        Cursor cursor = null;
        try {
            cursorQuery = P().query("user_attributes", new String[]{"set_timestamp", "value", "origin"}, "app_id=? and name=?", new String[]{str, str2}, null, null, null);
            try {
                try {
                    if (!cursorQuery.moveToFirst()) {
                        cursorQuery.close();
                        return null;
                    }
                    long j2 = cursorQuery.getLong(0);
                    Object objY = Y(cursorQuery, 1);
                    if (objY == null) {
                        cursorQuery.close();
                        return null;
                    }
                    str3 = str;
                    str4 = str2;
                    try {
                        If3 if3 = new If3(str3, cursorQuery.getString(2), str4, j2, objY);
                        if (cursorQuery.moveToNext()) {
                            this.a.w().n().b("Got multiple records for user property, expected one. appId", C6675mz2.z(str3));
                        }
                        cursorQuery.close();
                        return if3;
                    } catch (SQLiteException e) {
                        e = e;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    cursor = cursorQuery;
                    if (cursor == null) {
                        throw th;
                    }
                    cursor.close();
                    throw th;
                }
            } catch (SQLiteException e2) {
                e = e2;
                str3 = str;
                str4 = str2;
            }
            sQLiteException = e;
        } catch (SQLiteException e3) {
            str3 = str;
            str4 = str2;
            sQLiteException = e3;
            cursorQuery = null;
        } catch (Throwable th3) {
            th = th3;
        }
        this.a.w().n().d("Error querying user property. appId", C6675mz2.z(str3), this.a.D().f(str4), sQLiteException);
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return null;
    }

    public final Object Y(Cursor cursor, int i2) {
        int type = cursor.getType(i2);
        if (type == 0) {
            this.a.w().n().a("Loaded invalid null value from database");
            return null;
        }
        if (type == 1) {
            return Long.valueOf(cursor.getLong(i2));
        }
        if (type == 2) {
            return Double.valueOf(cursor.getDouble(i2));
        }
        if (type == 3) {
            return cursor.getString(i2);
        }
        if (type != 4) {
            this.a.w().n().b("Loaded invalid unknown value type, ignoring it", Integer.valueOf(type));
            return null;
        }
        this.a.w().n().a("Loaded invalid blob type value, ignoring it");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0042  */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String Z() throws java.lang.Throwable {
        /*
            r6 = this;
            android.database.sqlite.SQLiteDatabase r0 = r6.P()
            r1 = 0
            java.lang.String r2 = "select app_id from queue order by has_realtime desc, rowid asc limit 1;"
            android.database.Cursor r0 = r0.rawQuery(r2, r1)     // Catch: java.lang.Throwable -> L26 android.database.sqlite.SQLiteException -> L28
            boolean r2 = r0.moveToFirst()     // Catch: java.lang.Throwable -> L1a android.database.sqlite.SQLiteException -> L1c
            if (r2 == 0) goto L1e
            r2 = 0
            java.lang.String r1 = r0.getString(r2)     // Catch: java.lang.Throwable -> L1a android.database.sqlite.SQLiteException -> L1c
            r0.close()
            return r1
        L1a:
            r1 = move-exception
            goto L22
        L1c:
            r2 = move-exception
            goto L2b
        L1e:
            r0.close()
            return r1
        L22:
            r5 = r1
            r1 = r0
            r0 = r5
            goto L40
        L26:
            r0 = move-exception
            goto L40
        L28:
            r0 = move-exception
            r2 = r0
            r0 = r1
        L2b:
            com.daaw.wU2 r3 = r6.a     // Catch: java.lang.Throwable -> L1a
            com.daaw.mz2 r3 = r3.w()     // Catch: java.lang.Throwable -> L1a
            com.daaw.dy2 r3 = r3.n()     // Catch: java.lang.Throwable -> L1a
            java.lang.String r4 = "Database error getting next bundle app id"
            r3.b(r4, r2)     // Catch: java.lang.Throwable -> L1a
            if (r0 == 0) goto L3f
            r0.close()
        L3f:
            return r1
        L40:
            if (r1 == 0) goto L45
            r1.close()
        L45:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C1521Ls1.Z():java.lang.String");
    }

    public final List a0(String str, String str2, String str3) {
        AbstractC7506py0.f(str);
        d();
        e();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(String.valueOf(str3).concat("*"));
            sb.append(" and name glob ?");
        }
        return b0(sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0058, code lost:
    
        r2 = r27.a.w().n();
        r27.a.z();
        r2.b("Read more than the max allowed conditional properties, ignoring extra", 1000);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List b0(java.lang.String r28, java.lang.String[] r29) {
        /*
            Method dump skipped, instruction units count: 301
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C1521Ls1.b0(java.lang.String, java.lang.String[]):java.util.List");
    }

    public final List c0(String str) {
        String str2;
        AbstractC7506py0.f(str);
        d();
        e();
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                this.a.z();
                cursorQuery = P().query("user_attributes", new String[]{"name", "origin", "set_timestamp", "value"}, "app_id=?", new String[]{str}, null, null, "rowid", "1000");
                try {
                    if (!cursorQuery.moveToFirst()) {
                        cursorQuery.close();
                        return arrayList;
                    }
                    while (true) {
                        String string = cursorQuery.getString(0);
                        String string2 = cursorQuery.getString(1);
                        if (string2 == null) {
                            string2 = "";
                        }
                        String str3 = string2;
                        long j2 = cursorQuery.getLong(2);
                        Object objY = Y(cursorQuery, 3);
                        if (objY == null) {
                            this.a.w().n().b("Read invalid user property value, ignoring it. appId", C6675mz2.z(str));
                            str2 = str;
                        } else {
                            str2 = str;
                            try {
                                arrayList.add(new If3(str2, str3, string, j2, objY));
                            } catch (SQLiteException e) {
                                e = e;
                            }
                        }
                        if (!cursorQuery.moveToNext()) {
                            cursorQuery.close();
                            return arrayList;
                        }
                        str = str2;
                    }
                } catch (SQLiteException e2) {
                    e = e2;
                    str2 = str;
                }
            } catch (SQLiteException e3) {
                e = e3;
                str2 = str;
            }
            this.a.w().n().c("Error querying user properties. appId", C6675mz2.z(str2), e);
            List list = Collections.EMPTY_LIST;
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return list;
        } finally {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00a6, code lost:
    
        r0 = r17.a.w().n();
        r17.a.z();
        r0.b("Read more than the max allowed user properties, ignoring excess", 1000);
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0121  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List d0(java.lang.String r18, java.lang.String r19, java.lang.String r20) {
        /*
            Method dump skipped, instruction units count: 299
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C1521Ls1.d0(java.lang.String, java.lang.String, java.lang.String):java.util.List");
    }

    public final void e0() {
        e();
        P().beginTransaction();
    }

    public final void f0() {
        e();
        P().endTransaction();
    }

    public final void g0(List list) {
        d();
        e();
        AbstractC7506py0.l(list);
        AbstractC7506py0.n(list.size());
        if (r()) {
            String str = "(" + TextUtils.join(",", list) + ")";
            if (I("SELECT COUNT(1) FROM queue WHERE rowid IN " + str + " AND retry_count =  2147483647 LIMIT 1", null) > 0) {
                this.a.w().t().a("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                P().execSQL("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN " + str + " AND (retry_count IS NULL OR retry_count < 2147483647)");
            } catch (SQLiteException e) {
                this.a.w().n().b("Error incrementing retry count. error", e);
            }
        }
    }

    @Override // com.daaw.Be3
    public final boolean h() {
        return false;
    }

    public final void h0() {
        d();
        e();
        if (r()) {
            long jA = this.b.e0().e.a();
            long jB = this.a.p().b();
            long jAbs = Math.abs(jB - jA);
            this.a.z();
            if (jAbs > ((Long) AbstractC1311Jr2.A.a(null)).longValue()) {
                this.b.e0().e.b(jB);
                d();
                e();
                if (r()) {
                    SQLiteDatabase sQLiteDatabaseP = P();
                    String strValueOf = String.valueOf(this.a.p().a());
                    this.a.z();
                    int iDelete = sQLiteDatabaseP.delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{strValueOf, String.valueOf(C5788jq1.e())});
                    if (iDelete > 0) {
                        this.a.w().s().b("Deleted stale rows. rowsDeleted", Integer.valueOf(iDelete));
                    }
                }
            }
        }
    }

    public final void i(String str, String str2) {
        AbstractC7506py0.f(str);
        AbstractC7506py0.f(str2);
        d();
        e();
        try {
            P().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            this.a.w().n().d("Error deleting user property. appId", C6675mz2.z(str), this.a.D().f(str2), e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x031c, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x031d, code lost:
    
        r12.put("filter_id", r0);
        r21 = r3;
        r12.put("property_name", r7.F());
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x032f, code lost:
    
        if (r7.L() == false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0331, code lost:
    
        r3 = java.lang.Boolean.valueOf(r7.J());
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x033a, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x033b, code lost:
    
        r12.put("session_scoped", r3);
        r12.put("data", r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x034d, code lost:
    
        if (P().insertWithOnConflict("property_filters", null, r12, 5) != (-1)) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x034f, code lost:
    
        r22.a.w().n().b("Failed to insert property filter (got -1). appId", com.daaw.C6675mz2.z(r23));
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0363, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0365, code lost:
    
        r0 = r19;
        r3 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x036b, code lost:
    
        r22.a.w().n().c("Error storing property filter. appId", com.daaw.C6675mz2.z(r23), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x037e, code lost:
    
        e();
        d();
        com.daaw.AbstractC7506py0.f(r23);
        r0 = P();
        r0.delete("property_filters", "app_id=? and audience_id=?", new java.lang.String[]{r23, java.lang.String.valueOf(r10)});
        r0.delete("event_filters", "app_id=? and audience_id=?", new java.lang.String[]{r23, java.lang.String.valueOf(r10)});
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x03a1, code lost:
    
        r7 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0483, code lost:
    
        r20.endTransaction();
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0486, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0176, code lost:
    
        r11 = r0.I().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0182, code lost:
    
        if (r11.hasNext() == false) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x018e, code lost:
    
        if (((com.daaw.C6117kz2) r11.next()).K() != false) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0190, code lost:
    
        r22.a.w().t().c("Property filter with no ID. Audience definition ignored. appId, audienceId", com.daaw.C6675mz2.z(r23), java.lang.Integer.valueOf(r10));
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01a9, code lost:
    
        r11 = r0.H().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01b5, code lost:
    
        r19 = r0;
        r0 = "app_id";
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01c3, code lost:
    
        if (r11.hasNext() == false) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01c5, code lost:
    
        r12 = (com.daaw.C2798Xt2) r11.next();
        e();
        d();
        com.daaw.AbstractC7506py0.f(r23);
        com.daaw.AbstractC7506py0.l(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01df, code lost:
    
        if (r12.H().isEmpty() == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01e1, code lost:
    
        r0 = r22.a.w().t();
        r11 = com.daaw.C6675mz2.z(r23);
        r13 = java.lang.Integer.valueOf(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01f9, code lost:
    
        if (r12.P() == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01fb, code lost:
    
        r16 = java.lang.Integer.valueOf(r12.C());
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0206, code lost:
    
        r16 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0208, code lost:
    
        r0.d("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", r11, r13, java.lang.String.valueOf(r16));
        r20 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0213, code lost:
    
        r3 = r12.g();
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0217, code lost:
    
        r20 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0219, code lost:
    
        r7 = new android.content.ContentValues();
        r7.put("app_id", r23);
        r7.put("audience_id", java.lang.Integer.valueOf(r10));
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x022c, code lost:
    
        if (r12.P() == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x022e, code lost:
    
        r0 = java.lang.Integer.valueOf(r12.C());
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0237, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x023a, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x023b, code lost:
    
        r7.put("filter_id", r0);
        r7.put("event_name", r12.H());
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x024b, code lost:
    
        if (r12.Q() == false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x024d, code lost:
    
        r0 = java.lang.Boolean.valueOf(r12.N());
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0256, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0257, code lost:
    
        r7.put("session_scoped", r0);
        r7.put("data", r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0269, code lost:
    
        if (P().insertWithOnConflict("event_filters", null, r7, 5) != (-1)) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x026b, code lost:
    
        r22.a.w().n().b("Failed to insert event filter (got -1). appId", com.daaw.C6675mz2.z(r23));
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x027e, code lost:
    
        r0 = r19;
        r7 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0286, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0287, code lost:
    
        r22.a.w().n().c("Error storing event filter. appId", com.daaw.C6675mz2.z(r23), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x029c, code lost:
    
        r20 = r7;
        r3 = r19.I().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x02aa, code lost:
    
        if (r3.hasNext() == false) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x02ac, code lost:
    
        r7 = (com.daaw.C6117kz2) r3.next();
        e();
        d();
        com.daaw.AbstractC7506py0.f(r23);
        com.daaw.AbstractC7506py0.l(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x02c6, code lost:
    
        if (r7.F().isEmpty() == false) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x02c8, code lost:
    
        r0 = r22.a.w().t();
        r9 = com.daaw.C6675mz2.z(r23);
        r11 = java.lang.Integer.valueOf(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x02e0, code lost:
    
        if (r7.K() == false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x02e2, code lost:
    
        r16 = java.lang.Integer.valueOf(r7.B());
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x02ed, code lost:
    
        r16 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x02ef, code lost:
    
        r0.d("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", r9, r11, java.lang.String.valueOf(r16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x02f8, code lost:
    
        r11 = r7.g();
        r12 = new android.content.ContentValues();
        r12.put(r0, r23);
        r19 = r0;
        r12.put("audience_id", java.lang.Integer.valueOf(r10));
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0311, code lost:
    
        if (r7.K() == false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0313, code lost:
    
        r0 = java.lang.Integer.valueOf(r7.B());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j(java.lang.String r23, java.util.List r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1159
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C1521Ls1.j(java.lang.String, java.util.List):void");
    }

    public final void k() {
        e();
        P().setTransactionSuccessful();
    }

    public final void l(C8110s73 c8110s73) {
        AbstractC7506py0.l(c8110s73);
        d();
        e();
        String strL0 = c8110s73.l0();
        AbstractC7506py0.l(strL0);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", strL0);
        contentValues.put("app_instance_id", c8110s73.m0());
        contentValues.put("gmp_app_id", c8110s73.a());
        contentValues.put("resettable_device_id_hash", c8110s73.c());
        contentValues.put("last_bundle_index", Long.valueOf(c8110s73.e0()));
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(c8110s73.f0()));
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(c8110s73.d0()));
        contentValues.put("app_version", c8110s73.o0());
        contentValues.put("app_store", c8110s73.n0());
        contentValues.put("gmp_version", Long.valueOf(c8110s73.c0()));
        contentValues.put("dev_cert_hash", Long.valueOf(c8110s73.Z()));
        contentValues.put("measurement_enabled", Boolean.valueOf(c8110s73.O()));
        contentValues.put("day", Long.valueOf(c8110s73.Y()));
        contentValues.put("daily_public_events_count", Long.valueOf(c8110s73.W()));
        contentValues.put("daily_events_count", Long.valueOf(c8110s73.V()));
        contentValues.put("daily_conversions_count", Long.valueOf(c8110s73.T()));
        contentValues.put("config_fetched_time", Long.valueOf(c8110s73.S()));
        contentValues.put("failed_config_fetch_time", Long.valueOf(c8110s73.b0()));
        contentValues.put("app_version_int", Long.valueOf(c8110s73.R()));
        contentValues.put("firebase_instance_id", c8110s73.p0());
        contentValues.put("daily_error_events_count", Long.valueOf(c8110s73.U()));
        contentValues.put("daily_realtime_events_count", Long.valueOf(c8110s73.X()));
        contentValues.put("health_monitor_sample", c8110s73.b());
        c8110s73.A();
        contentValues.put("android_id", (Long) 0L);
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(c8110s73.N()));
        contentValues.put("admob_app_id", c8110s73.j0());
        contentValues.put("dynamite_version", Long.valueOf(c8110s73.a0()));
        contentValues.put("session_stitching_token", c8110s73.d());
        contentValues.put("sgtm_upload_enabled", Boolean.valueOf(c8110s73.Q()));
        contentValues.put("target_os_version", Long.valueOf(c8110s73.h0()));
        contentValues.put("session_stitching_token_hash", Long.valueOf(c8110s73.g0()));
        List listE = c8110s73.e();
        if (listE != null) {
            if (listE.isEmpty()) {
                this.a.w().t().b("Safelisted events should not be an empty list. appId", strL0);
            } else {
                contentValues.put("safelisted_events", TextUtils.join(",", listE));
            }
        }
        C5760jk3.b();
        if (this.a.z().B(null, AbstractC1311Jr2.m0) && !contentValues.containsKey("safelisted_events")) {
            contentValues.put("safelisted_events", (String) null);
        }
        try {
            SQLiteDatabase sQLiteDatabaseP = P();
            if (sQLiteDatabaseP.update("apps", contentValues, "app_id = ?", new String[]{strL0}) == 0 && sQLiteDatabaseP.insertWithOnConflict("apps", null, contentValues, 5) == -1) {
                this.a.w().n().b("Failed to insert/update app (got -1). appId", C6675mz2.z(strL0));
            }
        } catch (SQLiteException e) {
            this.a.w().n().c("Error storing app. appId", C6675mz2.z(strL0), e);
        }
    }

    public final void m(C8900uw1 c8900uw1) {
        AbstractC7506py0.l(c8900uw1);
        d();
        e();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", c8900uw1.a);
        contentValues.put("name", c8900uw1.b);
        contentValues.put("lifetime_count", Long.valueOf(c8900uw1.c));
        contentValues.put("current_bundle_count", Long.valueOf(c8900uw1.d));
        contentValues.put("last_fire_timestamp", Long.valueOf(c8900uw1.f));
        contentValues.put("last_bundled_timestamp", Long.valueOf(c8900uw1.g));
        contentValues.put("last_bundled_day", c8900uw1.h);
        contentValues.put("last_sampled_complex_event_id", c8900uw1.i);
        contentValues.put("last_sampling_rate", c8900uw1.j);
        contentValues.put("current_session_count", Long.valueOf(c8900uw1.e));
        Boolean bool = c8900uw1.k;
        contentValues.put("last_exempt_from_sampling", (bool == null || !bool.booleanValue()) ? null : 1L);
        try {
            if (P().insertWithOnConflict("events", null, contentValues, 5) == -1) {
                this.a.w().n().b("Failed to insert/update event aggregates (got -1). appId", C6675mz2.z(c8900uw1.a));
            }
        } catch (SQLiteException e) {
            this.a.w().n().c("Error storing event aggregates. appId", C6675mz2.z(c8900uw1.a), e);
        }
    }

    public final boolean n() {
        return I("select count(1) > 0 from raw_events", null) != 0;
    }

    public final boolean o() {
        return I("select count(1) > 0 from queue where has_realtime = 1", null) != 0;
    }

    public final boolean q() {
        return I("select count(1) > 0 from raw_events where realtime = 1", null) != 0;
    }

    public final boolean r() {
        Context contextV = this.a.v();
        this.a.z();
        return contextV.getDatabasePath("google_app_measurement.db").exists();
    }

    public final boolean s(String str, Long l2, long j2, C6507mO2 c6507mO2) {
        d();
        e();
        AbstractC7506py0.l(c6507mO2);
        AbstractC7506py0.f(str);
        AbstractC7506py0.l(l2);
        byte[] bArrG = c6507mO2.g();
        this.a.w().s().c("Saving complex main event, appId, data size", this.a.D().d(str), Integer.valueOf(bArrG.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l2);
        contentValues.put("children_to_process", Long.valueOf(j2));
        contentValues.put("main_event", bArrG);
        try {
            if (P().insertWithOnConflict("main_event_params", null, contentValues, 5) != -1) {
                return true;
            }
            this.a.w().n().b("Failed to insert complex main event (got -1). appId", C6675mz2.z(str));
            return false;
        } catch (SQLiteException e) {
            this.a.w().n().c("Error storing complex main event. appId", C6675mz2.z(str), e);
            return false;
        }
    }

    public final boolean t(zzac zzacVar) {
        AbstractC7506py0.l(zzacVar);
        d();
        e();
        String str = zzacVar.B;
        AbstractC7506py0.l(str);
        if (X(str, zzacVar.D.C) == null) {
            long jI = I("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{str});
            this.a.z();
            if (jI >= 1000) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("origin", zzacVar.C);
        contentValues.put("name", zzacVar.D.C);
        H(contentValues, "value", AbstractC7506py0.l(zzacVar.D.e()));
        contentValues.put("active", Boolean.valueOf(zzacVar.F));
        contentValues.put("trigger_event_name", zzacVar.G);
        contentValues.put("trigger_timeout", Long.valueOf(zzacVar.I));
        contentValues.put("timed_out_event", this.a.N().e0(zzacVar.H));
        contentValues.put("creation_timestamp", Long.valueOf(zzacVar.E));
        contentValues.put("triggered_event", this.a.N().e0(zzacVar.J));
        contentValues.put("triggered_timestamp", Long.valueOf(zzacVar.D.D));
        contentValues.put("time_to_live", Long.valueOf(zzacVar.K));
        contentValues.put("expired_event", this.a.N().e0(zzacVar.L));
        try {
            if (P().insertWithOnConflict("conditional_properties", null, contentValues, 5) != -1) {
                return true;
            }
            this.a.w().n().b("Failed to insert/update conditional user property (got -1)", C6675mz2.z(str));
            return true;
        } catch (SQLiteException e) {
            this.a.w().n().c("Error storing conditional user property", C6675mz2.z(str), e);
            return true;
        }
    }

    public final boolean u(If3 if3) {
        AbstractC7506py0.l(if3);
        d();
        e();
        if (X(if3.a, if3.c) == null) {
            if (Pf3.Z(if3.c)) {
                if (I("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{if3.a}) >= this.a.z().l(if3.a, AbstractC1311Jr2.I, 25, 100)) {
                    return false;
                }
            } else if (!"_npa".equals(if3.c)) {
                long jI = I("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{if3.a, if3.b});
                this.a.z();
                if (jI >= 25) {
                    return false;
                }
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", if3.a);
        contentValues.put("origin", if3.b);
        contentValues.put("name", if3.c);
        contentValues.put("set_timestamp", Long.valueOf(if3.d));
        H(contentValues, "value", if3.e);
        try {
            if (P().insertWithOnConflict("user_attributes", null, contentValues, 5) != -1) {
                return true;
            }
            this.a.w().n().b("Failed to insert/update user property (got -1). appId", C6675mz2.z(if3.a));
            return true;
        } catch (SQLiteException e) {
            this.a.w().n().c("Error storing user property. appId", C6675mz2.z(if3.a), e);
            return true;
        }
    }
}
