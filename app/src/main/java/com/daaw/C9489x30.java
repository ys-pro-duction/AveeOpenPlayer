package com.daaw;

import com.daaw.AbstractC9870yR;
import com.daaw.C6607ml;
import com.daaw.YV0;
import java.lang.annotation.Annotation;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: com.daaw.x30, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C9489x30 {
    public static final C9489x30 a;
    public static final String b;
    public static final String c;
    public static final String d;
    public static final String e;
    public static final C6607ml f;
    public static final AP g;
    public static final C6607ml h;
    public static final C6607ml i;
    public static final C6607ml j;
    public static final HashMap k;
    public static final HashMap l;
    public static final HashMap m;
    public static final HashMap n;
    public static final HashMap o;
    public static final HashMap p;
    public static final List q;

    /* JADX INFO: renamed from: com.daaw.x30$a */
    public static final class a {
        public final C6607ml a;
        public final C6607ml b;
        public final C6607ml c;

        public a(C6607ml c6607ml, C6607ml c6607ml2, C6607ml c6607ml3) {
            G10.g(c6607ml, "javaClass");
            G10.g(c6607ml2, "kotlinReadOnly");
            G10.g(c6607ml3, "kotlinMutable");
            this.a = c6607ml;
            this.b = c6607ml2;
            this.c = c6607ml3;
        }

        public final C6607ml a() {
            return this.a;
        }

        public final C6607ml b() {
            return this.b;
        }

        public final C6607ml c() {
            return this.c;
        }

        public final C6607ml d() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return G10.c(this.a, aVar.a) && G10.c(this.b, aVar.b) && G10.c(this.c, aVar.c);
        }

        public int hashCode() {
            return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        }

        public String toString() {
            return "PlatformMutabilityMapping(javaClass=" + this.a + ", kotlinReadOnly=" + this.b + ", kotlinMutable=" + this.c + ')';
        }
    }

    static {
        C9489x30 c9489x30 = new C9489x30();
        a = c9489x30;
        StringBuilder sb = new StringBuilder();
        AbstractC9870yR.a aVar = AbstractC9870yR.a.e;
        sb.append(aVar.b());
        sb.append('.');
        sb.append(aVar.a());
        b = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        AbstractC9870yR.b bVar = AbstractC9870yR.b.e;
        sb2.append(bVar.b());
        sb2.append('.');
        sb2.append(bVar.a());
        c = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        AbstractC9870yR.d dVar = AbstractC9870yR.d.e;
        sb3.append(dVar.b());
        sb3.append('.');
        sb3.append(dVar.a());
        d = sb3.toString();
        StringBuilder sb4 = new StringBuilder();
        AbstractC9870yR.c cVar = AbstractC9870yR.c.e;
        sb4.append(cVar.b());
        sb4.append('.');
        sb4.append(cVar.a());
        e = sb4.toString();
        C6607ml.a aVar2 = C6607ml.d;
        C6607ml c6607mlC = aVar2.c(new AP("kotlin.jvm.functions.FunctionN"));
        f = c6607mlC;
        g = c6607mlC.a();
        WV0 wv0 = WV0.a;
        h = wv0.k();
        i = wv0.j();
        j = c9489x30.g(Class.class);
        k = new HashMap();
        l = new HashMap();
        m = new HashMap();
        n = new HashMap();
        o = new HashMap();
        p = new HashMap();
        C6607ml c6607mlC2 = aVar2.c(YV0.a.W);
        a aVar3 = new a(c9489x30.g(Iterable.class), c6607mlC2, new C6607ml(c6607mlC2.f(), CP.g(YV0.a.e0, c6607mlC2.f()), false));
        C6607ml c6607mlC3 = aVar2.c(YV0.a.V);
        a aVar4 = new a(c9489x30.g(Iterator.class), c6607mlC3, new C6607ml(c6607mlC3.f(), CP.g(YV0.a.d0, c6607mlC3.f()), false));
        C6607ml c6607mlC4 = aVar2.c(YV0.a.X);
        a aVar5 = new a(c9489x30.g(Collection.class), c6607mlC4, new C6607ml(c6607mlC4.f(), CP.g(YV0.a.f0, c6607mlC4.f()), false));
        C6607ml c6607mlC5 = aVar2.c(YV0.a.Y);
        a aVar6 = new a(c9489x30.g(List.class), c6607mlC5, new C6607ml(c6607mlC5.f(), CP.g(YV0.a.g0, c6607mlC5.f()), false));
        C6607ml c6607mlC6 = aVar2.c(YV0.a.a0);
        a aVar7 = new a(c9489x30.g(Set.class), c6607mlC6, new C6607ml(c6607mlC6.f(), CP.g(YV0.a.i0, c6607mlC6.f()), false));
        C6607ml c6607mlC7 = aVar2.c(YV0.a.Z);
        a aVar8 = new a(c9489x30.g(ListIterator.class), c6607mlC7, new C6607ml(c6607mlC7.f(), CP.g(YV0.a.h0, c6607mlC7.f()), false));
        AP ap = YV0.a.b0;
        C6607ml c6607mlC8 = aVar2.c(ap);
        a aVar9 = new a(c9489x30.g(Map.class), c6607mlC8, new C6607ml(c6607mlC8.f(), CP.g(YV0.a.j0, c6607mlC8.f()), false));
        C6607ml c6607mlC9 = aVar2.c(ap);
        C2352Tm0 c2352Tm0G = YV0.a.c0.g();
        G10.f(c2352Tm0G, "shortName(...)");
        C6607ml c6607mlD = c6607mlC9.d(c2352Tm0G);
        List listN = AbstractC1599Mm.n(aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, new a(c9489x30.g(Map.Entry.class), c6607mlD, new C6607ml(c6607mlD.f(), CP.g(YV0.a.k0, c6607mlD.f()), false)));
        q = listN;
        c9489x30.f(Object.class, YV0.a.b);
        c9489x30.f(String.class, YV0.a.h);
        c9489x30.f(CharSequence.class, YV0.a.g);
        c9489x30.e(Throwable.class, YV0.a.u);
        c9489x30.f(Cloneable.class, YV0.a.d);
        c9489x30.f(Number.class, YV0.a.r);
        c9489x30.e(Comparable.class, YV0.a.v);
        c9489x30.f(Enum.class, YV0.a.s);
        c9489x30.e(Annotation.class, YV0.a.G);
        Iterator it = listN.iterator();
        while (it.hasNext()) {
            a.d((a) it.next());
        }
        for (EnumC6703n50 enumC6703n50 : EnumC6703n50.values()) {
            C9489x30 c9489x302 = a;
            C6607ml.a aVar10 = C6607ml.d;
            AP apN = enumC6703n50.n();
            G10.f(apN, "getWrapperFqName(...)");
            C6607ml c6607mlC10 = aVar10.c(apN);
            EnumC8067rz0 enumC8067rz0L = enumC6703n50.l();
            G10.f(enumC8067rz0L, "getPrimitiveType(...)");
            c9489x302.a(c6607mlC10, aVar10.c(YV0.c(enumC8067rz0L)));
        }
        for (C6607ml c6607ml : C0668Dn.a.a()) {
            a.a(C6607ml.d.c(new AP("kotlin.jvm.internal." + c6607ml.h().c() + "CompanionObject")), c6607ml.d(C7091oV0.d));
        }
        for (int i2 = 0; i2 < 23; i2++) {
            C9489x30 c9489x303 = a;
            c9489x303.a(C6607ml.d.c(new AP("kotlin.jvm.functions.Function" + i2)), YV0.a(i2));
            c9489x303.c(new AP(c + i2), h);
        }
        for (int i3 = 0; i3 < 22; i3++) {
            AbstractC9870yR.c cVar2 = AbstractC9870yR.c.e;
            a.c(new AP((cVar2.b() + '.' + cVar2.a()) + i3), h);
        }
        C9489x30 c9489x304 = a;
        AP apL = YV0.a.c.l();
        G10.f(apL, "toSafe(...)");
        c9489x304.c(apL, c9489x304.g(Void.class));
    }

    public final void a(C6607ml c6607ml, C6607ml c6607ml2) {
        b(c6607ml, c6607ml2);
        c(c6607ml2.a(), c6607ml);
    }

    public final void b(C6607ml c6607ml, C6607ml c6607ml2) {
        k.put(c6607ml.a().j(), c6607ml2);
    }

    public final void c(AP ap, C6607ml c6607ml) {
        l.put(ap.j(), c6607ml);
    }

    public final void d(a aVar) {
        C6607ml c6607mlA = aVar.a();
        C6607ml c6607mlB = aVar.b();
        C6607ml c6607mlC = aVar.c();
        a(c6607mlA, c6607mlB);
        c(c6607mlC.a(), c6607mlA);
        o.put(c6607mlC, c6607mlB);
        p.put(c6607mlB, c6607mlC);
        AP apA = c6607mlB.a();
        AP apA2 = c6607mlC.a();
        m.put(c6607mlC.a().j(), apA);
        n.put(apA.j(), apA2);
    }

    public final void e(Class cls, AP ap) {
        a(g(cls), C6607ml.d.c(ap));
    }

    public final void f(Class cls, BP bp) {
        AP apL = bp.l();
        G10.f(apL, "toSafe(...)");
        e(cls, apL);
    }

    public final C6607ml g(Class cls) {
        if (!cls.isPrimitive()) {
            cls.isArray();
        }
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass == null) {
            return C6607ml.d.c(new AP(cls.getCanonicalName()));
        }
        C6607ml c6607mlG = g(declaringClass);
        C2352Tm0 c2352Tm0L = C2352Tm0.l(cls.getSimpleName());
        G10.f(c2352Tm0L, "identifier(...)");
        return c6607mlG.d(c2352Tm0L);
    }

    public final AP h() {
        return g;
    }

    public final List i() {
        return q;
    }

    public final boolean j(BP bp, String str) {
        Integer numG;
        String strB = bp.b();
        G10.f(strB, "asString(...)");
        if (!AY0.u(strB, str, false, 2, null)) {
            return false;
        }
        String strSubstring = strB.substring(str.length());
        G10.f(strSubstring, "substring(...)");
        return (BY0.l0(strSubstring, '0', false, 2, null) || (numG = AbstractC10178zY0.g(strSubstring)) == null || numG.intValue() < 23) ? false : true;
    }

    public final boolean k(BP bp) {
        return m.containsKey(bp);
    }

    public final boolean l(BP bp) {
        return n.containsKey(bp);
    }

    public final C6607ml m(AP ap) {
        G10.g(ap, "fqName");
        return (C6607ml) k.get(ap.j());
    }

    public final C6607ml n(BP bp) {
        G10.g(bp, "kotlinFqName");
        return j(bp, b) ? f : j(bp, d) ? f : j(bp, c) ? h : j(bp, e) ? h : (C6607ml) l.get(bp);
    }

    public final AP o(BP bp) {
        return (AP) m.get(bp);
    }

    public final AP p(BP bp) {
        return (AP) n.get(bp);
    }
}
