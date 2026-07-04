package com.daaw;

/* JADX INFO: renamed from: com.daaw.iO2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5381iO2 {
    public static int a(int i, int i2, String str) {
        String strB;
        if (i >= 0 && i < i2) {
            return i;
        }
        if (i < 0) {
            strB = BO2.b("%s (%s) must not be negative", "index", Integer.valueOf(i));
        } else {
            if (i2 < 0) {
                throw new IllegalArgumentException("negative size: " + i2);
            }
            strB = BO2.b("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IndexOutOfBoundsException(strB);
    }

    public static int b(int i, int i2, String str) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(k(i, i2, "index"));
        }
        return i;
    }

    public static Object c(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException((String) obj2);
    }

    public static Object d(Object obj, String str, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(BO2.b(str, obj2));
    }

    public static void e(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static void f(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException((String) obj);
        }
    }

    public static void g(boolean z, String str, long j) {
        if (!z) {
            throw new IllegalArgumentException(BO2.b(str, Long.valueOf(j)));
        }
    }

    public static void h(int i, int i2, int i3) {
        if (i < 0 || i2 < i || i2 > i3) {
            throw new IndexOutOfBoundsException((i < 0 || i > i3) ? k(i, i3, "start index") : (i2 < 0 || i2 > i3) ? k(i2, i3, "end index") : BO2.b("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i)));
        }
    }

    public static void i(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    public static void j(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException((String) obj);
        }
    }

    public static String k(int i, int i2, String str) {
        if (i < 0) {
            return BO2.b("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return BO2.b("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IllegalArgumentException("negative size: " + i2);
    }
}
