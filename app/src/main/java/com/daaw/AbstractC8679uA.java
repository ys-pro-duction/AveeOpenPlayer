package com.daaw;

import com.daaw.C0525Cf1;
import com.daaw.InterfaceC4645fl0;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.ServiceLoader;
import java.util.Set;

/* JADX INFO: renamed from: com.daaw.uA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC8679uA {
    public static final AbstractC8965vA a;
    public static final AbstractC8965vA b;
    public static final AbstractC8965vA c;
    public static final AbstractC8965vA d;
    public static final AbstractC8965vA e;
    public static final AbstractC8965vA f;
    public static final AbstractC8965vA g;
    public static final AbstractC8965vA h;
    public static final AbstractC8965vA i;
    public static final Set j;
    public static final Map k;
    public static final AbstractC8965vA l;
    public static final TE0 m;
    public static final TE0 n;
    public static final TE0 o;
    public static final InterfaceC4645fl0 p;
    public static final Map q;

    /* JADX INFO: renamed from: com.daaw.uA$a */
    public static class a implements TE0 {
        @Override // com.daaw.TE0
        public I80 getType() {
            throw new IllegalStateException("This method should not be called");
        }
    }

    /* JADX INFO: renamed from: com.daaw.uA$b */
    public static class b implements TE0 {
        @Override // com.daaw.TE0
        public I80 getType() {
            throw new IllegalStateException("This method should not be called");
        }
    }

    /* JADX INFO: renamed from: com.daaw.uA$c */
    public static class c implements TE0 {
        @Override // com.daaw.TE0
        public I80 getType() {
            throw new IllegalStateException("This method should not be called");
        }
    }

    /* JADX INFO: renamed from: com.daaw.uA$d */
    public static class d extends AbstractC0920Fy {
        public d(AbstractC0742Ef1 abstractC0742Ef1) {
            super(abstractC0742Ef1);
        }

        public static /* synthetic */ void g(int i) {
            Object[] objArr = new Object[3];
            if (i == 1) {
                objArr[0] = "what";
            } else if (i != 2) {
                objArr[0] = "descriptor";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$1";
            if (i == 1 || i == 2) {
                objArr[2] = "isVisible";
            } else {
                objArr[2] = "hasContainingSourceFile";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.daaw.AbstractC8965vA
        public boolean e(TE0 te0, InterfaceC0383Aw interfaceC0383Aw, InterfaceC8612tw interfaceC8612tw, boolean z) {
            if (interfaceC0383Aw == 0) {
                g(1);
            }
            if (interfaceC8612tw == null) {
                g(2);
            }
            if (AbstractC7006oA.J(interfaceC0383Aw) && h(interfaceC8612tw)) {
                return AbstractC8679uA.f(interfaceC0383Aw, interfaceC8612tw);
            }
            if (interfaceC0383Aw instanceof InterfaceC7195or) {
                InterfaceC0339Al interfaceC0339AlB = ((InterfaceC7195or) interfaceC0383Aw).b();
                if (z && AbstractC7006oA.G(interfaceC0339AlB) && AbstractC7006oA.J(interfaceC0339AlB) && (interfaceC8612tw instanceof InterfaceC7195or) && AbstractC7006oA.J(interfaceC8612tw.b()) && AbstractC8679uA.f(interfaceC0383Aw, interfaceC8612tw)) {
                    return true;
                }
            }
            while (interfaceC0383Aw != 0) {
                interfaceC0383Aw = interfaceC0383Aw.b();
                if (((interfaceC0383Aw instanceof InterfaceC4923gl) && !AbstractC7006oA.x(interfaceC0383Aw)) || (interfaceC0383Aw instanceof InterfaceC2372Tr0)) {
                    break;
                }
            }
            if (interfaceC0383Aw == 0) {
                return false;
            }
            while (interfaceC8612tw != null) {
                if (interfaceC0383Aw == interfaceC8612tw) {
                    return true;
                }
                if (interfaceC8612tw instanceof InterfaceC2372Tr0) {
                    return (interfaceC0383Aw instanceof InterfaceC2372Tr0) && ((InterfaceC2372Tr0) interfaceC0383Aw).d().equals(((InterfaceC2372Tr0) interfaceC8612tw).d()) && AbstractC7006oA.b(interfaceC8612tw, interfaceC0383Aw);
                }
                interfaceC8612tw = interfaceC8612tw.b();
            }
            return false;
        }

        public final boolean h(InterfaceC8612tw interfaceC8612tw) {
            if (interfaceC8612tw == null) {
                g(0);
            }
            return AbstractC7006oA.j(interfaceC8612tw) != SU0.a;
        }
    }

    /* JADX INFO: renamed from: com.daaw.uA$e */
    public static class e extends AbstractC0920Fy {
        public e(AbstractC0742Ef1 abstractC0742Ef1) {
            super(abstractC0742Ef1);
        }

        private static /* synthetic */ void g(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$2";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // com.daaw.AbstractC8965vA
        public boolean e(TE0 te0, InterfaceC0383Aw interfaceC0383Aw, InterfaceC8612tw interfaceC8612tw, boolean z) {
            InterfaceC8612tw interfaceC8612twQ;
            if (interfaceC0383Aw == null) {
                g(0);
            }
            if (interfaceC8612tw == null) {
                g(1);
            }
            if (AbstractC8679uA.a.e(te0, interfaceC0383Aw, interfaceC8612tw, z)) {
                if (te0 == AbstractC8679uA.n) {
                    return true;
                }
                if (te0 != AbstractC8679uA.m && (interfaceC8612twQ = AbstractC7006oA.q(interfaceC0383Aw, InterfaceC4923gl.class)) != null && (te0 instanceof InterfaceC4442f31)) {
                    return ((InterfaceC4442f31) te0).r().a().equals(interfaceC8612twQ.a());
                }
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: com.daaw.uA$f */
    public static class f extends AbstractC0920Fy {
        public f(AbstractC0742Ef1 abstractC0742Ef1) {
            super(abstractC0742Ef1);
        }

        private static /* synthetic */ void g(int i) {
            Object[] objArr = new Object[3];
            if (i == 1) {
                objArr[0] = "from";
            } else if (i == 2) {
                objArr[0] = "whatDeclaration";
            } else if (i != 3) {
                objArr[0] = "what";
            } else {
                objArr[0] = "fromClass";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$3";
            if (i == 2 || i == 3) {
                objArr[2] = "doesReceiverFitForProtectedVisibility";
            } else {
                objArr[2] = "isVisible";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // com.daaw.AbstractC8965vA
        public boolean e(TE0 te0, InterfaceC0383Aw interfaceC0383Aw, InterfaceC8612tw interfaceC8612tw, boolean z) {
            InterfaceC4923gl interfaceC4923gl;
            if (interfaceC0383Aw == null) {
                g(0);
            }
            if (interfaceC8612tw == null) {
                g(1);
            }
            InterfaceC4923gl interfaceC4923gl2 = (InterfaceC4923gl) AbstractC7006oA.q(interfaceC0383Aw, InterfaceC4923gl.class);
            InterfaceC4923gl interfaceC4923gl3 = (InterfaceC4923gl) AbstractC7006oA.r(interfaceC8612tw, InterfaceC4923gl.class, false);
            if (interfaceC4923gl3 == null) {
                return false;
            }
            if (interfaceC4923gl2 != null && AbstractC7006oA.x(interfaceC4923gl2) && (interfaceC4923gl = (InterfaceC4923gl) AbstractC7006oA.q(interfaceC4923gl2, InterfaceC4923gl.class)) != null && AbstractC7006oA.H(interfaceC4923gl3, interfaceC4923gl)) {
                return true;
            }
            InterfaceC0383Aw interfaceC0383AwM = AbstractC7006oA.M(interfaceC0383Aw);
            InterfaceC4923gl interfaceC4923gl4 = (InterfaceC4923gl) AbstractC7006oA.q(interfaceC0383AwM, InterfaceC4923gl.class);
            if (interfaceC4923gl4 == null) {
                return false;
            }
            if (AbstractC7006oA.H(interfaceC4923gl3, interfaceC4923gl4) && h(te0, interfaceC0383AwM, interfaceC4923gl3)) {
                return true;
            }
            return e(te0, interfaceC0383Aw, interfaceC4923gl3.b(), z);
        }

        public final boolean h(TE0 te0, InterfaceC0383Aw interfaceC0383Aw, InterfaceC4923gl interfaceC4923gl) {
            if (interfaceC0383Aw == null) {
                g(2);
            }
            if (interfaceC4923gl == null) {
                g(3);
            }
            if (te0 == AbstractC8679uA.o) {
                return false;
            }
            if (!(interfaceC0383Aw instanceof InterfaceC1583Mi) || (interfaceC0383Aw instanceof InterfaceC7195or) || te0 == AbstractC8679uA.n) {
                return true;
            }
            if (te0 == AbstractC8679uA.m || te0 == null) {
                return false;
            }
            I80 type = te0.getType();
            return AbstractC7006oA.I(type, interfaceC4923gl) || XE.a(type);
        }
    }

    /* JADX INFO: renamed from: com.daaw.uA$g */
    public static class g extends AbstractC0920Fy {
        public g(AbstractC0742Ef1 abstractC0742Ef1) {
            super(abstractC0742Ef1);
        }

        private static /* synthetic */ void g(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$4";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // com.daaw.AbstractC8965vA
        public boolean e(TE0 te0, InterfaceC0383Aw interfaceC0383Aw, InterfaceC8612tw interfaceC8612tw, boolean z) {
            if (interfaceC0383Aw == null) {
                g(0);
            }
            if (interfaceC8612tw == null) {
                g(1);
            }
            if (AbstractC7006oA.g(interfaceC8612tw).j0(AbstractC7006oA.g(interfaceC0383Aw))) {
                return AbstractC8679uA.p.a(interfaceC0383Aw, interfaceC8612tw);
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: com.daaw.uA$h */
    public static class h extends AbstractC0920Fy {
        public h(AbstractC0742Ef1 abstractC0742Ef1) {
            super(abstractC0742Ef1);
        }

        private static /* synthetic */ void g(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$5";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // com.daaw.AbstractC8965vA
        public boolean e(TE0 te0, InterfaceC0383Aw interfaceC0383Aw, InterfaceC8612tw interfaceC8612tw, boolean z) {
            if (interfaceC0383Aw == null) {
                g(0);
            }
            if (interfaceC8612tw == null) {
                g(1);
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: com.daaw.uA$i */
    public static class i extends AbstractC0920Fy {
        public i(AbstractC0742Ef1 abstractC0742Ef1) {
            super(abstractC0742Ef1);
        }

        private static /* synthetic */ void g(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$6";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // com.daaw.AbstractC8965vA
        public boolean e(TE0 te0, InterfaceC0383Aw interfaceC0383Aw, InterfaceC8612tw interfaceC8612tw, boolean z) {
            if (interfaceC0383Aw == null) {
                g(0);
            }
            if (interfaceC8612tw == null) {
                g(1);
            }
            throw new IllegalStateException("This method shouldn't be invoked for LOCAL visibility");
        }
    }

    /* JADX INFO: renamed from: com.daaw.uA$j */
    public static class j extends AbstractC0920Fy {
        public j(AbstractC0742Ef1 abstractC0742Ef1) {
            super(abstractC0742Ef1);
        }

        private static /* synthetic */ void g(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$7";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // com.daaw.AbstractC8965vA
        public boolean e(TE0 te0, InterfaceC0383Aw interfaceC0383Aw, InterfaceC8612tw interfaceC8612tw, boolean z) {
            if (interfaceC0383Aw == null) {
                g(0);
            }
            if (interfaceC8612tw == null) {
                g(1);
            }
            throw new IllegalStateException("Visibility is unknown yet");
        }
    }

    /* JADX INFO: renamed from: com.daaw.uA$k */
    public static class k extends AbstractC0920Fy {
        public k(AbstractC0742Ef1 abstractC0742Ef1) {
            super(abstractC0742Ef1);
        }

        private static /* synthetic */ void g(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$8";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // com.daaw.AbstractC8965vA
        public boolean e(TE0 te0, InterfaceC0383Aw interfaceC0383Aw, InterfaceC8612tw interfaceC8612tw, boolean z) {
            if (interfaceC0383Aw == null) {
                g(0);
            }
            if (interfaceC8612tw == null) {
                g(1);
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: com.daaw.uA$l */
    public static class l extends AbstractC0920Fy {
        public l(AbstractC0742Ef1 abstractC0742Ef1) {
            super(abstractC0742Ef1);
        }

        private static /* synthetic */ void g(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$9";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // com.daaw.AbstractC8965vA
        public boolean e(TE0 te0, InterfaceC0383Aw interfaceC0383Aw, InterfaceC8612tw interfaceC8612tw, boolean z) {
            if (interfaceC0383Aw == null) {
                g(0);
            }
            if (interfaceC8612tw == null) {
                g(1);
            }
            return false;
        }
    }

    static {
        d dVar = new d(C0525Cf1.e.c);
        a = dVar;
        e eVar = new e(C0525Cf1.f.c);
        b = eVar;
        f fVar = new f(C0525Cf1.g.c);
        c = fVar;
        g gVar = new g(C0525Cf1.b.c);
        d = gVar;
        h hVar = new h(C0525Cf1.h.c);
        e = hVar;
        i iVar = new i(C0525Cf1.d.c);
        f = iVar;
        j jVar = new j(C0525Cf1.a.c);
        g = jVar;
        k kVar = new k(C0525Cf1.c.c);
        h = kVar;
        l lVar = new l(C0525Cf1.i.c);
        i = lVar;
        j = DesugarCollections.unmodifiableSet(AbstractC9867yQ0.g(dVar, eVar, gVar, iVar));
        HashMap mapE = AbstractC1392Km.e(4);
        mapE.put(eVar, 0);
        mapE.put(dVar, 0);
        mapE.put(gVar, 1);
        mapE.put(fVar, 1);
        mapE.put(hVar, 2);
        k = DesugarCollections.unmodifiableMap(mapE);
        l = hVar;
        m = new a();
        n = new b();
        o = new c();
        Iterator it = ServiceLoader.load(InterfaceC4645fl0.class, InterfaceC4645fl0.class.getClassLoader()).iterator();
        p = it.hasNext() ? (InterfaceC4645fl0) it.next() : InterfaceC4645fl0.a.a;
        q = new HashMap();
        i(dVar);
        i(eVar);
        i(fVar);
        i(gVar);
        i(hVar);
        i(iVar);
        i(jVar);
        i(kVar);
        i(lVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ void a(int r8) {
        /*
            r0 = 16
            if (r8 == r0) goto L7
            java.lang.String r1 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            goto L9
        L7:
            java.lang.String r1 = "@NotNull method %s.%s must not return null"
        L9:
            r2 = 3
            r3 = 2
            if (r8 == r0) goto Lf
            r4 = 3
            goto L10
        Lf:
            r4 = 2
        L10:
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r5 = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities"
            r6 = 1
            r7 = 0
            if (r8 == r6) goto L3a
            if (r8 == r2) goto L3a
            r2 = 5
            if (r8 == r2) goto L3a
            r2 = 7
            if (r8 == r2) goto L3a
            switch(r8) {
                case 9: goto L3a;
                case 10: goto L35;
                case 11: goto L30;
                case 12: goto L35;
                case 13: goto L30;
                case 14: goto L2b;
                case 15: goto L2b;
                case 16: goto L28;
                default: goto L23;
            }
        L23:
            java.lang.String r2 = "what"
            r4[r7] = r2
            goto L3e
        L28:
            r4[r7] = r5
            goto L3e
        L2b:
            java.lang.String r2 = "visibility"
            r4[r7] = r2
            goto L3e
        L30:
            java.lang.String r2 = "second"
            r4[r7] = r2
            goto L3e
        L35:
            java.lang.String r2 = "first"
            r4[r7] = r2
            goto L3e
        L3a:
            java.lang.String r2 = "from"
            r4[r7] = r2
        L3e:
            java.lang.String r2 = "toDescriptorVisibility"
            if (r8 == r0) goto L45
            r4[r6] = r5
            goto L47
        L45:
            r4[r6] = r2
        L47:
            switch(r8) {
                case 2: goto L70;
                case 3: goto L70;
                case 4: goto L6b;
                case 5: goto L6b;
                case 6: goto L66;
                case 7: goto L66;
                case 8: goto L61;
                case 9: goto L61;
                case 10: goto L5c;
                case 11: goto L5c;
                case 12: goto L57;
                case 13: goto L57;
                case 14: goto L52;
                case 15: goto L4f;
                case 16: goto L74;
                default: goto L4a;
            }
        L4a:
            java.lang.String r2 = "isVisible"
            r4[r3] = r2
            goto L74
        L4f:
            r4[r3] = r2
            goto L74
        L52:
            java.lang.String r2 = "isPrivate"
            r4[r3] = r2
            goto L74
        L57:
            java.lang.String r2 = "compare"
            r4[r3] = r2
            goto L74
        L5c:
            java.lang.String r2 = "compareLocal"
            r4[r3] = r2
            goto L74
        L61:
            java.lang.String r2 = "findInvisibleMember"
            r4[r3] = r2
            goto L74
        L66:
            java.lang.String r2 = "inSameFile"
            r4[r3] = r2
            goto L74
        L6b:
            java.lang.String r2 = "isVisibleWithAnyReceiver"
            r4[r3] = r2
            goto L74
        L70:
            java.lang.String r2 = "isVisibleIgnoringReceiver"
            r4[r3] = r2
        L74:
            java.lang.String r1 = java.lang.String.format(r1, r4)
            if (r8 == r0) goto L80
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            r8.<init>(r1)
            goto L85
        L80:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>(r1)
        L85:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.AbstractC8679uA.a(int):void");
    }

    public static Integer d(AbstractC8965vA abstractC8965vA, AbstractC8965vA abstractC8965vA2) {
        if (abstractC8965vA == null) {
            a(12);
        }
        if (abstractC8965vA2 == null) {
            a(13);
        }
        Integer numA = abstractC8965vA.a(abstractC8965vA2);
        if (numA != null) {
            return numA;
        }
        Integer numA2 = abstractC8965vA2.a(abstractC8965vA);
        if (numA2 != null) {
            return Integer.valueOf(-numA2.intValue());
        }
        return null;
    }

    public static InterfaceC0383Aw e(TE0 te0, InterfaceC0383Aw interfaceC0383Aw, InterfaceC8612tw interfaceC8612tw, boolean z) {
        InterfaceC0383Aw interfaceC0383AwE;
        if (interfaceC0383Aw == null) {
            a(8);
        }
        if (interfaceC8612tw == null) {
            a(9);
        }
        for (InterfaceC0383Aw interfaceC0383Aw2 = (InterfaceC0383Aw) interfaceC0383Aw.a(); interfaceC0383Aw2 != null && interfaceC0383Aw2.getVisibility() != f; interfaceC0383Aw2 = (InterfaceC0383Aw) AbstractC7006oA.q(interfaceC0383Aw2, InterfaceC0383Aw.class)) {
            if (!interfaceC0383Aw2.getVisibility().e(te0, interfaceC0383Aw2, interfaceC8612tw, z)) {
                return interfaceC0383Aw2;
            }
        }
        if (!(interfaceC0383Aw instanceof InterfaceC4751g71) || (interfaceC0383AwE = e(te0, ((InterfaceC4751g71) interfaceC0383Aw).m0(), interfaceC8612tw, z)) == null) {
            return null;
        }
        return interfaceC0383AwE;
    }

    public static boolean f(InterfaceC8612tw interfaceC8612tw, InterfaceC8612tw interfaceC8612tw2) {
        if (interfaceC8612tw == null) {
            a(6);
        }
        if (interfaceC8612tw2 == null) {
            a(7);
        }
        SU0 su0J = AbstractC7006oA.j(interfaceC8612tw2);
        if (su0J != SU0.a) {
            return su0J.equals(AbstractC7006oA.j(interfaceC8612tw));
        }
        return false;
    }

    public static boolean g(AbstractC8965vA abstractC8965vA) {
        if (abstractC8965vA == null) {
            a(14);
        }
        return abstractC8965vA == a || abstractC8965vA == b;
    }

    public static boolean h(InterfaceC0383Aw interfaceC0383Aw, InterfaceC8612tw interfaceC8612tw, boolean z) {
        if (interfaceC0383Aw == null) {
            a(2);
        }
        if (interfaceC8612tw == null) {
            a(3);
        }
        return e(n, interfaceC0383Aw, interfaceC8612tw, z) == null;
    }

    public static void i(AbstractC8965vA abstractC8965vA) {
        q.put(abstractC8965vA.b(), abstractC8965vA);
    }

    public static AbstractC8965vA j(AbstractC0742Ef1 abstractC0742Ef1) {
        if (abstractC0742Ef1 == null) {
            a(15);
        }
        AbstractC8965vA abstractC8965vA = (AbstractC8965vA) q.get(abstractC0742Ef1);
        if (abstractC8965vA != null) {
            return abstractC8965vA;
        }
        throw new IllegalArgumentException("Inapplicable visibility: " + abstractC0742Ef1);
    }
}
