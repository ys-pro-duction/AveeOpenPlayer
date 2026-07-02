package com.daaw;

import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;

/* JADX INFO: renamed from: com.daaw.Pp2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1926Pp2 implements ZH2 {
    public final C0679Dp2 B;
    public final C1095Hp2 C;

    public C1926Pp2(C0679Dp2 c0679Dp2, C1095Hp2 c1095Hp2) {
        this.B = c0679Dp2;
        this.C = c1095Hp2;
    }

    @Override // com.daaw.ZH2
    public final void d(SH2 sh2, String str) {
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.f6)).booleanValue()) {
            if (SH2.RENDERER == sh2) {
                this.B.g(zzt.zzB().b());
                return;
            }
            if (SH2.PRELOADED_LOADER == sh2 || SH2.SERVER_TRANSACTION == sh2) {
                this.B.h(zzt.zzB().b());
                final C1095Hp2 c1095Hp2 = this.C;
                final long jD = this.B.d();
                c1095Hp2.b.a(new InterfaceC9554xH2() { // from class: com.daaw.Gp2
                    @Override // com.daaw.InterfaceC9554xH2
                    public final Object zza(Object obj) {
                        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                        if (c1095Hp2.a()) {
                            return null;
                        }
                        long j = jD;
                        C5336iD1 c5336iD1U = C5613jD1.U();
                        c5336iD1U.w(j);
                        byte[] bArrH = ((C5613jD1) c5336iD1U.j()).h();
                        AbstractC1822Op2.g(sQLiteDatabase, false, false);
                        AbstractC1822Op2.d(sQLiteDatabase, j, bArrH);
                        return null;
                    }
                });
            }
        }
    }

    @Override // com.daaw.ZH2
    public final void m(SH2 sh2, String str) {
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.f6)).booleanValue() && SH2.RENDERER == sh2 && this.B.c() != 0) {
            this.B.f(zzt.zzB().b() - this.B.c());
        }
    }

    @Override // com.daaw.ZH2
    public final void r(SH2 sh2, String str, Throwable th) {
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.f6)).booleanValue() && SH2.RENDERER == sh2 && this.B.c() != 0) {
            this.B.f(zzt.zzB().b() - this.B.c());
        }
    }

    @Override // com.daaw.ZH2
    public final void l(SH2 sh2, String str) {
    }
}
