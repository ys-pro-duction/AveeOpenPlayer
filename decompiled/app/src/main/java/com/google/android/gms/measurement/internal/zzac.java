package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.AbstractC7506py0;
import com.daaw.C0778Eo1;
import com.daaw.JM0;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzac extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzac> CREATOR = new C0778Eo1();
    public String B;
    public String C;
    public zzlk D;
    public long E;
    public boolean F;
    public String G;
    public final zzau H;
    public long I;
    public zzau J;
    public final long K;
    public final zzau L;

    public zzac(zzac zzacVar) {
        AbstractC7506py0.l(zzacVar);
        this.B = zzacVar.B;
        this.C = zzacVar.C;
        this.D = zzacVar.D;
        this.E = zzacVar.E;
        this.F = zzacVar.F;
        this.G = zzacVar.G;
        this.H = zzacVar.H;
        this.I = zzacVar.I;
        this.J = zzacVar.J;
        this.K = zzacVar.K;
        this.L = zzacVar.L;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = JM0.a(parcel);
        JM0.q(parcel, 2, this.B, false);
        JM0.q(parcel, 3, this.C, false);
        JM0.p(parcel, 4, this.D, i, false);
        JM0.n(parcel, 5, this.E);
        JM0.c(parcel, 6, this.F);
        JM0.q(parcel, 7, this.G, false);
        JM0.p(parcel, 8, this.H, i, false);
        JM0.n(parcel, 9, this.I);
        JM0.p(parcel, 10, this.J, i, false);
        JM0.n(parcel, 11, this.K);
        JM0.p(parcel, 12, this.L, i, false);
        JM0.b(parcel, iA);
    }

    public zzac(String str, String str2, zzlk zzlkVar, long j, boolean z, String str3, zzau zzauVar, long j2, zzau zzauVar2, long j3, zzau zzauVar3) {
        this.B = str;
        this.C = str2;
        this.D = zzlkVar;
        this.E = j;
        this.F = z;
        this.G = str3;
        this.H = zzauVar;
        this.I = j2;
        this.J = zzauVar2;
        this.K = j3;
        this.L = zzauVar3;
    }
}
