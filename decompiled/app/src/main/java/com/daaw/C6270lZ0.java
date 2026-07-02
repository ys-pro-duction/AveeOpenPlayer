package com.daaw;

import com.daaw.FI0;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: com.daaw.lZ0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C6270lZ0 implements InterfaceC4346ej0 {
    public final InterfaceC4346ej0 b;
    public final O90 c;
    public final C8957v81 d;
    public Map e;
    public final O90 f;

    public C6270lZ0(InterfaceC4346ej0 interfaceC4346ej0, C8957v81 c8957v81) {
        G10.g(interfaceC4346ej0, "workerScope");
        G10.g(c8957v81, "givenSubstitutor");
        this.b = interfaceC4346ej0;
        this.c = AbstractC3192ab0.a(new C5703jZ0(c8957v81));
        AbstractC8392t81 abstractC8392t81J = c8957v81.j();
        G10.f(abstractC8392t81J, "getSubstitution(...)");
        this.d = AbstractC0860Fj.h(abstractC8392t81J, false, 1, null).c();
        this.f = AbstractC3192ab0.a(new C5982kZ0(this));
    }

    public static final Collection h(C6270lZ0 c6270lZ0) {
        G10.g(c6270lZ0, "this$0");
        return c6270lZ0.m(FI0.a.a(c6270lZ0.b, null, null, 3, null));
    }

    public static final C8957v81 n(C8957v81 c8957v81) {
        G10.g(c8957v81, "$givenSubstitutor");
        return c8957v81.j().c();
    }

    @Override // com.daaw.InterfaceC4346ej0
    public Collection a(C2352Tm0 c2352Tm0, InterfaceC7689qe0 interfaceC7689qe0) {
        G10.g(c2352Tm0, "name");
        G10.g(interfaceC7689qe0, "location");
        return m(this.b.a(c2352Tm0, interfaceC7689qe0));
    }

    @Override // com.daaw.InterfaceC4346ej0
    public Set b() {
        return this.b.b();
    }

    @Override // com.daaw.InterfaceC4346ej0
    public Collection c(C2352Tm0 c2352Tm0, InterfaceC7689qe0 interfaceC7689qe0) {
        G10.g(c2352Tm0, "name");
        G10.g(interfaceC7689qe0, "location");
        return m(this.b.c(c2352Tm0, interfaceC7689qe0));
    }

    @Override // com.daaw.InterfaceC4346ej0
    public Set d() {
        return this.b.d();
    }

    @Override // com.daaw.InterfaceC4346ej0
    public Set e() {
        return this.b.e();
    }

    @Override // com.daaw.FI0
    public Collection f(C1651Mz c1651Mz, NQ nq) {
        G10.g(c1651Mz, "kindFilter");
        G10.g(nq, "nameFilter");
        return k();
    }

    @Override // com.daaw.FI0
    public InterfaceC10240zl g(C2352Tm0 c2352Tm0, InterfaceC7689qe0 interfaceC7689qe0) {
        G10.g(c2352Tm0, "name");
        G10.g(interfaceC7689qe0, "location");
        InterfaceC10240zl interfaceC10240zlG = this.b.g(c2352Tm0, interfaceC7689qe0);
        if (interfaceC10240zlG != null) {
            return (InterfaceC10240zl) l(interfaceC10240zlG);
        }
        return null;
    }

    public final Collection k() {
        return (Collection) this.f.getValue();
    }

    public final InterfaceC8612tw l(InterfaceC8612tw interfaceC8612tw) {
        if (this.d.k()) {
            return interfaceC8612tw;
        }
        if (this.e == null) {
            this.e = new HashMap();
        }
        Map map = this.e;
        G10.d(map);
        Object objC = map.get(interfaceC8612tw);
        if (objC == null) {
            if (!(interfaceC8612tw instanceof InterfaceC4297eZ0)) {
                throw new IllegalStateException(("Unknown descriptor in scope: " + interfaceC8612tw).toString());
            }
            objC = ((InterfaceC4297eZ0) interfaceC8612tw).c(this.d);
            if (objC == null) {
                throw new AssertionError("We expect that no conflict should happen while substitution is guaranteed to generate invariant projection, but " + interfaceC8612tw + " substitution fails");
            }
            map.put(interfaceC8612tw, objC);
        }
        InterfaceC8612tw interfaceC8612tw2 = (InterfaceC8612tw) objC;
        G10.e(interfaceC8612tw2, "null cannot be cast to non-null type D of org.jetbrains.kotlin.resolve.scopes.SubstitutingScope.substitute");
        return interfaceC8612tw2;
    }

    public final Collection m(Collection collection) {
        if (this.d.k() || collection.isEmpty()) {
            return collection;
        }
        LinkedHashSet linkedHashSetG = AbstractC1392Km.g(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            linkedHashSetG.add(l((InterfaceC8612tw) it.next()));
        }
        return linkedHashSetG;
    }
}
