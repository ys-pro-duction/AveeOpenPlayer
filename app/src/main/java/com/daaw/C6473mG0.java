package com.daaw;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: com.daaw.mG0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6473mG0 implements InterfaceC4610fe0 {
    public static final Logger b = Logger.getLogger(C6473mG0.class.getName());
    public static final Constructor c;
    public static final Method d;
    public static final Method e;
    public static final RuntimeException f;
    public static final Object[] g;
    public final Object a;

    static {
        Method method;
        Method method2;
        Constructor<?> constructor;
        try {
            Class<?> cls = Class.forName("java.util.concurrent.atomic.LongAdder");
            method = cls.getMethod("add", Long.TYPE);
            try {
                method2 = cls.getMethod("sum", null);
                try {
                    Constructor<?>[] constructors = cls.getConstructors();
                    int length = constructors.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            constructor = null;
                            break;
                        }
                        constructor = constructors[i];
                        if (constructor.getParameterTypes().length == 0) {
                            break;
                        } else {
                            i++;
                        }
                    }
                    th = null;
                } catch (Throwable th) {
                    th = th;
                    b.log(Level.FINE, "LongAdder can not be found via reflection, this is normal for JDK7 and below", th);
                    constructor = null;
                }
            } catch (Throwable th2) {
                th = th2;
                method2 = null;
            }
        } catch (Throwable th3) {
            th = th3;
            method = null;
            method2 = null;
        }
        if (th != null || constructor == null) {
            c = null;
            d = null;
            e = null;
            f = new RuntimeException(th);
        } else {
            c = constructor;
            d = method;
            e = method2;
            f = null;
        }
        g = new Object[]{1L};
    }

    public C6473mG0() {
        RuntimeException runtimeException = f;
        if (runtimeException != null) {
            throw runtimeException;
        }
        try {
            this.a = c.newInstance(null);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException(e2);
        } catch (InstantiationException e3) {
            throw new RuntimeException(e3);
        } catch (InvocationTargetException e4) {
            throw new RuntimeException(e4);
        }
    }

    public static boolean b() {
        return f == null;
    }

    @Override // com.daaw.InterfaceC4610fe0
    public void a(long j) {
        try {
            d.invoke(this.a, j == 1 ? g : new Object[]{Long.valueOf(j)});
        } catch (IllegalAccessException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }
}
