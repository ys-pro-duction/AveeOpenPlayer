package com.daaw;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: com.daaw.Eu1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0802Eu1 extends FilterInputStream {
    public final long B;
    public long C;

    public C0802Eu1(InputStream inputStream, long j) {
        super(inputStream);
        this.B = j;
    }

    public final long a() {
        return this.B - this.C;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        int i = super.read();
        if (i != -1) {
            this.C++;
        }
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = super.read(bArr, i, i2);
        if (i3 != -1) {
            this.C += (long) i3;
        }
        return i3;
    }
}
