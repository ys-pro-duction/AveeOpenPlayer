package com.daaw;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: com.daaw.Nu1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1737Nu1 extends ByteArrayOutputStream implements AutoCloseable {
    public final C9171vu1 B;

    public C1737Nu1(C9171vu1 c9171vu1, int i) {
        this.B = c9171vu1;
        ((ByteArrayOutputStream) this).buf = c9171vu1.b(Math.max(i, PSKKeyManager.MAX_KEY_LENGTH_BYTES));
    }

    public final void a(int i) {
        int i2 = ((ByteArrayOutputStream) this).count;
        if (i2 + i <= ((ByteArrayOutputStream) this).buf.length) {
            return;
        }
        int i3 = i2 + i;
        byte[] bArrB = this.B.b(i3 + i3);
        System.arraycopy(((ByteArrayOutputStream) this).buf, 0, bArrB, 0, ((ByteArrayOutputStream) this).count);
        this.B.a(((ByteArrayOutputStream) this).buf);
        ((ByteArrayOutputStream) this).buf = bArrB;
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.B.a(((ByteArrayOutputStream) this).buf);
        ((ByteArrayOutputStream) this).buf = null;
        super.close();
    }

    public final void finalize() {
        this.B.a(((ByteArrayOutputStream) this).buf);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public final synchronized void write(int i) {
        a(1);
        super.write(i);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i, int i2) {
        a(i2);
        super.write(bArr, i, i2);
    }
}
