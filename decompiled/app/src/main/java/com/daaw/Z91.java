package com.daaw;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class Z91 implements O90, Serializable {
    public LQ B;
    public Object C;

    public Z91(LQ lq) {
        G10.g(lq, "initializer");
        this.B = lq;
        this.C = C7282p91.a;
    }

    public boolean a() {
        return this.C != C7282p91.a;
    }

    @Override // com.daaw.O90
    public Object getValue() {
        if (this.C == C7282p91.a) {
            LQ lq = this.B;
            G10.d(lq);
            this.C = lq.invoke();
            this.B = null;
        }
        return this.C;
    }

    public String toString() {
        return a() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
