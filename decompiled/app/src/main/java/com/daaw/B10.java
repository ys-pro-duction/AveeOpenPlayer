package com.daaw;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class B10 implements C71, C10 {
    public I80 a;
    public final LinkedHashSet b;
    public final int c;

    public static final class a implements Comparator {
        public final /* synthetic */ NQ B;

        public a(NQ nq) {
            this.B = nq;
        }

        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            I80 i80 = (I80) obj;
            NQ nq = this.B;
            G10.d(i80);
            String string = nq.invoke(i80).toString();
            I80 i802 = (I80) obj2;
            NQ nq2 = this.B;
            G10.d(i802);
            return AbstractC1188In.a(string, nq2.invoke(i802).toString());
        }
    }

    public B10(Collection collection) {
        G10.g(collection, "typesToIntersect");
        collection.isEmpty();
        LinkedHashSet linkedHashSet = new LinkedHashSet(collection);
        this.b = linkedHashSet;
        this.c = linkedHashSet.hashCode();
    }

    public static final YS0 k(B10 b10, Q80 q80) {
        G10.g(b10, "this$0");
        G10.g(q80, "kotlinTypeRefiner");
        return b10.a(q80).j();
    }

    public static /* synthetic */ String n(B10 b10, NQ nq, int i, Object obj) {
        if ((i & 1) != 0) {
            nq = C10037z10.B;
        }
        return b10.m(nq);
    }

    public static final String o(I80 i80) {
        G10.g(i80, "it");
        return i80.toString();
    }

    public static final CharSequence q(NQ nq, I80 i80) {
        G10.g(nq, "$getProperTypeRelatedToStringify");
        G10.d(i80);
        return nq.invoke(i80).toString();
    }

    @Override // com.daaw.C71
    public Collection b() {
        return this.b;
    }

    @Override // com.daaw.C71
    public InterfaceC10240zl c() {
        return null;
    }

    @Override // com.daaw.C71
    public boolean d() {
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof B10) {
            return G10.c(this.b, ((B10) obj).b);
        }
        return false;
    }

    @Override // com.daaw.C71
    public List getParameters() {
        return AbstractC1599Mm.k();
    }

    public int hashCode() {
        return this.c;
    }

    public final InterfaceC4346ej0 i() {
        return S71.d.a("member scope for intersection type", this.b);
    }

    public final YS0 j() {
        return M80.n(C8387t71.C.j(), this, AbstractC1599Mm.k(), false, i(), new A10(this));
    }

    public final I80 l() {
        return this.a;
    }

    public final String m(NQ nq) {
        G10.g(nq, "getProperTypeRelatedToStringify");
        return AbstractC2455Um.n0(AbstractC2455Um.H0(this.b, new a(nq)), " & ", "{", "}", 0, null, new C9758y10(nq), 24, null);
    }

    @Override // com.daaw.C71
    public AbstractC8670u80 p() {
        AbstractC8670u80 abstractC8670u80P = ((I80) this.b.iterator().next()).N0().p();
        G10.f(abstractC8670u80P, "getBuiltIns(...)");
        return abstractC8670u80P;
    }

    @Override // com.daaw.C71
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public B10 a(Q80 q80) {
        G10.g(q80, "kotlinTypeRefiner");
        Collection collectionB = b();
        ArrayList arrayList = new ArrayList(AbstractC1703Nm.v(collectionB, 10));
        Iterator it = collectionB.iterator();
        boolean z = false;
        while (it.hasNext()) {
            arrayList.add(((I80) it.next()).X0(q80));
            z = true;
        }
        B10 b10S = null;
        if (z) {
            I80 i80L = l();
            b10S = new B10(arrayList).s(i80L != null ? i80L.X0(q80) : null);
        }
        return b10S == null ? this : b10S;
    }

    public final B10 s(I80 i80) {
        return new B10(this.b, i80);
    }

    public String toString() {
        return n(this, null, 1, null);
    }

    public B10(Collection collection, I80 i80) {
        this(collection);
        this.a = i80;
    }
}
