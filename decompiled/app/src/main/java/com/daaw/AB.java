package com.daaw;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class AB extends K0 implements InterfaceC3086aB {
    public final LA0 L;
    public final InterfaceC2664Wm0 M;
    public final B81 N;
    public final C10202zd1 O;
    public final WA P;
    public YS0 Q;
    public YS0 R;
    public List S;
    public YS0 T;

    /* JADX WARN: Illegal instructions before constructor call */
    public AB(InterfaceC10174zX0 interfaceC10174zX0, InterfaceC8612tw interfaceC8612tw, InterfaceC3072a8 interfaceC3072a8, C2352Tm0 c2352Tm0, AbstractC8965vA abstractC8965vA, LA0 la0, InterfaceC2664Wm0 interfaceC2664Wm0, B81 b81, C10202zd1 c10202zd1, WA wa) {
        G10.g(interfaceC10174zX0, "storageManager");
        G10.g(interfaceC8612tw, "containingDeclaration");
        G10.g(interfaceC3072a8, "annotations");
        G10.g(c2352Tm0, "name");
        G10.g(abstractC8965vA, "visibility");
        G10.g(la0, "proto");
        G10.g(interfaceC2664Wm0, "nameResolver");
        G10.g(b81, "typeTable");
        G10.g(c10202zd1, "versionRequirementTable");
        RU0 ru0 = RU0.a;
        G10.f(ru0, "NO_SOURCE");
        super(interfaceC10174zX0, interfaceC8612tw, interfaceC3072a8, c2352Tm0, ru0, abstractC8965vA);
        this.L = la0;
        this.M = interfaceC2664Wm0;
        this.N = b81;
        this.O = c10202zd1;
        this.P = wa;
    }

    @Override // com.daaw.InterfaceC3086aB
    public B81 P() {
        return this.N;
    }

    @Override // com.daaw.K0
    public List R0() {
        List list = this.S;
        if (list != null) {
            return list;
        }
        G10.u("typeConstructorParameters");
        return null;
    }

    @Override // com.daaw.InterfaceC5586j71
    public YS0 S() {
        YS0 ys0 = this.R;
        if (ys0 != null) {
            return ys0;
        }
        G10.u("expandedType");
        return null;
    }

    @Override // com.daaw.InterfaceC3086aB
    /* JADX INFO: renamed from: U0, reason: merged with bridge method [inline-methods] */
    public LA0 C() {
        return this.L;
    }

    public C10202zd1 V0() {
        return this.O;
    }

    public final void W0(List list, YS0 ys0, YS0 ys02) {
        G10.g(list, "declaredTypeParameters");
        G10.g(ys0, "underlyingType");
        G10.g(ys02, "expandedType");
        S0(list);
        this.Q = ys0;
        this.R = ys02;
        this.S = AbstractC6161l81.g(this);
        this.T = M0();
    }

    @Override // com.daaw.InterfaceC4297eZ0
    /* JADX INFO: renamed from: X0, reason: merged with bridge method [inline-methods] */
    public InterfaceC5586j71 c(C8957v81 c8957v81) {
        G10.g(c8957v81, "substitutor");
        if (c8957v81.k()) {
            return this;
        }
        InterfaceC10174zX0 interfaceC10174zX0E0 = e0();
        InterfaceC8612tw interfaceC8612twB = b();
        G10.f(interfaceC8612twB, "getContainingDeclaration(...)");
        InterfaceC3072a8 annotations = getAnnotations();
        G10.f(annotations, "<get-annotations>(...)");
        C2352Tm0 name = getName();
        G10.f(name, "getName(...)");
        AB ab = new AB(interfaceC10174zX0E0, interfaceC8612twB, annotations, name, getVisibility(), C(), Y(), P(), V0(), a0());
        List listV = v();
        YS0 ys0D0 = d0();
        EnumC1042Hc1 enumC1042Hc1 = EnumC1042Hc1.F;
        I80 i80N = c8957v81.n(ys0D0, enumC1042Hc1);
        G10.f(i80N, "safeSubstitute(...)");
        YS0 ys0A = AbstractC8671u81.a(i80N);
        I80 i80N2 = c8957v81.n(S(), enumC1042Hc1);
        G10.f(i80N2, "safeSubstitute(...)");
        ab.W0(listV, ys0A, AbstractC8671u81.a(i80N2));
        return ab;
    }

    @Override // com.daaw.InterfaceC3086aB
    public InterfaceC2664Wm0 Y() {
        return this.M;
    }

    @Override // com.daaw.InterfaceC3086aB
    public WA a0() {
        return this.P;
    }

    @Override // com.daaw.InterfaceC5586j71
    public YS0 d0() {
        YS0 ys0 = this.Q;
        if (ys0 != null) {
            return ys0;
        }
        G10.u("underlyingType");
        return null;
    }

    @Override // com.daaw.InterfaceC5586j71
    public InterfaceC4923gl r() {
        if (N80.a(S())) {
            return null;
        }
        InterfaceC10240zl interfaceC10240zlC = S().N0().c();
        if (interfaceC10240zlC instanceof InterfaceC4923gl) {
            return (InterfaceC4923gl) interfaceC10240zlC;
        }
        return null;
    }

    @Override // com.daaw.InterfaceC10240zl
    public YS0 s() {
        YS0 ys0 = this.T;
        if (ys0 != null) {
            return ys0;
        }
        G10.u("defaultTypeImpl");
        return null;
    }
}
