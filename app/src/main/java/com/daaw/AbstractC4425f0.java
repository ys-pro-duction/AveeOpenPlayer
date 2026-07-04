package com.daaw;

/* JADX INFO: renamed from: com.daaw.f0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4425f0 implements IE0, AutoCloseable {
    public final int B() {
        a(4);
        return (G() << 24) | (G() << 16) | (G() << 8) | G();
    }

    public final void a(int i) {
        if (b() < i) {
            throw new IndexOutOfBoundsException();
        }
    }

    @Override // com.daaw.IE0
    public boolean markSupported() {
        return false;
    }

    @Override // com.daaw.IE0
    public void reset() {
        throw new UnsupportedOperationException();
    }

    @Override // com.daaw.IE0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // com.daaw.IE0
    public void r0() {
    }
}
