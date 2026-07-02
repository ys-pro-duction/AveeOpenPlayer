package com.daaw;

import com.daaw.InterfaceC4346ej0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.Co0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0560Co0 {
    public final InterfaceC10174zX0 a;
    public final InterfaceC2968Zk0 b;
    public final InterfaceC5471ij0 c;
    public final InterfaceC5471ij0 d;

    /* JADX INFO: renamed from: com.daaw.Co0$a */
    public static final class a {
        public final C6607ml a;
        public final List b;

        public a(C6607ml c6607ml, List list) {
            G10.g(c6607ml, "classId");
            G10.g(list, "typeParametersCount");
            this.a = c6607ml;
            this.b = list;
        }

        public final C6607ml a() {
            return this.a;
        }

        public final List b() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return G10.c(this.a, aVar.a) && G10.c(this.b, aVar.b);
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + this.b.hashCode();
        }

        public String toString() {
            return "ClassRequest(classId=" + this.a + ", typeParametersCount=" + this.b + ')';
        }
    }

    /* JADX INFO: renamed from: com.daaw.Co0$b */
    public static final class b extends AbstractC5202hl {
        public final boolean J;
        public final List K;
        public final C8280sl L;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC10174zX0 interfaceC10174zX0, InterfaceC8612tw interfaceC8612tw, C2352Tm0 c2352Tm0, boolean z, int i) {
            super(interfaceC10174zX0, interfaceC8612tw, c2352Tm0, RU0.a, false);
            G10.g(interfaceC10174zX0, "storageManager");
            G10.g(interfaceC8612tw, "container");
            G10.g(c2352Tm0, "name");
            this.J = z;
            H00 h00Q = AbstractC8417tE0.q(0, i);
            ArrayList arrayList = new ArrayList(AbstractC1703Nm.v(h00Q, 10));
            Iterator it = h00Q.iterator();
            while (it.hasNext()) {
                int iB = ((A00) it).b();
                InterfaceC3072a8 interfaceC3072a8B = InterfaceC3072a8.b.b();
                EnumC1042Hc1 enumC1042Hc1 = EnumC1042Hc1.F;
                StringBuilder sb = new StringBuilder();
                sb.append('T');
                sb.append(iB);
                arrayList.add(C3074a81.R0(this, interfaceC3072a8B, false, enumC1042Hc1, C2352Tm0.l(sb.toString()), iB, interfaceC10174zX0));
            }
            this.K = arrayList;
            this.L = new C8280sl(this, AbstractC6161l81.g(this), AbstractC9588xQ0.c(AbstractC8400tA.s(this).p().i()), interfaceC10174zX0);
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
        public Collection H() {
            return AbstractC1599Mm.k();
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
            return this.J;
        }

        @Override // com.daaw.InterfaceC4923gl
        /* JADX INFO: renamed from: K0, reason: merged with bridge method [inline-methods] */
        public InterfaceC4346ej0.b O() {
            return InterfaceC4346ej0.b.b;
        }

        @Override // com.daaw.InterfaceC10240zl
        /* JADX INFO: renamed from: L0, reason: merged with bridge method [inline-methods] */
        public C8280sl k() {
            return this.L;
        }

        @Override // com.daaw.AbstractC2134Rk0
        /* JADX INFO: renamed from: M0, reason: merged with bridge method [inline-methods] */
        public InterfaceC4346ej0.b U(Q80 q80) {
            G10.g(q80, "kotlinTypeRefiner");
            return InterfaceC4346ej0.b.b;
        }

        @Override // com.daaw.InterfaceC4923gl
        public InterfaceC3241al N() {
            return null;
        }

        @Override // com.daaw.InterfaceC4923gl
        public InterfaceC4923gl Q() {
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
            return EnumC6886nl.C;
        }

        @Override // com.daaw.AbstractC5202hl, com.daaw.InterfaceC2232Si0
        public boolean isExternal() {
            return false;
        }

        @Override // com.daaw.InterfaceC4923gl
        public boolean isInline() {
            return false;
        }

        @Override // com.daaw.InterfaceC4923gl, com.daaw.InterfaceC2232Si0
        public EnumC0336Ak0 l() {
            return EnumC0336Ak0.C;
        }

        @Override // com.daaw.InterfaceC4923gl
        public Collection m() {
            return AbstractC9867yQ0.d();
        }

        @Override // com.daaw.InterfaceC4923gl
        public boolean n() {
            return false;
        }

        public String toString() {
            return "class " + getName() + " (not found)";
        }

        @Override // com.daaw.InterfaceC4923gl, com.daaw.InterfaceC0339Al
        public List v() {
            return this.K;
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

    public C0560Co0(InterfaceC10174zX0 interfaceC10174zX0, InterfaceC2968Zk0 interfaceC2968Zk0) {
        G10.g(interfaceC10174zX0, "storageManager");
        G10.g(interfaceC2968Zk0, "module");
        this.a = interfaceC10174zX0;
        this.b = interfaceC2968Zk0;
        this.c = interfaceC10174zX0.g(new C0352Ao0(this));
        this.d = interfaceC10174zX0.g(new C0456Bo0(this));
    }

    public static final InterfaceC4923gl c(C0560Co0 c0560Co0, a aVar) {
        InterfaceC8612tw interfaceC8612twD;
        G10.g(c0560Co0, "this$0");
        G10.g(aVar, "<destruct>");
        C6607ml c6607mlA = aVar.a();
        List listB = aVar.b();
        if (c6607mlA.i()) {
            throw new UnsupportedOperationException("Unresolved local class: " + c6607mlA);
        }
        C6607ml c6607mlE = c6607mlA.e();
        if (c6607mlE == null || (interfaceC8612twD = c0560Co0.d(c6607mlE, AbstractC2455Um.Y(listB, 1))) == null) {
            interfaceC8612twD = (InterfaceC7723ql) c0560Co0.c.invoke(c6607mlA.f());
        }
        InterfaceC8612tw interfaceC8612tw = interfaceC8612twD;
        boolean zJ = c6607mlA.j();
        InterfaceC10174zX0 interfaceC10174zX0 = c0560Co0.a;
        C2352Tm0 c2352Tm0H = c6607mlA.h();
        Integer num = (Integer) AbstractC2455Um.g0(listB);
        return new b(interfaceC10174zX0, interfaceC8612tw, c2352Tm0H, zJ, num != null ? num.intValue() : 0);
    }

    public static final InterfaceC2372Tr0 e(C0560Co0 c0560Co0, AP ap) {
        G10.g(c0560Co0, "this$0");
        G10.g(ap, "fqName");
        return new C7588qG(c0560Co0.b, ap);
    }

    public final InterfaceC4923gl d(C6607ml c6607ml, List list) {
        G10.g(c6607ml, "classId");
        G10.g(list, "typeParametersCount");
        return (InterfaceC4923gl) this.d.invoke(new a(c6607ml, list));
    }
}
