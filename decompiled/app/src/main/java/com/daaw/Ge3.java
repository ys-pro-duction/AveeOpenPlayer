package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public final class Ge3 implements Gg3 {
    public static final Ge3 a = new Ge3();

    public static Ge3 c() {
        return a;
    }

    @Override // com.daaw.Gg3
    public final Eg3 a(Class cls) {
        if (!AbstractC3772cf3.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (Eg3) AbstractC3772cf3.k(cls.asSubclass(AbstractC3772cf3.class)).A(3, null, null);
        } catch (Exception e) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e);
        }
    }

    @Override // com.daaw.Gg3
    public final boolean b(Class cls) {
        return AbstractC3772cf3.class.isAssignableFrom(cls);
    }
}
