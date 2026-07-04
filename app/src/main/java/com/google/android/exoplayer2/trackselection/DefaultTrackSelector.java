package com.google.android.exoplayer2.trackselection;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.daaw.AbstractC6280lb1;
import com.daaw.AbstractC7115ob;
import com.daaw.PM;
import com.daaw.XH0;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.b;
import com.google.android.exoplayer2.trackselection.c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public class DefaultTrackSelector extends com.google.android.exoplayer2.trackselection.b {
    public static final int[] e = new int[0];
    public final c.a c;
    public final AtomicReference d = new AtomicReference(Parameters.T);

    public static final class Parameters implements Parcelable {
        public final SparseArray B;
        public final SparseBooleanArray C;
        public final String D;
        public final String E;
        public final boolean F;
        public final int G;
        public final int H;
        public final int I;
        public final int J;
        public final boolean K;
        public final int L;
        public final int M;
        public final boolean N;
        public final boolean O;
        public final boolean P;
        public final boolean Q;
        public final boolean R;
        public final int S;
        public static final Parameters T = new Parameters();
        public static final Parcelable.Creator<Parameters> CREATOR = new a();

        public static class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Parameters createFromParcel(Parcel parcel) {
                return new Parameters(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Parameters[] newArray(int i) {
                return new Parameters[i];
            }
        }

        public Parameters() {
            this(new SparseArray(), new SparseBooleanArray(), null, null, false, 0, false, false, true, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, true, true, Integer.MAX_VALUE, Integer.MAX_VALUE, true, 0);
        }

        public static boolean a(SparseBooleanArray sparseBooleanArray, SparseBooleanArray sparseBooleanArray2) {
            int size = sparseBooleanArray.size();
            if (sparseBooleanArray2.size() != size) {
                return false;
            }
            for (int i = 0; i < size; i++) {
                if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i)) < 0) {
                    return false;
                }
            }
            return true;
        }

        public static boolean b(SparseArray sparseArray, SparseArray sparseArray2) {
            int size = sparseArray.size();
            if (sparseArray2.size() != size) {
                return false;
            }
            for (int i = 0; i < size; i++) {
                int iIndexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i));
                if (iIndexOfKey < 0 || !c((Map) sparseArray.valueAt(i), (Map) sparseArray2.valueAt(iIndexOfKey))) {
                    return false;
                }
            }
            return true;
        }

        public static boolean c(Map map, Map map2) {
            if (map2.size() != map.size()) {
                return false;
            }
            for (Map.Entry entry : map.entrySet()) {
                TrackGroupArray trackGroupArray = (TrackGroupArray) entry.getKey();
                if (!map2.containsKey(trackGroupArray) || !AbstractC6280lb1.b(entry.getValue(), map2.get(trackGroupArray))) {
                    return false;
                }
            }
            return true;
        }

        public static SparseArray g(Parcel parcel) {
            int i = parcel.readInt();
            SparseArray sparseArray = new SparseArray(i);
            for (int i2 = 0; i2 < i; i2++) {
                int i3 = parcel.readInt();
                int i4 = parcel.readInt();
                HashMap map = new HashMap(i4);
                for (int i5 = 0; i5 < i4; i5++) {
                    map.put((TrackGroupArray) parcel.readParcelable(TrackGroupArray.class.getClassLoader()), (SelectionOverride) parcel.readParcelable(SelectionOverride.class.getClassLoader()));
                }
                sparseArray.put(i3, map);
            }
            return sparseArray;
        }

        public static void h(Parcel parcel, SparseArray sparseArray) {
            int size = sparseArray.size();
            parcel.writeInt(size);
            for (int i = 0; i < size; i++) {
                int iKeyAt = sparseArray.keyAt(i);
                Map map = (Map) sparseArray.valueAt(i);
                int size2 = map.size();
                parcel.writeInt(iKeyAt);
                parcel.writeInt(size2);
                for (Map.Entry entry : map.entrySet()) {
                    parcel.writeParcelable((Parcelable) entry.getKey(), 0);
                    parcel.writeParcelable((Parcelable) entry.getValue(), 0);
                }
            }
        }

        public final boolean d(int i) {
            return this.C.get(i);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final SelectionOverride e(int i, TrackGroupArray trackGroupArray) {
            Map map = (Map) this.B.get(i);
            if (map != null) {
                return (SelectionOverride) map.get(trackGroupArray);
            }
            return null;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && Parameters.class == obj.getClass()) {
                Parameters parameters = (Parameters) obj;
                if (this.F == parameters.F && this.G == parameters.G && this.O == parameters.O && this.P == parameters.P && this.Q == parameters.Q && this.H == parameters.H && this.I == parameters.I && this.K == parameters.K && this.R == parameters.R && this.N == parameters.N && this.L == parameters.L && this.M == parameters.M && this.J == parameters.J && this.S == parameters.S && TextUtils.equals(this.D, parameters.D) && TextUtils.equals(this.E, parameters.E) && a(this.C, parameters.C) && b(this.B, parameters.B)) {
                    return true;
                }
            }
            return false;
        }

        public final boolean f(int i, TrackGroupArray trackGroupArray) {
            Map map = (Map) this.B.get(i);
            return map != null && map.containsKey(trackGroupArray);
        }

        public int hashCode() {
            int i = (((((((((((((((((((((((((((this.F ? 1 : 0) * 31) + this.G) * 31) + (this.O ? 1 : 0)) * 31) + (this.P ? 1 : 0)) * 31) + (this.Q ? 1 : 0)) * 31) + this.H) * 31) + this.I) * 31) + (this.K ? 1 : 0)) * 31) + (this.R ? 1 : 0)) * 31) + (this.N ? 1 : 0)) * 31) + this.L) * 31) + this.M) * 31) + this.J) * 31) + this.S) * 31;
            String str = this.D;
            int iHashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.E;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            h(parcel, this.B);
            parcel.writeSparseBooleanArray(this.C);
            parcel.writeString(this.D);
            parcel.writeString(this.E);
            AbstractC6280lb1.c0(parcel, this.F);
            parcel.writeInt(this.G);
            AbstractC6280lb1.c0(parcel, this.O);
            AbstractC6280lb1.c0(parcel, this.P);
            AbstractC6280lb1.c0(parcel, this.Q);
            parcel.writeInt(this.H);
            parcel.writeInt(this.I);
            parcel.writeInt(this.J);
            AbstractC6280lb1.c0(parcel, this.K);
            AbstractC6280lb1.c0(parcel, this.R);
            parcel.writeInt(this.L);
            parcel.writeInt(this.M);
            AbstractC6280lb1.c0(parcel, this.N);
            parcel.writeInt(this.S);
        }

        public Parameters(SparseArray sparseArray, SparseBooleanArray sparseBooleanArray, String str, String str2, boolean z, int i, boolean z2, boolean z3, boolean z4, int i2, int i3, int i4, boolean z5, boolean z6, int i5, int i6, boolean z7, int i7) {
            this.B = sparseArray;
            this.C = sparseBooleanArray;
            this.D = AbstractC6280lb1.M(str);
            this.E = AbstractC6280lb1.M(str2);
            this.F = z;
            this.G = i;
            this.O = z2;
            this.P = z3;
            this.Q = z4;
            this.H = i2;
            this.I = i3;
            this.J = i4;
            this.K = z5;
            this.R = z6;
            this.L = i5;
            this.M = i6;
            this.N = z7;
            this.S = i7;
        }

        public Parameters(Parcel parcel) {
            this.B = g(parcel);
            this.C = parcel.readSparseBooleanArray();
            this.D = parcel.readString();
            this.E = parcel.readString();
            this.F = AbstractC6280lb1.Q(parcel);
            this.G = parcel.readInt();
            this.O = AbstractC6280lb1.Q(parcel);
            this.P = AbstractC6280lb1.Q(parcel);
            this.Q = AbstractC6280lb1.Q(parcel);
            this.H = parcel.readInt();
            this.I = parcel.readInt();
            this.J = parcel.readInt();
            this.K = AbstractC6280lb1.Q(parcel);
            this.R = AbstractC6280lb1.Q(parcel);
            this.L = parcel.readInt();
            this.M = parcel.readInt();
            this.N = AbstractC6280lb1.Q(parcel);
            this.S = parcel.readInt();
        }
    }

    public static final class a {
        public final int a;
        public final int b;
        public final String c;

        public a(int i, int i2, String str) {
            this.a = i;
            this.b = i2;
            this.c = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.a == aVar.a && this.b == aVar.b && TextUtils.equals(this.c, aVar.c)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            int i = ((this.a * 31) + this.b) * 31;
            String str = this.c;
            return i + (str != null ? str.hashCode() : 0);
        }
    }

    public static final class b implements Comparable {
        public final Parameters B;
        public final int C;
        public final int D;
        public final int E;
        public final int F;
        public final int G;
        public final int H;

        public b(Format format, Parameters parameters, int i) {
            this.B = parameters;
            this.C = DefaultTrackSelector.v(i, false) ? 1 : 0;
            this.D = DefaultTrackSelector.m(format, parameters.D) ? 1 : 0;
            this.E = (format.Y & 1) != 0 ? 1 : 0;
            this.F = format.S;
            this.G = format.T;
            this.H = format.C;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(b bVar) {
            int iK;
            int i = this.C;
            int i2 = bVar.C;
            if (i != i2) {
                return DefaultTrackSelector.k(i, i2);
            }
            int i3 = this.D;
            int i4 = bVar.D;
            if (i3 != i4) {
                return DefaultTrackSelector.k(i3, i4);
            }
            int i5 = this.E;
            int i6 = bVar.E;
            if (i5 != i6) {
                return DefaultTrackSelector.k(i5, i6);
            }
            if (this.B.O) {
                return DefaultTrackSelector.k(bVar.H, this.H);
            }
            int i7 = i != 1 ? -1 : 1;
            int i8 = this.F;
            int i9 = bVar.F;
            if (i8 != i9) {
                iK = DefaultTrackSelector.k(i8, i9);
            } else {
                int i10 = this.G;
                int i11 = bVar.G;
                iK = i10 != i11 ? DefaultTrackSelector.k(i10, i11) : DefaultTrackSelector.k(this.H, bVar.H);
            }
            return i7 * iK;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && b.class == obj.getClass()) {
                b bVar = (b) obj;
                if (this.C == bVar.C && this.D == bVar.D && this.E == bVar.E && this.F == bVar.F && this.G == bVar.G && this.H == bVar.H) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (((((((((this.C * 31) + this.D) * 31) + this.E) * 31) + this.F) * 31) + this.G) * 31) + this.H;
        }
    }

    public DefaultTrackSelector(c.a aVar) {
        this.c = aVar;
    }

    public static c A(TrackGroupArray trackGroupArray, int[][] iArr, int i, Parameters parameters, c.a aVar) {
        int i2 = parameters.Q ? 24 : 16;
        boolean z = parameters.P && (i & i2) != 0;
        for (int i3 = 0; i3 < trackGroupArray.B; i3++) {
            TrackGroup trackGroupA = trackGroupArray.a(i3);
            int[] iArrR = r(trackGroupA, iArr[i3], z, i2, parameters.H, parameters.I, parameters.J, parameters.L, parameters.M, parameters.N);
            if (iArrR.length > 0) {
                return ((c.a) AbstractC7115ob.e(aVar)).a(trackGroupA, iArrR);
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.exoplayer2.trackselection.c D(com.google.android.exoplayer2.source.TrackGroupArray r19, int[][] r20, com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters r21) {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.trackselection.DefaultTrackSelector.D(com.google.android.exoplayer2.source.TrackGroupArray, int[][], com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters):com.google.android.exoplayer2.trackselection.c");
    }

    public static int j(int i, int i2) {
        if (i == -1) {
            return i2 == -1 ? 0 : -1;
        }
        if (i2 == -1) {
            return 1;
        }
        return i - i2;
    }

    public static int k(int i, int i2) {
        if (i > i2) {
            return 1;
        }
        return i2 > i ? -1 : 0;
    }

    public static void l(TrackGroup trackGroup, int[] iArr, int i, String str, int i2, int i3, int i4, List list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            int iIntValue = ((Integer) list.get(size)).intValue();
            if (!x(trackGroup.a(iIntValue), str, iArr[iIntValue], i, i2, i3, i4)) {
                list.remove(size);
            }
        }
    }

    public static boolean m(Format format, String str) {
        return str != null && TextUtils.equals(str, AbstractC6280lb1.M(format.Z));
    }

    public static boolean n(Format format) {
        return TextUtils.isEmpty(format.Z) || m(format, "und");
    }

    public static int o(TrackGroup trackGroup, int[] iArr, a aVar) {
        int i = 0;
        for (int i2 = 0; i2 < trackGroup.B; i2++) {
            if (w(trackGroup.a(i2), iArr[i2], aVar)) {
                i++;
            }
        }
        return i;
    }

    public static int[] p(TrackGroup trackGroup, int[] iArr, boolean z) {
        int iO;
        HashSet hashSet = new HashSet();
        a aVar = null;
        int i = 0;
        for (int i2 = 0; i2 < trackGroup.B; i2++) {
            Format formatA = trackGroup.a(i2);
            a aVar2 = new a(formatA.S, formatA.T, z ? null : formatA.G);
            if (hashSet.add(aVar2) && (iO = o(trackGroup, iArr, aVar2)) > i) {
                i = iO;
                aVar = aVar2;
            }
        }
        if (i <= 1) {
            return e;
        }
        int[] iArr2 = new int[i];
        int i3 = 0;
        for (int i4 = 0; i4 < trackGroup.B; i4++) {
            if (w(trackGroup.a(i4), iArr[i4], (a) AbstractC7115ob.e(aVar))) {
                iArr2[i3] = i4;
                i3++;
            }
        }
        return iArr2;
    }

    public static int q(TrackGroup trackGroup, int[] iArr, int i, String str, int i2, int i3, int i4, List list) {
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            int iIntValue = ((Integer) list.get(i6)).intValue();
            if (x(trackGroup.a(iIntValue), str, iArr[iIntValue], i, i2, i3, i4)) {
                i5++;
            }
        }
        return i5;
    }

    public static int[] r(TrackGroup trackGroup, int[] iArr, boolean z, int i, int i2, int i3, int i4, int i5, int i6, boolean z2) {
        int i7;
        int i8;
        int i9;
        String str;
        int i10;
        int i11;
        int i12;
        int[] iArr2;
        TrackGroup trackGroup2;
        if (trackGroup.B < 2) {
            return e;
        }
        List listU = u(trackGroup, i5, i6, z2);
        if (listU.size() < 2) {
            return e;
        }
        if (z) {
            i7 = i3;
            i8 = i2;
            i9 = i4;
            str = null;
        } else {
            HashSet hashSet = new HashSet();
            String str2 = null;
            int i13 = 0;
            int i14 = 0;
            while (i13 < listU.size()) {
                String str3 = trackGroup.a(((Integer) listU.get(i13)).intValue()).G;
                if (hashSet.add(str3)) {
                    int i15 = i4;
                    i12 = i3;
                    i10 = i2;
                    iArr2 = iArr;
                    trackGroup2 = trackGroup;
                    int iQ = q(trackGroup2, iArr2, i, str3, i10, i12, i15, listU);
                    i11 = i15;
                    if (iQ > i14) {
                        i14 = iQ;
                        str2 = str3;
                    }
                } else {
                    int i16 = i3;
                    i10 = i2;
                    i11 = i4;
                    i12 = i16;
                    iArr2 = iArr;
                    trackGroup2 = trackGroup;
                }
                i13++;
                int i17 = i12;
                i4 = i11;
                i2 = i10;
                i3 = i17;
                trackGroup = trackGroup2;
                iArr = iArr2;
            }
            i7 = i3;
            i8 = i2;
            i9 = i4;
            str = str2;
        }
        l(trackGroup, iArr, i, str, i8, i7, i9, listU);
        return listU.size() < 2 ? e : AbstractC6280lb1.Z(listU);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x000f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Point s(boolean r3, int r4, int r5, int r6, int r7) {
        /*
            if (r3 == 0) goto Lf
            r3 = 0
            r0 = 1
            if (r6 <= r7) goto L8
            r1 = 1
            goto L9
        L8:
            r1 = 0
        L9:
            if (r4 <= r5) goto Lc
            r3 = 1
        Lc:
            if (r1 == r3) goto Lf
            goto L12
        Lf:
            r2 = r5
            r5 = r4
            r4 = r2
        L12:
            int r3 = r6 * r4
            int r0 = r7 * r5
            if (r3 < r0) goto L22
            android.graphics.Point r3 = new android.graphics.Point
            int r4 = com.daaw.AbstractC6280lb1.f(r0, r6)
            r3.<init>(r5, r4)
            return r3
        L22:
            android.graphics.Point r5 = new android.graphics.Point
            int r3 = com.daaw.AbstractC6280lb1.f(r3, r7)
            r5.<init>(r3, r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.trackselection.DefaultTrackSelector.s(boolean, int, int, int, int):android.graphics.Point");
    }

    public static List u(TrackGroup trackGroup, int i, int i2, boolean z) {
        int i3;
        ArrayList arrayList = new ArrayList(trackGroup.B);
        for (int i4 = 0; i4 < trackGroup.B; i4++) {
            arrayList.add(Integer.valueOf(i4));
        }
        if (i != Integer.MAX_VALUE && i2 != Integer.MAX_VALUE) {
            int i5 = Integer.MAX_VALUE;
            for (int i6 = 0; i6 < trackGroup.B; i6++) {
                Format formatA = trackGroup.a(i6);
                int i7 = formatA.K;
                if (i7 > 0 && (i3 = formatA.L) > 0) {
                    Point pointS = s(z, i, i2, i7, i3);
                    int i8 = formatA.K;
                    int i9 = formatA.L;
                    int i10 = i8 * i9;
                    if (i8 >= ((int) (pointS.x * 0.98f)) && i9 >= ((int) (pointS.y * 0.98f)) && i10 < i5) {
                        i5 = i10;
                    }
                }
            }
            if (i5 != Integer.MAX_VALUE) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    int iD = trackGroup.a(((Integer) arrayList.get(size)).intValue()).D();
                    if (iD == -1 || iD > i5) {
                        arrayList.remove(size);
                    }
                }
            }
        }
        return arrayList;
    }

    public static boolean v(int i, boolean z) {
        int i2 = i & 7;
        if (i2 != 4) {
            return z && i2 == 3;
        }
        return true;
    }

    public static boolean w(Format format, int i, a aVar) {
        String str;
        return v(i, false) && format.S == aVar.a && format.T == aVar.b && ((str = aVar.c) == null || TextUtils.equals(str, format.G));
    }

    public static boolean x(Format format, String str, int i, int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        int i8;
        return v(i, false) && (i & i2) != 0 && (str == null || AbstractC6280lb1.b(format.G, str)) && (((i6 = format.K) == -1 || i6 <= i3) && (((i7 = format.L) == -1 || i7 <= i4) && ((i8 = format.C) == -1 || i8 <= i5)));
    }

    public static void y(b.a aVar, int[][][] iArr, XH0[] xh0Arr, c[] cVarArr, int i) {
        boolean z;
        if (i == 0) {
            return;
        }
        boolean z2 = false;
        int i2 = -1;
        int i3 = -1;
        for (int i4 = 0; i4 < aVar.c(); i4++) {
            int iD = aVar.d(i4);
            c cVar = cVarArr[i4];
            if ((iD == 1 || iD == 2) && cVar != null && z(iArr[i4], aVar.e(i4), cVar)) {
                if (iD == 1) {
                    if (i3 != -1) {
                        z = false;
                        break;
                    }
                    i3 = i4;
                } else {
                    if (i2 != -1) {
                        z = false;
                        break;
                    }
                    i2 = i4;
                }
            }
        }
        z = true;
        if (i3 != -1 && i2 != -1) {
            z2 = true;
        }
        if (z && z2) {
            XH0 xh0 = new XH0(i);
            xh0Arr[i3] = xh0;
            xh0Arr[i2] = xh0;
        }
    }

    public static boolean z(int[][] iArr, TrackGroupArray trackGroupArray, c cVar) {
        if (cVar == null) {
            return false;
        }
        int iB = trackGroupArray.b(cVar.a());
        for (int i = 0; i < cVar.length(); i++) {
            if ((iArr[iB][cVar.g(i)] & 32) != 32) {
                return false;
            }
        }
        return true;
    }

    public c[] B(b.a aVar, int[][][] iArr, int[] iArr2, Parameters parameters) {
        int iC = aVar.c();
        c[] cVarArr = new c[iC];
        boolean z = false;
        int i = 0;
        boolean z2 = false;
        while (true) {
            if (i >= iC) {
                break;
            }
            if (2 == aVar.d(i)) {
                if (!z) {
                    c cVarG = G(aVar.e(i), iArr[i], iArr2[i], parameters, this.c);
                    cVarArr[i] = cVarG;
                    z = cVarG != null;
                }
                z2 |= aVar.e(i).B > 0;
            }
            i++;
        }
        boolean z3 = false;
        boolean z4 = false;
        for (int i2 = 0; i2 < iC; i2++) {
            int iD = aVar.d(i2);
            if (iD != 1) {
                if (iD != 2) {
                    if (iD != 3) {
                        cVarArr[i2] = E(iD, aVar.e(i2), iArr[i2], parameters);
                    } else if (!z4) {
                        c cVarF = F(aVar.e(i2), iArr[i2], parameters);
                        cVarArr[i2] = cVarF;
                        z4 = cVarF != null;
                    }
                }
            } else if (!z3) {
                c cVarC = C(aVar.e(i2), iArr[i2], iArr2[i2], parameters, z2 ? null : this.c);
                cVarArr[i2] = cVarC;
                z3 = cVarC != null;
            }
        }
        return cVarArr;
    }

    public c C(TrackGroupArray trackGroupArray, int[][] iArr, int i, Parameters parameters, c.a aVar) {
        b bVar = null;
        int i2 = -1;
        int i3 = -1;
        for (int i4 = 0; i4 < trackGroupArray.B; i4++) {
            TrackGroup trackGroupA = trackGroupArray.a(i4);
            int[] iArr2 = iArr[i4];
            for (int i5 = 0; i5 < trackGroupA.B; i5++) {
                if (v(iArr2[i5], parameters.R)) {
                    b bVar2 = new b(trackGroupA.a(i5), parameters, iArr2[i5]);
                    if (bVar == null || bVar2.compareTo(bVar) > 0) {
                        i2 = i4;
                        i3 = i5;
                        bVar = bVar2;
                    }
                }
            }
        }
        if (i2 == -1) {
            return null;
        }
        TrackGroup trackGroupA2 = trackGroupArray.a(i2);
        if (!parameters.O && aVar != null) {
            int[] iArrP = p(trackGroupA2, iArr[i2], parameters.P);
            if (iArrP.length > 0) {
                return aVar.a(trackGroupA2, iArrP);
            }
        }
        return new PM(trackGroupA2, i3);
    }

    public c E(int i, TrackGroupArray trackGroupArray, int[][] iArr, Parameters parameters) {
        TrackGroup trackGroup = null;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < trackGroupArray.B; i4++) {
            TrackGroup trackGroupA = trackGroupArray.a(i4);
            int[] iArr2 = iArr[i4];
            for (int i5 = 0; i5 < trackGroupA.B; i5++) {
                if (v(iArr2[i5], parameters.R)) {
                    int i6 = (trackGroupA.a(i5).Y & 1) != 0 ? 2 : 1;
                    if (v(iArr2[i5], false)) {
                        i6 += 1000;
                    }
                    if (i6 > i3) {
                        trackGroup = trackGroupA;
                        i2 = i5;
                        i3 = i6;
                    }
                }
            }
        }
        if (trackGroup == null) {
            return null;
        }
        return new PM(trackGroup, i2);
    }

    public c F(TrackGroupArray trackGroupArray, int[][] iArr, Parameters parameters) {
        TrackGroup trackGroup = null;
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < trackGroupArray.B; i3++) {
            TrackGroup trackGroupA = trackGroupArray.a(i3);
            int[] iArr2 = iArr[i3];
            for (int i4 = 0; i4 < trackGroupA.B; i4++) {
                if (v(iArr2[i4], parameters.R)) {
                    Format formatA = trackGroupA.a(i4);
                    int i5 = formatA.Y & (~parameters.G);
                    int i6 = 1;
                    boolean z = (i5 & 1) != 0;
                    boolean z2 = (i5 & 2) != 0;
                    boolean zM = m(formatA, parameters.E);
                    if (zM || (parameters.F && n(formatA))) {
                        i6 = (z ? 8 : !z2 ? 6 : 4) + (zM ? 1 : 0);
                    } else if (z) {
                        i6 = 3;
                    } else if (z2) {
                        if (m(formatA, parameters.D)) {
                            i6 = 2;
                        }
                    }
                    if (v(iArr2[i4], false)) {
                        i6 += 1000;
                    }
                    if (i6 > i2) {
                        trackGroup = trackGroupA;
                        i = i4;
                        i2 = i6;
                    }
                }
            }
        }
        if (trackGroup == null) {
            return null;
        }
        return new PM(trackGroup, i);
    }

    public c G(TrackGroupArray trackGroupArray, int[][] iArr, int i, Parameters parameters, c.a aVar) {
        c cVarA = (parameters.O || aVar == null) ? null : A(trackGroupArray, iArr, i, parameters, aVar);
        return cVarA == null ? D(trackGroupArray, iArr, parameters) : cVarA;
    }

    @Override // com.google.android.exoplayer2.trackselection.b
    public final Pair h(b.a aVar, int[][][] iArr, int[] iArr2) {
        Parameters parameters = (Parameters) this.d.get();
        int iC = aVar.c();
        c[] cVarArrB = B(aVar, iArr, iArr2, parameters);
        for (int i = 0; i < iC; i++) {
            if (parameters.d(i)) {
                cVarArrB[i] = null;
            } else {
                TrackGroupArray trackGroupArrayE = aVar.e(i);
                if (parameters.f(i, trackGroupArrayE)) {
                    SelectionOverride selectionOverrideE = parameters.e(i, trackGroupArrayE);
                    if (selectionOverrideE == null) {
                        cVarArrB[i] = null;
                    } else if (selectionOverrideE.D == 1) {
                        cVarArrB[i] = new PM(trackGroupArrayE.a(selectionOverrideE.B), selectionOverrideE.C[0]);
                    } else {
                        cVarArrB[i] = ((c.a) AbstractC7115ob.e(this.c)).a(trackGroupArrayE.a(selectionOverrideE.B), selectionOverrideE.C);
                    }
                }
            }
        }
        XH0[] xh0Arr = new XH0[iC];
        for (int i2 = 0; i2 < iC; i2++) {
            xh0Arr[i2] = (parameters.d(i2) || (aVar.d(i2) != 5 && cVarArrB[i2] == null)) ? null : XH0.b;
        }
        y(aVar, iArr, xh0Arr, cVarArrB, parameters.S);
        return Pair.create(xh0Arr, cVarArrB);
    }

    public Parameters t() {
        return (Parameters) this.d.get();
    }

    public static final class SelectionOverride implements Parcelable {
        public static final Parcelable.Creator<SelectionOverride> CREATOR = new a();
        public final int B;
        public final int[] C;
        public final int D;

        public static class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SelectionOverride createFromParcel(Parcel parcel) {
                return new SelectionOverride(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SelectionOverride[] newArray(int i) {
                return new SelectionOverride[i];
            }
        }

        public SelectionOverride(int i, int... iArr) {
            this.B = i;
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            this.C = iArrCopyOf;
            this.D = iArr.length;
            Arrays.sort(iArrCopyOf);
        }

        public boolean a(int i) {
            for (int i2 : this.C) {
                if (i2 == i) {
                    return true;
                }
            }
            return false;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && SelectionOverride.class == obj.getClass()) {
                SelectionOverride selectionOverride = (SelectionOverride) obj;
                if (this.B == selectionOverride.B && Arrays.equals(this.C, selectionOverride.C)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (this.B * 31) + Arrays.hashCode(this.C);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.B);
            parcel.writeInt(this.C.length);
            parcel.writeIntArray(this.C);
        }

        public SelectionOverride(Parcel parcel) {
            this.B = parcel.readInt();
            int i = parcel.readByte();
            this.D = i;
            int[] iArr = new int[i];
            this.C = iArr;
            parcel.readIntArray(iArr);
        }
    }
}
