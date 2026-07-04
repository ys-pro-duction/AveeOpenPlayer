package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import com.daaw.AbstractC6395lz1;
import com.daaw.AbstractC6953nz1;
import com.daaw.InterfaceC7934rX;
import com.daaw.SL1;
import com.daaw.YJ1;
import com.google.android.gms.internal.ads.zzblg;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class zzcm extends AbstractC6395lz1 implements zzco {
    public zzcm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final float zze() {
        Parcel parcelG = G(7, B());
        float f = parcelG.readFloat();
        parcelG.recycle();
        return f;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final String zzf() {
        Parcel parcelG = G(9, B());
        String string = parcelG.readString();
        parcelG.recycle();
        return string;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final List zzg() {
        Parcel parcelG = G(13, B());
        ArrayList arrayListCreateTypedArrayList = parcelG.createTypedArrayList(zzblg.CREATOR);
        parcelG.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzh(String str) {
        Parcel parcelB = B();
        parcelB.writeString(str);
        I(10, parcelB);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzi() {
        I(15, B());
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzj(boolean z) {
        Parcel parcelB = B();
        ClassLoader classLoader = AbstractC6953nz1.a;
        parcelB.writeInt(z ? 1 : 0);
        I(17, parcelB);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzk() {
        I(1, B());
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzl(String str, InterfaceC7934rX interfaceC7934rX) {
        Parcel parcelB = B();
        parcelB.writeString(null);
        AbstractC6953nz1.f(parcelB, interfaceC7934rX);
        I(6, parcelB);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzm(zzda zzdaVar) {
        Parcel parcelB = B();
        AbstractC6953nz1.f(parcelB, zzdaVar);
        I(16, parcelB);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzn(InterfaceC7934rX interfaceC7934rX, String str) {
        Parcel parcelB = B();
        AbstractC6953nz1.f(parcelB, interfaceC7934rX);
        parcelB.writeString(str);
        I(5, parcelB);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzo(SL1 sl1) {
        Parcel parcelB = B();
        AbstractC6953nz1.f(parcelB, sl1);
        I(11, parcelB);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzp(boolean z) {
        Parcel parcelB = B();
        ClassLoader classLoader = AbstractC6953nz1.a;
        parcelB.writeInt(z ? 1 : 0);
        I(4, parcelB);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzq(float f) {
        Parcel parcelB = B();
        parcelB.writeFloat(f);
        I(2, parcelB);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzr(String str) {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzs(YJ1 yj1) {
        Parcel parcelB = B();
        AbstractC6953nz1.f(parcelB, yj1);
        I(12, parcelB);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzt(String str) {
        Parcel parcelB = B();
        parcelB.writeString(str);
        I(18, parcelB);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzu(zzff zzffVar) {
        Parcel parcelB = B();
        AbstractC6953nz1.d(parcelB, zzffVar);
        I(14, parcelB);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final boolean zzv() {
        Parcel parcelG = G(8, B());
        boolean zG = AbstractC6953nz1.g(parcelG);
        parcelG.recycle();
        return zG;
    }
}
