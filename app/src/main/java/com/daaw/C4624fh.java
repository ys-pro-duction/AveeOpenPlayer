package com.daaw;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: com.daaw.fh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C4624fh {
    public long a;
    public int b;
    public int c;
    public long d;
    public int e;
    public short[] f = new short[0];

    public C4624fh() {
        f();
        a(0L);
    }

    public void a(long j) {
        this.d = this.a - AbstractC1869Pb1.e(j, this.b);
    }

    public void b(ByteBuffer byteBuffer, long j, int i, int i2, int i3, int i4, byte[][] bArr) {
        byte[] bArr2 = bArr[0];
        this.a = j;
        this.b = i;
        this.c = i2;
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        long jA = AbstractC1869Pb1.a(i3, i2, i4);
        int i5 = ((int) jA) * i2;
        this.e = i5;
        short[] sArr = this.f;
        if (sArr.length < i5 || sArr.length > i5 * 2) {
            this.f = new short[i5];
        }
        if (bArr2.length < i3 || bArr2.length > i3 * 2) {
            bArr2 = new byte[i3];
        }
        byteBuffer.get(bArr2, 0, i3);
        if (i3 % i2 != 0) {
            AbstractC0441Bk1.c("tmpBuffDataLength mismatch");
        }
        int i6 = i4 / 8;
        int i7 = 0;
        int i8 = 0;
        while (i7 < i3) {
            i7 += i6;
            try {
                this.f[i8] = (short) (((bArr2[i7 - 1] & 255) << 8) | (bArr2[i7 - 2] & 255));
                i8++;
            } catch (Exception e) {
                String.format("Oh, well: %d, %s", Integer.valueOf(i6), e.getLocalizedMessage());
            }
        }
        byteBuffer.limit(iLimit);
        byteBuffer.position(iPosition);
        a(jA);
        bArr[0] = bArr2;
    }

    public void c(ByteBuffer byteBuffer, long j, int i, int i2, int i3, byte[][] bArr) {
        b(byteBuffer, j, i, i2, byteBuffer.limit() - byteBuffer.position(), i3, bArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x0102  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int d(short[] r9, int r10, int r11, int r12, short[] r13, float[] r14, long[] r15) {
        /*
            Method dump skipped, instruction units count: 277
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C4624fh.d(short[], int, int, int, short[], float[], long[]):int");
    }

    public boolean e() {
        return this.e < 1;
    }

    public void f() {
        this.b = 1;
        this.c = 1;
        this.e = 0;
        this.a = Long.MIN_VALUE;
        this.d = Long.MIN_VALUE;
    }
}
