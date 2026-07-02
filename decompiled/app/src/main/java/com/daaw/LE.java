package com.daaw;

import com.revenuecat.purchases.common.UtilsKt;

/* JADX INFO: loaded from: classes4.dex */
public abstract class LE implements Comparable {
    public static final a B = new a(null);
    public static final long C = l(0);
    public static final long D = OE.i(4611686018427387903L);
    public static final long E = OE.i(-4611686018427387903L);

    public static final class a {
        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public final long a() {
            return LE.D;
        }

        public final long b() {
            return LE.E;
        }

        public a() {
        }
    }

    public static int A(long j) {
        return AbstractC2687Ws.a(j);
    }

    public static final boolean B(long j) {
        return !E(j);
    }

    public static final boolean C(long j) {
        return (((int) j) & 1) == 1;
    }

    public static final boolean D(long j) {
        return (((int) j) & 1) == 0;
    }

    public static final boolean E(long j) {
        return j == D || j == E;
    }

    public static final boolean F(long j) {
        return j < 0;
    }

    public static final long G(long j, long j2) {
        if (E(j)) {
            if (B(j2) || (j2 ^ j) >= 0) {
                return j;
            }
            throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
        }
        if (E(j2)) {
            return j2;
        }
        if ((((int) j) & 1) != (((int) j2) & 1)) {
            return C(j) ? g(j, z(j), z(j2)) : g(j, z(j2), z(j));
        }
        long jZ = z(j) + z(j2);
        return D(j) ? OE.l(jZ) : OE.j(jZ);
    }

    public static final long H(long j, PE pe) {
        G10.g(pe, "unit");
        if (j == D) {
            return Long.MAX_VALUE;
        }
        if (j == E) {
            return Long.MIN_VALUE;
        }
        return QE.a(z(j), y(j), pe);
    }

    public static String I(long j) {
        if (j == 0) {
            return "0s";
        }
        if (j == D) {
            return "Infinity";
        }
        if (j == E) {
            return "-Infinity";
        }
        boolean zF = F(j);
        StringBuilder sb = new StringBuilder();
        if (zF) {
            sb.append('-');
        }
        long jN = n(j);
        long jP = p(jN);
        int iO = o(jN);
        int iV = v(jN);
        int iX = x(jN);
        int iW = w(jN);
        int i = 0;
        boolean z = jP != 0;
        boolean z2 = iO != 0;
        boolean z3 = iV != 0;
        boolean z4 = (iX == 0 && iW == 0) ? false : true;
        if (z) {
            sb.append(jP);
            sb.append('d');
            i = 1;
        }
        if (z2 || (z && (z3 || z4))) {
            int i2 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(iO);
            sb.append('h');
            i = i2;
        }
        if (z3 || (z4 && (z2 || z))) {
            int i3 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(iV);
            sb.append('m');
            i = i3;
        }
        if (z4) {
            int i4 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            if (iX != 0 || z || z2 || z3) {
                h(j, sb, iX, iW, 9, "s", false);
            } else if (iW >= 1000000) {
                h(j, sb, iW / UtilsKt.MICROS_MULTIPLIER, iW % UtilsKt.MICROS_MULTIPLIER, 6, "ms", false);
            } else if (iW >= 1000) {
                h(j, sb, iW / 1000, iW % 1000, 3, "us", false);
            } else {
                sb.append(iW);
                sb.append("ns");
            }
            i = i4;
        }
        if (zF && i > 1) {
            sb.insert(1, '(').append(')');
        }
        String string = sb.toString();
        G10.f(string, "toString(...)");
        return string;
    }

    public static final long J(long j) {
        return OE.h(-z(j), ((int) j) & 1);
    }

    public static final long g(long j, long j2, long j3) {
        long jN = OE.n(j3);
        long j4 = j2 + jN;
        if (-4611686018426L > j4 || j4 >= 4611686018427L) {
            return OE.i(AbstractC8417tE0.m(j4, -4611686018427387903L, 4611686018427387903L));
        }
        return OE.k(OE.m(j4) + (j3 - OE.m(jN)));
    }

    public static final void h(long j, StringBuilder sb, int i, int i2, int i3, String str, boolean z) {
        sb.append(i);
        if (i2 != 0) {
            sb.append('.');
            String strX = BY0.X(String.valueOf(i2), i3, '0');
            int i4 = -1;
            int length = strX.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i5 = length - 1;
                    if (strX.charAt(length) != '0') {
                        i4 = length;
                        break;
                    } else if (i5 < 0) {
                        break;
                    } else {
                        length = i5;
                    }
                }
            }
            int i6 = i4 + 1;
            if (z || i6 >= 3) {
                sb.append((CharSequence) strX, 0, ((i4 + 3) / 3) * 3);
                G10.f(sb, "append(...)");
            } else {
                sb.append((CharSequence) strX, 0, i6);
                G10.f(sb, "append(...)");
            }
        }
        sb.append(str);
    }

    public static int k(long j, long j2) {
        long j3 = j ^ j2;
        if (j3 < 0 || (((int) j3) & 1) == 0) {
            return G10.i(j, j2);
        }
        int i = (((int) j) & 1) - (((int) j2) & 1);
        return F(j) ? -i : i;
    }

    public static long l(long j) {
        if (!NE.a()) {
            return j;
        }
        if (D(j)) {
            long jZ = z(j);
            if (-4611686018426999999L <= jZ && jZ < 4611686018427000000L) {
                return j;
            }
            throw new AssertionError(z(j) + " ns is out of nanoseconds range");
        }
        long jZ2 = z(j);
        if (-4611686018427387903L > jZ2 || jZ2 >= 4611686018427387904L) {
            throw new AssertionError(z(j) + " ms is out of milliseconds range");
        }
        long jZ3 = z(j);
        if (-4611686018426L > jZ3 || jZ3 >= 4611686018427L) {
            return j;
        }
        throw new AssertionError(z(j) + " ms is denormalized");
    }

    public static final boolean m(long j, long j2) {
        return j == j2;
    }

    public static final long n(long j) {
        return F(j) ? J(j) : j;
    }

    public static final int o(long j) {
        if (E(j)) {
            return 0;
        }
        return (int) (q(j) % ((long) 24));
    }

    public static final long p(long j) {
        return H(j, PE.I);
    }

    public static final long q(long j) {
        return H(j, PE.H);
    }

    public static final long r(long j) {
        return H(j, PE.D);
    }

    public static final long s(long j) {
        return (C(j) && B(j)) ? z(j) : H(j, PE.E);
    }

    public static final long t(long j) {
        return H(j, PE.G);
    }

    public static final long u(long j) {
        return H(j, PE.F);
    }

    public static final int v(long j) {
        if (E(j)) {
            return 0;
        }
        return (int) (t(j) % ((long) 60));
    }

    public static final int w(long j) {
        if (E(j)) {
            return 0;
        }
        return (int) (C(j) ? OE.m(z(j) % ((long) 1000)) : z(j) % ((long) 1000000000));
    }

    public static final int x(long j) {
        if (E(j)) {
            return 0;
        }
        return (int) (u(j) % ((long) 60));
    }

    public static final PE y(long j) {
        return D(j) ? PE.C : PE.E;
    }

    public static final long z(long j) {
        return j >> 1;
    }
}
