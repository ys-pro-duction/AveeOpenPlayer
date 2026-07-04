package com.daaw;

import com.daaw.InterfaceC5248hu0;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: com.daaw.kp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6060kp implements InterfaceC5781jp {
    public int A;
    public int B;
    public AbstractC3720cU0 C;
    public int D;
    public final PV0 E;
    public boolean F;
    public boolean G;
    public NT0 H;
    public OT0 I;
    public QT0 J;
    public boolean K;
    public InterfaceC5248hu0 L;
    public C4445f4 M;
    public final List N;
    public boolean O;
    public int P;
    public int Q;
    public PV0 R;
    public int S;
    public boolean T;
    public boolean U;
    public final K00 V;
    public final PV0 W;
    public int X;
    public int Y;
    public int Z;
    public int a0;
    public final InterfaceC8783ua b;
    public final AbstractC1300Jp c;
    public final OT0 d;
    public final Set e;
    public List f;
    public List g;
    public final InterfaceC2165Rs h;
    public final PV0 i;
    public C1005Gt0 j;
    public int k;
    public K00 l;
    public int m;
    public K00 n;
    public int[] o;
    public HashMap p;
    public boolean q;
    public boolean r;
    public boolean s;
    public final List t;
    public final K00 u;
    public InterfaceC5248hu0 v;
    public final HashMap w;
    public boolean x;
    public final K00 y;
    public boolean z;

    /* JADX INFO: renamed from: com.daaw.kp$A */
    public static final class A extends AbstractC4192e90 implements InterfaceC3986dR {
        public final /* synthetic */ OT0 B;
        public final /* synthetic */ C4445f4 C;
        public final /* synthetic */ List D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public A(OT0 ot0, C4445f4 c4445f4, List list) {
            super(3);
            this.B = ot0;
            this.C = c4445f4;
            this.D = list;
        }

        public final void a(InterfaceC8783ua interfaceC8783ua, QT0 qt0, InterfaceC10106zG0 interfaceC10106zG0) {
            G10.g(interfaceC8783ua, "applier");
            G10.g(qt0, "slots");
            G10.g(interfaceC10106zG0, "rememberManager");
            OT0 ot0 = this.B;
            List list = this.D;
            QT0 qt0I = ot0.I();
            try {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    ((InterfaceC3986dR) list.get(i)).invoke(interfaceC8783ua, qt0I, interfaceC10106zG0);
                }
                G91 g91 = G91.a;
                qt0I.F();
                qt0.D();
                OT0 ot02 = this.B;
                qt0.o0(ot02, this.C.d(ot02));
                qt0.O();
            } catch (Throwable th) {
                qt0I.F();
                throw th;
            }
        }

        @Override // com.daaw.InterfaceC3986dR
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((InterfaceC8783ua) obj, (QT0) obj2, (InterfaceC10106zG0) obj3);
            return G91.a;
        }
    }

    /* JADX INFO: renamed from: com.daaw.kp$B */
    public static final class B extends AbstractC4192e90 implements InterfaceC3986dR {
        public final /* synthetic */ LQ B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public B(LQ lq) {
            super(3);
            this.B = lq;
        }

        public final void a(InterfaceC8783ua interfaceC8783ua, QT0 qt0, InterfaceC10106zG0 interfaceC10106zG0) {
            G10.g(interfaceC8783ua, "<anonymous parameter 0>");
            G10.g(qt0, "<anonymous parameter 1>");
            G10.g(interfaceC10106zG0, "rememberManager");
            interfaceC10106zG0.a(this.B);
        }

        @Override // com.daaw.InterfaceC3986dR
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((InterfaceC8783ua) obj, (QT0) obj2, (InterfaceC10106zG0) obj3);
            return G91.a;
        }
    }

    /* JADX INFO: renamed from: com.daaw.kp$C */
    public static final class C extends AbstractC4192e90 implements InterfaceC3986dR {
        public final /* synthetic */ C4445f4 B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C(C4445f4 c4445f4) {
            super(3);
            this.B = c4445f4;
        }

        public final void a(InterfaceC8783ua interfaceC8783ua, QT0 qt0, InterfaceC10106zG0 interfaceC10106zG0) {
            G10.g(interfaceC8783ua, "<anonymous parameter 0>");
            G10.g(qt0, "slots");
            G10.g(interfaceC10106zG0, "<anonymous parameter 2>");
            qt0.Q(this.B);
        }

        @Override // com.daaw.InterfaceC3986dR
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((InterfaceC8783ua) obj, (QT0) obj2, (InterfaceC10106zG0) obj3);
            return G91.a;
        }
    }

    /* JADX INFO: renamed from: com.daaw.kp$D */
    public static final class D extends AbstractC4192e90 implements InterfaceC3986dR {
        public final /* synthetic */ C0661Dl0 C;
        public final /* synthetic */ C4445f4 D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public D(C0661Dl0 c0661Dl0, C4445f4 c4445f4) {
            super(3);
            this.C = c0661Dl0;
            this.D = c4445f4;
        }

        public final void a(InterfaceC8783ua interfaceC8783ua, QT0 qt0, InterfaceC10106zG0 interfaceC10106zG0) {
            G10.g(interfaceC8783ua, "<anonymous parameter 0>");
            G10.g(qt0, "slots");
            G10.g(interfaceC10106zG0, "<anonymous parameter 2>");
            OT0 ot0 = new OT0();
            C4445f4 c4445f4 = this.D;
            QT0 qt0I = ot0.I();
            try {
                qt0I.D();
                qt0.t0(c4445f4, 1, qt0I);
                qt0I.O();
                G91 g91 = G91.a;
                qt0I.F();
                C6060kp.this.c.j(this.C, new C0548Cl0(ot0));
            } catch (Throwable th) {
                qt0I.F();
                throw th;
            }
        }

        @Override // com.daaw.InterfaceC3986dR
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((InterfaceC8783ua) obj, (QT0) obj2, (InterfaceC10106zG0) obj3);
            return G91.a;
        }
    }

    /* JADX INFO: renamed from: com.daaw.kp$E */
    public static final class E extends AbstractC4192e90 implements InterfaceC3986dR {
        public final /* synthetic */ int B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public E(int i) {
            super(3);
            this.B = i;
        }

        public final void a(InterfaceC8783ua interfaceC8783ua, QT0 qt0, InterfaceC10106zG0 interfaceC10106zG0) {
            G10.g(interfaceC8783ua, "<anonymous parameter 0>");
            G10.g(qt0, "slots");
            G10.g(interfaceC10106zG0, "<anonymous parameter 2>");
            qt0.p0(this.B);
        }

        @Override // com.daaw.InterfaceC3986dR
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((InterfaceC8783ua) obj, (QT0) obj2, (InterfaceC10106zG0) obj3);
            return G91.a;
        }
    }

    /* JADX INFO: renamed from: com.daaw.kp$F */
    public static final class F extends AbstractC4192e90 implements InterfaceC3429bR {
        public final /* synthetic */ C7011oB0[] B;
        public final /* synthetic */ InterfaceC5248hu0 C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public F(C7011oB0[] c7011oB0Arr, InterfaceC5248hu0 interfaceC5248hu0) {
            super(2);
            this.B = c7011oB0Arr;
            this.C = interfaceC5248hu0;
        }

        public final InterfaceC5248hu0 a(InterfaceC5781jp interfaceC5781jp, int i) {
            interfaceC5781jp.e(935231726);
            InterfaceC5248hu0 interfaceC5248hu0Y = AbstractC6348lp.y(this.B, this.C, interfaceC5781jp, 8);
            interfaceC5781jp.L();
            return interfaceC5248hu0Y;
        }

        @Override // com.daaw.InterfaceC3429bR
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a((InterfaceC5781jp) obj, ((Number) obj2).intValue());
        }
    }

    /* JADX INFO: renamed from: com.daaw.kp$G */
    public static final class G extends AbstractC4192e90 implements InterfaceC3986dR {
        public final /* synthetic */ Object B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public G(Object obj) {
            super(3);
            this.B = obj;
        }

        public final void a(InterfaceC8783ua interfaceC8783ua, QT0 qt0, InterfaceC10106zG0 interfaceC10106zG0) {
            G10.g(interfaceC8783ua, "<anonymous parameter 0>");
            G10.g(qt0, "slots");
            G10.g(interfaceC10106zG0, "<anonymous parameter 2>");
            qt0.Z0(this.B);
        }

        @Override // com.daaw.InterfaceC3986dR
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((InterfaceC8783ua) obj, (QT0) obj2, (InterfaceC10106zG0) obj3);
            return G91.a;
        }
    }

    /* JADX INFO: renamed from: com.daaw.kp$H */
    public static final class H extends AbstractC4192e90 implements InterfaceC3986dR {
        public final /* synthetic */ Object B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public H(Object obj) {
            super(3);
            this.B = obj;
        }

        public final void a(InterfaceC8783ua interfaceC8783ua, QT0 qt0, InterfaceC10106zG0 interfaceC10106zG0) {
            G10.g(interfaceC8783ua, "<anonymous parameter 0>");
            G10.g(qt0, "<anonymous parameter 1>");
            G10.g(interfaceC10106zG0, "rememberManager");
            interfaceC10106zG0.c((AG0) this.B);
        }

        @Override // com.daaw.InterfaceC3986dR
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((InterfaceC8783ua) obj, (QT0) obj2, (InterfaceC10106zG0) obj3);
            return G91.a;
        }
    }

    /* JADX INFO: renamed from: com.daaw.kp$I */
    public static final class I extends AbstractC4192e90 implements InterfaceC3986dR {
        public final /* synthetic */ Object B;
        public final /* synthetic */ int C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public I(Object obj, int i) {
            super(3);
            this.B = obj;
            this.C = i;
        }

        public final void a(InterfaceC8783ua interfaceC8783ua, QT0 qt0, InterfaceC10106zG0 interfaceC10106zG0) {
            VE0 ve0;
            C1715Np c1715NpL;
            G10.g(interfaceC8783ua, "<anonymous parameter 0>");
            G10.g(qt0, "slots");
            G10.g(interfaceC10106zG0, "rememberManager");
            Object obj = this.B;
            if (obj instanceof AG0) {
                interfaceC10106zG0.c((AG0) obj);
            }
            Object objK0 = qt0.K0(this.C, this.B);
            if (objK0 instanceof AG0) {
                interfaceC10106zG0.b((AG0) objK0);
            } else {
                if (!(objK0 instanceof VE0) || (c1715NpL = (ve0 = (VE0) objK0).l()) == null) {
                    return;
                }
                ve0.x();
                c1715NpL.F(true);
            }
        }

        @Override // com.daaw.InterfaceC3986dR
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((InterfaceC8783ua) obj, (QT0) obj2, (InterfaceC10106zG0) obj3);
            return G91.a;
        }
    }

    /* JADX INFO: renamed from: com.daaw.kp$b, reason: case insensitive filesystem */
    public final class C6062b extends AbstractC1300Jp {
        public final int a;
        public final boolean b;
        public Set c;
        public final Set d = new LinkedHashSet();
        public final InterfaceC8007rm0 e = AbstractC9046vU0.d(AbstractC7878rJ.a(), null, 2, null);

        public C6062b(int i, boolean z) {
            this.a = i;
            this.b = z;
        }

        @Override // com.daaw.AbstractC1300Jp
        public void a(InterfaceC2165Rs interfaceC2165Rs, InterfaceC3429bR interfaceC3429bR) {
            G10.g(interfaceC2165Rs, "composition");
            G10.g(interfaceC3429bR, "content");
            C6060kp.this.c.a(interfaceC2165Rs, interfaceC3429bR);
        }

        @Override // com.daaw.AbstractC1300Jp
        public void b(C0661Dl0 c0661Dl0) {
            G10.g(c0661Dl0, "reference");
            C6060kp.this.c.b(c0661Dl0);
        }

        @Override // com.daaw.AbstractC1300Jp
        public void c() {
            C6060kp c6060kp = C6060kp.this;
            c6060kp.B--;
        }

        @Override // com.daaw.AbstractC1300Jp
        public boolean d() {
            return this.b;
        }

        @Override // com.daaw.AbstractC1300Jp
        public InterfaceC5248hu0 e() {
            return r();
        }

        @Override // com.daaw.AbstractC1300Jp
        public int f() {
            return this.a;
        }

        @Override // com.daaw.AbstractC1300Jp
        public InterfaceC4684ft g() {
            return C6060kp.this.c.g();
        }

        @Override // com.daaw.AbstractC1300Jp
        public void h(C0661Dl0 c0661Dl0) {
            G10.g(c0661Dl0, "reference");
            C6060kp.this.c.h(c0661Dl0);
        }

        @Override // com.daaw.AbstractC1300Jp
        public void i(InterfaceC2165Rs interfaceC2165Rs) {
            G10.g(interfaceC2165Rs, "composition");
            C6060kp.this.c.i(C6060kp.this.B0());
            C6060kp.this.c.i(interfaceC2165Rs);
        }

        @Override // com.daaw.AbstractC1300Jp
        public void j(C0661Dl0 c0661Dl0, C0548Cl0 c0548Cl0) {
            G10.g(c0661Dl0, "reference");
            G10.g(c0548Cl0, "data");
            C6060kp.this.c.j(c0661Dl0, c0548Cl0);
        }

        @Override // com.daaw.AbstractC1300Jp
        public C0548Cl0 k(C0661Dl0 c0661Dl0) {
            G10.g(c0661Dl0, "reference");
            return C6060kp.this.c.k(c0661Dl0);
        }

        @Override // com.daaw.AbstractC1300Jp
        public void l(Set set) {
            G10.g(set, "table");
            Set hashSet = this.c;
            if (hashSet == null) {
                hashSet = new HashSet();
                this.c = hashSet;
            }
            hashSet.add(set);
        }

        @Override // com.daaw.AbstractC1300Jp
        public void m(InterfaceC5781jp interfaceC5781jp) {
            G10.g(interfaceC5781jp, "composer");
            super.m((C6060kp) interfaceC5781jp);
            this.d.add(interfaceC5781jp);
        }

        @Override // com.daaw.AbstractC1300Jp
        public void n() {
            C6060kp.this.B++;
        }

        @Override // com.daaw.AbstractC1300Jp
        public void o(InterfaceC5781jp interfaceC5781jp) {
            G10.g(interfaceC5781jp, "composer");
            Set set = this.c;
            if (set != null) {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    ((Set) it.next()).remove(((C6060kp) interfaceC5781jp).d);
                }
            }
            V71.a(this.d).remove(interfaceC5781jp);
        }

        @Override // com.daaw.AbstractC1300Jp
        public void p(InterfaceC2165Rs interfaceC2165Rs) {
            G10.g(interfaceC2165Rs, "composition");
            C6060kp.this.c.p(interfaceC2165Rs);
        }

        public final void q() {
            if (this.d.isEmpty()) {
                return;
            }
            Set set = this.c;
            if (set != null) {
                for (C6060kp c6060kp : this.d) {
                    Iterator it = set.iterator();
                    while (it.hasNext()) {
                        ((Set) it.next()).remove(c6060kp.d);
                    }
                }
            }
            this.d.clear();
        }

        public final InterfaceC5248hu0 r() {
            return (InterfaceC5248hu0) this.e.getValue();
        }

        public final void s(InterfaceC5248hu0 interfaceC5248hu0) {
            this.e.setValue(interfaceC5248hu0);
        }

        public final void t(InterfaceC5248hu0 interfaceC5248hu0) {
            G10.g(interfaceC5248hu0, "scope");
            s(interfaceC5248hu0);
        }
    }

    /* JADX INFO: renamed from: com.daaw.kp$c, reason: case insensitive filesystem */
    public static final class C6063c extends AbstractC4192e90 implements InterfaceC3986dR {
        public final /* synthetic */ InterfaceC3429bR B;
        public final /* synthetic */ Object C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6063c(InterfaceC3429bR interfaceC3429bR, Object obj) {
            super(3);
            this.B = interfaceC3429bR;
            this.C = obj;
        }

        public final void a(InterfaceC8783ua interfaceC8783ua, QT0 qt0, InterfaceC10106zG0 interfaceC10106zG0) {
            G10.g(interfaceC8783ua, "applier");
            G10.g(qt0, "<anonymous parameter 1>");
            G10.g(interfaceC10106zG0, "<anonymous parameter 2>");
            this.B.invoke(interfaceC8783ua.a(), this.C);
        }

        @Override // com.daaw.InterfaceC3986dR
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((InterfaceC8783ua) obj, (QT0) obj2, (InterfaceC10106zG0) obj3);
            return G91.a;
        }
    }

    /* JADX INFO: renamed from: com.daaw.kp$d, reason: case insensitive filesystem */
    public static final class C6064d extends AbstractC4192e90 implements InterfaceC3986dR {
        public final /* synthetic */ LQ B;
        public final /* synthetic */ C4445f4 C;
        public final /* synthetic */ int D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6064d(LQ lq, C4445f4 c4445f4, int i) {
            super(3);
            this.B = lq;
            this.C = c4445f4;
            this.D = i;
        }

        public final void a(InterfaceC8783ua interfaceC8783ua, QT0 qt0, InterfaceC10106zG0 interfaceC10106zG0) {
            G10.g(interfaceC8783ua, "applier");
            G10.g(qt0, "slots");
            G10.g(interfaceC10106zG0, "<anonymous parameter 2>");
            Object objInvoke = this.B.invoke();
            qt0.d1(this.C, objInvoke);
            interfaceC8783ua.h(this.D, objInvoke);
            interfaceC8783ua.c(objInvoke);
        }

        @Override // com.daaw.InterfaceC3986dR
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((InterfaceC8783ua) obj, (QT0) obj2, (InterfaceC10106zG0) obj3);
            return G91.a;
        }
    }

    /* JADX INFO: renamed from: com.daaw.kp$e, reason: case insensitive filesystem */
    public static final class C6065e extends AbstractC4192e90 implements InterfaceC3986dR {
        public final /* synthetic */ C4445f4 B;
        public final /* synthetic */ int C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6065e(C4445f4 c4445f4, int i) {
            super(3);
            this.B = c4445f4;
            this.C = i;
        }

        public final void a(InterfaceC8783ua interfaceC8783ua, QT0 qt0, InterfaceC10106zG0 interfaceC10106zG0) {
            G10.g(interfaceC8783ua, "applier");
            G10.g(qt0, "slots");
            G10.g(interfaceC10106zG0, "<anonymous parameter 2>");
            Object objV0 = qt0.v0(this.B);
            interfaceC8783ua.g();
            interfaceC8783ua.b(this.C, objV0);
        }

        @Override // com.daaw.InterfaceC3986dR
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((InterfaceC8783ua) obj, (QT0) obj2, (InterfaceC10106zG0) obj3);
            return G91.a;
        }
    }

    /* JADX INFO: renamed from: com.daaw.kp$f, reason: case insensitive filesystem */
    public static final class C6066f extends AbstractC4192e90 implements InterfaceC3429bR {
        public final /* synthetic */ int C;

        /* JADX INFO: renamed from: com.daaw.kp$f$a */
        public static final class a extends AbstractC4192e90 implements InterfaceC3986dR {
            public final /* synthetic */ Object B;
            public final /* synthetic */ int C;
            public final /* synthetic */ int D;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Object obj, int i, int i2) {
                super(3);
                this.B = obj;
                this.C = i;
                this.D = i2;
            }

            public final void a(InterfaceC8783ua interfaceC8783ua, QT0 qt0, InterfaceC10106zG0 interfaceC10106zG0) {
                G10.g(interfaceC8783ua, "<anonymous parameter 0>");
                G10.g(qt0, "slots");
                G10.g(interfaceC10106zG0, "rememberManager");
                if (!G10.c(this.B, qt0.P0(this.C, this.D))) {
                    AbstractC6348lp.x("Slot table is out of sync");
                    throw new D80();
                }
                interfaceC10106zG0.b((AG0) this.B);
                qt0.K0(this.D, InterfaceC5781jp.a.a());
            }

            @Override // com.daaw.InterfaceC3986dR
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                a((InterfaceC8783ua) obj, (QT0) obj2, (InterfaceC10106zG0) obj3);
                return G91.a;
            }
        }

        /* JADX INFO: renamed from: com.daaw.kp$f$b */
        public static final class b extends AbstractC4192e90 implements InterfaceC3986dR {
            public final /* synthetic */ Object B;
            public final /* synthetic */ int C;
            public final /* synthetic */ int D;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Object obj, int i, int i2) {
                super(3);
                this.B = obj;
                this.C = i;
                this.D = i2;
            }

            public final void a(InterfaceC8783ua interfaceC8783ua, QT0 qt0, InterfaceC10106zG0 interfaceC10106zG0) {
                G10.g(interfaceC8783ua, "<anonymous parameter 0>");
                G10.g(qt0, "slots");
                G10.g(interfaceC10106zG0, "<anonymous parameter 2>");
                if (G10.c(this.B, qt0.P0(this.C, this.D))) {
                    qt0.K0(this.D, InterfaceC5781jp.a.a());
                } else {
                    AbstractC6348lp.x("Slot table is out of sync");
                    throw new D80();
                }
            }

            @Override // com.daaw.InterfaceC3986dR
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                a((InterfaceC8783ua) obj, (QT0) obj2, (InterfaceC10106zG0) obj3);
                return G91.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6066f(int i) {
            super(2);
            this.C = i;
        }

        public final void a(int i, Object obj) {
            if (obj instanceof AG0) {
                C6060kp.this.H.N(this.C);
                C6060kp.p1(C6060kp.this, false, new a(obj, this.C, i), 1, null);
            } else if (obj instanceof VE0) {
                VE0 ve0 = (VE0) obj;
                C1715Np c1715NpL = ve0.l();
                if (c1715NpL != null) {
                    c1715NpL.F(true);
                    ve0.x();
                }
                C6060kp.this.H.N(this.C);
                C6060kp.p1(C6060kp.this, false, new b(obj, this.C, i), 1, null);
            }
        }

        @Override // com.daaw.InterfaceC3429bR
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a(((Number) obj).intValue(), obj2);
            return G91.a;
        }
    }

    /* JADX INFO: renamed from: com.daaw.kp$g, reason: case insensitive filesystem */
    public static final class C6067g extends AbstractC4192e90 implements NQ {
        public C6067g() {
            super(1);
        }

        public final void a(InterfaceC6258lW0 interfaceC6258lW0) {
            G10.g(interfaceC6258lW0, "it");
            C6060kp.this.B++;
        }

        @Override // com.daaw.NQ
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((InterfaceC6258lW0) obj);
            return G91.a;
        }
    }

    /* JADX INFO: renamed from: com.daaw.kp$h, reason: case insensitive filesystem */
    public static final class C6068h extends AbstractC4192e90 implements NQ {
        public C6068h() {
            super(1);
        }

        public final void a(InterfaceC6258lW0 interfaceC6258lW0) {
            G10.g(interfaceC6258lW0, "it");
            C6060kp c6060kp = C6060kp.this;
            c6060kp.B--;
        }

        @Override // com.daaw.NQ
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((InterfaceC6258lW0) obj);
            return G91.a;
        }
    }

    /* JADX INFO: renamed from: com.daaw.kp$i, reason: case insensitive filesystem */
    public static final class C6069i extends AbstractC4192e90 implements LQ {
        public final /* synthetic */ InterfaceC3429bR B;
        public final /* synthetic */ C6060kp C;
        public final /* synthetic */ Object D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6069i(InterfaceC3429bR interfaceC3429bR, C6060kp c6060kp, Object obj) {
            super(0);
            this.B = interfaceC3429bR;
            this.C = c6060kp;
            this.D = obj;
        }

        @Override // com.daaw.LQ
        public /* bridge */ /* synthetic */ Object invoke() {
            m54invoke();
            return G91.a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m54invoke() {
            Object obj;
            if (this.B != null) {
                this.C.B1(RCHTTPStatusCodes.SUCCESS, AbstractC6348lp.G());
                O2.b(this.C, this.B);
                this.C.u0();
            } else {
                if (!this.C.r || (obj = this.D) == null || G10.c(obj, InterfaceC5781jp.a.a())) {
                    this.C.w1();
                    return;
                }
                this.C.B1(RCHTTPStatusCodes.SUCCESS, AbstractC6348lp.G());
                C6060kp c6060kp = this.C;
                Object obj2 = this.D;
                if (obj2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Function2<androidx.compose.runtime.Composer, kotlin.Int, kotlin.Unit>");
                }
                O2.b(c6060kp, (InterfaceC3429bR) V71.e(obj2, 2));
                this.C.u0();
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.kp$j */
    public static final class j implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return AbstractC1188In.a(Integer.valueOf(((S10) obj).b()), Integer.valueOf(((S10) obj2).b()));
        }
    }

    /* JADX INFO: renamed from: com.daaw.kp$k */
    public static final class k extends AbstractC4192e90 implements InterfaceC3986dR {
        public final /* synthetic */ NQ B;
        public final /* synthetic */ C6060kp C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(NQ nq, C6060kp c6060kp) {
            super(3);
            this.B = nq;
            this.C = c6060kp;
        }

        public final void a(InterfaceC8783ua interfaceC8783ua, QT0 qt0, InterfaceC10106zG0 interfaceC10106zG0) {
            G10.g(interfaceC8783ua, "<anonymous parameter 0>");
            G10.g(qt0, "<anonymous parameter 1>");
            G10.g(interfaceC10106zG0, "<anonymous parameter 2>");
            this.B.invoke(this.C.B0());
        }

        @Override // com.daaw.InterfaceC3986dR
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((InterfaceC8783ua) obj, (QT0) obj2, (InterfaceC10106zG0) obj3);
            return G91.a;
        }
    }

    /* JADX INFO: renamed from: com.daaw.kp$l */
    public static final class l extends AbstractC4192e90 implements InterfaceC3986dR {
        public final /* synthetic */ C6190lF0 B;
        public final /* synthetic */ C4445f4 C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(C6190lF0 c6190lF0, C4445f4 c4445f4) {
            super(3);
            this.B = c6190lF0;
            this.C = c4445f4;
        }

        public final void a(InterfaceC8783ua interfaceC8783ua, QT0 qt0, InterfaceC10106zG0 interfaceC10106zG0) {
            G10.g(interfaceC8783ua, "applier");
            G10.g(qt0, "slots");
            G10.g(interfaceC10106zG0, "<anonymous parameter 2>");
            this.B.B = C6060kp.H0(qt0, this.C, interfaceC8783ua);
        }

        @Override // com.daaw.InterfaceC3986dR
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((InterfaceC8783ua) obj, (QT0) obj2, (InterfaceC10106zG0) obj3);
            return G91.a;
        }
    }

    /* JADX INFO: renamed from: com.daaw.kp$m */
    public static final class m extends AbstractC4192e90 implements LQ {
        public final /* synthetic */ List C;
        public final /* synthetic */ NT0 D;
        public final /* synthetic */ C0661Dl0 E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(List list, NT0 nt0, C0661Dl0 c0661Dl0) {
            super(0);
            this.C = list;
            this.D = nt0;
            this.E = c0661Dl0;
        }

        @Override // com.daaw.LQ
        public /* bridge */ /* synthetic */ Object invoke() {
            m55invoke();
            return G91.a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m55invoke() {
            C6060kp c6060kp = C6060kp.this;
            List list = this.C;
            NT0 nt0 = this.D;
            C0661Dl0 c0661Dl0 = this.E;
            List list2 = c6060kp.f;
            try {
                c6060kp.f = list;
                NT0 nt02 = c6060kp.H;
                int[] iArr = c6060kp.o;
                c6060kp.o = null;
                try {
                    c6060kp.H = nt0;
                    c0661Dl0.c();
                    c6060kp.K0(null, c0661Dl0.e(), c0661Dl0.f(), true);
                    G91 g91 = G91.a;
                } finally {
                    c6060kp.H = nt02;
                    c6060kp.o = iArr;
                }
            } finally {
                c6060kp.f = list2;
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.kp$n */
    public static final class n extends AbstractC4192e90 implements InterfaceC3986dR {
        public final /* synthetic */ C6190lF0 B;
        public final /* synthetic */ List C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(C6190lF0 c6190lF0, List list) {
            super(3);
            this.B = c6190lF0;
            this.C = list;
        }

        public final void a(InterfaceC8783ua interfaceC8783ua, QT0 qt0, InterfaceC10106zG0 interfaceC10106zG0) {
            G10.g(interfaceC8783ua, "applier");
            G10.g(qt0, "slots");
            G10.g(interfaceC10106zG0, "rememberManager");
            int i = this.B.B;
            if (i > 0) {
                interfaceC8783ua = new C10261zp0(interfaceC8783ua, i);
            }
            List list = this.C;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((InterfaceC3986dR) list.get(i2)).invoke(interfaceC8783ua, qt0, interfaceC10106zG0);
            }
        }

        @Override // com.daaw.InterfaceC3986dR
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((InterfaceC8783ua) obj, (QT0) obj2, (InterfaceC10106zG0) obj3);
            return G91.a;
        }
    }

    /* JADX INFO: renamed from: com.daaw.kp$o */
    public static final class o extends AbstractC4192e90 implements InterfaceC3986dR {
        public final /* synthetic */ C6190lF0 B;
        public final /* synthetic */ List C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(C6190lF0 c6190lF0, List list) {
            super(3);
            this.B = c6190lF0;
            this.C = list;
        }

        public final void a(InterfaceC8783ua interfaceC8783ua, QT0 qt0, InterfaceC10106zG0 interfaceC10106zG0) {
            G10.g(interfaceC8783ua, "applier");
            G10.g(qt0, "<anonymous parameter 1>");
            G10.g(interfaceC10106zG0, "<anonymous parameter 2>");
            int i = this.B.B;
            List list = this.C;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                Object obj = list.get(i2);
                int i3 = i + i2;
                interfaceC8783ua.b(i3, obj);
                interfaceC8783ua.h(i3, obj);
            }
        }

        @Override // com.daaw.InterfaceC3986dR
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((InterfaceC8783ua) obj, (QT0) obj2, (InterfaceC10106zG0) obj3);
            return G91.a;
        }
    }

    /* JADX INFO: renamed from: com.daaw.kp$p */
    public static final class p extends AbstractC4192e90 implements InterfaceC3986dR {
        public final /* synthetic */ C0661Dl0 C;
        public final /* synthetic */ C0661Dl0 D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(C0661Dl0 c0661Dl0, C0661Dl0 c0661Dl02) {
            super(3);
            this.C = c0661Dl0;
            this.D = c0661Dl02;
        }

        public final void a(InterfaceC8783ua interfaceC8783ua, QT0 qt0, InterfaceC10106zG0 interfaceC10106zG0) throws Throwable {
            G10.g(interfaceC8783ua, "<anonymous parameter 0>");
            G10.g(qt0, "slots");
            G10.g(interfaceC10106zG0, "<anonymous parameter 2>");
            C0548Cl0 c0548Cl0K = C6060kp.this.c.k(this.C);
            if (c0548Cl0K == null) {
                AbstractC6348lp.x("Could not resolve state for movable content");
                throw new D80();
            }
            List listR0 = qt0.r0(1, c0548Cl0K.a(), 1);
            if (listR0.isEmpty()) {
                return;
            }
            C1715Np c1715Np = (C1715Np) this.D.b();
            int size = listR0.size();
            for (int i = 0; i < size; i++) {
                Object objQ0 = qt0.Q0((C4445f4) listR0.get(i), 0);
                VE0 ve0 = objQ0 instanceof VE0 ? (VE0) objQ0 : null;
                if (ve0 != null) {
                    ve0.g(c1715Np);
                }
            }
        }

        @Override // com.daaw.InterfaceC3986dR
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) throws Throwable {
            a((InterfaceC8783ua) obj, (QT0) obj2, (InterfaceC10106zG0) obj3);
            return G91.a;
        }
    }

    /* JADX INFO: renamed from: com.daaw.kp$q */
    public static final class q extends AbstractC4192e90 implements LQ {
        public final /* synthetic */ C0661Dl0 C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(C0661Dl0 c0661Dl0) {
            super(0);
            this.C = c0661Dl0;
        }

        @Override // com.daaw.LQ
        public /* bridge */ /* synthetic */ Object invoke() {
            m56invoke();
            return G91.a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m56invoke() {
            C6060kp c6060kp = C6060kp.this;
            this.C.c();
            c6060kp.K0(null, this.C.e(), this.C.f(), true);
        }
    }

    /* JADX INFO: renamed from: com.daaw.kp$r */
    public static final class r extends AbstractC4192e90 implements InterfaceC3986dR {
        public final /* synthetic */ C6190lF0 B;
        public final /* synthetic */ List C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(C6190lF0 c6190lF0, List list) {
            super(3);
            this.B = c6190lF0;
            this.C = list;
        }

        public final void a(InterfaceC8783ua interfaceC8783ua, QT0 qt0, InterfaceC10106zG0 interfaceC10106zG0) {
            G10.g(interfaceC8783ua, "applier");
            G10.g(qt0, "slots");
            G10.g(interfaceC10106zG0, "rememberManager");
            int i = this.B.B;
            if (i > 0) {
                interfaceC8783ua = new C10261zp0(interfaceC8783ua, i);
            }
            List list = this.C;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((InterfaceC3986dR) list.get(i2)).invoke(interfaceC8783ua, qt0, interfaceC10106zG0);
            }
        }

        @Override // com.daaw.InterfaceC3986dR
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((InterfaceC8783ua) obj, (QT0) obj2, (InterfaceC10106zG0) obj3);
            return G91.a;
        }
    }

    /* JADX INFO: renamed from: com.daaw.kp$s */
    public static final class s extends AbstractC4192e90 implements InterfaceC3986dR {
        public static final s B = new s();

        public s() {
            super(3);
        }

        public final void a(InterfaceC8783ua interfaceC8783ua, QT0 qt0, InterfaceC10106zG0 interfaceC10106zG0) {
            G10.g(interfaceC8783ua, "applier");
            G10.g(qt0, "slots");
            G10.g(interfaceC10106zG0, "<anonymous parameter 2>");
            C6060kp.I0(qt0, interfaceC8783ua, 0);
            qt0.N();
        }

        @Override // com.daaw.InterfaceC3986dR
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((InterfaceC8783ua) obj, (QT0) obj2, (InterfaceC10106zG0) obj3);
            return G91.a;
        }
    }

    /* JADX INFO: renamed from: com.daaw.kp$t */
    public static final class t extends AbstractC4192e90 implements InterfaceC3429bR {
        public final /* synthetic */ Object B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(AbstractC0444Bl0 abstractC0444Bl0, Object obj) {
            super(2);
            this.B = obj;
        }

        public final void a(InterfaceC5781jp interfaceC5781jp, int i) {
            if ((i & 11) != 2 || !interfaceC5781jp.t()) {
                throw null;
            }
            interfaceC5781jp.B();
        }

        @Override // com.daaw.InterfaceC3429bR
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC5781jp) obj, ((Number) obj2).intValue());
            return G91.a;
        }
    }

    /* JADX INFO: renamed from: com.daaw.kp$u */
    public static final class u extends AbstractC4192e90 implements InterfaceC3986dR {
        public final /* synthetic */ Object[] B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(Object[] objArr) {
            super(3);
            this.B = objArr;
        }

        public final void a(InterfaceC8783ua interfaceC8783ua, QT0 qt0, InterfaceC10106zG0 interfaceC10106zG0) {
            G10.g(interfaceC8783ua, "applier");
            G10.g(qt0, "<anonymous parameter 1>");
            G10.g(interfaceC10106zG0, "<anonymous parameter 2>");
            int length = this.B.length;
            for (int i = 0; i < length; i++) {
                interfaceC8783ua.c(this.B[i]);
            }
        }

        @Override // com.daaw.InterfaceC3986dR
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((InterfaceC8783ua) obj, (QT0) obj2, (InterfaceC10106zG0) obj3);
            return G91.a;
        }
    }

    /* JADX INFO: renamed from: com.daaw.kp$v */
    public static final class v extends AbstractC4192e90 implements InterfaceC3986dR {
        public final /* synthetic */ int B;
        public final /* synthetic */ int C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(int i, int i2) {
            super(3);
            this.B = i;
            this.C = i2;
        }

        public final void a(InterfaceC8783ua interfaceC8783ua, QT0 qt0, InterfaceC10106zG0 interfaceC10106zG0) {
            G10.g(interfaceC8783ua, "applier");
            G10.g(qt0, "<anonymous parameter 1>");
            G10.g(interfaceC10106zG0, "<anonymous parameter 2>");
            interfaceC8783ua.f(this.B, this.C);
        }

        @Override // com.daaw.InterfaceC3986dR
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((InterfaceC8783ua) obj, (QT0) obj2, (InterfaceC10106zG0) obj3);
            return G91.a;
        }
    }

    /* JADX INFO: renamed from: com.daaw.kp$w */
    public static final class w extends AbstractC4192e90 implements InterfaceC3986dR {
        public final /* synthetic */ int B;
        public final /* synthetic */ int C;
        public final /* synthetic */ int D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w(int i, int i2, int i3) {
            super(3);
            this.B = i;
            this.C = i2;
            this.D = i3;
        }

        public final void a(InterfaceC8783ua interfaceC8783ua, QT0 qt0, InterfaceC10106zG0 interfaceC10106zG0) {
            G10.g(interfaceC8783ua, "applier");
            G10.g(qt0, "<anonymous parameter 1>");
            G10.g(interfaceC10106zG0, "<anonymous parameter 2>");
            interfaceC8783ua.e(this.B, this.C, this.D);
        }

        @Override // com.daaw.InterfaceC3986dR
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((InterfaceC8783ua) obj, (QT0) obj2, (InterfaceC10106zG0) obj3);
            return G91.a;
        }
    }

    /* JADX INFO: renamed from: com.daaw.kp$x */
    public static final class x extends AbstractC4192e90 implements InterfaceC3986dR {
        public final /* synthetic */ int B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x(int i) {
            super(3);
            this.B = i;
        }

        public final void a(InterfaceC8783ua interfaceC8783ua, QT0 qt0, InterfaceC10106zG0 interfaceC10106zG0) {
            G10.g(interfaceC8783ua, "<anonymous parameter 0>");
            G10.g(qt0, "slots");
            G10.g(interfaceC10106zG0, "<anonymous parameter 2>");
            qt0.z(this.B);
        }

        @Override // com.daaw.InterfaceC3986dR
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((InterfaceC8783ua) obj, (QT0) obj2, (InterfaceC10106zG0) obj3);
            return G91.a;
        }
    }

    /* JADX INFO: renamed from: com.daaw.kp$y */
    public static final class y extends AbstractC4192e90 implements InterfaceC3986dR {
        public final /* synthetic */ int B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y(int i) {
            super(3);
            this.B = i;
        }

        public final void a(InterfaceC8783ua interfaceC8783ua, QT0 qt0, InterfaceC10106zG0 interfaceC10106zG0) {
            G10.g(interfaceC8783ua, "applier");
            G10.g(qt0, "<anonymous parameter 1>");
            G10.g(interfaceC10106zG0, "<anonymous parameter 2>");
            int i = this.B;
            for (int i2 = 0; i2 < i; i2++) {
                interfaceC8783ua.g();
            }
        }

        @Override // com.daaw.InterfaceC3986dR
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((InterfaceC8783ua) obj, (QT0) obj2, (InterfaceC10106zG0) obj3);
            return G91.a;
        }
    }

    /* JADX INFO: renamed from: com.daaw.kp$z */
    public static final class z extends AbstractC4192e90 implements InterfaceC3986dR {
        public final /* synthetic */ OT0 B;
        public final /* synthetic */ C4445f4 C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public z(OT0 ot0, C4445f4 c4445f4) {
            super(3);
            this.B = ot0;
            this.C = c4445f4;
        }

        public final void a(InterfaceC8783ua interfaceC8783ua, QT0 qt0, InterfaceC10106zG0 interfaceC10106zG0) {
            G10.g(interfaceC8783ua, "<anonymous parameter 0>");
            G10.g(qt0, "slots");
            G10.g(interfaceC10106zG0, "<anonymous parameter 2>");
            qt0.D();
            OT0 ot0 = this.B;
            qt0.o0(ot0, this.C.d(ot0));
            qt0.O();
        }

        @Override // com.daaw.InterfaceC3986dR
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((InterfaceC8783ua) obj, (QT0) obj2, (InterfaceC10106zG0) obj3);
            return G91.a;
        }
    }

    public C6060kp(InterfaceC8783ua interfaceC8783ua, AbstractC1300Jp abstractC1300Jp, OT0 ot0, Set set, List list, List list2, InterfaceC2165Rs interfaceC2165Rs) {
        G10.g(interfaceC8783ua, "applier");
        G10.g(abstractC1300Jp, "parentContext");
        G10.g(ot0, "slotTable");
        G10.g(set, "abandonSet");
        G10.g(list, "changes");
        G10.g(list2, "lateChanges");
        G10.g(interfaceC2165Rs, "composition");
        this.b = interfaceC8783ua;
        this.c = abstractC1300Jp;
        this.d = ot0;
        this.e = set;
        this.f = list;
        this.g = list2;
        this.h = interfaceC2165Rs;
        this.i = new PV0();
        this.l = new K00();
        this.n = new K00();
        this.t = new ArrayList();
        this.u = new K00();
        this.v = AbstractC7878rJ.a();
        this.w = new HashMap();
        this.y = new K00();
        this.A = -1;
        this.C = AbstractC5124hU0.B();
        this.E = new PV0();
        NT0 nt0H = ot0.H();
        nt0H.d();
        this.H = nt0H;
        OT0 ot02 = new OT0();
        this.I = ot02;
        QT0 qt0I = ot02.I();
        qt0I.F();
        this.J = qt0I;
        NT0 nt0H2 = this.I.H();
        try {
            C4445f4 c4445f4A = nt0H2.a(0);
            nt0H2.d();
            this.M = c4445f4A;
            this.N = new ArrayList();
            this.R = new PV0();
            this.U = true;
            this.V = new K00();
            this.W = new PV0();
            this.X = -1;
            this.Y = -1;
            this.Z = -1;
        } catch (Throwable th) {
            nt0H2.d();
            throw th;
        }
    }

    public static final int G0(QT0 qt0) {
        int iU = qt0.U();
        int iV = qt0.V();
        while (iV >= 0 && !qt0.k0(iV)) {
            iV = qt0.y0(iV);
        }
        int iC0 = iV + 1;
        int iW0 = 0;
        while (iC0 < iU) {
            if (qt0.f0(iU, iC0)) {
                if (qt0.k0(iC0)) {
                    iW0 = 0;
                }
                iC0++;
            } else {
                iW0 += qt0.k0(iC0) ? 1 : qt0.w0(iC0);
                iC0 += qt0.c0(iC0);
            }
        }
        return iW0;
    }

    public static final int H0(QT0 qt0, C4445f4 c4445f4, InterfaceC8783ua interfaceC8783ua) {
        int iB = qt0.B(c4445f4);
        AbstractC6348lp.X(qt0.U() < iB);
        I0(qt0, interfaceC8783ua, iB);
        int iG0 = G0(qt0);
        while (qt0.U() < iB) {
            if (qt0.e0(iB)) {
                if (qt0.j0()) {
                    interfaceC8783ua.c(qt0.u0(qt0.U()));
                    iG0 = 0;
                }
                qt0.T0();
            } else {
                iG0 += qt0.N0();
            }
        }
        AbstractC6348lp.X(qt0.U() == iB);
        return iG0;
    }

    public static final void I0(QT0 qt0, InterfaceC8783ua interfaceC8783ua, int i) {
        while (!qt0.g0(i)) {
            qt0.O0();
            if (qt0.k0(qt0.V())) {
                interfaceC8783ua.g();
            }
            qt0.N();
        }
    }

    public static /* synthetic */ void U0(C6060kp c6060kp, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z2 = false;
        }
        c6060kp.T0(z2);
    }

    public static /* synthetic */ Object Y0(C6060kp c6060kp, InterfaceC2165Rs interfaceC2165Rs, InterfaceC2165Rs interfaceC2165Rs2, Integer num, List list, LQ lq, int i, Object obj) {
        if ((i & 1) != 0) {
            interfaceC2165Rs = null;
        }
        if ((i & 2) != 0) {
            interfaceC2165Rs2 = null;
        }
        if ((i & 4) != 0) {
            num = null;
        }
        if ((i & 8) != 0) {
            list = AbstractC1599Mm.k();
        }
        return c6060kp.X0(interfaceC2165Rs, interfaceC2165Rs2, num, list, lq);
    }

    public static /* synthetic */ InterfaceC5248hu0 p0(C6060kp c6060kp, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        return c6060kp.o0(num);
    }

    public static /* synthetic */ void p1(C6060kp c6060kp, boolean z2, InterfaceC3986dR interfaceC3986dR, int i, Object obj) {
        if ((i & 1) != 0) {
            z2 = false;
        }
        c6060kp.o1(z2, interfaceC3986dR);
    }

    public static final int u1(C6060kp c6060kp, int i, boolean z2, int i2) {
        if (!c6060kp.H.C(i)) {
            if (!c6060kp.H.e(i)) {
                return c6060kp.H.K(i);
            }
            int iB = c6060kp.H.B(i) + i;
            int iB2 = i + 1;
            int iU1 = 0;
            while (iB2 < iB) {
                boolean zG = c6060kp.H.G(iB2);
                if (zG) {
                    c6060kp.S0();
                    c6060kp.d1(c6060kp.H.I(iB2));
                }
                iU1 += u1(c6060kp, iB2, zG || z2, zG ? 0 : i2 + iU1);
                if (zG) {
                    c6060kp.S0();
                    c6060kp.q1();
                }
                iB2 += c6060kp.H.B(iB2);
            }
            return iU1;
        }
        Object objA = c6060kp.H.A(i);
        if (objA == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.compose.runtime.MovableContent<kotlin.Any?>");
        }
        AbstractC6314li0.a(objA);
        Object objY = c6060kp.H.y(i, 0);
        C4445f4 c4445f4A = c6060kp.H.a(i);
        List listB = AbstractC6348lp.B(c6060kp.t, i, c6060kp.H.B(i) + i);
        ArrayList arrayList = new ArrayList(listB.size());
        int size = listB.size();
        for (int i3 = 0; i3 < size; i3++) {
            S10 s10 = (S10) listB.get(i3);
            arrayList.add(D61.a(s10.c(), s10.a()));
        }
        C0661Dl0 c0661Dl0 = new C0661Dl0(null, objY, c6060kp.B0(), c6060kp.d, c4445f4A, arrayList, c6060kp.o0(Integer.valueOf(i)));
        c6060kp.c.b(c0661Dl0);
        c6060kp.m1();
        c6060kp.a1(c6060kp.new D(c0661Dl0, c4445f4A));
        if (!z2) {
            return c6060kp.H.K(i);
        }
        c6060kp.S0();
        c6060kp.V0();
        c6060kp.Q0();
        int iK = c6060kp.H.G(i) ? 1 : c6060kp.H.K(i);
        if (iK > 0) {
            c6060kp.l1(i2, iK);
        }
        return 0;
    }

    @Override // com.daaw.InterfaceC5781jp
    public void A() {
        int i = 125;
        if (!n() && (!this.z ? this.H.n() == 126 : this.H.n() == 125)) {
            i = 126;
        }
        z1(i, null, true, null);
        this.s = true;
    }

    public final boolean A0() {
        return this.B > 0;
    }

    public final void A1(int i) {
        z1(i, null, false, null);
    }

    @Override // com.daaw.InterfaceC5781jp
    public void B() {
        if (!(this.m == 0)) {
            AbstractC6348lp.x("No nodes can be emitted before calling skipAndEndGroup");
            throw new D80();
        }
        VE0 ve0C0 = C0();
        if (ve0C0 != null) {
            ve0C0.z();
        }
        if (this.t.isEmpty()) {
            y1();
        } else {
            Z0();
        }
    }

    public InterfaceC2165Rs B0() {
        return this.h;
    }

    public final void B1(int i, Object obj) {
        z1(i, obj, false, null);
    }

    @Override // com.daaw.InterfaceC5781jp
    public InterfaceC4684ft C() {
        return this.c.g();
    }

    public final VE0 C0() {
        PV0 pv0 = this.E;
        if (this.B == 0 && pv0.d()) {
            return (VE0) pv0.e();
        }
        return null;
    }

    public final void C1(boolean z2, Object obj) {
        if (z2) {
            this.H.S();
            return;
        }
        if (obj != null && this.H.l() != obj) {
            p1(this, false, new G(obj), 1, null);
        }
        this.H.R();
    }

    @Override // com.daaw.InterfaceC5781jp
    public void D() {
        u0();
        u0();
        this.x = AbstractC6348lp.t(this.y.h());
        this.L = null;
    }

    public final Object D0(NT0 nt0) {
        return nt0.I(nt0.s());
    }

    public final void D1() {
        this.H = this.d.H();
        A1(100);
        this.c.n();
        this.v = this.c.e();
        this.y.i(AbstractC6348lp.u(this.x));
        this.x = P(this.v);
        this.L = null;
        if (!this.q) {
            this.q = this.c.d();
        }
        Set set = (Set) v1(AbstractC5832k00.a(), this.v);
        if (set != null) {
            set.add(this.d);
            this.c.l(set);
        }
        A1(this.c.f());
    }

    @Override // com.daaw.InterfaceC5781jp
    public void E(LQ lq) {
        G10.g(lq, "factory");
        O1();
        if (!n()) {
            AbstractC6348lp.x("createNode() can only be called when inserting");
            throw new D80();
        }
        int iE = this.l.e();
        QT0 qt0 = this.J;
        C4445f4 c4445f4A = qt0.A(qt0.V());
        this.m++;
        g1(new C6064d(lq, c4445f4A, iE));
        i1(new C6065e(c4445f4A, iE));
    }

    public final int E0(NT0 nt0, int i) {
        Object objW;
        if (!nt0.D(i)) {
            int iZ = nt0.z(i);
            return (iZ != 207 || (objW = nt0.w(i)) == null || G10.c(objW, InterfaceC5781jp.a.a())) ? iZ : objW.hashCode();
        }
        Object objA = nt0.A(i);
        if (objA != null) {
            return objA instanceof Enum ? ((Enum) objA).ordinal() : objA.hashCode();
        }
        return 0;
    }

    public final boolean E1(VE0 ve0, Object obj) {
        G10.g(ve0, "scope");
        C4445f4 c4445f4J = ve0.j();
        if (c4445f4J == null) {
            return false;
        }
        int iD = c4445f4J.d(this.d);
        if (!this.F || iD < this.H.k()) {
            return false;
        }
        AbstractC6348lp.N(this.t, iD, ve0, obj);
        return true;
    }

    @Override // com.daaw.InterfaceC5781jp
    public boolean F() {
        VE0 ve0C0;
        return this.x || ((ve0C0 = C0()) != null && ve0C0.n());
    }

    public void F0(List list) {
        NT0 nt0H;
        List list2;
        G10.g(list, "references");
        List list3 = this.g;
        List list4 = this.f;
        try {
            this.f = list3;
            a1(AbstractC6348lp.e);
            int size = list.size();
            for (int i = 0; i < size; i++) {
                C0576Cs0 c0576Cs0 = (C0576Cs0) list.get(i);
                C0661Dl0 c0661Dl0 = (C0661Dl0) c0576Cs0.a();
                C0661Dl0 c0661Dl02 = (C0661Dl0) c0576Cs0.b();
                C4445f4 c4445f4A = c0661Dl0.a();
                int iE = c0661Dl0.g().e(c4445f4A);
                C6190lF0 c6190lF0 = new C6190lF0();
                V0();
                a1(new l(c6190lF0, c4445f4A));
                if (c0661Dl02 == null) {
                    if (G10.c(c0661Dl0.g(), this.I)) {
                        n0();
                    }
                    nt0H = c0661Dl0.g().H();
                    try {
                        nt0H.N(iE);
                        this.S = iE;
                        ArrayList arrayList = new ArrayList();
                        Y0(this, null, null, null, null, new m(arrayList, nt0H, c0661Dl0), 15, null);
                        if (!arrayList.isEmpty()) {
                            a1(new n(c6190lF0, arrayList));
                        }
                        G91 g91 = G91.a;
                        nt0H.d();
                    } catch (Throwable th) {
                        throw th;
                    }
                } else {
                    List listV = AbstractC6348lp.v(c0661Dl02.g(), c0661Dl02.a());
                    if (!listV.isEmpty()) {
                        a1(new o(c6190lF0, listV));
                        int iE2 = this.d.e(c4445f4A);
                        J1(iE2, N1(iE2) + listV.size());
                    }
                    a1(new p(c0661Dl02, c0661Dl0));
                    OT0 ot0G = c0661Dl02.g();
                    nt0H = ot0G.H();
                    try {
                        NT0 nt0 = this.H;
                        int[] iArr = this.o;
                        this.o = null;
                        try {
                            this.H = nt0H;
                            int iE3 = ot0G.e(c0661Dl02.a());
                            nt0H.N(iE3);
                            this.S = iE3;
                            ArrayList arrayList2 = new ArrayList();
                            List list5 = this.f;
                            try {
                                this.f = arrayList2;
                                list2 = list5;
                            } catch (Throwable th2) {
                                th = th2;
                                list2 = list5;
                            }
                            try {
                                X0(c0661Dl02.b(), c0661Dl0.b(), Integer.valueOf(nt0H.k()), c0661Dl02.d(), new q(c0661Dl0));
                                G91 g912 = G91.a;
                                this.f = list2;
                                if (!arrayList2.isEmpty()) {
                                    a1(new r(c6190lF0, arrayList2));
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                this.f = list2;
                                throw th;
                            }
                        } finally {
                            this.H = nt0;
                            this.o = iArr;
                        }
                    } finally {
                        nt0H.d();
                    }
                }
                a1(AbstractC6348lp.b);
            }
            a1(s.B);
            this.S = 0;
            G91 g913 = G91.a;
            this.f = list4;
            j0();
        } catch (Throwable th4) {
            this.f = list4;
            throw th4;
        }
    }

    public final void F1(int i, Object obj, Object obj2) {
        if (obj != null) {
            if (obj instanceof Enum) {
                G1(((Enum) obj).ordinal());
                return;
            } else {
                G1(obj.hashCode());
                return;
            }
        }
        if (obj2 == null || i != 207 || G10.c(obj2, InterfaceC5781jp.a.a())) {
            G1(i);
        } else {
            G1(obj2.hashCode());
        }
    }

    @Override // com.daaw.InterfaceC5781jp
    public void G() {
        O1();
        if (n()) {
            AbstractC6348lp.x("useNode() called while inserting");
            throw new D80();
        }
        d1(D0(this.H));
    }

    public final void G1(int i) {
        this.P = i ^ Integer.rotateLeft(I(), 3);
    }

    @Override // com.daaw.InterfaceC5781jp
    public void H(Object obj) {
        M1(obj);
    }

    public final void H1(int i, Object obj, Object obj2) {
        if (obj != null) {
            if (obj instanceof Enum) {
                I1(((Enum) obj).ordinal());
                return;
            } else {
                I1(obj.hashCode());
                return;
            }
        }
        if (obj2 == null || i != 207 || G10.c(obj2, InterfaceC5781jp.a.a())) {
            I1(i);
        } else {
            I1(obj2.hashCode());
        }
    }

    @Override // com.daaw.InterfaceC5781jp
    public int I() {
        return this.P;
    }

    public final void I1(int i) {
        this.P = Integer.rotateRight(i ^ I(), 3);
    }

    @Override // com.daaw.InterfaceC5781jp
    public AbstractC1300Jp J() {
        B1(206, AbstractC6348lp.L());
        Object objM0 = M0();
        C6061a c6061a = objM0 instanceof C6061a ? (C6061a) objM0 : null;
        if (c6061a == null) {
            c6061a = new C6061a(new C6062b(I(), this.q));
            M1(c6061a);
        }
        c6061a.a().t(p0(this, null, 1, null));
        u0();
        return c6061a.a();
    }

    public final int J0(int i) {
        return (-2) - i;
    }

    public final void J1(int i, int i2) {
        if (N1(i) != i2) {
            if (i < 0) {
                HashMap map = this.p;
                if (map == null) {
                    map = new HashMap();
                    this.p = map;
                }
                map.put(Integer.valueOf(i), Integer.valueOf(i2));
                return;
            }
            int[] iArr = this.o;
            if (iArr == null) {
                int[] iArr2 = new int[this.H.u()];
                AbstractC5152hb.q(iArr2, -1, 0, 0, 6, null);
                this.o = iArr2;
                iArr = iArr2;
            }
            iArr[i] = i2;
        }
    }

    @Override // com.daaw.InterfaceC5781jp
    public void K() {
        u0();
    }

    public final void K0(AbstractC0444Bl0 abstractC0444Bl0, InterfaceC5248hu0 interfaceC5248hu0, Object obj, boolean z2) {
        r(126665345, abstractC0444Bl0);
        P(obj);
        int I2 = I();
        this.P = 126665345;
        if (n()) {
            QT0.m0(this.J, 0, 1, null);
        }
        boolean z3 = (n() || G10.c(this.H.l(), interfaceC5248hu0)) ? false : true;
        if (z3) {
            this.w.put(Integer.valueOf(this.H.k()), interfaceC5248hu0);
        }
        z1(202, AbstractC6348lp.F(), false, interfaceC5248hu0);
        if (!n() || z2) {
            boolean z4 = this.x;
            this.x = z3;
            O2.b(this, AbstractC1815Oo.c(1378964644, true, new t(abstractC0444Bl0, obj)));
            this.x = z4;
        } else {
            this.K = true;
            this.L = null;
            QT0 qt0 = this.J;
            this.c.h(new C0661Dl0(abstractC0444Bl0, obj, B0(), this.I, qt0.A(qt0.y0(qt0.V())), AbstractC1599Mm.k(), p0(this, null, 1, null)));
        }
        u0();
        this.P = I2;
        K();
    }

    public final void K1(int i, int i2) {
        int iN1 = N1(i);
        if (iN1 != i2) {
            int i3 = i2 - iN1;
            int iB = this.i.b() - 1;
            while (i != -1) {
                int iN12 = N1(i) + i3;
                J1(i, iN12);
                int i4 = iB;
                while (true) {
                    if (-1 < i4) {
                        C1005Gt0 c1005Gt0 = (C1005Gt0) this.i.f(i4);
                        if (c1005Gt0 != null && c1005Gt0.n(i, iN12)) {
                            iB = i4 - 1;
                            break;
                        }
                        i4--;
                    } else {
                        break;
                    }
                }
                if (i < 0) {
                    i = this.H.s();
                } else if (this.H.G(i)) {
                    return;
                } else {
                    i = this.H.M(i);
                }
            }
        }
    }

    @Override // com.daaw.InterfaceC5781jp
    public void L() {
        u0();
    }

    public final boolean L0() {
        return this.F;
    }

    public final InterfaceC5248hu0 L1(InterfaceC5248hu0 interfaceC5248hu0, InterfaceC5248hu0 interfaceC5248hu02) {
        InterfaceC5248hu0.a aVarBuilder = interfaceC5248hu0.builder();
        aVarBuilder.putAll(interfaceC5248hu02);
        InterfaceC5248hu0 interfaceC5248hu0A = aVarBuilder.a();
        B1(204, AbstractC6348lp.J());
        P(interfaceC5248hu0A);
        P(interfaceC5248hu02);
        u0();
        return interfaceC5248hu0A;
    }

    @Override // com.daaw.InterfaceC5781jp
    public void M() {
        t0(true);
    }

    public final Object M0() {
        if (!n()) {
            return this.z ? InterfaceC5781jp.a.a() : this.H.H();
        }
        P1();
        return InterfaceC5781jp.a.a();
    }

    public final void M1(Object obj) {
        if (!n()) {
            int iQ = this.H.q() - 1;
            if (obj instanceof AG0) {
                this.e.add(obj);
            }
            o1(true, new I(obj, iQ));
            return;
        }
        this.J.X0(obj);
        if (obj instanceof AG0) {
            a1(new H(obj));
            this.e.add(obj);
        }
    }

    @Override // com.daaw.InterfaceC5781jp
    public void N() {
        u0();
        VE0 ve0C0 = C0();
        if (ve0C0 == null || !ve0C0.r()) {
            return;
        }
        ve0C0.B(true);
    }

    public final Object N0(NT0 nt0, int i) {
        return nt0.I(i);
    }

    public final int N1(int i) {
        int i2;
        Integer num;
        if (i >= 0) {
            int[] iArr = this.o;
            return (iArr == null || (i2 = iArr[i]) < 0) ? this.H.K(i) : i2;
        }
        HashMap map = this.p;
        if (map == null || (num = (Integer) map.get(Integer.valueOf(i))) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // com.daaw.InterfaceC5781jp
    public Object O(AbstractC2049Qp abstractC2049Qp) {
        G10.g(abstractC2049Qp, SubscriberAttributeKt.JSON_NAME_KEY);
        return v1(abstractC2049Qp, p0(this, null, 1, null));
    }

    public final int O0(int i, int i2, int i3, int i4) {
        int iM = this.H.M(i2);
        while (iM != i3 && !this.H.G(iM)) {
            iM = this.H.M(iM);
        }
        if (this.H.G(iM)) {
            i4 = 0;
        }
        if (iM == i2) {
            return i4;
        }
        int iN1 = (N1(iM) - this.H.K(i2)) + i4;
        loop1: while (i4 < iN1 && iM != i) {
            iM++;
            while (iM < i) {
                int iB = this.H.B(iM) + iM;
                if (i >= iB) {
                    i4 += N1(iM);
                    iM = iB;
                }
            }
            break loop1;
        }
        return i4;
    }

    public final void O1() {
        if (this.s) {
            this.s = false;
        } else {
            AbstractC6348lp.x("A call to createNode(), emitNode() or useNode() expected was not expected");
            throw new D80();
        }
    }

    @Override // com.daaw.InterfaceC5781jp
    public boolean P(Object obj) {
        if (G10.c(M0(), obj)) {
            return false;
        }
        M1(obj);
        return true;
    }

    public final void P0(LQ lq) {
        G10.g(lq, "block");
        if (this.F) {
            AbstractC6348lp.x("Preparing a composition while composing is not supported");
            throw new D80();
        }
        this.F = true;
        try {
            lq.invoke();
        } finally {
            this.F = false;
        }
    }

    public final void P1() {
        if (this.s) {
            AbstractC6348lp.x("A call to createNode(), emitNode() or useNode() expected");
            throw new D80();
        }
    }

    public final void Q() {
        j0();
        this.i.a();
        this.l.a();
        this.n.a();
        this.u.a();
        this.y.a();
        this.w.clear();
        this.H.d();
        this.P = 0;
        this.B = 0;
        this.s = false;
        this.F = false;
        this.r = false;
    }

    public final void Q0() {
        if (this.R.d()) {
            R0(this.R.i());
            this.R.a();
        }
    }

    public final void R0(Object[] objArr) {
        a1(new u(objArr));
    }

    public final void S0() {
        int i = this.a0;
        this.a0 = 0;
        if (i > 0) {
            int i2 = this.X;
            if (i2 >= 0) {
                this.X = -1;
                b1(new v(i2, i));
                return;
            }
            int i3 = this.Y;
            this.Y = -1;
            int i4 = this.Z;
            this.Z = -1;
            b1(new w(i3, i4, i));
        }
    }

    public final void T0(boolean z2) {
        int iS = z2 ? this.H.s() : this.H.k();
        int i = iS - this.S;
        if (!(i >= 0)) {
            AbstractC6348lp.x("Tried to seek backward");
            throw new D80();
        }
        if (i > 0) {
            a1(new x(i));
            this.S = iS;
        }
    }

    public final void V0() {
        int i = this.Q;
        if (i > 0) {
            this.Q = 0;
            a1(new y(i));
        }
    }

    public final boolean W0(VX vx) {
        G10.g(vx, "invalidationsRequested");
        if (!this.f.isEmpty()) {
            AbstractC6348lp.x("Expected applyChanges() to have been called");
            throw new D80();
        }
        if (!vx.h() && this.t.isEmpty() && !this.r) {
            return false;
        }
        r0(vx, null);
        return !this.f.isEmpty();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0053 A[Catch: all -> 0x003a, TRY_LEAVE, TryCatch #0 {all -> 0x003a, blocks: (B:3:0x0007, B:5:0x0014, B:7:0x0028, B:8:0x002c, B:10:0x0032, B:14:0x0040, B:13:0x003c, B:17:0x0047, B:19:0x004d, B:21:0x0053), top: B:26:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object X0(com.daaw.InterfaceC2165Rs r9, com.daaw.InterfaceC2165Rs r10, java.lang.Integer r11, java.util.List r12, com.daaw.LQ r13) {
        /*
            r8 = this;
            boolean r0 = r8.U
            boolean r1 = r8.F
            int r2 = r8.k
            r3 = 0
            r8.U = r3     // Catch: java.lang.Throwable -> L3a
            r4 = 1
            r8.F = r4     // Catch: java.lang.Throwable -> L3a
            r8.k = r3     // Catch: java.lang.Throwable -> L3a
            int r4 = r12.size()     // Catch: java.lang.Throwable -> L3a
        L12:
            if (r3 >= r4) goto L43
            java.lang.Object r5 = r12.get(r3)     // Catch: java.lang.Throwable -> L3a
            com.daaw.Cs0 r5 = (com.daaw.C0576Cs0) r5     // Catch: java.lang.Throwable -> L3a
            java.lang.Object r6 = r5.a()     // Catch: java.lang.Throwable -> L3a
            com.daaw.VE0 r6 = (com.daaw.VE0) r6     // Catch: java.lang.Throwable -> L3a
            java.lang.Object r5 = r5.b()     // Catch: java.lang.Throwable -> L3a
            com.daaw.WX r5 = (com.daaw.WX) r5     // Catch: java.lang.Throwable -> L3a
            if (r5 == 0) goto L3c
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> L3a
        L2c:
            boolean r7 = r5.hasNext()     // Catch: java.lang.Throwable -> L3a
            if (r7 == 0) goto L40
            java.lang.Object r7 = r5.next()     // Catch: java.lang.Throwable -> L3a
            r8.E1(r6, r7)     // Catch: java.lang.Throwable -> L3a
            goto L2c
        L3a:
            r9 = move-exception
            goto L5e
        L3c:
            r5 = 0
            r8.E1(r6, r5)     // Catch: java.lang.Throwable -> L3a
        L40:
            int r3 = r3 + 1
            goto L12
        L43:
            if (r9 == 0) goto L53
            if (r11 == 0) goto L4c
            int r11 = r11.intValue()     // Catch: java.lang.Throwable -> L3a
            goto L4d
        L4c:
            r11 = -1
        L4d:
            java.lang.Object r9 = r9.q(r10, r11, r13)     // Catch: java.lang.Throwable -> L3a
            if (r9 != 0) goto L57
        L53:
            java.lang.Object r9 = r13.invoke()     // Catch: java.lang.Throwable -> L3a
        L57:
            r8.U = r0
            r8.F = r1
            r8.k = r2
            return r9
        L5e:
            r8.U = r0
            r8.F = r1
            r8.k = r2
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C6060kp.X0(com.daaw.Rs, com.daaw.Rs, java.lang.Integer, java.util.List, com.daaw.LQ):java.lang.Object");
    }

    public final void Z0() {
        boolean z2 = this.F;
        this.F = true;
        int iS = this.H.s();
        int iB = this.H.B(iS) + iS;
        int i = this.k;
        int I2 = I();
        int i2 = this.m;
        S10 s10E = AbstractC6348lp.E(this.t, this.H.k(), iB);
        boolean z3 = false;
        int i3 = iS;
        while (s10E != null) {
            int iB2 = s10E.b();
            AbstractC6348lp.V(this.t, iB2);
            if (s10E.d()) {
                this.H.N(iB2);
                int iK = this.H.k();
                r1(i3, iK, iS);
                this.k = O0(iB2, iK, iS, i);
                this.P = m0(this.H.M(iK), iS, I2);
                this.L = null;
                s10E.c().h(this);
                this.L = null;
                this.H.O(iS);
                i3 = iK;
                z3 = true;
            } else {
                this.E.h(s10E.c());
                s10E.c().y();
                this.E.g();
            }
            s10E = AbstractC6348lp.E(this.t, this.H.k(), iB);
        }
        if (z3) {
            r1(i3, iS, iS);
            this.H.Q();
            int iN1 = N1(iS);
            this.k = i + iN1;
            this.m = i2 + iN1;
        } else {
            y1();
        }
        this.P = I2;
        this.F = z2;
    }

    @Override // com.daaw.InterfaceC5781jp
    public void a() {
        this.q = true;
    }

    public final void a1(InterfaceC3986dR interfaceC3986dR) {
        this.f.add(interfaceC3986dR);
    }

    @Override // com.daaw.InterfaceC5781jp
    public UE0 b() {
        return C0();
    }

    public final void b1(InterfaceC3986dR interfaceC3986dR) {
        V0();
        Q0();
        a1(interfaceC3986dR);
    }

    @Override // com.daaw.InterfaceC5781jp
    public boolean c(boolean z2) {
        Object objM0 = M0();
        if ((objM0 instanceof Boolean) && z2 == ((Boolean) objM0).booleanValue()) {
            return false;
        }
        M1(Boolean.valueOf(z2));
        return true;
    }

    public final void c1() {
        t1(this.H.k());
        n1(AbstractC6348lp.a);
        this.S += this.H.p();
    }

    @Override // com.daaw.InterfaceC5781jp
    public void d() {
        if (this.z && this.H.s() == this.A) {
            this.A = -1;
            this.z = false;
        }
        t0(false);
    }

    public final void d1(Object obj) {
        this.R.h(obj);
    }

    @Override // com.daaw.InterfaceC5781jp
    public void e(int i) {
        z1(i, null, false, null);
    }

    public final void e1() {
        int iS = this.H.s();
        if (!(this.V.g(-1) <= iS)) {
            AbstractC6348lp.x("Missed recording an endGroup");
            throw new D80();
        }
        if (this.V.g(-1) == iS) {
            this.V.h();
            p1(this, false, AbstractC6348lp.c, 1, null);
        }
    }

    @Override // com.daaw.InterfaceC5781jp
    public Object f() {
        return M0();
    }

    public final void f1() {
        if (this.T) {
            p1(this, false, AbstractC6348lp.c, 1, null);
            this.T = false;
        }
    }

    @Override // com.daaw.InterfaceC5781jp
    public void g(LQ lq) {
        G10.g(lq, "effect");
        a1(new B(lq));
    }

    public final void g1(InterfaceC3986dR interfaceC3986dR) {
        this.N.add(interfaceC3986dR);
    }

    @Override // com.daaw.InterfaceC5781jp
    public boolean h(float f) {
        Object objM0 = M0();
        if ((objM0 instanceof Float) && f == ((Number) objM0).floatValue()) {
            return false;
        }
        M1(Float.valueOf(f));
        return true;
    }

    public final void h0() {
        VE0 ve0;
        if (n()) {
            VE0 ve02 = new VE0((C1715Np) B0());
            this.E.h(ve02);
            M1(ve02);
            ve02.H(this.D);
            return;
        }
        S10 s10V = AbstractC6348lp.V(this.t, this.H.s());
        Object objH = this.H.H();
        if (G10.c(objH, InterfaceC5781jp.a.a())) {
            ve0 = new VE0((C1715Np) B0());
            M1(ve0);
        } else {
            if (objH == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl");
            }
            ve0 = (VE0) objH;
        }
        ve0.D(s10V != null);
        this.E.h(ve0);
        ve0.H(this.D);
    }

    public final void h1(C4445f4 c4445f4) {
        if (this.N.isEmpty()) {
            n1(new z(this.I, c4445f4));
            return;
        }
        List listO0 = AbstractC2455Um.O0(this.N);
        this.N.clear();
        V0();
        Q0();
        n1(new A(this.I, c4445f4, listO0));
    }

    @Override // com.daaw.InterfaceC5781jp
    public void i() {
        this.z = this.A >= 0;
    }

    public final void i0() {
        this.w.clear();
    }

    public final void i1(InterfaceC3986dR interfaceC3986dR) {
        this.W.h(interfaceC3986dR);
    }

    @Override // com.daaw.InterfaceC5781jp
    public void j(UE0 ue0) {
        G10.g(ue0, "scope");
        VE0 ve0 = ue0 instanceof VE0 ? (VE0) ue0 : null;
        if (ve0 == null) {
            return;
        }
        ve0.G(true);
    }

    public final void j0() {
        this.j = null;
        this.k = 0;
        this.m = 0;
        this.S = 0;
        this.P = 0;
        this.s = false;
        this.T = false;
        this.V.a();
        this.E.a();
        k0();
    }

    public final void j1(int i, int i2, int i3) {
        if (i3 > 0) {
            int i4 = this.a0;
            if (i4 > 0 && this.Y == i - i4 && this.Z == i2 - i4) {
                this.a0 = i4 + i3;
                return;
            }
            S0();
            this.Y = i;
            this.Z = i2;
            this.a0 = i3;
        }
    }

    @Override // com.daaw.InterfaceC5781jp
    public boolean k(int i) {
        Object objM0 = M0();
        if ((objM0 instanceof Integer) && i == ((Number) objM0).intValue()) {
            return false;
        }
        M1(Integer.valueOf(i));
        return true;
    }

    public final void k0() {
        this.o = null;
        this.p = null;
    }

    public final void k1(int i) {
        this.S = i - (this.H.k() - this.S);
    }

    @Override // com.daaw.InterfaceC5781jp
    public boolean l(long j2) {
        Object objM0 = M0();
        if ((objM0 instanceof Long) && j2 == ((Number) objM0).longValue()) {
            return false;
        }
        M1(Long.valueOf(j2));
        return true;
    }

    public final void l0(VX vx, InterfaceC3429bR interfaceC3429bR) {
        G10.g(vx, "invalidationsRequested");
        G10.g(interfaceC3429bR, "content");
        if (this.f.isEmpty()) {
            r0(vx, interfaceC3429bR);
        } else {
            AbstractC6348lp.x("Expected applyChanges() to have been called");
            throw new D80();
        }
    }

    public final void l1(int i, int i2) {
        if (i2 > 0) {
            if (!(i >= 0)) {
                AbstractC6348lp.x(("Invalid remove index " + i).toString());
                throw new D80();
            }
            if (this.X == i) {
                this.a0 += i2;
                return;
            }
            S0();
            this.X = i;
            this.a0 = i2;
        }
    }

    @Override // com.daaw.InterfaceC5781jp
    public InterfaceC1508Lp m() {
        return this.d;
    }

    public final int m0(int i, int i2, int i3) {
        if (i == i2) {
            return i3;
        }
        int iE0 = E0(this.H, i);
        return iE0 == 126665345 ? iE0 : Integer.rotateLeft(m0(this.H.M(i), i2, i3), 3) ^ iE0;
    }

    public final void m1() {
        NT0 nt0;
        int iS;
        if (this.H.u() <= 0 || this.V.g(-1) == (iS = (nt0 = this.H).s())) {
            return;
        }
        if (!this.T && this.U) {
            p1(this, false, AbstractC6348lp.d, 1, null);
            this.T = true;
        }
        C4445f4 c4445f4A = nt0.a(iS);
        this.V.i(iS);
        p1(this, false, new C(c4445f4A), 1, null);
    }

    @Override // com.daaw.InterfaceC5781jp
    public boolean n() {
        return this.O;
    }

    public final void n0() {
        AbstractC6348lp.X(this.J.T());
        OT0 ot0 = new OT0();
        this.I = ot0;
        QT0 qt0I = ot0.I();
        qt0I.F();
        this.J = qt0I;
    }

    public final void n1(InterfaceC3986dR interfaceC3986dR) {
        U0(this, false, 1, null);
        m1();
        a1(interfaceC3986dR);
    }

    @Override // com.daaw.InterfaceC5781jp
    public void o(boolean z2) {
        if (!(this.m == 0)) {
            AbstractC6348lp.x("No nodes can be emitted before calling dactivateToEndGroup");
            throw new D80();
        }
        if (n()) {
            return;
        }
        if (!z2) {
            y1();
            return;
        }
        int iK = this.H.k();
        int iJ = this.H.j();
        for (int i = iK; i < iJ; i++) {
            this.H.i(i, new C6066f(i));
        }
        AbstractC6348lp.W(this.t, iK, iJ);
        this.H.N(iK);
        this.H.Q();
    }

    public final InterfaceC5248hu0 o0(Integer num) {
        InterfaceC5248hu0 interfaceC5248hu0;
        if (num == null && (interfaceC5248hu0 = this.L) != null) {
            return interfaceC5248hu0;
        }
        if (n() && this.K) {
            int iV = this.J.V();
            while (iV > 0) {
                if (this.J.a0(iV) == 202 && G10.c(this.J.b0(iV), AbstractC6348lp.F())) {
                    Object objY = this.J.Y(iV);
                    if (objY == null) {
                        throw new NullPointerException("null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<androidx.compose.runtime.CompositionLocal<kotlin.Any?>, androidx.compose.runtime.State<kotlin.Any?>>{ androidx.compose.runtime.ComposerKt.CompositionLocalMap }");
                    }
                    InterfaceC5248hu0 interfaceC5248hu02 = (InterfaceC5248hu0) objY;
                    this.L = interfaceC5248hu02;
                    return interfaceC5248hu02;
                }
                iV = this.J.y0(iV);
            }
        }
        if (this.H.u() > 0) {
            int iIntValue = num != null ? num.intValue() : this.H.s();
            while (iIntValue > 0) {
                if (this.H.z(iIntValue) == 202 && G10.c(this.H.A(iIntValue), AbstractC6348lp.F())) {
                    InterfaceC5248hu0 interfaceC5248hu03 = (InterfaceC5248hu0) this.w.get(Integer.valueOf(iIntValue));
                    if (interfaceC5248hu03 == null) {
                        Object objW = this.H.w(iIntValue);
                        if (objW == null) {
                            throw new NullPointerException("null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<androidx.compose.runtime.CompositionLocal<kotlin.Any?>, androidx.compose.runtime.State<kotlin.Any?>>{ androidx.compose.runtime.ComposerKt.CompositionLocalMap }");
                        }
                        interfaceC5248hu03 = (InterfaceC5248hu0) objW;
                    }
                    this.L = interfaceC5248hu03;
                    return interfaceC5248hu03;
                }
                iIntValue = this.H.M(iIntValue);
            }
        }
        InterfaceC5248hu0 interfaceC5248hu04 = this.v;
        this.L = interfaceC5248hu04;
        return interfaceC5248hu04;
    }

    public final void o1(boolean z2, InterfaceC3986dR interfaceC3986dR) {
        T0(z2);
        a1(interfaceC3986dR);
    }

    @Override // com.daaw.InterfaceC5781jp
    public void p() {
        z1(-127, null, false, null);
    }

    @Override // com.daaw.InterfaceC5781jp
    public InterfaceC5781jp q(int i) {
        z1(i, null, false, null);
        h0();
        return this;
    }

    public final void q0() {
        Q41 q41 = Q41.a;
        Object objA = q41.a("Compose:Composer.dispose");
        try {
            this.c.o(this);
            this.E.a();
            this.t.clear();
            this.f.clear();
            this.w.clear();
            v().clear();
            this.G = true;
            G91 g91 = G91.a;
            q41.b(objA);
        } catch (Throwable th) {
            Q41.a.b(objA);
            throw th;
        }
    }

    public final void q1() {
        if (this.R.d()) {
            this.R.g();
        } else {
            this.Q++;
        }
    }

    @Override // com.daaw.InterfaceC5781jp
    public void r(int i, Object obj) {
        z1(i, obj, false, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x005e, code lost:
    
        r11 = r10.t;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0064, code lost:
    
        if (r11.size() <= 1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0066, code lost:
    
        com.daaw.AbstractC2037Qm.z(r11, new com.daaw.C6060kp.j());
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006e, code lost:
    
        r10.k = 0;
        r10.F = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0072, code lost:
    
        D1();
        r11 = M0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0079, code lost:
    
        if (r11 == r12) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007b, code lost:
    
        if (r12 == null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007d, code lost:
    
        M1(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0081, code lost:
    
        r11 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0083, code lost:
    
        com.daaw.AbstractC7923rU0.g(new com.daaw.C6060kp.C6067g(r10), new com.daaw.C6060kp.C6068h(r10), new com.daaw.C6060kp.C6069i(r12, r10, r11));
        v0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0098, code lost:
    
        r10.F = false;
        r10.t.clear();
        r11 = com.daaw.G91.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a2, code lost:
    
        r10.F = false;
        r10.t.clear();
        Q();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ac, code lost:
    
        throw r11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void r0(com.daaw.VX r11, com.daaw.InterfaceC3429bR r12) {
        /*
            r10 = this;
            r0 = 1
            boolean r1 = r10.F
            if (r1 != 0) goto Lb3
            java.lang.String r1 = "Compose:recompose"
            com.daaw.Q41 r2 = com.daaw.Q41.a
            java.lang.Object r1 = r2.a(r1)
            com.daaw.cU0 r2 = com.daaw.AbstractC5124hU0.B()     // Catch: java.lang.Throwable -> L4e
            r10.C = r2     // Catch: java.lang.Throwable -> L4e
            int r2 = r2.f()     // Catch: java.lang.Throwable -> L4e
            r10.D = r2     // Catch: java.lang.Throwable -> L4e
            java.util.HashMap r2 = r10.w     // Catch: java.lang.Throwable -> L4e
            r2.clear()     // Catch: java.lang.Throwable -> L4e
            int r2 = r11.f()     // Catch: java.lang.Throwable -> L4e
            r3 = 0
            r4 = 0
        L24:
            if (r4 >= r2) goto L5e
            java.lang.Object[] r5 = r11.e()     // Catch: java.lang.Throwable -> L4e
            r5 = r5[r4]     // Catch: java.lang.Throwable -> L4e
            if (r5 == 0) goto L56
            java.lang.Object[] r6 = r11.g()     // Catch: java.lang.Throwable -> L4e
            r6 = r6[r4]     // Catch: java.lang.Throwable -> L4e
            com.daaw.WX r6 = (com.daaw.WX) r6     // Catch: java.lang.Throwable -> L4e
            com.daaw.VE0 r5 = (com.daaw.VE0) r5     // Catch: java.lang.Throwable -> L4e
            com.daaw.f4 r7 = r5.j()     // Catch: java.lang.Throwable -> L4e
            if (r7 == 0) goto L50
            int r7 = r7.a()     // Catch: java.lang.Throwable -> L4e
            java.util.List r8 = r10.t     // Catch: java.lang.Throwable -> L4e
            com.daaw.S10 r9 = new com.daaw.S10     // Catch: java.lang.Throwable -> L4e
            r9.<init>(r5, r7, r6)     // Catch: java.lang.Throwable -> L4e
            r8.add(r9)     // Catch: java.lang.Throwable -> L4e
            int r4 = r4 + r0
            goto L24
        L4e:
            r11 = move-exception
            goto Lad
        L50:
            com.daaw.Q41 r11 = com.daaw.Q41.a
            r11.b(r1)
            return
        L56:
            java.lang.NullPointerException r11 = new java.lang.NullPointerException     // Catch: java.lang.Throwable -> L4e
            java.lang.String r12 = "null cannot be cast to non-null type Key of androidx.compose.runtime.collection.IdentityArrayMap"
            r11.<init>(r12)     // Catch: java.lang.Throwable -> L4e
            throw r11     // Catch: java.lang.Throwable -> L4e
        L5e:
            java.util.List r11 = r10.t     // Catch: java.lang.Throwable -> L4e
            int r2 = r11.size()     // Catch: java.lang.Throwable -> L4e
            if (r2 <= r0) goto L6e
            com.daaw.kp$j r2 = new com.daaw.kp$j     // Catch: java.lang.Throwable -> L4e
            r2.<init>()     // Catch: java.lang.Throwable -> L4e
            com.daaw.AbstractC2037Qm.z(r11, r2)     // Catch: java.lang.Throwable -> L4e
        L6e:
            r10.k = r3     // Catch: java.lang.Throwable -> L4e
            r10.F = r0     // Catch: java.lang.Throwable -> L4e
            r10.D1()     // Catch: java.lang.Throwable -> L81
            java.lang.Object r11 = r10.M0()     // Catch: java.lang.Throwable -> L81
            if (r11 == r12) goto L83
            if (r12 == 0) goto L83
            r10.M1(r12)     // Catch: java.lang.Throwable -> L81
            goto L83
        L81:
            r11 = move-exception
            goto La2
        L83:
            com.daaw.kp$g r0 = new com.daaw.kp$g     // Catch: java.lang.Throwable -> L81
            r0.<init>()     // Catch: java.lang.Throwable -> L81
            com.daaw.kp$h r2 = new com.daaw.kp$h     // Catch: java.lang.Throwable -> L81
            r2.<init>()     // Catch: java.lang.Throwable -> L81
            com.daaw.kp$i r4 = new com.daaw.kp$i     // Catch: java.lang.Throwable -> L81
            r4.<init>(r12, r10, r11)     // Catch: java.lang.Throwable -> L81
            com.daaw.AbstractC7923rU0.g(r0, r2, r4)     // Catch: java.lang.Throwable -> L81
            r10.v0()     // Catch: java.lang.Throwable -> L81
            r10.F = r3     // Catch: java.lang.Throwable -> L4e
            java.util.List r11 = r10.t     // Catch: java.lang.Throwable -> L4e
            r11.clear()     // Catch: java.lang.Throwable -> L4e
            com.daaw.G91 r11 = com.daaw.G91.a     // Catch: java.lang.Throwable -> L4e
            goto L50
        La2:
            r10.F = r3     // Catch: java.lang.Throwable -> L4e
            java.util.List r12 = r10.t     // Catch: java.lang.Throwable -> L4e
            r12.clear()     // Catch: java.lang.Throwable -> L4e
            r10.Q()     // Catch: java.lang.Throwable -> L4e
            throw r11     // Catch: java.lang.Throwable -> L4e
        Lad:
            com.daaw.Q41 r12 = com.daaw.Q41.a
            r12.b(r1)
            throw r11
        Lb3:
            java.lang.String r11 = "Reentrant composition is not supported"
            com.daaw.AbstractC6348lp.x(r11)
            com.daaw.D80 r11 = new com.daaw.D80
            r11.<init>()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C6060kp.r0(com.daaw.VX, com.daaw.bR):void");
    }

    public final void r1(int i, int i2, int i3) {
        NT0 nt0 = this.H;
        int iQ = AbstractC6348lp.Q(nt0, i, i2, i3);
        while (i > 0 && i != iQ) {
            if (nt0.G(i)) {
                q1();
            }
            i = nt0.M(i);
        }
        s0(i2, iQ);
    }

    @Override // com.daaw.InterfaceC5781jp
    public void s() {
        z1(125, null, true, null);
        this.s = true;
    }

    public final void s0(int i, int i2) {
        if (i <= 0 || i == i2) {
            return;
        }
        s0(this.H.M(i), i2);
        if (this.H.G(i)) {
            d1(N0(this.H, i));
        }
    }

    public final void s1() {
        this.N.add(this.W.g());
    }

    @Override // com.daaw.InterfaceC5781jp
    public boolean t() {
        VE0 ve0C0;
        return (n() || this.z || this.x || (ve0C0 = C0()) == null || ve0C0.o() || this.r) ? false : true;
    }

    public final void t0(boolean z2) {
        List list;
        if (n()) {
            int iV = this.J.V();
            H1(this.J.a0(iV), this.J.b0(iV), this.J.Y(iV));
        } else {
            int iS = this.H.s();
            H1(this.H.z(iS), this.H.A(iS), this.H.w(iS));
        }
        int i = this.m;
        C1005Gt0 c1005Gt0 = this.j;
        int i2 = 0;
        if (c1005Gt0 != null && c1005Gt0.b().size() > 0) {
            List listB = c1005Gt0.b();
            List listF = c1005Gt0.f();
            Set setE = AbstractC6842nc0.e(listF);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int size = listF.size();
            int size2 = listB.size();
            int i3 = 0;
            int i4 = 0;
            int iO = 0;
            while (i3 < size2) {
                P70 p70 = (P70) listB.get(i3);
                if (setE.contains(p70)) {
                    if (!linkedHashSet.contains(p70)) {
                        if (i4 < size) {
                            P70 p702 = (P70) listF.get(i4);
                            if (p702 != p70) {
                                int iG = c1005Gt0.g(p702);
                                linkedHashSet.add(p702);
                                if (iG != iO) {
                                    int iO2 = c1005Gt0.o(p702);
                                    list = listB;
                                    j1(c1005Gt0.e() + iG, iO + c1005Gt0.e(), iO2);
                                    c1005Gt0.j(iG, iO, iO2);
                                } else {
                                    list = listB;
                                }
                            } else {
                                list = listB;
                                i3++;
                            }
                            i4++;
                            iO += c1005Gt0.o(p702);
                            listB = list;
                        }
                    }
                    i2 = 0;
                } else {
                    l1(c1005Gt0.g(p70) + c1005Gt0.e(), p70.c());
                    c1005Gt0.n(p70.b(), i2);
                    k1(p70.b());
                    this.H.N(p70.b());
                    c1();
                    this.H.P();
                    AbstractC6348lp.W(this.t, p70.b(), p70.b() + this.H.B(p70.b()));
                }
                i3++;
                i2 = 0;
            }
            S0();
            if (listB.size() > 0) {
                k1(this.H.m());
                this.H.Q();
            }
        }
        int i5 = this.k;
        while (!this.H.E()) {
            int iK = this.H.k();
            c1();
            l1(i5, this.H.P());
            AbstractC6348lp.W(this.t, iK, this.H.k());
        }
        boolean zN = n();
        if (zN) {
            if (z2) {
                s1();
                i = 1;
            }
            this.H.f();
            int iV2 = this.J.V();
            this.J.N();
            if (!this.H.r()) {
                int iJ0 = J0(iV2);
                this.J.O();
                this.J.F();
                h1(this.M);
                this.O = false;
                if (!this.d.isEmpty()) {
                    J1(iJ0, 0);
                    K1(iJ0, i);
                }
            }
        } else {
            if (z2) {
                q1();
            }
            e1();
            int iS2 = this.H.s();
            if (i != N1(iS2)) {
                K1(iS2, i);
            }
            if (z2) {
                i = 1;
            }
            this.H.g();
            S0();
        }
        y0(i, zN);
    }

    public final void t1(int i) {
        u1(this, i, false, 0);
        S0();
    }

    @Override // com.daaw.InterfaceC5781jp
    public void u() {
        this.z = false;
    }

    public final void u0() {
        t0(false);
    }

    @Override // com.daaw.InterfaceC5781jp
    public InterfaceC8783ua v() {
        return this.b;
    }

    public final void v0() {
        u0();
        this.c.c();
        u0();
        f1();
        z0();
        this.H.d();
        this.r = false;
    }

    public final Object v1(AbstractC2049Qp abstractC2049Qp, InterfaceC5248hu0 interfaceC5248hu0) {
        return AbstractC6348lp.z(interfaceC5248hu0, abstractC2049Qp) ? AbstractC6348lp.M(interfaceC5248hu0, abstractC2049Qp) : abstractC2049Qp.a().getValue();
    }

    @Override // com.daaw.InterfaceC5781jp
    public void w(Object obj, InterfaceC3429bR interfaceC3429bR) {
        G10.g(interfaceC3429bR, "block");
        C6063c c6063c = new C6063c(interfaceC3429bR, obj);
        if (n()) {
            g1(c6063c);
        } else {
            b1(c6063c);
        }
    }

    public final void w0() {
        if (this.J.T()) {
            QT0 qt0I = this.I.I();
            this.J = qt0I;
            qt0I.O0();
            this.K = false;
            this.L = null;
        }
    }

    public void w1() {
        if (this.t.isEmpty()) {
            x1();
            return;
        }
        NT0 nt0 = this.H;
        int iN = nt0.n();
        Object objO = nt0.o();
        Object objL = nt0.l();
        F1(iN, objO, objL);
        C1(nt0.F(), null);
        Z0();
        nt0.g();
        H1(iN, objO, objL);
    }

    @Override // com.daaw.InterfaceC5781jp
    public void x(C7011oB0[] c7011oB0Arr) {
        InterfaceC5248hu0 interfaceC5248hu0L1;
        boolean z2;
        G10.g(c7011oB0Arr, DiagnosticsEntry.Histogram.VALUES_KEY);
        InterfaceC5248hu0 interfaceC5248hu0P0 = p0(this, null, 1, null);
        B1(RCHTTPStatusCodes.CREATED, AbstractC6348lp.I());
        B1(203, AbstractC6348lp.K());
        InterfaceC5248hu0 interfaceC5248hu0 = (InterfaceC5248hu0) O2.c(this, new F(c7011oB0Arr, interfaceC5248hu0P0));
        u0();
        if (n()) {
            interfaceC5248hu0L1 = L1(interfaceC5248hu0P0, interfaceC5248hu0);
            this.K = true;
        } else {
            Object objX = this.H.x(0);
            if (objX == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<androidx.compose.runtime.CompositionLocal<kotlin.Any?>, androidx.compose.runtime.State<kotlin.Any?>>{ androidx.compose.runtime.ComposerKt.CompositionLocalMap }");
            }
            InterfaceC5248hu0 interfaceC5248hu02 = (InterfaceC5248hu0) objX;
            Object objX2 = this.H.x(1);
            if (objX2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<androidx.compose.runtime.CompositionLocal<kotlin.Any?>, androidx.compose.runtime.State<kotlin.Any?>>{ androidx.compose.runtime.ComposerKt.CompositionLocalMap }");
            }
            InterfaceC5248hu0 interfaceC5248hu03 = (InterfaceC5248hu0) objX2;
            if (!t() || !G10.c(interfaceC5248hu03, interfaceC5248hu0)) {
                interfaceC5248hu0L1 = L1(interfaceC5248hu0P0, interfaceC5248hu0);
                z2 = !G10.c(interfaceC5248hu0L1, interfaceC5248hu02);
                if (z2 && !n()) {
                    this.w.put(Integer.valueOf(this.H.k()), interfaceC5248hu0L1);
                }
                this.y.i(AbstractC6348lp.u(this.x));
                this.x = z2;
                this.L = interfaceC5248hu0L1;
                z1(202, AbstractC6348lp.F(), false, interfaceC5248hu0L1);
            }
            x1();
            interfaceC5248hu0L1 = interfaceC5248hu02;
        }
        z2 = false;
        if (z2) {
            this.w.put(Integer.valueOf(this.H.k()), interfaceC5248hu0L1);
        }
        this.y.i(AbstractC6348lp.u(this.x));
        this.x = z2;
        this.L = interfaceC5248hu0L1;
        z1(202, AbstractC6348lp.F(), false, interfaceC5248hu0L1);
    }

    public final void x0(boolean z2, C1005Gt0 c1005Gt0) {
        this.i.h(this.j);
        this.j = c1005Gt0;
        this.l.i(this.k);
        if (z2) {
            this.k = 0;
        }
        this.n.i(this.m);
        this.m = 0;
    }

    public final void x1() {
        this.m += this.H.P();
    }

    @Override // com.daaw.InterfaceC5781jp
    public void y(int i, Object obj) {
        if (this.H.n() == i && !G10.c(this.H.l(), obj) && this.A < 0) {
            this.A = this.H.k();
            this.z = true;
        }
        z1(i, null, false, obj);
    }

    public final void y0(int i, boolean z2) {
        C1005Gt0 c1005Gt0 = (C1005Gt0) this.i.g();
        if (c1005Gt0 != null && !z2) {
            c1005Gt0.l(c1005Gt0.a() + 1);
        }
        this.j = c1005Gt0;
        this.k = this.l.h() + i;
        this.m = this.n.h() + i;
    }

    public final void y1() {
        this.m = this.H.t();
        this.H.Q();
    }

    @Override // com.daaw.InterfaceC5781jp
    public QN0 z() {
        C4445f4 c4445f4A;
        NQ nqI;
        VE0 ve0 = null;
        VE0 ve02 = this.E.d() ? (VE0) this.E.g() : null;
        if (ve02 != null) {
            ve02.D(false);
        }
        if (ve02 != null && (nqI = ve02.i(this.D)) != null) {
            a1(new k(nqI, this));
        }
        if (ve02 != null && !ve02.q() && (ve02.r() || this.q)) {
            if (ve02.j() == null) {
                if (n()) {
                    QT0 qt0 = this.J;
                    c4445f4A = qt0.A(qt0.V());
                } else {
                    NT0 nt0 = this.H;
                    c4445f4A = nt0.a(nt0.s());
                }
                ve02.A(c4445f4A);
            }
            ve02.C(false);
            ve0 = ve02;
        }
        t0(false);
        return ve0;
    }

    public final void z0() {
        V0();
        if (!this.i.c()) {
            AbstractC6348lp.x("Start/end imbalance");
            throw new D80();
        }
        if (this.V.d()) {
            j0();
        } else {
            AbstractC6348lp.x("Missed recording an endGroup()");
            throw new D80();
        }
    }

    public final void z1(int i, Object obj, boolean z2, Object obj2) {
        P1();
        F1(i, obj, obj2);
        C1005Gt0 c1005Gt0 = null;
        if (n()) {
            this.H.c();
            int iU = this.J.U();
            if (z2) {
                this.J.W0(InterfaceC5781jp.a.a());
            } else if (obj2 != null) {
                QT0 qt0 = this.J;
                if (obj == null) {
                    obj = InterfaceC5781jp.a.a();
                }
                qt0.S0(i, obj, obj2);
            } else {
                QT0 qt02 = this.J;
                if (obj == null) {
                    obj = InterfaceC5781jp.a.a();
                }
                qt02.U0(i, obj);
            }
            C1005Gt0 c1005Gt02 = this.j;
            if (c1005Gt02 != null) {
                P70 p70 = new P70(i, -1, J0(iU), -1, 0);
                c1005Gt02.i(p70, this.k - c1005Gt02.e());
                c1005Gt02.h(p70);
            }
            x0(z2, null);
            return;
        }
        if (this.j == null) {
            if (this.H.n() == i && G10.c(obj, this.H.o())) {
                C1(z2, obj2);
            } else {
                this.j = new C1005Gt0(this.H.h(), this.k);
            }
        }
        C1005Gt0 c1005Gt03 = this.j;
        if (c1005Gt03 != null) {
            P70 p70D = c1005Gt03.d(i, obj);
            if (p70D != null) {
                c1005Gt03.h(p70D);
                int iB = p70D.b();
                this.k = c1005Gt03.g(p70D) + c1005Gt03.e();
                int iM = c1005Gt03.m(p70D);
                int iA = iM - c1005Gt03.a();
                c1005Gt03.k(iM, c1005Gt03.a());
                k1(iB);
                this.H.N(iB);
                if (iA > 0) {
                    n1(new E(iA));
                }
                C1(z2, obj2);
            } else {
                this.H.c();
                this.O = true;
                this.L = null;
                w0();
                this.J.D();
                int iU2 = this.J.U();
                if (z2) {
                    this.J.W0(InterfaceC5781jp.a.a());
                } else if (obj2 != null) {
                    QT0 qt03 = this.J;
                    if (obj == null) {
                        obj = InterfaceC5781jp.a.a();
                    }
                    qt03.S0(i, obj, obj2);
                } else {
                    QT0 qt04 = this.J;
                    if (obj == null) {
                        obj = InterfaceC5781jp.a.a();
                    }
                    qt04.U0(i, obj);
                }
                this.M = this.J.A(iU2);
                P70 p702 = new P70(i, -1, J0(iU2), -1, 0);
                c1005Gt03.i(p702, this.k - c1005Gt03.e());
                c1005Gt03.h(p702);
                c1005Gt0 = new C1005Gt0(new ArrayList(), z2 ? 0 : this.k);
            }
        }
        x0(z2, c1005Gt0);
    }

    /* JADX INFO: renamed from: com.daaw.kp$a, reason: case insensitive filesystem */
    public static final class C6061a implements AG0 {
        public final C6062b a;

        public C6061a(C6062b c6062b) {
            G10.g(c6062b, "ref");
            this.a = c6062b;
        }

        public final C6062b a() {
            return this.a;
        }

        @Override // com.daaw.AG0
        public void b() {
            this.a.q();
        }

        @Override // com.daaw.AG0
        public void c() {
            this.a.q();
        }

        @Override // com.daaw.AG0
        public void d() {
        }
    }
}
