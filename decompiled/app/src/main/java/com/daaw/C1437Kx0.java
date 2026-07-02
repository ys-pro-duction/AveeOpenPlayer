package com.daaw;

/* JADX INFO: renamed from: com.daaw.Kx0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1437Kx0 implements InterfaceC1229Ix0 {
    public final Object[] a;
    public int b;

    public C1437Kx0(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.a = new Object[i];
    }

    @Override // com.daaw.InterfaceC1229Ix0
    public boolean a(Object obj) {
        G10.g(obj, "instance");
        if (c(obj)) {
            throw new IllegalStateException("Already in the pool!");
        }
        int i = this.b;
        Object[] objArr = this.a;
        if (i >= objArr.length) {
            return false;
        }
        objArr[i] = obj;
        this.b = i + 1;
        return true;
    }

    @Override // com.daaw.InterfaceC1229Ix0
    public Object b() {
        int i = this.b;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        Object obj = this.a[i2];
        G10.e(obj, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
        this.a[i2] = null;
        this.b--;
        return obj;
    }

    public final boolean c(Object obj) {
        int i = this.b;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.a[i2] == obj) {
                return true;
            }
        }
        return false;
    }
}
