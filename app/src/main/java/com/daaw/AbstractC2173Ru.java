package com.daaw;

import android.net.Uri;
import com.google.firebase.Timestamp;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: renamed from: com.daaw.Ru, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2173Ru {
    public static final ConcurrentMap a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: com.daaw.Ru$a */
    public static class a {
        public final Class a;
        public final Constructor b;
        public final boolean c;
        public final boolean d;
        public final Map e = new HashMap();
        public final Map g = new HashMap();
        public final Map f = new HashMap();
        public final Map h = new HashMap();
        public final HashSet i = new HashSet();
        public final HashSet j = new HashSet();

        public a(Class cls) {
            this.a = cls;
            this.c = cls.isAnnotationPresent(InterfaceC9211w31.class);
            this.d = !cls.isAnnotationPresent(YX.class);
            Constructor constructor = null;
            try {
                Constructor declaredConstructor = cls.getDeclaredConstructor(null);
                declaredConstructor.setAccessible(true);
                constructor = declaredConstructor;
            } catch (NoSuchMethodException unused) {
            }
            this.b = constructor;
            for (Method method : cls.getMethods()) {
                if (n(method)) {
                    String strJ = j(method);
                    b(strJ);
                    method.setAccessible(true);
                    if (this.f.containsKey(strJ)) {
                        throw new RuntimeException("Found conflicting getters for name " + method.getName() + " on class " + cls.getName());
                    }
                    this.f.put(strJ, method);
                    e(method);
                }
            }
            for (Field field : cls.getFields()) {
                if (m(field)) {
                    b(i(field));
                    d(field);
                }
            }
            Class superclass = cls;
            do {
                for (Method method2 : superclass.getDeclaredMethods()) {
                    if (o(method2)) {
                        String strJ2 = j(method2);
                        String str = (String) this.e.get(strJ2.toLowerCase(Locale.US));
                        if (str == null) {
                            continue;
                        } else {
                            if (!str.equals(strJ2)) {
                                throw new RuntimeException("Found setter on " + superclass.getName() + " with invalid case-sensitive name: " + method2.getName());
                            }
                            Method method3 = (Method) this.g.get(strJ2);
                            if (method3 == null) {
                                method2.setAccessible(true);
                                this.g.put(strJ2, method2);
                                f(method2);
                            } else if (!h(method2, method3)) {
                                if (superclass == cls) {
                                    throw new RuntimeException("Class " + cls.getName() + " has multiple setter overloads with name " + method2.getName());
                                }
                                throw new RuntimeException("Found conflicting setters with name: " + method2.getName() + " (conflicts with " + method3.getName() + " defined on " + method3.getDeclaringClass().getName() + ")");
                            }
                        }
                    }
                }
                for (Field field2 : superclass.getDeclaredFields()) {
                    String strI = i(field2);
                    if (this.e.containsKey(strI.toLowerCase(Locale.US)) && !this.h.containsKey(strI)) {
                        field2.setAccessible(true);
                        this.h.put(strI, field2);
                        d(field2);
                    }
                }
                superclass = superclass.getSuperclass();
                if (superclass == null) {
                    break;
                }
            } while (!superclass.equals(Object.class));
            if (this.e.isEmpty()) {
                throw new RuntimeException("No properties to serialize found on class " + cls.getName());
            }
            for (String str2 : this.j) {
                if (!this.g.containsKey(str2) && !this.h.containsKey(str2)) {
                    throw new RuntimeException("@DocumentId is annotated on property " + str2 + " of class " + cls.getName() + " but no field or public setter was found");
                }
            }
        }

        public static String c(AccessibleObject accessibleObject) {
            if (accessibleObject.isAnnotationPresent(InterfaceC5600jA0.class)) {
                return ((InterfaceC5600jA0) accessibleObject.getAnnotation(InterfaceC5600jA0.class)).value();
            }
            return null;
        }

        public static boolean h(Method method, Method method2) {
            AbstractC2173Ru.d(method.getDeclaringClass().isAssignableFrom(method2.getDeclaringClass()), "Expected override from a base class");
            Class<?> returnType = method.getReturnType();
            Class cls = Void.TYPE;
            AbstractC2173Ru.d(returnType.equals(cls), "Expected void return type");
            AbstractC2173Ru.d(method2.getReturnType().equals(cls), "Expected void return type");
            Class<?>[] parameterTypes = method.getParameterTypes();
            Class<?>[] parameterTypes2 = method2.getParameterTypes();
            AbstractC2173Ru.d(parameterTypes.length == 1, "Expected exactly one parameter");
            AbstractC2173Ru.d(parameterTypes2.length == 1, "Expected exactly one parameter");
            return method.getName().equals(method2.getName()) && parameterTypes[0].equals(parameterTypes2[0]);
        }

        public static String i(Field field) {
            String strC = c(field);
            return strC != null ? strC : field.getName();
        }

        public static String j(Method method) {
            String strC = c(method);
            return strC != null ? strC : l(method.getName());
        }

        public static String l(String str) {
            String[] strArr = {"get", "set", "is"};
            String str2 = null;
            for (int i = 0; i < 3; i++) {
                String str3 = strArr[i];
                if (str.startsWith(str3)) {
                    str2 = str3;
                }
            }
            if (str2 == null) {
                throw new IllegalArgumentException("Unknown Bean prefix for method: " + str);
            }
            char[] charArray = str.substring(str2.length()).toCharArray();
            for (int i2 = 0; i2 < charArray.length && Character.isUpperCase(charArray[i2]); i2++) {
                charArray[i2] = Character.toLowerCase(charArray[i2]);
            }
            return new String(charArray);
        }

        public static boolean m(Field field) {
            return (field.getDeclaringClass().equals(Object.class) || !Modifier.isPublic(field.getModifiers()) || Modifier.isStatic(field.getModifiers()) || Modifier.isTransient(field.getModifiers()) || field.isAnnotationPresent(InterfaceC8153sI.class)) ? false : true;
        }

        public static boolean n(Method method) {
            return ((!method.getName().startsWith("get") && !method.getName().startsWith("is")) || method.getDeclaringClass().equals(Object.class) || !Modifier.isPublic(method.getModifiers()) || Modifier.isStatic(method.getModifiers()) || method.getReturnType().equals(Void.TYPE) || method.getParameterTypes().length != 0 || method.isAnnotationPresent(InterfaceC8153sI.class)) ? false : true;
        }

        public static boolean o(Method method) {
            return method.getName().startsWith("set") && !method.getDeclaringClass().equals(Object.class) && !Modifier.isStatic(method.getModifiers()) && method.getReturnType().equals(Void.TYPE) && method.getParameterTypes().length == 1 && !method.isAnnotationPresent(InterfaceC8153sI.class);
        }

        public final void b(String str) {
            Map map = this.e;
            Locale locale = Locale.US;
            String str2 = (String) map.put(str.toLowerCase(locale), str);
            if (str2 == null || str.equals(str2)) {
                return;
            }
            throw new RuntimeException("Found two getters or fields with conflicting case sensitivity for property: " + str.toLowerCase(locale));
        }

        public final void d(Field field) {
            if (field.isAnnotationPresent(InterfaceC3147aQ0.class)) {
                Class<?> type = field.getType();
                if (type != Date.class && type != Timestamp.class) {
                    throw new IllegalArgumentException("Field " + field.getName() + " is annotated with @ServerTimestamp but is " + type + " instead of Date or Timestamp.");
                }
                this.i.add(i(field));
            }
            if (field.isAnnotationPresent(RC.class)) {
                g("Field", "is", field.getType());
                this.j.add(i(field));
            }
        }

        public final void e(Method method) {
            if (method.isAnnotationPresent(InterfaceC3147aQ0.class)) {
                Class<?> returnType = method.getReturnType();
                if (returnType != Date.class && returnType != Timestamp.class) {
                    throw new IllegalArgumentException("Method " + method.getName() + " is annotated with @ServerTimestamp but returns " + returnType + " instead of Date or Timestamp.");
                }
                this.i.add(j(method));
            }
            if (method.isAnnotationPresent(RC.class)) {
                g("Method", "returns", method.getReturnType());
                this.j.add(j(method));
            }
        }

        public final void f(Method method) {
            if (method.isAnnotationPresent(InterfaceC3147aQ0.class)) {
                throw new IllegalArgumentException("Method " + method.getName() + " is annotated with @ServerTimestamp but should not be. @ServerTimestamp can only be applied to fields and getters, not setters.");
            }
            if (method.isAnnotationPresent(RC.class)) {
                g("Method", "accepts", method.getParameterTypes()[0]);
                this.j.add(j(method));
            }
        }

        public final void g(String str, String str2, Type type) {
            if (type == String.class || type == com.google.firebase.firestore.a.class) {
                return;
            }
            throw new IllegalArgumentException(str + " is annotated with @DocumentId but " + str2 + " " + type + " instead of String or DocumentReference.");
        }

        public Map k(Object obj, b bVar) {
            Object objA;
            if (!this.a.isAssignableFrom(obj.getClass())) {
                throw new IllegalArgumentException("Can't serialize object of class " + obj.getClass() + " with BeanMapper for class " + this.a);
            }
            HashMap map = new HashMap();
            for (String str : this.e.values()) {
                if (!this.j.contains(str)) {
                    if (this.f.containsKey(str)) {
                        objA = I8.a((Method) this.f.get(str), obj, new Object[0]);
                    } else {
                        Field field = (Field) this.h.get(str);
                        if (field == null) {
                            throw new IllegalStateException("Bean property without field or getter: " + str);
                        }
                        try {
                            objA = field.get(obj);
                        } catch (IllegalAccessException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    map.put(str, (this.i.contains(str) && objA == null) ? AbstractC8719uK.b() : AbstractC2173Ru.g(objA, bVar.a(str)));
                }
            }
            return map;
        }
    }

    /* JADX INFO: renamed from: com.daaw.Ru$b */
    public static class b {
        public static final b d = new b(null, null, 0);
        public final int a;
        public final b b;
        public final String c;

        public b(b bVar, String str, int i) {
            this.b = bVar;
            this.c = str;
            this.a = i;
        }

        public b a(String str) {
            return new b(this, str, this.a + 1);
        }

        public int b() {
            return this.a;
        }

        public String toString() {
            int i = this.a;
            if (i == 0) {
                return "";
            }
            if (i == 1) {
                return this.c;
            }
            return this.b.toString() + "." + this.c;
        }
    }

    public static Object c(Object obj) {
        return f(obj);
    }

    public static void d(boolean z, String str) {
        if (z) {
            return;
        }
        throw new RuntimeException("Hard assert failed: " + str);
    }

    public static a e(Class cls) {
        ConcurrentMap concurrentMap = a;
        a aVar = (a) concurrentMap.get(cls);
        if (aVar != null) {
            return aVar;
        }
        a aVar2 = new a(cls);
        concurrentMap.put(cls, aVar2);
        return aVar2;
    }

    public static Object f(Object obj) {
        return g(obj, b.d);
    }

    public static Object g(Object obj, b bVar) {
        if (bVar.b() > 500) {
            throw h(bVar, "Exceeded maximum depth of 500, which likely indicates there's an object cycle");
        }
        if (obj == null) {
            return null;
        }
        if (obj instanceof Number) {
            if ((obj instanceof Long) || (obj instanceof Integer) || (obj instanceof Double) || (obj instanceof Float)) {
                return obj;
            }
            throw h(bVar, String.format("Numbers of type %s are not supported, please use an int, long, float or double", obj.getClass().getSimpleName()));
        }
        if ((obj instanceof String) || (obj instanceof Boolean)) {
            return obj;
        }
        if (obj instanceof Character) {
            throw h(bVar, "Characters are not supported, please use Strings");
        }
        if (obj instanceof Map) {
            HashMap map = new HashMap();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                Object key = entry.getKey();
                if (!(key instanceof String)) {
                    throw h(bVar, "Maps with non-string keys are not supported");
                }
                String str = (String) key;
                map.put(str, g(entry.getValue(), bVar.a(str)));
            }
            return map;
        }
        if (!(obj instanceof Collection)) {
            if (obj.getClass().isArray()) {
                throw h(bVar, "Serializing Arrays is not supported, please use Lists instead");
            }
            if (!(obj instanceof Enum)) {
                return ((obj instanceof Date) || (obj instanceof Timestamp) || (obj instanceof C8193sS) || (obj instanceof C2843Yf) || (obj instanceof com.google.firebase.firestore.a) || (obj instanceof AbstractC8719uK)) ? obj : ((obj instanceof Uri) || (obj instanceof URI) || (obj instanceof URL)) ? obj.toString() : e(obj.getClass()).k(obj, bVar);
            }
            String strName = ((Enum) obj).name();
            try {
                return a.i(obj.getClass().getField(strName));
            } catch (NoSuchFieldException unused) {
                return strName;
            }
        }
        if (!(obj instanceof List)) {
            throw h(bVar, "Serializing Collections is not supported, please use Lists instead");
        }
        List list = (List) obj;
        ArrayList arrayList = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            arrayList.add(g(list.get(i), bVar.a("[" + i + "]")));
        }
        return arrayList;
    }

    public static IllegalArgumentException h(b bVar, String str) {
        String str2 = "Could not serialize object. " + str;
        if (bVar.b() > 0) {
            str2 = str2 + " (found in field '" + bVar.toString() + "')";
        }
        return new IllegalArgumentException(str2);
    }
}
