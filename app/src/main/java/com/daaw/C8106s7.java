package com.daaw;

/* JADX INFO: renamed from: com.daaw.s7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C8106s7 extends AbstractC8664u7 {
    public float a;
    public float b;
    public final int c;

    public C8106s7(float f, float f2) {
        super(null);
        this.a = f;
        this.b = f2;
        this.c = 2;
    }

    @Override // com.daaw.AbstractC8664u7
    public float a(int i) {
        if (i == 0) {
            return this.a;
        }
        if (i != 1) {
            return 0.0f;
        }
        return this.b;
    }

    @Override // com.daaw.AbstractC8664u7
    public int b() {
        return this.c;
    }

    @Override // com.daaw.AbstractC8664u7
    public void d() {
        this.a = 0.0f;
        this.b = 0.0f;
    }

    @Override // com.daaw.AbstractC8664u7
    public void e(int i, float f) {
        if (i == 0) {
            this.a = f;
        } else {
            if (i != 1) {
                return;
            }
            this.b = f;
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C8106s7)) {
            return false;
        }
        C8106s7 c8106s7 = (C8106s7) obj;
        return c8106s7.a == this.a && c8106s7.b == this.b;
    }

    public final float f() {
        return this.a;
    }

    public final float g() {
        return this.b;
    }

    @Override // com.daaw.AbstractC8664u7
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public C8106s7 c() {
        return new C8106s7(0.0f, 0.0f);
    }

    public int hashCode() {
        return (Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b);
    }

    public String toString() {
        return "AnimationVector2D: v1 = " + this.a + ", v2 = " + this.b;
    }
}
