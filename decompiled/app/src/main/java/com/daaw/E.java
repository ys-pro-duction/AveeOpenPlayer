package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public abstract class E {
    public boolean a;

    public E(boolean z) {
        this.a = z;
    }

    public final void a(byte[] bArr) {
        if (!this.a || AbstractC6308lh.i(bArr) <= 0) {
            b(bArr);
        } else {
            b(AbstractC6308lh.j(bArr));
        }
    }

    public abstract void b(byte[] bArr);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.a == ((E) obj).a;
    }

    public int hashCode() {
        return 31 + (this.a ? 1231 : 1237);
    }
}
