package com.daaw;

/* JADX INFO: renamed from: com.daaw.Tj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2339Tj {
    public static final int a = AbstractC6280lb1.v("GA94");
    public static final int b = AbstractC6280lb1.v("DTG1");

    public static void a(long j, C2584Vs0 c2584Vs0, Z41[] z41Arr) {
        while (c2584Vs0.a() > 1) {
            int iB = b(c2584Vs0);
            int iB2 = b(c2584Vs0);
            int iC = c2584Vs0.c() + iB2;
            if (iB2 == -1 || iB2 > c2584Vs0.a()) {
                iC = c2584Vs0.d();
            } else if (iB == 4 && iB2 >= 8) {
                int iX = c2584Vs0.x();
                int iD = c2584Vs0.D();
                int i = iD == 49 ? c2584Vs0.i() : 0;
                int iX2 = c2584Vs0.x();
                if (iD == 47) {
                    c2584Vs0.K(1);
                }
                boolean z = iX == 181 && (iD == 49 || iD == 47) && iX2 == 3;
                if (iD == 49) {
                    z &= i == a || i == b;
                }
                if (z) {
                    int iX3 = c2584Vs0.x() & 31;
                    c2584Vs0.K(1);
                    int i2 = iX3 * 3;
                    int iC2 = c2584Vs0.c();
                    for (Z41 z41 : z41Arr) {
                        c2584Vs0.J(iC2);
                        z41.c(c2584Vs0, i2);
                        z41.a(j, 1, i2, 0, null);
                    }
                }
            }
            c2584Vs0.J(iC);
        }
    }

    public static int b(C2584Vs0 c2584Vs0) {
        int i = 0;
        while (c2584Vs0.a() != 0) {
            int iX = c2584Vs0.x();
            i += iX;
            if (iX != 255) {
                return i;
            }
        }
        return -1;
    }
}
