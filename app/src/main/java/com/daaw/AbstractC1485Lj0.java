package com.daaw;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.Lj0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC1485Lj0 {
    public static final C5382iP a(String str, Object[] objArr, Throwable th) {
        int i;
        if (str == null) {
            return new C5382iP(null, objArr, th);
        }
        if (objArr == null) {
            return new C5382iP(str);
        }
        StringBuilder sb = new StringBuilder(str.length() + 50);
        int i2 = 0;
        int i3 = 0;
        while (i2 < objArr.length) {
            int iIndexOf = str.indexOf("{}", i3);
            if (iIndexOf == -1) {
                if (i3 == 0) {
                    return new C5382iP(str, objArr, th);
                }
                sb.append((CharSequence) str, i3, str.length());
                return new C5382iP(sb.toString(), objArr, th);
            }
            if (!k(str, iIndexOf)) {
                sb.append((CharSequence) str, i3, iIndexOf);
                f(sb, objArr[i2], new HashMap());
            } else if (j(str, iIndexOf)) {
                sb.append((CharSequence) str, i3, iIndexOf - 1);
                f(sb, objArr[i2], new HashMap());
            } else {
                i2--;
                sb.append((CharSequence) str, i3, iIndexOf - 1);
                sb.append('{');
                i = iIndexOf + 1;
                i3 = i;
                i2++;
            }
            i = iIndexOf + 2;
            i3 = i;
            i2++;
        }
        sb.append((CharSequence) str, i3, str.length());
        return new C5382iP(sb.toString(), objArr, th);
    }

    public static final String b(String str, Object[] objArr) {
        return a(str, objArr, null).a();
    }

    public static void c(StringBuilder sb, boolean[] zArr) {
        sb.append('[');
        int length = zArr.length;
        for (int i = 0; i < length; i++) {
            sb.append(zArr[i]);
            if (i != length - 1) {
                sb.append(", ");
            }
        }
        sb.append(']');
    }

    public static void d(StringBuilder sb, byte[] bArr) {
        sb.append('[');
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            sb.append((int) bArr[i]);
            if (i != length - 1) {
                sb.append(", ");
            }
        }
        sb.append(']');
    }

    public static void e(StringBuilder sb, char[] cArr) {
        sb.append('[');
        int length = cArr.length;
        for (int i = 0; i < length; i++) {
            sb.append(cArr[i]);
            if (i != length - 1) {
                sb.append(", ");
            }
        }
        sb.append(']');
    }

    public static void f(StringBuilder sb, Object obj, Map map) {
        if (obj == null) {
            sb.append("null");
            return;
        }
        if (!obj.getClass().isArray()) {
            n(sb, obj);
            return;
        }
        if (obj instanceof boolean[]) {
            c(sb, (boolean[]) obj);
            return;
        }
        if (obj instanceof byte[]) {
            d(sb, (byte[]) obj);
            return;
        }
        if (obj instanceof char[]) {
            e(sb, (char[]) obj);
            return;
        }
        if (obj instanceof short[]) {
            o(sb, (short[]) obj);
            return;
        }
        if (obj instanceof int[]) {
            i(sb, (int[]) obj);
            return;
        }
        if (obj instanceof long[]) {
            l(sb, (long[]) obj);
            return;
        }
        if (obj instanceof float[]) {
            h(sb, (float[]) obj);
        } else if (obj instanceof double[]) {
            g(sb, (double[]) obj);
        } else {
            m(sb, (Object[]) obj, map);
        }
    }

    public static void g(StringBuilder sb, double[] dArr) {
        sb.append('[');
        int length = dArr.length;
        for (int i = 0; i < length; i++) {
            sb.append(dArr[i]);
            if (i != length - 1) {
                sb.append(", ");
            }
        }
        sb.append(']');
    }

    public static void h(StringBuilder sb, float[] fArr) {
        sb.append('[');
        int length = fArr.length;
        for (int i = 0; i < length; i++) {
            sb.append(fArr[i]);
            if (i != length - 1) {
                sb.append(", ");
            }
        }
        sb.append(']');
    }

    public static void i(StringBuilder sb, int[] iArr) {
        sb.append('[');
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            sb.append(iArr[i]);
            if (i != length - 1) {
                sb.append(", ");
            }
        }
        sb.append(']');
    }

    public static final boolean j(String str, int i) {
        return i >= 2 && str.charAt(i - 2) == '\\';
    }

    public static final boolean k(String str, int i) {
        return i != 0 && str.charAt(i - 1) == '\\';
    }

    public static void l(StringBuilder sb, long[] jArr) {
        sb.append('[');
        int length = jArr.length;
        for (int i = 0; i < length; i++) {
            sb.append(jArr[i]);
            if (i != length - 1) {
                sb.append(", ");
            }
        }
        sb.append(']');
    }

    public static void m(StringBuilder sb, Object[] objArr, Map map) {
        sb.append('[');
        if (map.containsKey(objArr)) {
            sb.append("...");
        } else {
            map.put(objArr, null);
            int length = objArr.length;
            for (int i = 0; i < length; i++) {
                f(sb, objArr[i], map);
                if (i != length - 1) {
                    sb.append(", ");
                }
            }
            map.remove(objArr);
        }
        sb.append(']');
    }

    public static void n(StringBuilder sb, Object obj) {
        try {
            sb.append(obj.toString());
        } catch (Throwable th) {
            AbstractC7953rb1.d("SLF4J: Failed toString() invocation on an object of type [" + obj.getClass().getName() + "]", th);
            sb.append("[FAILED toString()]");
        }
    }

    public static void o(StringBuilder sb, short[] sArr) {
        sb.append('[');
        int length = sArr.length;
        for (int i = 0; i < length; i++) {
            sb.append((int) sArr[i]);
            if (i != length - 1) {
                sb.append(", ");
            }
        }
        sb.append(']');
    }
}
