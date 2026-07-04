package com.daaw;

import com.daaw.AbstractC5347iG0;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.r60, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC7823r60 implements InterfaceC2967Zk {
    public static final a B = new a(null);
    public static final Class C = AbstractC2911Yw.class;
    public static final C8146sG0 D = new C8146sG0("<v#(\\d+)>");

    /* JADX INFO: renamed from: com.daaw.r60$a */
    public static final class a {
        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public final C8146sG0 a() {
            return AbstractC7823r60.D;
        }

        public a() {
        }
    }

    /* JADX INFO: renamed from: com.daaw.r60$b */
    public abstract class b {
        public static final /* synthetic */ W60[] c = {AbstractC5624jG0.h(new C6728nA0(AbstractC5624jG0.b(b.class), "moduleData", "getModuleData()Lorg/jetbrains/kotlin/descriptors/runtime/components/RuntimeModuleData;"))};
        public final AbstractC5347iG0.a a;

        public b() {
            this.a = AbstractC5347iG0.b(new C8102s60(AbstractC7823r60.this));
        }

        public static final C9006vK0 c(AbstractC7823r60 abstractC7823r60) {
            G10.g(abstractC7823r60, "this$0");
            return AbstractC2344Tk0.a(abstractC7823r60.b());
        }

        public final C9006vK0 b() {
            Object objC = this.a.c(this, c[0]);
            G10.f(objC, "getValue(...)");
            return (C9006vK0) objC;
        }
    }

    /* JADX INFO: renamed from: com.daaw.r60$c */
    public static final class c {
        public final List a;
        public final Class b;

        public c(List list, Class cls) {
            G10.g(list, "parameters");
            this.a = list;
            this.b = cls;
        }

        public final List a() {
            return this.a;
        }

        public final Class b() {
            return this.b;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: com.daaw.r60$d */
    public static final class d {
        public static final d B = new d("DECLARED", 0);
        public static final d C = new d("INHERITED", 1);
        public static final /* synthetic */ d[] D;
        public static final /* synthetic */ YG E;

        static {
            d[] dVarArrA = a();
            D = dVarArrA;
            E = AbstractC3110aH.a(dVarArrA);
        }

        public d(String str, int i) {
        }

        public static final /* synthetic */ d[] a() {
            return new d[]{B, C};
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) D.clone();
        }

        public final boolean c(InterfaceC1583Mi interfaceC1583Mi) {
            G10.g(interfaceC1583Mi, "member");
            return interfaceC1583Mi.i().a() == (this == B);
        }
    }

    /* JADX INFO: renamed from: com.daaw.r60$e */
    public static final class e extends C3843cu {
        public e(AbstractC7823r60 abstractC7823r60) {
            super(abstractC7823r60);
        }

        @Override // com.daaw.AbstractC10014yw, com.daaw.InterfaceC9735xw
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public H50 c(InterfaceC7195or interfaceC7195or, G91 g91) {
            G10.g(interfaceC7195or, "descriptor");
            G10.g(g91, "data");
            throw new IllegalStateException("No constructors should appear here: " + interfaceC7195or);
        }
    }

    public static final int C(AbstractC8965vA abstractC8965vA, AbstractC8965vA abstractC8965vA2) {
        Integer numD = AbstractC8679uA.d(abstractC8965vA, abstractC8965vA2);
        if (numD != null) {
            return numD.intValue();
        }
        return 0;
    }

    public static final int D(InterfaceC3429bR interfaceC3429bR, Object obj, Object obj2) {
        G10.g(interfaceC3429bR, "$tmp0");
        return ((Number) interfaceC3429bR.invoke(obj, obj2)).intValue();
    }

    public static final CharSequence E(InterfaceC4476fA0 interfaceC4476fA0) {
        G10.g(interfaceC4476fA0, "descriptor");
        return AbstractC2923Yz.k.O(interfaceC4476fA0) + " | " + C9564xK0.a.f(interfaceC4476fA0).a();
    }

    public static final CharSequence z(InterfaceC8468tR interfaceC8468tR) {
        G10.g(interfaceC8468tR, "descriptor");
        return AbstractC2923Yz.k.O(interfaceC8468tR) + " | " + C9564xK0.a.g(interfaceC8468tR).a();
    }

    public final Method A(String str, String str2) {
        Method methodL;
        G10.g(str, "name");
        G10.g(str2, "desc");
        if (G10.c(str, "<init>")) {
            return null;
        }
        c cVarM = M(str2, true);
        Class[] clsArr = (Class[]) cVarM.a().toArray(new Class[0]);
        Class clsB = cVarM.b();
        G10.d(clsB);
        Method methodL2 = L(J(), str, clsArr, clsB, false);
        if (methodL2 != null) {
            return methodL2;
        }
        if (!J().isInterface() || (methodL = L(Object.class, str, clsArr, clsB, false)) == null) {
            return null;
        }
        return methodL;
    }

    public final InterfaceC4476fA0 B(String str, String str2) {
        G10.g(str, "name");
        G10.g(str2, "signature");
        InterfaceC2536Vg0 interfaceC2536Vg0A = D.a(str2);
        if (interfaceC2536Vg0A != null) {
            String str3 = (String) interfaceC2536Vg0A.a().a().b().get(1);
            InterfaceC4476fA0 interfaceC4476fA0H = H(Integer.parseInt(str3));
            if (interfaceC4476fA0H != null) {
                return interfaceC4476fA0H;
            }
            throw new E80("Local property #" + str3 + " not found in " + b());
        }
        C2352Tm0 c2352Tm0L = C2352Tm0.l(str);
        G10.f(c2352Tm0L, "identifier(...)");
        Collection collectionK = K(c2352Tm0L);
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionK) {
            if (G10.c(C9564xK0.a.f((InterfaceC4476fA0) obj).a(), str2)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            throw new E80("Property '" + str + "' (JVM signature: " + str2 + ") not resolved in " + this);
        }
        if (arrayList.size() == 1) {
            return (InterfaceC4476fA0) AbstractC2455Um.C0(arrayList);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj2 : arrayList) {
            AbstractC8965vA visibility = ((InterfaceC4476fA0) obj2).getVisibility();
            Object arrayList2 = linkedHashMap.get(visibility);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(visibility, arrayList2);
            }
            ((List) arrayList2).add(obj2);
        }
        Collection collectionValues = AbstractC1369Kg0.g(linkedHashMap, new C6987o60(C6708n60.B)).values();
        G10.f(collectionValues, "<get-values>(...)");
        List list = (List) AbstractC2455Um.o0(collectionValues);
        if (list.size() == 1) {
            G10.d(list);
            return (InterfaceC4476fA0) AbstractC2455Um.e0(list);
        }
        C2352Tm0 c2352Tm0L2 = C2352Tm0.l(str);
        G10.f(c2352Tm0L2, "identifier(...)");
        String strN0 = AbstractC2455Um.n0(K(c2352Tm0L2), "\n", null, null, 0, null, C7266p60.B, 30, null);
        StringBuilder sb = new StringBuilder();
        sb.append("Property '");
        sb.append(str);
        sb.append("' (JVM signature: ");
        sb.append(str2);
        sb.append(") not resolved in ");
        sb.append(this);
        sb.append(':');
        sb.append(strN0.length() == 0 ? " no members found" : '\n' + strN0);
        throw new E80(sb.toString());
    }

    public abstract Collection F();

    public abstract Collection G(C2352Tm0 c2352Tm0);

    public abstract InterfaceC4476fA0 H(int i);

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.Collection I(com.daaw.InterfaceC4346ej0 r8, com.daaw.AbstractC7823r60.d r9) {
        /*
            r7 = this;
            java.lang.String r0 = "scope"
            com.daaw.G10.g(r8, r0)
            java.lang.String r0 = "belonginess"
            com.daaw.G10.g(r9, r0)
            com.daaw.r60$e r0 = new com.daaw.r60$e
            r0.<init>(r7)
            r1 = 3
            r2 = 0
            java.util.Collection r8 = com.daaw.FI0.a.a(r8, r2, r2, r1, r2)
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r8 = r8.iterator()
        L20:
            boolean r3 = r8.hasNext()
            if (r3 == 0) goto L55
            java.lang.Object r3 = r8.next()
            com.daaw.tw r3 = (com.daaw.InterfaceC8612tw) r3
            boolean r4 = r3 instanceof com.daaw.InterfaceC1583Mi
            if (r4 == 0) goto L4e
            r4 = r3
            com.daaw.Mi r4 = (com.daaw.InterfaceC1583Mi) r4
            com.daaw.vA r5 = r4.getVisibility()
            com.daaw.vA r6 = com.daaw.AbstractC8679uA.h
            boolean r5 = com.daaw.G10.c(r5, r6)
            if (r5 != 0) goto L4e
            boolean r4 = r9.c(r4)
            if (r4 == 0) goto L4e
            com.daaw.G91 r4 = com.daaw.G91.a
            java.lang.Object r3 = r3.h0(r0, r4)
            com.daaw.H50 r3 = (com.daaw.H50) r3
            goto L4f
        L4e:
            r3 = r2
        L4f:
            if (r3 == 0) goto L20
            r1.add(r3)
            goto L20
        L55:
            java.util.List r8 = com.daaw.AbstractC2455Um.M0(r1)
            java.util.Collection r8 = (java.util.Collection) r8
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.AbstractC7823r60.I(com.daaw.ej0, com.daaw.r60$d):java.util.Collection");
    }

    public Class J() {
        Class clsK = AbstractC9544xF0.k(b());
        return clsK == null ? b() : clsK;
    }

    public abstract Collection K(C2352Tm0 c2352Tm0);

    public final Method L(Class cls, String str, Class[] clsArr, Class cls2, boolean z) {
        String str2;
        Class[] clsArr2;
        Class cls3;
        boolean z2;
        if (z) {
            clsArr[0] = cls;
        }
        Method methodP = P(cls, str, clsArr, cls2);
        if (methodP != null) {
            return methodP;
        }
        Class superclass = cls.getSuperclass();
        if (superclass != null) {
            Method methodL = L(superclass, str, clsArr, cls2, z);
            str2 = str;
            clsArr2 = clsArr;
            cls3 = cls2;
            z2 = z;
            if (methodL != null) {
                return methodL;
            }
        } else {
            str2 = str;
            clsArr2 = clsArr;
            cls3 = cls2;
            z2 = z;
        }
        Iterator itA = AbstractC2093Ra.a(cls.getInterfaces());
        while (itA.hasNext()) {
            Class cls4 = (Class) itA.next();
            G10.d(cls4);
            Method methodL2 = L(cls4, str2, clsArr2, cls3, z2);
            if (methodL2 != null) {
                return methodL2;
            }
            if (z2) {
                Class clsA = KF0.a(AbstractC9544xF0.j(cls4), cls4.getName() + "$DefaultImpls");
                if (clsA != null) {
                    clsArr2[0] = cls4;
                    Method methodP2 = P(clsA, str2, clsArr2, cls3);
                    if (methodP2 != null) {
                        return methodP2;
                    }
                } else {
                    continue;
                }
            }
        }
        return null;
    }

    public final c M(String str, boolean z) {
        String str2;
        int iL;
        ArrayList arrayList = new ArrayList();
        int i = 1;
        while (true) {
            if (str.charAt(i) == ')') {
                String str3 = str;
                return new c(arrayList, z ? N(str3, i + 1, str3.length()) : null);
            }
            int i2 = i;
            while (str.charAt(i2) == '[') {
                i2++;
            }
            char cCharAt = str.charAt(i2);
            if (BY0.y("VZCBSIFJD", cCharAt, false, 2, null)) {
                int i3 = i2 + 1;
                str2 = str;
                iL = i3;
            } else {
                if (cCharAt != 'L') {
                    throw new E80("Unknown type prefix in the method signature: " + str);
                }
                str2 = str;
                iL = BY0.L(str2, ';', i, false, 4, null) + 1;
            }
            arrayList.add(N(str2, i, iL));
            i = iL;
            str = str2;
        }
    }

    public final Class N(String str, int i, int i2) throws ClassNotFoundException {
        char cCharAt = str.charAt(i);
        if (cCharAt == 'L') {
            ClassLoader classLoaderJ = AbstractC9544xF0.j(b());
            String strSubstring = str.substring(i + 1, i2 - 1);
            G10.f(strSubstring, "substring(...)");
            Class<?> clsLoadClass = classLoaderJ.loadClass(AY0.r(strSubstring, '/', '.', false, 4, null));
            G10.f(clsLoadClass, "loadClass(...)");
            return clsLoadClass;
        }
        if (cCharAt == '[') {
            return AbstractC8511tb1.f(N(str, i + 1, i2));
        }
        if (cCharAt == 'V') {
            Class cls = Void.TYPE;
            G10.f(cls, "TYPE");
            return cls;
        }
        if (cCharAt == 'Z') {
            return Boolean.TYPE;
        }
        if (cCharAt == 'C') {
            return Character.TYPE;
        }
        if (cCharAt == 'B') {
            return Byte.TYPE;
        }
        if (cCharAt == 'S') {
            return Short.TYPE;
        }
        if (cCharAt == 'I') {
            return Integer.TYPE;
        }
        if (cCharAt == 'F') {
            return Float.TYPE;
        }
        if (cCharAt == 'J') {
            return Long.TYPE;
        }
        if (cCharAt == 'D') {
            return Double.TYPE;
        }
        throw new E80("Unknown type prefix in the method signature: " + str);
    }

    public final Constructor O(Class cls, List list) {
        try {
            Class[] clsArr = (Class[]) list.toArray(new Class[0]);
            return cls.getDeclaredConstructor((Class[]) Arrays.copyOf(clsArr, clsArr.length));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public final Method P(Class cls, String str, Class[] clsArr, Class cls2) {
        try {
            Method declaredMethod = cls.getDeclaredMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
            if (G10.c(declaredMethod.getReturnType(), cls2)) {
                return declaredMethod;
            }
            Method[] declaredMethods = cls.getDeclaredMethods();
            G10.f(declaredMethods, "getDeclaredMethods(...)");
            for (Method method : declaredMethods) {
                if (G10.c(method.getName(), str) && G10.c(method.getReturnType(), cls2) && Arrays.equals(method.getParameterTypes(), clsArr)) {
                    return method;
                }
            }
        } catch (NoSuchMethodException unused) {
        }
        return null;
    }

    public final void u(List list, List list2, boolean z) {
        if (G10.c(AbstractC2455Um.r0(list2), C)) {
            list2 = list2.subList(0, list2.size() - 1);
        }
        list.addAll(list2);
        int size = (list2.size() + 31) / 32;
        for (int i = 0; i < size; i++) {
            Class cls = Integer.TYPE;
            G10.f(cls, "TYPE");
            list.add(cls);
        }
        Class cls2 = z ? C : Object.class;
        G10.d(cls2);
        list.add(cls2);
    }

    public final Constructor v(String str) {
        G10.g(str, "desc");
        return O(b(), M(str, false).a());
    }

    public final Constructor w(String str) {
        G10.g(str, "desc");
        Class clsB = b();
        ArrayList arrayList = new ArrayList();
        u(arrayList, M(str, false).a(), true);
        G91 g91 = G91.a;
        return O(clsB, arrayList);
    }

    public final Method x(String str, String str2, boolean z) {
        G10.g(str, "name");
        G10.g(str2, "desc");
        if (G10.c(str, "<init>")) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (z) {
            arrayList.add(b());
        }
        c cVarM = M(str2, true);
        u(arrayList, cVarM.a(), false);
        Class clsJ = J();
        String str3 = str + "$default";
        Class[] clsArr = (Class[]) arrayList.toArray(new Class[0]);
        Class clsB = cVarM.b();
        G10.d(clsB);
        return L(clsJ, str3, clsArr, clsB, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.daaw.InterfaceC8468tR y(java.lang.String r14, java.lang.String r15) {
        /*
            Method dump skipped, instruction units count: 357
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.AbstractC7823r60.y(java.lang.String, java.lang.String):com.daaw.tR");
    }
}
