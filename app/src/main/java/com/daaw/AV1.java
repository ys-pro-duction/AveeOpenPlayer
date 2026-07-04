package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public final class AV1 extends AbstractC9330wV1 {
    public AV1(FU1 fu1) {
        super(fu1);
    }

    @Override // com.daaw.AbstractC9330wV1
    public final boolean v(String str) {
        String strI = XS1.i(str);
        FU1 fu1 = (FU1) this.D.get();
        if (fu1 != null && strI != null) {
            fu1.i(strI, this);
        }
        AbstractC4274eT1.zzj("VideoStreamNoopCache is doing nothing.");
        m(str, strI, "noop", "Noop cache is a noop.");
        return false;
    }

    @Override // com.daaw.AbstractC9330wV1
    public final void k() {
    }
}
