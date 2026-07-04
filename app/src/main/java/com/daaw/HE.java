package com.daaw;

import com.daaw.InterfaceC8103s61;
import com.google.android.exoplayer2.Format;

/* JADX INFO: loaded from: classes.dex */
public final class HE implements InterfaceC9543xF {
    public final String b;
    public String c;
    public Z41 d;
    public int f;
    public int g;
    public long h;
    public Format i;
    public int j;
    public long k;
    public final C2584Vs0 a = new C2584Vs0(new byte[18]);
    public int e = 0;

    public HE(String str) {
        this.b = str;
    }

    private boolean f(C2584Vs0 c2584Vs0, byte[] bArr, int i) {
        int iMin = Math.min(c2584Vs0.a(), i - this.f);
        c2584Vs0.g(bArr, this.f, iMin);
        int i2 = this.f + iMin;
        this.f = i2;
        return i2 == i;
    }

    private void g() {
        byte[] bArr = this.a.a;
        if (this.i == null) {
            Format formatG = IE.g(bArr, this.c, this.b, null);
            this.i = formatG;
            this.d.d(formatG);
        }
        this.j = IE.a(bArr);
        this.h = (int) ((((long) IE.f(bArr)) * 1000000) / ((long) this.i.T));
    }

    private boolean h(C2584Vs0 c2584Vs0) {
        while (c2584Vs0.a() > 0) {
            int i = this.g << 8;
            this.g = i;
            int iX = i | c2584Vs0.x();
            this.g = iX;
            if (IE.d(iX)) {
                byte[] bArr = this.a.a;
                int i2 = this.g;
                bArr[0] = (byte) ((i2 >> 24) & 255);
                bArr[1] = (byte) ((i2 >> 16) & 255);
                bArr[2] = (byte) ((i2 >> 8) & 255);
                bArr[3] = (byte) (i2 & 255);
                this.f = 4;
                this.g = 0;
                return true;
            }
        }
        return false;
    }

    @Override // com.daaw.InterfaceC9543xF
    public void a(C2584Vs0 c2584Vs0) {
        while (c2584Vs0.a() > 0) {
            int i = this.e;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        int iMin = Math.min(c2584Vs0.a(), this.j - this.f);
                        this.d.c(c2584Vs0, iMin);
                        int i2 = this.f + iMin;
                        this.f = i2;
                        int i3 = this.j;
                        if (i2 == i3) {
                            this.d.a(this.k, 1, i3, 0, null);
                            this.k += this.h;
                            this.e = 0;
                        }
                    }
                } else if (f(c2584Vs0, this.a.a, 18)) {
                    g();
                    this.a.J(0);
                    this.d.c(this.a, 18);
                    this.e = 2;
                }
            } else if (h(c2584Vs0)) {
                this.e = 1;
            }
        }
    }

    @Override // com.daaw.InterfaceC9543xF
    public void b() {
        this.e = 0;
        this.f = 0;
        this.g = 0;
    }

    @Override // com.daaw.InterfaceC9543xF
    public void d(InterfaceC9838yJ interfaceC9838yJ, InterfaceC8103s61.d dVar) {
        dVar.a();
        this.c = dVar.b();
        this.d = interfaceC9838yJ.a(dVar.c(), 1);
    }

    @Override // com.daaw.InterfaceC9543xF
    public void e(long j, boolean z) {
        this.k = j;
    }

    @Override // com.daaw.InterfaceC9543xF
    public void c() {
    }
}
