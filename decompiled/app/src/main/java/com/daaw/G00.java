package com.daaw;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public final class G00 extends A00 {
    public final int B;
    public final int C;
    public boolean D;
    public int E;

    public G00(int i, int i2, int i3) {
        this.B = i3;
        this.C = i2;
        boolean z = false;
        if (i3 <= 0 ? i >= i2 : i <= i2) {
            z = true;
        }
        this.D = z;
        this.E = z ? i : i2;
    }

    @Override // com.daaw.A00
    public int b() {
        int i = this.E;
        if (i != this.C) {
            this.E = this.B + i;
            return i;
        }
        if (!this.D) {
            throw new NoSuchElementException();
        }
        this.D = false;
        return i;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.D;
    }
}
