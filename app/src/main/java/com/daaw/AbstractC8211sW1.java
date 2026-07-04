package com.daaw;

/* JADX INFO: renamed from: com.daaw.sW1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC8211sW1 {
    public static final AbstractC4850gV1 a = new MV1();
    public static final AbstractC4850gV1 b;

    static {
        AbstractC4850gV1 abstractC4850gV1 = null;
        try {
            abstractC4850gV1 = (AbstractC4850gV1) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        b = abstractC4850gV1;
    }

    public static AbstractC4850gV1 a() {
        AbstractC4850gV1 abstractC4850gV1 = b;
        if (abstractC4850gV1 != null) {
            return abstractC4850gV1;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    public static AbstractC4850gV1 b() {
        return a;
    }
}
