package com.daaw;

/* JADX INFO: loaded from: classes.dex */
public final class YZ implements XZ {
    public final NQ a;
    public final InterfaceC8007rm0 b;

    public /* synthetic */ YZ(int i, NQ nq, AbstractC2911Yw abstractC2911Yw) {
        this(i, nq);
    }

    @Override // com.daaw.XZ
    public int a() {
        return ((WZ) this.b.getValue()).i();
    }

    public void b(int i) {
        this.b.setValue(WZ.c(i));
    }

    public YZ(int i, NQ nq) {
        this.a = nq;
        this.b = AbstractC9046vU0.d(WZ.c(i), null, 2, null);
    }
}
