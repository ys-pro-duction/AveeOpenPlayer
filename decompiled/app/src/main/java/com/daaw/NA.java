package com.daaw;

import com.daaw.QA;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class NA implements LQ {
    public final List B;

    public NA(List list) {
        this.B = list;
    }

    @Override // com.daaw.LQ
    public Object invoke() {
        return QA.a.B(this.B);
    }
}
