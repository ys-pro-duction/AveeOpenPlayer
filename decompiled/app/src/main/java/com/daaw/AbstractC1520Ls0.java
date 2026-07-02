package com.daaw;

/* JADX INFO: renamed from: com.daaw.Ls0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1520Ls0 {
    public static final long a = S21.b.a();

    public static final C1417Ks0 a(C1417Ks0 c1417Ks0, EnumC7560q90 enumC7560q90) {
        G10.g(c1417Ks0, "style");
        G10.g(enumC7560q90, "direction");
        J11 j11F = c1417Ks0.f();
        J11 j11G = J11.g(j11F != null ? j11F.m() : J11.b.f());
        T11 t11F = T11.f(P21.d(enumC7560q90, c1417Ks0.g()));
        long jC = T21.e(c1417Ks0.c()) ? a : c1417Ks0.c();
        C4726g21 c4726g21H = c1417Ks0.h();
        if (c4726g21H == null) {
            c4726g21H = C4726g21.c.a();
        }
        c1417Ks0.e();
        return new C1417Ks0(j11G, t11F, jC, c4726g21H, null, c1417Ks0.d(), null);
    }
}
