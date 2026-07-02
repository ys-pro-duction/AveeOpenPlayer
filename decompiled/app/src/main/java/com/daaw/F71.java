package com.daaw;

/* JADX INFO: loaded from: classes4.dex */
public class F71 implements NQ {
    public final K71 B;

    public F71(K71 k71) {
        this.B = k71;
    }

    @Override // com.daaw.NQ
    public Object invoke(Object obj) {
        return K71.f(this.B, ((Number) obj).intValue());
    }
}
