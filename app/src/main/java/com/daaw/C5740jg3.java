package com.daaw;

/* JADX INFO: renamed from: com.daaw.jg3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5740jg3 implements Gg3 {
    public final Gg3[] a;

    public C5740jg3(Gg3... gg3Arr) {
        this.a = gg3Arr;
    }

    @Override // com.daaw.Gg3
    public final Eg3 a(Class cls) {
        Gg3[] gg3Arr = this.a;
        for (int i = 0; i < 2; i++) {
            Gg3 gg3 = gg3Arr[i];
            if (gg3.b(cls)) {
                return gg3.a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.daaw.Gg3
    public final boolean b(Class cls) {
        Gg3[] gg3Arr = this.a;
        for (int i = 0; i < 2; i++) {
            if (gg3Arr[i].b(cls)) {
                return true;
            }
        }
        return false;
    }
}
