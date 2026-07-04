package com.daaw;

/* JADX INFO: renamed from: com.daaw.Vm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2559Vm {
    public static final a b = new a(null);
    public static final long c = AbstractC3530bn.c(4278190080L);
    public static final long d = AbstractC3530bn.c(4282664004L);
    public static final long e = AbstractC3530bn.c(4287137928L);
    public static final long f = AbstractC3530bn.c(4291611852L);
    public static final long g = AbstractC3530bn.c(4294967295L);
    public static final long h = AbstractC3530bn.c(4294901760L);
    public static final long i = AbstractC3530bn.c(4278255360L);
    public static final long j = AbstractC3530bn.c(4278190335L);
    public static final long k = AbstractC3530bn.c(4294967040L);
    public static final long l = AbstractC3530bn.c(4278255615L);
    public static final long m = AbstractC3530bn.c(4294902015L);
    public static final long n = AbstractC3530bn.b(0);
    public static final long o = AbstractC3530bn.a(0.0f, 0.0f, 0.0f, 0.0f, C5490in.a.t());
    public final long a;

    /* JADX INFO: renamed from: com.daaw.Vm$a */
    public static final class a {
        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public final long a() {
            return C2559Vm.c;
        }

        public final long b() {
            return C2559Vm.j;
        }

        public final long c() {
            return C2559Vm.d;
        }

        public final long d() {
            return C2559Vm.e;
        }

        public final long e() {
            return C2559Vm.h;
        }

        public final long f() {
            return C2559Vm.n;
        }

        public final long g() {
            return C2559Vm.o;
        }

        public final long h() {
            return C2559Vm.g;
        }

        public a() {
        }
    }

    public /* synthetic */ C2559Vm(long j2) {
        this.a = j2;
    }

    public static final /* synthetic */ C2559Vm i(long j2) {
        return new C2559Vm(j2);
    }

    public static final long k(long j2, AbstractC4933gn abstractC4933gn) {
        G10.g(abstractC4933gn, "colorSpace");
        if (G10.c(abstractC4933gn, r(j2))) {
            return j2;
        }
        C1615Mq c1615MqI = AbstractC5212hn.i(r(j2), abstractC4933gn, 0, 2, null);
        float[] fArrF = AbstractC3530bn.f(j2);
        c1615MqI.a(fArrF);
        return AbstractC3530bn.a(fArrF[0], fArrF[1], fArrF[2], fArrF[3], abstractC4933gn);
    }

    public static final long l(long j2, float f2, float f3, float f4, float f5) {
        return AbstractC3530bn.a(f3, f4, f5, f2, r(j2));
    }

    public static /* synthetic */ long m(long j2, float f2, float f3, float f4, float f5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = p(j2);
        }
        float f6 = f2;
        if ((i2 & 2) != 0) {
            f3 = t(j2);
        }
        float f7 = f3;
        if ((i2 & 4) != 0) {
            f4 = s(j2);
        }
        float f8 = f4;
        if ((i2 & 8) != 0) {
            f5 = q(j2);
        }
        return l(j2, f6, f7, f8, f5);
    }

    public static boolean n(long j2, Object obj) {
        return (obj instanceof C2559Vm) && j2 == ((C2559Vm) obj).w();
    }

    public static final boolean o(long j2, long j3) {
        return j2 == j3;
    }

    public static final float p(long j2) {
        float fB;
        float f2;
        if (C6724n91.c(63 & j2) == 0) {
            fB = (float) AbstractC3745ca1.b(C6724n91.c(C6724n91.c(j2 >>> 56) & 255));
            f2 = 255.0f;
        } else {
            fB = (float) AbstractC3745ca1.b(C6724n91.c(C6724n91.c(j2 >>> 6) & 1023));
            f2 = 1023.0f;
        }
        return fB / f2;
    }

    public static final float q(long j2) {
        return C6724n91.c(63 & j2) == 0 ? ((float) AbstractC3745ca1.b(C6724n91.c(C6724n91.c(j2 >>> 32) & 255))) / 255.0f : AbstractC3134aN.g(AbstractC3134aN.c((short) C6724n91.c(C6724n91.c(j2 >>> 16) & 65535)));
    }

    public static final AbstractC4933gn r(long j2) {
        C5490in c5490in = C5490in.a;
        return c5490in.h()[(int) C6724n91.c(j2 & 63)];
    }

    public static final float s(long j2) {
        return C6724n91.c(63 & j2) == 0 ? ((float) AbstractC3745ca1.b(C6724n91.c(C6724n91.c(j2 >>> 40) & 255))) / 255.0f : AbstractC3134aN.g(AbstractC3134aN.c((short) C6724n91.c(C6724n91.c(j2 >>> 32) & 65535)));
    }

    public static final float t(long j2) {
        return C6724n91.c(63 & j2) == 0 ? ((float) AbstractC3745ca1.b(C6724n91.c(C6724n91.c(j2 >>> 48) & 255))) / 255.0f : AbstractC3134aN.g(AbstractC3134aN.c((short) C6724n91.c(C6724n91.c(j2 >>> 48) & 65535)));
    }

    public static int u(long j2) {
        return C6724n91.h(j2);
    }

    public static String v(long j2) {
        return "Color(" + t(j2) + ", " + s(j2) + ", " + q(j2) + ", " + p(j2) + ", " + r(j2).g() + ')';
    }

    public boolean equals(Object obj) {
        return n(this.a, obj);
    }

    public int hashCode() {
        return u(this.a);
    }

    public String toString() {
        return v(this.a);
    }

    public final /* synthetic */ long w() {
        return this.a;
    }

    public static long j(long j2) {
        return j2;
    }
}
