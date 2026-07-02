package com.daaw;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: com.daaw.t33, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8369t33 extends OutputStream {
    public static final byte[] G = new byte[0];
    public int D;
    public int F;
    public final int B = 128;
    public final ArrayList C = new ArrayList();
    public byte[] E = new byte[128];

    public C8369t33(int i) {
    }

    public final synchronized int a() {
        return this.D + this.F;
    }

    public final synchronized AbstractC9213w33 c() {
        try {
            int i = this.F;
            byte[] bArr = this.E;
            if (i >= bArr.length) {
                this.C.add(new C8090s33(this.E));
                this.E = G;
            } else if (i > 0) {
                this.C.add(new C8090s33(Arrays.copyOf(bArr, i)));
            }
            this.D += this.F;
            this.F = 0;
        } catch (Throwable th) {
            throw th;
        }
        return AbstractC9213w33.S(this.C);
    }

    public final synchronized void d() {
        this.C.clear();
        this.D = 0;
        this.F = 0;
    }

    public final void j(int i) {
        this.C.add(new C8090s33(this.E));
        int length = this.D + this.E.length;
        this.D = length;
        this.E = new byte[Math.max(this.B, Math.max(i, length >>> 1))];
        this.F = 0;
    }

    public final String toString() {
        return String.format("<ByteString.Output@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(a()));
    }

    @Override // java.io.OutputStream
    public final synchronized void write(int i) {
        try {
            if (this.F == this.E.length) {
                j(1);
            }
            byte[] bArr = this.E;
            int i2 = this.F;
            this.F = i2 + 1;
            bArr[i2] = (byte) i;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i, int i2) {
        byte[] bArr2 = this.E;
        int length = bArr2.length;
        int i3 = this.F;
        int i4 = length - i3;
        if (i2 <= i4) {
            System.arraycopy(bArr, i, bArr2, i3, i2);
            this.F += i2;
            return;
        }
        System.arraycopy(bArr, i, bArr2, i3, i4);
        int i5 = i2 - i4;
        j(i5);
        System.arraycopy(bArr, i + i4, this.E, 0, i5);
        this.F = i5;
    }
}
