package com.daaw;

import android.text.Layout;

/* JADX INFO: renamed from: com.daaw.Pj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1899Pj extends C1631Mu implements Comparable {
    public final int P;

    public C1899Pj(CharSequence charSequence, Layout.Alignment alignment, float f, int i, int i2, float f2, int i3, float f3, boolean z, int i4, int i5) {
        super(charSequence, alignment, f, i, i2, f2, i3, f3, z, i4);
        this.P = i5;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(C1899Pj c1899Pj) {
        int i = c1899Pj.P;
        int i2 = this.P;
        if (i < i2) {
            return -1;
        }
        return i > i2 ? 1 : 0;
    }
}
