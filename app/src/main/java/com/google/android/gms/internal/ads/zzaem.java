package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.AbstractC9004vJ2;
import com.daaw.C0357Ap1;
import com.daaw.C5900kE2;
import com.daaw.C7064oO1;
import com.daaw.UN2;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class zzaem implements zzbx {
    public static final Parcelable.Creator<zzaem> CREATOR = new C0357Ap1();
    public final int B;
    public final String C;
    public final String D;
    public final int E;
    public final int F;
    public final int G;
    public final int H;
    public final byte[] I;

    public zzaem(int i, String str, String str2, int i2, int i3, int i4, int i5, byte[] bArr) {
        this.B = i;
        this.C = str;
        this.D = str2;
        this.E = i2;
        this.F = i3;
        this.G = i4;
        this.H = i5;
        this.I = bArr;
    }

    public static zzaem a(C5900kE2 c5900kE2) {
        int iO = c5900kE2.o();
        String strH = c5900kE2.H(c5900kE2.o(), UN2.a);
        String strH2 = c5900kE2.H(c5900kE2.o(), UN2.c);
        int iO2 = c5900kE2.o();
        int iO3 = c5900kE2.o();
        int iO4 = c5900kE2.o();
        int iO5 = c5900kE2.o();
        int iO6 = c5900kE2.o();
        byte[] bArr = new byte[iO6];
        c5900kE2.c(bArr, 0, iO6);
        return new zzaem(iO, strH, strH2, iO2, iO3, iO4, iO5, bArr);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaem.class == obj.getClass()) {
            zzaem zzaemVar = (zzaem) obj;
            if (this.B == zzaemVar.B && this.C.equals(zzaemVar.C) && this.D.equals(zzaemVar.D) && this.E == zzaemVar.E && this.F == zzaemVar.F && this.G == zzaemVar.G && this.H == zzaemVar.H && Arrays.equals(this.I, zzaemVar.I)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((this.B + 527) * 31) + this.C.hashCode()) * 31) + this.D.hashCode()) * 31) + this.E) * 31) + this.F) * 31) + this.G) * 31) + this.H) * 31) + Arrays.hashCode(this.I);
    }

    @Override // com.google.android.gms.internal.ads.zzbx
    public final void q(C7064oO1 c7064oO1) {
        c7064oO1.s(this.I, this.B);
    }

    public final String toString() {
        return "Picture: mimeType=" + this.C + ", description=" + this.D;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.B);
        parcel.writeString(this.C);
        parcel.writeString(this.D);
        parcel.writeInt(this.E);
        parcel.writeInt(this.F);
        parcel.writeInt(this.G);
        parcel.writeInt(this.H);
        parcel.writeByteArray(this.I);
    }

    public zzaem(Parcel parcel) {
        this.B = parcel.readInt();
        String string = parcel.readString();
        int i = AbstractC9004vJ2.a;
        this.C = string;
        this.D = parcel.readString();
        this.E = parcel.readInt();
        this.F = parcel.readInt();
        this.G = parcel.readInt();
        this.H = parcel.readInt();
        this.I = parcel.createByteArray();
    }
}
