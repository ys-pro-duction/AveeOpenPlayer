package com.daaw;

import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class J7 implements LQ {
    public final Map B;

    public J7(Map map) {
        this.B = map;
    }

    @Override // com.daaw.LQ
    public Object invoke() {
        return Integer.valueOf(N7.j(this.B));
    }
}
