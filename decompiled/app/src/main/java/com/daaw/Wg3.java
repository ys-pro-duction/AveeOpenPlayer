package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Wg3 {
    public static final Ug3 a;
    public static final Ug3 b;

    static {
        Ug3 ug3 = null;
        try {
            ug3 = (Ug3) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = ug3;
        b = new Ug3();
    }

    public static Ug3 a() {
        return a;
    }

    public static Ug3 b() {
        return b;
    }
}
