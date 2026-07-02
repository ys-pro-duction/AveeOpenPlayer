package com.daaw;

import com.daaw.C5288i30;

/* JADX INFO: renamed from: com.daaw.h30, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC5009h30 {
    public static final AP a;
    public static final AP b;
    public static final AP c;
    public static final AP d;
    public static final String e;
    public static final AP[] f;
    public static final InterfaceC2672Wo0 g;
    public static final C5288i30 h;

    static {
        AP ap = new AP("org.jspecify.nullness");
        a = ap;
        AP ap2 = new AP("org.jspecify.annotations");
        b = ap2;
        AP ap3 = new AP("io.reactivex.rxjava3.annotations");
        c = ap3;
        AP ap4 = new AP("org.checkerframework.checker.nullness.compatqual");
        d = ap4;
        String strB = ap3.b();
        G10.f(strB, "asString(...)");
        e = strB;
        f = new AP[]{new AP(strB + ".Nullable"), new AP(strB + ".NonNull")};
        AP ap5 = new AP("org.jetbrains.annotations");
        C5288i30.a aVar = C5288i30.d;
        C0576Cs0 c0576Cs0A = D61.a(ap5, aVar.a());
        C0576Cs0 c0576Cs0A2 = D61.a(new AP("androidx.annotation"), aVar.a());
        C0576Cs0 c0576Cs0A3 = D61.a(new AP("android.support.annotation"), aVar.a());
        C0576Cs0 c0576Cs0A4 = D61.a(new AP("android.annotation"), aVar.a());
        C0576Cs0 c0576Cs0A5 = D61.a(new AP("com.android.annotations"), aVar.a());
        C0576Cs0 c0576Cs0A6 = D61.a(new AP("org.eclipse.jdt.annotation"), aVar.a());
        C0576Cs0 c0576Cs0A7 = D61.a(new AP("org.checkerframework.checker.nullness.qual"), aVar.a());
        C0576Cs0 c0576Cs0A8 = D61.a(ap4, aVar.a());
        C0576Cs0 c0576Cs0A9 = D61.a(new AP("javax.annotation"), aVar.a());
        C0576Cs0 c0576Cs0A10 = D61.a(new AP("edu.umd.cs.findbugs.annotations"), aVar.a());
        C0576Cs0 c0576Cs0A11 = D61.a(new AP("io.reactivex.annotations"), aVar.a());
        AP ap6 = new AP("androidx.annotation.RecentlyNullable");
        EnumC5076hI0 enumC5076hI0 = EnumC5076hI0.E;
        C0576Cs0 c0576Cs0A12 = D61.a(ap6, new C5288i30(enumC5076hI0, null, null, 4, null));
        C0576Cs0 c0576Cs0A13 = D61.a(new AP("androidx.annotation.RecentlyNonNull"), new C5288i30(enumC5076hI0, null, null, 4, null));
        C0576Cs0 c0576Cs0A14 = D61.a(new AP("lombok"), aVar.a());
        S80 s80 = new S80(2, 1);
        EnumC5076hI0 enumC5076hI02 = EnumC5076hI0.F;
        g = new C2880Yo0(AbstractC1473Lg0.k(c0576Cs0A, c0576Cs0A2, c0576Cs0A3, c0576Cs0A4, c0576Cs0A5, c0576Cs0A6, c0576Cs0A7, c0576Cs0A8, c0576Cs0A9, c0576Cs0A10, c0576Cs0A11, c0576Cs0A12, c0576Cs0A13, c0576Cs0A14, D61.a(ap, new C5288i30(enumC5076hI0, s80, enumC5076hI02)), D61.a(ap2, new C5288i30(enumC5076hI0, new S80(2, 1), enumC5076hI02)), D61.a(ap3, new C5288i30(enumC5076hI0, new S80(1, 8), enumC5076hI02))));
        h = new C5288i30(enumC5076hI0, null, null, 4, null);
    }

    public static final C9773y40 a(S80 s80) {
        G10.g(s80, "configuredKotlinVersion");
        C5288i30 c5288i30 = h;
        EnumC5076hI0 enumC5076hI0C = (c5288i30.d() == null || c5288i30.d().compareTo(s80) > 0) ? c5288i30.c() : c5288i30.b();
        return new C9773y40(enumC5076hI0C, c(enumC5076hI0C), null, 4, null);
    }

    public static /* synthetic */ C9773y40 b(S80 s80, int i, Object obj) {
        if ((i & 1) != 0) {
            s80 = S80.G;
        }
        return a(s80);
    }

    public static final EnumC5076hI0 c(EnumC5076hI0 enumC5076hI0) {
        G10.g(enumC5076hI0, "globalReportLevel");
        if (enumC5076hI0 == EnumC5076hI0.E) {
            return null;
        }
        return enumC5076hI0;
    }

    public static final EnumC5076hI0 d(AP ap) {
        G10.g(ap, "annotationFqName");
        return h(ap, InterfaceC2672Wo0.a.a(), null, 4, null);
    }

    public static final AP e() {
        return b;
    }

    public static final AP[] f() {
        return f;
    }

    public static final EnumC5076hI0 g(AP ap, InterfaceC2672Wo0 interfaceC2672Wo0, S80 s80) {
        G10.g(ap, "annotation");
        G10.g(interfaceC2672Wo0, "configuredReportLevels");
        G10.g(s80, "configuredKotlinVersion");
        EnumC5076hI0 enumC5076hI0 = (EnumC5076hI0) interfaceC2672Wo0.a(ap);
        if (enumC5076hI0 != null) {
            return enumC5076hI0;
        }
        C5288i30 c5288i30 = (C5288i30) g.a(ap);
        return c5288i30 == null ? EnumC5076hI0.D : (c5288i30.d() == null || c5288i30.d().compareTo(s80) > 0) ? c5288i30.c() : c5288i30.b();
    }

    public static /* synthetic */ EnumC5076hI0 h(AP ap, InterfaceC2672Wo0 interfaceC2672Wo0, S80 s80, int i, Object obj) {
        if ((i & 4) != 0) {
            s80 = new S80(1, 7, 20);
        }
        return g(ap, interfaceC2672Wo0, s80);
    }
}
