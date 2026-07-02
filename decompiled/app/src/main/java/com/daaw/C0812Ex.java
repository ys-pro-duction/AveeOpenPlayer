package com.daaw;

import com.google.android.exoplayer2.source.TrackGroupArray;

/* JADX INFO: renamed from: com.daaw.Ex, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0812Ex implements InterfaceC0625Dc0 {
    public final C1535Lw a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final int f;
    public final boolean g;
    public int h;
    public boolean i;

    public C0812Ex() {
        this(new C1535Lw(true, 65536));
    }

    public static void j(int i, int i2, String str, String str2) {
        AbstractC7115ob.b(i >= i2, str + " cannot be less than " + str2);
    }

    @Override // com.daaw.InterfaceC0625Dc0
    public void a() {
        l(false);
    }

    @Override // com.daaw.InterfaceC0625Dc0
    public boolean b() {
        return false;
    }

    @Override // com.daaw.InterfaceC0625Dc0
    public void c(VH0[] vh0Arr, TrackGroupArray trackGroupArray, C3338b51 c3338b51) {
        int iK = this.f;
        if (iK == -1) {
            iK = k(vh0Arr, c3338b51);
        }
        this.h = iK;
        this.a.h(iK);
    }

    @Override // com.daaw.InterfaceC0625Dc0
    public long d() {
        return 0L;
    }

    @Override // com.daaw.InterfaceC0625Dc0
    public boolean e(long j, float f, boolean z) {
        long jZ = AbstractC6280lb1.z(j, f);
        long j2 = z ? this.e : this.d;
        if (j2 <= 0 || jZ >= j2) {
            return true;
        }
        return !this.g && this.a.f() >= this.h;
    }

    @Override // com.daaw.InterfaceC0625Dc0
    public boolean f(long j, float f) {
        boolean z = true;
        boolean z2 = this.a.f() >= this.h;
        long jMin = this.b;
        if (f > 1.0f) {
            jMin = Math.min(AbstractC6280lb1.w(jMin, f), this.c);
        }
        if (j < jMin) {
            if (!this.g && z2) {
                z = false;
            }
            this.i = z;
        } else if (j > this.c || z2) {
            this.i = false;
        }
        return this.i;
    }

    @Override // com.daaw.InterfaceC0625Dc0
    public void g() {
        l(true);
    }

    @Override // com.daaw.InterfaceC0625Dc0
    public O3 h() {
        return this.a;
    }

    @Override // com.daaw.InterfaceC0625Dc0
    public void i() {
        l(true);
    }

    public int k(VH0[] vh0Arr, C3338b51 c3338b51) {
        int iU = 0;
        for (int i = 0; i < vh0Arr.length; i++) {
            if (c3338b51.a(i) != null) {
                iU += AbstractC6280lb1.u(vh0Arr[i].h());
            }
        }
        return iU;
    }

    public final void l(boolean z) {
        this.h = 0;
        this.i = false;
        if (z) {
            this.a.g();
        }
    }

    public C0812Ex(C1535Lw c1535Lw) {
        this(c1535Lw, 15000, 50000, 2500, 5000, -1, true);
    }

    public C0812Ex(C1535Lw c1535Lw, int i, int i2, int i3, int i4, int i5, boolean z) {
        this(c1535Lw, i, i2, i3, i4, i5, z, null);
    }

    public C0812Ex(C1535Lw c1535Lw, int i, int i2, int i3, int i4, int i5, boolean z, AbstractC10306zz0 abstractC10306zz0) {
        j(i3, 0, "bufferForPlaybackMs", "0");
        j(i4, 0, "bufferForPlaybackAfterRebufferMs", "0");
        j(i, i3, "minBufferMs", "bufferForPlaybackMs");
        j(i, i4, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        j(i2, i, "maxBufferMs", "minBufferMs");
        this.a = c1535Lw;
        this.b = ((long) i) * 1000;
        this.c = ((long) i2) * 1000;
        this.d = ((long) i3) * 1000;
        this.e = ((long) i4) * 1000;
        this.f = i5;
        this.g = z;
    }
}
