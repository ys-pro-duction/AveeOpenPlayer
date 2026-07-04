package com.daaw;

import com.daaw.QA;

/* JADX INFO: loaded from: classes4.dex */
public class SA implements NQ {
    public final QA.c B;
    public final QA C;

    public SA(QA.c cVar, QA qa) {
        this.B = cVar;
        this.C = qa;
    }

    @Override // com.daaw.NQ
    public Object invoke(Object obj) {
        return QA.c.f(this.B, this.C, (C2352Tm0) obj);
    }
}
