package com.daaw;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* JADX INFO: renamed from: com.daaw.Wj2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2654Wj2 implements InterfaceC6028ki2 {
    public int b;
    public float c = 1.0f;
    public float d = 1.0f;
    public C3503bh2 e;
    public C3503bh2 f;
    public C3503bh2 g;
    public C3503bh2 h;
    public boolean i;
    public C8273sj2 j;
    public ByteBuffer k;
    public ShortBuffer l;
    public ByteBuffer m;
    public long n;
    public long o;
    public boolean p;

    public C2654Wj2() {
        C3503bh2 c3503bh2 = C3503bh2.e;
        this.e = c3503bh2;
        this.f = c3503bh2;
        this.g = c3503bh2;
        this.h = c3503bh2;
        ByteBuffer byteBuffer = InterfaceC6028ki2.a;
        this.k = byteBuffer;
        this.l = byteBuffer.asShortBuffer();
        this.m = byteBuffer;
        this.b = -1;
    }

    @Override // com.daaw.InterfaceC6028ki2
    public final C3503bh2 a(C3503bh2 c3503bh2) throws C0855Fh2 {
        if (c3503bh2.c != 2) {
            throw new C0855Fh2("Unhandled input format:", c3503bh2);
        }
        int i = this.b;
        if (i == -1) {
            i = c3503bh2.a;
        }
        this.e = c3503bh2;
        C3503bh2 c3503bh22 = new C3503bh2(i, c3503bh2.b, 2);
        this.f = c3503bh22;
        this.i = true;
        return c3503bh22;
    }

    @Override // com.daaw.InterfaceC6028ki2
    public final void b(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            C8273sj2 c8273sj2 = this.j;
            c8273sj2.getClass();
            ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
            int iRemaining = byteBuffer.remaining();
            this.n += (long) iRemaining;
            c8273sj2.f(shortBufferAsShortBuffer);
            byteBuffer.position(byteBuffer.position() + iRemaining);
        }
    }

    public final long c(long j) {
        long j2 = this.o;
        if (j2 < 1024) {
            return (long) (((double) this.c) * j);
        }
        long j3 = this.n;
        C8273sj2 c8273sj2 = this.j;
        c8273sj2.getClass();
        long jB = j3 - ((long) c8273sj2.b());
        int i = this.h.a;
        int i2 = this.g.a;
        return i == i2 ? AbstractC9004vJ2.D(j, jB, j2) : AbstractC9004vJ2.D(j, jB * ((long) i), j2 * ((long) i2));
    }

    public final void d(float f) {
        if (this.d != f) {
            this.d = f;
            this.i = true;
        }
    }

    public final void e(float f) {
        if (this.c != f) {
            this.c = f;
            this.i = true;
        }
    }

    @Override // com.daaw.InterfaceC6028ki2
    public final ByteBuffer zzb() {
        int iA;
        C8273sj2 c8273sj2 = this.j;
        if (c8273sj2 != null && (iA = c8273sj2.a()) > 0) {
            if (this.k.capacity() < iA) {
                ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(iA).order(ByteOrder.nativeOrder());
                this.k = byteBufferOrder;
                this.l = byteBufferOrder.asShortBuffer();
            } else {
                this.k.clear();
                this.l.clear();
            }
            c8273sj2.d(this.l);
            this.o += (long) iA;
            this.k.limit(iA);
            this.m = this.k;
        }
        ByteBuffer byteBuffer = this.m;
        this.m = InterfaceC6028ki2.a;
        return byteBuffer;
    }

    @Override // com.daaw.InterfaceC6028ki2
    public final void zzc() {
        if (zzg()) {
            C3503bh2 c3503bh2 = this.e;
            this.g = c3503bh2;
            C3503bh2 c3503bh22 = this.f;
            this.h = c3503bh22;
            if (this.i) {
                this.j = new C8273sj2(c3503bh2.a, c3503bh2.b, this.c, this.d, c3503bh22.a);
            } else {
                C8273sj2 c8273sj2 = this.j;
                if (c8273sj2 != null) {
                    c8273sj2.c();
                }
            }
        }
        this.m = InterfaceC6028ki2.a;
        this.n = 0L;
        this.o = 0L;
        this.p = false;
    }

    @Override // com.daaw.InterfaceC6028ki2
    public final void zzd() {
        C8273sj2 c8273sj2 = this.j;
        if (c8273sj2 != null) {
            c8273sj2.e();
        }
        this.p = true;
    }

    @Override // com.daaw.InterfaceC6028ki2
    public final void zzf() {
        this.c = 1.0f;
        this.d = 1.0f;
        C3503bh2 c3503bh2 = C3503bh2.e;
        this.e = c3503bh2;
        this.f = c3503bh2;
        this.g = c3503bh2;
        this.h = c3503bh2;
        ByteBuffer byteBuffer = InterfaceC6028ki2.a;
        this.k = byteBuffer;
        this.l = byteBuffer.asShortBuffer();
        this.m = byteBuffer;
        this.b = -1;
        this.i = false;
        this.j = null;
        this.n = 0L;
        this.o = 0L;
        this.p = false;
    }

    @Override // com.daaw.InterfaceC6028ki2
    public final boolean zzg() {
        if (this.f.a != -1) {
            return Math.abs(this.c + (-1.0f)) >= 1.0E-4f || Math.abs(this.d + (-1.0f)) >= 1.0E-4f || this.f.a != this.e.a;
        }
        return false;
    }

    @Override // com.daaw.InterfaceC6028ki2
    public final boolean zzh() {
        if (!this.p) {
            return false;
        }
        C8273sj2 c8273sj2 = this.j;
        return c8273sj2 == null || c8273sj2.a() == 0;
    }
}
