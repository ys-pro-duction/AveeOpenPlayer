package com.daaw;

/* JADX INFO: renamed from: com.daaw.Fs1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0898Fs1 extends AbstractC6898nn1 {
    public C0898Fs1(C5916kI2 c5916kI2, long j, long j2) {
        super(new C5492in1(), new C0794Es1(c5916kI2, null), j, 0L, j + 1, 0L, j2, 188L, 1000);
    }

    public static /* bridge */ /* synthetic */ int h(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }
}
