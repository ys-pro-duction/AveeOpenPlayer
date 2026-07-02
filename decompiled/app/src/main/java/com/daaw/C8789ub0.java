package com.daaw;

import java.io.OutputStream;

/* JADX INFO: renamed from: com.daaw.ub0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8789ub0 extends OutputStream {
    public long B = 0;

    public long a() {
        return this.B;
    }

    @Override // java.io.OutputStream
    public void write(int i) {
        this.B++;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        this.B += (long) bArr.length;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) {
        int i3;
        if (i >= 0 && i <= bArr.length && i2 >= 0 && (i3 = i + i2) <= bArr.length && i3 >= 0) {
            this.B += (long) i2;
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}
