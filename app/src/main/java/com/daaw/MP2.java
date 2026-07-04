package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public final class MP2 extends HO2 {
    public final OP2 D;

    public MP2(OP2 op2, int i) {
        super(op2.size(), i);
        this.D = op2;
    }

    @Override // com.daaw.HO2
    public final Object a(int i) {
        return this.D.get(i);
    }
}
