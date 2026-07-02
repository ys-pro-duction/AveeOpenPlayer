package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public final class Fa3 implements Runnable {
    public final /* synthetic */ boolean B;
    public final /* synthetic */ Oa3 C;

    public Fa3(Oa3 oa3, boolean z) {
        this.C = oa3;
        this.B = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zK = this.C.a.k();
        boolean zJ = this.C.a.j();
        this.C.a.g(this.B);
        if (zJ == this.B) {
            this.C.a.w().s().b("Default data collection state already set to", Boolean.valueOf(this.B));
        }
        if (this.C.a.k() == zK || this.C.a.k() != this.C.a.j()) {
            this.C.a.w().u().c("Default data collection is different than actual status", Boolean.valueOf(this.B), Boolean.valueOf(zK));
        }
        this.C.P();
    }
}
