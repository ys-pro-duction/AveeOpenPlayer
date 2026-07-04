package com.daaw;

import android.media.MediaCodec;

/* JADX INFO: renamed from: com.daaw.Fu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0904Fu {
    public byte[] a;
    public byte[] b;
    public int c;
    public int[] d;
    public int[] e;
    public int f;
    public int g;
    public int h;
    public final MediaCodec.CryptoInfo i;
    public final b j;

    /* JADX INFO: renamed from: com.daaw.Fu$b */
    public static final class b {
        public final MediaCodec.CryptoInfo a;
        public final MediaCodec.CryptoInfo.Pattern b;

        public final void b(int i, int i2) {
            this.b.set(i, i2);
            this.a.setPattern(this.b);
        }

        public b(MediaCodec.CryptoInfo cryptoInfo) {
            this.a = cryptoInfo;
            this.b = AbstractC1008Gu.a(0, 0);
        }
    }

    public C0904Fu() {
        int i = AbstractC6280lb1.a;
        byte b2 = 0;
        MediaCodec.CryptoInfo cryptoInfoB = i >= 16 ? b() : null;
        this.i = cryptoInfoB;
        this.j = i >= 24 ? new b(cryptoInfoB) : null;
    }

    public MediaCodec.CryptoInfo a() {
        return this.i;
    }

    public final MediaCodec.CryptoInfo b() {
        return new MediaCodec.CryptoInfo();
    }

    public void c(int i, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i2, int i3, int i4) {
        this.f = i;
        this.d = iArr;
        this.e = iArr2;
        this.b = bArr;
        this.a = bArr2;
        this.c = i2;
        this.g = i3;
        this.h = i4;
        if (AbstractC6280lb1.a >= 16) {
            d();
        }
    }

    public final void d() {
        MediaCodec.CryptoInfo cryptoInfo = this.i;
        cryptoInfo.numSubSamples = this.f;
        cryptoInfo.numBytesOfClearData = this.d;
        cryptoInfo.numBytesOfEncryptedData = this.e;
        cryptoInfo.key = this.b;
        cryptoInfo.iv = this.a;
        cryptoInfo.mode = this.c;
        if (AbstractC6280lb1.a >= 24) {
            this.j.b(this.g, this.h);
        }
    }
}
