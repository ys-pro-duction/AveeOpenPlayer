package com.daaw;

/* JADX INFO: renamed from: com.daaw.zs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC10275zs {
    public static final C0504Ca0 c(C0504Ca0 c0504Ca0, InterfaceC8612tw interfaceC8612tw, H30 h30, int i, O90 o90) {
        return new C0504Ca0(c0504Ca0.a(), h30 != null ? new C2928Za0(c0504Ca0, interfaceC8612tw, h30, i) : c0504Ca0.f(), o90);
    }

    public static final C0504Ca0 d(C0504Ca0 c0504Ca0, InterfaceC4188e81 interfaceC4188e81) {
        G10.g(c0504Ca0, "<this>");
        G10.g(interfaceC4188e81, "typeParameterResolver");
        return new C0504Ca0(c0504Ca0.a(), interfaceC4188e81, c0504Ca0.c());
    }

    public static final C0504Ca0 e(C0504Ca0 c0504Ca0, InterfaceC7723ql interfaceC7723ql, H30 h30, int i) {
        G10.g(c0504Ca0, "<this>");
        G10.g(interfaceC7723ql, "containingDeclaration");
        return c(c0504Ca0, interfaceC7723ql, h30, i, AbstractC3192ab0.b(EnumC7395pb0.D, new C9717xs(c0504Ca0, interfaceC7723ql)));
    }

    public static /* synthetic */ C0504Ca0 f(C0504Ca0 c0504Ca0, InterfaceC7723ql interfaceC7723ql, H30 h30, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            h30 = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return e(c0504Ca0, interfaceC7723ql, h30, i);
    }

    public static final J30 g(C0504Ca0 c0504Ca0, InterfaceC7723ql interfaceC7723ql) {
        G10.g(c0504Ca0, "$this_childForClassOrPackage");
        G10.g(interfaceC7723ql, "$containingDeclaration");
        return j(c0504Ca0, interfaceC7723ql.getAnnotations());
    }

    public static final C0504Ca0 h(C0504Ca0 c0504Ca0, InterfaceC8612tw interfaceC8612tw, H30 h30, int i) {
        G10.g(c0504Ca0, "<this>");
        G10.g(interfaceC8612tw, "containingDeclaration");
        G10.g(h30, "typeParameterOwner");
        return c(c0504Ca0, interfaceC8612tw, h30, i, c0504Ca0.c());
    }

    public static /* synthetic */ C0504Ca0 i(C0504Ca0 c0504Ca0, InterfaceC8612tw interfaceC8612tw, H30 h30, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return h(c0504Ca0, interfaceC8612tw, h30, i);
    }

    public static final J30 j(C0504Ca0 c0504Ca0, InterfaceC3072a8 interfaceC3072a8) {
        G10.g(c0504Ca0, "<this>");
        G10.g(interfaceC3072a8, "additionalAnnotations");
        return c0504Ca0.a().a().d(c0504Ca0.b(), interfaceC3072a8);
    }

    public static final C0504Ca0 k(C0504Ca0 c0504Ca0, InterfaceC3072a8 interfaceC3072a8) {
        G10.g(c0504Ca0, "<this>");
        G10.g(interfaceC3072a8, "additionalAnnotations");
        return interfaceC3072a8.isEmpty() ? c0504Ca0 : new C0504Ca0(c0504Ca0.a(), c0504Ca0.f(), AbstractC3192ab0.b(EnumC7395pb0.D, new C9996ys(c0504Ca0, interfaceC3072a8)));
    }

    public static final J30 l(C0504Ca0 c0504Ca0, InterfaceC3072a8 interfaceC3072a8) {
        G10.g(c0504Ca0, "$this_copyWithNewDefaultTypeQualifiers");
        G10.g(interfaceC3072a8, "$additionalAnnotations");
        return j(c0504Ca0, interfaceC3072a8);
    }

    public static final C0504Ca0 m(C0504Ca0 c0504Ca0, C7251p30 c7251p30) {
        G10.g(c0504Ca0, "<this>");
        G10.g(c7251p30, "components");
        return new C0504Ca0(c7251p30, c0504Ca0.f(), c0504Ca0.c());
    }
}
