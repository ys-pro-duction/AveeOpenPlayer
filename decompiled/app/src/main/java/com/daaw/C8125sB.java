package com.daaw;

import com.daaw.AbstractC3922dB;

/* JADX INFO: renamed from: com.daaw.sB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C8125sB implements LQ {
    public final AbstractC3922dB.c B;
    public final AbstractC3922dB C;

    public C8125sB(AbstractC3922dB.c cVar, AbstractC3922dB abstractC3922dB) {
        this.B = cVar;
        this.C = abstractC3922dB;
    }

    @Override // com.daaw.LQ
    public Object invoke() {
        return AbstractC3922dB.c.u(this.B, this.C);
    }
}
