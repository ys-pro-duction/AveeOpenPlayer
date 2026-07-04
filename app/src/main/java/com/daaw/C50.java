package com.daaw;

/* JADX INFO: loaded from: classes4.dex */
public class C50 implements LQ {
    public final H50 B;

    public C50(H50 h50) {
        this.B = h50;
    }

    @Override // com.daaw.LQ
    public Object invoke() {
        return Boolean.valueOf(H50.W(this.B));
    }
}
