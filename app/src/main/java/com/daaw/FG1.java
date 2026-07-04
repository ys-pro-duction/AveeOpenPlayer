package com.daaw;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public final class FG1 extends PH1 {
    public int B = 0;
    public final int C;
    public final /* synthetic */ BM1 D;

    public FG1(BM1 bm1) {
        this.D = bm1;
        this.C = bm1.s();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.B < this.C;
    }

    @Override // com.daaw.InterfaceC3399bJ1
    public final byte zza() {
        int i = this.B;
        if (i >= this.C) {
            throw new NoSuchElementException();
        }
        this.B = i + 1;
        return this.D.q(i);
    }
}
