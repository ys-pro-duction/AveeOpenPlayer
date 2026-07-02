package com.daaw;

import java.io.Closeable;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public interface IE0 extends Closeable {
    IE0 E(int i);

    int G();

    void L0(OutputStream outputStream, int i);

    void a1(ByteBuffer byteBuffer);

    int b();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    void i0(byte[] bArr, int i, int i2);

    boolean markSupported();

    void p(int i);

    void r0();

    void reset();
}
