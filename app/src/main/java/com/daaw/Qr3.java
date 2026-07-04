package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public final class Qr3 implements Comparable {
    public final boolean B;
    public final boolean C;

    public Qr3(C2485Ut1 c2485Ut1, int i) {
        this.B = 1 == (c2485Ut1.d & 1);
        this.C = C8877us3.s(i, false);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(Qr3 qr3) {
        return DP2.i().d(this.C, qr3.C).d(this.B, qr3.B).a();
    }
}
