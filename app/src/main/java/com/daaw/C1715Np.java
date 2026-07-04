package com.daaw;

import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.daaw.Np, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1715Np implements InterfaceC2165Rs {
    public final AbstractC1300Jp B;
    public final InterfaceC8783ua C;
    public final AtomicReference D;
    public final Object E;
    public final HashSet F;
    public final OT0 G;
    public final XX H;
    public final HashSet I;
    public final XX J;
    public final List K;
    public final List L;
    public final XX M;
    public VX N;
    public boolean O;
    public C1715Np P;
    public int Q;
    public final C6060kp R;
    public final InterfaceC4684ft S;
    public final boolean T;
    public boolean U;
    public InterfaceC3429bR V;

    /* JADX INFO: renamed from: com.daaw.Np$a */
    public static final class a implements InterfaceC10106zG0 {
        public final Set a;
        public final List b;
        public final List c;
        public final List d;

        public a(Set set) {
            G10.g(set, "abandoning");
            this.a = set;
            this.b = new ArrayList();
            this.c = new ArrayList();
            this.d = new ArrayList();
        }

        @Override // com.daaw.InterfaceC10106zG0
        public void a(LQ lq) {
            G10.g(lq, "effect");
            this.d.add(lq);
        }

        @Override // com.daaw.InterfaceC10106zG0
        public void b(AG0 ag0) {
            G10.g(ag0, "instance");
            int iLastIndexOf = this.b.lastIndexOf(ag0);
            if (iLastIndexOf < 0) {
                this.c.add(ag0);
            } else {
                this.b.remove(iLastIndexOf);
                this.a.remove(ag0);
            }
        }

        @Override // com.daaw.InterfaceC10106zG0
        public void c(AG0 ag0) {
            G10.g(ag0, "instance");
            int iLastIndexOf = this.c.lastIndexOf(ag0);
            if (iLastIndexOf < 0) {
                this.b.add(ag0);
            } else {
                this.c.remove(iLastIndexOf);
                this.a.remove(ag0);
            }
        }

        public final void d() {
            if (this.a.isEmpty()) {
                return;
            }
            Object objA = Q41.a.a("Compose:abandons");
            try {
                Iterator it = this.a.iterator();
                while (it.hasNext()) {
                    AG0 ag0 = (AG0) it.next();
                    it.remove();
                    ag0.b();
                }
                G91 g91 = G91.a;
                Q41.a.b(objA);
            } catch (Throwable th) {
                Q41.a.b(objA);
                throw th;
            }
        }

        /* JADX WARN: Finally extract failed */
        public final void e() {
            Object objA;
            if (!this.c.isEmpty()) {
                objA = Q41.a.a("Compose:onForgotten");
                try {
                    for (int size = this.c.size() - 1; -1 < size; size--) {
                        AG0 ag0 = (AG0) this.c.get(size);
                        if (!this.a.contains(ag0)) {
                            ag0.c();
                        }
                    }
                    G91 g91 = G91.a;
                    Q41.a.b(objA);
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.b.isEmpty()) {
                return;
            }
            objA = Q41.a.a("Compose:onRemembered");
            try {
                List list = this.b;
                int size2 = list.size();
                for (int i = 0; i < size2; i++) {
                    AG0 ag02 = (AG0) list.get(i);
                    this.a.remove(ag02);
                    ag02.d();
                }
                G91 g912 = G91.a;
                Q41.a.b(objA);
            } finally {
                Q41.a.b(objA);
            }
        }

        public final void f() {
            if (this.d.isEmpty()) {
                return;
            }
            Object objA = Q41.a.a("Compose:sideeffects");
            try {
                List list = this.d;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    ((LQ) list.get(i)).invoke();
                }
                this.d.clear();
                G91 g91 = G91.a;
                Q41.a.b(objA);
            } catch (Throwable th) {
                Q41.a.b(objA);
                throw th;
            }
        }
    }

    public C1715Np(AbstractC1300Jp abstractC1300Jp, InterfaceC8783ua interfaceC8783ua, InterfaceC4684ft interfaceC4684ft) {
        G10.g(abstractC1300Jp, "parent");
        G10.g(interfaceC8783ua, "applier");
        this.B = abstractC1300Jp;
        this.C = interfaceC8783ua;
        this.D = new AtomicReference(null);
        this.E = new Object();
        HashSet hashSet = new HashSet();
        this.F = hashSet;
        OT0 ot0 = new OT0();
        this.G = ot0;
        this.H = new XX();
        this.I = new HashSet();
        this.J = new XX();
        ArrayList arrayList = new ArrayList();
        this.K = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.L = arrayList2;
        this.M = new XX();
        this.N = new VX(0, 1, null);
        C6060kp c6060kp = new C6060kp(interfaceC8783ua, abstractC1300Jp, ot0, hashSet, arrayList, arrayList2, this);
        abstractC1300Jp.m(c6060kp);
        this.R = c6060kp;
        this.S = interfaceC4684ft;
        this.T = abstractC1300Jp instanceof WE0;
        this.V = C2149Ro.a.a();
    }

    public static final void u(C1715Np c1715Np, boolean z, C6748nF0 c6748nF0, Object obj) {
        XX xx = c1715Np.H;
        int iF = xx.f(obj);
        if (iF >= 0) {
            for (VE0 ve0 : xx.o(iF)) {
                if (!c1715Np.M.m(obj, ve0) && ve0.t(obj) != U10.IGNORED) {
                    if (!ve0.u() || z) {
                        HashSet hashSet = (HashSet) c6748nF0.B;
                        if (hashSet == null) {
                            hashSet = new HashSet();
                            c6748nF0.B = hashSet;
                        }
                        hashSet.add(ve0);
                    } else {
                        c1715Np.I.add(ve0);
                    }
                }
            }
        }
    }

    public final U10 A(VE0 ve0, Object obj) {
        G10.g(ve0, "scope");
        if (ve0.m()) {
            ve0.C(true);
        }
        C4445f4 c4445f4J = ve0.j();
        return (c4445f4J != null && this.G.J(c4445f4J) && c4445f4J.b()) ? !c4445f4J.b() ? U10.IGNORED : !ve0.k() ? U10.IGNORED : B(ve0, c4445f4J, obj) : U10.IGNORED;
    }

    public final U10 B(VE0 ve0, C4445f4 c4445f4, Object obj) {
        synchronized (this.E) {
            try {
                C1715Np c1715Np = this.P;
                if (c1715Np == null || !this.G.G(this.Q, c4445f4)) {
                    c1715Np = null;
                }
                if (c1715Np == null) {
                    if (j() && this.R.E1(ve0, obj)) {
                        return U10.IMMINENT;
                    }
                    if (obj == null) {
                        this.N.j(ve0, null);
                    } else {
                        AbstractC1819Op.d(this.N, ve0, obj);
                    }
                }
                if (c1715Np != null) {
                    return c1715Np.B(ve0, c4445f4, obj);
                }
                this.B.i(this);
                return j() ? U10.DEFERRED : U10.SCHEDULED;
            } finally {
            }
        }
    }

    public final void C(Object obj) {
        XX xx = this.H;
        int iF = xx.f(obj);
        if (iF >= 0) {
            for (VE0 ve0 : xx.o(iF)) {
                if (ve0.t(obj) == U10.IMMINENT) {
                    this.M.c(obj, ve0);
                }
            }
        }
    }

    public final void D(InterfaceC10305zz interfaceC10305zz) {
        G10.g(interfaceC10305zz, "state");
        if (this.H.e(interfaceC10305zz)) {
            return;
        }
        this.J.n(interfaceC10305zz);
    }

    public final void E(Object obj, VE0 ve0) {
        G10.g(obj, "instance");
        G10.g(ve0, "scope");
        this.H.m(obj, ve0);
    }

    public final void F(boolean z) {
        this.O = z;
    }

    public final VX G() {
        VX vx = this.N;
        this.N = new VX(0, 1, null);
        return vx;
    }

    @Override // com.daaw.InterfaceC1196Ip
    public void a() {
        synchronized (this.E) {
            try {
                if (!this.U) {
                    boolean z = true;
                    this.U = true;
                    this.V = C2149Ro.a.b();
                    if (this.G.w() <= 0) {
                        z = false;
                    }
                    if (z || !this.F.isEmpty()) {
                        a aVar = new a(this.F);
                        if (z) {
                            QT0 qt0I = this.G.I();
                            try {
                                AbstractC6348lp.U(qt0I, aVar);
                                G91 g91 = G91.a;
                                qt0I.F();
                                this.C.clear();
                                aVar.e();
                            } catch (Throwable th) {
                                qt0I.F();
                                throw th;
                            }
                        }
                        aVar.d();
                    }
                    this.R.q0();
                }
                G91 g912 = G91.a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.B.p(this);
    }

    @Override // com.daaw.InterfaceC2165Rs
    public boolean b(Set set) {
        G10.g(set, DiagnosticsEntry.Histogram.VALUES_KEY);
        for (Object obj : set) {
            if (this.H.e(obj) || this.J.e(obj)) {
                return true;
            }
        }
        return false;
    }

    public final void c(Set set, boolean z) {
        HashSet hashSet;
        C6748nF0 c6748nF0 = new C6748nF0();
        for (Object obj : set) {
            if (obj instanceof VE0) {
                ((VE0) obj).t(null);
            } else {
                u(this, z, c6748nF0, obj);
                XX xx = this.J;
                int iF = xx.f(obj);
                if (iF >= 0) {
                    Iterator<E> it = xx.o(iF).iterator();
                    while (it.hasNext()) {
                        u(this, z, c6748nF0, (InterfaceC10305zz) it.next());
                    }
                }
            }
        }
        if (!z || this.I.isEmpty()) {
            HashSet hashSet2 = (HashSet) c6748nF0.B;
            if (hashSet2 != null) {
                XX xx2 = this.H;
                int iJ = xx2.j();
                int i = 0;
                for (int i2 = 0; i2 < iJ; i2++) {
                    int i3 = xx2.k()[i2];
                    WX wx = xx2.i()[i3];
                    G10.d(wx);
                    int size = wx.size();
                    int i4 = 0;
                    for (int i5 = 0; i5 < size; i5++) {
                        Object obj2 = wx.s()[i5];
                        if (obj2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                        }
                        if (!hashSet2.contains((VE0) obj2)) {
                            if (i4 != i5) {
                                wx.s()[i4] = obj2;
                            }
                            i4++;
                        }
                    }
                    int size2 = wx.size();
                    for (int i6 = i4; i6 < size2; i6++) {
                        wx.s()[i6] = null;
                    }
                    wx.w(i4);
                    if (wx.size() > 0) {
                        if (i != i2) {
                            int i7 = xx2.k()[i];
                            xx2.k()[i] = i3;
                            xx2.k()[i2] = i7;
                        }
                        i++;
                    }
                }
                int iJ2 = xx2.j();
                for (int i8 = i; i8 < iJ2; i8++) {
                    xx2.l()[xx2.k()[i8]] = null;
                }
                xx2.p(i);
                w();
                return;
            }
            return;
        }
        XX xx3 = this.H;
        int iJ3 = xx3.j();
        int i9 = 0;
        for (int i10 = 0; i10 < iJ3; i10++) {
            int i11 = xx3.k()[i10];
            WX wx2 = xx3.i()[i11];
            G10.d(wx2);
            int size3 = wx2.size();
            int i12 = 0;
            for (int i13 = 0; i13 < size3; i13++) {
                Object obj3 = wx2.s()[i13];
                if (obj3 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                }
                VE0 ve0 = (VE0) obj3;
                if (!this.I.contains(ve0) && ((hashSet = (HashSet) c6748nF0.B) == null || !hashSet.contains(ve0))) {
                    if (i12 != i13) {
                        wx2.s()[i12] = obj3;
                    }
                    i12++;
                }
            }
            int size4 = wx2.size();
            for (int i14 = i12; i14 < size4; i14++) {
                wx2.s()[i14] = null;
            }
            wx2.w(i12);
            if (wx2.size() > 0) {
                if (i9 != i10) {
                    int i15 = xx3.k()[i9];
                    xx3.k()[i9] = i11;
                    xx3.k()[i10] = i15;
                }
                i9++;
            }
        }
        int iJ4 = xx3.j();
        for (int i16 = i9; i16 < iJ4; i16++) {
            xx3.l()[xx3.k()[i16]] = null;
        }
        xx3.p(i9);
        w();
        this.I.clear();
    }

    @Override // com.daaw.InterfaceC2165Rs
    public void d() {
        synchronized (this.E) {
            try {
                if (!this.L.isEmpty()) {
                    v(this.L);
                }
                G91 g91 = G91.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.daaw.InterfaceC2165Rs
    public void e(Object obj) {
        VE0 ve0C0;
        G10.g(obj, "value");
        if (z() || (ve0C0 = this.R.C0()) == null) {
            return;
        }
        ve0C0.G(true);
        this.H.c(obj, ve0C0);
        if (obj instanceof InterfaceC10305zz) {
            this.J.n(obj);
            Iterator it = ((InterfaceC10305zz) obj).k().iterator();
            while (it.hasNext()) {
                this.J.c((InterfaceC10170zW0) it.next(), obj);
            }
        }
        ve0C0.w(obj);
    }

    @Override // com.daaw.InterfaceC1196Ip
    public boolean f() {
        return this.U;
    }

    @Override // com.daaw.InterfaceC2165Rs
    public void g(InterfaceC3429bR interfaceC3429bR) {
        G10.g(interfaceC3429bR, "content");
        try {
            synchronized (this.E) {
                x();
                this.R.l0(G(), interfaceC3429bR);
                G91 g91 = G91.a;
            }
        } catch (Throwable th) {
            if (!this.F.isEmpty()) {
                new a(this.F).d();
            }
            throw th;
        }
    }

    @Override // com.daaw.InterfaceC2165Rs
    public void h(Set set) {
        Object obj;
        Object objU;
        G10.g(set, DiagnosticsEntry.Histogram.VALUES_KEY);
        do {
            obj = this.D.get();
            if (obj == null ? true : G10.c(obj, AbstractC1819Op.a)) {
                objU = set;
            } else if (obj instanceof Set) {
                objU = new Set[]{(Set) obj, set};
            } else {
                if (!(obj instanceof Object[])) {
                    throw new IllegalStateException(("corrupt pendingModifications: " + this.D).toString());
                }
                if (obj == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.collections.Set<kotlin.Any>>");
                }
                objU = AbstractC5152hb.u((Set[]) obj, set);
            }
        } while (!AbstractC0552Cm0.a(this.D, obj, objU));
        if (obj == null) {
            synchronized (this.E) {
                y();
                G91 g91 = G91.a;
            }
        }
    }

    @Override // com.daaw.InterfaceC2165Rs
    public void i() {
        synchronized (this.E) {
            v(this.K);
            y();
            G91 g91 = G91.a;
        }
    }

    @Override // com.daaw.InterfaceC2165Rs
    public boolean j() {
        return this.R.L0();
    }

    @Override // com.daaw.InterfaceC2165Rs
    public void k(List list) {
        boolean z = true;
        G10.g(list, "references");
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            if (!G10.c(((C0661Dl0) ((C0576Cs0) list.get(i)).c()).b(), this)) {
                z = false;
                break;
            }
            i++;
        }
        AbstractC6348lp.X(z);
        try {
            this.R.F0(list);
            G91 g91 = G91.a;
        } catch (Throwable th) {
            if (!this.F.isEmpty()) {
                new a(this.F).d();
            }
            throw th;
        }
    }

    @Override // com.daaw.InterfaceC2165Rs
    public void l(Object obj) {
        G10.g(obj, "value");
        synchronized (this.E) {
            try {
                C(obj);
                XX xx = this.J;
                int iF = xx.f(obj);
                if (iF >= 0) {
                    Iterator<E> it = xx.o(iF).iterator();
                    while (it.hasNext()) {
                        C((InterfaceC10305zz) it.next());
                    }
                }
                G91 g91 = G91.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.daaw.InterfaceC2165Rs
    public void m(C0548Cl0 c0548Cl0) {
        G10.g(c0548Cl0, "state");
        a aVar = new a(this.F);
        QT0 qt0I = c0548Cl0.a().I();
        try {
            AbstractC6348lp.U(qt0I, aVar);
            G91 g91 = G91.a;
            qt0I.F();
            aVar.e();
        } catch (Throwable th) {
            qt0I.F();
            throw th;
        }
    }

    @Override // com.daaw.InterfaceC1196Ip
    public boolean n() {
        boolean z;
        synchronized (this.E) {
            z = this.N.f() > 0;
        }
        return z;
    }

    @Override // com.daaw.InterfaceC1196Ip
    public void o(InterfaceC3429bR interfaceC3429bR) {
        G10.g(interfaceC3429bR, "content");
        if (this.U) {
            throw new IllegalStateException("The composition is disposed");
        }
        this.V = interfaceC3429bR;
        this.B.a(this, interfaceC3429bR);
    }

    @Override // com.daaw.InterfaceC2165Rs
    public void p() {
        synchronized (this.E) {
            try {
                this.R.i0();
                if (!this.F.isEmpty()) {
                    new a(this.F).d();
                }
                G91 g91 = G91.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.daaw.InterfaceC2165Rs
    public Object q(InterfaceC2165Rs interfaceC2165Rs, int i, LQ lq) {
        G10.g(lq, "block");
        if (interfaceC2165Rs == null || G10.c(interfaceC2165Rs, this) || i < 0) {
            return lq.invoke();
        }
        this.P = (C1715Np) interfaceC2165Rs;
        this.Q = i;
        try {
            return lq.invoke();
        } finally {
            this.P = null;
            this.Q = 0;
        }
    }

    @Override // com.daaw.InterfaceC2165Rs
    public void r(LQ lq) {
        G10.g(lq, "block");
        this.R.P0(lq);
    }

    @Override // com.daaw.InterfaceC2165Rs
    public boolean s() {
        boolean zW0;
        synchronized (this.E) {
            try {
                x();
                try {
                    zW0 = this.R.W0(G());
                    if (!zW0) {
                        y();
                    }
                } finally {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zW0;
    }

    @Override // com.daaw.InterfaceC2165Rs
    public void t() {
        synchronized (this.E) {
            try {
                for (Object obj : this.G.y()) {
                    VE0 ve0 = obj instanceof VE0 ? (VE0) obj : null;
                    if (ve0 != null) {
                        ve0.invalidate();
                    }
                }
                G91 g91 = G91.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void v(List list) {
        a aVar = new a(this.F);
        try {
            if (list.isEmpty()) {
                if (this.L.isEmpty()) {
                    aVar.d();
                    return;
                }
                return;
            }
            Object objA = Q41.a.a("Compose:applyChanges");
            try {
                this.C.d();
                QT0 qt0I = this.G.I();
                try {
                    InterfaceC8783ua interfaceC8783ua = this.C;
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        ((InterfaceC3986dR) list.get(i)).invoke(interfaceC8783ua, qt0I, aVar);
                    }
                    list.clear();
                    G91 g91 = G91.a;
                    qt0I.F();
                    this.C.i();
                    Q41 q41 = Q41.a;
                    q41.b(objA);
                    aVar.e();
                    aVar.f();
                    if (this.O) {
                        objA = q41.a("Compose:unobserve");
                        try {
                            this.O = false;
                            XX xx = this.H;
                            int iJ = xx.j();
                            int i2 = 0;
                            for (int i3 = 0; i3 < iJ; i3++) {
                                int i4 = xx.k()[i3];
                                WX wx = xx.i()[i4];
                                G10.d(wx);
                                int size2 = wx.size();
                                int i5 = 0;
                                for (int i6 = 0; i6 < size2; i6++) {
                                    Object obj = wx.s()[i6];
                                    if (obj == null) {
                                        throw new NullPointerException("null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                                    }
                                    if (((VE0) obj).s()) {
                                        if (i5 != i6) {
                                            wx.s()[i5] = obj;
                                        }
                                        i5++;
                                    }
                                }
                                int size3 = wx.size();
                                for (int i7 = i5; i7 < size3; i7++) {
                                    wx.s()[i7] = null;
                                }
                                wx.w(i5);
                                if (wx.size() > 0) {
                                    if (i2 != i3) {
                                        int i8 = xx.k()[i2];
                                        xx.k()[i2] = i4;
                                        xx.k()[i3] = i8;
                                    }
                                    i2++;
                                }
                            }
                            int iJ2 = xx.j();
                            for (int i9 = i2; i9 < iJ2; i9++) {
                                xx.l()[xx.k()[i9]] = null;
                            }
                            xx.p(i2);
                            w();
                            G91 g912 = G91.a;
                            Q41.a.b(objA);
                        } finally {
                        }
                    }
                    if (this.L.isEmpty()) {
                        aVar.d();
                    }
                } finally {
                    qt0I.F();
                }
            } finally {
                Q41.a.b(objA);
            }
        } finally {
            if (this.L.isEmpty()) {
                aVar.d();
            }
        }
    }

    public final void w() {
        XX xx = this.J;
        int iJ = xx.j();
        int i = 0;
        for (int i2 = 0; i2 < iJ; i2++) {
            int i3 = xx.k()[i2];
            WX wx = xx.i()[i3];
            G10.d(wx);
            int size = wx.size();
            int i4 = 0;
            for (int i5 = 0; i5 < size; i5++) {
                Object obj = wx.s()[i5];
                if (obj == null) {
                    throw new NullPointerException("null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                }
                if (this.H.e((InterfaceC10305zz) obj)) {
                    if (i4 != i5) {
                        wx.s()[i4] = obj;
                    }
                    i4++;
                }
            }
            int size2 = wx.size();
            for (int i6 = i4; i6 < size2; i6++) {
                wx.s()[i6] = null;
            }
            wx.w(i4);
            if (wx.size() > 0) {
                if (i != i2) {
                    int i7 = xx.k()[i];
                    xx.k()[i] = i3;
                    xx.k()[i2] = i7;
                }
                i++;
            }
        }
        int iJ2 = xx.j();
        for (int i8 = i; i8 < iJ2; i8++) {
            xx.l()[xx.k()[i8]] = null;
        }
        xx.p(i);
        Iterator it = this.I.iterator();
        G10.f(it, "iterator()");
        while (it.hasNext()) {
            if (!((VE0) it.next()).u()) {
                it.remove();
            }
        }
    }

    public final void x() {
        Object andSet = this.D.getAndSet(AbstractC1819Op.a);
        if (andSet != null) {
            if (G10.c(andSet, AbstractC1819Op.a)) {
                throw new IllegalStateException("pending composition has not been applied");
            }
            if (andSet instanceof Set) {
                c((Set) andSet, true);
                return;
            }
            if (!(andSet instanceof Object[])) {
                throw new IllegalStateException(("corrupt pendingModifications drain: " + this.D).toString());
            }
            for (Set set : (Set[]) andSet) {
                c(set, true);
            }
        }
    }

    public final void y() {
        Object andSet = this.D.getAndSet(null);
        if (G10.c(andSet, AbstractC1819Op.a)) {
            return;
        }
        if (andSet instanceof Set) {
            c((Set) andSet, false);
            return;
        }
        if (!(andSet instanceof Object[])) {
            if (andSet == null) {
                throw new IllegalStateException("calling recordModificationsOf and applyChanges concurrently is not supported");
            }
            throw new IllegalStateException(("corrupt pendingModifications drain: " + this.D).toString());
        }
        for (Set set : (Set[]) andSet) {
            c(set, false);
        }
    }

    public final boolean z() {
        return this.R.A0();
    }

    public /* synthetic */ C1715Np(AbstractC1300Jp abstractC1300Jp, InterfaceC8783ua interfaceC8783ua, InterfaceC4684ft interfaceC4684ft, int i, AbstractC2911Yw abstractC2911Yw) {
        this(abstractC1300Jp, interfaceC8783ua, (i & 4) != 0 ? null : interfaceC4684ft);
    }
}
