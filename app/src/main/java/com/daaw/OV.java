package com.daaw;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public abstract class OV extends C5510ir implements MV {
    public C5510ir[] w0 = new C5510ir[4];
    public int x0 = 0;

    @Override // com.daaw.MV
    public void a() {
        this.x0 = 0;
        Arrays.fill(this.w0, (Object) null);
    }

    @Override // com.daaw.MV
    public void c(C5510ir c5510ir) {
        if (c5510ir == this || c5510ir == null) {
            return;
        }
        int i = this.x0 + 1;
        C5510ir[] c5510irArr = this.w0;
        if (i > c5510irArr.length) {
            this.w0 = (C5510ir[]) Arrays.copyOf(c5510irArr, c5510irArr.length * 2);
        }
        C5510ir[] c5510irArr2 = this.w0;
        int i2 = this.x0;
        c5510irArr2[i2] = c5510ir;
        this.x0 = i2 + 1;
    }

    @Override // com.daaw.MV
    public void b(C5791jr c5791jr) {
    }
}
