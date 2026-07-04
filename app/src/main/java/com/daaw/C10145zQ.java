package com.daaw;

import android.database.sqlite.SQLiteStatement;

/* JADX INFO: renamed from: com.daaw.zQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C10145zQ extends C9866yQ implements NZ0 {
    public final SQLiteStatement C;

    public C10145zQ(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.C = sQLiteStatement;
    }

    @Override // com.daaw.NZ0
    public long d1() {
        return this.C.executeInsert();
    }

    @Override // com.daaw.NZ0
    public int z() {
        return this.C.executeUpdateDelete();
    }
}
