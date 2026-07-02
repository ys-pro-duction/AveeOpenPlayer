package com.daaw;

import com.google.android.exoplayer2.Format;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class LO0 {
    public final C7859rE0 a;
    public final long b;
    public final long c;

    public static abstract class a extends LO0 {
        public final long d;
        public final long e;
        public final List f;

        public a(C7859rE0 c7859rE0, long j, long j2, long j3, long j4, List list) {
            super(c7859rE0, j, j2);
            this.d = j3;
            this.e = j4;
            this.f = list;
        }

        public long c() {
            return this.d;
        }

        public abstract int d(long j);

        public final long e(long j, long j2) {
            List list = this.f;
            if (list != null) {
                return (((d) list.get((int) (j - this.d))).b * 1000000) / this.b;
            }
            int iD = d(j2);
            return (iD == -1 || j != (c() + ((long) iD)) - 1) ? (this.e * 1000000) / this.b : j2 - g(j);
        }

        public long f(long j, long j2) {
            long jC = c();
            long jD = d(j2);
            if (jD != 0) {
                if (this.f != null) {
                    long j3 = (jD + jC) - 1;
                    long j4 = jC;
                    while (j4 <= j3) {
                        long j5 = ((j3 - j4) / 2) + j4;
                        long jG = g(j5);
                        if (jG < j) {
                            j4 = j5 + 1;
                        } else {
                            if (jG <= j) {
                                return j5;
                            }
                            j3 = j5 - 1;
                        }
                    }
                    return j4 == jC ? j4 : j3;
                }
                long j6 = this.d + (j / ((this.e * 1000000) / this.b));
                if (j6 >= jC) {
                    return jD == -1 ? j6 : Math.min(j6, (jC + jD) - 1);
                }
            }
            return jC;
        }

        public final long g(long j) {
            List list = this.f;
            return AbstractC6280lb1.T(list != null ? ((d) list.get((int) (j - this.d))).a - this.c : (j - this.d) * this.e, 1000000L, this.b);
        }

        public abstract C7859rE0 h(AbstractC6202lI0 abstractC6202lI0, long j);

        public boolean i() {
            return this.f != null;
        }
    }

    public static class b extends a {
        public final List g;

        public b(C7859rE0 c7859rE0, long j, long j2, long j3, long j4, List list, List list2) {
            super(c7859rE0, j, j2, j3, j4, list);
            this.g = list2;
        }

        @Override // com.daaw.LO0.a
        public int d(long j) {
            return this.g.size();
        }

        @Override // com.daaw.LO0.a
        public C7859rE0 h(AbstractC6202lI0 abstractC6202lI0, long j) {
            return (C7859rE0) this.g.get((int) (j - this.d));
        }

        @Override // com.daaw.LO0.a
        public boolean i() {
            return true;
        }
    }

    public static class c extends a {
        public final C0609Da1 g;
        public final C0609Da1 h;

        public c(C7859rE0 c7859rE0, long j, long j2, long j3, long j4, List list, C0609Da1 c0609Da1, C0609Da1 c0609Da12) {
            super(c7859rE0, j, j2, j3, j4, list);
            this.g = c0609Da1;
            this.h = c0609Da12;
        }

        @Override // com.daaw.LO0
        public C7859rE0 a(AbstractC6202lI0 abstractC6202lI0) {
            C0609Da1 c0609Da1 = this.g;
            if (c0609Da1 == null) {
                return super.a(abstractC6202lI0);
            }
            Format format = abstractC6202lI0.c;
            return new C7859rE0(c0609Da1.a(format.B, 0L, format.C, 0L), 0L, -1L);
        }

        @Override // com.daaw.LO0.a
        public int d(long j) {
            List list = this.f;
            if (list != null) {
                return list.size();
            }
            if (j != -9223372036854775807L) {
                return (int) AbstractC6280lb1.g(j, (this.e * 1000000) / this.b);
            }
            return -1;
        }

        @Override // com.daaw.LO0.a
        public C7859rE0 h(AbstractC6202lI0 abstractC6202lI0, long j) {
            List list = this.f;
            long j2 = list != null ? ((d) list.get((int) (j - this.d))).a : (j - this.d) * this.e;
            C0609Da1 c0609Da1 = this.h;
            Format format = abstractC6202lI0.c;
            return new C7859rE0(c0609Da1.a(format.B, j, format.C, j2), 0L, -1L);
        }
    }

    public static class d {
        public final long a;
        public final long b;

        public d(long j, long j2) {
            this.a = j;
            this.b = j2;
        }
    }

    public LO0(C7859rE0 c7859rE0, long j, long j2) {
        this.a = c7859rE0;
        this.b = j;
        this.c = j2;
    }

    public C7859rE0 a(AbstractC6202lI0 abstractC6202lI0) {
        return this.a;
    }

    public long b() {
        return AbstractC6280lb1.T(this.c, 1000000L, this.b);
    }

    public static class e extends LO0 {
        public final long d;
        public final long e;

        public e(C7859rE0 c7859rE0, long j, long j2, long j3, long j4) {
            super(c7859rE0, j, j2);
            this.d = j3;
            this.e = j4;
        }

        public C7859rE0 c() {
            long j = this.e;
            if (j <= 0) {
                return null;
            }
            return new C7859rE0(null, this.d, j);
        }

        public e() {
            this(null, 1L, 0L, 0L, 0L);
        }
    }
}
