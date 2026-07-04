package com.daaw;

/* JADX INFO: renamed from: com.daaw.uy1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8908uy1 extends AbstractCallableC3025Zy1 {
    public C8908uy1(C2813Xx1 c2813Xx1, String str, String str2, C9733xv1 c9733xv1, int i, int i2) {
        super(c2813Xx1, "ZHFOx+FjaOsul7gEkIcfA8auDnyRWXmT0qbiHVEO6U1RLulNSOFK3tPEgm+pvQxr", "RSyr2AK130nKbepDTsaNV0Uv17TWUb4O6ebIiV3GgVs=", c9733xv1, i, 5);
    }

    @Override // com.daaw.AbstractCallableC3025Zy1
    public final void a() {
        this.e.n0(-1L);
        this.e.m0(-1L);
        int[] iArr = (int[]) this.f.invoke(null, this.b.b());
        synchronized (this.e) {
            try {
                this.e.n0(iArr[0]);
                this.e.m0(iArr[1]);
                int i = iArr[2];
                if (i != Integer.MIN_VALUE) {
                    this.e.l0(i);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
