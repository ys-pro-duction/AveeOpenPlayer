package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public final class N53 extends M53 {
    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        if (r13[r14] <= (-65)) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0047, code lost:
    
        if (r13[r14] <= (-65)) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0080, code lost:
    
        if (r13[r14] <= (-65)) goto L11;
     */
    @Override // com.daaw.M53
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(int r12, byte[] r13, int r14, int r15) {
        /*
            Method dump skipped, instruction units count: 242
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.N53.a(int, byte[], int, int):int");
    }

    @Override // com.daaw.M53
    public final String b(byte[] bArr, int i, int i2) throws C8939v43 {
        int i3;
        int length = bArr.length;
        if ((((length - i) - i2) | i | i2) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(i), Integer.valueOf(i2)));
        }
        int i4 = i + i2;
        char[] cArr = new char[i2];
        int i5 = 0;
        while (i < i4) {
            byte b = bArr[i];
            if (!L53.d(b)) {
                break;
            }
            i++;
            cArr[i5] = (char) b;
            i5++;
        }
        int i6 = i5;
        while (i < i4) {
            int i7 = i + 1;
            byte b2 = bArr[i];
            if (L53.d(b2)) {
                cArr[i6] = (char) b2;
                i6++;
                i = i7;
                while (i < i4) {
                    byte b3 = bArr[i];
                    if (L53.d(b3)) {
                        i++;
                        cArr[i6] = (char) b3;
                        i6++;
                    }
                }
            } else {
                if (L53.f(b2)) {
                    if (i7 >= i4) {
                        throw C8939v43.d();
                    }
                    i3 = i6 + 1;
                    i += 2;
                    L53.c(b2, bArr[i7], cArr, i6);
                } else if (L53.e(b2)) {
                    if (i7 >= i4 - 1) {
                        throw C8939v43.d();
                    }
                    i3 = i6 + 1;
                    int i8 = i + 2;
                    i += 3;
                    L53.b(b2, bArr[i7], bArr[i8], cArr, i6);
                } else {
                    if (i7 >= i4 - 2) {
                        throw C8939v43.d();
                    }
                    byte b4 = bArr[i7];
                    int i9 = i + 3;
                    byte b5 = bArr[i + 2];
                    i += 4;
                    L53.a(b2, b4, b5, bArr[i9], cArr, i6);
                    i6 += 2;
                }
                i6 = i3;
            }
        }
        return new String(cArr, 0, i6);
    }
}
