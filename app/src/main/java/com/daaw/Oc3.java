package com.daaw;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public final class Oc3 extends Vc3 {
    public int B = 0;
    public final int C;
    public final /* synthetic */ AbstractC9646xd3 D;

    public Oc3(AbstractC9646xd3 abstractC9646xd3) {
        this.D = abstractC9646xd3;
        this.C = abstractC9646xd3.s();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.B < this.C;
    }

    @Override // com.daaw.InterfaceC3484bd3
    public final byte zza() {
        int i = this.B;
        if (i >= this.C) {
            throw new NoSuchElementException();
        }
        this.B = i + 1;
        return this.D.q(i);
    }
}
