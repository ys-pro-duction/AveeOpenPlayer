package com.daaw;

import com.daaw.InterfaceC2827Yb;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: renamed from: com.daaw.g61, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4746g61 implements InterfaceC2827Yb {
    public boolean b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public ByteBuffer h;
    public ByteBuffer i;
    public byte[] j;
    public int k;
    public boolean l;

    public C4746g61() {
        ByteBuffer byteBuffer = InterfaceC2827Yb.a;
        this.h = byteBuffer;
        this.i = byteBuffer;
        this.e = -1;
        this.f = -1;
        this.j = new byte[0];
    }

    public void a(int i, int i2) {
        this.c = i;
        this.d = i2;
    }

    @Override // com.daaw.InterfaceC2827Yb
    public boolean c() {
        return this.l && this.i == InterfaceC2827Yb.a;
    }

    @Override // com.daaw.InterfaceC2827Yb
    public boolean d() {
        return this.b;
    }

    @Override // com.daaw.InterfaceC2827Yb
    public ByteBuffer e() {
        ByteBuffer byteBuffer = this.i;
        this.i = InterfaceC2827Yb.a;
        return byteBuffer;
    }

    @Override // com.daaw.InterfaceC2827Yb
    public void f(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i = iLimit - iPosition;
        int iMin = Math.min(i, this.g);
        this.g -= iMin;
        byteBuffer.position(iPosition + iMin);
        if (this.g > 0) {
            return;
        }
        int i2 = i - iMin;
        int length = (this.k + i2) - this.j.length;
        if (this.h.capacity() < length) {
            this.h = ByteBuffer.allocateDirect(length).order(ByteOrder.nativeOrder());
        } else {
            this.h.clear();
        }
        int iL = AbstractC6280lb1.l(length, 0, this.k);
        this.h.put(this.j, 0, iL);
        int iL2 = AbstractC6280lb1.l(length - iL, 0, i2);
        byteBuffer.limit(byteBuffer.position() + iL2);
        this.h.put(byteBuffer);
        byteBuffer.limit(iLimit);
        int i3 = i2 - iL2;
        int i4 = this.k - iL;
        this.k = i4;
        byte[] bArr = this.j;
        System.arraycopy(bArr, iL, bArr, 0, i4);
        byteBuffer.get(this.j, this.k, i3);
        this.k += i3;
        this.h.flip();
        this.i = this.h;
    }

    @Override // com.daaw.InterfaceC2827Yb
    public void flush() {
        this.i = InterfaceC2827Yb.a;
        this.l = false;
        this.g = 0;
        this.k = 0;
    }

    @Override // com.daaw.InterfaceC2827Yb
    public int g() {
        return this.e;
    }

    @Override // com.daaw.InterfaceC2827Yb
    public int h() {
        return this.f;
    }

    @Override // com.daaw.InterfaceC2827Yb
    public int i() {
        return 2;
    }

    @Override // com.daaw.InterfaceC2827Yb
    public void j() {
        this.l = true;
    }

    @Override // com.daaw.InterfaceC2827Yb
    public boolean k(int i, int i2, int i3) throws InterfaceC2827Yb.a {
        if (i3 != 2) {
            throw new InterfaceC2827Yb.a(i, i2, i3);
        }
        this.e = i2;
        this.f = i;
        int i4 = this.d;
        this.j = new byte[i4 * i2 * 2];
        this.k = 0;
        int i5 = this.c;
        this.g = i2 * i5 * 2;
        boolean z = this.b;
        boolean z2 = (i5 == 0 && i4 == 0) ? false : true;
        this.b = z2;
        return z != z2;
    }

    @Override // com.daaw.InterfaceC2827Yb
    public void reset() {
        flush();
        this.h = InterfaceC2827Yb.a;
        this.e = -1;
        this.f = -1;
        this.j = new byte[0];
    }
}
