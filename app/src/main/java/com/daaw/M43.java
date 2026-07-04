package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public final class M43 implements S43 {
    public final S43[] a;

    public M43(S43... s43Arr) {
        this.a = s43Arr;
    }

    @Override // com.daaw.S43
    public final R43 a(Class cls) {
        for (int i = 0; i < 2; i++) {
            S43 s43 = this.a[i];
            if (s43.b(cls)) {
                return s43.a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.daaw.S43
    public final boolean b(Class cls) {
        for (int i = 0; i < 2; i++) {
            if (this.a[i].b(cls)) {
                return true;
            }
        }
        return false;
    }
}
