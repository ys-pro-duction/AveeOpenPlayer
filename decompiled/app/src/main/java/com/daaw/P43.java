package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public final class P43 {
    public static final boolean a(Object obj) {
        return !((O43) obj).f();
    }

    public static final Object b(Object obj, Object obj2) {
        O43 o43C = (O43) obj;
        O43 o43 = (O43) obj2;
        if (!o43.isEmpty()) {
            if (!o43C.f()) {
                o43C = o43C.c();
            }
            o43C.e(o43);
        }
        return o43C;
    }
}
