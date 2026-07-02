package com.daaw;

import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: renamed from: com.daaw.yp2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9984yp2 implements InterfaceC6244lS2 {
    public final /* synthetic */ InterfaceC9554xH2 a;

    public C9984yp2(C10263zp2 c10263zp2, InterfaceC9554xH2 interfaceC9554xH2) {
        this.a = interfaceC9554xH2;
    }

    @Override // com.daaw.InterfaceC6244lS2
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        try {
            this.a.zza((SQLiteDatabase) obj);
        } catch (Exception e) {
            AbstractC4274eT1.zzg("Error executing function on offline signal database: ".concat(String.valueOf(e.getMessage())));
        }
    }

    @Override // com.daaw.InterfaceC6244lS2
    public final void b(Throwable th) {
        AbstractC4274eT1.zzg("Failed to get offline signal database: ".concat(String.valueOf(th.getMessage())));
    }
}
