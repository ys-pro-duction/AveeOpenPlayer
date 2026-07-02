package com.daaw;

/* JADX INFO: renamed from: com.daaw.v52, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8943v52 implements InterfaceC8507ta2, J72 {
    public final InterfaceC5485im B;
    public final C9501x52 C;
    public final FF2 D;
    public final String E;

    public C8943v52(InterfaceC5485im interfaceC5485im, C9501x52 c9501x52, FF2 ff2, String str) {
        this.B = interfaceC5485im;
        this.C = c9501x52;
        this.D = ff2;
        this.E = str;
    }

    @Override // com.daaw.InterfaceC8507ta2
    public final void zza() {
        this.C.e(this.E, this.B.b());
    }

    @Override // com.daaw.J72
    public final void zzr() {
        FF2 ff2 = this.D;
        this.C.d(ff2.f, this.E, this.B.b());
    }
}
