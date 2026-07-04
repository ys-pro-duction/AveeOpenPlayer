package com.daaw;

import com.daaw.C6876nj;

/* JADX INFO: loaded from: classes.dex */
public final class ED {
    public InterfaceC5418iY a;
    public InterfaceC6318lj b;
    public InterfaceC4988gz c;
    public EnumC7560q90 d = EnumC7560q90.Ltr;
    public long e = I00.b.a();
    public final C6876nj f = new C6876nj();

    public final void a(OD od) {
        ND.h(od, C2559Vm.b.a(), 0L, 0L, 0.0f, null, null, C2323Tf.b.a(), 62, null);
    }

    public final void b(long j, InterfaceC4988gz interfaceC4988gz, EnumC7560q90 enumC7560q90, NQ nq) {
        G10.g(interfaceC4988gz, "density");
        G10.g(enumC7560q90, "layoutDirection");
        G10.g(nq, "block");
        this.c = interfaceC4988gz;
        this.d = enumC7560q90;
        InterfaceC5418iY interfaceC5418iYB = this.a;
        InterfaceC6318lj interfaceC6318ljA = this.b;
        if (interfaceC5418iYB == null || interfaceC6318ljA == null || I00.g(j) > interfaceC5418iYB.getWidth() || I00.f(j) > interfaceC5418iYB.getHeight()) {
            interfaceC5418iYB = AbstractC5977kY.b(I00.g(j), I00.f(j), 0, false, null, 28, null);
            interfaceC6318ljA = AbstractC7991rj.a(interfaceC5418iYB);
            this.a = interfaceC5418iYB;
            this.b = interfaceC6318ljA;
        }
        this.e = j;
        C6876nj c6876nj = this.f;
        long jB = J00.b(j);
        C6876nj.a aVarO = c6876nj.o();
        InterfaceC4988gz interfaceC4988gzA = aVarO.a();
        EnumC7560q90 enumC7560q90B = aVarO.b();
        InterfaceC6318lj interfaceC6318ljC = aVarO.c();
        long jD = aVarO.d();
        C6876nj.a aVarO2 = c6876nj.o();
        aVarO2.j(interfaceC4988gz);
        aVarO2.k(enumC7560q90);
        aVarO2.i(interfaceC6318ljA);
        aVarO2.l(jB);
        interfaceC6318ljA.i();
        a(c6876nj);
        nq.invoke(c6876nj);
        interfaceC6318ljA.o();
        C6876nj.a aVarO3 = c6876nj.o();
        aVarO3.j(interfaceC4988gzA);
        aVarO3.k(enumC7560q90B);
        aVarO3.i(interfaceC6318ljC);
        aVarO3.l(jD);
        interfaceC5418iYB.a();
    }

    public final void c(OD od, float f, C2871Ym c2871Ym) {
        G10.g(od, "target");
        InterfaceC5418iY interfaceC5418iY = this.a;
        if (interfaceC5418iY == null) {
            throw new IllegalStateException("drawCachedImage must be invoked first before attempting to draw the result into another destination");
        }
        ND.e(od, interfaceC5418iY, 0L, this.e, 0L, 0L, f, null, c2871Ym, 0, 0, 858, null);
    }
}
