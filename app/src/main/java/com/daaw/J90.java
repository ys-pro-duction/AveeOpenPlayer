package com.daaw;

import com.daaw.E90;
import com.daaw.YY0;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class J90 {
    public final E90 a;
    public AbstractC1300Jp b;
    public YY0 c;
    public int d;
    public final Map e;
    public final Map f;
    public final b g;
    public final Map h;
    public final YY0.a i;
    public int j;
    public int k;
    public final String l;

    public final class b implements XY0 {
        public EnumC7560q90 B = EnumC7560q90.Rtl;
        public float C;
        public float D;

        public b() {
        }

        @Override // com.daaw.XY0
        public List A(Object obj, InterfaceC3429bR interfaceC3429bR) {
            G10.g(interfaceC3429bR, "content");
            return J90.this.o(obj, interfaceC3429bR);
        }

        @Override // com.daaw.InterfaceC4988gz
        public /* synthetic */ float H(int i) {
            return AbstractC4709fz.b(this, i);
        }

        @Override // com.daaw.InterfaceC4988gz
        public float J() {
            return this.D;
        }

        @Override // com.daaw.InterfaceC4988gz
        public /* synthetic */ float O(float f) {
            return AbstractC4709fz.d(this, f);
        }

        @Override // com.daaw.InterfaceC4988gz
        public /* synthetic */ int V(float f) {
            return AbstractC4709fz.a(this, f);
        }

        public void b(float f) {
            this.C = f;
        }

        @Override // com.daaw.InterfaceC4988gz
        public /* synthetic */ long d0(long j) {
            return AbstractC4709fz.e(this, j);
        }

        public void e(float f) {
            this.D = f;
        }

        @Override // com.daaw.InterfaceC4988gz
        public /* synthetic */ float e0(long j) {
            return AbstractC4709fz.c(this, j);
        }

        public void f(EnumC7560q90 enumC7560q90) {
            G10.g(enumC7560q90, "<set-?>");
            this.B = enumC7560q90;
        }

        @Override // com.daaw.InterfaceC4988gz
        public float getDensity() {
            return this.C;
        }

        @Override // com.daaw.F10
        public EnumC7560q90 getLayoutDirection() {
            return this.B;
        }

        @Override // com.daaw.InterfaceC1269Jh0
        public /* synthetic */ InterfaceC1061Hh0 s(int i, int i2, Map map, NQ nq) {
            return AbstractC1165Ih0.a(this, i, i2, map, nq);
        }
    }

    public static final class c extends E90.h {
        public final /* synthetic */ InterfaceC3429bR c;

        public static final class a implements InterfaceC1061Hh0 {
            public final /* synthetic */ InterfaceC1061Hh0 a;
            public final /* synthetic */ J90 b;
            public final /* synthetic */ int c;

            public a(InterfaceC1061Hh0 interfaceC1061Hh0, J90 j90, int i) {
                this.a = interfaceC1061Hh0;
                this.b = j90;
                this.c = i;
            }

            @Override // com.daaw.InterfaceC1061Hh0
            public void a() {
                this.b.d = this.c;
                this.a.a();
                J90 j90 = this.b;
                j90.g(j90.d);
            }

            @Override // com.daaw.InterfaceC1061Hh0
            public Map b() {
                return this.a.b();
            }

            @Override // com.daaw.InterfaceC1061Hh0
            public int getHeight() {
                return this.a.getHeight();
            }

            @Override // com.daaw.InterfaceC1061Hh0
            public int getWidth() {
                return this.a.getWidth();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC3429bR interfaceC3429bR, String str) {
            super(str);
            this.c = interfaceC3429bR;
        }

        @Override // com.daaw.InterfaceC0957Gh0
        public InterfaceC1061Hh0 a(InterfaceC1269Jh0 interfaceC1269Jh0, List list, long j) {
            G10.g(interfaceC1269Jh0, "$this$measure");
            G10.g(list, "measurables");
            J90.this.g.f(interfaceC1269Jh0.getLayoutDirection());
            J90.this.g.b(interfaceC1269Jh0.getDensity());
            J90.this.g.e(interfaceC1269Jh0.J());
            J90.this.d = 0;
            return new a((InterfaceC1061Hh0) this.c.invoke(J90.this.g, C6079kr.b(j)), J90.this, J90.this.d);
        }
    }

    public static final class d extends AbstractC4192e90 implements InterfaceC3429bR {
        public final /* synthetic */ a B;
        public final /* synthetic */ InterfaceC3429bR C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(a aVar, InterfaceC3429bR interfaceC3429bR) {
            super(2);
            this.B = aVar;
            this.C = interfaceC3429bR;
        }

        public final void a(InterfaceC5781jp interfaceC5781jp, int i) {
            if ((i & 11) == 2 && interfaceC5781jp.t()) {
                interfaceC5781jp.B();
                return;
            }
            boolean zA = this.B.a();
            InterfaceC3429bR interfaceC3429bR = this.C;
            interfaceC5781jp.y(207, Boolean.valueOf(zA));
            boolean zC = interfaceC5781jp.c(zA);
            if (zA) {
                interfaceC3429bR.invoke(interfaceC5781jp, 0);
            } else {
                interfaceC5781jp.o(zC);
            }
            interfaceC5781jp.d();
        }

        @Override // com.daaw.InterfaceC3429bR
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC5781jp) obj, ((Number) obj2).intValue());
            return G91.a;
        }
    }

    public J90(E90 e90, YY0 yy0) {
        G10.g(e90, "root");
        G10.g(yy0, "slotReusePolicy");
        this.a = e90;
        this.c = yy0;
        this.e = new LinkedHashMap();
        this.f = new LinkedHashMap();
        this.g = new b();
        this.h = new LinkedHashMap();
        this.i = new YY0.a(null, 1, null);
        this.l = "Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve 'match parent' sizing,, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement.";
    }

    public static /* synthetic */ void l(J90 j90, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            i3 = 1;
        }
        j90.k(i, i2, i3);
    }

    public final InterfaceC0957Gh0 d(InterfaceC3429bR interfaceC3429bR) {
        G10.g(interfaceC3429bR, "block");
        return new c(interfaceC3429bR, this.l);
    }

    public final E90 e(int i) {
        E90 e90 = new E90(true);
        E90 e902 = this.a;
        e902.L = true;
        this.a.y0(i, e90);
        e902.L = false;
        return e90;
    }

    public final void f() {
        E90 e90 = this.a;
        e90.L = true;
        Iterator it = this.e.values().iterator();
        while (it.hasNext()) {
            InterfaceC1196Ip interfaceC1196IpB = ((a) it.next()).b();
            if (interfaceC1196IpB != null) {
                interfaceC1196IpB.a();
            }
        }
        this.a.V0();
        e90.L = false;
        this.e.clear();
        this.f.clear();
        this.k = 0;
        this.j = 0;
        this.h.clear();
        j();
    }

    public final void g(int i) {
        this.j = 0;
        int size = (this.a.S().size() - this.k) - 1;
        if (i <= size) {
            this.i.clear();
            if (i <= size) {
                int i2 = i;
                while (true) {
                    this.i.add(i(i2));
                    if (i2 == size) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            this.c.b(this.i);
            while (size >= i) {
                E90 e90 = (E90) this.a.S().get(size);
                Object obj = this.e.get(e90);
                G10.d(obj);
                a aVar = (a) obj;
                Object objE = aVar.e();
                if (this.i.contains(objE)) {
                    e90.h1(E90.i.NotUsed);
                    this.j++;
                    aVar.f(false);
                } else {
                    E90 e902 = this.a;
                    e902.L = true;
                    this.e.remove(e90);
                    InterfaceC1196Ip interfaceC1196IpB = aVar.b();
                    if (interfaceC1196IpB != null) {
                        interfaceC1196IpB.a();
                    }
                    this.a.W0(size, 1);
                    e902.L = false;
                }
                this.f.remove(objE);
                size--;
            }
        }
        j();
    }

    public final void h() {
        Iterator it = this.e.entrySet().iterator();
        while (it.hasNext()) {
            ((a) ((Map.Entry) it.next()).getValue()).i(true);
        }
        if (this.a.a0()) {
            return;
        }
        E90.b1(this.a, false, 1, null);
    }

    public final Object i(int i) {
        Object obj = this.e.get((E90) this.a.S().get(i));
        G10.d(obj);
        return ((a) obj).e();
    }

    public final void j() {
        if (this.e.size() != this.a.S().size()) {
            throw new IllegalArgumentException(("Inconsistency between the count of nodes tracked by the state (" + this.e.size() + ") and the children count on the SubcomposeLayout (" + this.a.S().size() + "). Are you trying to use the state of the disposed SubcomposeLayout?").toString());
        }
        if ((this.a.S().size() - this.j) - this.k >= 0) {
            if (this.h.size() == this.k) {
                return;
            }
            throw new IllegalArgumentException(("Incorrect state. Precomposed children " + this.k + ". Map size " + this.h.size()).toString());
        }
        throw new IllegalArgumentException(("Incorrect state. Total children " + this.a.S().size() + ". Reusable children " + this.j + ". Precomposed children " + this.k).toString());
    }

    public final void k(int i, int i2, int i3) {
        E90 e90 = this.a;
        e90.L = true;
        this.a.J0(i, i2, i3);
        e90.L = false;
    }

    public final void m(AbstractC1300Jp abstractC1300Jp) {
        this.b = abstractC1300Jp;
    }

    public final void n(YY0 yy0) {
        G10.g(yy0, "value");
        if (this.c != yy0) {
            this.c = yy0;
            g(0);
        }
    }

    public final List o(Object obj, InterfaceC3429bR interfaceC3429bR) {
        J90 j90;
        G10.g(interfaceC3429bR, "content");
        j();
        E90.g gVarY = this.a.Y();
        if (gVarY != E90.g.Measuring && gVarY != E90.g.LayingOut) {
            throw new IllegalStateException("subcompose can only be used inside the measure or layout blocks");
        }
        Map map = this.f;
        Object objS = map.get(obj);
        if (objS == null) {
            objS = (E90) this.h.remove(obj);
            if (objS != null) {
                int i = this.k;
                if (i <= 0) {
                    throw new IllegalStateException("Check failed.");
                }
                this.k = i - 1;
            } else {
                objS = s(obj);
                if (objS == null) {
                    objS = e(this.d);
                }
            }
            map.put(obj, objS);
        }
        E90 e90 = (E90) objS;
        int iIndexOf = this.a.S().indexOf(e90);
        int i2 = this.d;
        if (iIndexOf < i2) {
            throw new IllegalArgumentException("Key " + obj + " was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item.");
        }
        if (i2 != iIndexOf) {
            j90 = this;
            l(j90, iIndexOf, i2, 0, 4, null);
        } else {
            j90 = this;
        }
        j90.d++;
        q(e90, obj, interfaceC3429bR);
        return e90.P();
    }

    public final void p(E90 e90, a aVar) {
        AbstractC3720cU0 abstractC3720cU0A = AbstractC3720cU0.e.a();
        try {
            AbstractC3720cU0 abstractC3720cU0K = abstractC3720cU0A.k();
            try {
                E90 e902 = this.a;
                e902.L = true;
                InterfaceC3429bR interfaceC3429bRC = aVar.c();
                InterfaceC1196Ip interfaceC1196IpB = aVar.b();
                AbstractC1300Jp abstractC1300Jp = this.b;
                if (abstractC1300Jp == null) {
                    throw new IllegalStateException("parent composition reference not set");
                }
                aVar.g(r(interfaceC1196IpB, e90, abstractC1300Jp, AbstractC1815Oo.c(-34810602, true, new d(aVar, interfaceC3429bRC))));
                e902.L = false;
                G91 g91 = G91.a;
            } finally {
                abstractC3720cU0A.r(abstractC3720cU0K);
            }
        } finally {
            abstractC3720cU0A.d();
        }
    }

    public final void q(E90 e90, Object obj, InterfaceC3429bR interfaceC3429bR) {
        Map map = this.e;
        Object obj2 = map.get(e90);
        if (obj2 == null) {
            a aVar = new a(obj, C2983Zo.a.a(), null, 4, null);
            map.put(e90, aVar);
            obj2 = aVar;
        }
        a aVar2 = (a) obj2;
        InterfaceC1196Ip interfaceC1196IpB = aVar2.b();
        boolean zN = interfaceC1196IpB != null ? interfaceC1196IpB.n() : true;
        if (aVar2.c() != interfaceC3429bR || zN || aVar2.d()) {
            aVar2.h(interfaceC3429bR);
            p(e90, aVar2);
            aVar2.i(false);
        }
    }

    public final InterfaceC1196Ip r(InterfaceC1196Ip interfaceC1196Ip, E90 e90, AbstractC1300Jp abstractC1300Jp, InterfaceC3429bR interfaceC3429bR) {
        if (interfaceC1196Ip == null || interfaceC1196Ip.f()) {
            interfaceC1196Ip = AbstractC6599mj1.a(e90, abstractC1300Jp);
        }
        interfaceC1196Ip.o(interfaceC3429bR);
        return interfaceC1196Ip;
    }

    public final E90 s(Object obj) {
        int i;
        if (this.j == 0) {
            return null;
        }
        int size = this.a.S().size() - this.k;
        int i2 = size - this.j;
        int i3 = size - 1;
        int i4 = i3;
        while (true) {
            if (i4 < i2) {
                i = -1;
                break;
            }
            if (G10.c(i(i4), obj)) {
                i = i4;
                break;
            }
            i4--;
        }
        if (i == -1) {
            while (true) {
                if (i3 < i2) {
                    i4 = i3;
                    break;
                }
                Object obj2 = this.e.get((E90) this.a.S().get(i3));
                G10.d(obj2);
                a aVar = (a) obj2;
                if (this.c.a(obj, aVar.e())) {
                    aVar.j(obj);
                    i4 = i3;
                    i = i4;
                    break;
                }
                i3--;
            }
        }
        if (i == -1) {
            return null;
        }
        if (i4 != i2) {
            k(i4, i2, 1);
        }
        this.j--;
        E90 e90 = (E90) this.a.S().get(i2);
        Object obj3 = this.e.get(e90);
        G10.d(obj3);
        ((a) obj3).f(true);
        AbstractC3720cU0.e.g();
        return e90;
    }

    public static final class a {
        public Object a;
        public InterfaceC3429bR b;
        public InterfaceC1196Ip c;
        public boolean d;
        public final InterfaceC8007rm0 e;

        public a(Object obj, InterfaceC3429bR interfaceC3429bR, InterfaceC1196Ip interfaceC1196Ip) {
            G10.g(interfaceC3429bR, "content");
            this.a = obj;
            this.b = interfaceC3429bR;
            this.c = interfaceC1196Ip;
            this.e = AbstractC9046vU0.d(Boolean.TRUE, null, 2, null);
        }

        public final boolean a() {
            return ((Boolean) this.e.getValue()).booleanValue();
        }

        public final InterfaceC1196Ip b() {
            return this.c;
        }

        public final InterfaceC3429bR c() {
            return this.b;
        }

        public final boolean d() {
            return this.d;
        }

        public final Object e() {
            return this.a;
        }

        public final void f(boolean z) {
            this.e.setValue(Boolean.valueOf(z));
        }

        public final void g(InterfaceC1196Ip interfaceC1196Ip) {
            this.c = interfaceC1196Ip;
        }

        public final void h(InterfaceC3429bR interfaceC3429bR) {
            G10.g(interfaceC3429bR, "<set-?>");
            this.b = interfaceC3429bR;
        }

        public final void i(boolean z) {
            this.d = z;
        }

        public final void j(Object obj) {
            this.a = obj;
        }

        public /* synthetic */ a(Object obj, InterfaceC3429bR interfaceC3429bR, InterfaceC1196Ip interfaceC1196Ip, int i, AbstractC2911Yw abstractC2911Yw) {
            this(obj, interfaceC3429bR, (i & 4) != 0 ? null : interfaceC1196Ip);
        }
    }
}
