package com.daaw;

/* JADX INFO: renamed from: com.daaw.hS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C5115hS implements InterfaceC1796Oj0 {
    public static final C5115hS a = new C5115hS();

    public static C5115hS c() {
        return a;
    }

    @Override // com.daaw.InterfaceC1796Oj0
    public InterfaceC1692Nj0 a(Class cls) {
        if (!AbstractC5394iS.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: " + cls.getName());
        }
        try {
            return (InterfaceC1692Nj0) AbstractC5394iS.A(cls.asSubclass(AbstractC5394iS.class)).n();
        } catch (Exception e) {
            throw new RuntimeException("Unable to get message info for " + cls.getName(), e);
        }
    }

    @Override // com.daaw.InterfaceC1796Oj0
    public boolean b(Class cls) {
        return AbstractC5394iS.class.isAssignableFrom(cls);
    }
}
