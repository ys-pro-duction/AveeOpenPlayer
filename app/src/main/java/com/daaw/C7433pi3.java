package com.daaw;

/* JADX INFO: renamed from: com.daaw.pi3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7433pi3 extends AbstractC6875ni3 {
    @Override // com.daaw.AbstractC6875ni3
    public final int a(int i, byte[] bArr, int i2, int i3) {
        while (i2 < i3 && bArr[i2] >= 0) {
            i2++;
        }
        if (i2 >= i3) {
            return 0;
        }
        while (i2 < i3) {
            int i4 = i2 + 1;
            byte b = bArr[i2];
            if (b >= 0) {
                i2 = i4;
            } else {
                if (b < -32) {
                    if (i4 >= i3) {
                        return b;
                    }
                    if (b >= -62) {
                        i2 += 2;
                        if (bArr[i4] > -65) {
                        }
                    }
                    return -1;
                }
                if (b >= -16) {
                    if (i4 >= i3 - 2) {
                        return AbstractC8548ti3.a(bArr, i4, i3);
                    }
                    int i5 = i2 + 2;
                    byte b2 = bArr[i4];
                    if (b2 <= -65 && (((b << 28) + (b2 + 112)) >> 30) == 0) {
                        int i6 = i2 + 3;
                        if (bArr[i5] <= -65) {
                            i2 += 4;
                            if (bArr[i6] > -65) {
                            }
                        }
                    }
                    return -1;
                }
                if (i4 >= i3 - 1) {
                    return AbstractC8548ti3.a(bArr, i4, i3);
                }
                int i7 = i2 + 2;
                byte b3 = bArr[i4];
                if (b3 > -65 || (b == -32 && b3 < -96)) {
                    return -1;
                }
                if (b == -19 && b3 >= -96) {
                    return -1;
                }
                i2 += 3;
                if (bArr[i7] > -65) {
                    return -1;
                }
            }
        }
        return 0;
    }
}
