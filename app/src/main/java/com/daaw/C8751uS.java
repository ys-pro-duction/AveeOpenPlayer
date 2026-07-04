package com.daaw;

/* JADX INFO: renamed from: com.daaw.uS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C8751uS implements InterfaceC8489tW0 {
    public final C0726Eb1 a;
    public final C7521q11 b;

    public C8751uS(C0726Eb1 c0726Eb1, C7521q11 c7521q11) {
        this.a = c0726Eb1;
        this.b = c7521q11;
    }

    @Override // com.daaw.InterfaceC8489tW0
    public boolean a(Exception exc) {
        this.b.d(exc);
        return true;
    }

    @Override // com.daaw.InterfaceC8489tW0
    public boolean b(AbstractC1836Ot0 abstractC1836Ot0) {
        if (!abstractC1836Ot0.k() || this.a.f(abstractC1836Ot0)) {
            return false;
        }
        this.b.c(AbstractC7236p00.a().b(abstractC1836Ot0.b()).d(abstractC1836Ot0.c()).c(abstractC1836Ot0.h()).a());
        return true;
    }
}
