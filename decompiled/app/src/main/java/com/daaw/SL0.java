package com.daaw;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteProgram;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteStatement;
import android.database.sqlite.SQLiteTransactionListener;
import com.daaw.C0524Cf0;
import com.daaw.SL0;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class SL0 extends AbstractC1940Pt0 {
    public final c c;
    public final C1872Pc0 d;
    public final C9572xM0 e;
    public final BK0 f;
    public final YL0 g;
    public final BL0 h;
    public final SQLiteTransactionListener i;
    public SQLiteDatabase j;
    public boolean k;

    public static class c extends SQLiteOpenHelper {
        public final C1872Pc0 B;
        public boolean C;

        public /* synthetic */ c(Context context, C1872Pc0 c1872Pc0, String str, a aVar) {
            this(context, c1872Pc0, str);
        }

        public final void a(SQLiteDatabase sQLiteDatabase) {
            if (this.C) {
                return;
            }
            onConfigure(sQLiteDatabase);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onConfigure(SQLiteDatabase sQLiteDatabase) {
            this.C = true;
            sQLiteDatabase.rawQuery("PRAGMA locking_mode = EXCLUSIVE", new String[0]).close();
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            a(sQLiteDatabase);
            new C7891rM0(sQLiteDatabase, this.B).R(0);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            a(sQLiteDatabase);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onOpen(SQLiteDatabase sQLiteDatabase) {
            a(sQLiteDatabase);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            a(sQLiteDatabase);
            new C7891rM0(sQLiteDatabase, this.B).R(i);
        }

        public c(Context context, C1872Pc0 c1872Pc0, String str) {
            this(context, c1872Pc0, str, 16);
        }

        public c(Context context, C1872Pc0 c1872Pc0, String str, int i) {
            super(context, str, (SQLiteDatabase.CursorFactory) null, i);
            this.B = c1872Pc0;
        }
    }

    public static class d {
        public final SQLiteDatabase a;
        public final String b;
        public SQLiteDatabase.CursorFactory c;

        public d(SQLiteDatabase sQLiteDatabase, String str) {
            this.a = sQLiteDatabase;
            this.b = str;
        }

        public static /* synthetic */ Cursor a(Object[] objArr, SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            SL0.q(sQLiteQuery, objArr);
            return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }

        public d b(final Object... objArr) {
            this.c = new SQLiteDatabase.CursorFactory() { // from class: com.daaw.TL0
                @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
                public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                    return SL0.d.a(objArr, sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
                }
            };
            return this;
        }

        public int c(InterfaceC8310sr interfaceC8310sr) {
            Cursor cursorG = g();
            try {
                if (!cursorG.moveToFirst()) {
                    cursorG.close();
                    return 0;
                }
                interfaceC8310sr.accept(cursorG);
                cursorG.close();
                return 1;
            } catch (Throwable th) {
                if (cursorG != null) {
                    try {
                        cursorG.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }

        public Object d(InterfaceC4832gR interfaceC4832gR) {
            Cursor cursorG = g();
            try {
                if (!cursorG.moveToFirst()) {
                    cursorG.close();
                    return null;
                }
                Object objApply = interfaceC4832gR.apply(cursorG);
                cursorG.close();
                return objApply;
            } catch (Throwable th) {
                if (cursorG != null) {
                    try {
                        cursorG.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }

        public int e(InterfaceC8310sr interfaceC8310sr) {
            Cursor cursorG = g();
            int i = 0;
            while (cursorG.moveToNext()) {
                try {
                    i++;
                    interfaceC8310sr.accept(cursorG);
                } catch (Throwable th) {
                    if (cursorG != null) {
                        try {
                            cursorG.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            }
            cursorG.close();
            return i;
        }

        public boolean f() {
            Cursor cursorG = g();
            try {
                boolean z = !cursorG.moveToFirst();
                cursorG.close();
                return z;
            } catch (Throwable th) {
                if (cursorG != null) {
                    try {
                        cursorG.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }

        public final Cursor g() {
            SQLiteDatabase.CursorFactory cursorFactory = this.c;
            return cursorFactory != null ? this.a.rawQueryWithFactory(cursorFactory, this.b, null, null) : this.a.rawQuery(this.b, null);
        }
    }

    public SL0(Context context, String str, C3851cw c3851cw, C1872Pc0 c1872Pc0, C0524Cf0.b bVar) {
        this(c1872Pc0, bVar, new c(context, c1872Pc0, r(str, c3851cw), (a) null));
    }

    public static void q(SQLiteProgram sQLiteProgram, Object[] objArr) {
        for (int i = 0; i < objArr.length; i++) {
            Object obj = objArr[i];
            if (obj == null) {
                sQLiteProgram.bindNull(i + 1);
            } else if (obj instanceof String) {
                sQLiteProgram.bindString(i + 1, (String) obj);
            } else if (obj instanceof Integer) {
                sQLiteProgram.bindLong(i + 1, ((Integer) obj).intValue());
            } else if (obj instanceof Long) {
                sQLiteProgram.bindLong(i + 1, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                sQLiteProgram.bindDouble(i + 1, ((Double) obj).doubleValue());
            } else {
                if (!(obj instanceof byte[])) {
                    throw AbstractC6557mb.a("Unknown argument %s of type %s", obj, obj.getClass());
                }
                sQLiteProgram.bindBlob(i + 1, (byte[]) obj);
            }
        }
    }

    public static String r(String str, C3851cw c3851cw) {
        try {
            return "firestore." + URLEncoder.encode(str, "utf-8") + "." + URLEncoder.encode(c3851cw.k(), "utf-8") + "." + URLEncoder.encode(c3851cw.h(), "utf-8");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    public d A(String str) {
        return new d(this.j, str);
    }

    @Override // com.daaw.AbstractC1940Pt0
    public InterfaceC2017Qh a() {
        return this.f;
    }

    @Override // com.daaw.AbstractC1940Pt0
    public VC b(C0722Ea1 c0722Ea1) {
        return new LK0(this, this.d, c0722Ea1);
    }

    @Override // com.daaw.AbstractC1940Pt0
    public InterfaceC7942rZ c(C0722Ea1 c0722Ea1) {
        return new C9568xL0(this, this.d, c0722Ea1);
    }

    @Override // com.daaw.AbstractC1940Pt0
    public InterfaceC0344Am0 d(C0722Ea1 c0722Ea1, InterfaceC7942rZ interfaceC7942rZ) {
        return new LL0(this, this.d, c0722Ea1, interfaceC7942rZ);
    }

    @Override // com.daaw.AbstractC1940Pt0
    public InterfaceC0364Ar0 e() {
        return new PL0(this);
    }

    @Override // com.daaw.AbstractC1940Pt0
    public JG0 g() {
        return this.g;
    }

    @Override // com.daaw.AbstractC1940Pt0
    public boolean i() {
        return this.k;
    }

    @Override // com.daaw.AbstractC1940Pt0
    public Object j(String str, BZ0 bz0) {
        AbstractC2212Sd0.a(AbstractC1940Pt0.a, "Starting transaction: %s", str);
        this.j.beginTransactionWithListener(this.i);
        try {
            Object obj = bz0.get();
            this.j.setTransactionSuccessful();
            return obj;
        } finally {
            this.j.endTransaction();
        }
    }

    @Override // com.daaw.AbstractC1940Pt0
    public void k(String str, Runnable runnable) {
        AbstractC2212Sd0.a(AbstractC1940Pt0.a, "Starting transaction: %s", str);
        this.j.beginTransactionWithListener(this.i);
        try {
            runnable.run();
            this.j.setTransactionSuccessful();
        } finally {
            this.j.endTransaction();
        }
    }

    @Override // com.daaw.AbstractC1940Pt0
    public void l() {
        AbstractC6557mb.d(!this.k, "SQLitePersistence double-started!", new Object[0]);
        this.k = true;
        try {
            this.j = this.c.getWritableDatabase();
            this.e.w();
            this.h.w(this.e.q());
        } catch (SQLiteDatabaseLockedException e) {
            throw new RuntimeException("Failed to gain exclusive lock to the Cloud Firestore client's offline persistence. This generally means you are using Cloud Firestore from multiple processes in your app. Keep in mind that multi-process Android apps execute the code in your Application class in all processes, so you may need to avoid initializing Cloud Firestore in your Application class. If you are intentionally using Cloud Firestore from multiple processes, you can only enable offline persistence (that is, call setPersistenceEnabled(true)) in one of them.", e);
        }
    }

    public int s(SQLiteStatement sQLiteStatement, Object... objArr) {
        sQLiteStatement.clearBindings();
        q(sQLiteStatement, objArr);
        return sQLiteStatement.executeUpdateDelete();
    }

    public void t(String str, Object... objArr) {
        this.j.execSQL(str, objArr);
    }

    public long u() {
        return v() * w();
    }

    public final long v() {
        return ((Long) A("PRAGMA page_count").d(new InterfaceC4832gR() { // from class: com.daaw.QL0
            @Override // com.daaw.InterfaceC4832gR
            public final Object apply(Object obj) {
                return Long.valueOf(((Cursor) obj).getLong(0));
            }
        })).longValue();
    }

    public final long w() {
        return ((Long) A("PRAGMA page_size").d(new InterfaceC4832gR() { // from class: com.daaw.RL0
            @Override // com.daaw.InterfaceC4832gR
            public final Object apply(Object obj) {
                return Long.valueOf(((Cursor) obj).getLong(0));
            }
        })).longValue();
    }

    @Override // com.daaw.AbstractC1940Pt0
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public BL0 f() {
        return this.h;
    }

    @Override // com.daaw.AbstractC1940Pt0
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public C9572xM0 h() {
        return this.e;
    }

    public SQLiteStatement z(String str) {
        return this.j.compileStatement(str);
    }

    public SL0(C1872Pc0 c1872Pc0, C0524Cf0.b bVar, c cVar) {
        this.i = new a();
        this.c = cVar;
        this.d = c1872Pc0;
        this.e = new C9572xM0(this, c1872Pc0);
        this.f = new BK0(this, c1872Pc0);
        this.g = new YL0(this, c1872Pc0);
        this.h = new BL0(this, bVar);
    }

    public static class b {
        public final SL0 a;
        public final String b;
        public final String c;
        public final List d;
        public int e;
        public final Iterator f;

        public b(SL0 sl0, String str, List list, String str2) {
            this.e = 0;
            this.a = sl0;
            this.b = str;
            this.d = Collections.EMPTY_LIST;
            this.c = str2;
            this.f = list.iterator();
        }

        public void a() {
            this.e++;
            Object[] objArrB = b();
            this.a.t(this.b + ((Object) AbstractC6838nb1.u("?", objArrB.length, ", ")) + this.c, objArrB);
        }

        public final Object[] b() {
            ArrayList arrayList = new ArrayList(this.d);
            for (int i = 0; this.f.hasNext() && i < 900 - this.d.size(); i++) {
                arrayList.add(this.f.next());
            }
            return arrayList.toArray();
        }

        public int c() {
            return this.e;
        }

        public boolean d() {
            return this.f.hasNext();
        }

        public d e() {
            this.e++;
            Object[] objArrB = b();
            return this.a.A(this.b + ((Object) AbstractC6838nb1.u("?", objArrB.length, ", ")) + this.c).b(objArrB);
        }

        public b(SL0 sl0, String str, List list, List list2, String str2) {
            this.e = 0;
            this.a = sl0;
            this.b = str;
            this.d = list;
            this.c = str2;
            this.f = list2.iterator();
        }
    }

    public class a implements SQLiteTransactionListener {
        public a() {
        }

        @Override // android.database.sqlite.SQLiteTransactionListener
        public void onBegin() {
            SL0.this.h.d();
        }

        @Override // android.database.sqlite.SQLiteTransactionListener
        public void onCommit() {
            SL0.this.h.b();
        }

        @Override // android.database.sqlite.SQLiteTransactionListener
        public void onRollback() {
        }
    }
}
