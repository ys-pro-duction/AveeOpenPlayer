package com.daaw;

import com.daaw.InterfaceC8103s61;
import com.google.android.exoplayer2.Format;

/* JADX INFO: loaded from: classes.dex */
public final class QX implements InterfaceC9543xF {
    public final C2584Vs0 a = new C2584Vs0(10);
    public Z41 b;
    public boolean c;
    public long d;
    public int e;
    public int f;

    @Override // com.daaw.InterfaceC9543xF
    public void a(C2584Vs0 c2584Vs0) {
        if (this.c) {
            int iA = c2584Vs0.a();
            int i = this.f;
            if (i < 10) {
                int iMin = Math.min(iA, 10 - i);
                System.arraycopy(c2584Vs0.a, c2584Vs0.c(), this.a.a, this.f, iMin);
                if (this.f + iMin == 10) {
                    this.a.J(0);
                    if (73 != this.a.x() || 68 != this.a.x() || 51 != this.a.x()) {
                        this.c = false;
                        return;
                    } else {
                        this.a.K(3);
                        this.e = this.a.w() + 10;
                    }
                }
            }
            int iMin2 = Math.min(iA, this.e - this.f);
            this.b.c(c2584Vs0, iMin2);
            this.f += iMin2;
        }
    }

    @Override // com.daaw.InterfaceC9543xF
    public void b() {
        this.c = false;
    }

    @Override // com.daaw.InterfaceC9543xF
    public void c() {
        int i;
        if (this.c && (i = this.e) != 0 && this.f == i) {
            this.b.a(this.d, 1, i, 0, null);
            this.c = false;
        }
    }

    @Override // com.daaw.InterfaceC9543xF
    public void d(InterfaceC9838yJ interfaceC9838yJ, InterfaceC8103s61.d dVar) {
        dVar.a();
        Z41 z41A = interfaceC9838yJ.a(dVar.c(), 4);
        this.b = z41A;
        z41A.d(Format.o(dVar.b(), "application/id3", null, -1, null));
    }

    @Override // com.daaw.InterfaceC9543xF
    public void e(long j, boolean z) {
        if (z) {
            this.c = true;
            this.d = j;
            this.e = 0;
            this.f = 0;
        }
    }
}
