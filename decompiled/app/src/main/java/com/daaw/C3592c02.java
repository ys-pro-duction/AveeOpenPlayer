package com.daaw;

/* JADX INFO: renamed from: com.daaw.c02, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3592c02 implements InterfaceC5220ho2 {
    public static final C3592c02 a = new C3592c02();

    public static C3592c02 c() {
        return a;
    }

    @Override // com.daaw.InterfaceC5220ho2
    public final InterfaceC8014rn2 a(Class cls) {
        if (!F32.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (InterfaceC8014rn2) F32.g(cls.asSubclass(F32.class)).u(3, null, null);
        } catch (Exception e) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e);
        }
    }

    @Override // com.daaw.InterfaceC5220ho2
    public final boolean b(Class cls) {
        return F32.class.isAssignableFrom(cls);
    }
}
