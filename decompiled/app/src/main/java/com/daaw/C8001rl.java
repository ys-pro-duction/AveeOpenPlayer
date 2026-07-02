package com.daaw;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.rl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8001rl implements J50, InterfaceC2967Zk {
    public static final a C = new a(null);
    public static final Map D;
    public static final HashMap E;
    public static final HashMap F;
    public static final HashMap G;
    public static final Map H;
    public final Class B;

    /* JADX INFO: renamed from: com.daaw.rl$a */
    public static final class a {
        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public final String a(Class cls) {
            String str;
            G10.g(cls, "jClass");
            String str2 = null;
            if (cls.isAnonymousClass() || cls.isLocalClass()) {
                return null;
            }
            if (!cls.isArray()) {
                String str3 = (String) C8001rl.G.get(cls.getName());
                return str3 == null ? cls.getCanonicalName() : str3;
            }
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive() && (str = (String) C8001rl.G.get(componentType.getName())) != null) {
                str2 = str + "Array";
            }
            return str2 == null ? "kotlin.Array" : str2;
        }

        public final String b(Class cls) {
            String str;
            G10.g(cls, "jClass");
            String str2 = null;
            if (cls.isAnonymousClass()) {
                return null;
            }
            if (!cls.isLocalClass()) {
                if (!cls.isArray()) {
                    String str3 = (String) C8001rl.H.get(cls.getName());
                    return str3 == null ? cls.getSimpleName() : str3;
                }
                Class<?> componentType = cls.getComponentType();
                if (componentType.isPrimitive() && (str = (String) C8001rl.H.get(componentType.getName())) != null) {
                    str2 = str + "Array";
                }
                return str2 == null ? "Array" : str2;
            }
            String simpleName = cls.getSimpleName();
            Method enclosingMethod = cls.getEnclosingMethod();
            if (enclosingMethod != null) {
                G10.d(simpleName);
                String strR0 = BY0.r0(simpleName, enclosingMethod.getName() + '$', null, 2, null);
                if (strR0 != null) {
                    return strR0;
                }
            }
            Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
            if (enclosingConstructor == null) {
                G10.d(simpleName);
                return BY0.q0(simpleName, '$', null, 2, null);
            }
            G10.d(simpleName);
            return BY0.r0(simpleName, enclosingConstructor.getName() + '$', null, 2, null);
        }

        public final boolean c(Object obj, Class cls) {
            G10.g(cls, "jClass");
            Map map = C8001rl.D;
            G10.e(map, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
            Integer num = (Integer) map.get(cls);
            if (num != null) {
                return V71.k(obj, num.intValue());
            }
            if (cls.isPrimitive()) {
                cls = X40.c(X40.e(cls));
            }
            return cls.isInstance(obj);
        }

        public a() {
        }
    }

    static {
        int i = 0;
        List listN = AbstractC1599Mm.n(LQ.class, NQ.class, InterfaceC3429bR.class, InterfaceC3986dR.class, InterfaceC4553fR.class, InterfaceC5111hR.class, InterfaceC5670jR.class, InterfaceC5949kR.class, InterfaceC6237lR.class, InterfaceC6516mR.class, MQ.class, OQ.class, PQ.class, QQ.class, RQ.class, SQ.class, TQ.class, UQ.class, VQ.class, WQ.class, YQ.class, ZQ.class, InterfaceC3150aR.class);
        ArrayList arrayList = new ArrayList(AbstractC1703Nm.v(listN, 10));
        for (Object obj : listN) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC1599Mm.u();
            }
            arrayList.add(D61.a((Class) obj, Integer.valueOf(i)));
            i = i2;
        }
        D = AbstractC1473Lg0.t(arrayList);
        HashMap map = new HashMap();
        map.put("boolean", "kotlin.Boolean");
        map.put("char", "kotlin.Char");
        map.put("byte", "kotlin.Byte");
        map.put("short", "kotlin.Short");
        map.put("int", "kotlin.Int");
        map.put("float", "kotlin.Float");
        map.put("long", "kotlin.Long");
        map.put("double", "kotlin.Double");
        E = map;
        HashMap map2 = new HashMap();
        map2.put("java.lang.Boolean", "kotlin.Boolean");
        map2.put("java.lang.Character", "kotlin.Char");
        map2.put("java.lang.Byte", "kotlin.Byte");
        map2.put("java.lang.Short", "kotlin.Short");
        map2.put("java.lang.Integer", "kotlin.Int");
        map2.put("java.lang.Float", "kotlin.Float");
        map2.put("java.lang.Long", "kotlin.Long");
        map2.put("java.lang.Double", "kotlin.Double");
        F = map2;
        HashMap map3 = new HashMap();
        map3.put("java.lang.Object", "kotlin.Any");
        map3.put("java.lang.String", "kotlin.String");
        map3.put("java.lang.CharSequence", "kotlin.CharSequence");
        map3.put("java.lang.Throwable", "kotlin.Throwable");
        map3.put("java.lang.Cloneable", "kotlin.Cloneable");
        map3.put("java.lang.Number", "kotlin.Number");
        map3.put("java.lang.Comparable", "kotlin.Comparable");
        map3.put("java.lang.Enum", "kotlin.Enum");
        map3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        map3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        map3.put("java.util.Iterator", "kotlin.collections.Iterator");
        map3.put("java.util.Collection", "kotlin.collections.Collection");
        map3.put("java.util.List", "kotlin.collections.List");
        map3.put("java.util.Set", "kotlin.collections.Set");
        map3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        map3.put("java.util.Map", "kotlin.collections.Map");
        map3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        map3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        map3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        map3.putAll(map);
        map3.putAll(map2);
        Collection<String> collectionValues = map.values();
        G10.f(collectionValues, "<get-values>(...)");
        for (String str : collectionValues) {
            StringBuilder sb = new StringBuilder();
            sb.append("kotlin.jvm.internal.");
            G10.d(str);
            sb.append(BY0.u0(str, '.', null, 2, null));
            sb.append("CompanionObject");
            C0576Cs0 c0576Cs0A = D61.a(sb.toString(), str + ".Companion");
            map3.put(c0576Cs0A.c(), c0576Cs0A.d());
        }
        for (Map.Entry entry : D.entrySet()) {
            map3.put(((Class) entry.getKey()).getName(), "kotlin.Function" + ((Number) entry.getValue()).intValue());
        }
        G = map3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC1369Kg0.d(map3.size()));
        for (Map.Entry entry2 : map3.entrySet()) {
            linkedHashMap.put(entry2.getKey(), BY0.u0((String) entry2.getValue(), '.', null, 2, null));
        }
        H = linkedHashMap;
    }

    public C8001rl(Class cls) {
        G10.g(cls, "jClass");
        this.B = cls;
    }

    @Override // com.daaw.InterfaceC2967Zk
    public Class b() {
        return this.B;
    }

    @Override // com.daaw.J50
    public String d() {
        return C.a(b());
    }

    public boolean equals(Object obj) {
        return (obj instanceof C8001rl) && G10.c(X40.c(this), X40.c((J50) obj));
    }

    @Override // com.daaw.J50
    public String h() {
        return C.b(b());
    }

    @Override // com.daaw.J50
    public int hashCode() {
        return X40.c(this).hashCode();
    }

    @Override // com.daaw.J50
    public boolean l(Object obj) {
        return C.c(obj, b());
    }

    @Override // com.daaw.J50
    public boolean n() {
        r();
        throw new D80();
    }

    public final Void r() {
        throw new F80();
    }

    public String toString() {
        return b().toString() + " (Kotlin reflection is not available)";
    }
}
