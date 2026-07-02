package com.daaw;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: com.daaw.m33, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6417m33 extends AbstractC6975o33 {
    public int B = 0;
    public final int C;
    public final /* synthetic */ AbstractC9213w33 D;

    public C6417m33(AbstractC9213w33 abstractC9213w33) {
        this.D = abstractC9213w33;
        this.C = abstractC9213w33.y();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.B < this.C;
    }

    @Override // com.daaw.InterfaceC7533q33
    public final byte zza() {
        int i = this.B;
        if (i >= this.C) {
            throw new NoSuchElementException();
        }
        this.B = i + 1;
        return this.D.s(i);
    }
}
