package com.daaw;

import java.util.List;

/* JADX INFO: renamed from: com.daaw.Ub2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2414Ub2 {
    public final List a;
    public final C6487mJ2 b;
    public boolean c;

    public C2414Ub2(C4498fF2 c4498fF2, C6487mJ2 c6487mJ2) {
        this.a = c4498fF2.r;
        this.b = c6487mJ2;
    }

    public final void a() {
        if (this.c) {
            return;
        }
        this.b.d(this.a);
        this.c = true;
    }
}
