package com.daaw;

import com.daaw.QA;

/* JADX INFO: loaded from: classes4.dex */
public class UA implements LQ {
    public final QA B;
    public final AA0 C;

    public UA(QA qa, AA0 aa0) {
        this.B = qa;
        this.C = aa0;
    }

    @Override // com.daaw.LQ
    public Object invoke() {
        return QA.c.g(this.B, this.C);
    }
}
