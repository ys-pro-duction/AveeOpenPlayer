package com.daaw;

import java.util.Arrays;

/* JADX INFO: renamed from: com.daaw.Lw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1535Lw implements O3 {
    public final boolean a;
    public final int b;
    public final byte[] c;
    public final N3[] d;
    public int e;
    public int f;
    public int g;
    public N3[] h;

    public C1535Lw(boolean z, int i) {
        this(z, i, 0);
    }

    @Override // com.daaw.O3
    public synchronized N3 a() {
        N3 n3;
        try {
            this.f++;
            int i = this.g;
            if (i > 0) {
                N3[] n3Arr = this.h;
                int i2 = i - 1;
                this.g = i2;
                n3 = n3Arr[i2];
                n3Arr[i2] = null;
            } else {
                n3 = new N3(new byte[this.b], 0);
            }
        } catch (Throwable th) {
            throw th;
        }
        return n3;
    }

    @Override // com.daaw.O3
    public synchronized void b() {
        try {
            int i = 0;
            int iMax = Math.max(0, AbstractC6280lb1.f(this.e, this.b) - this.f);
            int i2 = this.g;
            if (iMax >= i2) {
                return;
            }
            if (this.c != null) {
                int i3 = i2 - 1;
                while (i <= i3) {
                    N3[] n3Arr = this.h;
                    N3 n3 = n3Arr[i];
                    byte[] bArr = n3.a;
                    byte[] bArr2 = this.c;
                    if (bArr == bArr2) {
                        i++;
                    } else {
                        N3 n32 = n3Arr[i3];
                        if (n32.a != bArr2) {
                            i3--;
                        } else {
                            n3Arr[i] = n32;
                            n3Arr[i3] = n3;
                            i3--;
                            i++;
                        }
                    }
                }
                iMax = Math.max(iMax, i);
                if (iMax >= this.g) {
                    return;
                }
            }
            Arrays.fill(this.h, iMax, this.g, (Object) null);
            this.g = iMax;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.daaw.O3
    public synchronized void c(N3 n3) {
        N3[] n3Arr = this.d;
        n3Arr[0] = n3;
        d(n3Arr);
    }

    @Override // com.daaw.O3
    public synchronized void d(N3[] n3Arr) {
        try {
            int i = this.g;
            int length = n3Arr.length + i;
            N3[] n3Arr2 = this.h;
            if (length >= n3Arr2.length) {
                this.h = (N3[]) Arrays.copyOf(n3Arr2, Math.max(n3Arr2.length * 2, i + n3Arr.length));
            }
            for (N3 n3 : n3Arr) {
                byte[] bArr = n3.a;
                AbstractC7115ob.a(bArr == this.c || bArr.length == this.b);
                N3[] n3Arr3 = this.h;
                int i2 = this.g;
                this.g = i2 + 1;
                n3Arr3[i2] = n3;
            }
            this.f -= n3Arr.length;
            notifyAll();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.daaw.O3
    public int e() {
        return this.b;
    }

    public synchronized int f() {
        return this.f * this.b;
    }

    public synchronized void g() {
        if (this.a) {
            h(0);
        }
    }

    public synchronized void h(int i) {
        boolean z = i < this.e;
        this.e = i;
        if (z) {
            b();
        }
    }

    public C1535Lw(boolean z, int i, int i2) {
        AbstractC7115ob.a(i > 0);
        AbstractC7115ob.a(i2 >= 0);
        this.a = z;
        this.b = i;
        this.g = i2;
        this.h = new N3[i2 + 100];
        if (i2 > 0) {
            this.c = new byte[i2 * i];
            for (int i3 = 0; i3 < i2; i3++) {
                this.h[i3] = new N3(this.c, i3 * i);
            }
        } else {
            this.c = null;
        }
        this.d = new N3[1];
    }
}
