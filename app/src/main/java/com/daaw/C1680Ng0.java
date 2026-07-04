package com.daaw;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: com.daaw.Ng0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1680Ng0 extends FilterInputStream {
    public int B;

    public C1680Ng0(InputStream inputStream) {
        super(inputStream);
        this.B = Integer.MIN_VALUE;
    }

    public final long a(long j) {
        int i = this.B;
        if (i == 0) {
            return -1L;
        }
        return (i == Integer.MIN_VALUE || j <= ((long) i)) ? j : i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() {
        int i = this.B;
        return i == Integer.MIN_VALUE ? super.available() : Math.min(i, super.available());
    }

    public final void c(long j) {
        int i = this.B;
        if (i == Integer.MIN_VALUE || j == -1) {
            return;
        }
        this.B = (int) (((long) i) - j);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int i) {
        super.mark(i);
        this.B = i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        if (a(1L) == -1) {
            return -1;
        }
        int i = super.read();
        c(1L);
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() throws IOException {
        super.reset();
        this.B = Integer.MIN_VALUE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) throws IOException {
        long jA = a(j);
        if (jA == -1) {
            return -1L;
        }
        long jSkip = super.skip(jA);
        c(jSkip);
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int iA = (int) a(i2);
        if (iA == -1) {
            return -1;
        }
        int i3 = super.read(bArr, i, iA);
        c(i3);
        return i3;
    }
}
