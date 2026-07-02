package com.google.android.exoplayer2;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.AbstractC6280lb1;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.video.ColorInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class Format implements Parcelable {
    public static final Parcelable.Creator<Format> CREATOR = new a();
    public final String B;
    public final int C;
    public final String D;
    public final Metadata E;
    public final String F;
    public final String G;
    public final int H;
    public final List I;
    public final DrmInitData J;
    public final int K;
    public final int L;
    public final float M;
    public final int N;
    public final float O;
    public final int P;
    public final byte[] Q;
    public final ColorInfo R;
    public final int S;
    public final int T;
    public final int U;
    public final int V;
    public final int W;
    public final long X;
    public final int Y;
    public final String Z;
    public final int a0;
    public int b0;

    public static class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Format createFromParcel(Parcel parcel) {
            return new Format(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Format[] newArray(int i) {
            return new Format[i];
        }
    }

    public Format(String str, String str2, String str3, String str4, int i, int i2, int i3, int i4, float f, int i5, float f2, byte[] bArr, int i6, ColorInfo colorInfo, int i7, int i8, int i9, int i10, int i11, int i12, String str5, int i13, long j, List list, DrmInitData drmInitData, Metadata metadata) {
        this.B = str;
        this.F = str2;
        this.G = str3;
        this.D = str4;
        this.C = i;
        this.H = i2;
        this.K = i3;
        this.L = i4;
        this.M = f;
        this.N = i5 == -1 ? 0 : i5;
        this.O = f2 == -1.0f ? 1.0f : f2;
        this.Q = bArr;
        this.P = i6;
        this.R = colorInfo;
        this.S = i7;
        this.T = i8;
        this.U = i9;
        int i14 = i10;
        this.V = i14 == -1 ? 0 : i14;
        this.W = i11 != -1 ? i11 : 0;
        this.Y = i12;
        this.Z = str5;
        this.a0 = i13;
        this.X = j;
        this.I = list == null ? Collections.EMPTY_LIST : list;
        this.J = drmInitData;
        this.E = metadata;
    }

    public static Format A(String str, String str2, String str3, int i, int i2, int i3, int i4, float f, List list, int i5, float f2, DrmInitData drmInitData) {
        return B(str, str2, str3, i, i2, i3, i4, f, list, i5, f2, null, -1, null, drmInitData);
    }

    public static Format B(String str, String str2, String str3, int i, int i2, int i3, int i4, float f, List list, int i5, float f2, byte[] bArr, int i6, ColorInfo colorInfo, DrmInitData drmInitData) {
        return new Format(str, null, str2, str3, i, i2, i3, i4, f, i5, f2, bArr, i6, colorInfo, -1, -1, -1, -1, -1, 0, null, -1, Long.MAX_VALUE, list, drmInitData, null);
    }

    public static Format C(String str, String str2, String str3, int i, int i2, int i3, int i4, float f, List list, DrmInitData drmInitData) {
        return A(str, str2, str3, i, i2, i3, i4, f, list, -1, -1.0f, drmInitData);
    }

    public static String F(Format format) {
        if (format == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("id=");
        sb.append(format.B);
        sb.append(", mimeType=");
        sb.append(format.G);
        if (format.C != -1) {
            sb.append(", bitrate=");
            sb.append(format.C);
        }
        if (format.K != -1 && format.L != -1) {
            sb.append(", res=");
            sb.append(format.K);
            sb.append("x");
            sb.append(format.L);
        }
        if (format.M != -1.0f) {
            sb.append(", fps=");
            sb.append(format.M);
        }
        if (format.S != -1) {
            sb.append(", channels=");
            sb.append(format.S);
        }
        if (format.T != -1) {
            sb.append(", sample_rate=");
            sb.append(format.T);
        }
        if (format.Z != null) {
            sb.append(", language=");
            sb.append(format.Z);
        }
        return sb.toString();
    }

    public static Format h(String str, String str2, String str3, String str4, int i, int i2, int i3, List list, int i4, String str5) {
        return new Format(str, str2, str3, str4, i, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, i2, i3, -1, -1, -1, i4, str5, -1, Long.MAX_VALUE, list, null, null);
    }

    public static Format i(String str, String str2, String str3, int i, int i2, int i3, int i4, int i5, int i6, int i7, List list, DrmInitData drmInitData, int i8, String str4, Metadata metadata) {
        return new Format(str, null, str2, str3, i, i2, -1, -1, -1.0f, -1, -1.0f, null, -1, null, i3, i4, i5, i6, i7, i8, str4, -1, Long.MAX_VALUE, list, drmInitData, metadata);
    }

    public static Format j(String str, String str2, String str3, int i, int i2, int i3, int i4, int i5, List list, DrmInitData drmInitData, int i6, String str4) {
        return i(str, str2, str3, i, i2, i3, i4, i5, -1, -1, list, drmInitData, i6, str4, null);
    }

    public static Format k(String str, String str2, String str3, int i, int i2, int i3, int i4, List list, DrmInitData drmInitData, int i5, String str4) {
        return j(str, str2, str3, i, i2, i3, i4, -1, list, drmInitData, i5, str4);
    }

    public static Format l(String str, String str2, String str3, String str4, int i, int i2, String str5) {
        return new Format(str, str2, str3, str4, i, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, i2, str5, -1, Long.MAX_VALUE, null, null, null);
    }

    public static Format m(String str, String str2, String str3, int i, int i2, List list, String str4, DrmInitData drmInitData) {
        return new Format(str, null, str2, str3, i, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, i2, str4, -1, Long.MAX_VALUE, list, drmInitData, null);
    }

    public static Format n(String str, String str2, long j) {
        return new Format(str, null, str2, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, null, -1, j, null, null, null);
    }

    public static Format o(String str, String str2, String str3, int i, DrmInitData drmInitData) {
        return new Format(str, null, str2, str3, i, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, null, -1, Long.MAX_VALUE, null, drmInitData, null);
    }

    public static Format p(String str, String str2, String str3, String str4, int i, int i2, String str5) {
        return r(str, str2, str3, str4, i, i2, str5, -1);
    }

    public static Format r(String str, String str2, String str3, String str4, int i, int i2, String str5, int i3) {
        return new Format(str, str2, str3, str4, i, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, i2, str5, i3, Long.MAX_VALUE, null, null, null);
    }

    public static Format s(String str, String str2, int i, String str3) {
        return t(str, str2, i, str3, null);
    }

    public static Format t(String str, String str2, int i, String str3, DrmInitData drmInitData) {
        return v(str, str2, null, -1, i, str3, -1, drmInitData, Long.MAX_VALUE, Collections.EMPTY_LIST);
    }

    public static Format u(String str, String str2, String str3, int i, int i2, String str4, int i3, DrmInitData drmInitData) {
        return v(str, str2, str3, i, i2, str4, i3, drmInitData, Long.MAX_VALUE, Collections.EMPTY_LIST);
    }

    public static Format v(String str, String str2, String str3, int i, int i2, String str4, int i3, DrmInitData drmInitData, long j, List list) {
        return new Format(str, null, str2, str3, i, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, i2, str4, i3, j, list, drmInitData, null);
    }

    public static Format x(String str, String str2, String str3, int i, int i2, String str4, DrmInitData drmInitData, long j) {
        return v(str, str2, str3, i, i2, str4, -1, drmInitData, j, Collections.EMPTY_LIST);
    }

    public static Format z(String str, String str2, String str3, String str4, int i, int i2, int i3, float f, List list, int i4) {
        return new Format(str, str2, str3, str4, i, -1, i2, i3, f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, i4, null, -1, Long.MAX_VALUE, list, null, null);
    }

    public int D() {
        int i;
        int i2 = this.K;
        if (i2 == -1 || (i = this.L) == -1) {
            return -1;
        }
        return i2 * i;
    }

    public boolean E(Format format) {
        if (this.I.size() != format.I.size()) {
            return false;
        }
        for (int i = 0; i < this.I.size(); i++) {
            if (!Arrays.equals((byte[]) this.I.get(i), (byte[]) format.I.get(i))) {
                return false;
            }
        }
        return true;
    }

    public Format a(String str, String str2, String str3, int i, int i2, int i3, int i4, String str4) {
        return new Format(str, this.F, str2, str3, i, this.H, i2, i3, this.M, this.N, this.O, this.Q, this.P, this.R, this.S, this.T, this.U, this.V, this.W, i4, str4, this.a0, this.X, this.I, this.J, this.E);
    }

    public Format b(DrmInitData drmInitData) {
        return new Format(this.B, this.F, this.G, this.D, this.C, this.H, this.K, this.L, this.M, this.N, this.O, this.Q, this.P, this.R, this.S, this.T, this.U, this.V, this.W, this.Y, this.Z, this.a0, this.X, this.I, drmInitData, this.E);
    }

    public Format c(int i, int i2) {
        return new Format(this.B, this.F, this.G, this.D, this.C, this.H, this.K, this.L, this.M, this.N, this.O, this.Q, this.P, this.R, this.S, this.T, this.U, i, i2, this.Y, this.Z, this.a0, this.X, this.I, this.J, this.E);
    }

    public Format d(Format format) {
        if (this == format) {
            return this;
        }
        String str = format.B;
        String str2 = this.D;
        if (str2 == null) {
            str2 = format.D;
        }
        String str3 = str2;
        int i = this.C;
        if (i == -1) {
            i = format.C;
        }
        int i2 = i;
        float f = this.M;
        if (f == -1.0f) {
            f = format.M;
        }
        float f2 = f;
        int i3 = this.Y | format.Y;
        String str4 = this.Z;
        if (str4 == null) {
            str4 = format.Z;
        }
        return new Format(str, this.F, this.G, str3, i2, this.H, this.K, this.L, f2, this.N, this.O, this.Q, this.P, this.R, this.S, this.T, this.U, this.V, this.W, i3, str4, this.a0, this.X, this.I, DrmInitData.d(format.J, this.J), this.E);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Format e(int i) {
        return new Format(this.B, this.F, this.G, this.D, this.C, i, this.K, this.L, this.M, this.N, this.O, this.Q, this.P, this.R, this.S, this.T, this.U, this.V, this.W, this.Y, this.Z, this.a0, this.X, this.I, this.J, this.E);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Format.class == obj.getClass()) {
            Format format = (Format) obj;
            if (this.C == format.C && this.H == format.H && this.K == format.K && this.L == format.L && this.M == format.M && this.N == format.N && this.O == format.O && this.P == format.P && this.S == format.S && this.T == format.T && this.U == format.U && this.V == format.V && this.W == format.W && this.X == format.X && this.Y == format.Y && AbstractC6280lb1.b(this.B, format.B) && AbstractC6280lb1.b(this.Z, format.Z) && this.a0 == format.a0 && AbstractC6280lb1.b(this.F, format.F) && AbstractC6280lb1.b(this.G, format.G) && AbstractC6280lb1.b(this.D, format.D) && AbstractC6280lb1.b(this.J, format.J) && AbstractC6280lb1.b(this.E, format.E) && AbstractC6280lb1.b(this.R, format.R) && Arrays.equals(this.Q, format.Q) && E(format)) {
                return true;
            }
        }
        return false;
    }

    public Format f(Metadata metadata) {
        return new Format(this.B, this.F, this.G, this.D, this.C, this.H, this.K, this.L, this.M, this.N, this.O, this.Q, this.P, this.R, this.S, this.T, this.U, this.V, this.W, this.Y, this.Z, this.a0, this.X, this.I, this.J, metadata);
    }

    public Format g(long j) {
        return new Format(this.B, this.F, this.G, this.D, this.C, this.H, this.K, this.L, this.M, this.N, this.O, this.Q, this.P, this.R, this.S, this.T, this.U, this.V, this.W, this.Y, this.Z, this.a0, j, this.I, this.J, this.E);
    }

    public int hashCode() {
        if (this.b0 == 0) {
            String str = this.B;
            int iHashCode = (527 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.F;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.G;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.D;
            int iHashCode4 = (((((((((((iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.C) * 31) + this.K) * 31) + this.L) * 31) + this.S) * 31) + this.T) * 31;
            String str5 = this.Z;
            int iHashCode5 = (((iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31) + this.a0) * 31;
            DrmInitData drmInitData = this.J;
            int iHashCode6 = (iHashCode5 + (drmInitData == null ? 0 : drmInitData.hashCode())) * 31;
            Metadata metadata = this.E;
            this.b0 = iHashCode6 + (metadata != null ? metadata.hashCode() : 0);
        }
        return this.b0;
    }

    public String toString() {
        return "Format(" + this.B + ", " + this.F + ", " + this.G + ", " + this.C + ", " + this.Z + ", [" + this.K + ", " + this.L + ", " + this.M + "], [" + this.S + ", " + this.T + "])";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.B);
        parcel.writeString(this.F);
        parcel.writeString(this.G);
        parcel.writeString(this.D);
        parcel.writeInt(this.C);
        parcel.writeInt(this.H);
        parcel.writeInt(this.K);
        parcel.writeInt(this.L);
        parcel.writeFloat(this.M);
        parcel.writeInt(this.N);
        parcel.writeFloat(this.O);
        AbstractC6280lb1.c0(parcel, this.Q != null);
        byte[] bArr = this.Q;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
        parcel.writeInt(this.P);
        parcel.writeParcelable(this.R, i);
        parcel.writeInt(this.S);
        parcel.writeInt(this.T);
        parcel.writeInt(this.U);
        parcel.writeInt(this.V);
        parcel.writeInt(this.W);
        parcel.writeInt(this.Y);
        parcel.writeString(this.Z);
        parcel.writeInt(this.a0);
        parcel.writeLong(this.X);
        int size = this.I.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeByteArray((byte[]) this.I.get(i2));
        }
        parcel.writeParcelable(this.J, 0);
        parcel.writeParcelable(this.E, 0);
    }

    public Format(Parcel parcel) {
        this.B = parcel.readString();
        this.F = parcel.readString();
        this.G = parcel.readString();
        this.D = parcel.readString();
        this.C = parcel.readInt();
        this.H = parcel.readInt();
        this.K = parcel.readInt();
        this.L = parcel.readInt();
        this.M = parcel.readFloat();
        this.N = parcel.readInt();
        this.O = parcel.readFloat();
        this.Q = AbstractC6280lb1.Q(parcel) ? parcel.createByteArray() : null;
        this.P = parcel.readInt();
        this.R = (ColorInfo) parcel.readParcelable(ColorInfo.class.getClassLoader());
        this.S = parcel.readInt();
        this.T = parcel.readInt();
        this.U = parcel.readInt();
        this.V = parcel.readInt();
        this.W = parcel.readInt();
        this.Y = parcel.readInt();
        this.Z = parcel.readString();
        this.a0 = parcel.readInt();
        this.X = parcel.readLong();
        int i = parcel.readInt();
        this.I = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            this.I.add(parcel.createByteArray());
        }
        this.J = (DrmInitData) parcel.readParcelable(DrmInitData.class.getClassLoader());
        this.E = (Metadata) parcel.readParcelable(Metadata.class.getClassLoader());
    }
}
