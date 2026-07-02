package com.daaw;

import com.daaw.InterfaceC2827Yb;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: renamed from: com.daaw.zS0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C10154zS0 implements InterfaceC2827Yb {
    public int b;
    public int c;
    public int d;
    public boolean e;
    public ByteBuffer f;
    public ByteBuffer g;
    public boolean h;
    public byte[] i;
    public byte[] j;
    public int k;
    public int l;
    public int m;
    public boolean n;
    public long o;

    public C10154zS0() {
        ByteBuffer byteBuffer = InterfaceC2827Yb.a;
        this.f = byteBuffer;
        this.g = byteBuffer;
        this.b = -1;
        this.c = -1;
        this.i = new byte[0];
        this.j = new byte[0];
    }

    public final int a(long j) {
        return (int) ((j * ((long) this.c)) / 1000000);
    }

    public final int b(ByteBuffer byteBuffer) {
        for (int iLimit = byteBuffer.limit() - 1; iLimit >= byteBuffer.position(); iLimit -= 2) {
            if (Math.abs((int) byteBuffer.get(iLimit)) > 4) {
                int i = this.d;
                return ((iLimit / i) * i) + i;
            }
        }
        return byteBuffer.position();
    }

    @Override // com.daaw.InterfaceC2827Yb
    public boolean c() {
        return this.h && this.g == InterfaceC2827Yb.a;
    }

    @Override // com.daaw.InterfaceC2827Yb
    public boolean d() {
        return this.c != -1 && this.e;
    }

    @Override // com.daaw.InterfaceC2827Yb
    public ByteBuffer e() {
        ByteBuffer byteBuffer = this.g;
        this.g = InterfaceC2827Yb.a;
        return byteBuffer;
    }

    @Override // com.daaw.InterfaceC2827Yb
    public void f(ByteBuffer byteBuffer) {
        while (byteBuffer.hasRemaining() && !this.g.hasRemaining()) {
            int i = this.k;
            if (i == 0) {
                r(byteBuffer);
            } else if (i == 1) {
                q(byteBuffer);
            } else {
                if (i != 2) {
                    throw new IllegalStateException();
                }
                s(byteBuffer);
            }
        }
    }

    @Override // com.daaw.InterfaceC2827Yb
    public void flush() {
        if (d()) {
            int iA = a(100000L) * this.d;
            if (this.i.length != iA) {
                this.i = new byte[iA];
            }
            int iA2 = a(10000L) * this.d;
            this.m = iA2;
            if (this.j.length != iA2) {
                this.j = new byte[iA2];
            }
        }
        this.k = 0;
        this.g = InterfaceC2827Yb.a;
        this.h = false;
        this.o = 0L;
        this.l = 0;
        this.n = false;
    }

    @Override // com.daaw.InterfaceC2827Yb
    public int g() {
        return this.b;
    }

    @Override // com.daaw.InterfaceC2827Yb
    public int h() {
        return this.c;
    }

    @Override // com.daaw.InterfaceC2827Yb
    public int i() {
        return 2;
    }

    @Override // com.daaw.InterfaceC2827Yb
    public void j() {
        this.h = true;
        int i = this.l;
        if (i > 0) {
            o(this.i, i);
        }
        if (this.n) {
            return;
        }
        this.o += (long) (this.m / this.d);
    }

    @Override // com.daaw.InterfaceC2827Yb
    public boolean k(int i, int i2, int i3) throws InterfaceC2827Yb.a {
        if (i3 != 2) {
            throw new InterfaceC2827Yb.a(i, i2, i3);
        }
        if (this.c == i && this.b == i2) {
            return false;
        }
        this.c = i;
        this.b = i2;
        this.d = i2 * 2;
        return true;
    }

    public final int l(ByteBuffer byteBuffer) {
        for (int iPosition = byteBuffer.position() + 1; iPosition < byteBuffer.limit(); iPosition += 2) {
            if (Math.abs((int) byteBuffer.get(iPosition)) > 4) {
                int i = this.d;
                return i * (iPosition / i);
            }
        }
        return byteBuffer.limit();
    }

    public long m() {
        return this.o;
    }

    public final void n(ByteBuffer byteBuffer) {
        p(byteBuffer.remaining());
        this.f.put(byteBuffer);
        this.f.flip();
        this.g = this.f;
    }

    public final void o(byte[] bArr, int i) {
        p(i);
        this.f.put(bArr, 0, i);
        this.f.flip();
        this.g = this.f;
    }

    public final void p(int i) {
        if (this.f.capacity() < i) {
            this.f = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.f.clear();
        }
        if (i > 0) {
            this.n = true;
        }
    }

    public final void q(ByteBuffer byteBuffer) {
        int iLimit = byteBuffer.limit();
        int iL = l(byteBuffer);
        int iPosition = iL - byteBuffer.position();
        byte[] bArr = this.i;
        int length = bArr.length;
        int i = this.l;
        int i2 = length - i;
        if (iL < iLimit && iPosition < i2) {
            o(bArr, i);
            this.l = 0;
            this.k = 0;
            return;
        }
        int iMin = Math.min(iPosition, i2);
        byteBuffer.limit(byteBuffer.position() + iMin);
        byteBuffer.get(this.i, this.l, iMin);
        int i3 = this.l + iMin;
        this.l = i3;
        byte[] bArr2 = this.i;
        if (i3 == bArr2.length) {
            if (this.n) {
                o(bArr2, this.m);
                this.o += (long) ((this.l - (this.m * 2)) / this.d);
            } else {
                this.o += (long) ((i3 - this.m) / this.d);
            }
            u(byteBuffer, this.i, this.l);
            this.l = 0;
            this.k = 2;
        }
        byteBuffer.limit(iLimit);
    }

    public final void r(ByteBuffer byteBuffer) {
        int iLimit = byteBuffer.limit();
        byteBuffer.limit(Math.min(iLimit, byteBuffer.position() + this.i.length));
        int iB = b(byteBuffer);
        if (iB == byteBuffer.position()) {
            this.k = 1;
        } else {
            byteBuffer.limit(iB);
            n(byteBuffer);
        }
        byteBuffer.limit(iLimit);
    }

    @Override // com.daaw.InterfaceC2827Yb
    public void reset() {
        this.e = false;
        flush();
        this.f = InterfaceC2827Yb.a;
        this.b = -1;
        this.c = -1;
        this.m = 0;
        this.i = new byte[0];
        this.j = new byte[0];
    }

    public final void s(ByteBuffer byteBuffer) {
        int iLimit = byteBuffer.limit();
        int iL = l(byteBuffer);
        byteBuffer.limit(iL);
        this.o += (long) (byteBuffer.remaining() / this.d);
        u(byteBuffer, this.j, this.m);
        if (iL < iLimit) {
            o(this.j, this.m);
            this.k = 0;
            byteBuffer.limit(iLimit);
        }
    }

    public void t(boolean z) {
        this.e = z;
        flush();
    }

    public final void u(ByteBuffer byteBuffer, byte[] bArr, int i) {
        int iMin = Math.min(byteBuffer.remaining(), this.m);
        int i2 = this.m - iMin;
        System.arraycopy(bArr, i - i2, this.j, 0, i2);
        byteBuffer.position(byteBuffer.limit() - iMin);
        byteBuffer.get(this.j, i2, iMin);
    }
}
