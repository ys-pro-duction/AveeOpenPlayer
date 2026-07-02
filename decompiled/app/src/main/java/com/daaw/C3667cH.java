package com.daaw;

import com.daaw.InterfaceC4346ej0;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: com.daaw.cH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C3667cH extends AbstractC5202hl {
    public final C71 J;
    public final InterfaceC4346ej0 K;
    public final InterfaceC0881Fo0 L;
    public final InterfaceC3072a8 M;

    /* JADX INFO: renamed from: com.daaw.cH$a */
    public class a extends AbstractC4635fj0 {
        public final InterfaceC5471ij0 b;
        public final InterfaceC5471ij0 c;
        public final InterfaceC0881Fo0 d;
        public final /* synthetic */ C3667cH e;

        /* JADX INFO: renamed from: com.daaw.cH$a$a, reason: collision with other inner class name */
        public class C0158a implements NQ {
            public final /* synthetic */ C3667cH B;

            public C0158a(C3667cH c3667cH) {
                this.B = c3667cH;
            }

            @Override // com.daaw.NQ
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Collection invoke(C2352Tm0 c2352Tm0) {
                return a.this.m(c2352Tm0);
            }
        }

        /* JADX INFO: renamed from: com.daaw.cH$a$b */
        public class b implements NQ {
            public final /* synthetic */ C3667cH B;

            public b(C3667cH c3667cH) {
                this.B = c3667cH;
            }

            @Override // com.daaw.NQ
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Collection invoke(C2352Tm0 c2352Tm0) {
                return a.this.n(c2352Tm0);
            }
        }

        /* JADX INFO: renamed from: com.daaw.cH$a$c */
        public class c implements LQ {
            public final /* synthetic */ C3667cH B;

            public c(C3667cH c3667cH) {
                this.B = c3667cH;
            }

            @Override // com.daaw.LQ
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Collection invoke() {
                return a.this.l();
            }
        }

        /* JADX INFO: renamed from: com.daaw.cH$a$d */
        public class d extends AbstractC9419wo0 {
            public final /* synthetic */ Set a;

            public d(Set set) {
                this.a = set;
            }

            public static /* synthetic */ void f(int i) {
                Object[] objArr = new Object[3];
                if (i == 1) {
                    objArr[0] = "fromSuper";
                } else if (i != 2) {
                    objArr[0] = "fakeOverride";
                } else {
                    objArr[0] = "fromCurrent";
                }
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope$4";
                if (i == 1 || i == 2) {
                    objArr[2] = "conflict";
                } else {
                    objArr[2] = "addFakeOverride";
                }
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
            }

            @Override // com.daaw.AbstractC0685Dr0
            public void a(InterfaceC1583Mi interfaceC1583Mi) {
                if (interfaceC1583Mi == null) {
                    f(0);
                }
                C0789Er0.K(interfaceC1583Mi, null);
                this.a.add(interfaceC1583Mi);
            }

            @Override // com.daaw.AbstractC9419wo0
            public void e(InterfaceC1583Mi interfaceC1583Mi, InterfaceC1583Mi interfaceC1583Mi2) {
                if (interfaceC1583Mi == null) {
                    f(1);
                }
                if (interfaceC1583Mi2 == null) {
                    f(2);
                }
            }
        }

        public a(C3667cH c3667cH, InterfaceC10174zX0 interfaceC10174zX0) {
            if (interfaceC10174zX0 == null) {
                h(0);
            }
            this.e = c3667cH;
            this.b = interfaceC10174zX0.g(new C0158a(c3667cH));
            this.c = interfaceC10174zX0.g(new b(c3667cH));
            this.d = interfaceC10174zX0.h(new c(c3667cH));
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0014  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static /* synthetic */ void h(int r13) {
            /*
                Method dump skipped, instruction units count: 346
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.daaw.C3667cH.a.h(int):void");
        }

        @Override // com.daaw.AbstractC4635fj0, com.daaw.InterfaceC4346ej0
        public Collection a(C2352Tm0 c2352Tm0, InterfaceC7689qe0 interfaceC7689qe0) {
            if (c2352Tm0 == null) {
                h(1);
            }
            if (interfaceC7689qe0 == null) {
                h(2);
            }
            Collection collection = (Collection) this.c.invoke(c2352Tm0);
            if (collection == null) {
                h(3);
            }
            return collection;
        }

        @Override // com.daaw.AbstractC4635fj0, com.daaw.InterfaceC4346ej0
        public Set b() {
            Set set = (Set) this.e.L.invoke();
            if (set == null) {
                h(17);
            }
            return set;
        }

        @Override // com.daaw.AbstractC4635fj0, com.daaw.InterfaceC4346ej0
        public Collection c(C2352Tm0 c2352Tm0, InterfaceC7689qe0 interfaceC7689qe0) {
            if (c2352Tm0 == null) {
                h(5);
            }
            if (interfaceC7689qe0 == null) {
                h(6);
            }
            Collection collection = (Collection) this.b.invoke(c2352Tm0);
            if (collection == null) {
                h(7);
            }
            return collection;
        }

        @Override // com.daaw.AbstractC4635fj0, com.daaw.InterfaceC4346ej0
        public Set d() {
            Set set = (Set) this.e.L.invoke();
            if (set == null) {
                h(19);
            }
            return set;
        }

        @Override // com.daaw.AbstractC4635fj0, com.daaw.InterfaceC4346ej0
        public Set e() {
            Set set = Collections.EMPTY_SET;
            if (set == null) {
                h(18);
            }
            return set;
        }

        @Override // com.daaw.AbstractC4635fj0, com.daaw.FI0
        public Collection f(C1651Mz c1651Mz, NQ nq) {
            if (c1651Mz == null) {
                h(13);
            }
            if (nq == null) {
                h(14);
            }
            Collection collection = (Collection) this.d.invoke();
            if (collection == null) {
                h(15);
            }
            return collection;
        }

        public final Collection l() {
            HashSet hashSet = new HashSet();
            for (C2352Tm0 c2352Tm0 : (Set) this.e.L.invoke()) {
                EnumC5496io0 enumC5496io0 = EnumC5496io0.Q;
                hashSet.addAll(c(c2352Tm0, enumC5496io0));
                hashSet.addAll(a(c2352Tm0, enumC5496io0));
            }
            return hashSet;
        }

        public final Collection m(C2352Tm0 c2352Tm0) {
            if (c2352Tm0 == null) {
                h(8);
            }
            return p(c2352Tm0, o().c(c2352Tm0, EnumC5496io0.Q));
        }

        public final Collection n(C2352Tm0 c2352Tm0) {
            if (c2352Tm0 == null) {
                h(4);
            }
            return p(c2352Tm0, o().a(c2352Tm0, EnumC5496io0.Q));
        }

        public final InterfaceC4346ej0 o() {
            InterfaceC4346ej0 interfaceC4346ej0Q = ((I80) this.e.k().b().iterator().next()).q();
            if (interfaceC4346ej0Q == null) {
                h(9);
            }
            return interfaceC4346ej0Q;
        }

        public final Collection p(C2352Tm0 c2352Tm0, Collection collection) {
            if (c2352Tm0 == null) {
                h(10);
            }
            if (collection == null) {
                h(11);
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            C0789Er0.f.v(c2352Tm0, collection, Collections.EMPTY_SET, this.e, new d(linkedHashSet));
            return linkedHashSet;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3667cH(InterfaceC10174zX0 interfaceC10174zX0, InterfaceC4923gl interfaceC4923gl, I80 i80, C2352Tm0 c2352Tm0, InterfaceC0881Fo0 interfaceC0881Fo0, InterfaceC3072a8 interfaceC3072a8, RU0 ru0) {
        super(interfaceC10174zX0, interfaceC4923gl, c2352Tm0, ru0, false);
        if (interfaceC10174zX0 == null) {
            y0(6);
        }
        if (interfaceC4923gl == null) {
            y0(7);
        }
        if (i80 == null) {
            y0(8);
        }
        if (c2352Tm0 == null) {
            y0(9);
        }
        if (interfaceC0881Fo0 == null) {
            y0(10);
        }
        if (interfaceC3072a8 == null) {
            y0(11);
        }
        if (ru0 == null) {
            y0(12);
        }
        this.M = interfaceC3072a8;
        this.J = new C8280sl(this, Collections.EMPTY_LIST, Collections.singleton(i80), interfaceC10174zX0);
        this.K = new a(this, interfaceC10174zX0);
        this.L = interfaceC0881Fo0;
    }

    public static C3667cH L0(InterfaceC10174zX0 interfaceC10174zX0, InterfaceC4923gl interfaceC4923gl, C2352Tm0 c2352Tm0, InterfaceC0881Fo0 interfaceC0881Fo0, InterfaceC3072a8 interfaceC3072a8, RU0 ru0) {
        if (interfaceC10174zX0 == null) {
            y0(0);
        }
        if (interfaceC4923gl == null) {
            y0(1);
        }
        if (c2352Tm0 == null) {
            y0(2);
        }
        if (interfaceC0881Fo0 == null) {
            y0(3);
        }
        if (interfaceC3072a8 == null) {
            y0(4);
        }
        if (ru0 == null) {
            y0(5);
        }
        return new C3667cH(interfaceC10174zX0, interfaceC4923gl, interfaceC4923gl.s(), c2352Tm0, interfaceC0881Fo0, interfaceC3072a8, ru0);
    }

    private static /* synthetic */ void y0(int i) {
        String str;
        int i2;
        switch (i) {
            case 14:
            case 15:
            case 16:
            case C6564mc1.STRING_VALUE_FIELD_NUMBER /* 17 */:
            case C6564mc1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 14:
            case 15:
            case 16:
            case C6564mc1.STRING_VALUE_FIELD_NUMBER /* 17 */:
            case C6564mc1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "enumClass";
                break;
            case 2:
            case 9:
                objArr[0] = "name";
                break;
            case 3:
            case 10:
                objArr[0] = "enumMemberNames";
                break;
            case 4:
            case 11:
                objArr[0] = "annotations";
                break;
            case 5:
            case 12:
                objArr[0] = "source";
                break;
            case 6:
            default:
                objArr[0] = "storageManager";
                break;
            case 7:
                objArr[0] = "containingClass";
                break;
            case 8:
                objArr[0] = "supertype";
                break;
            case 13:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case 14:
            case 15:
            case 16:
            case C6564mc1.STRING_VALUE_FIELD_NUMBER /* 17 */:
            case C6564mc1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor";
                break;
        }
        switch (i) {
            case 14:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 15:
                objArr[1] = "getStaticScope";
                break;
            case 16:
                objArr[1] = "getConstructors";
                break;
            case C6564mc1.STRING_VALUE_FIELD_NUMBER /* 17 */:
                objArr[1] = "getTypeConstructor";
                break;
            case C6564mc1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                objArr[1] = "getKind";
                break;
            case 19:
                objArr[1] = "getModality";
                break;
            case 20:
                objArr[1] = "getVisibility";
                break;
            case 21:
                objArr[1] = "getAnnotations";
                break;
            case 22:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 23:
                objArr[1] = "getSealedSubclasses";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor";
                break;
        }
        switch (i) {
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "<init>";
                break;
            case 13:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            case 14:
            case 15:
            case 16:
            case C6564mc1.STRING_VALUE_FIELD_NUMBER /* 17 */:
            case C6564mc1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                break;
            default:
                objArr[2] = "create";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 14:
            case 15:
            case 16:
            case C6564mc1.STRING_VALUE_FIELD_NUMBER /* 17 */:
            case C6564mc1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
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
        List list = Collections.EMPTY_LIST;
        if (list == null) {
            y0(23);
        }
        return list;
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
    public InterfaceC3241al N() {
        return null;
    }

    @Override // com.daaw.InterfaceC4923gl
    public InterfaceC4346ej0 O() {
        InterfaceC4346ej0.b bVar = InterfaceC4346ej0.b.b;
        if (bVar == null) {
            y0(15);
        }
        return bVar;
    }

    @Override // com.daaw.InterfaceC4923gl
    public InterfaceC4923gl Q() {
        return null;
    }

    @Override // com.daaw.AbstractC2134Rk0
    public InterfaceC4346ej0 U(Q80 q80) {
        if (q80 == null) {
            y0(13);
        }
        InterfaceC4346ej0 interfaceC4346ej0 = this.K;
        if (interfaceC4346ej0 == null) {
            y0(14);
        }
        return interfaceC4346ej0;
    }

    @Override // com.daaw.A7
    public InterfaceC3072a8 getAnnotations() {
        InterfaceC3072a8 interfaceC3072a8 = this.M;
        if (interfaceC3072a8 == null) {
            y0(21);
        }
        return interfaceC3072a8;
    }

    @Override // com.daaw.InterfaceC4923gl, com.daaw.InterfaceC2232Si0, com.daaw.InterfaceC0383Aw
    public AbstractC8965vA getVisibility() {
        AbstractC8965vA abstractC8965vA = AbstractC8679uA.e;
        if (abstractC8965vA == null) {
            y0(20);
        }
        return abstractC8965vA;
    }

    @Override // com.daaw.InterfaceC4923gl
    public EnumC6886nl i() {
        EnumC6886nl enumC6886nl = EnumC6886nl.F;
        if (enumC6886nl == null) {
            y0(18);
        }
        return enumC6886nl;
    }

    @Override // com.daaw.InterfaceC4923gl
    public boolean isInline() {
        return false;
    }

    @Override // com.daaw.InterfaceC10240zl
    public C71 k() {
        C71 c71 = this.J;
        if (c71 == null) {
            y0(17);
        }
        return c71;
    }

    @Override // com.daaw.InterfaceC4923gl, com.daaw.InterfaceC2232Si0
    public EnumC0336Ak0 l() {
        EnumC0336Ak0 enumC0336Ak0 = EnumC0336Ak0.C;
        if (enumC0336Ak0 == null) {
            y0(19);
        }
        return enumC0336Ak0;
    }

    @Override // com.daaw.InterfaceC4923gl
    public Collection m() {
        List list = Collections.EMPTY_LIST;
        if (list == null) {
            y0(16);
        }
        return list;
    }

    @Override // com.daaw.InterfaceC4923gl
    public boolean n() {
        return false;
    }

    public String toString() {
        return "enum entry " + getName();
    }

    @Override // com.daaw.InterfaceC4923gl, com.daaw.InterfaceC0339Al
    public List v() {
        List list = Collections.EMPTY_LIST;
        if (list == null) {
            y0(22);
        }
        return list;
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
