package com.daaw;

/* JADX INFO: renamed from: com.daaw.Dg0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0641Dg0 {
    public static final InterfaceC0424Bg0 a = c();
    public static final InterfaceC0424Bg0 b = new C0528Cg0();

    public static InterfaceC0424Bg0 a() {
        return a;
    }

    public static InterfaceC0424Bg0 b() {
        return b;
    }

    public static InterfaceC0424Bg0 c() {
        try {
            return (InterfaceC0424Bg0) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
