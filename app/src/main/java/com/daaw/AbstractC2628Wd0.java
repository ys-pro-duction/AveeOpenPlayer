package com.daaw;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.Set;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: renamed from: com.daaw.Wd0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC2628Wd0 {
    public static volatile int a;
    public static volatile AK0 e;
    public static final C5423iZ0 b = new C5423iZ0();
    public static final C2038Qm0 c = new C2038Qm0();
    public static boolean d = AbstractC7953rb1.f("slf4j.detectLoggerNameMismatch");
    public static final String[] f = {"2.0"};

    public static final void b() {
        try {
            List listH = h();
            x(listH);
            if (listH == null || listH.isEmpty()) {
                a = 4;
                AbstractC7953rb1.c("No SLF4J providers were found.");
                AbstractC7953rb1.c("Defaulting to no-operation (NOP) logger implementation");
                AbstractC7953rb1.c("See https://www.slf4j.org/codes.html#noProviders for further details.");
                w(g());
            } else {
                e = (AK0) listH.get(0);
                e.a();
                a = 3;
                v(listH);
            }
            s();
        } catch (Exception e2) {
            f(e2);
            throw new IllegalStateException("Unexpected initialization failure", e2);
        }
    }

    public static void c(C5144hZ0 c5144hZ0, int i) {
        if (c5144hZ0.c().j()) {
            d(i);
        } else {
            if (c5144hZ0.c().k()) {
                return;
            }
            e();
        }
    }

    public static void d(int i) {
        AbstractC7953rb1.c("A number (" + i + ") of logging calls during the initialization phase have been intercepted and are");
        AbstractC7953rb1.c("now being replayed. These are subject to the filtering rules of the underlying logging system.");
        AbstractC7953rb1.c("See also https://www.slf4j.org/codes.html#replay");
    }

    public static void e() {
        AbstractC7953rb1.c("The following set of substitute loggers may have been accessed");
        AbstractC7953rb1.c("during the initialization phase. Logging calls during this");
        AbstractC7953rb1.c("phase were not honored. However, subsequent logging calls to these");
        AbstractC7953rb1.c("loggers will work as normally expected.");
        AbstractC7953rb1.c("See also https://www.slf4j.org/codes.html#substituteLogger");
    }

    public static void f(Throwable th) {
        a = 2;
        AbstractC7953rb1.d("Failed to instantiate SLF4J LoggerFactory", th);
    }

    public static Set g() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        try {
            ClassLoader classLoader = AbstractC2628Wd0.class.getClassLoader();
            Enumeration<URL> systemResources = classLoader == null ? ClassLoader.getSystemResources("org/slf4j/impl/StaticLoggerBinder.class") : classLoader.getResources("org/slf4j/impl/StaticLoggerBinder.class");
            while (systemResources.hasMoreElements()) {
                linkedHashSet.add(systemResources.nextElement());
            }
        } catch (IOException e2) {
            AbstractC7953rb1.d("Error getting resources from path", e2);
        }
        return linkedHashSet;
    }

    public static List h() {
        ArrayList arrayList = new ArrayList();
        ClassLoader classLoader = AbstractC2628Wd0.class.getClassLoader();
        AK0 ak0P = p(classLoader);
        if (ak0P != null) {
            arrayList.add(ak0P);
            return arrayList;
        }
        Iterator it = n(classLoader).iterator();
        while (it.hasNext()) {
            y(arrayList, it);
        }
        return arrayList;
    }

    public static void i() {
        C5423iZ0 c5423iZ0 = b;
        synchronized (c5423iZ0) {
            try {
                c5423iZ0.d().e();
                for (C4586fZ0 c4586fZ0 : c5423iZ0.d().d()) {
                    c4586fZ0.n(l(c4586fZ0.getName()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static InterfaceC6819nX j() {
        return m().b();
    }

    public static InterfaceC2420Ud0 k(Class cls) {
        Class clsA;
        InterfaceC2420Ud0 interfaceC2420Ud0L = l(cls.getName());
        if (d && (clsA = AbstractC7953rb1.a()) != null && q(cls, clsA)) {
            AbstractC7953rb1.c(String.format("Detected logger name mismatch. Given name: \"%s\"; computed name: \"%s\".", interfaceC2420Ud0L.getName(), clsA.getName()));
            AbstractC7953rb1.c("See https://www.slf4j.org/codes.html#loggerNameMismatch for an explanation");
        }
        return interfaceC2420Ud0L;
    }

    public static InterfaceC2420Ud0 l(String str) {
        return j().a(str);
    }

    public static AK0 m() {
        if (a == 0) {
            synchronized (AbstractC2628Wd0.class) {
                try {
                    if (a == 0) {
                        a = 1;
                        r();
                    }
                } finally {
                }
            }
        }
        int i = a;
        if (i == 1) {
            return b;
        }
        if (i == 2) {
            throw new IllegalStateException("org.slf4j.LoggerFactory in failed state. Original exception was thrown EARLIER. See also https://www.slf4j.org/codes.html#unsuccessfulInit");
        }
        if (i == 3) {
            return e;
        }
        if (i == 4) {
            return c;
        }
        throw new IllegalStateException("Unreachable code");
    }

    public static ServiceLoader n(final ClassLoader classLoader) {
        return System.getSecurityManager() == null ? ServiceLoader.load(AK0.class, classLoader) : (ServiceLoader) AccessController.doPrivileged(new PrivilegedAction() { // from class: com.daaw.Vd0
            @Override // java.security.PrivilegedAction
            public final Object run() {
                return ServiceLoader.load(AK0.class, classLoader);
            }
        });
    }

    public static boolean o(List list) {
        return list.size() > 1;
    }

    public static AK0 p(ClassLoader classLoader) {
        String property = System.getProperty("slf4j.provider");
        if (property != null && !property.isEmpty()) {
            try {
                AbstractC7953rb1.c(String.format("Attempting to load provider \"%s\" specified via \"%s\" system property", property, "slf4j.provider"));
                return (AK0) classLoader.loadClass(property).getConstructor(null).newInstance(null);
            } catch (ClassCastException e2) {
                AbstractC7953rb1.d(String.format("Specified SLF4JServiceProvider (%s) does not implement SLF4JServiceProvider interface", property), e2);
                return null;
            } catch (ClassNotFoundException e3) {
                e = e3;
                AbstractC7953rb1.d(String.format("Failed to instantiate the specified SLF4JServiceProvider (%s)", property), e);
                return null;
            } catch (IllegalAccessException e4) {
                e = e4;
                AbstractC7953rb1.d(String.format("Failed to instantiate the specified SLF4JServiceProvider (%s)", property), e);
                return null;
            } catch (InstantiationException e5) {
                e = e5;
                AbstractC7953rb1.d(String.format("Failed to instantiate the specified SLF4JServiceProvider (%s)", property), e);
                return null;
            } catch (NoSuchMethodException e6) {
                e = e6;
                AbstractC7953rb1.d(String.format("Failed to instantiate the specified SLF4JServiceProvider (%s)", property), e);
                return null;
            } catch (InvocationTargetException e7) {
                e = e7;
                AbstractC7953rb1.d(String.format("Failed to instantiate the specified SLF4JServiceProvider (%s)", property), e);
                return null;
            }
        }
        return null;
    }

    public static boolean q(Class cls, Class cls2) {
        return !cls2.isAssignableFrom(cls);
    }

    public static final void r() {
        b();
        if (a == 3) {
            z();
        }
    }

    public static void s() {
        i();
        t();
        b.d().b();
    }

    public static void t() {
        LinkedBlockingQueue linkedBlockingQueueC = b.d().c();
        int size = linkedBlockingQueueC.size();
        ArrayList<C5144hZ0> arrayList = new ArrayList(128);
        int i = 0;
        while (linkedBlockingQueueC.drainTo(arrayList, 128) != 0) {
            for (C5144hZ0 c5144hZ0 : arrayList) {
                u(c5144hZ0);
                int i2 = i + 1;
                if (i == 0) {
                    c(c5144hZ0, size);
                }
                i = i2;
            }
            arrayList.clear();
        }
    }

    public static void u(C5144hZ0 c5144hZ0) {
        if (c5144hZ0 == null) {
            return;
        }
        C4586fZ0 c4586fZ0C = c5144hZ0.c();
        String name = c4586fZ0C.getName();
        if (c4586fZ0C.l()) {
            throw new IllegalStateException("Delegate logger cannot be null at this state.");
        }
        if (c4586fZ0C.k()) {
            return;
        }
        if (!c4586fZ0C.j()) {
            AbstractC7953rb1.c(name);
        } else if (c4586fZ0C.f(c5144hZ0.b())) {
            c4586fZ0C.m(c5144hZ0);
        }
    }

    public static void v(List list) {
        if (list.isEmpty() || !o(list)) {
            return;
        }
        AbstractC7953rb1.c("Actual provider is of type [" + list.get(0) + "]");
    }

    public static void w(Set set) {
        if (set.isEmpty()) {
            return;
        }
        AbstractC7953rb1.c("Class path contains SLF4J bindings targeting slf4j-api versions 1.7.x or earlier.");
        Iterator it = set.iterator();
        while (it.hasNext()) {
            AbstractC7953rb1.c("Ignoring binding found at [" + ((URL) it.next()) + "]");
        }
        AbstractC7953rb1.c("See https://www.slf4j.org/codes.html#ignoredBindings for an explanation.");
    }

    public static void x(List list) {
        if (o(list)) {
            AbstractC7953rb1.c("Class path contains multiple SLF4J providers.");
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AbstractC7953rb1.c("Found provider [" + ((AK0) it.next()) + "]");
            }
            AbstractC7953rb1.c("See https://www.slf4j.org/codes.html#multiple_bindings for an explanation.");
        }
    }

    public static void y(List list, Iterator it) {
        try {
            list.add((AK0) it.next());
        } catch (ServiceConfigurationError e2) {
            AbstractC7953rb1.c("A SLF4J service provider failed to instantiate:\n" + e2.getMessage());
        }
    }

    public static final void z() {
        try {
            String strC = e.c();
            boolean z = false;
            for (String str : f) {
                if (strC.startsWith(str)) {
                    z = true;
                }
            }
            if (z) {
                return;
            }
            AbstractC7953rb1.c("The requested version " + strC + " by your slf4j provider is not compatible with " + Arrays.asList(f).toString());
            AbstractC7953rb1.c("See https://www.slf4j.org/codes.html#version_mismatch for further details.");
        } catch (NoSuchFieldError unused) {
        } catch (Throwable th) {
            AbstractC7953rb1.d("Unexpected problem occurred during version sanity check", th);
        }
    }
}
