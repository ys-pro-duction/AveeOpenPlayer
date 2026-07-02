package com.daaw;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Parcel;
import com.google.android.gms.measurement.internal.zzac;
import com.google.android.gms.measurement.internal.zzau;
import com.google.android.gms.measurement.internal.zzlk;

/* JADX INFO: renamed from: com.daaw.hv2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5254hv2 extends AD2 {
    public final C0699Du2 c;
    public boolean d;

    public C5254hv2(C9327wU2 c9327wU2) {
        super(c9327wU2);
        Context contextV = this.a.v();
        this.a.z();
        this.c = new C0699Du2(this, contextV, "google_app_measurement_local.db");
    }

    @Override // com.daaw.AD2
    public final boolean j() {
        return false;
    }

    public final SQLiteDatabase k() {
        if (this.d) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.c.getWritableDatabase();
        if (writableDatabase != null) {
            return writableDatabase;
        }
        this.d = true;
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x01f9 A[PHI: r9 r11
  0x01f9: PHI (r9v3 int) = (r9v1 int), (r9v1 int), (r9v4 int) binds: [B:112:0x01e7, B:127:0x0214, B:120:0x01f7] A[DONT_GENERATE, DONT_INLINE]
  0x01f9: PHI (r11v7 android.database.sqlite.SQLiteDatabase) = 
  (r11v5 android.database.sqlite.SQLiteDatabase)
  (r11v6 android.database.sqlite.SQLiteDatabase)
  (r11v8 android.database.sqlite.SQLiteDatabase)
 binds: [B:112:0x01e7, B:127:0x0214, B:120:0x01f7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0222  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List l(int r23) {
        /*
            Method dump skipped, instruction units count: 567
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C5254hv2.l(int):java.util.List");
    }

    public final void m() {
        int iDelete;
        d();
        try {
            SQLiteDatabase sQLiteDatabaseK = k();
            if (sQLiteDatabaseK == null || (iDelete = sQLiteDatabaseK.delete("messages", null, null)) <= 0) {
                return;
            }
            this.a.w().s().b("Reset local analytics data. records", Integer.valueOf(iDelete));
        } catch (SQLiteException e) {
            this.a.w().n().b("Error resetting local analytics data. error", e);
        }
    }

    public final boolean n() {
        return u(3, new byte[0]);
    }

    public final boolean o() {
        Context contextV = this.a.v();
        this.a.z();
        return contextV.getDatabasePath("google_app_measurement_local.db").exists();
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0069 A[PHI: r4
  0x0069: PHI (r4v4 int) = (r4v1 int), (r4v2 int), (r4v1 int) binds: [B:35:0x007c, B:32:0x0067, B:29:0x0060] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean q() {
        /*
            r10 = this;
            java.lang.String r0 = "Error deleting app launch break from local database"
            r10.d()
            boolean r1 = r10.d
            r2 = 0
            if (r1 == 0) goto Lb
            return r2
        Lb:
            boolean r1 = r10.o()
            if (r1 == 0) goto L97
            r1 = 5
            r3 = 0
            r4 = 5
        L14:
            if (r3 >= r1) goto L88
            r5 = 0
            r6 = 1
            android.database.sqlite.SQLiteDatabase r5 = r10.k()     // Catch: java.lang.Throwable -> L21 android.database.sqlite.SQLiteException -> L23 android.database.sqlite.SQLiteFullException -> L25 android.database.sqlite.SQLiteDatabaseLockedException -> L61
            if (r5 != 0) goto L27
            r10.d = r6     // Catch: java.lang.Throwable -> L21 android.database.sqlite.SQLiteException -> L23 android.database.sqlite.SQLiteFullException -> L25 android.database.sqlite.SQLiteDatabaseLockedException -> L61
            return r2
        L21:
            r0 = move-exception
            goto L82
        L23:
            r7 = move-exception
            goto L44
        L25:
            r7 = move-exception
            goto L6d
        L27:
            r5.beginTransaction()     // Catch: java.lang.Throwable -> L21 android.database.sqlite.SQLiteException -> L23 android.database.sqlite.SQLiteFullException -> L25 android.database.sqlite.SQLiteDatabaseLockedException -> L61
            java.lang.String r7 = "messages"
            java.lang.String r8 = "type == ?"
            r9 = 3
            java.lang.String r9 = java.lang.Integer.toString(r9)     // Catch: java.lang.Throwable -> L21 android.database.sqlite.SQLiteException -> L23 android.database.sqlite.SQLiteFullException -> L25 android.database.sqlite.SQLiteDatabaseLockedException -> L61
            java.lang.String[] r9 = new java.lang.String[]{r9}     // Catch: java.lang.Throwable -> L21 android.database.sqlite.SQLiteException -> L23 android.database.sqlite.SQLiteFullException -> L25 android.database.sqlite.SQLiteDatabaseLockedException -> L61
            r5.delete(r7, r8, r9)     // Catch: java.lang.Throwable -> L21 android.database.sqlite.SQLiteException -> L23 android.database.sqlite.SQLiteFullException -> L25 android.database.sqlite.SQLiteDatabaseLockedException -> L61
            r5.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L21 android.database.sqlite.SQLiteException -> L23 android.database.sqlite.SQLiteFullException -> L25 android.database.sqlite.SQLiteDatabaseLockedException -> L61
            r5.endTransaction()     // Catch: java.lang.Throwable -> L21 android.database.sqlite.SQLiteException -> L23 android.database.sqlite.SQLiteFullException -> L25 android.database.sqlite.SQLiteDatabaseLockedException -> L61
            r5.close()
            return r6
        L44:
            if (r5 == 0) goto L4f
            boolean r8 = r5.inTransaction()     // Catch: java.lang.Throwable -> L21
            if (r8 == 0) goto L4f
            r5.endTransaction()     // Catch: java.lang.Throwable -> L21
        L4f:
            com.daaw.wU2 r8 = r10.a     // Catch: java.lang.Throwable -> L21
            com.daaw.mz2 r8 = r8.w()     // Catch: java.lang.Throwable -> L21
            com.daaw.dy2 r8 = r8.n()     // Catch: java.lang.Throwable -> L21
            r8.b(r0, r7)     // Catch: java.lang.Throwable -> L21
            r10.d = r6     // Catch: java.lang.Throwable -> L21
            if (r5 == 0) goto L7f
            goto L69
        L61:
            long r6 = (long) r4     // Catch: java.lang.Throwable -> L21
            android.os.SystemClock.sleep(r6)     // Catch: java.lang.Throwable -> L21
            int r4 = r4 + 20
            if (r5 == 0) goto L7f
        L69:
            r5.close()
            goto L7f
        L6d:
            com.daaw.wU2 r8 = r10.a     // Catch: java.lang.Throwable -> L21
            com.daaw.mz2 r8 = r8.w()     // Catch: java.lang.Throwable -> L21
            com.daaw.dy2 r8 = r8.n()     // Catch: java.lang.Throwable -> L21
            r8.b(r0, r7)     // Catch: java.lang.Throwable -> L21
            r10.d = r6     // Catch: java.lang.Throwable -> L21
            if (r5 == 0) goto L7f
            goto L69
        L7f:
            int r3 = r3 + 1
            goto L14
        L82:
            if (r5 == 0) goto L87
            r5.close()
        L87:
            throw r0
        L88:
            com.daaw.wU2 r0 = r10.a
            com.daaw.mz2 r0 = r0.w()
            com.daaw.dy2 r0 = r0.t()
            java.lang.String r1 = "Error deleting app launch break from local database in reasonable time"
            r0.a(r1)
        L97:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C5254hv2.q():boolean");
    }

    public final boolean r(zzac zzacVar) {
        byte[] bArrE0 = this.a.N().e0(zzacVar);
        if (bArrE0.length <= 131072) {
            return u(2, bArrE0);
        }
        this.a.w().q().a("Conditional user property too long for local database. Sending directly to service");
        return false;
    }

    public final boolean s(zzau zzauVar) {
        Parcel parcelObtain = Parcel.obtain();
        C0926Fz1.a(zzauVar, parcelObtain, 0);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        if (bArrMarshall.length <= 131072) {
            return u(0, bArrMarshall);
        }
        this.a.w().q().a("Event is too long for local database. Sending event directly to service");
        return false;
    }

    public final boolean t(zzlk zzlkVar) {
        Parcel parcelObtain = Parcel.obtain();
        Ff3.a(zzlkVar, parcelObtain, 0);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        if (bArrMarshall.length <= 131072) {
            return u(1, bArrMarshall);
        }
        this.a.w().q().a("User property too long for local database. Sending directly to service");
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0102 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x015f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x015f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x015f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0127 A[PHI: r8
  0x0127: PHI (r8v3 android.database.sqlite.SQLiteDatabase) = (r8v2 android.database.sqlite.SQLiteDatabase), (r8v4 android.database.sqlite.SQLiteDatabase) binds: [B:75:0x0125, B:91:0x015c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x016c  */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r10v4, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r10v6, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v5, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r8v6, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean u(int r18, byte[] r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 386
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C5254hv2.u(int, byte[]):boolean");
    }
}
