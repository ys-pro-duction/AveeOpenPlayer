package com.daaw;

import android.os.Bundle;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.um1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8845um1 extends AbstractC7835r82 {
    public final C9327wU2 a;
    public final Oa3 b;

    public C8845um1(C9327wU2 c9327wU2) {
        super(null);
        AbstractC7506py0.l(c9327wU2);
        this.a = c9327wU2;
        this.b = c9327wU2.I();
    }

    @Override // com.daaw.Ra3
    public final List a(String str, String str2) {
        return this.b.Z(str, str2);
    }

    @Override // com.daaw.Ra3
    public final Map b(String str, String str2, boolean z) {
        return this.b.a0(str, str2, z);
    }

    @Override // com.daaw.Ra3
    public final void c(Bundle bundle) {
        this.b.D(bundle);
    }

    @Override // com.daaw.Ra3
    public final void d(String str, String str2, Bundle bundle) {
        this.b.n(str, str2, bundle);
    }

    @Override // com.daaw.Ra3
    public final void e(String str, String str2, Bundle bundle) {
        this.a.I().k(str, str2, bundle);
    }

    @Override // com.daaw.Ra3
    public final void m(String str) {
        this.a.y().h(str, this.a.p().b());
    }

    @Override // com.daaw.Ra3
    public final int zza(String str) {
        this.b.Q(str);
        return 25;
    }

    @Override // com.daaw.Ra3
    public final long zzb() {
        return this.a.N().t0();
    }

    @Override // com.daaw.Ra3
    public final String zzh() {
        return this.b.V();
    }

    @Override // com.daaw.Ra3
    public final String zzi() {
        return this.b.W();
    }

    @Override // com.daaw.Ra3
    public final String zzj() {
        return this.b.X();
    }

    @Override // com.daaw.Ra3
    public final String zzk() {
        return this.b.V();
    }

    @Override // com.daaw.Ra3
    public final void zzr(String str) {
        this.a.y().i(str, this.a.p().b());
    }
}
