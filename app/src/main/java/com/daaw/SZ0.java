package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public abstract class SZ0 extends AbstractC1623Ms implements InterfaceC7353pR {
    public final int E;

    public SZ0(int i, InterfaceC1416Ks interfaceC1416Ks) {
        super(interfaceC1416Ks);
        this.E = i;
    }

    @Override // com.daaw.InterfaceC7353pR
    public int getArity() {
        return this.E;
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
