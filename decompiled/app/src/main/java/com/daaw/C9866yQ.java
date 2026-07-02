package com.daaw;

import android.database.sqlite.SQLiteProgram;

/* JADX INFO: renamed from: com.daaw.yQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C9866yQ implements LZ0, AutoCloseable {
    public final SQLiteProgram B;

    public C9866yQ(SQLiteProgram sQLiteProgram) {
        this.B = sQLiteProgram;
    }

    @Override // com.daaw.LZ0
    public void H(int i, double d) {
        this.B.bindDouble(i, d);
    }

    @Override // com.daaw.LZ0
    public void S(int i, long j) {
        this.B.bindLong(i, j);
    }

    @Override // com.daaw.LZ0
    public void Z(int i, byte[] bArr) {
        this.B.bindBlob(i, bArr);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.B.close();
    }

    @Override // com.daaw.LZ0
    public void w(int i, String str) {
        this.B.bindString(i, str);
    }

    @Override // com.daaw.LZ0
    public void z0(int i) {
        this.B.bindNull(i);
    }
}
