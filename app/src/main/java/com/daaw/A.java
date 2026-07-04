package com.daaw;

/* JADX INFO: loaded from: classes4.dex */
public class A implements NQ {
    public final B B;

    public A(B b) {
        this.B = b;
    }

    @Override // com.daaw.NQ
    public Object invoke(Object obj) {
        return B.f(this.B, (AP) obj);
    }
}
