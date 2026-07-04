package com.daaw;

import java.io.OutputStream;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: com.daaw.xP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC9583xP implements IE0, AutoCloseable {
    public final IE0 B;

    public AbstractC9583xP(IE0 ie0) {
        this.B = (IE0) AbstractC7785qy0.o(ie0, "buf");
    }

    @Override // com.daaw.IE0
    public IE0 E(int i) {
        return this.B.E(i);
    }

    @Override // com.daaw.IE0
    public int G() {
        return this.B.G();
    }

    @Override // com.daaw.IE0
    public void L0(OutputStream outputStream, int i) {
        this.B.L0(outputStream, i);
    }

    @Override // com.daaw.IE0
    public void a1(ByteBuffer byteBuffer) {
        this.B.a1(byteBuffer);
    }

    @Override // com.daaw.IE0
    public int b() {
        return this.B.b();
    }

    @Override // com.daaw.IE0
    public void i0(byte[] bArr, int i, int i2) {
        this.B.i0(bArr, i, i2);
    }

    @Override // com.daaw.IE0
    public boolean markSupported() {
        return this.B.markSupported();
    }

    @Override // com.daaw.IE0
    public void p(int i) {
        this.B.p(i);
    }

    @Override // com.daaw.IE0
    public void r0() {
        this.B.r0();
    }

    @Override // com.daaw.IE0
    public void reset() {
        this.B.reset();
    }

    public String toString() {
        return AbstractC6329ll0.b(this).d("delegate", this.B).toString();
    }
}
