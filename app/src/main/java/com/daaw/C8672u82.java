package com.daaw;

import android.os.Bundle;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.u82, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8672u82 implements Ra3 {
    public final /* synthetic */ C3831cr2 a;

    public C8672u82(C3831cr2 c3831cr2) {
        this.a = c3831cr2;
    }

    @Override // com.daaw.Ra3
    public final List a(String str, String str2) {
        return this.a.A(str, str2);
    }

    @Override // com.daaw.Ra3
    public final Map b(String str, String str2, boolean z) {
        return this.a.B(str, str2, z);
    }

    @Override // com.daaw.Ra3
    public final void c(Bundle bundle) {
        this.a.c(bundle);
    }

    @Override // com.daaw.Ra3
    public final void d(String str, String str2, Bundle bundle) {
        this.a.I(str, str2, bundle);
    }

    @Override // com.daaw.Ra3
    public final void e(String str, String str2, Bundle bundle) {
        this.a.G(str, str2, bundle);
    }

    @Override // com.daaw.Ra3
    public final void m(String str) {
        this.a.F(str);
    }

    @Override // com.daaw.Ra3
    public final int zza(String str) {
        return this.a.n(str);
    }

    @Override // com.daaw.Ra3
    public final long zzb() {
        return this.a.o();
    }

    @Override // com.daaw.Ra3
    public final String zzh() {
        return this.a.w();
    }

    @Override // com.daaw.Ra3
    public final String zzi() {
        return this.a.x();
    }

    @Override // com.daaw.Ra3
    public final String zzj() {
        return this.a.y();
    }

    @Override // com.daaw.Ra3
    public final String zzk() {
        return this.a.z();
    }

    @Override // com.daaw.Ra3
    public final void zzr(String str) {
        this.a.H(str);
    }
}
