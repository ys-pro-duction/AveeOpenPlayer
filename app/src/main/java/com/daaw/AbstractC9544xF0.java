package com.daaw;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.xF0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC9544xF0 {
    public static final List a;
    public static final Map b;
    public static final Map c;
    public static final Map d;

    static {
        int i = 0;
        List listN = AbstractC1599Mm.n(AbstractC5624jG0.b(Boolean.TYPE), AbstractC5624jG0.b(Byte.TYPE), AbstractC5624jG0.b(Character.TYPE), AbstractC5624jG0.b(Double.TYPE), AbstractC5624jG0.b(Float.TYPE), AbstractC5624jG0.b(Integer.TYPE), AbstractC5624jG0.b(Long.TYPE), AbstractC5624jG0.b(Short.TYPE));
        a = listN;
        List<J50> list = listN;
        ArrayList arrayList = new ArrayList(AbstractC1703Nm.v(list, 10));
        for (J50 j50 : list) {
            arrayList.add(D61.a(X40.c(j50), X40.d(j50)));
        }
        b = AbstractC1473Lg0.t(arrayList);
        List<J50> list2 = a;
        ArrayList arrayList2 = new ArrayList(AbstractC1703Nm.v(list2, 10));
        for (J50 j502 : list2) {
            arrayList2.add(D61.a(X40.d(j502), X40.c(j502)));
        }
        c = AbstractC1473Lg0.t(arrayList2);
        List listN2 = AbstractC1599Mm.n(LQ.class, NQ.class, InterfaceC3429bR.class, InterfaceC3986dR.class, InterfaceC4553fR.class, InterfaceC5111hR.class, InterfaceC5670jR.class, InterfaceC5949kR.class, InterfaceC6237lR.class, InterfaceC6516mR.class, MQ.class, OQ.class, PQ.class, QQ.class, RQ.class, SQ.class, TQ.class, UQ.class, VQ.class, WQ.class, YQ.class, ZQ.class, InterfaceC3150aR.class);
        ArrayList arrayList3 = new ArrayList(AbstractC1703Nm.v(listN2, 10));
        for (Object obj : listN2) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC1599Mm.u();
            }
            arrayList3.add(D61.a((Class) obj, Integer.valueOf(i)));
            i = i2;
        }
        d = AbstractC1473Lg0.t(arrayList3);
    }

    public static final ParameterizedType a(ParameterizedType parameterizedType) {
        G10.g(parameterizedType, "it");
        Type ownerType = parameterizedType.getOwnerType();
        if (ownerType instanceof ParameterizedType) {
            return (ParameterizedType) ownerType;
        }
        return null;
    }

    public static final KP0 b(ParameterizedType parameterizedType) {
        G10.g(parameterizedType, "it");
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        G10.f(actualTypeArguments, "getActualTypeArguments(...)");
        return AbstractC5431ib.z(actualTypeArguments);
    }

    public static final C6607ml e(Class cls) {
        C6607ml c6607mlE;
        G10.g(cls, "<this>");
        if (cls.isPrimitive()) {
            throw new IllegalArgumentException("Can't compute ClassId for primitive type: " + cls);
        }
        if (cls.isArray()) {
            throw new IllegalArgumentException("Can't compute ClassId for array type: " + cls);
        }
        if (cls.getEnclosingMethod() == null && cls.getEnclosingConstructor() == null) {
            String simpleName = cls.getSimpleName();
            G10.f(simpleName, "getSimpleName(...)");
            if (simpleName.length() != 0) {
                Class<?> declaringClass = cls.getDeclaringClass();
                if (declaringClass != null && (c6607mlE = e(declaringClass)) != null) {
                    C2352Tm0 c2352Tm0L = C2352Tm0.l(cls.getSimpleName());
                    G10.f(c2352Tm0L, "identifier(...)");
                    C6607ml c6607mlD = c6607mlE.d(c2352Tm0L);
                    if (c6607mlD != null) {
                        return c6607mlD;
                    }
                }
                return C6607ml.d.c(new AP(cls.getName()));
            }
        }
        AP ap = new AP(cls.getName());
        AP apE = ap.e();
        G10.f(apE, "parent(...)");
        AP apK = AP.k(ap.g());
        G10.f(apK, "topLevel(...)");
        return new C6607ml(apE, apK, true);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final String f(Class cls) {
        G10.g(cls, "<this>");
        if (!cls.isPrimitive()) {
            if (cls.isArray()) {
                String name = cls.getName();
                G10.f(name, "getName(...)");
                return AY0.r(name, '.', '/', false, 4, null);
            }
            StringBuilder sb = new StringBuilder();
            sb.append('L');
            String name2 = cls.getName();
            G10.f(name2, "getName(...)");
            sb.append(AY0.r(name2, '.', '/', false, 4, null));
            sb.append(';');
            return sb.toString();
        }
        String name3 = cls.getName();
        switch (name3.hashCode()) {
            case -1325958191:
                if (name3.equals("double")) {
                    return "D";
                }
                break;
            case 104431:
                if (name3.equals("int")) {
                    return "I";
                }
                break;
            case 3039496:
                if (name3.equals("byte")) {
                    return "B";
                }
                break;
            case 3052374:
                if (name3.equals("char")) {
                    return "C";
                }
                break;
            case 3327612:
                if (name3.equals("long")) {
                    return "J";
                }
                break;
            case 3625364:
                if (name3.equals("void")) {
                    return "V";
                }
                break;
            case 64711720:
                if (name3.equals("boolean")) {
                    return "Z";
                }
                break;
            case 97526364:
                if (name3.equals("float")) {
                    return "F";
                }
                break;
            case 109413500:
                if (name3.equals("short")) {
                    return "S";
                }
                break;
        }
        throw new IllegalArgumentException("Unsupported primitive type: " + cls);
    }

    public static final Integer g(Class cls) {
        G10.g(cls, "<this>");
        return (Integer) d.get(cls);
    }

    public static final List h(Type type) {
        G10.g(type, "<this>");
        if (!(type instanceof ParameterizedType)) {
            return AbstractC1599Mm.k();
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        if (parameterizedType.getOwnerType() != null) {
            return UP0.A(UP0.r(SP0.i(type, C8986vF0.B), C9265wF0.B));
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        G10.f(actualTypeArguments, "getActualTypeArguments(...)");
        return AbstractC5431ib.h0(actualTypeArguments);
    }

    public static final Class i(Class cls) {
        G10.g(cls, "<this>");
        return (Class) b.get(cls);
    }

    public static final ClassLoader j(Class cls) {
        G10.g(cls, "<this>");
        ClassLoader classLoader = cls.getClassLoader();
        if (classLoader != null) {
            return classLoader;
        }
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        G10.f(systemClassLoader, "getSystemClassLoader(...)");
        return systemClassLoader;
    }

    public static final Class k(Class cls) {
        G10.g(cls, "<this>");
        return (Class) c.get(cls);
    }

    public static final boolean l(Class cls) {
        G10.g(cls, "<this>");
        return Enum.class.isAssignableFrom(cls);
    }
}
