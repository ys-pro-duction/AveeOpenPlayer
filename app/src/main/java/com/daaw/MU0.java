package com.daaw;

import com.daaw.InterfaceC2827Yb;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class MU0 implements InterfaceC2827Yb {
    public int g;
    public LU0 h;
    public ByteBuffer i;
    public ShortBuffer j;
    public ByteBuffer k;
    public long l;
    public long m;
    public boolean n;
    public float d = 1.0f;
    public float e = 1.0f;
    public int b = -1;
    public int c = -1;
    public int f = -1;

    public MU0() {
        ByteBuffer byteBuffer = InterfaceC2827Yb.a;
        this.i = byteBuffer;
        this.j = byteBuffer.asShortBuffer();
        this.k = byteBuffer;
        this.g = -1;
    }

    public long a(long j) {
        long j2 = this.m;
        if (j2 < 1024) {
            return (long) (((double) this.d) * j);
        }
        int i = this.f;
        int i2 = this.c;
        return i == i2 ? AbstractC6280lb1.T(j, this.l, j2) : AbstractC6280lb1.T(j, this.l * ((long) i), j2 * ((long) i2));
    }

    public float b(float f) {
        float fK = AbstractC6280lb1.k(f, 0.1f, 8.0f);
        if (this.e != fK) {
            this.e = fK;
            this.h = null;
        }
        flush();
        return fK;
    }

    @Override // com.daaw.InterfaceC2827Yb
    public boolean c() {
        if (!this.n) {
            return false;
        }
        LU0 lu0 = this.h;
        return lu0 == null || lu0.j() == 0;
    }

    @Override // com.daaw.InterfaceC2827Yb
    public boolean d() {
        if (this.c != -1) {
            return Math.abs(this.d - 1.0f) >= 0.01f || Math.abs(this.e - 1.0f) >= 0.01f || this.f != this.c;
        }
        return false;
    }

    @Override // com.daaw.InterfaceC2827Yb
    public ByteBuffer e() {
        ByteBuffer byteBuffer = this.k;
        this.k = InterfaceC2827Yb.a;
        return byteBuffer;
    }

    @Override // com.daaw.InterfaceC2827Yb
    public void f(ByteBuffer byteBuffer) {
        AbstractC7115ob.f(this.h != null);
        if (byteBuffer.hasRemaining()) {
            ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
            int iRemaining = byteBuffer.remaining();
            this.l += (long) iRemaining;
            this.h.s(shortBufferAsShortBuffer);
            byteBuffer.position(byteBuffer.position() + iRemaining);
        }
        int iJ = this.h.j() * this.b * 2;
        if (iJ > 0) {
            if (this.i.capacity() < iJ) {
                ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(iJ).order(ByteOrder.nativeOrder());
                this.i = byteBufferOrder;
                this.j = byteBufferOrder.asShortBuffer();
            } else {
                this.i.clear();
                this.j.clear();
            }
            this.h.k(this.j);
            this.m += (long) iJ;
            this.i.limit(iJ);
            this.k = this.i;
        }
    }

    @Override // com.daaw.InterfaceC2827Yb
    public void flush() {
        if (d()) {
            LU0 lu0 = this.h;
            if (lu0 == null) {
                this.h = new LU0(this.c, this.b, this.d, this.e, this.f);
            } else {
                lu0.i();
            }
        }
        this.k = InterfaceC2827Yb.a;
        this.l = 0L;
        this.m = 0L;
        this.n = false;
    }

    @Override // com.daaw.InterfaceC2827Yb
    public int g() {
        return this.b;
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
        AbstractC7115ob.f(this.h != null);
        this.h.r();
        this.n = true;
    }

    @Override // com.daaw.InterfaceC2827Yb
    public boolean k(int i, int i2, int i3) throws InterfaceC2827Yb.a {
        if (i3 != 2) {
            throw new InterfaceC2827Yb.a(i, i2, i3);
        }
        int i4 = this.g;
        if (i4 == -1) {
            i4 = i;
        }
        if (this.c == i && this.b == i2 && this.f == i4) {
            return false;
        }
        this.c = i;
        this.b = i2;
        this.f = i4;
        this.h = null;
        return true;
    }

    public float l(float f) {
        float fK = AbstractC6280lb1.k(f, 0.1f, 8.0f);
        if (this.d != fK) {
            this.d = fK;
            this.h = null;
        }
        flush();
        return fK;
    }

    @Override // com.daaw.InterfaceC2827Yb
    public void reset() {
        this.d = 1.0f;
        this.e = 1.0f;
        this.b = -1;
        this.c = -1;
        this.f = -1;
        ByteBuffer byteBuffer = InterfaceC2827Yb.a;
        this.i = byteBuffer;
        this.j = byteBuffer.asShortBuffer();
        this.k = byteBuffer;
        this.g = -1;
        this.h = null;
        this.l = 0L;
        this.m = 0L;
        this.n = false;
    }
}
