package com.daaw;

import com.daaw.U30;

/* JADX INFO: renamed from: com.daaw.i90, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5318i90 implements AG0 {
    public final InterfaceC3429bR a;
    public final InterfaceC7484pt b;
    public U30 c;

    public C5318i90(InterfaceC4684ft interfaceC4684ft, InterfaceC3429bR interfaceC3429bR) {
        G10.g(interfaceC4684ft, "parentCoroutineContext");
        G10.g(interfaceC3429bR, "task");
        this.a = interfaceC3429bR;
        this.b = AbstractC7763qt.a(interfaceC4684ft);
    }

    @Override // com.daaw.AG0
    public void b() {
        U30 u30 = this.c;
        if (u30 != null) {
            U30.a.a(u30, null, 1, null);
        }
        this.c = null;
    }

    @Override // com.daaw.AG0
    public void c() {
        U30 u30 = this.c;
        if (u30 != null) {
            U30.a.a(u30, null, 1, null);
        }
        this.c = null;
    }

    @Override // com.daaw.AG0
    public void d() {
        U30 u30 = this.c;
        if (u30 != null) {
            AbstractC3332b40.f(u30, "Old job was still running!", null, 2, null);
        }
        this.c = AbstractC9104vh.d(this.b, null, null, this.a, 3, null);
    }
}
