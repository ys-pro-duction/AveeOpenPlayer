package com.daaw;

import java.util.Collection;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: com.daaw.tH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C8428tH implements InterfaceC2968Zk0 {
    public static final C8428tH B = new C8428tH();
    public static final C2352Tm0 C;
    public static final List D;
    public static final List E;
    public static final Set F;
    public static final O90 G;

    static {
        C2352Tm0 c2352Tm0O = C2352Tm0.o(EnumC7592qH.F.c());
        G10.f(c2352Tm0O, "special(...)");
        C = c2352Tm0O;
        D = AbstractC1599Mm.k();
        E = AbstractC1599Mm.k();
        F = AbstractC9867yQ0.d();
        G = AbstractC3192ab0.a(C8149sH.B);
    }

    public static final C2181Rw U() {
        return C2181Rw.h.a();
    }

    @Override // com.daaw.InterfaceC8612tw
    public InterfaceC8612tw b() {
        return null;
    }

    @Override // com.daaw.A7
    public InterfaceC3072a8 getAnnotations() {
        return InterfaceC3072a8.b.b();
    }

    @Override // com.daaw.InterfaceC3809cn0
    public C2352Tm0 getName() {
        return y0();
    }

    @Override // com.daaw.InterfaceC8612tw
    public Object h0(InterfaceC9735xw interfaceC9735xw, Object obj) {
        G10.g(interfaceC9735xw, "visitor");
        return null;
    }

    @Override // com.daaw.InterfaceC2968Zk0
    public boolean j0(InterfaceC2968Zk0 interfaceC2968Zk0) {
        G10.g(interfaceC2968Zk0, "targetModule");
        return false;
    }

    @Override // com.daaw.InterfaceC2968Zk0
    public AbstractC8670u80 p() {
        return (AbstractC8670u80) G.getValue();
    }

    @Override // com.daaw.InterfaceC2968Zk0
    public List q0() {
        return E;
    }

    @Override // com.daaw.InterfaceC2968Zk0
    public InterfaceC5516is0 r0(AP ap) {
        G10.g(ap, "fqName");
        throw new IllegalStateException("Should not be called!");
    }

    @Override // com.daaw.InterfaceC2968Zk0
    public Collection u(AP ap, NQ nq) {
        G10.g(ap, "fqName");
        G10.g(nq, "nameFilter");
        return AbstractC1599Mm.k();
    }

    public C2352Tm0 y0() {
        return C;
    }

    @Override // com.daaw.InterfaceC2968Zk0
    public Object z0(C2448Uk0 c2448Uk0) {
        G10.g(c2448Uk0, "capability");
        return null;
    }

    @Override // com.daaw.InterfaceC8612tw
    public InterfaceC8612tw a() {
        return this;
    }
}
