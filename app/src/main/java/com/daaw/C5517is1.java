package com.daaw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.is1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5517is1 implements InterfaceC3840ct1 {
    public final List a;

    public C5517is1(int i, List list) {
        this.a = list;
    }

    @Override // com.daaw.InterfaceC3840ct1
    public final InterfaceC4397et1 a(int i, C3562bt1 c3562bt1) {
        if (i != 2) {
            if (i == 3 || i == 4) {
                return new C0577Cs1(new C10277zs1(c3562bt1.b));
            }
            if (i == 21) {
                return new C0577Cs1(new C9719xs1());
            }
            if (i == 27) {
                return new C0577Cs1(new C8875us1(b(c3562bt1), false, false));
            }
            if (i == 36) {
                return new C0577Cs1(new C9440ws1(b(c3562bt1)));
            }
            if (i == 89) {
                return new C0577Cs1(new C6086ks1(c3562bt1.c));
            }
            if (i == 138) {
                return new C0577Cs1(new C5798js1(c3562bt1.b));
            }
            if (i == 172) {
                return new C0577Cs1(new C2789Xr1(c3562bt1.b));
            }
            if (i == 257) {
                return new C2167Rs1(new C0473Bs1("application/vnd.dvb.ait"));
            }
            if (i != 128) {
                if (i != 129) {
                    if (i == 134) {
                        return new C2167Rs1(new C0473Bs1("application/x-scte35"));
                    }
                    if (i != 135) {
                        switch (i) {
                            case 15:
                                return new C0577Cs1(new C5239hs1(false, c3562bt1.b));
                            case 16:
                                return new C0577Cs1(new C7760qs1(c(c3562bt1)));
                            case C6564mc1.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                return new C0577Cs1(new C9998ys1(c3562bt1.b));
                            default:
                                return null;
                        }
                    }
                }
                return new C0577Cs1(new C2477Ur1(c3562bt1.b));
            }
        }
        return new C0577Cs1(new C6923ns1(c(c3562bt1)));
    }

    public final C2273Ss1 b(C3562bt1 c3562bt1) {
        return new C2273Ss1(d(c3562bt1));
    }

    public final C4965gt1 c(C3562bt1 c3562bt1) {
        return new C4965gt1(d(c3562bt1));
    }

    public final List d(C3562bt1 c3562bt1) {
        String str;
        int i;
        List listSingletonList;
        C5900kE2 c5900kE2 = new C5900kE2(c3562bt1.d);
        List arrayList = this.a;
        while (c5900kE2.j() > 0) {
            int iU = c5900kE2.u();
            int iL = c5900kE2.l() + c5900kE2.u();
            if (iU == 134) {
                arrayList = new ArrayList();
                int iU2 = c5900kE2.u() & 31;
                for (int i2 = 0; i2 < iU2; i2++) {
                    String strH = c5900kE2.H(3, UN2.c);
                    int iU3 = c5900kE2.u();
                    boolean z = (iU3 & 128) != 0;
                    if (z) {
                        i = iU3 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i = 1;
                    }
                    byte bU = (byte) c5900kE2.u();
                    c5900kE2.h(1);
                    if (z) {
                        int i3 = bU & 64;
                        byte[] bArr = AbstractC7457pn2.a;
                        listSingletonList = Collections.singletonList(i3 != 0 ? new byte[]{1} : new byte[]{0});
                    } else {
                        listSingletonList = null;
                    }
                    C1106Hs1 c1106Hs1 = new C1106Hs1();
                    c1106Hs1.u(str);
                    c1106Hs1.m(strH);
                    c1106Hs1.i0(i);
                    c1106Hs1.k(listSingletonList);
                    arrayList.add(c1106Hs1.D());
                }
            }
            c5900kE2.g(iL);
        }
        return arrayList;
    }

    public C5517is1(int i) {
        this.a = OP2.J();
    }
}
