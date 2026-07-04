package com.daaw;

import com.daaw.C9510x71;
import com.daaw.YV0;
import java.util.Collection;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.wl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC9403wl extends InterfaceC9236w81, InterfaceC10073z81 {

    /* JADX INFO: renamed from: com.daaw.wl$a */
    public static final class a {

        /* JADX INFO: renamed from: com.daaw.wl$a$a, reason: collision with other inner class name */
        public static final class C0250a extends C9510x71.c.a {
            public final /* synthetic */ InterfaceC9403wl a;
            public final /* synthetic */ C8957v81 b;

            public C0250a(InterfaceC9403wl interfaceC9403wl, C8957v81 c8957v81) {
                this.a = interfaceC9403wl;
                this.b = c8957v81;
            }

            @Override // com.daaw.C9510x71.c
            public InterfaceC3159aT0 a(C9510x71 c9510x71, O80 o80) {
                G10.g(c9510x71, "state");
                G10.g(o80, "type");
                InterfaceC9403wl interfaceC9403wl = this.a;
                C8957v81 c8957v81 = this.b;
                O80 o80A0 = interfaceC9403wl.A0(o80);
                G10.e(o80A0, "null cannot be cast to non-null type org.jetbrains.kotlin.types.KotlinType");
                I80 i80N = c8957v81.n((I80) o80A0, EnumC1042Hc1.F);
                G10.f(i80N, "safeSubstitute(...)");
                InterfaceC3159aT0 interfaceC3159aT0B = interfaceC9403wl.b(i80N);
                G10.d(interfaceC3159aT0B);
                return interfaceC3159aT0B;
            }
        }

        public static boolean A(InterfaceC9403wl interfaceC9403wl, O80 o80, AP ap) {
            G10.g(o80, "$receiver");
            G10.g(ap, "fqName");
            if (o80 instanceof I80) {
                return ((I80) o80).getAnnotations().z(ap);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + o80 + ", " + AbstractC5624jG0.b(o80.getClass())).toString());
        }

        public static boolean B(InterfaceC9403wl interfaceC9403wl, InterfaceC3631c81 interfaceC3631c81, D71 d71) {
            G10.g(interfaceC3631c81, "$receiver");
            if (!(interfaceC3631c81 instanceof Z71)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + interfaceC3631c81 + ", " + AbstractC5624jG0.b(interfaceC3631c81.getClass())).toString());
            }
            Z71 z71 = (Z71) interfaceC3631c81;
            if (d71 == null ? true : d71 instanceof C71) {
                return H81.r(z71, (C71) d71, null, 4, null);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + z71 + ", " + AbstractC5624jG0.b(z71.getClass())).toString());
        }

        public static boolean C(InterfaceC9403wl interfaceC9403wl, InterfaceC3159aT0 interfaceC3159aT0, InterfaceC3159aT0 interfaceC3159aT02) {
            G10.g(interfaceC3159aT0, "a");
            G10.g(interfaceC3159aT02, "b");
            if (!(interfaceC3159aT0 instanceof YS0)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + interfaceC3159aT0 + ", " + AbstractC5624jG0.b(interfaceC3159aT0.getClass())).toString());
            }
            if (interfaceC3159aT02 instanceof YS0) {
                return ((YS0) interfaceC3159aT0).L0() == ((YS0) interfaceC3159aT02).L0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + interfaceC3159aT02 + ", " + AbstractC5624jG0.b(interfaceC3159aT02.getClass())).toString());
        }

        public static O80 D(InterfaceC9403wl interfaceC9403wl, List list) {
            G10.g(list, "types");
            return D10.a(list);
        }

        public static boolean E(InterfaceC9403wl interfaceC9403wl, D71 d71) {
            G10.g(d71, "$receiver");
            if (d71 instanceof C71) {
                return AbstractC8670u80.w0((C71) d71, YV0.a.b);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + d71 + ", " + AbstractC5624jG0.b(d71.getClass())).toString());
        }

        public static boolean F(InterfaceC9403wl interfaceC9403wl, D71 d71) {
            G10.g(d71, "$receiver");
            if (d71 instanceof C71) {
                return ((C71) d71).c() instanceof InterfaceC4923gl;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + d71 + ", " + AbstractC5624jG0.b(d71.getClass())).toString());
        }

        public static boolean G(InterfaceC9403wl interfaceC9403wl, D71 d71) {
            G10.g(d71, "$receiver");
            if (d71 instanceof C71) {
                InterfaceC10240zl interfaceC10240zlC = ((C71) d71).c();
                InterfaceC4923gl interfaceC4923gl = interfaceC10240zlC instanceof InterfaceC4923gl ? (InterfaceC4923gl) interfaceC10240zlC : null;
                return (interfaceC4923gl == null || !AbstractC0440Bk0.a(interfaceC4923gl) || interfaceC4923gl.i() == EnumC6886nl.F || interfaceC4923gl.i() == EnumC6886nl.G) ? false : true;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + d71 + ", " + AbstractC5624jG0.b(d71.getClass())).toString());
        }

        public static boolean H(InterfaceC9403wl interfaceC9403wl, D71 d71) {
            G10.g(d71, "$receiver");
            if (d71 instanceof C71) {
                return ((C71) d71).d();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + d71 + ", " + AbstractC5624jG0.b(d71.getClass())).toString());
        }

        public static boolean I(InterfaceC9403wl interfaceC9403wl, O80 o80) {
            G10.g(o80, "$receiver");
            if (o80 instanceof I80) {
                return N80.a((I80) o80);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + o80 + ", " + AbstractC5624jG0.b(o80.getClass())).toString());
        }

        public static boolean J(InterfaceC9403wl interfaceC9403wl, D71 d71) {
            G10.g(d71, "$receiver");
            if (d71 instanceof C71) {
                InterfaceC10240zl interfaceC10240zlC = ((C71) d71).c();
                InterfaceC4923gl interfaceC4923gl = interfaceC10240zlC instanceof InterfaceC4923gl ? (InterfaceC4923gl) interfaceC10240zlC : null;
                return (interfaceC4923gl != null ? interfaceC4923gl.x0() : null) instanceof IZ;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + d71 + ", " + AbstractC5624jG0.b(d71.getClass())).toString());
        }

        public static boolean K(InterfaceC9403wl interfaceC9403wl, D71 d71) {
            G10.g(d71, "$receiver");
            if (d71 instanceof C71) {
                return d71 instanceof Q00;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + d71 + ", " + AbstractC5624jG0.b(d71.getClass())).toString());
        }

        public static boolean L(InterfaceC9403wl interfaceC9403wl, D71 d71) {
            G10.g(d71, "$receiver");
            if (d71 instanceof C71) {
                return d71 instanceof B10;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + d71 + ", " + AbstractC5624jG0.b(d71.getClass())).toString());
        }

        public static boolean M(InterfaceC9403wl interfaceC9403wl) {
            return false;
        }

        public static boolean N(InterfaceC9403wl interfaceC9403wl, InterfaceC3159aT0 interfaceC3159aT0) {
            G10.g(interfaceC3159aT0, "$receiver");
            if (interfaceC3159aT0 instanceof YS0) {
                return ((YS0) interfaceC3159aT0).O0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + interfaceC3159aT0 + ", " + AbstractC5624jG0.b(interfaceC3159aT0.getClass())).toString());
        }

        public static boolean O(InterfaceC9403wl interfaceC9403wl, O80 o80) {
            G10.g(o80, "$receiver");
            return o80 instanceof InterfaceC1089Ho0;
        }

        public static boolean P(InterfaceC9403wl interfaceC9403wl, D71 d71) {
            G10.g(d71, "$receiver");
            if (d71 instanceof C71) {
                return AbstractC8670u80.w0((C71) d71, YV0.a.c);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + d71 + ", " + AbstractC5624jG0.b(d71.getClass())).toString());
        }

        public static boolean Q(InterfaceC9403wl interfaceC9403wl, O80 o80) {
            G10.g(o80, "$receiver");
            if (o80 instanceof I80) {
                return D81.l((I80) o80);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + o80 + ", " + AbstractC5624jG0.b(o80.getClass())).toString());
        }

        public static boolean R(InterfaceC9403wl interfaceC9403wl, InterfaceC1068Hj interfaceC1068Hj) {
            G10.g(interfaceC1068Hj, "$receiver");
            return interfaceC1068Hj instanceof C10230zj;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean S(InterfaceC9403wl interfaceC9403wl, InterfaceC3159aT0 interfaceC3159aT0) {
            G10.g(interfaceC3159aT0, "$receiver");
            if (interfaceC3159aT0 instanceof I80) {
                return AbstractC8670u80.s0((I80) interfaceC3159aT0);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + interfaceC3159aT0 + ", " + AbstractC5624jG0.b(interfaceC3159aT0.getClass())).toString());
        }

        public static boolean T(InterfaceC9403wl interfaceC9403wl, InterfaceC1068Hj interfaceC1068Hj) {
            G10.g(interfaceC1068Hj, "$receiver");
            if (interfaceC1068Hj instanceof C1604Mn0) {
                return ((C1604Mn0) interfaceC1068Hj).Z0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + interfaceC1068Hj + ", " + AbstractC5624jG0.b(interfaceC1068Hj.getClass())).toString());
        }

        public static boolean U(InterfaceC9403wl interfaceC9403wl, O80 o80) {
            G10.g(o80, "$receiver");
            if (o80 instanceof I80) {
                return o80 instanceof BE0;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + o80 + ", " + AbstractC5624jG0.b(o80.getClass())).toString());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean V(InterfaceC9403wl interfaceC9403wl, InterfaceC3159aT0 interfaceC3159aT0) {
            G10.g(interfaceC3159aT0, "$receiver");
            if (interfaceC3159aT0 instanceof YS0) {
                if (N80.a((I80) interfaceC3159aT0)) {
                    return false;
                }
                YS0 ys0 = (YS0) interfaceC3159aT0;
                if (ys0.N0().c() instanceof InterfaceC5586j71) {
                    return false;
                }
                return ys0.N0().c() != null || (interfaceC3159aT0 instanceof C10230zj) || (interfaceC3159aT0 instanceof C1604Mn0) || (interfaceC3159aT0 instanceof C8906uy) || (ys0.N0() instanceof Q00) || W(interfaceC9403wl, interfaceC3159aT0);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + interfaceC3159aT0 + ", " + AbstractC5624jG0.b(interfaceC3159aT0.getClass())).toString());
        }

        public static boolean W(InterfaceC9403wl interfaceC9403wl, InterfaceC3159aT0 interfaceC3159aT0) {
            return (interfaceC3159aT0 instanceof C3716cT0) && interfaceC9403wl.d(((C3716cT0) interfaceC3159aT0).F0());
        }

        public static boolean X(InterfaceC9403wl interfaceC9403wl, InterfaceC7272p71 interfaceC7272p71) {
            G10.g(interfaceC7272p71, "$receiver");
            if (interfaceC7272p71 instanceof InterfaceC6440m81) {
                return ((InterfaceC6440m81) interfaceC7272p71).c();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + interfaceC7272p71 + ", " + AbstractC5624jG0.b(interfaceC7272p71.getClass())).toString());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean Y(InterfaceC9403wl interfaceC9403wl, InterfaceC3159aT0 interfaceC3159aT0) {
            G10.g(interfaceC3159aT0, "$receiver");
            if (interfaceC3159aT0 instanceof YS0) {
                return H81.u((I80) interfaceC3159aT0);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + interfaceC3159aT0 + ", " + AbstractC5624jG0.b(interfaceC3159aT0.getClass())).toString());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean Z(InterfaceC9403wl interfaceC9403wl, InterfaceC3159aT0 interfaceC3159aT0) {
            G10.g(interfaceC3159aT0, "$receiver");
            if (interfaceC3159aT0 instanceof YS0) {
                return H81.v((I80) interfaceC3159aT0);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + interfaceC3159aT0 + ", " + AbstractC5624jG0.b(interfaceC3159aT0.getClass())).toString());
        }

        public static boolean a(InterfaceC9403wl interfaceC9403wl, D71 d71, D71 d712) {
            G10.g(d71, "c1");
            G10.g(d712, "c2");
            if (!(d71 instanceof C71)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + d71 + ", " + AbstractC5624jG0.b(d71.getClass())).toString());
            }
            if (d712 instanceof C71) {
                return G10.c(d71, d712);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + d712 + ", " + AbstractC5624jG0.b(d712.getClass())).toString());
        }

        public static boolean a0(InterfaceC9403wl interfaceC9403wl, O80 o80) {
            G10.g(o80, "$receiver");
            if (!(o80 instanceof AbstractC5708ja1)) {
                return false;
            }
            ((AbstractC5708ja1) o80).N0();
            return false;
        }

        public static int b(InterfaceC9403wl interfaceC9403wl, O80 o80) {
            G10.g(o80, "$receiver");
            if (o80 instanceof I80) {
                return ((I80) o80).L0().size();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + o80 + ", " + AbstractC5624jG0.b(o80.getClass())).toString());
        }

        public static boolean b0(InterfaceC9403wl interfaceC9403wl, D71 d71) {
            G10.g(d71, "$receiver");
            if (d71 instanceof C71) {
                InterfaceC10240zl interfaceC10240zlC = ((C71) d71).c();
                return interfaceC10240zlC != null && AbstractC8670u80.B0(interfaceC10240zlC);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + d71 + ", " + AbstractC5624jG0.b(d71.getClass())).toString());
        }

        public static InterfaceC6993o71 c(InterfaceC9403wl interfaceC9403wl, InterfaceC3159aT0 interfaceC3159aT0) {
            G10.g(interfaceC3159aT0, "$receiver");
            if (interfaceC3159aT0 instanceof YS0) {
                return (InterfaceC6993o71) interfaceC3159aT0;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + interfaceC3159aT0 + ", " + AbstractC5624jG0.b(interfaceC3159aT0.getClass())).toString());
        }

        public static InterfaceC3159aT0 c0(InterfaceC9403wl interfaceC9403wl, XM xm) {
            G10.g(xm, "$receiver");
            if (xm instanceof UM) {
                return ((UM) xm).V0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + xm + ", " + AbstractC5624jG0.b(xm.getClass())).toString());
        }

        public static InterfaceC1068Hj d(InterfaceC9403wl interfaceC9403wl, InterfaceC3159aT0 interfaceC3159aT0) {
            G10.g(interfaceC3159aT0, "$receiver");
            if (interfaceC3159aT0 instanceof YS0) {
                if (interfaceC3159aT0 instanceof C3716cT0) {
                    return interfaceC9403wl.g(((C3716cT0) interfaceC3159aT0).F0());
                }
                if (interfaceC3159aT0 instanceof C1604Mn0) {
                    return (C1604Mn0) interfaceC3159aT0;
                }
                return null;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + interfaceC3159aT0 + ", " + AbstractC5624jG0.b(interfaceC3159aT0.getClass())).toString());
        }

        public static O80 d0(InterfaceC9403wl interfaceC9403wl, InterfaceC1068Hj interfaceC1068Hj) {
            G10.g(interfaceC1068Hj, "$receiver");
            if (interfaceC1068Hj instanceof C1604Mn0) {
                return ((C1604Mn0) interfaceC1068Hj).Y0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + interfaceC1068Hj + ", " + AbstractC5624jG0.b(interfaceC1068Hj.getClass())).toString());
        }

        public static InterfaceC9185vy e(InterfaceC9403wl interfaceC9403wl, InterfaceC3159aT0 interfaceC3159aT0) {
            G10.g(interfaceC3159aT0, "$receiver");
            if (interfaceC3159aT0 instanceof YS0) {
                if (interfaceC3159aT0 instanceof C8906uy) {
                    return (C8906uy) interfaceC3159aT0;
                }
                return null;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + interfaceC3159aT0 + ", " + AbstractC5624jG0.b(interfaceC3159aT0.getClass())).toString());
        }

        public static O80 e0(InterfaceC9403wl interfaceC9403wl, O80 o80) {
            G10.g(o80, "$receiver");
            if (o80 instanceof AbstractC5708ja1) {
                return AbstractC9682xl.b((AbstractC5708ja1) o80);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + o80 + ", " + AbstractC5624jG0.b(o80.getClass())).toString());
        }

        public static WE f(InterfaceC9403wl interfaceC9403wl, XM xm) {
            G10.g(xm, "$receiver");
            if (xm instanceof UM) {
                return null;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + xm + ", " + AbstractC5624jG0.b(xm.getClass())).toString());
        }

        public static C9510x71 f0(InterfaceC9403wl interfaceC9403wl, boolean z, boolean z2) {
            return AbstractC9124vl.b(z, z2, interfaceC9403wl, null, null, 24, null);
        }

        public static XM g(InterfaceC9403wl interfaceC9403wl, O80 o80) {
            G10.g(o80, "$receiver");
            if (o80 instanceof I80) {
                AbstractC5708ja1 abstractC5708ja1Q0 = ((I80) o80).Q0();
                if (abstractC5708ja1Q0 instanceof UM) {
                    return (UM) abstractC5708ja1Q0;
                }
                return null;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + o80 + ", " + AbstractC5624jG0.b(o80.getClass())).toString());
        }

        public static InterfaceC3159aT0 g0(InterfaceC9403wl interfaceC9403wl, InterfaceC9185vy interfaceC9185vy) {
            G10.g(interfaceC9185vy, "$receiver");
            if (interfaceC9185vy instanceof C8906uy) {
                return ((C8906uy) interfaceC9185vy).Z0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + interfaceC9185vy + ", " + AbstractC5624jG0.b(interfaceC9185vy.getClass())).toString());
        }

        public static InterfaceC3159aT0 h(InterfaceC9403wl interfaceC9403wl, O80 o80) {
            G10.g(o80, "$receiver");
            if (o80 instanceof I80) {
                AbstractC5708ja1 abstractC5708ja1Q0 = ((I80) o80).Q0();
                if (abstractC5708ja1Q0 instanceof YS0) {
                    return (YS0) abstractC5708ja1Q0;
                }
                return null;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + o80 + ", " + AbstractC5624jG0.b(o80.getClass())).toString());
        }

        public static int h0(InterfaceC9403wl interfaceC9403wl, D71 d71) {
            G10.g(d71, "$receiver");
            if (d71 instanceof C71) {
                return ((C71) d71).getParameters().size();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + d71 + ", " + AbstractC5624jG0.b(d71.getClass())).toString());
        }

        public static InterfaceC7272p71 i(InterfaceC9403wl interfaceC9403wl, O80 o80) {
            G10.g(o80, "$receiver");
            if (o80 instanceof I80) {
                return H81.d((I80) o80);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + o80 + ", " + AbstractC5624jG0.b(o80.getClass())).toString());
        }

        public static Collection i0(InterfaceC9403wl interfaceC9403wl, InterfaceC3159aT0 interfaceC3159aT0) {
            G10.g(interfaceC3159aT0, "$receiver");
            D71 d71F = interfaceC9403wl.f(interfaceC3159aT0);
            if (d71F instanceof Q00) {
                return ((Q00) d71F).j();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + interfaceC3159aT0 + ", " + AbstractC5624jG0.b(interfaceC3159aT0.getClass())).toString());
        }

        public static InterfaceC3159aT0 j(InterfaceC9403wl interfaceC9403wl, InterfaceC3159aT0 interfaceC3159aT0, EnumC9951yj enumC9951yj) {
            G10.g(interfaceC3159aT0, "type");
            G10.g(enumC9951yj, "status");
            if (interfaceC3159aT0 instanceof YS0) {
                return AbstractC2252Sn0.b((YS0) interfaceC3159aT0, enumC9951yj);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + interfaceC3159aT0 + ", " + AbstractC5624jG0.b(interfaceC3159aT0.getClass())).toString());
        }

        public static InterfaceC7272p71 j0(InterfaceC9403wl interfaceC9403wl, InterfaceC0964Gj interfaceC0964Gj) {
            G10.g(interfaceC0964Gj, "$receiver");
            if (interfaceC0964Gj instanceof C2146Rn0) {
                return ((C2146Rn0) interfaceC0964Gj).e();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + interfaceC0964Gj + ", " + AbstractC5624jG0.b(interfaceC0964Gj.getClass())).toString());
        }

        public static EnumC9951yj k(InterfaceC9403wl interfaceC9403wl, InterfaceC1068Hj interfaceC1068Hj) {
            G10.g(interfaceC1068Hj, "$receiver");
            if (interfaceC1068Hj instanceof C1604Mn0) {
                return ((C1604Mn0) interfaceC1068Hj).W0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + interfaceC1068Hj + ", " + AbstractC5624jG0.b(interfaceC1068Hj.getClass())).toString());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static C9510x71.c k0(InterfaceC9403wl interfaceC9403wl, InterfaceC3159aT0 interfaceC3159aT0) {
            G10.g(interfaceC3159aT0, "type");
            if (interfaceC3159aT0 instanceof YS0) {
                return new C0250a(interfaceC9403wl, E71.c.a((I80) interfaceC3159aT0).c());
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + interfaceC3159aT0 + ", " + AbstractC5624jG0.b(interfaceC3159aT0.getClass())).toString());
        }

        public static O80 l(InterfaceC9403wl interfaceC9403wl, InterfaceC3159aT0 interfaceC3159aT0, InterfaceC3159aT0 interfaceC3159aT02) {
            G10.g(interfaceC3159aT0, "lowerBound");
            G10.g(interfaceC3159aT02, "upperBound");
            if (!(interfaceC3159aT0 instanceof YS0)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + interfaceC9403wl + ", " + AbstractC5624jG0.b(interfaceC9403wl.getClass())).toString());
            }
            if (interfaceC3159aT02 instanceof YS0) {
                return M80.e((YS0) interfaceC3159aT0, (YS0) interfaceC3159aT02);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + interfaceC9403wl + ", " + AbstractC5624jG0.b(interfaceC9403wl.getClass())).toString());
        }

        public static Collection l0(InterfaceC9403wl interfaceC9403wl, D71 d71) {
            G10.g(d71, "$receiver");
            if (d71 instanceof C71) {
                Collection collectionB = ((C71) d71).b();
                G10.f(collectionB, "getSupertypes(...)");
                return collectionB;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + d71 + ", " + AbstractC5624jG0.b(d71.getClass())).toString());
        }

        public static InterfaceC7272p71 m(InterfaceC9403wl interfaceC9403wl, O80 o80, int i) {
            G10.g(o80, "$receiver");
            if (o80 instanceof I80) {
                return (InterfaceC7272p71) ((I80) o80).L0().get(i);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + o80 + ", " + AbstractC5624jG0.b(o80.getClass())).toString());
        }

        public static InterfaceC0964Gj m0(InterfaceC9403wl interfaceC9403wl, InterfaceC1068Hj interfaceC1068Hj) {
            G10.g(interfaceC1068Hj, "$receiver");
            if (interfaceC1068Hj instanceof C1604Mn0) {
                return ((C1604Mn0) interfaceC1068Hj).N0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + interfaceC1068Hj + ", " + AbstractC5624jG0.b(interfaceC1068Hj.getClass())).toString());
        }

        public static List n(InterfaceC9403wl interfaceC9403wl, O80 o80) {
            G10.g(o80, "$receiver");
            if (o80 instanceof I80) {
                return ((I80) o80).L0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + o80 + ", " + AbstractC5624jG0.b(o80.getClass())).toString());
        }

        public static D71 n0(InterfaceC9403wl interfaceC9403wl, InterfaceC3159aT0 interfaceC3159aT0) {
            G10.g(interfaceC3159aT0, "$receiver");
            if (interfaceC3159aT0 instanceof YS0) {
                return ((YS0) interfaceC3159aT0).N0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + interfaceC3159aT0 + ", " + AbstractC5624jG0.b(interfaceC3159aT0.getClass())).toString());
        }

        public static BP o(InterfaceC9403wl interfaceC9403wl, D71 d71) {
            G10.g(d71, "$receiver");
            if (d71 instanceof C71) {
                InterfaceC10240zl interfaceC10240zlC = ((C71) d71).c();
                G10.e(interfaceC10240zlC, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                return AbstractC8400tA.p((InterfaceC4923gl) interfaceC10240zlC);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + d71 + ", " + AbstractC5624jG0.b(d71.getClass())).toString());
        }

        public static InterfaceC3159aT0 o0(InterfaceC9403wl interfaceC9403wl, XM xm) {
            G10.g(xm, "$receiver");
            if (xm instanceof UM) {
                return ((UM) xm).W0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + xm + ", " + AbstractC5624jG0.b(xm.getClass())).toString());
        }

        public static InterfaceC3631c81 p(InterfaceC9403wl interfaceC9403wl, D71 d71, int i) {
            G10.g(d71, "$receiver");
            if (d71 instanceof C71) {
                Object obj = ((C71) d71).getParameters().get(i);
                G10.f(obj, "get(...)");
                return (InterfaceC3631c81) obj;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + d71 + ", " + AbstractC5624jG0.b(d71.getClass())).toString());
        }

        public static O80 p0(InterfaceC9403wl interfaceC9403wl, O80 o80, boolean z) {
            G10.g(o80, "$receiver");
            if (o80 instanceof InterfaceC3159aT0) {
                return interfaceC9403wl.c((InterfaceC3159aT0) o80, z);
            }
            if (!(o80 instanceof XM)) {
                throw new IllegalStateException("sealed");
            }
            XM xm = (XM) o80;
            return interfaceC9403wl.b0(interfaceC9403wl.c(interfaceC9403wl.a(xm), z), interfaceC9403wl.c(interfaceC9403wl.e(xm), z));
        }

        public static List q(InterfaceC9403wl interfaceC9403wl, D71 d71) {
            G10.g(d71, "$receiver");
            if (d71 instanceof C71) {
                List parameters = ((C71) d71).getParameters();
                G10.f(parameters, "getParameters(...)");
                return parameters;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + d71 + ", " + AbstractC5624jG0.b(d71.getClass())).toString());
        }

        public static InterfaceC3159aT0 q0(InterfaceC9403wl interfaceC9403wl, InterfaceC3159aT0 interfaceC3159aT0, boolean z) {
            G10.g(interfaceC3159aT0, "$receiver");
            if (interfaceC3159aT0 instanceof YS0) {
                return ((YS0) interfaceC3159aT0).R0(z);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + interfaceC3159aT0 + ", " + AbstractC5624jG0.b(interfaceC3159aT0.getClass())).toString());
        }

        public static EnumC8067rz0 r(InterfaceC9403wl interfaceC9403wl, D71 d71) {
            G10.g(d71, "$receiver");
            if (d71 instanceof C71) {
                InterfaceC10240zl interfaceC10240zlC = ((C71) d71).c();
                G10.e(interfaceC10240zlC, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                return AbstractC8670u80.P((InterfaceC4923gl) interfaceC10240zlC);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + d71 + ", " + AbstractC5624jG0.b(d71.getClass())).toString());
        }

        public static EnumC8067rz0 s(InterfaceC9403wl interfaceC9403wl, D71 d71) {
            G10.g(d71, "$receiver");
            if (d71 instanceof C71) {
                InterfaceC10240zl interfaceC10240zlC = ((C71) d71).c();
                G10.e(interfaceC10240zlC, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                return AbstractC8670u80.S((InterfaceC4923gl) interfaceC10240zlC);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + d71 + ", " + AbstractC5624jG0.b(d71.getClass())).toString());
        }

        public static O80 t(InterfaceC9403wl interfaceC9403wl, InterfaceC3631c81 interfaceC3631c81) {
            G10.g(interfaceC3631c81, "$receiver");
            if (interfaceC3631c81 instanceof Z71) {
                return H81.o((Z71) interfaceC3631c81);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + interfaceC3631c81 + ", " + AbstractC5624jG0.b(interfaceC3631c81.getClass())).toString());
        }

        public static O80 u(InterfaceC9403wl interfaceC9403wl, InterfaceC7272p71 interfaceC7272p71) {
            G10.g(interfaceC7272p71, "$receiver");
            if (interfaceC7272p71 instanceof InterfaceC6440m81) {
                return ((InterfaceC6440m81) interfaceC7272p71).getType().Q0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + interfaceC7272p71 + ", " + AbstractC5624jG0.b(interfaceC7272p71.getClass())).toString());
        }

        public static InterfaceC3631c81 v(InterfaceC9403wl interfaceC9403wl, D71 d71) {
            G10.g(d71, "$receiver");
            if (d71 instanceof C71) {
                InterfaceC10240zl interfaceC10240zlC = ((C71) d71).c();
                if (interfaceC10240zlC instanceof Z71) {
                    return (Z71) interfaceC10240zlC;
                }
                return null;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + d71 + ", " + AbstractC5624jG0.b(d71.getClass())).toString());
        }

        public static O80 w(InterfaceC9403wl interfaceC9403wl, O80 o80) {
            G10.g(o80, "$receiver");
            if (o80 instanceof I80) {
                return JZ.k((I80) o80);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + o80 + ", " + AbstractC5624jG0.b(o80.getClass())).toString());
        }

        public static List x(InterfaceC9403wl interfaceC9403wl, InterfaceC3631c81 interfaceC3631c81) {
            G10.g(interfaceC3631c81, "$receiver");
            if (interfaceC3631c81 instanceof Z71) {
                List upperBounds = ((Z71) interfaceC3631c81).getUpperBounds();
                G10.f(upperBounds, "getUpperBounds(...)");
                return upperBounds;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + interfaceC3631c81 + ", " + AbstractC5624jG0.b(interfaceC3631c81.getClass())).toString());
        }

        public static J81 y(InterfaceC9403wl interfaceC9403wl, InterfaceC7272p71 interfaceC7272p71) {
            G10.g(interfaceC7272p71, "$receiver");
            if (interfaceC7272p71 instanceof InterfaceC6440m81) {
                EnumC1042Hc1 enumC1042Hc1B = ((InterfaceC6440m81) interfaceC7272p71).b();
                G10.f(enumC1042Hc1B, "getProjectionKind(...)");
                return AbstractC9794y81.a(enumC1042Hc1B);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + interfaceC7272p71 + ", " + AbstractC5624jG0.b(interfaceC7272p71.getClass())).toString());
        }

        public static J81 z(InterfaceC9403wl interfaceC9403wl, InterfaceC3631c81 interfaceC3631c81) {
            G10.g(interfaceC3631c81, "$receiver");
            if (interfaceC3631c81 instanceof Z71) {
                EnumC1042Hc1 enumC1042Hc1O = ((Z71) interfaceC3631c81).o();
                G10.f(enumC1042Hc1O, "getVariance(...)");
                return AbstractC9794y81.a(enumC1042Hc1O);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + interfaceC3631c81 + ", " + AbstractC5624jG0.b(interfaceC3631c81.getClass())).toString());
        }
    }

    @Override // com.daaw.InterfaceC9515x81
    InterfaceC3159aT0 a(XM xm);

    @Override // com.daaw.InterfaceC9515x81
    InterfaceC3159aT0 b(O80 o80);

    O80 b0(InterfaceC3159aT0 interfaceC3159aT0, InterfaceC3159aT0 interfaceC3159aT02);

    @Override // com.daaw.InterfaceC9515x81
    InterfaceC3159aT0 c(InterfaceC3159aT0 interfaceC3159aT0, boolean z);

    @Override // com.daaw.InterfaceC9515x81
    boolean d(InterfaceC3159aT0 interfaceC3159aT0);

    @Override // com.daaw.InterfaceC9515x81
    InterfaceC3159aT0 e(XM xm);

    @Override // com.daaw.InterfaceC9515x81
    D71 f(InterfaceC3159aT0 interfaceC3159aT0);

    @Override // com.daaw.InterfaceC9515x81
    InterfaceC1068Hj g(InterfaceC3159aT0 interfaceC3159aT0);
}
