package com.daaw;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.os.CancellationSignal;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.vQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C9029vQ implements JZ0, AutoCloseable {
    public static final String[] C = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};
    public static final String[] D = new String[0];
    public final SQLiteDatabase B;

    /* JADX INFO: renamed from: com.daaw.vQ$a */
    public class a implements SQLiteDatabase.CursorFactory {
        public final /* synthetic */ MZ0 a;

        public a(MZ0 mz0) {
            this.a = mz0;
        }

        @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
        public Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            this.a.a(new C9866yQ(sQLiteQuery));
            return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }
    }

    /* JADX INFO: renamed from: com.daaw.vQ$b */
    public class b implements SQLiteDatabase.CursorFactory {
        public final /* synthetic */ MZ0 a;

        public b(MZ0 mz0) {
            this.a = mz0;
        }

        @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
        public Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            this.a.a(new C9866yQ(sQLiteQuery));
            return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }
    }

    public C9029vQ(SQLiteDatabase sQLiteDatabase) {
        this.B = sQLiteDatabase;
    }

    @Override // com.daaw.JZ0
    public NZ0 A(String str) {
        return new C10145zQ(this.B.compileStatement(str));
    }

    @Override // com.daaw.JZ0
    public boolean F0() {
        return this.B.inTransaction();
    }

    @Override // com.daaw.JZ0
    public Cursor H0(MZ0 mz0) {
        return this.B.rawQueryWithFactory(new a(mz0), mz0.c(), D, null);
    }

    @Override // com.daaw.JZ0
    public void T() {
        this.B.setTransactionSuccessful();
    }

    @Override // com.daaw.JZ0
    public void V(String str, Object[] objArr) {
        this.B.execSQL(str, objArr);
    }

    public boolean a(SQLiteDatabase sQLiteDatabase) {
        return this.B == sQLiteDatabase;
    }

    @Override // com.daaw.JZ0
    public Cursor b0(MZ0 mz0, CancellationSignal cancellationSignal) {
        return this.B.rawQueryWithFactory(new b(mz0), mz0.c(), D, null, cancellationSignal);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.B.close();
    }

    @Override // com.daaw.JZ0
    public Cursor h0(String str) {
        return H0(new SS0(str));
    }

    @Override // com.daaw.JZ0
    public String i() {
        return this.B.getPath();
    }

    @Override // com.daaw.JZ0
    public boolean isOpen() {
        return this.B.isOpen();
    }

    @Override // com.daaw.JZ0
    public void l0() {
        this.B.endTransaction();
    }

    @Override // com.daaw.JZ0
    public void m() {
        this.B.beginTransaction();
    }

    @Override // com.daaw.JZ0
    public List r() {
        return this.B.getAttachedDbs();
    }

    @Override // com.daaw.JZ0
    public void v(String str) {
        this.B.execSQL(str);
    }
}
