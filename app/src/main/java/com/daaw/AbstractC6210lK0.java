package com.daaw;

import com.daaw.AbstractC0584Cu0;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.lK0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6210lK0 {

    /* JADX INFO: renamed from: com.daaw.lK0$a */
    public static final class a implements InterfaceC0957Gh0 {
        public final /* synthetic */ L90 a;
        public final /* synthetic */ float b;
        public final /* synthetic */ CT0 c;
        public final /* synthetic */ InterfaceC5111hR d;
        public final /* synthetic */ AbstractC0696Du e;

        /* JADX INFO: renamed from: com.daaw.lK0$a$a, reason: collision with other inner class name */
        public static final class C0209a extends AbstractC4192e90 implements NQ {
            public final /* synthetic */ List B;
            public final /* synthetic */ AbstractC0584Cu0[] C;
            public final /* synthetic */ InterfaceC5111hR D;
            public final /* synthetic */ int E;
            public final /* synthetic */ InterfaceC1269Jh0 F;
            public final /* synthetic */ int[] G;
            public final /* synthetic */ L90 H;
            public final /* synthetic */ C6489mK0[] I;
            public final /* synthetic */ AbstractC0696Du J;
            public final /* synthetic */ int K;
            public final /* synthetic */ C6190lF0 L;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0209a(List list, AbstractC0584Cu0[] abstractC0584Cu0Arr, InterfaceC5111hR interfaceC5111hR, int i, InterfaceC1269Jh0 interfaceC1269Jh0, int[] iArr, L90 l90, C6489mK0[] c6489mK0Arr, AbstractC0696Du abstractC0696Du, int i2, C6190lF0 c6190lF0) {
                super(1);
                this.B = list;
                this.C = abstractC0584Cu0Arr;
                this.D = interfaceC5111hR;
                this.E = i;
                this.F = interfaceC1269Jh0;
                this.G = iArr;
                this.H = l90;
                this.I = c6489mK0Arr;
                this.J = abstractC0696Du;
                this.K = i2;
                this.L = c6190lF0;
            }

            public final void a(AbstractC0584Cu0.a aVar) {
                int i;
                int[] iArr;
                G10.g(aVar, "$this$layout");
                int size = this.B.size();
                int[] iArr2 = new int[size];
                int i2 = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    AbstractC0584Cu0 abstractC0584Cu0 = this.C[i3];
                    G10.d(abstractC0584Cu0);
                    iArr2[i3] = AbstractC6210lK0.o(abstractC0584Cu0, this.H);
                }
                this.D.e(Integer.valueOf(this.E), iArr2, this.F.getLayoutDirection(), this.F, this.G);
                AbstractC0584Cu0[] abstractC0584Cu0Arr = this.C;
                C6489mK0[] c6489mK0Arr = this.I;
                AbstractC0696Du abstractC0696Du = this.J;
                int i4 = this.K;
                L90 l90 = this.H;
                InterfaceC1269Jh0 interfaceC1269Jh0 = this.F;
                C6190lF0 c6190lF0 = this.L;
                int[] iArr3 = this.G;
                int length = abstractC0584Cu0Arr.length;
                int i5 = 0;
                while (i2 < length) {
                    int[] iArr4 = iArr3;
                    AbstractC0584Cu0 abstractC0584Cu02 = abstractC0584Cu0Arr[i2];
                    int i6 = i5 + 1;
                    G10.d(abstractC0584Cu02);
                    AbstractC0696Du abstractC0696DuH = AbstractC6210lK0.h(c6489mK0Arr[i5]);
                    if (abstractC0696DuH == null) {
                        abstractC0696DuH = abstractC0696Du;
                    }
                    int iN = i4 - AbstractC6210lK0.n(abstractC0584Cu02, l90);
                    L90 l902 = L90.Horizontal;
                    AbstractC0584Cu0[] abstractC0584Cu0Arr2 = abstractC0584Cu0Arr;
                    int iA = abstractC0696DuH.a(iN, l90 == l902 ? EnumC7560q90.Ltr : interfaceC1269Jh0.getLayoutDirection(), abstractC0584Cu02, c6190lF0.B);
                    if (l90 == l902) {
                        i = length;
                        iArr = iArr4;
                        AbstractC0584Cu0.a.j(aVar, abstractC0584Cu02, iArr4[i5], iA, 0.0f, 4, null);
                    } else {
                        i = length;
                        iArr = iArr4;
                        AbstractC0584Cu0.a.j(aVar, abstractC0584Cu02, iA, iArr[i5], 0.0f, 4, null);
                    }
                    i2++;
                    iArr3 = iArr;
                    length = i;
                    i5 = i6;
                    abstractC0584Cu0Arr = abstractC0584Cu0Arr2;
                }
            }

            @Override // com.daaw.NQ
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((AbstractC0584Cu0.a) obj);
                return G91.a;
            }
        }

        public a(L90 l90, float f, CT0 ct0, InterfaceC5111hR interfaceC5111hR, AbstractC0696Du abstractC0696Du) {
            this.a = l90;
            this.b = f;
            this.c = ct0;
            this.d = interfaceC5111hR;
            this.e = abstractC0696Du;
        }

        @Override // com.daaw.InterfaceC0957Gh0
        public InterfaceC1061Hh0 a(InterfaceC1269Jh0 interfaceC1269Jh0, List list, long j) {
            int i;
            C6080kr0 c6080kr0;
            int iH;
            int i2;
            int i3;
            C6080kr0 c6080kr02;
            int iMax;
            int i4;
            int i5;
            List list2 = list;
            G10.g(interfaceC1269Jh0, "$this$measure");
            G10.g(list2, "measurables");
            C6080kr0 c6080kr03 = new C6080kr0(j, this.a, null);
            int iV = interfaceC1269Jh0.V(this.b);
            int size = list2.size();
            AbstractC0584Cu0[] abstractC0584Cu0Arr = new AbstractC0584Cu0[size];
            int size2 = list2.size();
            C6489mK0[] c6489mK0Arr = new C6489mK0[size2];
            for (int i6 = 0; i6 < size2; i6++) {
                c6489mK0Arr[i6] = AbstractC6210lK0.i((E10) list2.get(i6));
            }
            int size3 = list2.size();
            int i7 = 0;
            int i8 = 0;
            int i9 = 0;
            int i10 = 0;
            float f = 0.0f;
            int iO = 0;
            boolean z = false;
            while (true) {
                boolean z2 = true;
                if (i7 >= size3) {
                    break;
                }
                InterfaceC0645Dh0 interfaceC0645Dh0 = (InterfaceC0645Dh0) list2.get(i7);
                C6489mK0 c6489mK0 = c6489mK0Arr[i7];
                float fK = AbstractC6210lK0.k(c6489mK0);
                if (fK > 0.0f) {
                    f += fK;
                    i10++;
                    i4 = size3;
                    i5 = i7;
                } else {
                    int iE = c6080kr03.e();
                    int i11 = i9;
                    i4 = size3;
                    i5 = i7;
                    AbstractC0584Cu0 abstractC0584Cu0G = interfaceC0645Dh0.G(C6080kr0.b(c6080kr03, 0, iE != Integer.MAX_VALUE ? iE - iO : Integer.MAX_VALUE, 0, 0, 8, null).g(this.a));
                    int iMin = Math.min(iV, (iE - iO) - AbstractC6210lK0.o(abstractC0584Cu0G, this.a));
                    iO += AbstractC6210lK0.o(abstractC0584Cu0G, this.a) + iMin;
                    int iMax2 = Math.max(i11, AbstractC6210lK0.n(abstractC0584Cu0G, this.a));
                    if (!z && !AbstractC6210lK0.l(c6489mK0)) {
                        z2 = false;
                    }
                    abstractC0584Cu0Arr[i5] = abstractC0584Cu0G;
                    i9 = iMax2;
                    i8 = iMin;
                    z = z2;
                }
                i7 = i5 + 1;
                size3 = i4;
            }
            int i12 = i9;
            if (i10 == 0) {
                iO -= i8;
                i = i12;
                c6080kr0 = c6080kr03;
                iH = 0;
            } else {
                int i13 = iV * (i10 - 1);
                int iF = (((f <= 0.0f || c6080kr03.e() == Integer.MAX_VALUE) ? c6080kr03.f() : c6080kr03.e()) - iO) - i13;
                float f2 = f > 0.0f ? iF / f : 0.0f;
                int iB = 0;
                for (int i14 = 0; i14 < size2; i14++) {
                    iB += AbstractC8261sh0.b(AbstractC6210lK0.k(c6489mK0Arr[i14]) * f2);
                }
                int size4 = list2.size();
                i = i12;
                int i15 = iF - iB;
                int i16 = 0;
                int iO2 = 0;
                while (i16 < size4) {
                    if (abstractC0584Cu0Arr[i16] == null) {
                        InterfaceC0645Dh0 interfaceC0645Dh02 = (InterfaceC0645Dh0) list2.get(i16);
                        C6489mK0 c6489mK02 = c6489mK0Arr[i16];
                        float fK2 = AbstractC6210lK0.k(c6489mK02);
                        if (fK2 <= 0.0f) {
                            throw new IllegalStateException("All weights <= 0 should have placeables");
                        }
                        int iA = AbstractC8261sh0.a(i15);
                        i15 -= iA;
                        int iB2 = AbstractC8261sh0.b(fK2 * f2) + iA;
                        i2 = i16;
                        int iMax3 = Math.max(0, iB2);
                        i3 = i13;
                        c6080kr02 = c6080kr03;
                        AbstractC0584Cu0 abstractC0584Cu0G2 = interfaceC0645Dh02.G(new C6080kr0((!AbstractC6210lK0.j(c6489mK02) || iMax3 == Integer.MAX_VALUE) ? 0 : iMax3, iMax3, 0, c6080kr03.c()).g(this.a));
                        iO2 += AbstractC6210lK0.o(abstractC0584Cu0G2, this.a);
                        int iMax4 = Math.max(i, AbstractC6210lK0.n(abstractC0584Cu0G2, this.a));
                        boolean z3 = z || AbstractC6210lK0.l(c6489mK02);
                        abstractC0584Cu0Arr[i2] = abstractC0584Cu0G2;
                        i = iMax4;
                        z = z3;
                    } else {
                        i2 = i16;
                        i3 = i13;
                        c6080kr02 = c6080kr03;
                    }
                    i16 = i2 + 1;
                    list2 = list;
                    i13 = i3;
                    c6080kr03 = c6080kr02;
                }
                c6080kr0 = c6080kr03;
                iH = AbstractC8417tE0.h(iO2 + i13, c6080kr0.e() - iO);
            }
            C6190lF0 c6190lF0 = new C6190lF0();
            if (z) {
                iMax = 0;
                for (int i17 = 0; i17 < size; i17++) {
                    AbstractC0584Cu0 abstractC0584Cu0 = abstractC0584Cu0Arr[i17];
                    G10.d(abstractC0584Cu0);
                    AbstractC0696Du abstractC0696DuH = AbstractC6210lK0.h(c6489mK0Arr[i17]);
                    Integer numB = abstractC0696DuH != null ? abstractC0696DuH.b(abstractC0584Cu0) : null;
                    if (numB != null) {
                        int i18 = c6190lF0.B;
                        int iIntValue = numB.intValue();
                        if (iIntValue == Integer.MIN_VALUE) {
                            iIntValue = 0;
                        }
                        c6190lF0.B = Math.max(i18, iIntValue);
                        int iN = AbstractC6210lK0.n(abstractC0584Cu0, this.a);
                        L90 l90 = this.a;
                        int iIntValue2 = numB.intValue();
                        if (iIntValue2 == Integer.MIN_VALUE) {
                            iIntValue2 = AbstractC6210lK0.n(abstractC0584Cu0, l90);
                        }
                        iMax = Math.max(iMax, iN - iIntValue2);
                    }
                }
            } else {
                iMax = 0;
            }
            int iMax5 = Math.max(iO + iH, c6080kr0.f());
            int iMax6 = (c6080kr0.c() == Integer.MAX_VALUE || this.c != CT0.Expand) ? Math.max(i, Math.max(c6080kr0.d(), c6190lF0.B + iMax)) : c6080kr0.c();
            L90 l902 = this.a;
            L90 l903 = L90.Horizontal;
            int i19 = l902 == l903 ? iMax5 : iMax6;
            int i20 = l902 == l903 ? iMax6 : iMax5;
            int size5 = list.size();
            int[] iArr = new int[size5];
            for (int i21 = 0; i21 < size5; i21++) {
                iArr[i21] = 0;
            }
            return AbstractC1165Ih0.b(interfaceC1269Jh0, i19, i20, null, new C0209a(list, abstractC0584Cu0Arr, this.d, iMax5, interfaceC1269Jh0, iArr, this.a, c6489mK0Arr, this.e, iMax6, c6190lF0), 4, null);
        }
    }

    public static final AbstractC0696Du h(C6489mK0 c6489mK0) {
        if (c6489mK0 != null) {
            return c6489mK0.a();
        }
        return null;
    }

    public static final C6489mK0 i(E10 e10) {
        Object objL = e10.L();
        if (objL instanceof C6489mK0) {
            return (C6489mK0) objL;
        }
        return null;
    }

    public static final boolean j(C6489mK0 c6489mK0) {
        if (c6489mK0 != null) {
            return c6489mK0.b();
        }
        return true;
    }

    public static final float k(C6489mK0 c6489mK0) {
        if (c6489mK0 != null) {
            return c6489mK0.c();
        }
        return 0.0f;
    }

    public static final boolean l(C6489mK0 c6489mK0) {
        AbstractC0696Du abstractC0696DuH = h(c6489mK0);
        if (abstractC0696DuH != null) {
            return abstractC0696DuH.c();
        }
        return false;
    }

    public static final InterfaceC0957Gh0 m(L90 l90, InterfaceC5111hR interfaceC5111hR, float f, CT0 ct0, AbstractC0696Du abstractC0696Du) {
        G10.g(l90, "orientation");
        G10.g(interfaceC5111hR, "arrangement");
        G10.g(ct0, "crossAxisSize");
        G10.g(abstractC0696Du, "crossAxisAlignment");
        return new a(l90, f, ct0, interfaceC5111hR, abstractC0696Du);
    }

    public static final int n(AbstractC0584Cu0 abstractC0584Cu0, L90 l90) {
        return l90 == L90.Horizontal ? abstractC0584Cu0.l0() : abstractC0584Cu0.q0();
    }

    public static final int o(AbstractC0584Cu0 abstractC0584Cu0, L90 l90) {
        return l90 == L90.Horizontal ? abstractC0584Cu0.q0() : abstractC0584Cu0.l0();
    }
}
