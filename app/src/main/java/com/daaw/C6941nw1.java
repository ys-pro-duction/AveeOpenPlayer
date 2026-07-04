package com.daaw;

import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: com.daaw.nw1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6941nw1 {
    public final byte[] a = new byte[PSKKeyManager.MAX_KEY_LENGTH_BYTES];
    public int b;
    public int c;

    public C6941nw1(byte[] bArr) {
        for (int i = 0; i < 256; i++) {
            this.a[i] = (byte) i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < 256; i3++) {
            byte[] bArr2 = this.a;
            byte b = bArr2[i3];
            i2 = (i2 + b + bArr[i3 % bArr.length]) & 255;
            bArr2[i3] = bArr2[i2];
            bArr2[i2] = b;
        }
        this.b = 0;
        this.c = 0;
    }

    public final void a(byte[] bArr) {
        int i = this.b;
        int i2 = this.c;
        for (int i3 = 0; i3 < 256; i3++) {
            byte[] bArr2 = this.a;
            i = (i + 1) & 255;
            byte b = bArr2[i];
            i2 = (i2 + b) & 255;
            bArr2[i] = bArr2[i2];
            bArr2[i2] = b;
            bArr[i3] = (byte) (bArr2[(bArr2[i] + b) & 255] ^ bArr[i3]);
        }
        this.b = i;
        this.c = i2;
    }
}
