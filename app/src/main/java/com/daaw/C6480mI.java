package com.daaw;

import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;

/* JADX INFO: renamed from: com.daaw.mI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C6480mI extends InputStream implements AutoCloseable {
    public static final Queue D = AbstractC6559mb1.d(0);
    public InputStream B;
    public IOException C;

    public static C6480mI c(InputStream inputStream) {
        C6480mI c6480mI;
        Queue queue = D;
        synchronized (queue) {
            c6480mI = (C6480mI) queue.poll();
        }
        if (c6480mI == null) {
            c6480mI = new C6480mI();
        }
        c6480mI.j(inputStream);
        return c6480mI;
    }

    public IOException a() {
        return this.C;
    }

    @Override // java.io.InputStream
    public int available() {
        return this.B.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.B.close();
    }

    public void d() {
        this.C = null;
        this.B = null;
        Queue queue = D;
        synchronized (queue) {
            queue.offer(this);
        }
    }

    public void j(InputStream inputStream) {
        this.B = inputStream;
    }

    @Override // java.io.InputStream
    public void mark(int i) {
        this.B.mark(i);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.B.markSupported();
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        try {
            return this.B.read(bArr);
        } catch (IOException e) {
            this.C = e;
            return -1;
        }
    }

    @Override // java.io.InputStream
    public synchronized void reset() {
        this.B.reset();
    }

    @Override // java.io.InputStream
    public long skip(long j) {
        try {
            return this.B.skip(j);
        } catch (IOException e) {
            this.C = e;
            return 0L;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        try {
            return this.B.read(bArr, i, i2);
        } catch (IOException e) {
            this.C = e;
            return -1;
        }
    }

    @Override // java.io.InputStream
    public int read() {
        try {
            return this.B.read();
        } catch (IOException e) {
            this.C = e;
            return -1;
        }
    }
}
