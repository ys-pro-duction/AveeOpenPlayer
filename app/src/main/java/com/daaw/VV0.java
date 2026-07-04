package com.daaw;

/* JADX INFO: loaded from: classes.dex */
public final class VV0 implements InterfaceC3784ci0 {
    public final InterfaceC5207hm B;
    public boolean C;
    public long D;
    public long E;
    public C9457ww0 F = C9457ww0.e;

    public VV0(InterfaceC5207hm interfaceC5207hm) {
        this.B = interfaceC5207hm;
    }

    public void a(long j) {
        this.D = j;
        if (this.C) {
            this.E = this.B.b();
        }
    }

    public void b() {
        if (this.C) {
            return;
        }
        this.E = this.B.b();
        this.C = true;
    }

    public void c() {
        if (this.C) {
            a(n());
            this.C = false;
        }
    }

    @Override // com.daaw.InterfaceC3784ci0
    public C9457ww0 d(C9457ww0 c9457ww0) {
        if (this.C) {
            a(n());
        }
        this.F = c9457ww0;
        return c9457ww0;
    }

    @Override // com.daaw.InterfaceC3784ci0
    public C9457ww0 g() {
        return this.F;
    }

    @Override // com.daaw.InterfaceC3784ci0
    public long n() {
        long j = this.D;
        if (!this.C) {
            return j;
        }
        long jB = this.B.b() - this.E;
        C9457ww0 c9457ww0 = this.F;
        return j + (c9457ww0.a == 1.0f ? AbstractC6025ki.a(jB) : c9457ww0.a(jB));
    }
}
