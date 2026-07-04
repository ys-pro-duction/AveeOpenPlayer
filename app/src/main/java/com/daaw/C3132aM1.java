package com.daaw;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.internal.ads.zzbwi;

/* JADX INFO: renamed from: com.daaw.aM1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3132aM1 extends AbstractC6395lz1 implements InterfaceC3689cM1 {
    public C3132aM1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    @Override // com.daaw.InterfaceC3689cM1
    public final void B0(InterfaceC7351pQ1 interfaceC7351pQ1) {
        Parcel parcelB = B();
        AbstractC6953nz1.f(parcelB, interfaceC7351pQ1);
        I(16, parcelB);
    }

    @Override // com.daaw.InterfaceC3689cM1
    public final void B1(zzbwi zzbwiVar) {
        throw null;
    }

    @Override // com.daaw.InterfaceC3689cM1
    public final void P1(int i) {
        throw null;
    }

    @Override // com.daaw.InterfaceC3689cM1
    public final void R0(QG1 qg1, String str) {
        Parcel parcelB = B();
        AbstractC6953nz1.f(parcelB, qg1);
        parcelB.writeString(str);
        I(10, parcelB);
    }

    @Override // com.daaw.InterfaceC3689cM1
    public final void X1(String str, String str2) {
        Parcel parcelB = B();
        parcelB.writeString(str);
        parcelB.writeString(str2);
        I(9, parcelB);
    }

    @Override // com.daaw.InterfaceC3689cM1
    public final void b(int i) {
        Parcel parcelB = B();
        parcelB.writeInt(i);
        I(3, parcelB);
    }

    @Override // com.daaw.InterfaceC3689cM1
    public final void d() {
        I(15, B());
    }

    @Override // com.daaw.InterfaceC3689cM1
    public final void d0(int i, String str) {
        Parcel parcelB = B();
        parcelB.writeInt(i);
        parcelB.writeString(str);
        I(22, parcelB);
    }

    @Override // com.daaw.InterfaceC3689cM1
    public final void i() {
        I(13, B());
    }

    @Override // com.daaw.InterfaceC3689cM1
    public final void l0(zze zzeVar) {
        Parcel parcelB = B();
        AbstractC6953nz1.d(parcelB, zzeVar);
        I(23, parcelB);
    }

    @Override // com.daaw.InterfaceC3689cM1
    public final void n1(zze zzeVar) {
        Parcel parcelB = B();
        AbstractC6953nz1.d(parcelB, zzeVar);
        I(24, parcelB);
    }

    @Override // com.daaw.InterfaceC3689cM1
    public final void p(String str) {
        Parcel parcelB = B();
        parcelB.writeString(str);
        I(21, parcelB);
    }

    @Override // com.daaw.InterfaceC3689cM1
    public final void zze() {
        I(1, B());
    }

    @Override // com.daaw.InterfaceC3689cM1
    public final void zzf() {
        I(2, B());
    }

    @Override // com.daaw.InterfaceC3689cM1
    public final void zzm() {
        I(8, B());
    }

    @Override // com.daaw.InterfaceC3689cM1
    public final void zzn() {
        I(4, B());
    }

    @Override // com.daaw.InterfaceC3689cM1
    public final void zzo() {
        I(6, B());
    }

    @Override // com.daaw.InterfaceC3689cM1
    public final void zzp() {
        I(5, B());
    }

    @Override // com.daaw.InterfaceC3689cM1
    public final void zzu() {
        I(18, B());
    }

    @Override // com.daaw.InterfaceC3689cM1
    public final void zzv() {
        I(11, B());
    }

    @Override // com.daaw.InterfaceC3689cM1
    public final void zzx() {
        I(20, B());
    }
}
