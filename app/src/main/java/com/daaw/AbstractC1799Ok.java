package com.daaw;

import com.daaw.C0833Fc0;
import com.google.android.exoplayer2.Format;

/* JADX INFO: renamed from: com.daaw.Ok, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1799Ok implements C0833Fc0.c {
    public final C2907Yv a;
    public final int b;
    public final Format c;
    public final int d;
    public final Object e;
    public final long f;
    public final long g;
    public final InterfaceC2595Vv h;

    public AbstractC1799Ok(InterfaceC2595Vv interfaceC2595Vv, C2907Yv c2907Yv, int i, Format format, int i2, Object obj, long j, long j2) {
        this.h = (InterfaceC2595Vv) AbstractC7115ob.e(interfaceC2595Vv);
        this.a = (C2907Yv) AbstractC7115ob.e(c2907Yv);
        this.b = i;
        this.c = format;
        this.d = i2;
        this.e = obj;
        this.f = j;
        this.g = j2;
    }

    public abstract long c();

    public final long d() {
        return this.g - this.f;
    }
}
