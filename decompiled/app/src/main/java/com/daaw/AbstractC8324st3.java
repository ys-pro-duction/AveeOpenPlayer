package com.daaw;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: com.daaw.st3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC8324st3 {
    public static Constructor a;
    public static Method b;
    public static Method c;

    public static InterfaceC5783jp1 a(float f) {
        try {
            if (a == null || b == null || c == null) {
                Class<?> cls = Class.forName("androidx.media3.effect.ScaleAndRotateTransformation$Builder");
                a = cls.getConstructor(null);
                b = cls.getMethod("setRotationDegrees", Float.TYPE);
                c = cls.getMethod("build", null);
            }
            Object objNewInstance = a.newInstance(null);
            b.invoke(objNewInstance, Float.valueOf(f));
            Object objInvoke = c.invoke(objNewInstance, null);
            if (objInvoke == null) {
                throw null;
            }
            AbstractC6314li0.a(objInvoke);
            return null;
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }
}
