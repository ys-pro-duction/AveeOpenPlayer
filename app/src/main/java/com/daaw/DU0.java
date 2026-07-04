package com.daaw;

/* JADX INFO: loaded from: classes.dex */
public abstract class DU0 {
    public static final int[] a = {AbstractC6280lb1.v("isom"), AbstractC6280lb1.v("iso2"), AbstractC6280lb1.v("iso3"), AbstractC6280lb1.v("iso4"), AbstractC6280lb1.v("iso5"), AbstractC6280lb1.v("iso6"), AbstractC6280lb1.v("avc1"), AbstractC6280lb1.v("hvc1"), AbstractC6280lb1.v("hev1"), AbstractC6280lb1.v("mp41"), AbstractC6280lb1.v("mp42"), AbstractC6280lb1.v("3g2a"), AbstractC6280lb1.v("3g2b"), AbstractC6280lb1.v("3gr6"), AbstractC6280lb1.v("3gs6"), AbstractC6280lb1.v("3ge6"), AbstractC6280lb1.v("3gg6"), AbstractC6280lb1.v("M4V "), AbstractC6280lb1.v("M4A "), AbstractC6280lb1.v("f4v "), AbstractC6280lb1.v("kddi"), AbstractC6280lb1.v("M4VP"), AbstractC6280lb1.v("qt  "), AbstractC6280lb1.v("MSNV")};

    public static boolean a(int i) {
        if ((i >>> 8) == AbstractC6280lb1.v("3gp")) {
            return true;
        }
        for (int i2 : a) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public static boolean b(InterfaceC9001vJ interfaceC9001vJ) {
        return c(interfaceC9001vJ, true);
    }

    public static boolean c(InterfaceC9001vJ interfaceC9001vJ, boolean z) {
        boolean z2;
        int i;
        long jB = interfaceC9001vJ.b();
        long j = -1;
        if (jB == -1 || jB > 4096) {
            jB = 4096;
        }
        int i2 = (int) jB;
        C2584Vs0 c2584Vs0 = new C2584Vs0(64);
        boolean z3 = false;
        int i3 = 0;
        boolean z4 = false;
        while (i3 < i2) {
            c2584Vs0.G(8);
            interfaceC9001vJ.k(c2584Vs0.a, z3 ? 1 : 0, 8);
            long jZ = c2584Vs0.z();
            int i4 = c2584Vs0.i();
            if (jZ == 1) {
                interfaceC9001vJ.k(c2584Vs0.a, 8, 8);
                c2584Vs0.I(16);
                jZ = c2584Vs0.C();
                i = 16;
            } else {
                if (jZ == 0) {
                    long jB2 = interfaceC9001vJ.b();
                    if (jB2 != j) {
                        jZ = ((long) 8) + (jB2 - interfaceC9001vJ.getPosition());
                    }
                }
                i = 8;
            }
            long j2 = i;
            if (jZ < j2) {
                return z3;
            }
            i3 += i;
            if (i4 != AbstractC1244Jb.C) {
                if (i4 == AbstractC1244Jb.L || i4 == AbstractC1244Jb.N) {
                    z2 = true;
                    break;
                }
                if ((((long) i3) + jZ) - j2 >= i2) {
                    break;
                }
                int i5 = (int) (jZ - j2);
                i3 += i5;
                if (i4 == AbstractC1244Jb.b) {
                    if (i5 < 8) {
                        return false;
                    }
                    c2584Vs0.G(i5);
                    interfaceC9001vJ.k(c2584Vs0.a, 0, i5);
                    int i6 = i5 / 4;
                    int i7 = 0;
                    while (true) {
                        if (i7 >= i6) {
                            break;
                        }
                        if (i7 == 1) {
                            c2584Vs0.K(4);
                        } else if (a(c2584Vs0.i())) {
                            z4 = true;
                            break;
                        }
                        i7++;
                    }
                    if (!z4) {
                        return false;
                    }
                } else if (i5 != 0) {
                    interfaceC9001vJ.h(i5);
                }
                z3 = false;
                j = -1;
            }
        }
        z2 = false;
        return z4 && z == z2;
    }

    public static boolean d(InterfaceC9001vJ interfaceC9001vJ) {
        return c(interfaceC9001vJ, false);
    }
}
