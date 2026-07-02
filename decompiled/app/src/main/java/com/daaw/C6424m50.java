package com.daaw;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: renamed from: com.daaw.m50, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C6424m50 implements InterfaceC4346ej0 {
    public static final /* synthetic */ W60[] f = {AbstractC5624jG0.h(new C6728nA0(AbstractC5624jG0.b(C6424m50.class), "kotlinScopes", "getKotlinScopes()[Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;"))};
    public final C0504Ca0 b;
    public final C9349wa0 c;
    public final C0400Ba0 d;
    public final InterfaceC0881Fo0 e;

    public C6424m50(C0504Ca0 c0504Ca0, InterfaceC5565j30 interfaceC5565j30, C9349wa0 c9349wa0) {
        G10.g(c0504Ca0, "c");
        G10.g(interfaceC5565j30, "jPackage");
        G10.g(c9349wa0, "packageFragment");
        this.b = c0504Ca0;
        this.c = c9349wa0;
        this.d = new C0400Ba0(c0504Ca0, interfaceC5565j30, c9349wa0);
        this.e = c0504Ca0.e().h(new C6145l50(this));
    }

    public static final InterfaceC4346ej0[] k(C6424m50 c6424m50) {
        G10.g(c6424m50, "this$0");
        Collection collectionValues = c6424m50.c.O0().values();
        ArrayList arrayList = new ArrayList();
        Iterator it = collectionValues.iterator();
        while (it.hasNext()) {
            InterfaceC4346ej0 interfaceC4346ej0C = c6424m50.b.a().b().c(c6424m50.c, (InterfaceC10072z80) it.next());
            if (interfaceC4346ej0C != null) {
                arrayList.add(interfaceC4346ej0C);
            }
        }
        return (InterfaceC4346ej0[]) RN0.b(arrayList).toArray(new InterfaceC4346ej0[0]);
    }

    @Override // com.daaw.InterfaceC4346ej0
    public Collection a(C2352Tm0 c2352Tm0, InterfaceC7689qe0 interfaceC7689qe0) {
        G10.g(c2352Tm0, "name");
        G10.g(interfaceC7689qe0, "location");
        l(c2352Tm0, interfaceC7689qe0);
        C0400Ba0 c0400Ba0 = this.d;
        InterfaceC4346ej0[] interfaceC4346ej0ArrJ = j();
        Collection collectionA = c0400Ba0.a(c2352Tm0, interfaceC7689qe0);
        for (InterfaceC4346ej0 interfaceC4346ej0 : interfaceC4346ej0ArrJ) {
            collectionA = RN0.a(collectionA, interfaceC4346ej0.a(c2352Tm0, interfaceC7689qe0));
        }
        return collectionA == null ? AbstractC9867yQ0.d() : collectionA;
    }

    @Override // com.daaw.InterfaceC4346ej0
    public Set b() {
        InterfaceC4346ej0[] interfaceC4346ej0ArrJ = j();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (InterfaceC4346ej0 interfaceC4346ej0 : interfaceC4346ej0ArrJ) {
            AbstractC2141Rm.A(linkedHashSet, interfaceC4346ej0.b());
        }
        linkedHashSet.addAll(this.d.b());
        return linkedHashSet;
    }

    @Override // com.daaw.InterfaceC4346ej0
    public Collection c(C2352Tm0 c2352Tm0, InterfaceC7689qe0 interfaceC7689qe0) {
        G10.g(c2352Tm0, "name");
        G10.g(interfaceC7689qe0, "location");
        l(c2352Tm0, interfaceC7689qe0);
        C0400Ba0 c0400Ba0 = this.d;
        InterfaceC4346ej0[] interfaceC4346ej0ArrJ = j();
        Collection collectionC = c0400Ba0.c(c2352Tm0, interfaceC7689qe0);
        for (InterfaceC4346ej0 interfaceC4346ej0 : interfaceC4346ej0ArrJ) {
            collectionC = RN0.a(collectionC, interfaceC4346ej0.c(c2352Tm0, interfaceC7689qe0));
        }
        return collectionC == null ? AbstractC9867yQ0.d() : collectionC;
    }

    @Override // com.daaw.InterfaceC4346ej0
    public Set d() {
        InterfaceC4346ej0[] interfaceC4346ej0ArrJ = j();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (InterfaceC4346ej0 interfaceC4346ej0 : interfaceC4346ej0ArrJ) {
            AbstractC2141Rm.A(linkedHashSet, interfaceC4346ej0.d());
        }
        linkedHashSet.addAll(this.d.d());
        return linkedHashSet;
    }

    @Override // com.daaw.InterfaceC4346ej0
    public Set e() {
        Set setA = AbstractC4914gj0.a(AbstractC5431ib.y(j()));
        if (setA == null) {
            return null;
        }
        setA.addAll(this.d.e());
        return setA;
    }

    @Override // com.daaw.FI0
    public Collection f(C1651Mz c1651Mz, NQ nq) {
        G10.g(c1651Mz, "kindFilter");
        G10.g(nq, "nameFilter");
        C0400Ba0 c0400Ba0 = this.d;
        InterfaceC4346ej0[] interfaceC4346ej0ArrJ = j();
        Collection collectionF = c0400Ba0.f(c1651Mz, nq);
        for (InterfaceC4346ej0 interfaceC4346ej0 : interfaceC4346ej0ArrJ) {
            collectionF = RN0.a(collectionF, interfaceC4346ej0.f(c1651Mz, nq));
        }
        return collectionF == null ? AbstractC9867yQ0.d() : collectionF;
    }

    @Override // com.daaw.FI0
    public InterfaceC10240zl g(C2352Tm0 c2352Tm0, InterfaceC7689qe0 interfaceC7689qe0) {
        G10.g(c2352Tm0, "name");
        G10.g(interfaceC7689qe0, "location");
        l(c2352Tm0, interfaceC7689qe0);
        InterfaceC4923gl interfaceC4923glG = this.d.g(c2352Tm0, interfaceC7689qe0);
        if (interfaceC4923glG != null) {
            return interfaceC4923glG;
        }
        InterfaceC10240zl interfaceC10240zl = null;
        for (InterfaceC4346ej0 interfaceC4346ej0 : j()) {
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

    public final C0400Ba0 i() {
        return this.d;
    }

    public final InterfaceC4346ej0[] j() {
        return (InterfaceC4346ej0[]) AbstractC9895yX0.a(this.e, this, f[0]);
    }

    public void l(C2352Tm0 c2352Tm0, InterfaceC7689qe0 interfaceC7689qe0) {
        G10.g(c2352Tm0, "name");
        G10.g(interfaceC7689qe0, "location");
        AbstractC1038Hb1.b(this.b.a().l(), interfaceC7689qe0, this.c, c2352Tm0);
    }

    public String toString() {
        return "scope for " + this.c;
    }
}
