package com.daaw;

/* JADX INFO: renamed from: com.daaw.Vn0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2564Vn0 {
    public static final InterfaceC2356Tn0 a = c();
    public static final InterfaceC2356Tn0 b = new C2460Un0();

    public static InterfaceC2356Tn0 a() {
        return a;
    }

    public static InterfaceC2356Tn0 b() {
        return b;
    }

    public static InterfaceC2356Tn0 c() {
        try {
            return (InterfaceC2356Tn0) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
