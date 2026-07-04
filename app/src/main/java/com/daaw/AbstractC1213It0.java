package com.daaw;

/* JADX INFO: renamed from: com.daaw.It0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1213It0 {
    public static final VY a;

    static {
        Object obj;
        Class<?> cls;
        VY vy;
        try {
            cls = Class.forName("io.perfmark.impl.SecretPerfMarkImpl$PerfMarkImpl");
            obj = null;
        } catch (Throwable th) {
            obj = th;
            cls = null;
        }
        if (cls != null) {
            try {
                vy = (VY) cls.asSubclass(VY.class).getConstructor(U01.class).newInstance(VY.a);
            } catch (Throwable th2) {
                obj = th2;
                vy = null;
            }
        } else {
            vy = null;
        }
        if (vy != null) {
            a = vy;
        } else {
            a = new VY(VY.a);
        }
        if (obj != null) {
            try {
                if (Boolean.getBoolean("io.perfmark.PerfMark.debug")) {
                    Class<?> cls2 = Class.forName("java.util.logging.Logger");
                    Object objInvoke = cls2.getMethod("getLogger", String.class).invoke(null, AbstractC1213It0.class.getName());
                    Class<?> cls3 = Class.forName("java.util.logging.Level");
                    cls2.getMethod("log", cls3, String.class, Throwable.class).invoke(objInvoke, cls3.getField("FINE").get(null), "Error during PerfMark.<clinit>", obj);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static U01 a(String str) {
        return a.a(str, Long.MIN_VALUE);
    }

    public static U01 b(String str, long j) {
        return a.a(str, j);
    }

    public static void c(String str, U01 u01) {
        a.b(str, u01);
    }

    public static void d(C4600fc0 c4600fc0) {
        a.c(c4600fc0);
    }

    public static C4600fc0 e() {
        return a.d();
    }

    public static void f(String str) {
        a.e(str);
    }

    public static void g(String str, U01 u01) {
        a.f(str, u01);
    }

    public static void h(String str) {
        a.g(str);
    }

    public static void i(String str, U01 u01) {
        a.h(str, u01);
    }
}
