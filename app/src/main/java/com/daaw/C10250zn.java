package com.daaw;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: renamed from: com.daaw.zn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C10250zn {
    public static final C10250zn a = new C10250zn();

    public final int a(int i, int i2) {
        if (i == 0) {
            return 1;
        }
        return (int) Math.ceil(((double) (i + i2)) / 15.0d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean b(Class[] clsArr, Class[] clsArr2) {
        if (clsArr.length == clsArr2.length) {
            ArrayList arrayList = new ArrayList(clsArr.length);
            int length = clsArr.length;
            int i = 0;
            int i2 = 0;
            while (i < length) {
                arrayList.add(Boolean.valueOf(clsArr[i].isAssignableFrom(clsArr2[i2])));
                i++;
                i2++;
            }
            if (arrayList.isEmpty()) {
                return true;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (!((Boolean) it.next()).booleanValue()) {
                }
            }
            return true;
        }
        return false;
    }

    public final int c(int i) {
        return (int) Math.ceil(((double) i) / 31.0d);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00ac A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.reflect.Method d(java.lang.Class r9, java.lang.String r10, java.lang.Object... r11) throws java.lang.NoSuchMethodException {
        /*
            Method dump skipped, instruction units count: 203
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C10250zn.d(java.lang.Class, java.lang.String, java.lang.Object[]):java.lang.reflect.Method");
    }

    public final Method e(Class cls, String str, Class... clsArr) throws NoSuchMethodException {
        Method method;
        Class[] clsArr2 = (Class[]) Arrays.copyOf(clsArr, clsArr.length);
        Method[] declaredMethods = cls.getDeclaredMethods();
        G10.f(declaredMethods, "declaredMethods");
        int length = declaredMethods.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                method = null;
                break;
            }
            method = declaredMethods[i];
            if (G10.c(str, method.getName())) {
                C10250zn c10250zn = a;
                Class<?>[] parameterTypes = method.getParameterTypes();
                G10.f(parameterTypes, "it.parameterTypes");
                if (c10250zn.b(parameterTypes, clsArr2)) {
                    break;
                }
            }
            i++;
        }
        if (method != null) {
            return method;
        }
        throw new NoSuchMethodException(G10.n(str, " not found"));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final Object f(Class cls) {
        String name = cls.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (name.equals("double")) {
                    return Double.valueOf(0.0d);
                }
                return null;
            case 104431:
                return !name.equals("int") ? null : 0;
            case 3039496:
                return !name.equals("byte") ? null : (byte) 0;
            case 3052374:
                return !name.equals("char") ? null : '0';
            case 3327612:
                return !name.equals("long") ? null : 0L;
            case 64711720:
                if (name.equals("boolean")) {
                    return Boolean.FALSE;
                }
                return null;
            case 97526364:
                if (name.equals("float")) {
                    return Float.valueOf(0.0f);
                }
                return null;
            case 109413500:
                return !name.equals("short") ? null : (short) 0;
            default:
                return null;
        }
    }

    public final Object g(Method method, Object obj, InterfaceC5781jp interfaceC5781jp, Object... objArr) {
        Object objF;
        Class<?>[] parameterTypes = method.getParameterTypes();
        G10.f(parameterTypes, "parameterTypes");
        int i = -1;
        int length = parameterTypes.length - 1;
        while (true) {
            if (length < 0) {
                break;
            }
            if (G10.c(parameterTypes[length], InterfaceC5781jp.class)) {
                i = length;
                break;
            }
            length--;
        }
        int i2 = i + 1;
        int iA = a(i, obj != null ? 1 : 0) + i2;
        int length2 = method.getParameterTypes().length;
        if (!((length2 != iA ? c(i) : 0) + iA == length2)) {
            throw new IllegalStateException("Check failed.");
        }
        Object[] objArr2 = new Object[length2];
        for (int i3 = 0; i3 < length2; i3++) {
            if (i3 < 0 || i3 >= i) {
                if (i3 == i) {
                    objF = interfaceC5781jp;
                } else if (i2 <= i3 && i3 < iA) {
                    objF = 0;
                } else {
                    if (iA > i3 || i3 >= length2) {
                        throw new IllegalStateException("Unexpected index");
                    }
                    objF = 2097151;
                }
            } else if (i3 < 0 || i3 > AbstractC5431ib.H(objArr)) {
                C10250zn c10250zn = a;
                Class<?> cls = method.getParameterTypes()[i3];
                G10.f(cls, "parameterTypes[idx]");
                objF = c10250zn.f(cls);
            } else {
                objF = objArr[i3];
            }
            objArr2[i3] = objF;
        }
        return method.invoke(obj, Arrays.copyOf(objArr2, length2));
    }

    public final void h(String str, String str2, InterfaceC5781jp interfaceC5781jp, Object... objArr) throws ClassNotFoundException {
        G10.g(str, "className");
        G10.g(str2, "methodName");
        G10.g(interfaceC5781jp, "composer");
        G10.g(objArr, "args");
        try {
            Class<?> cls = Class.forName(str);
            G10.f(cls, "composableClass");
            Method methodD = d(cls, str2, Arrays.copyOf(objArr, objArr.length));
            methodD.setAccessible(true);
            if (Modifier.isStatic(methodD.getModifiers())) {
                g(methodD, null, interfaceC5781jp, Arrays.copyOf(objArr, objArr.length));
            } else {
                g(methodD, cls.getConstructor(null).newInstance(null), interfaceC5781jp, Arrays.copyOf(objArr, objArr.length));
            }
        } catch (ReflectiveOperationException e) {
            throw new ClassNotFoundException("Composable Method '" + str + '.' + str2 + "' not found", e);
        }
    }
}
