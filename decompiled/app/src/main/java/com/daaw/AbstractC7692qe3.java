package com.daaw;

/* JADX INFO: renamed from: com.daaw.qe3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7692qe3 {
    public static final AbstractC6009ke3 a = new C6855ne3();
    public static final AbstractC6009ke3 b;

    static {
        AbstractC6009ke3 abstractC6009ke3 = null;
        try {
            abstractC6009ke3 = (AbstractC6009ke3) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        b = abstractC6009ke3;
    }

    public static AbstractC6009ke3 a() {
        AbstractC6009ke3 abstractC6009ke3 = b;
        if (abstractC6009ke3 != null) {
            return abstractC6009ke3;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    public static AbstractC6009ke3 b() {
        return a;
    }
}
