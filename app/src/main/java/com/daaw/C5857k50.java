package com.daaw;

import com.daaw.AbstractC5674jS;

/* JADX INFO: renamed from: com.daaw.k50, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C5857k50 implements WA {
    public final Y40 b;
    public final Y40 c;
    public final C4864gZ d;
    public final boolean e;
    public final VA f;
    public final InterfaceC10072z80 g;
    public final String h;

    public C5857k50(Y40 y40, Y40 y402, FA0 fa0, InterfaceC2664Wm0 interfaceC2664Wm0, C4864gZ c4864gZ, boolean z, VA va, InterfaceC10072z80 interfaceC10072z80) {
        String string;
        G10.g(y40, "className");
        G10.g(fa0, "packageProto");
        G10.g(interfaceC2664Wm0, "nameResolver");
        G10.g(va, "abiStability");
        this.b = y40;
        this.c = y402;
        this.d = c4864gZ;
        this.e = z;
        this.f = va;
        this.g = interfaceC10072z80;
        AbstractC5674jS.f fVar = AbstractC7261p50.m;
        G10.f(fVar, "packageModuleName");
        Integer num = (Integer) SA0.a(fa0, fVar);
        this.h = (num == null || (string = interfaceC2664Wm0.getString(num.intValue())) == null) ? "main" : string;
    }

    @Override // com.daaw.RU0
    public SU0 a() {
        SU0 su0 = SU0.a;
        G10.f(su0, "NO_SOURCE_FILE");
        return su0;
    }

    @Override // com.daaw.WA
    public String c() {
        return "Class '" + d().a().b() + '\'';
    }

    public final C6607ml d() {
        AP apG = e().g();
        G10.f(apG, "getPackageFqName(...)");
        return new C6607ml(apG, h());
    }

    public Y40 e() {
        return this.b;
    }

    public Y40 f() {
        return this.c;
    }

    public final InterfaceC10072z80 g() {
        return this.g;
    }

    public final C2352Tm0 h() {
        String strF = e().f();
        G10.f(strF, "getInternalName(...)");
        C2352Tm0 c2352Tm0L = C2352Tm0.l(BY0.u0(strF, '/', null, 2, null));
        G10.f(c2352Tm0L, "identifier(...)");
        return c2352Tm0L;
    }

    public String toString() {
        return C5857k50.class.getSimpleName() + ": " + e();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C5857k50(InterfaceC10072z80 interfaceC10072z80, FA0 fa0, InterfaceC2664Wm0 interfaceC2664Wm0, C4864gZ c4864gZ, boolean z, VA va) {
        G10.g(interfaceC10072z80, "kotlinClass");
        G10.g(fa0, "packageProto");
        G10.g(interfaceC2664Wm0, "nameResolver");
        G10.g(va, "abiStability");
        Y40 y40B = Y40.b(interfaceC10072z80.e());
        G10.f(y40B, "byClassId(...)");
        String strE = interfaceC10072z80.a().e();
        Y40 y40D = null;
        if (strE != null && strE.length() > 0) {
            y40D = Y40.d(strE);
        }
        this(y40B, y40D, fa0, interfaceC2664Wm0, c4864gZ, z, va, interfaceC10072z80);
    }
}
