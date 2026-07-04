package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public final class CH1 extends ZG1 {
    public final /* synthetic */ FH1 B;

    public /* synthetic */ CH1(FH1 fh1, BH1 bh1) {
        this.B = fh1;
    }

    @Override // com.daaw.InterfaceC3112aH1
    public final void L2(QG1 qg1, String str) {
        FH1 fh1 = this.B;
        if (fh1.b == null) {
            return;
        }
        fh1.b.onCustomClick(fh1.f(qg1), str);
    }
}
