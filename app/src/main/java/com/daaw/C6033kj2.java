package com.daaw;

import java.util.Map;

/* JADX INFO: renamed from: com.daaw.kj2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6033kj2 implements ZH2 {
    public final Map B;
    public final C6454mB1 C;

    public C6033kj2(C6454mB1 c6454mB1, Map map) {
        this.B = map;
        this.C = c6454mB1;
    }

    @Override // com.daaw.ZH2
    public final void d(SH2 sh2, String str) {
        if (this.B.containsKey(sh2)) {
            this.C.c(((C5754jj2) this.B.get(sh2)).a);
        }
    }

    @Override // com.daaw.ZH2
    public final void m(SH2 sh2, String str) {
        if (this.B.containsKey(sh2)) {
            this.C.c(((C5754jj2) this.B.get(sh2)).b);
        }
    }

    @Override // com.daaw.ZH2
    public final void r(SH2 sh2, String str, Throwable th) {
        if (this.B.containsKey(sh2)) {
            this.C.c(((C5754jj2) this.B.get(sh2)).c);
        }
    }

    @Override // com.daaw.ZH2
    public final void l(SH2 sh2, String str) {
    }
}
