package com.daaw;

import java.util.Random;

/* JADX INFO: renamed from: com.daaw.c0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3589c0 extends AbstractC6465mE0 {
    @Override // com.daaw.AbstractC6465mE0
    public int b(int i) {
        return AbstractC7302pE0.e(g().nextInt(), i);
    }

    @Override // com.daaw.AbstractC6465mE0
    public int c() {
        return g().nextInt();
    }

    @Override // com.daaw.AbstractC6465mE0
    public int d(int i) {
        return g().nextInt(i);
    }

    @Override // com.daaw.AbstractC6465mE0
    public long e() {
        return g().nextLong();
    }

    public abstract Random g();
}
