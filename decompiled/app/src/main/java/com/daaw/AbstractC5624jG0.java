package com.daaw;

import java.util.Collections;

/* JADX INFO: renamed from: com.daaw.jG0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5624jG0 {
    public static final C5906kG0 a;
    public static final J50[] b;

    static {
        C5906kG0 c5906kG0 = null;
        try {
            c5906kG0 = (C5906kG0) C6194lG0.class.newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (c5906kG0 == null) {
            c5906kG0 = new C5906kG0();
        }
        a = c5906kG0;
        b = new J50[0];
    }

    public static InterfaceC8381t60 a(AbstractC9312wR abstractC9312wR) {
        return a.a(abstractC9312wR);
    }

    public static J50 b(Class cls) {
        return a.b(cls);
    }

    public static InterfaceC6429m60 c(Class cls) {
        return a.c(cls, "");
    }

    public static InterfaceC6429m60 d(Class cls, String str) {
        return a.c(cls, str);
    }

    public static F60 e(AbstractC6046km0 abstractC6046km0) {
        return a.d(abstractC6046km0);
    }

    public static InterfaceC7550q70 f(Class cls) {
        return a.i(b(cls), Collections.EMPTY_LIST, true);
    }

    public static X60 g(AbstractC5882kA0 abstractC5882kA0) {
        return a.e(abstractC5882kA0);
    }

    public static InterfaceC3347b70 h(AbstractC6449mA0 abstractC6449mA0) {
        return a.f(abstractC6449mA0);
    }

    public static String i(InterfaceC7353pR interfaceC7353pR) {
        return a.g(interfaceC7353pR);
    }

    public static String j(AbstractC4192e90 abstractC4192e90) {
        return a.h(abstractC4192e90);
    }

    public static InterfaceC7550q70 k(Class cls) {
        return a.i(b(cls), Collections.EMPTY_LIST, false);
    }
}
