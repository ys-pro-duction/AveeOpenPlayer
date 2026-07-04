package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public abstract class X33 {
    public static final V33 a = new W33();
    public static final V33 b;

    static {
        V33 v33 = null;
        try {
            v33 = (V33) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        b = v33;
    }

    public static V33 a() {
        V33 v33 = b;
        if (v33 != null) {
            return v33;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    public static V33 b() {
        return a;
    }
}
