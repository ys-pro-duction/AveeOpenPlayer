package com.daaw;

import java.io.Serializable;

/* JADX INFO: renamed from: com.daaw.mE0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6465mE0 {
    public static final a B = new a(null);
    public static final AbstractC6465mE0 C = AbstractC2904Yu0.a.b();

    /* JADX INFO: renamed from: com.daaw.mE0$a */
    public static final class a extends AbstractC6465mE0 implements Serializable {
        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        @Override // com.daaw.AbstractC6465mE0
        public int b(int i) {
            return AbstractC6465mE0.C.b(i);
        }

        @Override // com.daaw.AbstractC6465mE0
        public int c() {
            return AbstractC6465mE0.C.c();
        }

        @Override // com.daaw.AbstractC6465mE0
        public int d(int i) {
            return AbstractC6465mE0.C.d(i);
        }

        @Override // com.daaw.AbstractC6465mE0
        public long e() {
            return AbstractC6465mE0.C.e();
        }

        @Override // com.daaw.AbstractC6465mE0
        public long f(long j, long j2) {
            return AbstractC6465mE0.C.f(j, j2);
        }

        public a() {
        }
    }

    public abstract int b(int i);

    public abstract int c();

    public abstract int d(int i);

    public abstract long e();

    public long f(long j, long j2) {
        long jE;
        long j3;
        long jB;
        int iC;
        AbstractC7302pE0.b(j, j2);
        long j4 = j2 - j;
        if (j4 > 0) {
            if (((-j4) & j4) == j4) {
                int i = (int) j4;
                int i2 = (int) (j4 >>> 32);
                if (i != 0) {
                    iC = b(AbstractC7302pE0.c(i));
                } else if (i2 == 1) {
                    iC = c();
                } else {
                    jB = (((long) b(AbstractC7302pE0.c(i2))) << 32) + (((long) c()) & 4294967295L);
                }
                jB = ((long) iC) & 4294967295L;
            } else {
                do {
                    jE = e() >>> 1;
                    j3 = jE % j4;
                } while ((jE - j3) + (j4 - 1) < 0);
                jB = j3;
            }
            return j + jB;
        }
        while (true) {
            long jE2 = e();
            if (j <= jE2 && jE2 < j2) {
                return jE2;
            }
        }
    }
}
