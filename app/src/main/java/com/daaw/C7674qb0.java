package com.daaw;

/* JADX INFO: renamed from: com.daaw.qb0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7674qb0 implements InterfaceC6258lW0 {
    public final O90 B;

    public C7674qb0(LQ lq) {
        G10.g(lq, "valueProducer");
        this.B = AbstractC3192ab0.a(lq);
    }

    public final Object e() {
        return this.B.getValue();
    }

    @Override // com.daaw.InterfaceC6258lW0
    public Object getValue() {
        return e();
    }
}
