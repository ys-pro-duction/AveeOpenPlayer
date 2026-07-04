package com.daaw;

/* JADX INFO: loaded from: classes4.dex */
public class G71 implements NQ {
    public final K71 B;

    public G71(K71 k71) {
        this.B = k71;
    }

    @Override // com.daaw.NQ
    public Object invoke(Object obj) {
        return K71.v(this.B, ((Number) obj).intValue());
    }
}
