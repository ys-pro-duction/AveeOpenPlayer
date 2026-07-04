package com.daaw;

import com.daaw.InterfaceC4346ej0;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: com.daaw.Yj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2859Yj implements InterfaceC4346ej0 {
    public static final a d = new a(null);
    public final String b;
    public final InterfaceC4346ej0[] c;

    /* JADX INFO: renamed from: com.daaw.Yj$a */
    public static final class a {
        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public final InterfaceC4346ej0 a(String str, Iterable iterable) {
            G10.g(str, "debugName");
            G10.g(iterable, "scopes");
            UT0 ut0 = new UT0();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                InterfaceC4346ej0 interfaceC4346ej0 = (InterfaceC4346ej0) it.next();
                if (interfaceC4346ej0 != InterfaceC4346ej0.b.b) {
                    if (interfaceC4346ej0 instanceof C2859Yj) {
                        AbstractC2141Rm.B(ut0, ((C2859Yj) interfaceC4346ej0).c);
                    } else {
                        ut0.add(interfaceC4346ej0);
                    }
                }
            }
            return b(str, ut0);
        }

        public final InterfaceC4346ej0 b(String str, List list) {
            G10.g(str, "debugName");
            G10.g(list, "scopes");
            int size = list.size();
            return size != 0 ? size != 1 ? new C2859Yj(str, (InterfaceC4346ej0[]) list.toArray(new InterfaceC4346ej0[0]), null) : (InterfaceC4346ej0) list.get(0) : InterfaceC4346ej0.b.b;
        }

        public a() {
        }
    }

    public /* synthetic */ C2859Yj(String str, InterfaceC4346ej0[] interfaceC4346ej0Arr, AbstractC2911Yw abstractC2911Yw) {
        this(str, interfaceC4346ej0Arr);
    }

    @Override // com.daaw.InterfaceC4346ej0
    public Collection a(C2352Tm0 c2352Tm0, InterfaceC7689qe0 interfaceC7689qe0) {
        G10.g(c2352Tm0, "name");
        G10.g(interfaceC7689qe0, "location");
        InterfaceC4346ej0[] interfaceC4346ej0Arr = this.c;
        int length = interfaceC4346ej0Arr.length;
        if (length == 0) {
            return AbstractC1599Mm.k();
        }
        if (length == 1) {
            return interfaceC4346ej0Arr[0].a(c2352Tm0, interfaceC7689qe0);
        }
        Collection collectionA = null;
        for (InterfaceC4346ej0 interfaceC4346ej0 : interfaceC4346ej0Arr) {
            collectionA = RN0.a(collectionA, interfaceC4346ej0.a(c2352Tm0, interfaceC7689qe0));
        }
        return collectionA == null ? AbstractC9867yQ0.d() : collectionA;
    }

    @Override // com.daaw.InterfaceC4346ej0
    public Set b() {
        InterfaceC4346ej0[] interfaceC4346ej0Arr = this.c;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (InterfaceC4346ej0 interfaceC4346ej0 : interfaceC4346ej0Arr) {
            AbstractC2141Rm.A(linkedHashSet, interfaceC4346ej0.b());
        }
        return linkedHashSet;
    }

    @Override // com.daaw.InterfaceC4346ej0
    public Collection c(C2352Tm0 c2352Tm0, InterfaceC7689qe0 interfaceC7689qe0) {
        G10.g(c2352Tm0, "name");
        G10.g(interfaceC7689qe0, "location");
        InterfaceC4346ej0[] interfaceC4346ej0Arr = this.c;
        int length = interfaceC4346ej0Arr.length;
        if (length == 0) {
            return AbstractC1599Mm.k();
        }
        if (length == 1) {
            return interfaceC4346ej0Arr[0].c(c2352Tm0, interfaceC7689qe0);
        }
        Collection collectionA = null;
        for (InterfaceC4346ej0 interfaceC4346ej0 : interfaceC4346ej0Arr) {
            collectionA = RN0.a(collectionA, interfaceC4346ej0.c(c2352Tm0, interfaceC7689qe0));
        }
        return collectionA == null ? AbstractC9867yQ0.d() : collectionA;
    }

    @Override // com.daaw.InterfaceC4346ej0
    public Set d() {
        InterfaceC4346ej0[] interfaceC4346ej0Arr = this.c;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (InterfaceC4346ej0 interfaceC4346ej0 : interfaceC4346ej0Arr) {
            AbstractC2141Rm.A(linkedHashSet, interfaceC4346ej0.d());
        }
        return linkedHashSet;
    }

    @Override // com.daaw.InterfaceC4346ej0
    public Set e() {
        return AbstractC4914gj0.a(AbstractC5431ib.y(this.c));
    }

    @Override // com.daaw.FI0
    public Collection f(C1651Mz c1651Mz, NQ nq) {
        G10.g(c1651Mz, "kindFilter");
        G10.g(nq, "nameFilter");
        InterfaceC4346ej0[] interfaceC4346ej0Arr = this.c;
        int length = interfaceC4346ej0Arr.length;
        if (length == 0) {
            return AbstractC1599Mm.k();
        }
        if (length == 1) {
            return interfaceC4346ej0Arr[0].f(c1651Mz, nq);
        }
        Collection collectionA = null;
        for (InterfaceC4346ej0 interfaceC4346ej0 : interfaceC4346ej0Arr) {
            collectionA = RN0.a(collectionA, interfaceC4346ej0.f(c1651Mz, nq));
        }
        return collectionA == null ? AbstractC9867yQ0.d() : collectionA;
    }

    @Override // com.daaw.FI0
    public InterfaceC10240zl g(C2352Tm0 c2352Tm0, InterfaceC7689qe0 interfaceC7689qe0) {
        G10.g(c2352Tm0, "name");
        G10.g(interfaceC7689qe0, "location");
        InterfaceC10240zl interfaceC10240zl = null;
        for (InterfaceC4346ej0 interfaceC4346ej0 : this.c) {
            InterfaceC10240zl interfaceC10240zlG = interfaceC4346ej0.g(c2352Tm0, interfaceC7689qe0);
            if (interfaceC10240zlG != null) {
                if (!(interfaceC10240zlG instanceof InterfaceC0339Al) || !((InterfaceC2232Si0) interfaceC10240zlG).J()) {
                    return interfaceC10240zlG;
                }
                if (interfaceC10240zl == null) {
                    interfaceC10240zl = interfaceC10240zlG;
                }
            }
        }
        return interfaceC10240zl;
    }

    public String toString() {
        return this.b;
    }

    public C2859Yj(String str, InterfaceC4346ej0[] interfaceC4346ej0Arr) {
        this.b = str;
        this.c = interfaceC4346ej0Arr;
    }
}
