package com.daaw;

import android.util.Pair;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.zs3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC10279zs3 extends Cs3 {
    public C10000ys3 c;

    @Override // com.daaw.Cs3
    public final Ds3 e(Yf3[] yf3Arr, C6362lr3 c6362lr3, Vp3 vp3, AbstractC8657u52 abstractC8657u52) {
        boolean z;
        int[] iArr;
        int[] iArr2 = new int[3];
        A62[][] a62Arr = new A62[3][];
        int[][][] iArr3 = new int[3][][];
        for (int i = 0; i < 3; i++) {
            int i2 = c6362lr3.a;
            a62Arr[i] = new A62[i2];
            iArr3[i] = new int[i2][];
        }
        int i3 = 2;
        int[] iArr4 = new int[2];
        for (int i4 = 0; i4 < 2; i4++) {
            iArr4[i4] = yf3Arr[i4].zze();
        }
        int i5 = 0;
        while (i5 < c6362lr3.a) {
            A62 a62B = c6362lr3.b(i5);
            int i6 = a62B.c;
            int i7 = 0;
            int i8 = 2;
            int i9 = 0;
            boolean z2 = true;
            while (i7 < i3) {
                Yf3 yf3 = yf3Arr[i7];
                int iMax = 0;
                for (int i10 = 0; i10 <= 0; i10++) {
                    iMax = Math.max(iMax, yf3.p(a62B.b(i10)) & 7);
                }
                boolean z3 = iArr2[i7] == 0;
                if (iMax > i9) {
                    z2 = z3;
                    i8 = i7;
                    i9 = iMax;
                } else if (iMax == i9 && i6 == 5 && !z2 && z3) {
                    i8 = i7;
                    i9 = iMax;
                    z2 = true;
                }
                i7++;
                i3 = 2;
            }
            if (i8 == i3) {
                iArr = new int[1];
            } else {
                Yf3 yf32 = yf3Arr[i8];
                int[] iArr5 = new int[1];
                for (int i11 = 0; i11 <= 0; i11++) {
                    iArr5[i11] = yf32.p(a62B.b(i11));
                }
                iArr = iArr5;
            }
            int i12 = iArr2[i8];
            a62Arr[i8][i12] = a62B;
            iArr3[i8][i12] = iArr;
            iArr2[i8] = i12 + 1;
            i5++;
            i3 = 2;
        }
        C6362lr3[] c6362lr3Arr = new C6362lr3[i3];
        String[] strArr = new String[i3];
        int[] iArr6 = new int[i3];
        int i13 = 0;
        while (i13 < i3) {
            int i14 = iArr2[i13];
            c6362lr3Arr[i13] = new C6362lr3((A62[]) AbstractC9004vJ2.j(a62Arr[i13], i14));
            iArr3[i13] = (int[][]) AbstractC9004vJ2.j(iArr3[i13], i14);
            strArr[i13] = yf3Arr[i13].zzR();
            iArr6[i13] = yf3Arr[i13].zzb();
            i13++;
            i3 = 2;
        }
        C10000ys3 c10000ys3 = new C10000ys3(strArr, iArr6, c6362lr3Arr, iArr4, iArr3, new C6362lr3((A62[]) AbstractC9004vJ2.j(a62Arr[2], iArr2[2])));
        Pair pairJ = j(c10000ys3, iArr3, iArr4, vp3, abstractC8657u52);
        As3[] as3Arr = (As3[]) pairJ.second;
        List[] listArr = new List[as3Arr.length];
        for (int i15 = 0; i15 < as3Arr.length; i15++) {
            As3 as3 = as3Arr[i15];
            listArr[i15] = as3 != null ? OP2.K(as3) : OP2.J();
        }
        LP2 lp2 = new LP2();
        for (int i16 = 0; i16 < 2; i16++) {
            C6362lr3 c6362lr3D = c10000ys3.d(i16);
            List list = listArr[i16];
            for (int i17 = 0; i17 < c6362lr3D.a; i17++) {
                A62 a62B2 = c6362lr3D.b(i17);
                boolean z4 = c10000ys3.a(i16, i17, false) != 0;
                int i18 = a62B2.a;
                int[] iArr7 = new int[1];
                boolean[] zArr = new boolean[1];
                for (int i19 = 0; i19 <= 0; i19++) {
                    iArr7[i19] = c10000ys3.b(i16, i17, i19) & 7;
                    int i20 = 0;
                    while (true) {
                        if (i20 >= list.size()) {
                            z = false;
                            break;
                        }
                        As3 as32 = (As3) list.get(i20);
                        if (as32.zze().equals(a62B2) && as32.zzb(i19) != -1) {
                            z = true;
                            break;
                        }
                        i20++;
                    }
                    zArr[i19] = z;
                }
                lp2.g(new C1143Ib2(a62B2, z4, iArr7, zArr));
            }
        }
        C6362lr3 c6362lr3E = c10000ys3.e();
        for (int i21 = 0; i21 < c6362lr3E.a; i21++) {
            A62 a62B3 = c6362lr3E.b(i21);
            int i22 = a62B3.a;
            int[] iArr8 = new int[1];
            Arrays.fill(iArr8, 0);
            lp2.g(new C1143Ib2(a62B3, false, iArr8, new boolean[1]));
        }
        return new Ds3((C3220ag3[]) pairJ.first, (InterfaceC9442ws3[]) pairJ.second, new C6844nc2(lp2.j()), c10000ys3);
    }

    @Override // com.daaw.Cs3
    public final void f(Object obj) {
        this.c = (C10000ys3) obj;
    }

    public abstract Pair j(C10000ys3 c10000ys3, int[][][] iArr, int[] iArr2, Vp3 vp3, AbstractC8657u52 abstractC8657u52);
}
