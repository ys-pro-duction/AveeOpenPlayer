package com.daaw;

/* JADX INFO: renamed from: com.daaw.eh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4335eh {
    public int B;

    public final void k(int i) {
        this.B = i | this.B;
    }

    public void l() {
        this.B = 0;
    }

    public final void m(int i) {
        this.B = (~i) & this.B;
    }

    public final boolean n(int i) {
        return (this.B & i) == i;
    }

    public final boolean o() {
        return n(Integer.MIN_VALUE);
    }

    public final boolean p() {
        return n(4);
    }

    public final boolean q() {
        return n(1);
    }

    public final void r(int i) {
        this.B = i;
    }
}
