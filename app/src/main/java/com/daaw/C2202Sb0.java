package com.daaw;

import androidx.lifecycle.DefaultLifecycleObserver;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.Sb0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2202Sb0 {
    public static final C2202Sb0 a = new C2202Sb0();
    public static final Map b = new HashMap();
    public static final Map c = new HashMap();

    public static final String c(String str) {
        G10.g(str, "className");
        return AY0.s(str, ".", "_", false, 4, null) + "_LifecycleAdapter";
    }

    public static final androidx.lifecycle.j f(Object obj) {
        G10.g(obj, "object");
        boolean z = obj instanceof androidx.lifecycle.j;
        boolean z2 = obj instanceof DefaultLifecycleObserver;
        if (z && z2) {
            return new androidx.lifecycle.c((DefaultLifecycleObserver) obj, (androidx.lifecycle.j) obj);
        }
        if (z2) {
            return new androidx.lifecycle.c((DefaultLifecycleObserver) obj, null);
        }
        if (z) {
            return (androidx.lifecycle.j) obj;
        }
        Class<?> cls = obj.getClass();
        C2202Sb0 c2202Sb0 = a;
        if (c2202Sb0.d(cls) != 2) {
            return new androidx.lifecycle.p(obj);
        }
        Object obj2 = c.get(cls);
        G10.d(obj2);
        List list = (List) obj2;
        if (list.size() == 1) {
            c2202Sb0.a((Constructor) list.get(0), obj);
            return new androidx.lifecycle.x(null);
        }
        int size = list.size();
        androidx.lifecycle.d[] dVarArr = new androidx.lifecycle.d[size];
        for (int i = 0; i < size; i++) {
            a.a((Constructor) list.get(i), obj);
            dVarArr[i] = null;
        }
        return new androidx.lifecycle.b(dVarArr);
    }

    public final androidx.lifecycle.d a(Constructor constructor, Object obj) {
        try {
            Object objNewInstance = constructor.newInstance(obj);
            G10.f(objNewInstance, "{\n            constructo…tance(`object`)\n        }");
            AbstractC6314li0.a(objNewInstance);
            return null;
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Constructor b(Class cls) {
        try {
            Package r1 = cls.getPackage();
            String canonicalName = cls.getCanonicalName();
            String name = r1 != null ? r1.getName() : "";
            G10.f(name, "fullPackage");
            if (name.length() != 0) {
                G10.f(canonicalName, "name");
                canonicalName = canonicalName.substring(name.length() + 1);
                G10.f(canonicalName, "this as java.lang.String).substring(startIndex)");
            }
            G10.f(canonicalName, "if (fullPackage.isEmpty(…g(fullPackage.length + 1)");
            String strC = c(canonicalName);
            if (name.length() != 0) {
                strC = name + '.' + strC;
            }
            Class<?> cls2 = Class.forName(strC);
            G10.e(cls2, "null cannot be cast to non-null type java.lang.Class<out androidx.lifecycle.GeneratedAdapter>");
            Constructor declaredConstructor = cls2.getDeclaredConstructor(cls);
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
            }
            return declaredConstructor;
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }

    public final int d(Class cls) {
        Map map = b;
        Integer num = (Integer) map.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int iG = g(cls);
        map.put(cls, Integer.valueOf(iG));
        return iG;
    }

    public final boolean e(Class cls) {
        return cls != null && InterfaceC1660Nb0.class.isAssignableFrom(cls);
    }

    public final int g(Class cls) {
        ArrayList arrayList;
        if (cls.getCanonicalName() == null) {
            return 1;
        }
        Constructor constructorB = b(cls);
        if (constructorB != null) {
            c.put(cls, AbstractC1496Lm.e(constructorB));
            return 2;
        }
        if (androidx.lifecycle.a.c.d(cls)) {
            return 1;
        }
        Class superclass = cls.getSuperclass();
        if (e(superclass)) {
            G10.f(superclass, "superclass");
            if (d(superclass) == 1) {
                return 1;
            }
            Object obj = c.get(superclass);
            G10.d(obj);
            arrayList = new ArrayList((Collection) obj);
        } else {
            arrayList = null;
        }
        Class<?>[] interfaces = cls.getInterfaces();
        G10.f(interfaces, "klass.interfaces");
        for (Class<?> cls2 : interfaces) {
            if (e(cls2)) {
                G10.f(cls2, "intrface");
                if (d(cls2) == 1) {
                    return 1;
                }
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                Object obj2 = c.get(cls2);
                G10.d(obj2);
                arrayList.addAll((Collection) obj2);
            }
        }
        if (arrayList == null) {
            return 1;
        }
        c.put(cls, arrayList);
        return 2;
    }
}
