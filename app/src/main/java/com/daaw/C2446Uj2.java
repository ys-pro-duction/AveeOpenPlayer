package com.daaw;

/* JADX INFO: renamed from: com.daaw.Uj2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2446Uj2 implements InterfaceC5220ho2 {
    public final InterfaceC5220ho2[] a;

    public C2446Uj2(InterfaceC5220ho2... interfaceC5220ho2Arr) {
        this.a = interfaceC5220ho2Arr;
    }

    @Override // com.daaw.InterfaceC5220ho2
    public final InterfaceC8014rn2 a(Class cls) {
        for (int i = 0; i < 2; i++) {
            InterfaceC5220ho2 interfaceC5220ho2 = this.a[i];
            if (interfaceC5220ho2.b(cls)) {
                return interfaceC5220ho2.a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.daaw.InterfaceC5220ho2
    public final boolean b(Class cls) {
        for (int i = 0; i < 2; i++) {
            if (this.a[i].b(cls)) {
                return true;
            }
        }
        return false;
    }
}
