package com.daaw;

import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.io.IOException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public abstract class N7 {
    public static final Object g(Class cls, Map map, List list) {
        G10.g(cls, "annotationClass");
        G10.g(map, DiagnosticsEntry.Histogram.VALUES_KEY);
        G10.g(list, "methods");
        O90 o90A = AbstractC3192ab0.a(new J7(map));
        Object objNewProxyInstance = Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new L7(cls, map, AbstractC3192ab0.a(new K7(cls, map)), o90A, list));
        G10.e(objNewProxyInstance, "null cannot be cast to non-null type T of kotlin.reflect.jvm.internal.calls.AnnotationConstructorCallerKt.createAnnotationInstance");
        return objNewProxyInstance;
    }

    public static /* synthetic */ Object h(Class cls, Map map, List list, int i, Object obj) {
        if ((i & 4) != 0) {
            Set setKeySet = map.keySet();
            ArrayList arrayList = new ArrayList(AbstractC1703Nm.v(setKeySet, 10));
            Iterator it = setKeySet.iterator();
            while (it.hasNext()) {
                arrayList.add(cls.getDeclaredMethod((String) it.next(), null));
            }
            list = arrayList;
        }
        return g(cls, map, list);
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00fc A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean i(java.lang.Class r5, java.util.List r6, java.util.Map r7, java.lang.Object r8) throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instruction units count: 254
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.N7.i(java.lang.Class, java.util.List, java.util.Map, java.lang.Object):boolean");
    }

    public static final int j(Map map) {
        G10.g(map, "$values");
        int iHashCode = 0;
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            iHashCode += (value instanceof boolean[] ? Arrays.hashCode((boolean[]) value) : value instanceof char[] ? Arrays.hashCode((char[]) value) : value instanceof byte[] ? Arrays.hashCode((byte[]) value) : value instanceof short[] ? Arrays.hashCode((short[]) value) : value instanceof int[] ? Arrays.hashCode((int[]) value) : value instanceof float[] ? Arrays.hashCode((float[]) value) : value instanceof long[] ? Arrays.hashCode((long[]) value) : value instanceof double[] ? Arrays.hashCode((double[]) value) : value instanceof Object[] ? Arrays.hashCode((Object[]) value) : value.hashCode()) ^ (str.hashCode() * 127);
        }
        return iHashCode;
    }

    public static final int k(O90 o90) {
        return ((Number) o90.getValue()).intValue();
    }

    public static final String l(Class cls, Map map) throws IOException {
        G10.g(cls, "$annotationClass");
        G10.g(map, "$values");
        StringBuilder sb = new StringBuilder();
        sb.append('@');
        sb.append(cls.getCanonicalName());
        AbstractC2455Um.k0(map.entrySet(), sb, (124 & 2) != 0 ? ", " : ", ", (124 & 4) != 0 ? "" : "(", (124 & 8) == 0 ? ")" : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : M7.B);
        String string = sb.toString();
        G10.f(string, "toString(...)");
        return string;
    }

    public static final CharSequence m(Map.Entry entry) {
        String string;
        G10.g(entry, "entry");
        String str = (String) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof boolean[]) {
            string = Arrays.toString((boolean[]) value);
            G10.f(string, "toString(...)");
        } else if (value instanceof char[]) {
            string = Arrays.toString((char[]) value);
            G10.f(string, "toString(...)");
        } else if (value instanceof byte[]) {
            string = Arrays.toString((byte[]) value);
            G10.f(string, "toString(...)");
        } else if (value instanceof short[]) {
            string = Arrays.toString((short[]) value);
            G10.f(string, "toString(...)");
        } else if (value instanceof int[]) {
            string = Arrays.toString((int[]) value);
            G10.f(string, "toString(...)");
        } else if (value instanceof float[]) {
            string = Arrays.toString((float[]) value);
            G10.f(string, "toString(...)");
        } else if (value instanceof long[]) {
            string = Arrays.toString((long[]) value);
            G10.f(string, "toString(...)");
        } else if (value instanceof double[]) {
            string = Arrays.toString((double[]) value);
            G10.f(string, "toString(...)");
        } else if (value instanceof Object[]) {
            string = Arrays.toString((Object[]) value);
            G10.f(string, "toString(...)");
        } else {
            string = value.toString();
        }
        return str + '=' + string;
    }

    public static final String n(O90 o90) {
        return (String) o90.getValue();
    }

    public static final Object o(Class cls, Map map, O90 o90, O90 o902, List list, Object obj, Method method, Object[] objArr) {
        G10.g(cls, "$annotationClass");
        G10.g(map, "$values");
        G10.g(o90, "$toString$delegate");
        G10.g(o902, "$hashCode$delegate");
        G10.g(list, "$methods");
        String name = method.getName();
        if (name != null) {
            int iHashCode = name.hashCode();
            if (iHashCode != -1776922004) {
                if (iHashCode != 147696667) {
                    if (iHashCode == 1444986633 && name.equals("annotationType")) {
                        return cls;
                    }
                } else if (name.equals("hashCode")) {
                    return Integer.valueOf(k(o902));
                }
            } else if (name.equals("toString")) {
                return n(o90);
            }
        }
        if (G10.c(name, "equals") && objArr != null && objArr.length == 1) {
            return Boolean.valueOf(i(cls, list, map, AbstractC5431ib.V(objArr)));
        }
        if (map.containsKey(name)) {
            return map.get(name);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Method is not supported: ");
        sb.append(method);
        sb.append(" (args: ");
        if (objArr == null) {
            objArr = new Object[0];
        }
        sb.append(AbstractC5431ib.h0(objArr));
        sb.append(')');
        throw new E80(sb.toString());
    }

    public static final Void p(int i, String str, Class cls) {
        String strD;
        J50 j50B = G10.c(cls, Class.class) ? AbstractC5624jG0.b(J50.class) : (cls.isArray() && G10.c(cls.getComponentType(), Class.class)) ? AbstractC5624jG0.b(J50[].class) : X40.e(cls);
        if (G10.c(j50B.d(), AbstractC5624jG0.b(Object[].class).d())) {
            StringBuilder sb = new StringBuilder();
            sb.append(j50B.d());
            sb.append('<');
            Class<?> componentType = X40.b(j50B).getComponentType();
            G10.f(componentType, "getComponentType(...)");
            sb.append(X40.e(componentType).d());
            sb.append('>');
            strD = sb.toString();
        } else {
            strD = j50B.d();
        }
        throw new IllegalArgumentException("Argument #" + i + ' ' + str + " is not of the required type " + strD);
    }

    public static final Object q(Object obj, Class cls) {
        if (obj instanceof Class) {
            return null;
        }
        if (obj instanceof J50) {
            obj = X40.b((J50) obj);
        } else if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            if (objArr instanceof Class[]) {
                return null;
            }
            if (objArr instanceof J50[]) {
                G10.e(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.reflect.KClass<*>>");
                J50[] j50Arr = (J50[]) obj;
                ArrayList arrayList = new ArrayList(j50Arr.length);
                for (J50 j50 : j50Arr) {
                    arrayList.add(X40.b(j50));
                }
                obj = arrayList.toArray(new Class[0]);
            } else {
                obj = objArr;
            }
        }
        if (cls.isInstance(obj)) {
            return obj;
        }
        return null;
    }
}
