package com.daaw;

/* JADX INFO: renamed from: com.daaw.Yi0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C2856Yi0 implements LQ {
    public final C3511bj0 B;
    public final TA0 C;
    public final InterfaceC2026Qj0 D;
    public final B7 E;
    public final int F;
    public final OA0 G;

    public C2856Yi0(C3511bj0 c3511bj0, TA0 ta0, InterfaceC2026Qj0 interfaceC2026Qj0, B7 b7, int i, OA0 oa0) {
        this.B = c3511bj0;
        this.C = ta0;
        this.D = interfaceC2026Qj0;
        this.E = b7;
        this.F = i;
        this.G = oa0;
    }

    @Override // com.daaw.LQ
    public Object invoke() {
        return C3511bj0.C(this.B, this.C, this.D, this.E, this.F, this.G);
    }
}
