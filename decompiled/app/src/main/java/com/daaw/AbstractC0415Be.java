package com.daaw;

import com.google.android.exoplayer2.Format;

/* JADX INFO: renamed from: com.daaw.Be, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0415Be extends AbstractC3506bi0 {
    public final long j;
    public C0519Ce k;
    public int[] l;

    public AbstractC0415Be(InterfaceC2595Vv interfaceC2595Vv, C2907Yv c2907Yv, Format format, int i, Object obj, long j, long j2, long j3, long j4) {
        super(interfaceC2595Vv, c2907Yv, format, i, obj, j, j2, j4);
        this.j = j3;
    }

    public final int g(int i) {
        return this.l[i];
    }

    public final C0519Ce h() {
        return this.k;
    }

    public void i(C0519Ce c0519Ce) {
        this.k = c0519Ce;
        this.l = c0519Ce.b();
    }
}
