package com.daaw;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes4.dex */
public class HF0 implements NQ {
    public final IF0 B;

    public HF0(IF0 if0) {
        this.B = if0;
    }

    @Override // com.daaw.NQ
    public Object invoke(Object obj) {
        return Boolean.valueOf(IF0.T(this.B, (Method) obj));
    }
}
