package com.daaw;

import com.google.android.exoplayer2.Format;

/* JADX INFO: renamed from: com.daaw.bi0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3506bi0 extends AbstractC1799Ok {
    public final long i;

    public AbstractC3506bi0(InterfaceC2595Vv interfaceC2595Vv, C2907Yv c2907Yv, Format format, int i, Object obj, long j, long j2, long j3) {
        super(interfaceC2595Vv, c2907Yv, 1, format, i, obj, j, j2);
        AbstractC7115ob.e(format);
        this.i = j3;
    }

    public long e() {
        long j = this.i;
        if (j != -1) {
            return j + 1;
        }
        return -1L;
    }

    public abstract boolean f();
}
