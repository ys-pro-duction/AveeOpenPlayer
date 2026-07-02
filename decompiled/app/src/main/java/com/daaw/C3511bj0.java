package com.daaw;

import com.daaw.InterfaceC1376Ki;
import com.daaw.InterfaceC1583Mi;
import com.daaw.InterfaceC3072a8;
import com.daaw.SM;
import com.daaw.TA0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.bj0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3511bj0 {
    public final BA a;
    public final Q7 b;

    public C3511bj0(BA ba) {
        G10.g(ba, "c");
        this.a = ba;
        this.b = new Q7(ba.c().q(), ba.c().r());
    }

    public static final List C(C3511bj0 c3511bj0, TA0 ta0, InterfaceC2026Qj0 interfaceC2026Qj0, B7 b7, int i, OA0 oa0) {
        G10.g(c3511bj0, "this$0");
        G10.g(interfaceC2026Qj0, "$callable");
        G10.g(b7, "$kind");
        G10.g(oa0, "$proto");
        return AbstractC2455Um.M0(c3511bj0.a.c().d().d(ta0, interfaceC2026Qj0, b7, i, oa0));
    }

    public static final List k(C3511bj0 c3511bj0, InterfaceC2026Qj0 interfaceC2026Qj0, B7 b7) {
        G10.g(c3511bj0, "this$0");
        G10.g(interfaceC2026Qj0, "$proto");
        G10.g(b7, "$kind");
        TA0 ta0I = c3511bj0.i(c3511bj0.a.e());
        List listM0 = ta0I != null ? AbstractC2455Um.M0(c3511bj0.a.c().d().h(ta0I, interfaceC2026Qj0, b7)) : null;
        return listM0 == null ? AbstractC1599Mm.k() : listM0;
    }

    public static final List n(C3511bj0 c3511bj0, boolean z, HA0 ha0) {
        G10.g(c3511bj0, "this$0");
        G10.g(ha0, "$proto");
        TA0 ta0I = c3511bj0.i(c3511bj0.a.e());
        List listM0 = ta0I != null ? z ? AbstractC2455Um.M0(c3511bj0.a.c().d().i(ta0I, ha0)) : AbstractC2455Um.M0(c3511bj0.a.c().d().c(ta0I, ha0)) : null;
        return listM0 == null ? AbstractC1599Mm.k() : listM0;
    }

    public static final List p(C3511bj0 c3511bj0, InterfaceC2026Qj0 interfaceC2026Qj0, B7 b7) {
        G10.g(c3511bj0, "this$0");
        G10.g(interfaceC2026Qj0, "$proto");
        G10.g(b7, "$kind");
        TA0 ta0I = c3511bj0.i(c3511bj0.a.e());
        List listA = ta0I != null ? c3511bj0.a.c().d().a(ta0I, interfaceC2026Qj0, b7) : null;
        return listA == null ? AbstractC1599Mm.k() : listA;
    }

    public static final InterfaceC4097dp0 v(C3511bj0 c3511bj0, HA0 ha0, C9806yB c9806yB) {
        G10.g(c3511bj0, "this$0");
        G10.g(ha0, "$proto");
        G10.g(c9806yB, "$property");
        return c3511bj0.a.h().a(new C2960Zi0(c3511bj0, ha0, c9806yB));
    }

    public static final AbstractC2887Yq w(C3511bj0 c3511bj0, HA0 ha0, C9806yB c9806yB) {
        G10.g(c3511bj0, "this$0");
        G10.g(ha0, "$proto");
        G10.g(c9806yB, "$property");
        TA0 ta0I = c3511bj0.i(c3511bj0.a.e());
        G10.d(ta0I);
        F7 f7D = c3511bj0.a.c().d();
        I80 returnType = c9806yB.getReturnType();
        G10.f(returnType, "getReturnType(...)");
        return (AbstractC2887Yq) f7D.g(ta0I, ha0, returnType);
    }

    public static final InterfaceC4097dp0 x(C3511bj0 c3511bj0, HA0 ha0, C9806yB c9806yB) {
        G10.g(c3511bj0, "this$0");
        G10.g(ha0, "$proto");
        G10.g(c9806yB, "$property");
        return c3511bj0.a.h().a(new C3232aj0(c3511bj0, ha0, c9806yB));
    }

    public static final AbstractC2887Yq y(C3511bj0 c3511bj0, HA0 ha0, C9806yB c9806yB) {
        G10.g(c3511bj0, "this$0");
        G10.g(ha0, "$proto");
        G10.g(c9806yB, "$property");
        TA0 ta0I = c3511bj0.i(c3511bj0.a.e());
        G10.d(ta0I);
        F7 f7D = c3511bj0.a.c().d();
        I80 returnType = c9806yB.getReturnType();
        G10.f(returnType, "getReturnType(...)");
        return (AbstractC2887Yq) f7D.e(ta0I, ha0, returnType);
    }

    public final RE0 A(KA0 ka0, BA ba, InterfaceC1376Ki interfaceC1376Ki, int i) {
        return AbstractC1444Kz.b(interfaceC1376Ki, ba.i().u(ka0), null, InterfaceC3072a8.b.b(), i);
    }

    public final List B(List list, InterfaceC2026Qj0 interfaceC2026Qj0, B7 b7) {
        InterfaceC8612tw interfaceC8612twE = this.a.e();
        G10.e(interfaceC8612twE, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableDescriptor");
        InterfaceC1376Ki interfaceC1376Ki = (InterfaceC1376Ki) interfaceC8612twE;
        InterfaceC8612tw interfaceC8612twB = interfaceC1376Ki.b();
        G10.f(interfaceC8612twB, "getContainingDeclaration(...)");
        TA0 ta0I = i(interfaceC8612twB);
        List list2 = list;
        ArrayList arrayList = new ArrayList(AbstractC1703Nm.v(list2, 10));
        int i = 0;
        for (Object obj : list2) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC1599Mm.u();
            }
            OA0 oa0 = (OA0) obj;
            int iO = oa0.U() ? oa0.O() : 0;
            InterfaceC3072a8 interfaceC3072a8B = (ta0I == null || !SM.c.d(iO).booleanValue()) ? InterfaceC3072a8.b.b() : new C8854uo0(this.a.h(), new C2856Yi0(this, ta0I, interfaceC2026Qj0, b7, i, oa0));
            C2352Tm0 c2352Tm0B = AbstractC3252an0.b(this.a.g(), oa0.P());
            I80 i80U = this.a.i().u(AbstractC3366bB0.q(oa0, this.a.j()));
            Boolean boolD = SM.H.d(iO);
            G10.f(boolD, "get(...)");
            boolean zBooleanValue = boolD.booleanValue();
            Boolean boolD2 = SM.I.d(iO);
            G10.f(boolD2, "get(...)");
            boolean zBooleanValue2 = boolD2.booleanValue();
            Boolean boolD3 = SM.J.d(iO);
            G10.f(boolD3, "get(...)");
            boolean zBooleanValue3 = boolD3.booleanValue();
            KA0 ka0T = AbstractC3366bB0.t(oa0, this.a.j());
            I80 i80U2 = ka0T != null ? this.a.i().u(ka0T) : null;
            RU0 ru0 = RU0.a;
            G10.f(ru0, "NO_SOURCE");
            InterfaceC1376Ki interfaceC1376Ki2 = interfaceC1376Ki;
            arrayList.add(new C10197zc1(interfaceC1376Ki2, null, i, interfaceC3072a8B, c2352Tm0B, i80U, zBooleanValue, zBooleanValue2, zBooleanValue3, i80U2, ru0));
            interfaceC1376Ki = interfaceC1376Ki2;
            i = i2;
        }
        return AbstractC2455Um.M0(arrayList);
    }

    public final TA0 i(InterfaceC8612tw interfaceC8612tw) {
        if (interfaceC8612tw instanceof InterfaceC2372Tr0) {
            return new TA0.b(((InterfaceC2372Tr0) interfaceC8612tw).d(), this.a.g(), this.a.j(), this.a.d());
        }
        if (interfaceC8612tw instanceof QA) {
            return ((QA) interfaceC8612tw).i1();
        }
        return null;
    }

    public final InterfaceC3072a8 j(InterfaceC2026Qj0 interfaceC2026Qj0, int i, B7 b7) {
        return !SM.c.d(i).booleanValue() ? InterfaceC3072a8.b.b() : new C8854uo0(this.a.h(), new C2544Vi0(this, interfaceC2026Qj0, b7));
    }

    public final RE0 l() {
        InterfaceC8612tw interfaceC8612twE = this.a.e();
        InterfaceC4923gl interfaceC4923gl = interfaceC8612twE instanceof InterfaceC4923gl ? (InterfaceC4923gl) interfaceC8612twE : null;
        if (interfaceC4923gl != null) {
            return interfaceC4923gl.J0();
        }
        return null;
    }

    public final InterfaceC3072a8 m(HA0 ha0, boolean z) {
        return !SM.c.d(ha0.e0()).booleanValue() ? InterfaceC3072a8.b.b() : new C8854uo0(this.a.h(), new C2648Wi0(this, z, ha0));
    }

    public final InterfaceC3072a8 o(InterfaceC2026Qj0 interfaceC2026Qj0, B7 b7) {
        return new DA(this.a.h(), new C2752Xi0(this, interfaceC2026Qj0, b7));
    }

    public final void q(C10085zB c10085zB, RE0 re0, RE0 re02, List list, List list2, List list3, I80 i80, EnumC0336Ak0 enumC0336Ak0, AbstractC8965vA abstractC8965vA, Map map) {
        c10085zB.o1(re0, re02, list, list2, list3, i80, enumC0336Ak0, abstractC8965vA, map);
    }

    public final InterfaceC3241al r(C9524xA0 c9524xA0, boolean z) {
        G10.g(c9524xA0, "proto");
        InterfaceC8612tw interfaceC8612twE = this.a.e();
        G10.e(interfaceC8612twE, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        InterfaceC4923gl interfaceC4923gl = (InterfaceC4923gl) interfaceC8612twE;
        int iM = c9524xA0.M();
        B7 b7 = B7.FUNCTION;
        FA fa = new FA(interfaceC4923gl, null, j(c9524xA0, iM, b7), z, InterfaceC1583Mi.a.DECLARATION, c9524xA0, this.a.g(), this.a.j(), this.a.k(), this.a.d(), null, 1024, null);
        C3511bj0 c3511bj0F = BA.b(this.a, fa, AbstractC1599Mm.k(), null, null, null, null, 60, null).f();
        List listQ = c9524xA0.Q();
        G10.f(listQ, "getValueParameterList(...)");
        fa.q1(c3511bj0F.B(listQ, c9524xA0, b7), XA0.a(WA0.a, (RA0) SM.d.d(c9524xA0.M())));
        fa.g1(interfaceC4923gl.s());
        fa.W0(interfaceC4923gl.J());
        fa.Y0(!SM.o.d(c9524xA0.M()).booleanValue());
        return fa;
    }

    public final IS0 s(CA0 ca0) {
        I80 i80U;
        G10.g(ca0, "proto");
        int iG0 = ca0.w0() ? ca0.g0() : t(ca0.i0());
        B7 b7 = B7.FUNCTION;
        InterfaceC3072a8 interfaceC3072a8J = j(ca0, iG0, b7);
        InterfaceC3072a8 interfaceC3072a8O = AbstractC3366bB0.g(ca0) ? o(ca0, b7) : InterfaceC3072a8.b.b();
        C10085zB c10085zB = new C10085zB(this.a.e(), null, interfaceC3072a8J, AbstractC3252an0.b(this.a.g(), ca0.h0()), XA0.b(WA0.a, (DA0) SM.p.d(iG0)), ca0, this.a.g(), this.a.j(), G10.c(AbstractC8400tA.o(this.a.e()).c(AbstractC3252an0.b(this.a.g(), ca0.h0())), QZ0.a) ? C10202zd1.b.b() : this.a.k(), this.a.d(), null, 1024, null);
        BA ba = this.a;
        List listP0 = ca0.p0();
        G10.f(listP0, "getTypeParameterList(...)");
        BA baB = BA.b(ba, c10085zB, listP0, null, null, null, null, 60, null);
        KA0 ka0K = AbstractC3366bB0.k(ca0, this.a.j());
        RE0 re0I = (ka0K == null || (i80U = baB.i().u(ka0K)) == null) ? null : AbstractC1444Kz.i(c10085zB, i80U, interfaceC3072a8O);
        RE0 re0L = l();
        List listC = AbstractC3366bB0.c(ca0, this.a.j());
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : listC) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC1599Mm.u();
            }
            RE0 re0A = A((KA0) obj, baB, c10085zB, i);
            if (re0A != null) {
                arrayList.add(re0A);
            }
            i = i2;
        }
        List listM = baB.i().m();
        C3511bj0 c3511bj0F = baB.f();
        List listT0 = ca0.t0();
        G10.f(listT0, "getValueParameterList(...)");
        List listB = c3511bj0F.B(listT0, ca0, B7.FUNCTION);
        I80 i80U2 = baB.i().u(AbstractC3366bB0.m(ca0, this.a.j()));
        WA0 wa0 = WA0.a;
        q(c10085zB, re0I, re0L, arrayList, listM, listB, i80U2, wa0.b((EA0) SM.e.d(iG0)), XA0.a(wa0, (RA0) SM.d.d(iG0)), AbstractC1473Lg0.h());
        c10085zB.f1(SM.q.d(iG0).booleanValue());
        c10085zB.c1(SM.r.d(iG0).booleanValue());
        c10085zB.X0(SM.u.d(iG0).booleanValue());
        c10085zB.e1(SM.s.d(iG0).booleanValue());
        c10085zB.i1(SM.t.d(iG0).booleanValue());
        c10085zB.h1(SM.v.d(iG0).booleanValue());
        c10085zB.W0(SM.w.d(iG0).booleanValue());
        c10085zB.Y0(!SM.x.d(iG0).booleanValue());
        C0576Cs0 c0576Cs0A = this.a.c().h().a(ca0, c10085zB, this.a.j(), baB.i());
        if (c0576Cs0A != null) {
            c10085zB.U0((InterfaceC1376Ki.a) c0576Cs0A.c(), c0576Cs0A.d());
        }
        return c10085zB;
    }

    public final int t(int i) {
        return (i & 63) + ((i >> 8) << 6);
    }

    public final InterfaceC4476fA0 u(HA0 ha0) {
        BA ba;
        SM.d dVar;
        SM.d dVar2;
        C5323iA0 c5323iA0D;
        C5323iA0 c5323iA0;
        boolean z;
        C7843rA0 c7843rA0;
        I80 i80U;
        G10.g(ha0, "proto");
        int iE0 = ha0.s0() ? ha0.e0() : t(ha0.h0());
        InterfaceC8612tw interfaceC8612twE = this.a.e();
        InterfaceC3072a8 interfaceC3072a8J = j(ha0, iE0, B7.PROPERTY);
        WA0 wa0 = WA0.a;
        EnumC0336Ak0 enumC0336Ak0B = wa0.b((EA0) SM.e.d(iE0));
        AbstractC8965vA abstractC8965vAA = XA0.a(wa0, (RA0) SM.d.d(iE0));
        Boolean boolD = SM.y.d(iE0);
        G10.f(boolD, "get(...)");
        boolean zBooleanValue = boolD.booleanValue();
        C2352Tm0 c2352Tm0B = AbstractC3252an0.b(this.a.g(), ha0.g0());
        InterfaceC1583Mi.a aVarB = XA0.b(wa0, (DA0) SM.p.d(iE0));
        Boolean boolD2 = SM.C.d(iE0);
        G10.f(boolD2, "get(...)");
        boolean zBooleanValue2 = boolD2.booleanValue();
        Boolean boolD3 = SM.B.d(iE0);
        G10.f(boolD3, "get(...)");
        boolean zBooleanValue3 = boolD3.booleanValue();
        Boolean boolD4 = SM.E.d(iE0);
        G10.f(boolD4, "get(...)");
        boolean zBooleanValue4 = boolD4.booleanValue();
        Boolean boolD5 = SM.F.d(iE0);
        G10.f(boolD5, "get(...)");
        boolean zBooleanValue5 = boolD5.booleanValue();
        Boolean boolD6 = SM.G.d(iE0);
        G10.f(boolD6, "get(...)");
        int i = iE0;
        C9806yB c9806yB = new C9806yB(interfaceC8612twE, null, interfaceC3072a8J, enumC0336Ak0B, abstractC8965vAA, zBooleanValue, c2352Tm0B, aVarB, zBooleanValue2, zBooleanValue3, zBooleanValue4, zBooleanValue5, boolD6.booleanValue(), ha0, this.a.g(), this.a.j(), this.a.k(), this.a.d());
        BA ba2 = this.a;
        List listQ0 = ha0.q0();
        G10.f(listQ0, "getTypeParameterList(...)");
        BA baB = BA.b(ba2, c9806yB, listQ0, null, null, null, null, 60, null);
        Boolean boolD7 = SM.z.d(i);
        G10.f(boolD7, "get(...)");
        boolean zBooleanValue6 = boolD7.booleanValue();
        InterfaceC3072a8 interfaceC3072a8O = (zBooleanValue6 && AbstractC3366bB0.h(ha0)) ? o(ha0, B7.PROPERTY_GETTER) : InterfaceC3072a8.b.b();
        I80 i80U2 = baB.i().u(AbstractC3366bB0.n(ha0, this.a.j()));
        List listM = baB.i().m();
        RE0 re0L = l();
        KA0 ka0L = AbstractC3366bB0.l(ha0, this.a.j());
        RE0 re0I = (ka0L == null || (i80U = baB.i().u(ka0L)) == null) ? null : AbstractC1444Kz.i(c9806yB, i80U, interfaceC3072a8O);
        List listD = AbstractC3366bB0.d(ha0, this.a.j());
        ArrayList arrayList = new ArrayList(AbstractC1703Nm.v(listD, 10));
        int i2 = 0;
        for (Object obj : listD) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                AbstractC1599Mm.u();
            }
            arrayList.add(A((KA0) obj, baB, c9806yB, i2));
            i2 = i3;
        }
        c9806yB.b1(i80U2, listM, re0L, re0I, arrayList);
        Boolean boolD8 = SM.c.d(i);
        G10.f(boolD8, "get(...)");
        boolean zBooleanValue7 = boolD8.booleanValue();
        SM.d dVar3 = SM.d;
        RA0 ra0 = (RA0) dVar3.d(i);
        SM.d dVar4 = SM.e;
        int iB = SM.b(zBooleanValue7, ra0, (EA0) dVar4.d(i), false, false, false);
        if (zBooleanValue6) {
            int iF0 = ha0.t0() ? ha0.f0() : iB;
            Boolean boolD9 = SM.K.d(iF0);
            G10.f(boolD9, "get(...)");
            boolean zBooleanValue8 = boolD9.booleanValue();
            Boolean boolD10 = SM.L.d(iF0);
            G10.f(boolD10, "get(...)");
            boolean zBooleanValue9 = boolD10.booleanValue();
            Boolean boolD11 = SM.M.d(iF0);
            G10.f(boolD11, "get(...)");
            boolean zBooleanValue10 = boolD11.booleanValue();
            InterfaceC3072a8 interfaceC3072a8J2 = j(ha0, iF0, B7.PROPERTY_GETTER);
            if (zBooleanValue8) {
                WA0 wa02 = WA0.a;
                dVar = dVar3;
                ba = baB;
                dVar2 = dVar4;
                c5323iA0D = new C5323iA0(c9806yB, interfaceC3072a8J2, wa02.b((EA0) dVar4.d(iF0)), XA0.a(wa02, (RA0) dVar3.d(iF0)), !zBooleanValue8, zBooleanValue9, zBooleanValue10, c9806yB.i(), null, RU0.a);
            } else {
                ba = baB;
                dVar = dVar3;
                dVar2 = dVar4;
                c5323iA0D = AbstractC1444Kz.d(c9806yB, interfaceC3072a8J2);
                G10.d(c5323iA0D);
            }
            c5323iA0D.P0(c9806yB.getReturnType());
        } else {
            ba = baB;
            dVar = dVar3;
            dVar2 = dVar4;
            c5323iA0D = null;
        }
        if (SM.A.d(i).booleanValue()) {
            if (ha0.A0()) {
                iB = ha0.m0();
            }
            int i4 = iB;
            Boolean boolD12 = SM.K.d(i4);
            G10.f(boolD12, "get(...)");
            boolean zBooleanValue11 = boolD12.booleanValue();
            Boolean boolD13 = SM.L.d(i4);
            G10.f(boolD13, "get(...)");
            boolean zBooleanValue12 = boolD13.booleanValue();
            Boolean boolD14 = SM.M.d(i4);
            G10.f(boolD14, "get(...)");
            boolean zBooleanValue13 = boolD14.booleanValue();
            B7 b7 = B7.PROPERTY_SETTER;
            InterfaceC3072a8 interfaceC3072a8J3 = j(ha0, i4, b7);
            if (zBooleanValue11) {
                WA0 wa03 = WA0.a;
                c5323iA0 = c5323iA0D;
                z = true;
                C7843rA0 c7843rA02 = new C7843rA0(c9806yB, interfaceC3072a8J3, wa03.b((EA0) dVar2.d(i4)), XA0.a(wa03, (RA0) dVar.d(i4)), !zBooleanValue11, zBooleanValue12, zBooleanValue13, c9806yB.i(), null, RU0.a);
                c7843rA0 = c7843rA02;
                c7843rA0.Q0((InterfaceC9918yc1) AbstractC2455Um.C0(BA.b(ba, c7843rA02, AbstractC1599Mm.k(), null, null, null, null, 60, null).f().B(AbstractC1496Lm.e(ha0.n0()), ha0, b7)));
            } else {
                c5323iA0 = c5323iA0D;
                z = true;
                C7843rA0 c7843rA0E = AbstractC1444Kz.e(c9806yB, interfaceC3072a8J3, InterfaceC3072a8.b.b());
                G10.d(c7843rA0E);
                c7843rA0 = c7843rA0E;
            }
        } else {
            c5323iA0 = c5323iA0D;
            z = true;
            c7843rA0 = null;
        }
        if (SM.D.d(i).booleanValue()) {
            c9806yB.L0(new C2336Ti0(this, ha0, c9806yB));
        }
        InterfaceC8612tw interfaceC8612twE2 = this.a.e();
        InterfaceC4923gl interfaceC4923gl = interfaceC8612twE2 instanceof InterfaceC4923gl ? (InterfaceC4923gl) interfaceC8612twE2 : null;
        if ((interfaceC4923gl != null ? interfaceC4923gl.i() : null) == EnumC6886nl.G) {
            c9806yB.L0(new C2440Ui0(this, ha0, c9806yB));
        }
        c9806yB.V0(c5323iA0, c7843rA0, new C3679cK(m(ha0, false), c9806yB), new C3679cK(m(ha0, z), c9806yB));
        return c9806yB;
    }

    public final InterfaceC5586j71 z(LA0 la0) {
        G10.g(la0, "proto");
        InterfaceC3072a8.a aVar = InterfaceC3072a8.b;
        List listU = la0.U();
        G10.f(listU, "getAnnotationList(...)");
        List<C8966vA0> list = listU;
        ArrayList arrayList = new ArrayList(AbstractC1703Nm.v(list, 10));
        for (C8966vA0 c8966vA0 : list) {
            Q7 q7 = this.b;
            G10.d(c8966vA0);
            arrayList.add(q7.a(c8966vA0, this.a.g()));
        }
        AB ab = new AB(this.a.h(), this.a.e(), aVar.a(arrayList), AbstractC3252an0.b(this.a.g(), la0.a0()), XA0.a(WA0.a, (RA0) SM.d.d(la0.Z())), la0, this.a.g(), this.a.j(), this.a.k(), this.a.d());
        BA ba = this.a;
        List listD0 = la0.d0();
        G10.f(listD0, "getTypeParameterList(...)");
        BA baB = BA.b(ba, ab, listD0, null, null, null, null, 60, null);
        ab.W0(baB.i().m(), baB.i().o(AbstractC3366bB0.r(la0, this.a.j()), false), baB.i().o(AbstractC3366bB0.e(la0, this.a.j()), false));
        return ab;
    }
}
