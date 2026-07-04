package com.daaw;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: com.daaw.ms, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6642ms extends FilterInputStream {
    public final long B;
    public int C;

    public C6642ms(InputStream inputStream, long j) {
        super(inputStream);
        this.B = j;
    }

    public static InputStream c(InputStream inputStream, long j) {
        return new C6642ms(inputStream, j);
    }

    public final int a(int i) throws IOException {
        if (i >= 0) {
            this.C += i;
            return i;
        }
        if (this.B - ((long) this.C) <= 0) {
            return i;
        }
        throw new IOException("Failed to read all expected data, expected: " + this.B + ", but read: " + this.C);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() {
        return (int) Math.max(this.B - ((long) this.C), ((FilterInputStream) this).in.available());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() {
        return a(super.read());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(byte[] bArr, int i, int i2) {
        return a(super.read(bArr, i, i2));
    }
}
