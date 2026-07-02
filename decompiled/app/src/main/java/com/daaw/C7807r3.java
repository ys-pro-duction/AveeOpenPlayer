package com.daaw;

import android.util.Pair;
import com.daaw.InterfaceC8103s61;
import com.google.android.exoplayer2.Format;
import com.google.android.gms.ads.AdRequest;
import java.util.Arrays;
import java.util.Collections;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: com.daaw.r3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7807r3 implements InterfaceC9543xF {
    public static final byte[] r = {73, 68, 51};
    public final boolean a;
    public final C2480Us0 b;
    public final C2584Vs0 c;
    public final String d;
    public String e;
    public Z41 f;
    public Z41 g;
    public int h;
    public int i;
    public int j;
    public boolean k;
    public boolean l;
    public long m;
    public int n;
    public long o;
    public Z41 p;
    public long q;

    public C7807r3(boolean z) {
        this(z, null);
    }

    private boolean f(C2584Vs0 c2584Vs0, byte[] bArr, int i) {
        int iMin = Math.min(c2584Vs0.a(), i - this.i);
        c2584Vs0.g(bArr, this.i, iMin);
        int i2 = this.i + iMin;
        this.i = i2;
        return i2 == i;
    }

    @Override // com.daaw.InterfaceC9543xF
    public void a(C2584Vs0 c2584Vs0) {
        while (c2584Vs0.a() > 0) {
            int i = this.h;
            if (i == 0) {
                g(c2584Vs0);
            } else if (i != 1) {
                if (i == 2) {
                    if (f(c2584Vs0, this.b.a, this.k ? 7 : 5)) {
                        h();
                    }
                } else if (i == 3) {
                    j(c2584Vs0);
                }
            } else if (f(c2584Vs0, this.c.a, 10)) {
                i();
            }
        }
    }

    @Override // com.daaw.InterfaceC9543xF
    public void b() {
        k();
    }

    @Override // com.daaw.InterfaceC9543xF
    public void d(InterfaceC9838yJ interfaceC9838yJ, InterfaceC8103s61.d dVar) {
        dVar.a();
        this.e = dVar.b();
        this.f = interfaceC9838yJ.a(dVar.c(), 1);
        if (!this.a) {
            this.g = new JE();
            return;
        }
        dVar.a();
        Z41 z41A = interfaceC9838yJ.a(dVar.c(), 4);
        this.g = z41A;
        z41A.d(Format.o(dVar.b(), "application/id3", null, -1, null));
    }

    @Override // com.daaw.InterfaceC9543xF
    public void e(long j, boolean z) {
        this.o = j;
    }

    public final void g(C2584Vs0 c2584Vs0) {
        byte[] bArr = c2584Vs0.a;
        int iC = c2584Vs0.c();
        int iD = c2584Vs0.d();
        while (iC < iD) {
            int i = iC + 1;
            byte b = bArr[iC];
            int i2 = b & 255;
            int i3 = this.j;
            if (i3 == 512 && i2 >= 240 && i2 != 255) {
                this.k = (b & 1) == 0;
                l();
                c2584Vs0.J(i);
                return;
            }
            int i4 = i3 | i2;
            if (i4 == 329) {
                this.j = 768;
            } else if (i4 == 511) {
                this.j = AdRequest.MAX_CONTENT_URL_LENGTH;
            } else if (i4 == 836) {
                this.j = 1024;
            } else if (i4 == 1075) {
                m();
                c2584Vs0.J(i);
                return;
            } else if (i3 != 256) {
                this.j = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            }
            iC = i;
        }
        c2584Vs0.J(iC);
    }

    public final void h() {
        this.b.m(0);
        if (this.l) {
            this.b.o(10);
        } else {
            int iH = this.b.h(2) + 1;
            int i = iH == 2 ? iH : 2;
            int iH2 = this.b.h(4);
            this.b.o(1);
            byte[] bArrA = AbstractC9129vm.a(i, iH2, this.b.h(3));
            Pair pairI = AbstractC9129vm.i(bArrA);
            Format formatK = Format.k(this.e, "audio/mp4a-latm", null, -1, -1, ((Integer) pairI.second).intValue(), ((Integer) pairI.first).intValue(), Collections.singletonList(bArrA), null, 0, this.d);
            this.m = 1024000000 / ((long) formatK.T);
            this.f.d(formatK);
            this.l = true;
        }
        this.b.o(4);
        int iH3 = this.b.h(13);
        int i2 = iH3 - 7;
        if (this.k) {
            i2 = iH3 - 9;
        }
        n(this.f, this.m, 0, i2);
    }

    public final void i() {
        this.g.c(this.c, 10);
        this.c.J(6);
        n(this.g, 0L, 10, this.c.w() + 10);
    }

    public final void j(C2584Vs0 c2584Vs0) {
        int iMin = Math.min(c2584Vs0.a(), this.n - this.i);
        this.p.c(c2584Vs0, iMin);
        int i = this.i + iMin;
        this.i = i;
        int i2 = this.n;
        if (i == i2) {
            this.p.a(this.o, 1, i2, 0, null);
            this.o += this.q;
            k();
        }
    }

    public final void k() {
        this.h = 0;
        this.i = 0;
        this.j = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
    }

    public final void l() {
        this.h = 2;
        this.i = 0;
    }

    public final void m() {
        this.h = 1;
        this.i = r.length;
        this.n = 0;
        this.c.J(0);
    }

    public final void n(Z41 z41, long j, int i, int i2) {
        this.h = 3;
        this.i = i;
        this.p = z41;
        this.q = j;
        this.n = i2;
    }

    public C7807r3(boolean z, String str) {
        this.b = new C2480Us0(new byte[7]);
        this.c = new C2584Vs0(Arrays.copyOf(r, 10));
        k();
        this.a = z;
        this.d = str;
    }

    @Override // com.daaw.InterfaceC9543xF
    public void c() {
    }
}
