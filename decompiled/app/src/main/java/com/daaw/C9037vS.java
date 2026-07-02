package com.daaw;

/* JADX INFO: renamed from: com.daaw.vS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C9037vS implements InterfaceC8489tW0 {
    public final C7521q11 a;

    public C9037vS(C7521q11 c7521q11) {
        this.a = c7521q11;
    }

    @Override // com.daaw.InterfaceC8489tW0
    public boolean a(Exception exc) {
        return false;
    }

    @Override // com.daaw.InterfaceC8489tW0
    public boolean b(AbstractC1836Ot0 abstractC1836Ot0) {
        if (!abstractC1836Ot0.l() && !abstractC1836Ot0.k() && !abstractC1836Ot0.i()) {
            return false;
        }
        this.a.e(abstractC1836Ot0.d());
        return true;
    }
}
