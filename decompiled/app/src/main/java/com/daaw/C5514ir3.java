package com.daaw;

import android.util.SparseArray;

/* JADX INFO: renamed from: com.daaw.ir3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5514ir3 {
    public final InterfaceC1714No2 c;
    public final SparseArray b = new SparseArray();
    public int a = -1;

    public C5514ir3(InterfaceC1714No2 interfaceC1714No2) {
        this.c = interfaceC1714No2;
    }

    public final Object a(int i) {
        if (this.a == -1) {
            this.a = 0;
        }
        while (true) {
            int i2 = this.a;
            if (i2 <= 0 || i >= this.b.keyAt(i2)) {
                break;
            }
            this.a--;
        }
        while (this.a < this.b.size() - 1 && i >= this.b.keyAt(this.a + 1)) {
            this.a++;
        }
        return this.b.valueAt(this.a);
    }

    public final Object b() {
        return this.b.valueAt(this.b.size() - 1);
    }

    public final void c(int i, Object obj) {
        if (this.a == -1) {
            AbstractC6048km2.f(this.b.size() == 0);
            this.a = 0;
        }
        if (this.b.size() > 0) {
            int iKeyAt = this.b.keyAt(r0.size() - 1);
            AbstractC6048km2.d(i >= iKeyAt);
            if (iKeyAt == i) {
                C3832cr3.D((C3275ar3) this.b.valueAt(r0.size() - 1));
            }
        }
        this.b.append(i, obj);
    }

    public final void d() {
        for (int i = 0; i < this.b.size(); i++) {
            C3832cr3.D((C3275ar3) this.b.valueAt(i));
        }
        this.a = -1;
        this.b.clear();
    }

    public final void e(int i) {
        int i2 = 0;
        while (i2 < this.b.size() - 1) {
            int i3 = i2 + 1;
            if (i < this.b.keyAt(i3)) {
                return;
            }
            C3832cr3.D((C3275ar3) this.b.valueAt(i2));
            this.b.removeAt(i2);
            int i4 = this.a;
            if (i4 > 0) {
                this.a = i4 - 1;
            }
            i2 = i3;
        }
    }

    public final boolean f() {
        return this.b.size() == 0;
    }
}
