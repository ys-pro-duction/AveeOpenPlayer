package com.daaw;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class KO1 extends DO1 {
    public final /* synthetic */ List B;

    public KO1(MO1 mo1, List list) {
        this.B = list;
    }

    @Override // com.daaw.EO1
    public final void a(String str) {
        AbstractC4274eT1.zzg("Error recording click: ".concat(String.valueOf(str)));
    }

    @Override // com.daaw.EO1
    public final void s0(List list) {
        AbstractC4274eT1.zzi("Recorded click: ".concat(this.B.toString()));
    }
}
