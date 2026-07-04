package com.daaw;

import android.app.Application;

/* JADX INFO: renamed from: com.daaw.cs1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3835cs1 extends AbstractC7638qS1 {
    public final C3835cs1 b = this;
    public final InterfaceC1483Li2 c;
    public final InterfaceC1483Li2 d;
    public final InterfaceC1483Li2 e;
    public final InterfaceC1483Li2 f;
    public final InterfaceC1483Li2 g;
    public final InterfaceC1483Li2 h;
    public final InterfaceC1483Li2 i;
    public final InterfaceC1483Li2 j;
    public final InterfaceC1483Li2 k;
    public final InterfaceC1483Li2 l;
    public final InterfaceC1483Li2 m;
    public final InterfaceC1483Li2 n;

    public /* synthetic */ C3835cs1(Application application, AbstractC9156vr1 abstractC9156vr1) {
        InterfaceC2850Yg2 interfaceC2850Yg2A = C0534Ch2.a(application);
        this.c = interfaceC2850Yg2A;
        InterfaceC1483Li2 interfaceC1483Li2A = C8816ug2.a(new C6112ky1(interfaceC2850Yg2A));
        this.d = interfaceC1483Li2A;
        InterfaceC1483Li2 interfaceC1483Li2A2 = C8816ug2.a(AbstractC1302Jp1.a);
        this.e = interfaceC1483Li2A2;
        C1721Nq1 c1721Nq1 = new C1721Nq1(this);
        this.f = c1721Nq1;
        InterfaceC1483Li2 interfaceC1483Li2A3 = C8816ug2.a(new C4539fN1(c1721Nq1, AbstractC5324iA1.a));
        this.g = interfaceC1483Li2A3;
        HC1 hc1 = new HC1(interfaceC2850Yg2A);
        this.h = hc1;
        C7453pm3 c7453pm3 = new C7453pm3(interfaceC2850Yg2A, hc1, interfaceC1483Li2A);
        this.i = c7453pm3;
        InterfaceC1483Li2 interfaceC1483Li2A4 = C8816ug2.a(new C7553q73(AbstractC5324iA1.a));
        this.j = interfaceC1483Li2A4;
        C2809Xw1 c2809Xw1 = new C2809Xw1(interfaceC2850Yg2A, interfaceC1483Li2A, AbstractC5324iA1.a);
        this.k = c2809Xw1;
        C0457Bo1 c0457Bo1 = new C0457Bo1(interfaceC1483Li2A4, c2809Xw1, interfaceC1483Li2A);
        this.l = c0457Bo1;
        Us3 us3 = new Us3(interfaceC2850Yg2A, interfaceC1483Li2A2, AbstractC2297Sy1.a, AbstractC5324iA1.a, interfaceC1483Li2A, interfaceC1483Li2A3, c7453pm3, c0457Bo1, interfaceC1483Li2A4);
        this.m = us3;
        this.n = C8816ug2.a(new C7702qg3(interfaceC1483Li2A, us3, interfaceC1483Li2A3));
    }

    @Override // com.daaw.AbstractC7638qS1
    public final Ve3 b() {
        return (Ve3) this.n.zzb();
    }

    @Override // com.daaw.AbstractC7638qS1
    public final C10131zM1 c() {
        return (C10131zM1) this.g.zzb();
    }
}
