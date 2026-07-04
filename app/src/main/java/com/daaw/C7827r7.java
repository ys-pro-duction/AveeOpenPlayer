package com.daaw;

/* JADX INFO: renamed from: com.daaw.r7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7827r7 extends AbstractC8664u7 {
    public float a;
    public final int b;

    public C7827r7(float f) {
        super(null);
        this.a = f;
        this.b = 1;
    }

    @Override // com.daaw.AbstractC8664u7
    public float a(int i) {
        if (i == 0) {
            return this.a;
        }
        return 0.0f;
    }

    @Override // com.daaw.AbstractC8664u7
    public int b() {
        return this.b;
    }

    @Override // com.daaw.AbstractC8664u7
    public void d() {
        this.a = 0.0f;
    }

    @Override // com.daaw.AbstractC8664u7
    public void e(int i, float f) {
        if (i == 0) {
            this.a = f;
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof C7827r7) && ((C7827r7) obj).a == this.a;
    }

    public final float f() {
        return this.a;
    }

    @Override // com.daaw.AbstractC8664u7
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public C7827r7 c() {
        return new C7827r7(0.0f);
    }

    public int hashCode() {
        return Float.floatToIntBits(this.a);
    }

    public String toString() {
        return G10.n("AnimationVector1D: value = ", Float.valueOf(this.a));
    }
}
