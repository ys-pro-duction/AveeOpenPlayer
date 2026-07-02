package com.daaw;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;
import com.daaw.KZ0;
import java.io.File;

/* JADX INFO: renamed from: com.daaw.wQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C9308wQ implements KZ0, AutoCloseable {
    public final Context B;
    public final String C;
    public final KZ0.a D;
    public final boolean E;
    public final Object F = new Object();
    public a G;
    public boolean H;

    /* JADX INFO: renamed from: com.daaw.wQ$a */
    public static class a extends SQLiteOpenHelper implements AutoCloseable {
        public final C9029vQ[] B;
        public final KZ0.a C;
        public boolean D;

        /* JADX INFO: renamed from: com.daaw.wQ$a$a, reason: collision with other inner class name */
        public class C0248a implements DatabaseErrorHandler {
            public final /* synthetic */ KZ0.a a;
            public final /* synthetic */ C9029vQ[] b;

            public C0248a(KZ0.a aVar, C9029vQ[] c9029vQArr) {
                this.a = aVar;
                this.b = c9029vQArr;
            }

            @Override // android.database.DatabaseErrorHandler
            public void onCorruption(SQLiteDatabase sQLiteDatabase) {
                this.a.c(a.c(this.b, sQLiteDatabase));
            }
        }

        public a(Context context, String str, C9029vQ[] c9029vQArr, KZ0.a aVar) {
            super(context, str, null, aVar.a, new C0248a(aVar, c9029vQArr));
            this.C = aVar;
            this.B = c9029vQArr;
        }

        public static C9029vQ c(C9029vQ[] c9029vQArr, SQLiteDatabase sQLiteDatabase) {
            C9029vQ c9029vQ = c9029vQArr[0];
            if (c9029vQ == null || !c9029vQ.a(sQLiteDatabase)) {
                c9029vQArr[0] = new C9029vQ(sQLiteDatabase);
            }
            return c9029vQArr[0];
        }

        public C9029vQ a(SQLiteDatabase sQLiteDatabase) {
            return c(this.B, sQLiteDatabase);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
        public synchronized void close() {
            super.close();
            this.B[0] = null;
        }

        public synchronized JZ0 d() {
            this.D = false;
            SQLiteDatabase writableDatabase = super.getWritableDatabase();
            if (!this.D) {
                return a(writableDatabase);
            }
            close();
            return d();
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onConfigure(SQLiteDatabase sQLiteDatabase) {
            this.C.b(a(sQLiteDatabase));
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            this.C.d(a(sQLiteDatabase));
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            this.D = true;
            this.C.e(a(sQLiteDatabase), i, i2);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onOpen(SQLiteDatabase sQLiteDatabase) {
            if (this.D) {
                return;
            }
            this.C.f(a(sQLiteDatabase));
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            this.D = true;
            this.C.g(a(sQLiteDatabase), i, i2);
        }
    }

    public C9308wQ(Context context, String str, KZ0.a aVar, boolean z) {
        this.B = context;
        this.C = str;
        this.D = aVar;
        this.E = z;
    }

    public final a a() {
        a aVar;
        synchronized (this.F) {
            try {
                if (this.G == null) {
                    C9029vQ[] c9029vQArr = new C9029vQ[1];
                    if (Build.VERSION.SDK_INT < 23 || this.C == null || !this.E) {
                        this.G = new a(this.B, this.C, c9029vQArr, this.D);
                    } else {
                        this.G = new a(this.B, new File(this.B.getNoBackupFilesDir(), this.C).getAbsolutePath(), c9029vQArr, this.D);
                    }
                    this.G.setWriteAheadLoggingEnabled(this.H);
                }
                aVar = this.G;
            } catch (Throwable th) {
                throw th;
            }
        }
        return aVar;
    }

    @Override // com.daaw.KZ0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        a().close();
    }

    @Override // com.daaw.KZ0
    public JZ0 e0() {
        return a().d();
    }

    @Override // com.daaw.KZ0
    public String getDatabaseName() {
        return this.C;
    }

    @Override // com.daaw.KZ0
    public void setWriteAheadLoggingEnabled(boolean z) {
        synchronized (this.F) {
            try {
                a aVar = this.G;
                if (aVar != null) {
                    aVar.setWriteAheadLoggingEnabled(z);
                }
                this.H = z;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
