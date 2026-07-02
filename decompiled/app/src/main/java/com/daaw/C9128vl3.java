package com.daaw;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: com.daaw.vl3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9128vl3 extends AbstractC1794Oi2 {
    public int[] i;
    public int[] j;

    @Override // com.daaw.InterfaceC6028ki2
    public final void b(ByteBuffer byteBuffer) {
        int[] iArr = this.j;
        iArr.getClass();
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        ByteBuffer byteBufferD = d(((iLimit - iPosition) / this.b.d) * this.c.d);
        while (iPosition < iLimit) {
            for (int i : iArr) {
                byteBufferD.putShort(byteBuffer.getShort(i + i + iPosition));
            }
            iPosition += this.b.d;
        }
        byteBuffer.position(iLimit);
        byteBufferD.flip();
    }

    @Override // com.daaw.AbstractC1794Oi2
    public final C3503bh2 c(C3503bh2 c3503bh2) throws C0855Fh2 {
        int[] iArr = this.i;
        if (iArr == null) {
            return C3503bh2.e;
        }
        if (c3503bh2.c != 2) {
            throw new C0855Fh2("Unhandled input format:", c3503bh2);
        }
        boolean z = c3503bh2.b != iArr.length;
        int i = 0;
        while (true) {
            int length = iArr.length;
            if (i >= length) {
                return z ? new C3503bh2(c3503bh2.a, length, 2) : C3503bh2.e;
            }
            int i2 = iArr[i];
            if (i2 >= c3503bh2.b) {
                throw new C0855Fh2("Unhandled input format:", c3503bh2);
            }
            z |= i2 != i;
            i++;
        }
    }

    @Override // com.daaw.AbstractC1794Oi2
    public final void e() {
        this.j = this.i;
    }

    @Override // com.daaw.AbstractC1794Oi2
    public final void g() {
        this.j = null;
        this.i = null;
    }

    public final void i(int[] iArr) {
        this.i = iArr;
    }
}
