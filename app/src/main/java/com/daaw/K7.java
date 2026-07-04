package com.daaw;

import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class K7 implements LQ {
    public final Class B;
    public final Map C;

    public K7(Class cls, Map map) {
        this.B = cls;
        this.C = map;
    }

    @Override // com.daaw.LQ
    public Object invoke() {
        return N7.l(this.B, this.C);
    }
}
