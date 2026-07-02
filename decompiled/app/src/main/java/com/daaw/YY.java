package com.daaw;

/* JADX INFO: loaded from: classes.dex */
public final class YY {
    public float a;
    public long b = Long.MAX_VALUE;
    public float c = Float.NaN;
    public boolean d = true;

    public final void a(long j, float f) {
        if (this.b == Long.MAX_VALUE || Float.isNaN(this.c)) {
            this.b = j;
            this.c = f;
            return;
        }
        if (j == this.b) {
            this.c = f;
            return;
        }
        float fC = AbstractC8800ud1.c(this.a);
        float f2 = (f - this.c) / ((j - this.b) * 0.001f);
        float fAbs = this.a + ((f2 - fC) * Math.abs(f2));
        this.a = fAbs;
        if (this.d) {
            this.a = fAbs * 0.5f;
            this.d = false;
        }
        this.b = j;
        this.c = f;
    }

    public final float b() {
        return AbstractC8800ud1.c(this.a);
    }

    public final void c() {
        this.a = 0.0f;
        this.b = Long.MAX_VALUE;
        this.c = Float.NaN;
        this.d = true;
    }
}
