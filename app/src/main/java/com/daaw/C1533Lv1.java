package com.daaw;

/* JADX INFO: renamed from: com.daaw.Lv1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1533Lv1 implements WB1 {
    public final C3835cs1 a;
    public final C1533Lv1 b = this;
    public final InterfaceC1483Li2 c;
    public final InterfaceC1483Li2 d;
    public final InterfaceC1483Li2 e;
    public final InterfaceC1483Li2 f;
    public final InterfaceC1483Li2 g;

    public /* synthetic */ C1533Lv1(C3835cs1 c3835cs1, JN1 jn1, AbstractC4974gv1 abstractC4974gv1) {
        this.a = c3835cs1;
        InterfaceC1483Li2 interfaceC1483Li2A = C8816ug2.a(new LR1(c3835cs1.c));
        this.c = interfaceC1483Li2A;
        InterfaceC2850Yg2 interfaceC2850Yg2A = C0534Ch2.a(jn1);
        this.d = interfaceC2850Yg2A;
        C2012Qf2 c2012Qf2 = new C2012Qf2();
        this.e = c2012Qf2;
        C9884yU1 c9884yU1 = new C9884yU1(c3835cs1.c, interfaceC1483Li2A, AbstractC2297Sy1.a, AbstractC5324iA1.a, c3835cs1.j, c3835cs1.k, c2012Qf2, c3835cs1.d);
        this.f = c9884yU1;
        DQ1 dq1 = new DQ1(interfaceC1483Li2A, AbstractC2297Sy1.a, c9884yU1);
        this.g = dq1;
        C2012Qf2.a(c2012Qf2, C8816ug2.a(new C3108aG1(c3835cs1.c, c3835cs1.e, interfaceC1483Li2A, c3835cs1.d, interfaceC2850Yg2A, dq1)));
    }

    @Override // com.daaw.WB1
    public final C8987vF1 zza() {
        return (C8987vF1) this.e.zzb();
    }
}
