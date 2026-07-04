package com.daaw;

import java.io.Serializable;
import java.util.Comparator;

/* JADX INFO: renamed from: com.daaw.Sb1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2203Sb1 implements Serializable {
    public static final a D = new a(null);
    public static final C2203Sb1 E = new C2203Sb1(0, 0);
    public static final Comparator F = new Comparator() { // from class: com.daaw.Rb1
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return C2203Sb1.b((C2203Sb1) obj, (C2203Sb1) obj2);
        }
    };
    public final long B;
    public final long C;

    /* JADX INFO: renamed from: com.daaw.Sb1$a */
    public static final class a {
        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public final C2203Sb1 a(byte[] bArr) {
            G10.g(bArr, "byteArray");
            if (bArr.length == 16) {
                return b(AbstractC2413Ub1.e(bArr, 0), AbstractC2413Ub1.e(bArr, 8));
            }
            throw new IllegalArgumentException("Expected exactly 16 bytes");
        }

        public final C2203Sb1 b(long j, long j2) {
            return (j == 0 && j2 == 0) ? c() : new C2203Sb1(j, j2);
        }

        public final C2203Sb1 c() {
            return C2203Sb1.E;
        }

        public final C2203Sb1 d() {
            return AbstractC2309Tb1.a();
        }

        public a() {
        }
    }

    public C2203Sb1(long j, long j2) {
        this.B = j;
        this.C = j2;
    }

    public static final int b(C2203Sb1 c2203Sb1, C2203Sb1 c2203Sb12) {
        long j = c2203Sb1.B;
        return j != c2203Sb12.B ? Long.compare(C6724n91.c(j) ^ Long.MIN_VALUE, C6724n91.c(c2203Sb12.B) ^ Long.MIN_VALUE) : Long.compare(C6724n91.c(c2203Sb1.C) ^ Long.MIN_VALUE, C6724n91.c(c2203Sb12.C) ^ Long.MIN_VALUE);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2203Sb1)) {
            return false;
        }
        C2203Sb1 c2203Sb1 = (C2203Sb1) obj;
        return this.B == c2203Sb1.B && this.C == c2203Sb1.C;
    }

    public int hashCode() {
        long j = this.B ^ this.C;
        return ((int) (j >> 32)) ^ ((int) j);
    }

    public String toString() {
        byte[] bArr = new byte[36];
        AbstractC2413Ub1.d(this.C, bArr, 24, 6);
        bArr[23] = 45;
        AbstractC2413Ub1.d(this.C >>> 48, bArr, 19, 2);
        bArr[18] = 45;
        AbstractC2413Ub1.d(this.B, bArr, 14, 2);
        bArr[13] = 45;
        AbstractC2413Ub1.d(this.B >>> 16, bArr, 9, 2);
        bArr[8] = 45;
        AbstractC2413Ub1.d(this.B >>> 32, bArr, 0, 4);
        return AY0.k(bArr);
    }
}
