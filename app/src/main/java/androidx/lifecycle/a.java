package androidx.lifecycle;

import androidx.lifecycle.g;
import com.daaw.InterfaceC1764Ob0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static a c = new a();
    public final Map a = new HashMap();
    public final Map b = new HashMap();

    /* JADX INFO: renamed from: androidx.lifecycle.a$a, reason: collision with other inner class name */
    public static class C0020a {
        public final Map a = new HashMap();
        public final Map b;

        public C0020a(Map map) {
            this.b = map;
            for (Map.Entry entry : map.entrySet()) {
                g.a aVar = (g.a) entry.getValue();
                List arrayList = (List) this.a.get(aVar);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    this.a.put(aVar, arrayList);
                }
                arrayList.add((b) entry.getKey());
            }
        }

        public static void b(List list, InterfaceC1764Ob0 interfaceC1764Ob0, g.a aVar, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    ((b) list.get(size)).a(interfaceC1764Ob0, aVar, obj);
                }
            }
        }

        public void a(InterfaceC1764Ob0 interfaceC1764Ob0, g.a aVar, Object obj) {
            b((List) this.a.get(aVar), interfaceC1764Ob0, aVar, obj);
            b((List) this.a.get(g.a.ON_ANY), interfaceC1764Ob0, aVar, obj);
        }
    }

    public static final class b {
        public final int a;
        public final Method b;

        public b(int i, Method method) {
            this.a = i;
            this.b = method;
            method.setAccessible(true);
        }

        public void a(InterfaceC1764Ob0 interfaceC1764Ob0, g.a aVar, Object obj) {
            try {
                int i = this.a;
                if (i == 0) {
                    this.b.invoke(obj, null);
                } else if (i == 1) {
                    this.b.invoke(obj, interfaceC1764Ob0);
                } else {
                    if (i != 2) {
                        return;
                    }
                    this.b.invoke(obj, interfaceC1764Ob0, aVar);
                }
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            } catch (InvocationTargetException e2) {
                throw new RuntimeException("Failed to call observer method", e2.getCause());
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && this.b.getName().equals(bVar.b.getName());
        }

        public int hashCode() {
            return (this.a * 31) + this.b.getName().hashCode();
        }
    }

    public final C0020a a(Class cls, Method[] methodArr) {
        int i;
        C0020a c0020aC;
        Class superclass = cls.getSuperclass();
        HashMap map = new HashMap();
        if (superclass != null && (c0020aC = c(superclass)) != null) {
            map.putAll(c0020aC.b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry entry : c(cls2).b.entrySet()) {
                e(map, (b) entry.getKey(), (g.a) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = b(cls);
        }
        boolean z = false;
        for (Method method : methodArr) {
            n nVar = (n) method.getAnnotation(n.class);
            if (nVar != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else {
                    if (!InterfaceC1764Ob0.class.isAssignableFrom(parameterTypes[0])) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i = 1;
                }
                g.a aVarValue = nVar.value();
                if (parameterTypes.length > 1) {
                    if (!g.a.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (aVarValue != g.a.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                e(map, new b(i, method), aVarValue, cls);
                z = true;
            }
        }
        C0020a c0020a = new C0020a(map);
        this.a.put(cls, c0020a);
        this.b.put(cls, Boolean.valueOf(z));
        return c0020a;
    }

    public final Method[] b(Class cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
        }
    }

    public C0020a c(Class cls) {
        C0020a c0020a = (C0020a) this.a.get(cls);
        return c0020a != null ? c0020a : a(cls, null);
    }

    public boolean d(Class cls) {
        Boolean bool = (Boolean) this.b.get(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        Method[] methodArrB = b(cls);
        for (Method method : methodArrB) {
            if (((n) method.getAnnotation(n.class)) != null) {
                a(cls, methodArrB);
                return true;
            }
        }
        this.b.put(cls, Boolean.FALSE);
        return false;
    }

    public final void e(Map map, b bVar, g.a aVar, Class cls) {
        g.a aVar2 = (g.a) map.get(bVar);
        if (aVar2 == null || aVar == aVar2) {
            if (aVar2 == null) {
                map.put(bVar, aVar);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + bVar.b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + aVar2 + ", new value " + aVar);
    }
}
