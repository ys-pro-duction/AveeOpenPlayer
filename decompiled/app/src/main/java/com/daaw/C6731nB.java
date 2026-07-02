package com.daaw;

import com.daaw.AbstractC3922dB;

/* JADX INFO: renamed from: com.daaw.nB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C6731nB implements LQ {
    public final AbstractC3922dB.b B;
    public final AbstractC3922dB C;

    public C6731nB(AbstractC3922dB.b bVar, AbstractC3922dB abstractC3922dB) {
        this.B = bVar;
        this.C = abstractC3922dB;
    }

    @Override // com.daaw.LQ
    public Object invoke() {
        return AbstractC3922dB.b.P(this.B, this.C);
    }
}
