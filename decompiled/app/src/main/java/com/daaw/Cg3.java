package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Cg3 {
    public static final Ag3 a;
    public static final Ag3 b;

    static {
        Ag3 ag3 = null;
        try {
            ag3 = (Ag3) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = ag3;
        b = new Ag3();
    }

    public static Ag3 a() {
        return a;
    }

    public static Ag3 b() {
        return b;
    }
}
