package com.daaw;

import com.daaw.C6607ml;
import com.daaw.YV0;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.v20, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C8926v20 {
    public static final C8926v20 a = new C8926v20();
    public static final C2352Tm0 b;
    public static final C2352Tm0 c;
    public static final C2352Tm0 d;
    public static final Map e;

    static {
        C2352Tm0 c2352Tm0L = C2352Tm0.l("message");
        G10.f(c2352Tm0L, "identifier(...)");
        b = c2352Tm0L;
        C2352Tm0 c2352Tm0L2 = C2352Tm0.l("allowedTargets");
        G10.f(c2352Tm0L2, "identifier(...)");
        c = c2352Tm0L2;
        C2352Tm0 c2352Tm0L3 = C2352Tm0.l("value");
        G10.f(c2352Tm0L3, "identifier(...)");
        d = c2352Tm0L3;
        e = AbstractC1473Lg0.k(D61.a(YV0.a.H, B40.d), D61.a(YV0.a.L, B40.f), D61.a(YV0.a.P, B40.i));
    }

    public static /* synthetic */ O7 f(C8926v20 c8926v20, InterfaceC7525q20 interfaceC7525q20, C0504Ca0 c0504Ca0, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return c8926v20.e(interfaceC7525q20, c0504Ca0, z);
    }

    public final O7 a(AP ap, InterfaceC9205w20 interfaceC9205w20, C0504Ca0 c0504Ca0) {
        InterfaceC7525q20 interfaceC7525q20I;
        G10.g(ap, "kotlinName");
        G10.g(interfaceC9205w20, "annotationOwner");
        G10.g(c0504Ca0, "c");
        if (G10.c(ap, YV0.a.y)) {
            AP ap2 = B40.h;
            G10.f(ap2, "DEPRECATED_ANNOTATION");
            InterfaceC7525q20 interfaceC7525q20I2 = interfaceC9205w20.i(ap2);
            if (interfaceC7525q20I2 != null || interfaceC9205w20.n()) {
                return new P20(interfaceC7525q20I2, c0504Ca0);
            }
        }
        AP ap3 = (AP) e.get(ap);
        if (ap3 == null || (interfaceC7525q20I = interfaceC9205w20.i(ap3)) == null) {
            return null;
        }
        return f(a, interfaceC7525q20I, c0504Ca0, false, 4, null);
    }

    public final C2352Tm0 b() {
        return b;
    }

    public final C2352Tm0 c() {
        return d;
    }

    public final C2352Tm0 d() {
        return c;
    }

    public final O7 e(InterfaceC7525q20 interfaceC7525q20, C0504Ca0 c0504Ca0, boolean z) {
        G10.g(interfaceC7525q20, "annotation");
        G10.g(c0504Ca0, "c");
        C6607ml c6607mlE = interfaceC7525q20.e();
        C6607ml.a aVar = C6607ml.d;
        AP ap = B40.d;
        G10.f(ap, "TARGET_ANNOTATION");
        if (G10.c(c6607mlE, aVar.c(ap))) {
            return new C9210w30(interfaceC7525q20, c0504Ca0);
        }
        AP ap2 = B40.f;
        G10.f(ap2, "RETENTION_ANNOTATION");
        if (G10.c(c6607mlE, aVar.c(ap2))) {
            return new C8087s30(interfaceC7525q20, c0504Ca0);
        }
        AP ap3 = B40.i;
        G10.f(ap3, "DOCUMENTED_ANNOTATION");
        if (G10.c(c6607mlE, aVar.c(ap3))) {
            return new C8640u20(c0504Ca0, interfaceC7525q20, YV0.a.P);
        }
        AP ap4 = B40.h;
        G10.f(ap4, "DEPRECATED_ANNOTATION");
        if (G10.c(c6607mlE, aVar.c(ap4))) {
            return null;
        }
        return new Z90(c0504Ca0, interfaceC7525q20, z);
    }
}
