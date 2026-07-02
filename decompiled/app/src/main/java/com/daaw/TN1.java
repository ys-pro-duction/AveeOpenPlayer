package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public final class TN1 extends ZG1 {
    public final /* synthetic */ WN1 B;

    public /* synthetic */ TN1(WN1 wn1, SN1 sn1) {
        this.B = wn1;
    }

    @Override // com.daaw.InterfaceC3112aH1
    public final void L2(QG1 qg1, String str) {
        WN1 wn1 = this.B;
        if (wn1.b == null) {
            return;
        }
        wn1.b.onCustomClick(wn1.f(qg1), str);
    }
}
