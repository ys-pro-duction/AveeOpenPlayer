package com.daaw;

import java.io.InputStream;

/* JADX INFO: renamed from: com.daaw.Xv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2803Xv extends InputStream implements AutoCloseable {
    public final InterfaceC2595Vv B;
    public final C2907Yv C;
    public long G;
    public boolean E = false;
    public boolean F = false;
    public final byte[] D = new byte[1];

    public C2803Xv(InterfaceC2595Vv interfaceC2595Vv, C2907Yv c2907Yv) {
        this.B = interfaceC2595Vv;
        this.C = c2907Yv;
    }

    public long a() {
        return this.G;
    }

    public final void c() {
        if (this.E) {
            return;
        }
        this.B.d(this.C);
        this.E = true;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.F) {
            return;
        }
        this.B.close();
        this.F = true;
    }

    public void d() {
        c();
    }

    @Override // java.io.InputStream
    public int read() {
        if (read(this.D) == -1) {
            return -1;
        }
        return this.D[0] & 255;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        AbstractC7115ob.f(!this.F);
        c();
        int iC = this.B.c(bArr, i, i2);
        if (iC == -1) {
            return -1;
        }
        this.G += (long) iC;
        return iC;
    }
}
