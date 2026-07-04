package com.daaw;

/* JADX INFO: renamed from: com.daaw.qJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7600qJ {
    public static final AbstractC7042oJ a = new C7321pJ();
    public static final AbstractC7042oJ b = c();

    public static AbstractC7042oJ a() {
        AbstractC7042oJ abstractC7042oJ = b;
        if (abstractC7042oJ != null) {
            return abstractC7042oJ;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    public static AbstractC7042oJ b() {
        return a;
    }

    public static AbstractC7042oJ c() {
        try {
            return (AbstractC7042oJ) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
