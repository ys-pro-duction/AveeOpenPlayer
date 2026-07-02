package com.google.android.exoplayer2.trackselection;

import android.util.Pair;
import com.daaw.AbstractC3895d51;
import com.daaw.AbstractC6280lb1;
import com.daaw.C4173e51;
import com.daaw.WH0;
import com.daaw.XH0;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public abstract class b extends AbstractC3895d51 {
    public a b;

    public static final class a {
        public final int a;
        public final int b;
        public final int[] c;
        public final TrackGroupArray[] d;
        public final int[] e;
        public final int[][][] f;
        public final TrackGroupArray g;

        public a(int[] iArr, TrackGroupArray[] trackGroupArrayArr, int[] iArr2, int[][][] iArr3, TrackGroupArray trackGroupArray) {
            this.c = iArr;
            this.d = trackGroupArrayArr;
            this.f = iArr3;
            this.e = iArr2;
            this.g = trackGroupArray;
            int length = iArr.length;
            this.b = length;
            this.a = length;
        }

        public int a(int i, int i2, boolean z) {
            int i3 = this.d[i].a(i2).B;
            int[] iArr = new int[i3];
            int i4 = 0;
            for (int i5 = 0; i5 < i3; i5++) {
                int iF = f(i, i2, i5);
                if (iF == 4 || (z && iF == 3)) {
                    iArr[i4] = i5;
                    i4++;
                }
            }
            return b(i, i2, Arrays.copyOf(iArr, i4));
        }

        public int b(int i, int i2, int[] iArr) {
            int i3 = 0;
            String str = null;
            boolean z = false;
            int i4 = 0;
            int iMin = 16;
            while (i3 < iArr.length) {
                String str2 = this.d[i].a(i2).a(iArr[i3]).G;
                int i5 = i4 + 1;
                if (i4 == 0) {
                    str = str2;
                } else {
                    z |= !AbstractC6280lb1.b(str, str2);
                }
                iMin = Math.min(iMin, this.f[i][i2][i3] & 24);
                i3++;
                i4 = i5;
            }
            return z ? Math.min(iMin, this.e[i]) : iMin;
        }

        public int c() {
            return this.b;
        }

        public int d(int i) {
            return this.c[i];
        }

        public TrackGroupArray e(int i) {
            return this.d[i];
        }

        public int f(int i, int i2, int i3) {
            return this.f[i][i2][i3] & 7;
        }

        public TrackGroupArray g() {
            return this.g;
        }
    }

    public static int d(WH0[] wh0Arr, TrackGroup trackGroup) {
        int length = wh0Arr.length;
        int i = 0;
        for (int i2 = 0; i2 < wh0Arr.length; i2++) {
            WH0 wh0 = wh0Arr[i2];
            for (int i3 = 0; i3 < trackGroup.B; i3++) {
                int iB = wh0.b(trackGroup.a(i3)) & 7;
                if (iB > i) {
                    if (iB == 4) {
                        return i2;
                    }
                    length = i2;
                    i = iB;
                }
            }
        }
        return length;
    }

    public static int[] f(WH0 wh0, TrackGroup trackGroup) {
        int[] iArr = new int[trackGroup.B];
        for (int i = 0; i < trackGroup.B; i++) {
            iArr[i] = wh0.b(trackGroup.a(i));
        }
        return iArr;
    }

    public static int[] g(WH0[] wh0Arr) {
        int length = wh0Arr.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = wh0Arr[i].o();
        }
        return iArr;
    }

    @Override // com.daaw.AbstractC3895d51
    public final void b(Object obj) {
        this.b = (a) obj;
    }

    @Override // com.daaw.AbstractC3895d51
    public final C4173e51 c(WH0[] wh0Arr, TrackGroupArray trackGroupArray) {
        int[] iArr = new int[wh0Arr.length + 1];
        int length = wh0Arr.length + 1;
        TrackGroup[][] trackGroupArr = new TrackGroup[length][];
        int[][][] iArr2 = new int[wh0Arr.length + 1][][];
        for (int i = 0; i < length; i++) {
            int i2 = trackGroupArray.B;
            trackGroupArr[i] = new TrackGroup[i2];
            iArr2[i] = new int[i2][];
        }
        int[] iArrG = g(wh0Arr);
        for (int i3 = 0; i3 < trackGroupArray.B; i3++) {
            TrackGroup trackGroupA = trackGroupArray.a(i3);
            int iD = d(wh0Arr, trackGroupA);
            int[] iArrF = iD == wh0Arr.length ? new int[trackGroupA.B] : f(wh0Arr[iD], trackGroupA);
            int i4 = iArr[iD];
            trackGroupArr[iD][i4] = trackGroupA;
            iArr2[iD][i4] = iArrF;
            iArr[iD] = i4 + 1;
        }
        TrackGroupArray[] trackGroupArrayArr = new TrackGroupArray[wh0Arr.length];
        int[] iArr3 = new int[wh0Arr.length];
        for (int i5 = 0; i5 < wh0Arr.length; i5++) {
            int i6 = iArr[i5];
            trackGroupArrayArr[i5] = new TrackGroupArray((TrackGroup[]) AbstractC6280lb1.N(trackGroupArr[i5], i6));
            iArr2[i5] = (int[][]) AbstractC6280lb1.N(iArr2[i5], i6);
            iArr3[i5] = wh0Arr[i5].h();
        }
        a aVar = new a(iArr3, trackGroupArrayArr, iArrG, iArr2, new TrackGroupArray((TrackGroup[]) AbstractC6280lb1.N(trackGroupArr[wh0Arr.length], iArr[wh0Arr.length])));
        Pair pairH = h(aVar, iArr2, iArrG);
        return new C4173e51((XH0[]) pairH.first, (c[]) pairH.second, aVar);
    }

    public final a e() {
        return this.b;
    }

    public abstract Pair h(a aVar, int[][][] iArr, int[] iArr2);
}
