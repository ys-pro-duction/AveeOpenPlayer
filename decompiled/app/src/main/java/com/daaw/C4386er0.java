package com.daaw;

import java.util.AbstractList;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.daaw.er0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4386er0 extends AbstractList implements RandomAccess {
    public final C4908gi[] B;
    public final int[] C;

    public C4386er0(C4908gi[] c4908giArr, int[] iArr) {
        this.B = c4908giArr;
        this.C = iArr;
    }

    public static void e(long j, C4057dh c4057dh, int i, List list, int i2, int i3, List list2) {
        int i4;
        int i5;
        long j2;
        int i6;
        List list3;
        long j3;
        int i7;
        List list4 = list;
        List list5 = list2;
        if (i2 >= i3) {
            throw new AssertionError();
        }
        for (int i8 = i2; i8 < i3; i8++) {
            if (((C4908gi) list4.get(i8)).s() < i) {
                throw new AssertionError();
            }
        }
        C4908gi c4908gi = (C4908gi) list.get(i2);
        C4908gi c4908gi2 = (C4908gi) list4.get(i3 - 1);
        if (i == c4908gi.s()) {
            int iIntValue = ((Integer) list5.get(i2)).intValue();
            int i9 = i2 + 1;
            C4908gi c4908gi3 = (C4908gi) list4.get(i9);
            i4 = i9;
            i5 = iIntValue;
            c4908gi = c4908gi3;
        } else {
            i4 = i2;
            i5 = -1;
        }
        long j4 = 2;
        if (c4908gi.k(i) == c4908gi2.k(i)) {
            int iMin = Math.min(c4908gi.s(), c4908gi2.s());
            int i10 = 0;
            int i11 = i;
            while (true) {
                if (i11 >= iMin) {
                    j2 = j4;
                    break;
                }
                j2 = j4;
                if (c4908gi.k(i11) != c4908gi2.k(i11)) {
                    break;
                }
                i10++;
                i11++;
                j4 = j2;
            }
            long jP = j + ((long) p(c4057dh)) + j2 + ((long) i10) + 1;
            c4057dh.C(-i10);
            c4057dh.C(i5);
            int i12 = i;
            while (true) {
                i6 = i + i10;
                if (i12 >= i6) {
                    break;
                }
                c4057dh.C(c4908gi.k(i12) & 255);
                i12++;
            }
            if (i4 + 1 == i3) {
                if (i6 != ((C4908gi) list4.get(i4)).s()) {
                    throw new AssertionError();
                }
                c4057dh.C(((Integer) list5.get(i4)).intValue());
                return;
            } else {
                C4057dh c4057dh2 = new C4057dh();
                c4057dh.C((int) ((((long) p(c4057dh2)) + jP) * (-1)));
                e(jP, c4057dh2, i6, list4, i4, i3, list5);
                c4057dh.O0(c4057dh2, c4057dh2.f1());
                return;
            }
        }
        int i13 = 1;
        for (int i14 = i4 + 1; i14 < i3; i14++) {
            if (((C4908gi) list4.get(i14 - 1)).k(i) != ((C4908gi) list4.get(i14)).k(i)) {
                i13++;
            }
        }
        long jP2 = j + ((long) p(c4057dh)) + 2 + ((long) (i13 * 2));
        c4057dh.C(i13);
        c4057dh.C(i5);
        for (int i15 = i4; i15 < i3; i15++) {
            byte bK = ((C4908gi) list4.get(i15)).k(i);
            if (i15 == i4 || bK != ((C4908gi) list4.get(i15 - 1)).k(i)) {
                c4057dh.C(bK & 255);
            }
        }
        C4057dh c4057dh3 = new C4057dh();
        int i16 = i4;
        while (i16 < i3) {
            byte bK2 = ((C4908gi) list4.get(i16)).k(i);
            int i17 = i16 + 1;
            int i18 = i17;
            while (true) {
                if (i18 >= i3) {
                    i18 = i3;
                    break;
                } else if (bK2 != ((C4908gi) list4.get(i18)).k(i)) {
                    break;
                } else {
                    i18++;
                }
            }
            if (i17 == i18 && i + 1 == ((C4908gi) list4.get(i16)).s()) {
                c4057dh.C(((Integer) list5.get(i16)).intValue());
                list3 = list5;
                j3 = jP2;
                i7 = i18;
            } else {
                c4057dh.C((int) ((((long) p(c4057dh3)) + jP2) * (-1)));
                list3 = list5;
                j3 = jP2;
                i7 = i18;
                e(j3, c4057dh3, i + 1, list, i16, i7, list3);
                list4 = list;
            }
            jP2 = j3;
            i16 = i7;
            list5 = list3;
        }
        c4057dh.O0(c4057dh3, c4057dh3.f1());
    }

    public static int p(C4057dh c4057dh) {
        return (int) (c4057dh.f1() / 4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00ba, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.daaw.C4386er0 q(com.daaw.C4908gi... r11) {
        /*
            Method dump skipped, instruction units count: 253
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C4386er0.q(com.daaw.gi[]):com.daaw.er0");
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public C4908gi get(int i) {
        return this.B[i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.B.length;
    }
}
