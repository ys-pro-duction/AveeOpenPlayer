package com.daaw;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.ob0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C7116ob0 extends AbstractC2134Rk0 {
    public final AbstractC2134Rk0 C;
    public final C8957v81 D;
    public C8957v81 E;
    public List F;
    public List G;
    public C71 H;

    /* JADX INFO: renamed from: com.daaw.ob0$a */
    public class a implements NQ {
        public a() {
        }

        @Override // com.daaw.NQ
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean invoke(Z71 z71) {
            return Boolean.valueOf(!z71.l0());
        }
    }

    /* JADX INFO: renamed from: com.daaw.ob0$b */
    public class b implements NQ {
        public b() {
        }

        @Override // com.daaw.NQ
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public YS0 invoke(YS0 ys0) {
            return C7116ob0.this.M0(ys0);
        }
    }

    public C7116ob0(AbstractC2134Rk0 abstractC2134Rk0, C8957v81 c8957v81) {
        this.C = abstractC2134Rk0;
        this.D = c8957v81;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ void y0(int r15) {
        /*
            Method dump skipped, instruction units count: 318
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C7116ob0.y0(int):void");
    }

    @Override // com.daaw.InterfaceC4923gl
    public boolean B() {
        return this.C.B();
    }

    @Override // com.daaw.InterfaceC4923gl
    public InterfaceC4346ej0 C0() {
        InterfaceC4346ej0 interfaceC4346ej0U = U(AbstractC8400tA.r(AbstractC7006oA.g(this.C)));
        if (interfaceC4346ej0U == null) {
            y0(12);
        }
        return interfaceC4346ej0U;
    }

    @Override // com.daaw.InterfaceC2232Si0
    public boolean E0() {
        return this.C.E0();
    }

    @Override // com.daaw.AbstractC2134Rk0
    public InterfaceC4346ej0 F(AbstractC8392t81 abstractC8392t81, Q80 q80) {
        if (abstractC8392t81 == null) {
            y0(5);
        }
        if (q80 == null) {
            y0(6);
        }
        InterfaceC4346ej0 interfaceC4346ej0F = this.C.F(abstractC8392t81, q80);
        if (!this.D.k()) {
            return new C6270lZ0(interfaceC4346ej0F, K0());
        }
        if (interfaceC4346ej0F == null) {
            y0(7);
        }
        return interfaceC4346ej0F;
    }

    @Override // com.daaw.InterfaceC4923gl
    public InterfaceC4346ej0 G0(AbstractC8392t81 abstractC8392t81) {
        if (abstractC8392t81 == null) {
            y0(10);
        }
        InterfaceC4346ej0 interfaceC4346ej0F = F(abstractC8392t81, AbstractC8400tA.r(AbstractC7006oA.g(this)));
        if (interfaceC4346ej0F == null) {
            y0(11);
        }
        return interfaceC4346ej0F;
    }

    @Override // com.daaw.InterfaceC4923gl
    public Collection H() {
        Collection collectionH = this.C.H();
        if (collectionH == null) {
            y0(31);
        }
        return collectionH;
    }

    @Override // com.daaw.InterfaceC4923gl
    public List H0() {
        List list = Collections.EMPTY_LIST;
        if (list == null) {
            y0(17);
        }
        return list;
    }

    @Override // com.daaw.InterfaceC4923gl
    public boolean I0() {
        return this.C.I0();
    }

    @Override // com.daaw.InterfaceC2232Si0
    public boolean J() {
        return this.C.J();
    }

    @Override // com.daaw.InterfaceC4923gl
    public RE0 J0() {
        throw new UnsupportedOperationException();
    }

    @Override // com.daaw.InterfaceC0339Al
    public boolean K() {
        return this.C.K();
    }

    public final C8957v81 K0() {
        if (this.E == null) {
            if (this.D.k()) {
                this.E = this.D;
            } else {
                List parameters = this.C.k().getParameters();
                this.F = new ArrayList(parameters.size());
                this.E = AbstractC6448mA.b(parameters, this.D.j(), this, this.F);
                this.G = AbstractC2455Um.a0(this.F, new a());
            }
        }
        return this.E;
    }

    @Override // com.daaw.InterfaceC4297eZ0
    /* JADX INFO: renamed from: L0, reason: merged with bridge method [inline-methods] */
    public InterfaceC4923gl c(C8957v81 c8957v81) {
        if (c8957v81 == null) {
            y0(23);
        }
        return c8957v81.k() ? this : new C7116ob0(this, C8957v81.h(c8957v81.j(), K0().j()));
    }

    public final YS0 M0(YS0 ys0) {
        return (ys0 == null || this.D.k()) ? ys0 : (YS0) K0().p(ys0, EnumC1042Hc1.F);
    }

    @Override // com.daaw.InterfaceC4923gl
    public InterfaceC3241al N() {
        return this.C.N();
    }

    @Override // com.daaw.InterfaceC4923gl
    public InterfaceC4346ej0 O() {
        InterfaceC4346ej0 interfaceC4346ej0O = this.C.O();
        if (interfaceC4346ej0O == null) {
            y0(15);
        }
        return interfaceC4346ej0O;
    }

    @Override // com.daaw.InterfaceC4923gl
    public InterfaceC4923gl Q() {
        return this.C.Q();
    }

    @Override // com.daaw.AbstractC2134Rk0
    public InterfaceC4346ej0 U(Q80 q80) {
        if (q80 == null) {
            y0(13);
        }
        InterfaceC4346ej0 interfaceC4346ej0U = this.C.U(q80);
        if (!this.D.k()) {
            return new C6270lZ0(interfaceC4346ej0U, K0());
        }
        if (interfaceC4346ej0U == null) {
            y0(14);
        }
        return interfaceC4346ej0U;
    }

    @Override // com.daaw.InterfaceC4923gl, com.daaw.InterfaceC9177vw, com.daaw.InterfaceC8612tw
    public InterfaceC8612tw b() {
        InterfaceC8612tw interfaceC8612twB = this.C.b();
        if (interfaceC8612twB == null) {
            y0(22);
        }
        return interfaceC8612twB;
    }

    @Override // com.daaw.A7
    public InterfaceC3072a8 getAnnotations() {
        InterfaceC3072a8 annotations = this.C.getAnnotations();
        if (annotations == null) {
            y0(19);
        }
        return annotations;
    }

    @Override // com.daaw.InterfaceC3809cn0
    public C2352Tm0 getName() {
        C2352Tm0 name = this.C.getName();
        if (name == null) {
            y0(20);
        }
        return name;
    }

    @Override // com.daaw.InterfaceC4923gl, com.daaw.InterfaceC2232Si0, com.daaw.InterfaceC0383Aw
    public AbstractC8965vA getVisibility() {
        AbstractC8965vA visibility = this.C.getVisibility();
        if (visibility == null) {
            y0(27);
        }
        return visibility;
    }

    @Override // com.daaw.InterfaceC8612tw
    public Object h0(InterfaceC9735xw interfaceC9735xw, Object obj) {
        return interfaceC9735xw.l(this, obj);
    }

    @Override // com.daaw.InterfaceC4923gl
    public EnumC6886nl i() {
        EnumC6886nl enumC6886nlI = this.C.i();
        if (enumC6886nlI == null) {
            y0(25);
        }
        return enumC6886nlI;
    }

    @Override // com.daaw.InterfaceC2232Si0
    public boolean isExternal() {
        return this.C.isExternal();
    }

    @Override // com.daaw.InterfaceC4923gl
    public boolean isInline() {
        return this.C.isInline();
    }

    @Override // com.daaw.InterfaceC10293zw
    public RU0 j() {
        RU0 ru0 = RU0.a;
        if (ru0 == null) {
            y0(29);
        }
        return ru0;
    }

    @Override // com.daaw.InterfaceC10240zl
    public C71 k() {
        C71 c71K = this.C.k();
        if (this.D.k()) {
            if (c71K == null) {
                y0(0);
            }
            return c71K;
        }
        if (this.H == null) {
            C8957v81 c8957v81K0 = K0();
            Collection collectionB = c71K.b();
            ArrayList arrayList = new ArrayList(collectionB.size());
            Iterator it = collectionB.iterator();
            while (it.hasNext()) {
                arrayList.add(c8957v81K0.p((I80) it.next(), EnumC1042Hc1.F));
            }
            this.H = new C8280sl(this, this.F, arrayList, C9085vd0.e);
        }
        C71 c71 = this.H;
        if (c71 == null) {
            y0(1);
        }
        return c71;
    }

    @Override // com.daaw.InterfaceC4923gl, com.daaw.InterfaceC2232Si0
    public EnumC0336Ak0 l() {
        EnumC0336Ak0 enumC0336Ak0L = this.C.l();
        if (enumC0336Ak0L == null) {
            y0(26);
        }
        return enumC0336Ak0L;
    }

    @Override // com.daaw.InterfaceC4923gl
    public Collection m() {
        Collection<InterfaceC3241al> collectionM = this.C.m();
        ArrayList arrayList = new ArrayList(collectionM.size());
        for (InterfaceC3241al interfaceC3241al : collectionM) {
            arrayList.add(((InterfaceC3241al) interfaceC3241al.t().m(interfaceC3241al.a()).f(interfaceC3241al.l()).e(interfaceC3241al.getVisibility()).g(interfaceC3241al.i()).k(false).a()).c(K0()));
        }
        return arrayList;
    }

    @Override // com.daaw.InterfaceC4923gl
    public boolean n() {
        return this.C.n();
    }

    @Override // com.daaw.InterfaceC4923gl, com.daaw.InterfaceC10240zl
    public YS0 s() {
        YS0 ys0M = M80.m(C6668my.a.a(getAnnotations(), null, null), k(), D81.g(k().getParameters()), false, C0());
        if (ys0M == null) {
            y0(16);
        }
        return ys0M;
    }

    @Override // com.daaw.InterfaceC4923gl, com.daaw.InterfaceC0339Al
    public List v() {
        K0();
        List list = this.G;
        if (list == null) {
            y0(30);
        }
        return list;
    }

    @Override // com.daaw.InterfaceC4923gl
    public InterfaceC4346ej0 w0() {
        InterfaceC4346ej0 interfaceC4346ej0W0 = this.C.w0();
        if (interfaceC4346ej0W0 == null) {
            y0(28);
        }
        return interfaceC4346ej0W0;
    }

    @Override // com.daaw.InterfaceC4923gl
    public boolean x() {
        return this.C.x();
    }

    @Override // com.daaw.InterfaceC4923gl
    public AbstractC7958rc1 x0() {
        AbstractC7958rc1 abstractC7958rc1X0 = this.C.x0();
        if (abstractC7958rc1X0 == null) {
            return null;
        }
        return abstractC7958rc1X0.b(new b());
    }

    @Override // com.daaw.InterfaceC8612tw
    public InterfaceC4923gl a() {
        InterfaceC4923gl interfaceC4923glA = this.C.a();
        if (interfaceC4923glA == null) {
            y0(21);
        }
        return interfaceC4923glA;
    }
}
