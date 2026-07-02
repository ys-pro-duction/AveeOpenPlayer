package com.daaw;

import com.daaw.AbstractC8869ur0;

/* JADX INFO: renamed from: com.daaw.lR0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6238lR0 {
    public static final boolean a(C3680cK0 c3680cK0) {
        return AbstractC2791Xs.d(c3680cK0.h()) + AbstractC2791Xs.d(c3680cK0.i()) <= c3680cK0.j() && AbstractC2791Xs.d(c3680cK0.b()) + AbstractC2791Xs.d(c3680cK0.c()) <= c3680cK0.j() && AbstractC2791Xs.e(c3680cK0.h()) + AbstractC2791Xs.e(c3680cK0.b()) <= c3680cK0.d() && AbstractC2791Xs.e(c3680cK0.i()) + AbstractC2791Xs.e(c3680cK0.c()) <= c3680cK0.d();
    }

    public static final boolean b(AbstractC8869ur0 abstractC8869ur0, float f, float f2, InterfaceC6090kt0 interfaceC6090kt0, InterfaceC6090kt0 interfaceC6090kt02) {
        G10.g(abstractC8869ur0, "outline");
        if (abstractC8869ur0 instanceof AbstractC8869ur0.a) {
            return d(((AbstractC8869ur0.a) abstractC8869ur0).a(), f, f2);
        }
        if (abstractC8869ur0 instanceof AbstractC8869ur0.b) {
            return e((AbstractC8869ur0.b) abstractC8869ur0, f, f2, interfaceC6090kt0, interfaceC6090kt02);
        }
        throw new C6902no0();
    }

    public static final boolean c(InterfaceC6090kt0 interfaceC6090kt0, float f, float f2, InterfaceC6090kt0 interfaceC6090kt02, InterfaceC6090kt0 interfaceC6090kt03) {
        C3103aF0 c3103aF0 = new C3103aF0(f - 0.005f, f2 - 0.005f, f + 0.005f, f2 + 0.005f);
        if (interfaceC6090kt02 == null) {
            interfaceC6090kt02 = AbstractC6428m6.a();
        }
        interfaceC6090kt02.h(c3103aF0);
        if (interfaceC6090kt03 == null) {
            interfaceC6090kt03 = AbstractC6428m6.a();
        }
        interfaceC6090kt03.m(interfaceC6090kt0, interfaceC6090kt02, AbstractC9723xt0.a.b());
        boolean zIsEmpty = interfaceC6090kt03.isEmpty();
        interfaceC6090kt03.reset();
        interfaceC6090kt02.reset();
        return !zIsEmpty;
    }

    public static final boolean d(C3103aF0 c3103aF0, float f, float f2) {
        return c3103aF0.f() <= f && f < c3103aF0.g() && c3103aF0.i() <= f2 && f2 < c3103aF0.c();
    }

    public static final boolean e(AbstractC8869ur0.b bVar, float f, float f2, InterfaceC6090kt0 interfaceC6090kt0, InterfaceC6090kt0 interfaceC6090kt02) {
        C3680cK0 c3680cK0A = bVar.a();
        if (f < c3680cK0A.e() || f >= c3680cK0A.f() || f2 < c3680cK0A.g() || f2 >= c3680cK0A.a()) {
            return false;
        }
        if (!a(c3680cK0A)) {
            InterfaceC6090kt0 interfaceC6090kt0A = interfaceC6090kt02 == null ? AbstractC6428m6.a() : interfaceC6090kt02;
            interfaceC6090kt0A.l(c3680cK0A);
            return c(interfaceC6090kt0A, f, f2, interfaceC6090kt0, interfaceC6090kt02);
        }
        float fD = AbstractC2791Xs.d(c3680cK0A.h()) + c3680cK0A.e();
        float fE = AbstractC2791Xs.e(c3680cK0A.h()) + c3680cK0A.g();
        float f3 = c3680cK0A.f() - AbstractC2791Xs.d(c3680cK0A.i());
        float fG = c3680cK0A.g() + AbstractC2791Xs.e(c3680cK0A.i());
        float f4 = c3680cK0A.f() - AbstractC2791Xs.d(c3680cK0A.c());
        float fA = c3680cK0A.a() - AbstractC2791Xs.e(c3680cK0A.c());
        float fA2 = c3680cK0A.a() - AbstractC2791Xs.e(c3680cK0A.b());
        float fE2 = c3680cK0A.e() + AbstractC2791Xs.d(c3680cK0A.b());
        if (f < fD && f2 < fE) {
            return f(f, f2, c3680cK0A.h(), fD, fE);
        }
        if (f < fE2 && f2 > fA2) {
            return f(f, f2, c3680cK0A.b(), fE2, fA2);
        }
        if (f > f3 && f2 < fG) {
            return f(f, f2, c3680cK0A.i(), f3, fG);
        }
        if (f <= f4 || f2 <= fA) {
            return true;
        }
        return f(f, f2, c3680cK0A.c(), f4, fA);
    }

    public static final boolean f(float f, float f2, long j, float f3, float f4) {
        float f5 = f - f3;
        float f6 = f2 - f4;
        float fD = AbstractC2791Xs.d(j);
        float fE = AbstractC2791Xs.e(j);
        return ((f5 * f5) / (fD * fD)) + ((f6 * f6) / (fE * fE)) <= 1.0f;
    }
}
