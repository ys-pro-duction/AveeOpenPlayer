package com.daaw;

import com.daaw.H3;

/* JADX INFO: renamed from: com.daaw.mf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6577mf implements H3 {
    public final float b;
    public final float c;

    /* JADX INFO: renamed from: com.daaw.mf$a */
    public static final class a implements H3.b {
        public final float a;

        public a(float f) {
            this.a = f;
        }

        @Override // com.daaw.H3.b
        public int a(int i, int i2, EnumC7560q90 enumC7560q90) {
            G10.g(enumC7560q90, "layoutDirection");
            return AbstractC8261sh0.b(((i2 - i) / 2.0f) * (1 + (enumC7560q90 == EnumC7560q90.Ltr ? this.a : (-1) * this.a)));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && G10.c(Float.valueOf(this.a), Float.valueOf(((a) obj).a));
        }

        public int hashCode() {
            return Float.floatToIntBits(this.a);
        }

        public String toString() {
            return "Horizontal(bias=" + this.a + ')';
        }
    }

    /* JADX INFO: renamed from: com.daaw.mf$b */
    public static final class b implements H3.c {
        public final float a;

        public b(float f) {
            this.a = f;
        }

        @Override // com.daaw.H3.c
        public int a(int i, int i2) {
            return AbstractC8261sh0.b(((i2 - i) / 2.0f) * (1 + this.a));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && G10.c(Float.valueOf(this.a), Float.valueOf(((b) obj).a));
        }

        public int hashCode() {
            return Float.floatToIntBits(this.a);
        }

        public String toString() {
            return "Vertical(bias=" + this.a + ')';
        }
    }

    public C6577mf(float f, float f2) {
        this.b = f;
        this.c = f2;
    }

    @Override // com.daaw.H3
    public long a(long j, long j2, EnumC7560q90 enumC7560q90) {
        G10.g(enumC7560q90, "layoutDirection");
        float fG = (I00.g(j2) - I00.g(j)) / 2.0f;
        float f = (I00.f(j2) - I00.f(j)) / 2.0f;
        float f2 = 1;
        return E00.a(AbstractC8261sh0.b(fG * ((enumC7560q90 == EnumC7560q90.Ltr ? this.b : (-1) * this.b) + f2)), AbstractC8261sh0.b(f * (f2 + this.c)));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6577mf)) {
            return false;
        }
        C6577mf c6577mf = (C6577mf) obj;
        return G10.c(Float.valueOf(this.b), Float.valueOf(c6577mf.b)) && G10.c(Float.valueOf(this.c), Float.valueOf(c6577mf.c));
    }

    public int hashCode() {
        return (Float.floatToIntBits(this.b) * 31) + Float.floatToIntBits(this.c);
    }

    public String toString() {
        return "BiasAlignment(horizontalBias=" + this.b + ", verticalBias=" + this.c + ')';
    }
}
