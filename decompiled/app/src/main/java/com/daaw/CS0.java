package com.daaw;

import com.daaw.C9510x71;
import com.daaw.InterfaceC9403wl;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class CS0 implements InterfaceC9403wl {
    public static final CS0 a = new CS0();

    @Override // com.daaw.InterfaceC9515x81
    public boolean A(D71 d71) {
        return InterfaceC9403wl.a.P(this, d71);
    }

    @Override // com.daaw.InterfaceC9515x81
    public InterfaceC3159aT0 A0(O80 o80) {
        InterfaceC3159aT0 interfaceC3159aT0A;
        G10.g(o80, "<this>");
        XM xmP = p(o80);
        if (xmP != null && (interfaceC3159aT0A = a(xmP)) != null) {
            return interfaceC3159aT0A;
        }
        InterfaceC3159aT0 interfaceC3159aT0B = b(o80);
        G10.d(interfaceC3159aT0B);
        return interfaceC3159aT0B;
    }

    @Override // com.daaw.InterfaceC9515x81
    public J81 B(InterfaceC3631c81 interfaceC3631c81) {
        return InterfaceC9403wl.a.z(this, interfaceC3631c81);
    }

    @Override // com.daaw.InterfaceC9515x81
    public InterfaceC0964Gj B0(InterfaceC1068Hj interfaceC1068Hj) {
        return InterfaceC9403wl.a.m0(this, interfaceC1068Hj);
    }

    @Override // com.daaw.InterfaceC9515x81
    public boolean C(InterfaceC3159aT0 interfaceC3159aT0) {
        return InterfaceC9403wl.a.S(this, interfaceC3159aT0);
    }

    @Override // com.daaw.InterfaceC9515x81
    public boolean C0(O80 o80) {
        G10.g(o80, "<this>");
        XM xmP = p(o80);
        if (xmP == null) {
            return false;
        }
        x(xmP);
        return false;
    }

    @Override // com.daaw.InterfaceC9515x81
    public boolean D(O80 o80) {
        return InterfaceC9403wl.a.a0(this, o80);
    }

    @Override // com.daaw.InterfaceC9515x81
    public Collection D0(InterfaceC3159aT0 interfaceC3159aT0) {
        return InterfaceC9403wl.a.i0(this, interfaceC3159aT0);
    }

    @Override // com.daaw.InterfaceC9236w81
    public O80 E(O80 o80) {
        InterfaceC3159aT0 interfaceC3159aT0C;
        G10.g(o80, "<this>");
        InterfaceC3159aT0 interfaceC3159aT0B = b(o80);
        return (interfaceC3159aT0B == null || (interfaceC3159aT0C = c(interfaceC3159aT0B, true)) == null) ? o80 : interfaceC3159aT0C;
    }

    @Override // com.daaw.InterfaceC9515x81
    public boolean E0(D71 d71) {
        return InterfaceC9403wl.a.E(this, d71);
    }

    @Override // com.daaw.InterfaceC9515x81
    public InterfaceC7272p71 F(InterfaceC3159aT0 interfaceC3159aT0, int i) {
        G10.g(interfaceC3159aT0, "<this>");
        if (i < 0 || i >= I(interfaceC3159aT0)) {
            return null;
        }
        return p0(interfaceC3159aT0, i);
    }

    @Override // com.daaw.InterfaceC9515x81
    public boolean F0(O80 o80) {
        G10.g(o80, "<this>");
        return A(a0(o80)) && !q(o80);
    }

    @Override // com.daaw.InterfaceC9515x81
    public boolean G(InterfaceC1068Hj interfaceC1068Hj) {
        return InterfaceC9403wl.a.T(this, interfaceC1068Hj);
    }

    @Override // com.daaw.InterfaceC9515x81
    public InterfaceC7272p71 G0(InterfaceC6993o71 interfaceC6993o71, int i) {
        G10.g(interfaceC6993o71, "<this>");
        if (interfaceC6993o71 instanceof InterfaceC3159aT0) {
            return p0((O80) interfaceC6993o71, i);
        }
        if (interfaceC6993o71 instanceof C0928Ga) {
            E e = ((C0928Ga) interfaceC6993o71).get(i);
            G10.f(e, "get(...)");
            return (InterfaceC7272p71) e;
        }
        throw new IllegalStateException(("unknown type argument list type: " + interfaceC6993o71 + ", " + AbstractC5624jG0.b(interfaceC6993o71.getClass())).toString());
    }

    @Override // com.daaw.InterfaceC9515x81
    public InterfaceC3159aT0 H(InterfaceC3159aT0 interfaceC3159aT0, EnumC9951yj enumC9951yj) {
        return InterfaceC9403wl.a.j(this, interfaceC3159aT0, enumC9951yj);
    }

    public C9510x71 H0(boolean z, boolean z2) {
        return InterfaceC9403wl.a.f0(this, z, z2);
    }

    @Override // com.daaw.InterfaceC9515x81
    public int I(O80 o80) {
        return InterfaceC9403wl.a.b(this, o80);
    }

    @Override // com.daaw.InterfaceC9515x81
    public InterfaceC6993o71 J(InterfaceC3159aT0 interfaceC3159aT0) {
        return InterfaceC9403wl.a.c(this, interfaceC3159aT0);
    }

    @Override // com.daaw.InterfaceC9515x81
    public boolean K(O80 o80) {
        return InterfaceC9403wl.a.I(this, o80);
    }

    @Override // com.daaw.InterfaceC9515x81
    public int L(D71 d71) {
        return InterfaceC9403wl.a.h0(this, d71);
    }

    @Override // com.daaw.InterfaceC9236w81
    public boolean M(D71 d71) {
        return InterfaceC9403wl.a.b0(this, d71);
    }

    @Override // com.daaw.InterfaceC9236w81
    public EnumC8067rz0 N(D71 d71) {
        return InterfaceC9403wl.a.r(this, d71);
    }

    @Override // com.daaw.InterfaceC9236w81
    public O80 O(InterfaceC3631c81 interfaceC3631c81) {
        return InterfaceC9403wl.a.t(this, interfaceC3631c81);
    }

    @Override // com.daaw.InterfaceC9515x81
    public int P(InterfaceC6993o71 interfaceC6993o71) {
        G10.g(interfaceC6993o71, "<this>");
        if (interfaceC6993o71 instanceof InterfaceC3159aT0) {
            return I((O80) interfaceC6993o71);
        }
        if (interfaceC6993o71 instanceof C0928Ga) {
            return ((C0928Ga) interfaceC6993o71).size();
        }
        throw new IllegalStateException(("unknown type argument list type: " + interfaceC6993o71 + ", " + AbstractC5624jG0.b(interfaceC6993o71.getClass())).toString());
    }

    @Override // com.daaw.InterfaceC9515x81
    public O80 Q(O80 o80) {
        return InterfaceC9403wl.a.e0(this, o80);
    }

    @Override // com.daaw.InterfaceC9515x81
    public O80 R(InterfaceC1068Hj interfaceC1068Hj) {
        return InterfaceC9403wl.a.d0(this, interfaceC1068Hj);
    }

    @Override // com.daaw.InterfaceC9515x81
    public boolean S(O80 o80) {
        G10.g(o80, "<this>");
        return !G10.c(f(A0(o80)), f(y(o80)));
    }

    @Override // com.daaw.InterfaceC9515x81
    public O80 T(List list) {
        return InterfaceC9403wl.a.D(this, list);
    }

    @Override // com.daaw.InterfaceC9236w81
    public O80 U(O80 o80) {
        return InterfaceC9403wl.a.w(this, o80);
    }

    @Override // com.daaw.InterfaceC9515x81
    public InterfaceC3159aT0 V(InterfaceC3159aT0 interfaceC3159aT0) {
        InterfaceC3159aT0 interfaceC3159aT0O0;
        G10.g(interfaceC3159aT0, "<this>");
        InterfaceC9185vy interfaceC9185vyZ = Z(interfaceC3159aT0);
        return (interfaceC9185vyZ == null || (interfaceC3159aT0O0 = o0(interfaceC9185vyZ)) == null) ? interfaceC3159aT0 : interfaceC3159aT0O0;
    }

    @Override // com.daaw.InterfaceC9515x81
    public boolean W(O80 o80) {
        G10.g(o80, "<this>");
        InterfaceC3159aT0 interfaceC3159aT0B = b(o80);
        return (interfaceC3159aT0B != null ? g(interfaceC3159aT0B) : null) != null;
    }

    @Override // com.daaw.InterfaceC9515x81
    public C9510x71.c X(InterfaceC3159aT0 interfaceC3159aT0) {
        return InterfaceC9403wl.a.k0(this, interfaceC3159aT0);
    }

    @Override // com.daaw.InterfaceC9515x81
    public J81 Y(InterfaceC7272p71 interfaceC7272p71) {
        return InterfaceC9403wl.a.y(this, interfaceC7272p71);
    }

    @Override // com.daaw.InterfaceC9515x81
    public InterfaceC9185vy Z(InterfaceC3159aT0 interfaceC3159aT0) {
        return InterfaceC9403wl.a.e(this, interfaceC3159aT0);
    }

    @Override // com.daaw.InterfaceC9403wl, com.daaw.InterfaceC9515x81
    public InterfaceC3159aT0 a(XM xm) {
        return InterfaceC9403wl.a.c0(this, xm);
    }

    @Override // com.daaw.InterfaceC9515x81
    public D71 a0(O80 o80) {
        G10.g(o80, "<this>");
        InterfaceC3159aT0 interfaceC3159aT0B = b(o80);
        if (interfaceC3159aT0B == null) {
            interfaceC3159aT0B = A0(o80);
        }
        return f(interfaceC3159aT0B);
    }

    @Override // com.daaw.InterfaceC9403wl, com.daaw.InterfaceC9515x81
    public InterfaceC3159aT0 b(O80 o80) {
        return InterfaceC9403wl.a.h(this, o80);
    }

    @Override // com.daaw.InterfaceC9403wl
    public O80 b0(InterfaceC3159aT0 interfaceC3159aT0, InterfaceC3159aT0 interfaceC3159aT02) {
        return InterfaceC9403wl.a.l(this, interfaceC3159aT0, interfaceC3159aT02);
    }

    @Override // com.daaw.InterfaceC9403wl, com.daaw.InterfaceC9515x81
    public InterfaceC3159aT0 c(InterfaceC3159aT0 interfaceC3159aT0, boolean z) {
        return InterfaceC9403wl.a.q0(this, interfaceC3159aT0, z);
    }

    @Override // com.daaw.A81
    public boolean c0(InterfaceC3159aT0 interfaceC3159aT0, InterfaceC3159aT0 interfaceC3159aT02) {
        return InterfaceC9403wl.a.C(this, interfaceC3159aT0, interfaceC3159aT02);
    }

    @Override // com.daaw.InterfaceC9403wl, com.daaw.InterfaceC9515x81
    public boolean d(InterfaceC3159aT0 interfaceC3159aT0) {
        return InterfaceC9403wl.a.V(this, interfaceC3159aT0);
    }

    @Override // com.daaw.InterfaceC9515x81
    public boolean d0(InterfaceC3159aT0 interfaceC3159aT0) {
        return InterfaceC9403wl.a.Y(this, interfaceC3159aT0);
    }

    @Override // com.daaw.InterfaceC9403wl, com.daaw.InterfaceC9515x81
    public InterfaceC3159aT0 e(XM xm) {
        return InterfaceC9403wl.a.o0(this, xm);
    }

    @Override // com.daaw.InterfaceC9236w81
    public EnumC8067rz0 e0(D71 d71) {
        return InterfaceC9403wl.a.s(this, d71);
    }

    @Override // com.daaw.InterfaceC9403wl, com.daaw.InterfaceC9515x81
    public D71 f(InterfaceC3159aT0 interfaceC3159aT0) {
        return InterfaceC9403wl.a.n0(this, interfaceC3159aT0);
    }

    @Override // com.daaw.InterfaceC9515x81
    public boolean f0(O80 o80) {
        G10.g(o80, "<this>");
        return (o80 instanceof InterfaceC3159aT0) && u((InterfaceC3159aT0) o80);
    }

    @Override // com.daaw.InterfaceC9403wl, com.daaw.InterfaceC9515x81
    public InterfaceC1068Hj g(InterfaceC3159aT0 interfaceC3159aT0) {
        return InterfaceC9403wl.a.d(this, interfaceC3159aT0);
    }

    @Override // com.daaw.InterfaceC9515x81
    public boolean g0(D71 d71, D71 d712) {
        return InterfaceC9403wl.a.a(this, d71, d712);
    }

    @Override // com.daaw.InterfaceC9515x81
    public boolean h(O80 o80) {
        G10.g(o80, "<this>");
        InterfaceC3159aT0 interfaceC3159aT0B = b(o80);
        return (interfaceC3159aT0B != null ? Z(interfaceC3159aT0B) : null) != null;
    }

    @Override // com.daaw.InterfaceC9515x81
    public O80 h0(InterfaceC7272p71 interfaceC7272p71) {
        return InterfaceC9403wl.a.u(this, interfaceC7272p71);
    }

    @Override // com.daaw.InterfaceC9515x81
    public Collection i(D71 d71) {
        return InterfaceC9403wl.a.l0(this, d71);
    }

    @Override // com.daaw.InterfaceC9236w81
    public boolean i0(D71 d71) {
        return InterfaceC9403wl.a.J(this, d71);
    }

    @Override // com.daaw.InterfaceC9515x81
    public boolean j(InterfaceC3631c81 interfaceC3631c81, D71 d71) {
        return InterfaceC9403wl.a.B(this, interfaceC3631c81, d71);
    }

    @Override // com.daaw.InterfaceC9515x81
    public boolean j0(O80 o80) {
        return InterfaceC9403wl.a.U(this, o80);
    }

    @Override // com.daaw.InterfaceC9515x81
    public boolean k(D71 d71) {
        return InterfaceC9403wl.a.H(this, d71);
    }

    @Override // com.daaw.InterfaceC9515x81
    public List k0(InterfaceC3631c81 interfaceC3631c81) {
        return InterfaceC9403wl.a.x(this, interfaceC3631c81);
    }

    @Override // com.daaw.InterfaceC9515x81
    public InterfaceC3631c81 l(D71 d71) {
        return InterfaceC9403wl.a.v(this, d71);
    }

    @Override // com.daaw.InterfaceC10073z81
    public boolean l0() {
        return InterfaceC9403wl.a.M(this);
    }

    @Override // com.daaw.InterfaceC9515x81
    public boolean m(InterfaceC3159aT0 interfaceC3159aT0) {
        G10.g(interfaceC3159aT0, "<this>");
        return r(f(interfaceC3159aT0));
    }

    @Override // com.daaw.InterfaceC9515x81
    public List m0(D71 d71) {
        return InterfaceC9403wl.a.q(this, d71);
    }

    @Override // com.daaw.InterfaceC9236w81
    public BP n(D71 d71) {
        return InterfaceC9403wl.a.o(this, d71);
    }

    @Override // com.daaw.InterfaceC9515x81
    public InterfaceC3631c81 n0(D71 d71, int i) {
        return InterfaceC9403wl.a.p(this, d71, i);
    }

    @Override // com.daaw.InterfaceC9236w81
    public boolean o(O80 o80, AP ap) {
        return InterfaceC9403wl.a.A(this, o80, ap);
    }

    @Override // com.daaw.InterfaceC9515x81
    public InterfaceC3159aT0 o0(InterfaceC9185vy interfaceC9185vy) {
        return InterfaceC9403wl.a.g0(this, interfaceC9185vy);
    }

    @Override // com.daaw.InterfaceC9515x81
    public XM p(O80 o80) {
        return InterfaceC9403wl.a.g(this, o80);
    }

    @Override // com.daaw.InterfaceC9515x81
    public InterfaceC7272p71 p0(O80 o80, int i) {
        return InterfaceC9403wl.a.m(this, o80, i);
    }

    @Override // com.daaw.InterfaceC9515x81
    public boolean q(O80 o80) {
        return InterfaceC9403wl.a.Q(this, o80);
    }

    @Override // com.daaw.InterfaceC9515x81
    public boolean q0(O80 o80) {
        return InterfaceC9403wl.a.O(this, o80);
    }

    @Override // com.daaw.InterfaceC9515x81
    public boolean r(D71 d71) {
        return InterfaceC9403wl.a.K(this, d71);
    }

    @Override // com.daaw.InterfaceC9515x81
    public EnumC9951yj r0(InterfaceC1068Hj interfaceC1068Hj) {
        return InterfaceC9403wl.a.k(this, interfaceC1068Hj);
    }

    @Override // com.daaw.InterfaceC9515x81
    public boolean s(D71 d71) {
        return InterfaceC9403wl.a.L(this, d71);
    }

    @Override // com.daaw.InterfaceC9515x81
    public List s0(InterfaceC3159aT0 interfaceC3159aT0, D71 d71) {
        G10.g(interfaceC3159aT0, "<this>");
        G10.g(d71, "constructor");
        return null;
    }

    @Override // com.daaw.InterfaceC9515x81
    public boolean t(D71 d71) {
        return InterfaceC9403wl.a.G(this, d71);
    }

    @Override // com.daaw.InterfaceC9515x81
    public boolean t0(InterfaceC3159aT0 interfaceC3159aT0) {
        return InterfaceC9403wl.a.Z(this, interfaceC3159aT0);
    }

    @Override // com.daaw.InterfaceC9515x81
    public boolean u(InterfaceC3159aT0 interfaceC3159aT0) {
        return InterfaceC9403wl.a.N(this, interfaceC3159aT0);
    }

    @Override // com.daaw.InterfaceC9515x81
    public O80 u0(O80 o80, boolean z) {
        return InterfaceC9403wl.a.p0(this, o80, z);
    }

    @Override // com.daaw.InterfaceC9515x81
    public boolean v(InterfaceC3159aT0 interfaceC3159aT0) {
        G10.g(interfaceC3159aT0, "<this>");
        return v0(f(interfaceC3159aT0));
    }

    @Override // com.daaw.InterfaceC9515x81
    public boolean v0(D71 d71) {
        return InterfaceC9403wl.a.F(this, d71);
    }

    @Override // com.daaw.InterfaceC9515x81
    public InterfaceC7272p71 w(InterfaceC0964Gj interfaceC0964Gj) {
        return InterfaceC9403wl.a.j0(this, interfaceC0964Gj);
    }

    @Override // com.daaw.InterfaceC9515x81
    public List w0(O80 o80) {
        return InterfaceC9403wl.a.n(this, o80);
    }

    @Override // com.daaw.InterfaceC9515x81
    public WE x(XM xm) {
        InterfaceC9403wl.a.f(this, xm);
        return null;
    }

    @Override // com.daaw.InterfaceC9515x81
    public InterfaceC7272p71 x0(O80 o80) {
        return InterfaceC9403wl.a.i(this, o80);
    }

    @Override // com.daaw.InterfaceC9515x81
    public InterfaceC3159aT0 y(O80 o80) {
        InterfaceC3159aT0 interfaceC3159aT0E;
        G10.g(o80, "<this>");
        XM xmP = p(o80);
        if (xmP != null && (interfaceC3159aT0E = e(xmP)) != null) {
            return interfaceC3159aT0E;
        }
        InterfaceC3159aT0 interfaceC3159aT0B = b(o80);
        G10.d(interfaceC3159aT0B);
        return interfaceC3159aT0B;
    }

    @Override // com.daaw.InterfaceC9515x81
    public boolean y0(InterfaceC1068Hj interfaceC1068Hj) {
        return InterfaceC9403wl.a.R(this, interfaceC1068Hj);
    }

    @Override // com.daaw.InterfaceC9515x81
    public boolean z(O80 o80) {
        G10.g(o80, "<this>");
        return u(A0(o80)) != u(y(o80));
    }

    @Override // com.daaw.InterfaceC9515x81
    public boolean z0(InterfaceC7272p71 interfaceC7272p71) {
        return InterfaceC9403wl.a.X(this, interfaceC7272p71);
    }
}
