package com.daaw;

import java.lang.reflect.Field;

/* JADX INFO: renamed from: com.daaw.ow, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7218ow {
    public static final void a(int i, int i2) {
        if (i2 <= i) {
            return;
        }
        throw new IllegalStateException(("Debug metadata version mismatch. Expected: " + i + ", got " + i2 + ". Please update the Kotlin standard library.").toString());
    }

    public static final InterfaceC6939nw b(AbstractC7409pe abstractC7409pe) {
        return (InterfaceC6939nw) abstractC7409pe.getClass().getAnnotation(InterfaceC6939nw.class);
    }

    public static final int c(AbstractC7409pe abstractC7409pe) {
        try {
            Field declaredField = abstractC7409pe.getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(abstractC7409pe);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            return (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            return -1;
        }
    }

    public static final StackTraceElement d(AbstractC7409pe abstractC7409pe) {
        String strC;
        G10.g(abstractC7409pe, "<this>");
        InterfaceC6939nw interfaceC6939nwB = b(abstractC7409pe);
        if (interfaceC6939nwB == null) {
            return null;
        }
        a(1, interfaceC6939nwB.v());
        int iC = c(abstractC7409pe);
        int i = iC < 0 ? -1 : interfaceC6939nwB.l()[iC];
        String strB = C4356el0.a.b(abstractC7409pe);
        if (strB == null) {
            strC = interfaceC6939nwB.c();
        } else {
            strC = strB + '/' + interfaceC6939nwB.c();
        }
        return new StackTraceElement(strC, interfaceC6939nwB.m(), interfaceC6939nwB.f(), i);
    }
}
