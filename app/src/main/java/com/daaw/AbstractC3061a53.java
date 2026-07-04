package com.daaw;

/* JADX INFO: renamed from: com.daaw.a53, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3061a53 {
    public static final Z43 a;
    public static final Z43 b;

    static {
        Z43 z43 = null;
        try {
            z43 = (Z43) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = z43;
        b = new Z43();
    }

    public static Z43 a() {
        return a;
    }

    public static Z43 b() {
        return b;
    }
}
