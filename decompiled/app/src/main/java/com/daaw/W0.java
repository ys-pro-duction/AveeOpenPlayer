package com.daaw;

import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class W0 extends AbstractC9961yl {
    public final InterfaceC0881Fo0 b;
    public final boolean c;

    public final class a implements C71 {
        public final Q80 a;
        public final O90 b;
        public final /* synthetic */ W0 c;

        public a(W0 w0, Q80 q80) {
            G10.g(q80, "kotlinTypeRefiner");
            this.c = w0;
            this.a = q80;
            this.b = AbstractC3192ab0.b(EnumC7395pb0.C, new V0(this, w0));
        }

        public static final List i(a aVar, W0 w0) {
            G10.g(aVar, "this$0");
            G10.g(w0, "this$1");
            return R80.b(aVar.a, w0.b());
        }

        @Override // com.daaw.C71
        public C71 a(Q80 q80) {
            G10.g(q80, "kotlinTypeRefiner");
            return this.c.a(q80);
        }

        @Override // com.daaw.C71
        public InterfaceC10240zl c() {
            return this.c.c();
        }

        @Override // com.daaw.C71
        public boolean d() {
            return this.c.d();
        }

        public boolean equals(Object obj) {
            return this.c.equals(obj);
        }

        public final List g() {
            return (List) this.b.getValue();
        }

        @Override // com.daaw.C71
        public List getParameters() {
            List parameters = this.c.getParameters();
            G10.f(parameters, "getParameters(...)");
            return parameters;
        }

        @Override // com.daaw.C71
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public List b() {
            return g();
        }

        public int hashCode() {
            return this.c.hashCode();
        }

        @Override // com.daaw.C71
        public AbstractC8670u80 p() {
            AbstractC8670u80 abstractC8670u80P = this.c.p();
            G10.f(abstractC8670u80P, "getBuiltIns(...)");
            return abstractC8670u80P;
        }

        public String toString() {
            return this.c.toString();
        }
    }

    public static final class b {
        public final Collection a;
        public List b;

        public b(Collection collection) {
            G10.g(collection, "allSupertypes");
            this.a = collection;
            this.b = AbstractC1496Lm.e(BH.a.l());
        }

        public final Collection a() {
            return this.a;
        }

        public final List b() {
            return this.b;
        }

        public final void c(List list) {
            G10.g(list, "<set-?>");
            this.b = list;
        }
    }

    public W0(InterfaceC10174zX0 interfaceC10174zX0) {
        G10.g(interfaceC10174zX0, "storageManager");
        this.b = interfaceC10174zX0.i(new O0(this), P0.B, new Q0(this));
    }

    public static final b A(W0 w0) {
        G10.g(w0, "this$0");
        return new b(w0.r());
    }

    public static final b B(boolean z) {
        return new b(AbstractC1496Lm.e(BH.a.l()));
    }

    public static final G91 C(W0 w0, b bVar) {
        G10.g(w0, "this$0");
        G10.g(bVar, "supertypes");
        List listA = w0.v().a(w0, bVar.a(), new R0(w0), new S0(w0));
        if (listA.isEmpty()) {
            I80 i80S = w0.s();
            List listE = i80S != null ? AbstractC1496Lm.e(i80S) : null;
            if (listE == null) {
                listE = AbstractC1599Mm.k();
            }
            listA = listE;
        }
        if (w0.u()) {
            w0.v().a(w0, listA, new T0(w0), new U0(w0));
        }
        List listM0 = listA instanceof List ? (List) listA : null;
        if (listM0 == null) {
            listM0 = AbstractC2455Um.M0(listA);
        }
        bVar.c(w0.x(listM0));
        return G91.a;
    }

    public static final Iterable D(W0 w0, C71 c71) {
        G10.g(w0, "this$0");
        G10.g(c71, "it");
        return w0.q(c71, false);
    }

    public static final G91 E(W0 w0, I80 i80) {
        G10.g(w0, "this$0");
        G10.g(i80, "it");
        w0.z(i80);
        return G91.a;
    }

    public static final Iterable F(W0 w0, C71 c71) {
        G10.g(w0, "this$0");
        G10.g(c71, "it");
        return w0.q(c71, true);
    }

    public static final G91 G(W0 w0, I80 i80) {
        G10.g(w0, "this$0");
        G10.g(i80, "it");
        w0.y(i80);
        return G91.a;
    }

    @Override // com.daaw.C71
    public C71 a(Q80 q80) {
        G10.g(q80, "kotlinTypeRefiner");
        return new a(this, q80);
    }

    public final Collection q(C71 c71, boolean z) {
        List listZ0;
        W0 w0 = c71 instanceof W0 ? (W0) c71 : null;
        if (w0 != null && (listZ0 = AbstractC2455Um.z0(((b) w0.b.invoke()).a(), w0.t(z))) != null) {
            return listZ0;
        }
        Collection collectionB = c71.b();
        G10.f(collectionB, "getSupertypes(...)");
        return collectionB;
    }

    public abstract Collection r();

    public abstract I80 s();

    public Collection t(boolean z) {
        return AbstractC1599Mm.k();
    }

    public boolean u() {
        return this.c;
    }

    public abstract InterfaceC9624xZ0 v();

    @Override // com.daaw.C71
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public List b() {
        return ((b) this.b.invoke()).b();
    }

    public List x(List list) {
        G10.g(list, "supertypes");
        return list;
    }

    public void y(I80 i80) {
        G10.g(i80, "type");
    }

    public void z(I80 i80) {
        G10.g(i80, "type");
    }
}
