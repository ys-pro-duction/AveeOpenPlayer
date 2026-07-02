package com.daaw;

/* JADX INFO: renamed from: com.daaw.ut2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC8881ut2 {
    public static final C2064Qs2 a;
    public static final C2064Qs2 b;

    static {
        C2064Qs2 c2064Qs2 = null;
        try {
            c2064Qs2 = (C2064Qs2) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = c2064Qs2;
        b = new C2064Qs2();
    }

    public static C2064Qs2 a() {
        return a;
    }

    public static C2064Qs2 b() {
        return b;
    }
}
