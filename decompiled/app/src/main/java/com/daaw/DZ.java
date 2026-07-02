package com.daaw;

import com.google.android.exoplayer2.Format;

/* JADX INFO: loaded from: classes.dex */
public final class DZ extends AbstractC1799Ok {
    public final C1903Pk i;
    public volatile int j;
    public volatile boolean k;

    public DZ(InterfaceC2595Vv interfaceC2595Vv, C2907Yv c2907Yv, Format format, int i, Object obj, C1903Pk c1903Pk) {
        super(interfaceC2595Vv, c2907Yv, 2, format, i, obj, -9223372036854775807L, -9223372036854775807L);
        this.i = c1903Pk;
    }

    @Override // com.daaw.C0833Fc0.c
    public void a() {
        C2907Yv c2907YvB = this.a.b(this.j);
        try {
            InterfaceC2595Vv interfaceC2595Vv = this.h;
            C5536ix c5536ix = new C5536ix(interfaceC2595Vv, c2907YvB.c, interfaceC2595Vv.d(c2907YvB));
            if (this.j == 0) {
                this.i.e(null, -9223372036854775807L);
            }
            try {
                InterfaceC8715uJ interfaceC8715uJ = this.i.B;
                int iD = 0;
                while (iD == 0 && !this.k) {
                    iD = interfaceC8715uJ.d(c5536ix, null);
                }
                AbstractC7115ob.f(iD != 1);
                this.j = (int) (c5536ix.getPosition() - this.a.c);
            } catch (Throwable th) {
                this.j = (int) (c5536ix.getPosition() - this.a.c);
                throw th;
            }
        } finally {
            AbstractC6280lb1.h(this.h);
        }
    }

    @Override // com.daaw.C0833Fc0.c
    public void b() {
        this.k = true;
    }

    @Override // com.daaw.AbstractC1799Ok
    public long c() {
        return this.j;
    }
}
