package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public final class Nf3 extends Jp3 {
    public final Q42 g;

    public Nf3(Qf3 qf3, AbstractC8657u52 abstractC8657u52) {
        super(abstractC8657u52);
        this.g = new Q42();
    }

    @Override // com.daaw.Jp3, com.daaw.AbstractC8657u52
    public final H32 d(int i, H32 h32, boolean z) {
        H32 h32D = this.f.d(i, h32, z);
        if (this.f.e(h32D.c, this.g, 0L).b()) {
            h32D.l(h32.a, h32.b, h32.c, h32.d, 0L, B82.e, true);
            return h32D;
        }
        h32D.f = true;
        return h32D;
    }
}
