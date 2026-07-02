package com.daaw;

/* JADX INFO: renamed from: com.daaw.eJ0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4233eJ0 extends AbstractC3955dJ0 implements InterfaceC7353pR {
    public final int C;

    public AbstractC4233eJ0(int i, InterfaceC1416Ks interfaceC1416Ks) {
        super(interfaceC1416Ks);
        this.C = i;
    }

    @Override // com.daaw.InterfaceC7353pR
    public int getArity() {
        return this.C;
    }

    @Override // com.daaw.AbstractC7409pe
    public String toString() {
        if (l() != null) {
            return super.toString();
        }
        String strI = AbstractC5624jG0.i(this);
        G10.f(strI, "renderLambdaToString(...)");
        return strI;
    }
}
