package com.daaw;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class Ls3 {
    public int a;
    public int b;
    public int c = 0;
    public Es3[] d = new Es3[100];

    public Ls3(boolean z, int i) {
    }

    public final synchronized int a() {
        return this.b * 65536;
    }

    public final synchronized Es3 b() {
        Es3 es3;
        try {
            this.b++;
            int i = this.c;
            if (i > 0) {
                Es3[] es3Arr = this.d;
                int i2 = i - 1;
                this.c = i2;
                es3 = es3Arr[i2];
                if (es3 == null) {
                    throw null;
                }
                es3Arr[i2] = null;
            } else {
                es3 = new Es3(new byte[65536], 0);
                int i3 = this.b;
                Es3[] es3Arr2 = this.d;
                int length = es3Arr2.length;
                if (i3 > length) {
                    this.d = (Es3[]) Arrays.copyOf(es3Arr2, length + length);
                    return es3;
                }
            }
            return es3;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void c(Es3 es3) {
        Es3[] es3Arr = this.d;
        int i = this.c;
        this.c = i + 1;
        es3Arr[i] = es3;
        this.b--;
        notifyAll();
    }

    public final synchronized void d(Fs3 fs3) {
        while (fs3 != null) {
            try {
                Es3[] es3Arr = this.d;
                int i = this.c;
                this.c = i + 1;
                es3Arr[i] = fs3.zzc();
                this.b--;
                fs3 = fs3.zzd();
            } catch (Throwable th) {
                throw th;
            }
        }
        notifyAll();
    }

    public final synchronized void e() {
        f(0);
    }

    public final synchronized void f(int i) {
        int i2 = this.a;
        this.a = i;
        if (i < i2) {
            g();
        }
    }

    public final synchronized void g() {
        int i = this.a;
        int i2 = AbstractC9004vJ2.a;
        int iMax = Math.max(0, ((i + 65535) / 65536) - this.b);
        int i3 = this.c;
        if (iMax >= i3) {
            return;
        }
        Arrays.fill(this.d, iMax, i3, (Object) null);
        this.c = iMax;
    }
}
