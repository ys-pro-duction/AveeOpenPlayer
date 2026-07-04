package com.daaw;

/* JADX INFO: renamed from: com.daaw.nr3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6920nr3 extends Ep3 {
    public final Xp3 k;

    public AbstractC6920nr3(Xp3 xp3) {
        this.k = xp3;
    }

    @Override // com.daaw.Ep3
    public final /* bridge */ /* synthetic */ int B(Object obj, int i) {
        return 0;
    }

    @Override // com.daaw.Ep3
    public final /* synthetic */ long C(Object obj, long j) {
        return j;
    }

    @Override // com.daaw.Ep3
    public final /* synthetic */ Vp3 D(Object obj, Vp3 vp3) {
        return E(vp3);
    }

    public abstract Vp3 E(Vp3 vp3);

    public abstract void F(AbstractC8657u52 abstractC8657u52);

    public abstract void G();

    @Override // com.daaw.Xp3
    public abstract void a(Tp3 tp3);

    @Override // com.daaw.Xp3
    public final YL1 g() {
        return this.k.g();
    }

    @Override // com.daaw.AbstractC7468pp3, com.daaw.Xp3
    public final AbstractC8657u52 k() {
        this.k.k();
        return null;
    }

    @Override // com.daaw.Ep3, com.daaw.AbstractC7468pp3
    public final void v(InterfaceC3917d93 interfaceC3917d93) {
        super.v(interfaceC3917d93);
        G();
    }

    @Override // com.daaw.Ep3
    public final /* synthetic */ void z(Object obj, Xp3 xp3, AbstractC8657u52 abstractC8657u52) {
        F(abstractC8657u52);
    }

    @Override // com.daaw.AbstractC7468pp3, com.daaw.Xp3
    public final boolean zzv() {
        this.k.zzv();
        return true;
    }
}
