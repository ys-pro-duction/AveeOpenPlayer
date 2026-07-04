package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Q43 {
    public static final P43 a;
    public static final P43 b;

    static {
        P43 p43 = null;
        try {
            p43 = (P43) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = p43;
        b = new P43();
    }

    public static P43 a() {
        return a;
    }

    public static P43 b() {
        return b;
    }
}
