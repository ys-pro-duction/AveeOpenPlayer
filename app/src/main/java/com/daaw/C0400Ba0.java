package com.daaw;

import com.daaw.C1651Mz;
import com.daaw.C9514x80;
import com.daaw.H20;
import com.daaw.InterfaceC0487Bw;
import com.daaw.InterfaceC8956v80;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: renamed from: com.daaw.Ba0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0400Ba0 extends AbstractC2616Wa0 {
    public final InterfaceC5565j30 n;
    public final C9349wa0 o;
    public final InterfaceC4097dp0 p;
    public final InterfaceC5752jj0 q;

    /* JADX INFO: renamed from: com.daaw.Ba0$a */
    public static final class a {
        public final C2352Tm0 a;
        public final C20 b;

        public a(C2352Tm0 c2352Tm0, C20 c20) {
            G10.g(c2352Tm0, "name");
            this.a = c2352Tm0;
            this.b = c20;
        }

        public final C20 a() {
            return this.b;
        }

        public final C2352Tm0 b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            return (obj instanceof a) && G10.c(this.a, ((a) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }
    }

    /* JADX INFO: renamed from: com.daaw.Ba0$b */
    public static abstract class b {

        /* JADX INFO: renamed from: com.daaw.Ba0$b$a */
        public static final class a extends b {
            public final InterfaceC4923gl a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC4923gl interfaceC4923gl) {
                super(null);
                G10.g(interfaceC4923gl, "descriptor");
                this.a = interfaceC4923gl;
            }

            public final InterfaceC4923gl a() {
                return this.a;
            }
        }

        /* JADX INFO: renamed from: com.daaw.Ba0$b$b, reason: collision with other inner class name */
        public static final class C0051b extends b {
            public static final C0051b a = new C0051b();

            public C0051b() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: com.daaw.Ba0$b$c */
        public static final class c extends b {
            public static final c a = new c();

            public c() {
                super(null);
            }
        }

        public /* synthetic */ b(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public b() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0400Ba0(C0504Ca0 c0504Ca0, InterfaceC5565j30 interfaceC5565j30, C9349wa0 c9349wa0) {
        super(c0504Ca0);
        G10.g(c0504Ca0, "c");
        G10.g(interfaceC5565j30, "jPackage");
        G10.g(c9349wa0, "ownerDescriptor");
        this.n = interfaceC5565j30;
        this.o = c9349wa0;
        this.p = c0504Ca0.e().a(new C10186za0(c0504Ca0, this));
        this.q = c0504Ca0.e().b(new C0296Aa0(this, c0504Ca0));
    }

    public static final InterfaceC4923gl i0(C0400Ba0 c0400Ba0, C0504Ca0 c0504Ca0, a aVar) {
        G10.g(c0400Ba0, "this$0");
        G10.g(c0504Ca0, "$c");
        G10.g(aVar, "request");
        C6607ml c6607ml = new C6607ml(c0400Ba0.R().d(), aVar.b());
        InterfaceC8956v80.a aVarB = aVar.a() != null ? c0504Ca0.a().j().b(aVar.a(), c0400Ba0.m0()) : c0504Ca0.a().j().a(c6607ml, c0400Ba0.m0());
        InterfaceC10072z80 interfaceC10072z80A = aVarB != null ? aVarB.a() : null;
        C6607ml c6607mlE = interfaceC10072z80A != null ? interfaceC10072z80A.e() : null;
        if (c6607mlE != null && (c6607mlE.j() || c6607mlE.i())) {
            return null;
        }
        b bVarP0 = c0400Ba0.p0(interfaceC10072z80A);
        if (bVarP0 instanceof b.a) {
            return ((b.a) bVarP0).a();
        }
        if (bVarP0 instanceof b.c) {
            return null;
        }
        if (!(bVarP0 instanceof b.C0051b)) {
            throw new C6902no0();
        }
        C20 c20A = aVar.a();
        if (c20A == null) {
            c20A = c0504Ca0.a().d().c(new H20.a(c6607ml, null, null, 4, null));
        }
        if ((c20A != null ? c20A.I() : null) != EnumC2308Tb0.C) {
            AP apD = c20A != null ? c20A.d() : null;
            if (apD == null || apD.d() || !G10.c(apD.e(), c0400Ba0.R().d())) {
                return null;
            }
            C4869ga0 c4869ga0 = new C4869ga0(c0504Ca0, c0400Ba0.R(), c20A, null, 8, null);
            c0504Ca0.a().e().a(c4869ga0);
            return c4869ga0;
        }
        throw new IllegalStateException("Couldn't find kotlin binary class for light class created by kotlin binary file\nJavaClass: " + c20A + "\nClassId: " + c6607ml + "\nfindKotlinClass(JavaClass) = " + AbstractC9235w80.b(c0504Ca0.a().j(), c20A, c0400Ba0.m0()) + "\nfindKotlinClass(ClassId) = " + AbstractC9235w80.a(c0504Ca0.a().j(), c6607ml, c0400Ba0.m0()) + '\n');
    }

    public static final Set o0(C0504Ca0 c0504Ca0, C0400Ba0 c0400Ba0) {
        G10.g(c0504Ca0, "$c");
        G10.g(c0400Ba0, "this$0");
        return c0504Ca0.a().d().a(c0400Ba0.R().d());
    }

    @Override // com.daaw.AbstractC1864Pa0
    public void B(Collection collection, C2352Tm0 c2352Tm0) {
        G10.g(collection, "result");
        G10.g(c2352Tm0, "name");
    }

    @Override // com.daaw.AbstractC1864Pa0
    public Set D(C1651Mz c1651Mz, NQ nq) {
        G10.g(c1651Mz, "kindFilter");
        return AbstractC9867yQ0.d();
    }

    @Override // com.daaw.AbstractC1864Pa0, com.daaw.AbstractC4635fj0, com.daaw.InterfaceC4346ej0
    public Collection a(C2352Tm0 c2352Tm0, InterfaceC7689qe0 interfaceC7689qe0) {
        G10.g(c2352Tm0, "name");
        G10.g(interfaceC7689qe0, "location");
        return AbstractC1599Mm.k();
    }

    @Override // com.daaw.AbstractC1864Pa0, com.daaw.AbstractC4635fj0, com.daaw.FI0
    public Collection f(C1651Mz c1651Mz, NQ nq) {
        G10.g(c1651Mz, "kindFilter");
        G10.g(nq, "nameFilter");
        C1651Mz.a aVar = C1651Mz.c;
        if (!c1651Mz.a(aVar.e() | aVar.c())) {
            return AbstractC1599Mm.k();
        }
        Iterable iterable = (Iterable) K().invoke();
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            InterfaceC8612tw interfaceC8612tw = (InterfaceC8612tw) obj;
            if (interfaceC8612tw instanceof InterfaceC4923gl) {
                C2352Tm0 name = ((InterfaceC4923gl) interfaceC8612tw).getName();
                G10.f(name, "getName(...)");
                if (((Boolean) nq.invoke(name)).booleanValue()) {
                    arrayList.add(obj);
                }
            }
        }
        return arrayList;
    }

    public final InterfaceC4923gl j0(C2352Tm0 c2352Tm0, C20 c20) {
        if (!C7091oV0.a.a(c2352Tm0)) {
            return null;
        }
        Set set = (Set) this.p.invoke();
        if (c20 != null || set == null || set.contains(c2352Tm0.c())) {
            return (InterfaceC4923gl) this.q.invoke(new a(c2352Tm0, c20));
        }
        return null;
    }

    public final InterfaceC4923gl k0(C20 c20) {
        G10.g(c20, "javaClass");
        return j0(c20.getName(), c20);
    }

    @Override // com.daaw.AbstractC4635fj0, com.daaw.FI0
    /* JADX INFO: renamed from: l0, reason: merged with bridge method [inline-methods] */
    public InterfaceC4923gl g(C2352Tm0 c2352Tm0, InterfaceC7689qe0 interfaceC7689qe0) {
        G10.g(c2352Tm0, "name");
        G10.g(interfaceC7689qe0, "location");
        return j0(c2352Tm0, null);
    }

    public final C4740g50 m0() {
        return CA.a(L().a().b().f().g());
    }

    @Override // com.daaw.AbstractC1864Pa0
    /* JADX INFO: renamed from: n0, reason: merged with bridge method [inline-methods] */
    public C9349wa0 R() {
        return this.o;
    }

    public final b p0(InterfaceC10072z80 interfaceC10072z80) {
        if (interfaceC10072z80 == null) {
            return b.C0051b.a;
        }
        if (interfaceC10072z80.a().c() != C9514x80.a.F) {
            return b.c.a;
        }
        InterfaceC4923gl interfaceC4923glN = L().a().b().n(interfaceC10072z80);
        return interfaceC4923glN != null ? new b.a(interfaceC4923glN) : b.C0051b.a;
    }

    @Override // com.daaw.AbstractC1864Pa0
    public Set v(C1651Mz c1651Mz, NQ nq) {
        G10.g(c1651Mz, "kindFilter");
        if (!c1651Mz.a(C1651Mz.c.e())) {
            return AbstractC9867yQ0.d();
        }
        Set set = (Set) this.p.invoke();
        if (set != null) {
            HashSet hashSet = new HashSet();
            Iterator it = set.iterator();
            while (it.hasNext()) {
                hashSet.add(C2352Tm0.l((String) it.next()));
            }
            return hashSet;
        }
        InterfaceC5565j30 interfaceC5565j30 = this.n;
        if (nq == null) {
            nq = HR.k();
        }
        Collection<C20> collectionK = interfaceC5565j30.K(nq);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (C20 c20 : collectionK) {
            C2352Tm0 name = c20.I() == EnumC2308Tb0.B ? null : c20.getName();
            if (name != null) {
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }

    @Override // com.daaw.AbstractC1864Pa0
    public Set x(C1651Mz c1651Mz, NQ nq) {
        G10.g(c1651Mz, "kindFilter");
        return AbstractC9867yQ0.d();
    }

    @Override // com.daaw.AbstractC1864Pa0
    public InterfaceC0487Bw z() {
        return InterfaceC0487Bw.a.a;
    }
}
