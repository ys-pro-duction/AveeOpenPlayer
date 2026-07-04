package com.daaw;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.cn3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3812cn3 {
    public static final byte[] d = {79, 103, 103, 83, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 28, -43, -59, -9, 1, 19, 79, 112, 117, 115, 72, 101, 97, 100, 1, 2, 56, 1, -128, -69, 0, 0, 0, 0, 0};
    public static final byte[] e = {79, 103, 103, 83, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 11, -103, 87, 83, 1, 16, 79, 112, 117, 115, 84, 97, 103, 115, 0, 0, 0, 0, 0, 0, 0, 0};
    public ByteBuffer a = InterfaceC6028ki2.a;
    public int c = 0;
    public int b = 2;

    public static final void c(ByteBuffer byteBuffer, long j, int i, int i2, boolean z) {
        byteBuffer.put((byte) 79);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 83);
        byteBuffer.put((byte) 0);
        byteBuffer.put(true != z ? (byte) 0 : (byte) 2);
        byteBuffer.putLong(j);
        byteBuffer.putInt(0);
        byteBuffer.putInt(i);
        byteBuffer.putInt(0);
        byteBuffer.put(AbstractC5393iR2.a(i2));
    }

    public final void a(H93 h93, List list) {
        int length;
        ByteBuffer byteBuffer;
        ByteBuffer byteBuffer2 = h93.d;
        byteBuffer2.getClass();
        if (byteBuffer2.limit() - h93.d.position() == 0) {
            return;
        }
        byte[] bArr = null;
        if (this.b == 2 && (list.size() == 1 || list.size() == 3)) {
            bArr = (byte[]) list.get(0);
        }
        ByteBuffer byteBuffer3 = h93.d;
        int iPosition = byteBuffer3.position();
        int iLimit = byteBuffer3.limit();
        int i = iLimit - iPosition;
        int i2 = (i + 255) / 255;
        int i3 = i2 + 27 + i;
        if (this.b == 2) {
            length = bArr != null ? bArr.length + 28 : 47;
            i3 += length + 44;
        } else {
            length = 0;
        }
        if (this.a.capacity() < i3) {
            this.a = ByteBuffer.allocate(i3).order(ByteOrder.LITTLE_ENDIAN);
        } else {
            this.a.clear();
        }
        ByteBuffer byteBuffer4 = this.a;
        if (this.b == 2) {
            if (bArr != null) {
                byteBuffer = byteBuffer4;
                c(byteBuffer, 0L, 0, 1, true);
                int length2 = bArr.length;
                byteBuffer.put(AbstractC5393iR2.a(length2));
                byteBuffer.put(bArr);
                int i4 = length2 + 28;
                byteBuffer.putInt(22, AbstractC9004vJ2.p(byteBuffer.array(), byteBuffer.arrayOffset(), i4, 0));
                byteBuffer.position(i4);
            } else {
                byteBuffer = byteBuffer4;
                byteBuffer.put(d);
            }
            byteBuffer.put(e);
        } else {
            byteBuffer = byteBuffer4;
        }
        int iC = this.c + AbstractC5778jo1.c(byteBuffer3);
        this.c = iC;
        ByteBuffer byteBuffer5 = byteBuffer;
        c(byteBuffer5, iC, this.b, i2, false);
        for (int i5 = 0; i5 < i2; i5++) {
            if (i >= 255) {
                byteBuffer5.put((byte) -1);
                i -= 255;
            } else {
                byteBuffer5.put((byte) i);
                i = 0;
            }
        }
        while (iPosition < iLimit) {
            byteBuffer5.put(byteBuffer3.get(iPosition));
            iPosition++;
        }
        byteBuffer3.position(byteBuffer3.limit());
        byteBuffer5.flip();
        if (this.b == 2) {
            byteBuffer5.putInt(length + 66, AbstractC9004vJ2.p(byteBuffer5.array(), byteBuffer5.arrayOffset() + length + 44, byteBuffer5.limit() - byteBuffer5.position(), 0));
        } else {
            byteBuffer5.putInt(22, AbstractC9004vJ2.p(byteBuffer5.array(), byteBuffer5.arrayOffset(), byteBuffer5.limit() - byteBuffer5.position(), 0));
        }
        this.b++;
        this.a = byteBuffer5;
        h93.b();
        h93.i(this.a.remaining());
        h93.d.put(this.a);
        h93.j();
    }

    public final void b() {
        this.a = InterfaceC6028ki2.a;
        this.c = 0;
        this.b = 2;
    }
}
