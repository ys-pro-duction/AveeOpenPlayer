package com.daaw;

/* JADX INFO: renamed from: com.daaw.kr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6079kr {
    public static final a b = new a(null);
    public static final int[] c = {18, 20, 17, 15};
    public static final int[] d = {65535, 262143, 32767, 8191};
    public static final int[] e = {32767, 8191, 65535, 262143};
    public final long a;

    /* JADX INFO: renamed from: com.daaw.kr$a */
    public static final class a {
        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public final int a(int i) {
            if (i < 8191) {
                return 13;
            }
            if (i < 32767) {
                return 15;
            }
            if (i < 65535) {
                return 16;
            }
            if (i < 262143) {
                return 18;
            }
            throw new IllegalArgumentException("Can't represent a size of " + i + " in Constraints");
        }

        public final long b(int i, int i2, int i3, int i4) {
            long j;
            int i5 = i4 == Integer.MAX_VALUE ? i3 : i4;
            int iA = a(i5);
            int i6 = i2 == Integer.MAX_VALUE ? i : i2;
            int iA2 = a(i6);
            if (iA + iA2 > 31) {
                throw new IllegalArgumentException("Can't represent a width of " + i6 + " and height of " + i5 + " in Constraints");
            }
            if (iA2 == 13) {
                j = 3;
            } else if (iA2 == 18) {
                j = 1;
            } else if (iA2 == 15) {
                j = 2;
            } else {
                if (iA2 != 16) {
                    throw new IllegalStateException("Should only have the provided constants.");
                }
                j = 0;
            }
            int i7 = i2 == Integer.MAX_VALUE ? 0 : i2 + 1;
            int i8 = i4 != Integer.MAX_VALUE ? i4 + 1 : 0;
            int i9 = C6079kr.c[(int) j];
            return C6079kr.c((((long) i7) << 33) | j | (((long) i) << 2) | (((long) i3) << i9) | (((long) i8) << (i9 + 31)));
        }

        public final long c(int i, int i2) {
            if (i >= 0 && i2 >= 0) {
                return b(i, i, i2, i2);
            }
            throw new IllegalArgumentException(("width(" + i + ") and height(" + i2 + ") must be >= 0").toString());
        }

        public a() {
        }
    }

    public /* synthetic */ C6079kr(long j) {
        this.a = j;
    }

    public static final /* synthetic */ C6079kr b(long j) {
        return new C6079kr(j);
    }

    public static final long d(long j, int i, int i2, int i3, int i4) {
        if (i3 < 0 || i < 0) {
            throw new IllegalArgumentException(("minHeight(" + i3 + ") and minWidth(" + i + ") must be >= 0").toString());
        }
        if (i2 < i && i2 != Integer.MAX_VALUE) {
            throw new IllegalArgumentException(("maxWidth(" + i2 + ") must be >= minWidth(" + i + ')').toString());
        }
        if (i4 >= i3 || i4 == Integer.MAX_VALUE) {
            return b.b(i, i2, i3, i4);
        }
        throw new IllegalArgumentException(("maxHeight(" + i4 + ") must be >= minHeight(" + i3 + ')').toString());
    }

    public static /* synthetic */ long e(long j, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = p(j);
        }
        int i6 = i;
        if ((i5 & 2) != 0) {
            i2 = n(j);
        }
        int i7 = i2;
        if ((i5 & 4) != 0) {
            i3 = o(j);
        }
        int i8 = i3;
        if ((i5 & 8) != 0) {
            i4 = m(j);
        }
        return d(j, i6, i7, i8, i4);
    }

    public static boolean f(long j, Object obj) {
        return (obj instanceof C6079kr) && j == ((C6079kr) obj).s();
    }

    public static final boolean g(long j, long j2) {
        return j == j2;
    }

    public static final int h(long j) {
        return (int) (j & 3);
    }

    public static final boolean i(long j) {
        int iH = h(j);
        return (((int) (j >> (c[iH] + 31))) & e[iH]) != 0;
    }

    public static final boolean j(long j) {
        return (((int) (j >> 33)) & d[h(j)]) != 0;
    }

    public static final boolean k(long j) {
        return m(j) == o(j);
    }

    public static final boolean l(long j) {
        return n(j) == p(j);
    }

    public static final int m(long j) {
        int iH = h(j);
        int i = ((int) (j >> (c[iH] + 31))) & e[iH];
        if (i == 0) {
            return Integer.MAX_VALUE;
        }
        return i - 1;
    }

    public static final int n(long j) {
        int i = ((int) (j >> 33)) & d[h(j)];
        if (i == 0) {
            return Integer.MAX_VALUE;
        }
        return i - 1;
    }

    public static final int o(long j) {
        int iH = h(j);
        return ((int) (j >> c[iH])) & e[iH];
    }

    public static final int p(long j) {
        return ((int) (j >> 2)) & d[h(j)];
    }

    public static int q(long j) {
        return AbstractC2687Ws.a(j);
    }

    public static String r(long j) {
        int iN = n(j);
        String strValueOf = iN == Integer.MAX_VALUE ? "Infinity" : String.valueOf(iN);
        int iM = m(j);
        return "Constraints(minWidth = " + p(j) + ", maxWidth = " + strValueOf + ", minHeight = " + o(j) + ", maxHeight = " + (iM != Integer.MAX_VALUE ? String.valueOf(iM) : "Infinity") + ')';
    }

    public boolean equals(Object obj) {
        return f(this.a, obj);
    }

    public int hashCode() {
        return q(this.a);
    }

    public final /* synthetic */ long s() {
        return this.a;
    }

    public String toString() {
        return r(this.a);
    }

    public static long c(long j) {
        return j;
    }
}
