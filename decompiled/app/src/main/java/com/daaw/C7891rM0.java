package com.daaw;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.text.TextUtils;
import com.daaw.C3039a11;
import com.daaw.C7435pj0;
import com.daaw.SL0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.rM0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7891rM0 {
    public final SQLiteDatabase a;
    public final C1872Pc0 b;

    public C7891rM0(SQLiteDatabase sQLiteDatabase, C1872Pc0 c1872Pc0) {
        this.a = sQLiteDatabase;
        this.b = c1872Pc0;
    }

    public static /* synthetic */ void d(C7891rM0 c7891rM0, String str, Cursor cursor) {
        c7891rM0.getClass();
        c7891rM0.P(str, cursor.getInt(0));
    }

    public static /* synthetic */ void f(C7891rM0 c7891rM0) {
        c7891rM0.a.execSQL("CREATE TABLE bundles (bundle_id TEXT PRIMARY KEY, create_time_seconds INTEGER, create_time_nanos INTEGER, schema_version INTEGER, total_documents INTEGER, total_bytes INTEGER)");
        c7891rM0.a.execSQL("CREATE TABLE named_queries (name TEXT PRIMARY KEY, read_time_seconds INTEGER, read_time_nanos INTEGER, bundled_query_proto BLOB)");
    }

    public static /* synthetic */ void g(C7891rM0 c7891rM0, Cursor cursor) {
        c7891rM0.getClass();
        int i = cursor.getInt(0);
        try {
            c7891rM0.a.execSQL("UPDATE targets SET canonical_id  = ? WHERE target_id = ?", new Object[]{c7891rM0.b.g(C3039a11.s0(cursor.getBlob(1))).g().c(), Integer.valueOf(i)});
        } catch (P10 unused) {
            throw AbstractC6557mb.a("Failed to decode Query data for target %s", Integer.valueOf(i));
        }
    }

    public static /* synthetic */ void h(C7435pj0.a aVar, SQLiteStatement sQLiteStatement, UI0 ui0) {
        if (aVar.a(ui0)) {
            String strL = ui0.l();
            UI0 ui02 = (UI0) ui0.r();
            sQLiteStatement.clearBindings();
            sQLiteStatement.bindString(1, strL);
            sQLiteStatement.bindString(2, AbstractC9826yG.c(ui02));
            sQLiteStatement.execute();
        }
    }

    public static /* synthetic */ void i(final C7891rM0 c7891rM0, Cursor cursor) {
        c7891rM0.getClass();
        final String string = cursor.getString(0);
        new SL0.d(c7891rM0.a, "SELECT batch_id FROM mutations WHERE uid = ? AND batch_id <= ?").b(string, Long.valueOf(cursor.getLong(1))).e(new InterfaceC8310sr() { // from class: com.daaw.hM0
            @Override // com.daaw.InterfaceC8310sr
            public final void accept(Object obj) {
                C7891rM0.d(this.a, string, (Cursor) obj);
            }
        });
    }

    public static /* synthetic */ void j(C7891rM0 c7891rM0) {
        c7891rM0.a.execSQL("CREATE TABLE targets (target_id INTEGER PRIMARY KEY, canonical_id TEXT, snapshot_version_seconds INTEGER, snapshot_version_nanos INTEGER, resume_token BLOB, last_listen_sequence_number INTEGER,target_proto BLOB)");
        c7891rM0.a.execSQL("CREATE INDEX query_targets ON targets (canonical_id, target_id)");
        c7891rM0.a.execSQL("CREATE TABLE target_globals (highest_target_id INTEGER, highest_listen_sequence_number INTEGER, last_remote_snapshot_version_seconds INTEGER, last_remote_snapshot_version_nanos INTEGER)");
        c7891rM0.a.execSQL("CREATE TABLE target_documents (target_id INTEGER, path TEXT, PRIMARY KEY (target_id, path))");
        c7891rM0.a.execSQL("CREATE INDEX document_targets ON target_documents (path, target_id)");
    }

    public static /* synthetic */ void k(C7891rM0 c7891rM0) {
        c7891rM0.a.execSQL("CREATE TABLE document_overlays (uid TEXT, collection_path TEXT, document_id TEXT, collection_group TEXT, largest_batch_id INTEGER, overlay_mutation BLOB, PRIMARY KEY (uid, collection_path, document_id))");
        c7891rM0.a.execSQL("CREATE INDEX batch_id_overlay ON document_overlays (uid, largest_batch_id)");
        c7891rM0.a.execSQL("CREATE INDEX collection_group_overlay ON document_overlays (uid, collection_group)");
    }

    public static /* synthetic */ void l(boolean[] zArr, SQLiteStatement sQLiteStatement, long j, Cursor cursor) {
        zArr[0] = true;
        sQLiteStatement.clearBindings();
        sQLiteStatement.bindString(1, cursor.getString(0));
        sQLiteStatement.bindLong(2, j);
        AbstractC6557mb.d(sQLiteStatement.executeInsert() != -1, "Failed to insert a sentinel row", new Object[0]);
    }

    public static /* synthetic */ void m(boolean[] zArr, SQLiteStatement sQLiteStatement, Cursor cursor) {
        zArr[0] = true;
        String string = cursor.getString(0);
        UI0 ui0B = AbstractC9826yG.b(string);
        sQLiteStatement.clearBindings();
        sQLiteStatement.bindLong(1, ui0B.p());
        sQLiteStatement.bindString(2, string);
        AbstractC6557mb.d(sQLiteStatement.executeUpdateDelete() != -1, "Failed to update document path", new Object[0]);
    }

    public static /* synthetic */ void n(C7891rM0 c7891rM0) {
        c7891rM0.a.execSQL("CREATE TABLE mutation_queues (uid TEXT PRIMARY KEY, last_acknowledged_batch_id INTEGER, last_stream_token BLOB)");
        c7891rM0.a.execSQL("CREATE TABLE mutations (uid TEXT, batch_id INTEGER, mutations BLOB, PRIMARY KEY (uid, batch_id))");
        c7891rM0.a.execSQL("CREATE TABLE document_mutations (uid TEXT, path TEXT, batch_id INTEGER, PRIMARY KEY (uid, path, batch_id))");
    }

    public static /* synthetic */ void q(C7891rM0 c7891rM0) {
        c7891rM0.a.execSQL("CREATE TABLE index_configuration (index_id INTEGER, collection_group TEXT, index_proto BLOB, PRIMARY KEY (index_id))");
        c7891rM0.a.execSQL("CREATE TABLE index_state (index_id INTEGER, uid TEXT, sequence_number INTEGER, read_time_seconds INTEGER, read_time_nanos INTEGER, document_key TEXT, largest_batch_id INTEGER, PRIMARY KEY (index_id, uid))");
        c7891rM0.a.execSQL("CREATE TABLE index_entries (index_id INTEGER, uid TEXT, array_value BLOB, directional_value BLOB, document_key TEXT, PRIMARY KEY (index_id, uid, array_value, directional_value, document_key))");
        c7891rM0.a.execSQL("CREATE INDEX read_time ON remote_documents(read_time_seconds, read_time_nanos)");
    }

    public static /* synthetic */ void r(C7891rM0 c7891rM0, Cursor cursor) {
        c7891rM0.getClass();
        int i = cursor.getInt(0);
        try {
            c7891rM0.a.execSQL("UPDATE targets SET target_proto = ? WHERE target_id = ?", new Object[]{((C3039a11) ((C3039a11.b) C3039a11.s0(cursor.getBlob(1)).Y()).x().n()).h(), Integer.valueOf(i)});
        } catch (P10 unused) {
            throw AbstractC6557mb.a("Failed to decode Query data for target %s", Integer.valueOf(i));
        }
    }

    public final void A() {
        N(new String[]{"document_overlays"}, new Runnable() { // from class: com.daaw.bM0
            @Override // java.lang.Runnable
            public final void run() {
                C7891rM0.k(this.B);
            }
        });
    }

    public final void B() {
        N(new String[]{"mutation_queues", "mutations", "document_mutations"}, new Runnable() { // from class: com.daaw.cM0
            @Override // java.lang.Runnable
            public final void run() {
                C7891rM0.n(this.B);
            }
        });
    }

    public final void C() {
        N(new String[]{"remote_documents"}, new Runnable() { // from class: com.daaw.nM0
            @Override // java.lang.Runnable
            public final void run() {
                this.B.a.execSQL("CREATE TABLE remote_documents (path TEXT PRIMARY KEY, contents BLOB)");
            }
        });
    }

    public final void D() {
        N(new String[]{"targets", "target_globals", "target_documents"}, new Runnable() { // from class: com.daaw.gM0
            @Override // java.lang.Runnable
            public final void run() {
                C7891rM0.j(this.B);
            }
        });
    }

    public final void E() {
        N(new String[]{"collection_parents"}, new Runnable() { // from class: com.daaw.ZL0
            @Override // java.lang.Runnable
            public final void run() {
                this.B.a.execSQL("CREATE TABLE collection_parents (collection_id TEXT, parent TEXT, PRIMARY KEY(collection_id, parent))");
            }
        });
        final C7435pj0.a aVar = new C7435pj0.a();
        final SQLiteStatement sQLiteStatementCompileStatement = this.a.compileStatement("INSERT OR REPLACE INTO collection_parents (collection_id, parent) VALUES (?, ?)");
        final InterfaceC8310sr interfaceC8310sr = new InterfaceC8310sr() { // from class: com.daaw.iM0
            @Override // com.daaw.InterfaceC8310sr
            public final void accept(Object obj) {
                C7891rM0.h(aVar, sQLiteStatementCompileStatement, (UI0) obj);
            }
        };
        new SL0.d(this.a, "SELECT path FROM remote_documents").e(new InterfaceC8310sr() { // from class: com.daaw.jM0
            @Override // com.daaw.InterfaceC8310sr
            public final void accept(Object obj) {
                interfaceC8310sr.accept((UI0) AbstractC9826yG.b(((Cursor) obj).getString(0)).r());
            }
        });
        new SL0.d(this.a, "SELECT path FROM document_mutations").e(new InterfaceC8310sr() { // from class: com.daaw.kM0
            @Override // com.daaw.InterfaceC8310sr
            public final void accept(Object obj) {
                interfaceC8310sr.accept((UI0) AbstractC9826yG.b(((Cursor) obj).getString(0)).r());
            }
        });
    }

    public final void F() {
        new SL0.d(this.a, "SELECT target_id, target_proto FROM targets").e(new InterfaceC8310sr() { // from class: com.daaw.mM0
            @Override // com.daaw.InterfaceC8310sr
            public final void accept(Object obj) {
                C7891rM0.r(this.a, (Cursor) obj);
            }
        });
    }

    public final void G() {
        if (U("targets")) {
            this.a.execSQL("DROP TABLE targets");
        }
        if (U("target_globals")) {
            this.a.execSQL("DROP TABLE target_globals");
        }
        if (U("target_documents")) {
            this.a.execSQL("DROP TABLE target_documents");
        }
    }

    public final void H() {
        final boolean[] zArr;
        SL0.d dVarB = new SL0.d(this.a, "SELECT path FROM remote_documents WHERE path_length IS NULL LIMIT ?").b(100);
        final SQLiteStatement sQLiteStatementCompileStatement = this.a.compileStatement("UPDATE remote_documents SET path_length = ? WHERE path = ?");
        do {
            zArr = new boolean[]{false};
            dVarB.e(new InterfaceC8310sr() { // from class: com.daaw.pM0
                @Override // com.daaw.InterfaceC8310sr
                public final void accept(Object obj) {
                    C7891rM0.m(zArr, sQLiteStatementCompileStatement, (Cursor) obj);
                }
            });
        } while (zArr[0]);
    }

    public final void I() {
        this.a.execSQL("UPDATE remote_documents SET read_time_seconds = 0, read_time_nanos = 0 WHERE read_time_seconds IS NULL");
    }

    public final void J() {
        final boolean[] zArr;
        Long l = (Long) new SL0.d(this.a, "SELECT highest_listen_sequence_number FROM target_globals LIMIT 1").d(new InterfaceC4832gR() { // from class: com.daaw.dM0
            @Override // com.daaw.InterfaceC4832gR
            public final Object apply(Object obj) {
                return Long.valueOf(((Cursor) obj).getLong(0));
            }
        });
        AbstractC6557mb.d(l != null, "Missing highest sequence number", new Object[0]);
        final long jLongValue = l.longValue();
        final SQLiteStatement sQLiteStatementCompileStatement = this.a.compileStatement("INSERT INTO target_documents (target_id, path, sequence_number) VALUES (0, ?, ?)");
        SL0.d dVarB = new SL0.d(this.a, "SELECT RD.path FROM remote_documents AS RD WHERE NOT EXISTS (SELECT TD.path FROM target_documents AS TD WHERE RD.path = TD.path AND TD.target_id = 0) LIMIT ?").b(100);
        do {
            zArr = new boolean[]{false};
            dVarB.e(new InterfaceC8310sr() { // from class: com.daaw.eM0
                @Override // com.daaw.InterfaceC8310sr
                public final void accept(Object obj) {
                    C7891rM0.l(zArr, sQLiteStatementCompileStatement, jLongValue, (Cursor) obj);
                }
            });
        } while (zArr[0]);
    }

    public final void K() {
        if (DatabaseUtils.queryNumEntries(this.a, "target_globals") == 1) {
            return;
        }
        this.a.execSQL("INSERT INTO target_globals (highest_target_id, highest_listen_sequence_number, last_remote_snapshot_version_seconds, last_remote_snapshot_version_nanos) VALUES (?, ?, ?, ?)", new String[]{"0", "0", "0", "0"});
    }

    public List L(String str) {
        ArrayList arrayList = new ArrayList();
        Cursor cursorRawQuery = null;
        try {
            cursorRawQuery = this.a.rawQuery("PRAGMA table_info(" + str + ")", null);
            int columnIndex = cursorRawQuery.getColumnIndex("name");
            while (cursorRawQuery.moveToNext()) {
                arrayList.add(cursorRawQuery.getString(columnIndex));
            }
            cursorRawQuery.close();
            return arrayList;
        } catch (Throwable th) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th;
        }
    }

    public final boolean M() {
        boolean zT = T("remote_documents", "read_time_seconds");
        boolean zT2 = T("remote_documents", "read_time_nanos");
        AbstractC6557mb.d(zT == zT2, "Table contained just one of read_time_seconds or read_time_nanos", new Object[0]);
        return zT && zT2;
    }

    public final void N(String[] strArr, Runnable runnable) {
        String str = "[" + TextUtils.join(", ", strArr) + "]";
        boolean z = false;
        for (int i = 0; i < strArr.length; i++) {
            String str2 = strArr[i];
            boolean zU = U(str2);
            if (i == 0) {
                z = zU;
            } else if (zU != z) {
                String str3 = "Expected all of " + str + " to either exist or not, but ";
                throw new IllegalStateException(z ? str3 + strArr[0] + " exists and " + str2 + " does not" : str3 + strArr[0] + " does not exist and " + str2 + " does");
            }
        }
        if (!z) {
            runnable.run();
            return;
        }
        AbstractC2212Sd0.a("SQLiteSchema", "Skipping migration because all of " + str + " already exist", new Object[0]);
    }

    public final void O() {
        new SL0.d(this.a, "SELECT uid, last_acknowledged_batch_id FROM mutation_queues").e(new InterfaceC8310sr() { // from class: com.daaw.aM0
            @Override // com.daaw.InterfaceC8310sr
            public final void accept(Object obj) {
                C7891rM0.i(this.a, (Cursor) obj);
            }
        });
    }

    public final void P(String str, int i) {
        SQLiteStatement sQLiteStatementCompileStatement = this.a.compileStatement("DELETE FROM mutations WHERE uid = ? AND batch_id = ?");
        sQLiteStatementCompileStatement.bindString(1, str);
        sQLiteStatementCompileStatement.bindLong(2, i);
        AbstractC6557mb.d(sQLiteStatementCompileStatement.executeUpdateDelete() != 0, "Mutation batch (%s, %d) did not exist", str, Integer.valueOf(i));
        this.a.execSQL("DELETE FROM document_mutations WHERE uid = ? AND batch_id = ?", new Object[]{str, Integer.valueOf(i)});
    }

    public final void Q() {
        new SL0.d(this.a, "SELECT target_id, target_proto FROM targets").e(new InterfaceC8310sr() { // from class: com.daaw.oM0
            @Override // com.daaw.InterfaceC8310sr
            public final void accept(Object obj) {
                C7891rM0.g(this.a, (Cursor) obj);
            }
        });
    }

    public void R(int i) {
        S(i, 16);
    }

    public void S(int i, int i2) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (i < 1 && i2 >= 1) {
            B();
            D();
            C();
        }
        if (i < 3 && i2 >= 3 && i != 0) {
            G();
            D();
        }
        if (i < 4 && i2 >= 4) {
            K();
            w();
        }
        if (i < 5 && i2 >= 5) {
            v();
        }
        if (i < 6 && i2 >= 6) {
            O();
        }
        if (i < 7 && i2 >= 7) {
            J();
        }
        if (i < 8 && i2 >= 8) {
            E();
        }
        if (i < 9 && i2 >= 9) {
            if (M()) {
                F();
            } else {
                u();
            }
        }
        if (i == 9 && i2 >= 10) {
            F();
        }
        if (i < 11 && i2 >= 11) {
            Q();
        }
        if (i < 12 && i2 >= 12) {
            x();
        }
        if (i < 13 && i2 >= 13) {
            s();
            H();
        }
        if (i < 14 && i2 >= 14) {
            A();
            y();
            t(AbstractC1940Pt0.b);
        }
        if (i < 15 && i2 >= 15) {
            I();
        }
        if (i < 16 && i2 >= 16) {
            z();
        }
        AbstractC2212Sd0.a("SQLiteSchema", "Migration from version %s to %s took %s milliseconds", Integer.valueOf(i), Integer.valueOf(i2), Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
    }

    public final boolean T(String str, String str2) {
        return L(str).indexOf(str2) != -1;
    }

    public final boolean U(String str) {
        return !new SL0.d(this.a, "SELECT 1=1 FROM sqlite_master WHERE tbl_name = ?").b(str).f();
    }

    public final void s() {
        if (T("remote_documents", "path_length")) {
            return;
        }
        this.a.execSQL("ALTER TABLE remote_documents ADD COLUMN path_length INTEGER");
    }

    public final void t(String str) {
        this.a.execSQL("INSERT OR IGNORE INTO data_migrations (migration_name) VALUES (?)", new String[]{str});
    }

    public final void u() {
        this.a.execSQL("ALTER TABLE remote_documents ADD COLUMN read_time_seconds INTEGER");
        this.a.execSQL("ALTER TABLE remote_documents ADD COLUMN read_time_nanos INTEGER");
    }

    public final void v() {
        if (T("target_documents", "sequence_number")) {
            return;
        }
        this.a.execSQL("ALTER TABLE target_documents ADD COLUMN sequence_number INTEGER");
    }

    public final void w() {
        if (!T("target_globals", "target_count")) {
            this.a.execSQL("ALTER TABLE target_globals ADD COLUMN target_count INTEGER");
        }
        long jQueryNumEntries = DatabaseUtils.queryNumEntries(this.a, "targets");
        ContentValues contentValues = new ContentValues();
        contentValues.put("target_count", Long.valueOf(jQueryNumEntries));
        this.a.update("target_globals", contentValues, null, null);
    }

    public final void x() {
        N(new String[]{"bundles", "named_queries"}, new Runnable() { // from class: com.daaw.qM0
            @Override // java.lang.Runnable
            public final void run() {
                C7891rM0.f(this.B);
            }
        });
    }

    public final void y() {
        N(new String[]{"data_migrations"}, new Runnable() { // from class: com.daaw.lM0
            @Override // java.lang.Runnable
            public final void run() {
                this.B.a.execSQL("CREATE TABLE data_migrations (migration_name TEXT, PRIMARY KEY (migration_name))");
            }
        });
    }

    public final void z() {
        N(new String[]{"index_configuration", "index_state", "index_entries"}, new Runnable() { // from class: com.daaw.fM0
            @Override // java.lang.Runnable
            public final void run() {
                C7891rM0.q(this.B);
            }
        });
    }
}
