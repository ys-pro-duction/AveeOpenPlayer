package com.daaw;

/* JADX INFO: renamed from: com.daaw.wS0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C9317wS0 extends AbstractC8071s0 {
    public final A7 a;
    public final boolean b;
    public final C0504Ca0 c;
    public final S7 d;
    public final boolean e;

    public /* synthetic */ C9317wS0(A7 a7, boolean z, C0504Ca0 c0504Ca0, S7 s7, boolean z2, int i, AbstractC2911Yw abstractC2911Yw) {
        this(a7, z, c0504Ca0, s7, (i & 16) != 0 ? false : z2);
    }

    @Override // com.daaw.AbstractC8071s0
    public boolean B(O80 o80) {
        G10.g(o80, "<this>");
        return AbstractC8670u80.e0((I80) o80);
    }

    @Override // com.daaw.AbstractC8071s0
    public boolean C() {
        return this.b;
    }

    @Override // com.daaw.AbstractC8071s0
    public boolean D(O80 o80, O80 o802) {
        G10.g(o80, "<this>");
        G10.g(o802, "other");
        return this.c.a().k().d((I80) o80, (I80) o802);
    }

    @Override // com.daaw.AbstractC8071s0
    public boolean E(InterfaceC3631c81 interfaceC3631c81) {
        G10.g(interfaceC3631c81, "<this>");
        return interfaceC3631c81 instanceof C2720Xa0;
    }

    @Override // com.daaw.AbstractC8071s0
    public boolean F(O80 o80) {
        G10.g(o80, "<this>");
        return ((I80) o80).Q0() instanceof C1193Io0;
    }

    @Override // com.daaw.AbstractC8071s0
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public boolean l(O7 o7, O80 o80) {
        G10.g(o7, "<this>");
        if ((o7 instanceof InterfaceC2186Rx0) && ((InterfaceC2186Rx0) o7).f()) {
            return true;
        }
        if ((o7 instanceof Z90) && !u() && (((Z90) o7).m() || q() == S7.G)) {
            return true;
        }
        return o80 != null && AbstractC8670u80.q0((I80) o80) && m().o(o7) && !this.c.a().q().c();
    }

    @Override // com.daaw.AbstractC8071s0
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public V7 m() {
        return this.c.a().a();
    }

    @Override // com.daaw.AbstractC8071s0
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public I80 v(O80 o80) {
        G10.g(o80, "<this>");
        return L81.a((I80) o80);
    }

    @Override // com.daaw.AbstractC8071s0
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public InterfaceC10073z81 A() {
        return CS0.a;
    }

    @Override // com.daaw.AbstractC8071s0
    public Iterable n(O80 o80) {
        G10.g(o80, "<this>");
        return ((I80) o80).getAnnotations();
    }

    @Override // com.daaw.AbstractC8071s0
    public Iterable p() {
        InterfaceC3072a8 annotations;
        A7 a7 = this.a;
        return (a7 == null || (annotations = a7.getAnnotations()) == null) ? AbstractC1599Mm.k() : annotations;
    }

    @Override // com.daaw.AbstractC8071s0
    public S7 q() {
        return this.d;
    }

    @Override // com.daaw.AbstractC8071s0
    public J30 r() {
        return this.c.b();
    }

    @Override // com.daaw.AbstractC8071s0
    public boolean s() {
        A7 a7 = this.a;
        return (a7 instanceof InterfaceC9918yc1) && ((InterfaceC9918yc1) a7).g0() != null;
    }

    @Override // com.daaw.AbstractC8071s0
    public C3541bp0 t(C3541bp0 c3541bp0, N20 n20) {
        C3541bp0 c3541bp0B;
        if (c3541bp0 != null && (c3541bp0B = C3541bp0.b(c3541bp0, EnumC3262ap0.D, false, 2, null)) != null) {
            return c3541bp0B;
        }
        if (n20 != null) {
            return n20.d();
        }
        return null;
    }

    @Override // com.daaw.AbstractC8071s0
    public boolean u() {
        return this.c.a().q().d();
    }

    @Override // com.daaw.AbstractC8071s0
    public BP x(O80 o80) {
        G10.g(o80, "<this>");
        InterfaceC4923gl interfaceC4923glF = D81.f((I80) o80);
        if (interfaceC4923glF != null) {
            return AbstractC7006oA.m(interfaceC4923glF);
        }
        return null;
    }

    @Override // com.daaw.AbstractC8071s0
    public boolean z() {
        return this.e;
    }

    public C9317wS0(A7 a7, boolean z, C0504Ca0 c0504Ca0, S7 s7, boolean z2) {
        G10.g(c0504Ca0, "containerContext");
        G10.g(s7, "containerApplicabilityType");
        this.a = a7;
        this.b = z;
        this.c = c0504Ca0;
        this.d = s7;
        this.e = z2;
    }
}
