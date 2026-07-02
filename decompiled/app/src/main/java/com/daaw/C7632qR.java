package com.daaw;

import com.daaw.AbstractC9870yR;
import com.daaw.InterfaceC4346ej0;
import com.daaw.InterfaceC9624xZ0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.qR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C7632qR extends AbstractC8349t {
    public static final a O = new a(null);
    public static final C6607ml P;
    public static final C6607ml Q;
    public final InterfaceC10174zX0 G;
    public final InterfaceC2372Tr0 H;
    public final AbstractC9870yR I;
    public final int J;
    public final b K;
    public final C8189sR L;
    public final List M;
    public final EnumC7910rR N;

    /* JADX INFO: renamed from: com.daaw.qR$a */
    public static final class a {
        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public a() {
        }
    }

    /* JADX INFO: renamed from: com.daaw.qR$b */
    public final class b extends AbstractC8628u {
        public b() {
            super(C7632qR.this.G);
        }

        @Override // com.daaw.AbstractC9961yl, com.daaw.C71
        /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
        public C7632qR c() {
            return C7632qR.this;
        }

        @Override // com.daaw.C71
        public boolean d() {
            return true;
        }

        @Override // com.daaw.C71
        public List getParameters() {
            return C7632qR.this.M;
        }

        @Override // com.daaw.W0
        public Collection r() {
            List listN;
            AbstractC9870yR abstractC9870yRU0 = C7632qR.this.U0();
            AbstractC9870yR.a aVar = AbstractC9870yR.a.e;
            if (G10.c(abstractC9870yRU0, aVar)) {
                listN = AbstractC1496Lm.e(C7632qR.P);
            } else if (G10.c(abstractC9870yRU0, AbstractC9870yR.b.e)) {
                listN = AbstractC1599Mm.n(C7632qR.Q, new C6607ml(YV0.A, aVar.c(C7632qR.this.Q0())));
            } else {
                AbstractC9870yR.d dVar = AbstractC9870yR.d.e;
                if (G10.c(abstractC9870yRU0, dVar)) {
                    listN = AbstractC1496Lm.e(C7632qR.P);
                } else {
                    if (!G10.c(abstractC9870yRU0, AbstractC9870yR.c.e)) {
                        Y2.b(null, 1, null);
                        throw null;
                    }
                    listN = AbstractC1599Mm.n(C7632qR.Q, new C6607ml(YV0.s, dVar.c(C7632qR.this.Q0())));
                }
            }
            InterfaceC2968Zk0 interfaceC2968Zk0B = C7632qR.this.H.b();
            List<C6607ml> list = listN;
            ArrayList arrayList = new ArrayList(AbstractC1703Nm.v(list, 10));
            for (C6607ml c6607ml : list) {
                InterfaceC4923gl interfaceC4923glB = AbstractC5366iL.b(interfaceC2968Zk0B, c6607ml);
                if (interfaceC4923glB == null) {
                    throw new IllegalStateException(("Built-in class " + c6607ml + " not found").toString());
                }
                List listJ0 = AbstractC2455Um.J0(getParameters(), interfaceC4923glB.k().getParameters().size());
                ArrayList arrayList2 = new ArrayList(AbstractC1703Nm.v(listJ0, 10));
                Iterator it = listJ0.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new C6998o81(((Z71) it.next()).s()));
                }
                arrayList.add(M80.h(C8387t71.C.j(), interfaceC4923glB, arrayList2));
            }
            return AbstractC2455Um.M0(arrayList);
        }

        public String toString() {
            return c().toString();
        }

        @Override // com.daaw.W0
        public InterfaceC9624xZ0 v() {
            return InterfaceC9624xZ0.a.a;
        }
    }

    static {
        AP ap = YV0.A;
        C2352Tm0 c2352Tm0L = C2352Tm0.l("Function");
        G10.f(c2352Tm0L, "identifier(...)");
        P = new C6607ml(ap, c2352Tm0L);
        AP ap2 = YV0.x;
        C2352Tm0 c2352Tm0L2 = C2352Tm0.l("KFunction");
        G10.f(c2352Tm0L2, "identifier(...)");
        Q = new C6607ml(ap2, c2352Tm0L2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7632qR(InterfaceC10174zX0 interfaceC10174zX0, InterfaceC2372Tr0 interfaceC2372Tr0, AbstractC9870yR abstractC9870yR, int i) {
        super(interfaceC10174zX0, abstractC9870yR.c(i));
        G10.g(interfaceC10174zX0, "storageManager");
        G10.g(interfaceC2372Tr0, "containingDeclaration");
        G10.g(abstractC9870yR, "functionTypeKind");
        this.G = interfaceC10174zX0;
        this.H = interfaceC2372Tr0;
        this.I = abstractC9870yR;
        this.J = i;
        this.K = new b();
        this.L = new C8189sR(interfaceC10174zX0, this);
        ArrayList arrayList = new ArrayList();
        H00 h00 = new H00(1, i);
        ArrayList arrayList2 = new ArrayList(AbstractC1703Nm.v(h00, 10));
        Iterator it = h00.iterator();
        while (it.hasNext()) {
            int iB = ((A00) it).b();
            EnumC1042Hc1 enumC1042Hc1 = EnumC1042Hc1.G;
            StringBuilder sb = new StringBuilder();
            sb.append('P');
            sb.append(iB);
            K0(arrayList, this, enumC1042Hc1, sb.toString());
            arrayList2.add(G91.a);
        }
        K0(arrayList, this, EnumC1042Hc1.H, "R");
        this.M = AbstractC2455Um.M0(arrayList);
        this.N = EnumC7910rR.B.a(this.I);
    }

    public static final void K0(ArrayList arrayList, C7632qR c7632qR, EnumC1042Hc1 enumC1042Hc1, String str) {
        arrayList.add(C3074a81.R0(c7632qR, InterfaceC3072a8.b.b(), false, enumC1042Hc1, C2352Tm0.l(str), arrayList.size(), c7632qR.G));
    }

    @Override // com.daaw.InterfaceC4923gl
    public boolean B() {
        return false;
    }

    @Override // com.daaw.InterfaceC2232Si0
    public boolean E0() {
        return false;
    }

    @Override // com.daaw.InterfaceC4923gl
    public boolean I0() {
        return false;
    }

    @Override // com.daaw.InterfaceC2232Si0
    public boolean J() {
        return false;
    }

    @Override // com.daaw.InterfaceC0339Al
    public boolean K() {
        return false;
    }

    @Override // com.daaw.InterfaceC4923gl
    public /* bridge */ /* synthetic */ InterfaceC3241al N() {
        return (InterfaceC3241al) Y0();
    }

    @Override // com.daaw.InterfaceC4923gl
    public /* bridge */ /* synthetic */ InterfaceC4923gl Q() {
        return (InterfaceC4923gl) R0();
    }

    public final int Q0() {
        return this.J;
    }

    public Void R0() {
        return null;
    }

    @Override // com.daaw.InterfaceC4923gl
    /* JADX INFO: renamed from: S0, reason: merged with bridge method [inline-methods] */
    public List m() {
        return AbstractC1599Mm.k();
    }

    @Override // com.daaw.InterfaceC4923gl, com.daaw.InterfaceC9177vw, com.daaw.InterfaceC8612tw
    /* JADX INFO: renamed from: T0, reason: merged with bridge method [inline-methods] */
    public InterfaceC2372Tr0 b() {
        return this.H;
    }

    public final AbstractC9870yR U0() {
        return this.I;
    }

    @Override // com.daaw.InterfaceC4923gl
    /* JADX INFO: renamed from: V0, reason: merged with bridge method [inline-methods] */
    public List H() {
        return AbstractC1599Mm.k();
    }

    @Override // com.daaw.InterfaceC4923gl
    /* JADX INFO: renamed from: W0, reason: merged with bridge method [inline-methods] */
    public InterfaceC4346ej0.b O() {
        return InterfaceC4346ej0.b.b;
    }

    @Override // com.daaw.AbstractC2134Rk0
    /* JADX INFO: renamed from: X0, reason: merged with bridge method [inline-methods] */
    public C8189sR U(Q80 q80) {
        G10.g(q80, "kotlinTypeRefiner");
        return this.L;
    }

    public Void Y0() {
        return null;
    }

    @Override // com.daaw.A7
    public InterfaceC3072a8 getAnnotations() {
        return InterfaceC3072a8.b.b();
    }

    @Override // com.daaw.InterfaceC4923gl, com.daaw.InterfaceC2232Si0, com.daaw.InterfaceC0383Aw
    public AbstractC8965vA getVisibility() {
        AbstractC8965vA abstractC8965vA = AbstractC8679uA.e;
        G10.f(abstractC8965vA, "PUBLIC");
        return abstractC8965vA;
    }

    @Override // com.daaw.InterfaceC4923gl
    public EnumC6886nl i() {
        return EnumC6886nl.D;
    }

    @Override // com.daaw.InterfaceC2232Si0
    public boolean isExternal() {
        return false;
    }

    @Override // com.daaw.InterfaceC4923gl
    public boolean isInline() {
        return false;
    }

    @Override // com.daaw.InterfaceC10293zw
    public RU0 j() {
        RU0 ru0 = RU0.a;
        G10.f(ru0, "NO_SOURCE");
        return ru0;
    }

    @Override // com.daaw.InterfaceC10240zl
    public C71 k() {
        return this.K;
    }

    @Override // com.daaw.InterfaceC4923gl, com.daaw.InterfaceC2232Si0
    public EnumC0336Ak0 l() {
        return EnumC0336Ak0.F;
    }

    @Override // com.daaw.InterfaceC4923gl
    public boolean n() {
        return false;
    }

    public String toString() {
        String strC = getName().c();
        G10.f(strC, "asString(...)");
        return strC;
    }

    @Override // com.daaw.InterfaceC4923gl, com.daaw.InterfaceC0339Al
    public List v() {
        return this.M;
    }

    @Override // com.daaw.InterfaceC4923gl
    public boolean x() {
        return false;
    }

    @Override // com.daaw.InterfaceC4923gl
    public AbstractC7958rc1 x0() {
        return null;
    }
}
