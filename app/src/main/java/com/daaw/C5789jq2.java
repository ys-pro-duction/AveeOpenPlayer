package com.daaw;

import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: renamed from: com.daaw.jq2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5789jq2 implements InterfaceC6244lS2 {
    public final /* synthetic */ InterfaceC9554xH2 a;

    public C5789jq2(C6077kq2 c6077kq2, InterfaceC9554xH2 interfaceC9554xH2) {
        this.a = interfaceC9554xH2;
    }

    @Override // com.daaw.InterfaceC6244lS2
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        try {
            this.a.zza((SQLiteDatabase) obj);
        } catch (Exception e) {
            AbstractC4274eT1.zzg("Error executing function on offline buffered ping database: ".concat(String.valueOf(e.getMessage())));
        }
    }

    @Override // com.daaw.InterfaceC6244lS2
    public final void b(Throwable th) {
        AbstractC4274eT1.zzg("Failed to get offline buffered ping database: ".concat(String.valueOf(th.getMessage())));
    }
}
