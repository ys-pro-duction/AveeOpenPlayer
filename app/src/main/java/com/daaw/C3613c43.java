package com.daaw;

/* JADX INFO: renamed from: com.daaw.c43, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3613c43 implements S43 {
    public static final C3613c43 a = new C3613c43();

    public static C3613c43 c() {
        return a;
    }

    @Override // com.daaw.S43
    public final R43 a(Class cls) {
        if (!AbstractC4449f43.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (R43) AbstractC4449f43.l(cls.asSubclass(AbstractC4449f43.class)).J(3, null, null);
        } catch (Exception e) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e);
        }
    }

    @Override // com.daaw.S43
    public final boolean b(Class cls) {
        return AbstractC4449f43.class.isAssignableFrom(cls);
    }
}
