package com.daaw;

import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.internal.ads.zzbvg;

/* JADX INFO: renamed from: com.daaw.oj2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7158oj2 implements S82, J72, U62 {
    public final C0542Cj2 B;
    public final C1590Mj2 C;

    public C7158oj2(C0542Cj2 c0542Cj2, C1590Mj2 c1590Mj2) {
        this.B = c0542Cj2;
        this.C = c1590Mj2;
    }

    @Override // com.daaw.U62
    public final void P(zze zzeVar) {
        this.B.a().put("action", "ftl");
        this.B.a().put("ftl", String.valueOf(zzeVar.zza));
        this.B.a().put("ed", zzeVar.zzc);
        this.C.f(this.B.a());
    }

    @Override // com.daaw.S82
    public final void t0(C9267wF2 c9267wF2) {
        this.B.b(c9267wF2);
    }

    @Override // com.daaw.S82
    public final void v0(zzbvg zzbvgVar) {
        this.B.c(zzbvgVar.B);
    }

    @Override // com.daaw.J72
    public final void zzr() {
        this.B.a().put("action", "loaded");
        this.C.f(this.B.a());
    }
}
