package com.daaw;

import java.io.Serializable;

/* JADX INFO: renamed from: com.daaw.e90, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4192e90 implements InterfaceC7353pR, Serializable {
    private final int arity;

    public AbstractC4192e90(int i) {
        this.arity = i;
    }

    @Override // com.daaw.InterfaceC7353pR
    public int getArity() {
        return this.arity;
    }

    public String toString() {
        String strJ = AbstractC5624jG0.j(this);
        G10.f(strJ, "renderLambdaToString(...)");
        return strJ;
    }
}
