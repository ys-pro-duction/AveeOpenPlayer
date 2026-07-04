package com.daaw;

import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.internal.ads.zzbvg;

/* JADX INFO: renamed from: com.daaw.fp2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4667fp2 implements S82, J72, U62 {
    public final C6204lI2 B;
    public final InterfaceC6483mI2 C;
    public final RS1 D;

    public C4667fp2(C6204lI2 c6204lI2, InterfaceC6483mI2 interfaceC6483mI2, RS1 rs1) {
        this.B = c6204lI2;
        this.C = interfaceC6483mI2;
        this.D = rs1;
    }

    @Override // com.daaw.U62
    public final void P(zze zzeVar) {
        C6204lI2 c6204lI2 = this.B;
        c6204lI2.a("action", "ftl");
        c6204lI2.a("ftl", String.valueOf(zzeVar.zza));
        c6204lI2.a("ed", zzeVar.zzc);
        this.C.a(this.B);
    }

    @Override // com.daaw.S82
    public final void t0(C9267wF2 c9267wF2) {
        this.B.h(c9267wF2, this.D);
    }

    @Override // com.daaw.S82
    public final void v0(zzbvg zzbvgVar) {
        this.B.i(zzbvgVar.B);
    }

    @Override // com.daaw.J72
    public final void zzr() {
        C6204lI2 c6204lI2 = this.B;
        c6204lI2.a("action", "loaded");
        this.C.a(c6204lI2);
    }
}
