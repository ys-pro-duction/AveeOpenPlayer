package com.daaw;

/* JADX INFO: renamed from: com.daaw.q0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C7514q0 implements NQ {
    public final M71 B;
    public final I30[] C;

    public C7514q0(M71 m71, I30[] i30Arr) {
        this.B = m71;
        this.C = i30Arr;
    }

    @Override // com.daaw.NQ
    public Object invoke(Object obj) {
        return AbstractC8071s0.e(this.B, this.C, ((Number) obj).intValue());
    }
}
