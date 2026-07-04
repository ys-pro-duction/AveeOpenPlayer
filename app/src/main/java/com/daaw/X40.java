package com.daaw;

import java.lang.annotation.Annotation;

/* JADX INFO: loaded from: classes3.dex */
public abstract class X40 {
    public static final J50 a(Annotation annotation) {
        G10.g(annotation, "<this>");
        Class<? extends Annotation> clsAnnotationType = annotation.annotationType();
        G10.f(clsAnnotationType, "annotationType(...)");
        J50 j50E = e(clsAnnotationType);
        G10.e(j50E, "null cannot be cast to non-null type kotlin.reflect.KClass<out T of kotlin.jvm.JvmClassMappingKt.<get-annotationClass>>");
        return j50E;
    }

    public static final Class b(J50 j50) {
        G10.g(j50, "<this>");
        Class clsB = ((InterfaceC2967Zk) j50).b();
        G10.e(clsB, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return clsB;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final Class c(J50 j50) {
        G10.g(j50, "<this>");
        Class clsB = ((InterfaceC2967Zk) j50).b();
        if (!clsB.isPrimitive()) {
            G10.e(clsB, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
            return clsB;
        }
        String name = clsB.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (name.equals("double")) {
                    clsB = Double.class;
                }
                break;
            case 104431:
                if (name.equals("int")) {
                    clsB = Integer.class;
                }
                break;
            case 3039496:
                if (name.equals("byte")) {
                    clsB = Byte.class;
                }
                break;
            case 3052374:
                if (name.equals("char")) {
                    clsB = Character.class;
                }
                break;
            case 3327612:
                if (name.equals("long")) {
                    clsB = Long.class;
                }
                break;
            case 3625364:
                if (name.equals("void")) {
                    clsB = Void.class;
                }
                break;
            case 64711720:
                if (name.equals("boolean")) {
                    clsB = Boolean.class;
                }
                break;
            case 97526364:
                if (name.equals("float")) {
                    clsB = Float.class;
                }
                break;
            case 109413500:
                if (name.equals("short")) {
                    clsB = Short.class;
                }
                break;
        }
        G10.e(clsB, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
        return clsB;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final Class d(J50 j50) {
        G10.g(j50, "<this>");
        Class clsB = ((InterfaceC2967Zk) j50).b();
        if (clsB.isPrimitive()) {
            G10.e(clsB, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaPrimitiveType>>");
            return clsB;
        }
        String name = clsB.getName();
        switch (name.hashCode()) {
            case -2056817302:
                if (name.equals("java.lang.Integer")) {
                    return Integer.TYPE;
                }
                return null;
            case -527879800:
                if (name.equals("java.lang.Float")) {
                    return Float.TYPE;
                }
                return null;
            case -515992664:
                if (name.equals("java.lang.Short")) {
                    return Short.TYPE;
                }
                return null;
            case 155276373:
                if (name.equals("java.lang.Character")) {
                    return Character.TYPE;
                }
                return null;
            case 344809556:
                if (name.equals("java.lang.Boolean")) {
                    return Boolean.TYPE;
                }
                return null;
            case 398507100:
                if (name.equals("java.lang.Byte")) {
                    return Byte.TYPE;
                }
                return null;
            case 398795216:
                if (name.equals("java.lang.Long")) {
                    return Long.TYPE;
                }
                return null;
            case 399092968:
                if (name.equals("java.lang.Void")) {
                    return Void.TYPE;
                }
                return null;
            case 761287205:
                if (name.equals("java.lang.Double")) {
                    return Double.TYPE;
                }
                return null;
            default:
                return null;
        }
    }

    public static final J50 e(Class cls) {
        G10.g(cls, "<this>");
        return AbstractC5624jG0.b(cls);
    }
}
