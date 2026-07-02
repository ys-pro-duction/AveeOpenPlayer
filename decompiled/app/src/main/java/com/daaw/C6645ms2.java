package com.daaw;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.measurement.internal.zzac;
import com.google.android.gms.measurement.internal.zzau;
import com.google.android.gms.measurement.internal.zzlk;
import com.google.android.gms.measurement.internal.zzq;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.ms2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6645ms2 extends AbstractC6211lK1 implements InterfaceC9167vt2 {
    public C6645ms2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // com.daaw.InterfaceC9167vt2
    public final List A0(String str, String str2, String str3) {
        Parcel parcelB = B();
        parcelB.writeString(null);
        parcelB.writeString(str2);
        parcelB.writeString(str3);
        Parcel parcelG = G(17, parcelB);
        ArrayList arrayListCreateTypedArrayList = parcelG.createTypedArrayList(zzac.CREATOR);
        parcelG.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // com.daaw.InterfaceC9167vt2
    public final void I1(zzq zzqVar) {
        Parcel parcelB = B();
        AbstractC7888rL1.d(parcelB, zzqVar);
        I(20, parcelB);
    }

    @Override // com.daaw.InterfaceC9167vt2
    public final List M1(String str, String str2, boolean z, zzq zzqVar) {
        Parcel parcelB = B();
        parcelB.writeString(str);
        parcelB.writeString(str2);
        ClassLoader classLoader = AbstractC7888rL1.a;
        parcelB.writeInt(z ? 1 : 0);
        AbstractC7888rL1.d(parcelB, zzqVar);
        Parcel parcelG = G(14, parcelB);
        ArrayList arrayListCreateTypedArrayList = parcelG.createTypedArrayList(zzlk.CREATOR);
        parcelG.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // com.daaw.InterfaceC9167vt2
    public final byte[] P2(zzau zzauVar, String str) {
        Parcel parcelB = B();
        AbstractC7888rL1.d(parcelB, zzauVar);
        parcelB.writeString(str);
        Parcel parcelG = G(9, parcelB);
        byte[] bArrCreateByteArray = parcelG.createByteArray();
        parcelG.recycle();
        return bArrCreateByteArray;
    }

    @Override // com.daaw.InterfaceC9167vt2
    public final void R(zzq zzqVar) {
        Parcel parcelB = B();
        AbstractC7888rL1.d(parcelB, zzqVar);
        I(6, parcelB);
    }

    @Override // com.daaw.InterfaceC9167vt2
    public final void V2(zzlk zzlkVar, zzq zzqVar) {
        Parcel parcelB = B();
        AbstractC7888rL1.d(parcelB, zzlkVar);
        AbstractC7888rL1.d(parcelB, zzqVar);
        I(2, parcelB);
    }

    @Override // com.daaw.InterfaceC9167vt2
    public final void Z(Bundle bundle, zzq zzqVar) {
        Parcel parcelB = B();
        AbstractC7888rL1.d(parcelB, bundle);
        AbstractC7888rL1.d(parcelB, zzqVar);
        I(19, parcelB);
    }

    @Override // com.daaw.InterfaceC9167vt2
    public final List b0(String str, String str2, String str3, boolean z) {
        Parcel parcelB = B();
        parcelB.writeString(null);
        parcelB.writeString(str2);
        parcelB.writeString(str3);
        ClassLoader classLoader = AbstractC7888rL1.a;
        parcelB.writeInt(z ? 1 : 0);
        Parcel parcelG = G(15, parcelB);
        ArrayList arrayListCreateTypedArrayList = parcelG.createTypedArrayList(zzlk.CREATOR);
        parcelG.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // com.daaw.InterfaceC9167vt2
    public final void f2(zzq zzqVar) {
        Parcel parcelB = B();
        AbstractC7888rL1.d(parcelB, zzqVar);
        I(18, parcelB);
    }

    @Override // com.daaw.InterfaceC9167vt2
    public final void g1(zzq zzqVar) {
        Parcel parcelB = B();
        AbstractC7888rL1.d(parcelB, zzqVar);
        I(4, parcelB);
    }

    @Override // com.daaw.InterfaceC9167vt2
    public final List h1(String str, String str2, zzq zzqVar) {
        Parcel parcelB = B();
        parcelB.writeString(str);
        parcelB.writeString(str2);
        AbstractC7888rL1.d(parcelB, zzqVar);
        Parcel parcelG = G(16, parcelB);
        ArrayList arrayListCreateTypedArrayList = parcelG.createTypedArrayList(zzac.CREATOR);
        parcelG.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // com.daaw.InterfaceC9167vt2
    public final void o1(long j, String str, String str2, String str3) {
        Parcel parcelB = B();
        parcelB.writeLong(j);
        parcelB.writeString(str);
        parcelB.writeString(str2);
        parcelB.writeString(str3);
        I(10, parcelB);
    }

    @Override // com.daaw.InterfaceC9167vt2
    public final String r0(zzq zzqVar) {
        Parcel parcelB = B();
        AbstractC7888rL1.d(parcelB, zzqVar);
        Parcel parcelG = G(11, parcelB);
        String string = parcelG.readString();
        parcelG.recycle();
        return string;
    }

    @Override // com.daaw.InterfaceC9167vt2
    public final void r2(zzac zzacVar, zzq zzqVar) {
        Parcel parcelB = B();
        AbstractC7888rL1.d(parcelB, zzacVar);
        AbstractC7888rL1.d(parcelB, zzqVar);
        I(12, parcelB);
    }

    @Override // com.daaw.InterfaceC9167vt2
    public final void y0(zzau zzauVar, zzq zzqVar) {
        Parcel parcelB = B();
        AbstractC7888rL1.d(parcelB, zzauVar);
        AbstractC7888rL1.d(parcelB, zzqVar);
        I(1, parcelB);
    }
}
