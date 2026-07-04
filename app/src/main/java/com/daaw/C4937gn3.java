package com.daaw;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: com.daaw.gn3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4937gn3 extends AbstractC1794Oi2 {
    public static final int i = Float.floatToIntBits(Float.NaN);

    public static void i(int i2, ByteBuffer byteBuffer) {
        int iFloatToIntBits = Float.floatToIntBits((float) (((double) i2) * 4.656612875245797E-10d));
        if (iFloatToIntBits == i) {
            iFloatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(iFloatToIntBits);
    }

    @Override // com.daaw.InterfaceC6028ki2
    public final void b(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferD;
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i2 = iLimit - iPosition;
        int i3 = this.b.c;
        if (i3 == 536870912) {
            byteBufferD = d((i2 / 3) * 4);
            while (iPosition < iLimit) {
                i(((byteBuffer.get(iPosition) & 255) << 8) | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition + 2) & 255) << 24), byteBufferD);
                iPosition += 3;
            }
        } else if (i3 == 805306368) {
            byteBufferD = d(i2);
            while (iPosition < iLimit) {
                int i4 = byteBuffer.get(iPosition) & 255;
                int i5 = (byteBuffer.get(iPosition + 1) & 255) << 8;
                i(i4 | i5 | ((byteBuffer.get(iPosition + 2) & 255) << 16) | ((byteBuffer.get(iPosition + 3) & 255) << 24), byteBufferD);
                iPosition += 4;
            }
        } else if (i3 == 1342177280) {
            byteBufferD = d((i2 / 3) * 4);
            while (iPosition < iLimit) {
                i(((byteBuffer.get(iPosition + 2) & 255) << 8) | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition) & 255) << 24), byteBufferD);
                iPosition += 3;
            }
        } else {
            if (i3 != 1610612736) {
                throw new IllegalStateException();
            }
            byteBufferD = d(i2);
            while (iPosition < iLimit) {
                int i6 = byteBuffer.get(iPosition + 3) & 255;
                int i7 = (byteBuffer.get(iPosition + 2) & 255) << 8;
                i(i6 | i7 | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition) & 255) << 24), byteBufferD);
                iPosition += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferD.flip();
    }

    @Override // com.daaw.AbstractC1794Oi2
    public final C3503bh2 c(C3503bh2 c3503bh2) throws C0855Fh2 {
        int i2 = c3503bh2.c;
        int i3 = AbstractC9004vJ2.a;
        if (i2 == 536870912 || i2 == 1342177280 || i2 == 805306368 || i2 == 1610612736) {
            return new C3503bh2(c3503bh2.a, c3503bh2.b, 4);
        }
        if (i2 == 4) {
            return C3503bh2.e;
        }
        throw new C0855Fh2("Unhandled input format:", c3503bh2);
    }
}
