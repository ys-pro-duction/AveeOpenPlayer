package com.daaw;

/* JADX INFO: renamed from: com.daaw.Mm2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1602Mm2 {
    public static final C5488im2 a;
    public static final C5488im2 b;

    static {
        C5488im2 c5488im2 = null;
        try {
            c5488im2 = (C5488im2) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = c5488im2;
        b = new C5488im2();
    }

    public static C5488im2 a() {
        return a;
    }

    public static C5488im2 b() {
        return b;
    }
}
