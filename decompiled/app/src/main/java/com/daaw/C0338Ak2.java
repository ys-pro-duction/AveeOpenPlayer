package com.daaw;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: com.daaw.Ak2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0338Ak2 extends AbstractC1794Oi2 {
    @Override // com.daaw.InterfaceC6028ki2
    public final void b(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i = iLimit - iPosition;
        int i2 = this.b.c;
        if (i2 == 3) {
            i += i;
        } else if (i2 == 4) {
            i /= 2;
        } else if (i2 != 268435456) {
            if (i2 != 536870912) {
                if (i2 != 805306368) {
                    if (i2 != 1342177280) {
                        if (i2 != 1610612736) {
                            throw new IllegalStateException();
                        }
                    }
                }
                i /= 2;
            }
            i /= 3;
            i += i;
        }
        ByteBuffer byteBufferD = d(i);
        int i3 = this.b.c;
        if (i3 == 3) {
            while (iPosition < iLimit) {
                byteBufferD.put((byte) 0);
                byteBufferD.put((byte) ((byteBuffer.get(iPosition) & 255) - 128));
                iPosition++;
            }
        } else if (i3 == 4) {
            while (iPosition < iLimit) {
                short sMax = (short) (Math.max(-1.0f, Math.min(byteBuffer.getFloat(iPosition), 1.0f)) * 32767.0f);
                byteBufferD.put((byte) (sMax & 255));
                byteBufferD.put((byte) ((sMax >> 8) & 255));
                iPosition += 4;
            }
        } else if (i3 == 268435456) {
            while (iPosition < iLimit) {
                byteBufferD.put(byteBuffer.get(iPosition + 1));
                byteBufferD.put(byteBuffer.get(iPosition));
                iPosition += 2;
            }
        } else if (i3 == 536870912) {
            while (iPosition < iLimit) {
                byteBufferD.put(byteBuffer.get(iPosition + 1));
                byteBufferD.put(byteBuffer.get(iPosition + 2));
                iPosition += 3;
            }
        } else if (i3 == 805306368) {
            while (iPosition < iLimit) {
                byteBufferD.put(byteBuffer.get(iPosition + 2));
                byteBufferD.put(byteBuffer.get(iPosition + 3));
                iPosition += 4;
            }
        } else if (i3 == 1342177280) {
            while (iPosition < iLimit) {
                byteBufferD.put(byteBuffer.get(iPosition + 1));
                byteBufferD.put(byteBuffer.get(iPosition));
                iPosition += 3;
            }
        } else {
            if (i3 != 1610612736) {
                throw new IllegalStateException();
            }
            while (iPosition < iLimit) {
                byteBufferD.put(byteBuffer.get(iPosition + 1));
                byteBufferD.put(byteBuffer.get(iPosition));
                iPosition += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferD.flip();
    }

    @Override // com.daaw.AbstractC1794Oi2
    public final C3503bh2 c(C3503bh2 c3503bh2) throws C0855Fh2 {
        int i = c3503bh2.c;
        if (i != 3) {
            if (i == 2) {
                return C3503bh2.e;
            }
            if (i != 268435456 && i != 536870912 && i != 1342177280 && i != 805306368 && i != 1610612736 && i != 4) {
                throw new C0855Fh2("Unhandled input format:", c3503bh2);
            }
        }
        return new C3503bh2(c3503bh2.a, c3503bh2.b, 2);
    }
}
