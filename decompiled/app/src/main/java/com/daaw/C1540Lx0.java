package com.daaw;

/* JADX INFO: renamed from: com.daaw.Lx0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1540Lx0 implements InterfaceC1333Jx0 {
    public final Object[] a;
    public int b;

    public C1540Lx0(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.a = new Object[i];
    }

    @Override // com.daaw.InterfaceC1333Jx0
    public boolean a(Object obj) {
        int i = this.b;
        Object[] objArr = this.a;
        if (i >= objArr.length) {
            return false;
        }
        objArr[i] = obj;
        this.b = i + 1;
        return true;
    }

    @Override // com.daaw.InterfaceC1333Jx0
    public Object b() {
        int i = this.b;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        Object[] objArr = this.a;
        Object obj = objArr[i2];
        objArr[i2] = null;
        this.b = i - 1;
        return obj;
    }

    @Override // com.daaw.InterfaceC1333Jx0
    public void c(Object[] objArr, int i) {
        if (i > objArr.length) {
            i = objArr.length;
        }
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = objArr[i2];
            int i3 = this.b;
            Object[] objArr2 = this.a;
            if (i3 < objArr2.length) {
                objArr2[i3] = obj;
                this.b = i3 + 1;
            }
        }
    }
}
