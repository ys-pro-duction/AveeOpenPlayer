package com.daaw;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.daaw.InterfaceC7934rX;
import com.google.android.gms.ads.internal.client.zzcs;
import com.google.android.gms.ads.internal.client.zzcw;
import com.google.android.gms.ads.internal.client.zzdg;
import com.google.android.gms.ads.internal.client.zzdm;
import com.google.android.gms.ads.internal.client.zzdn;
import com.google.android.gms.ads.internal.client.zzdp;
import com.google.android.gms.ads.internal.client.zzdq;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.vH1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8995vH1 extends AbstractC6395lz1 implements InterfaceC9553xH1 {
    public C8995vH1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
    }

    @Override // com.daaw.InterfaceC9553xH1
    public final void A1(zzcs zzcsVar) {
        Parcel parcelB = B();
        AbstractC6953nz1.f(parcelB, zzcsVar);
        I(26, parcelB);
    }

    @Override // com.daaw.InterfaceC9553xH1
    public final void D() {
        I(27, B());
    }

    @Override // com.daaw.InterfaceC9553xH1
    public final void E0(zzdg zzdgVar) {
        Parcel parcelB = B();
        AbstractC6953nz1.f(parcelB, zzdgVar);
        I(32, parcelB);
    }

    @Override // com.daaw.InterfaceC9553xH1
    public final boolean R1(Bundle bundle) {
        Parcel parcelB = B();
        AbstractC6953nz1.d(parcelB, bundle);
        Parcel parcelG = G(16, parcelB);
        boolean zG = AbstractC6953nz1.g(parcelG);
        parcelG.recycle();
        return zG;
    }

    @Override // com.daaw.InterfaceC9553xH1
    public final void S2(Bundle bundle) {
        Parcel parcelB = B();
        AbstractC6953nz1.d(parcelB, bundle);
        I(15, parcelB);
    }

    @Override // com.daaw.InterfaceC9553xH1
    public final void T0(Bundle bundle) {
        Parcel parcelB = B();
        AbstractC6953nz1.d(parcelB, bundle);
        I(17, parcelB);
    }

    @Override // com.daaw.InterfaceC9553xH1
    public final void d() {
        I(22, B());
    }

    @Override // com.daaw.InterfaceC9553xH1
    public final boolean j() {
        Parcel parcelG = G(30, B());
        boolean zG = AbstractC6953nz1.g(parcelG);
        parcelG.recycle();
        return zG;
    }

    @Override // com.daaw.InterfaceC9553xH1
    public final void q0(zzcw zzcwVar) {
        Parcel parcelB = B();
        AbstractC6953nz1.f(parcelB, zzcwVar);
        I(25, parcelB);
    }

    @Override // com.daaw.InterfaceC9553xH1
    public final void x2(InterfaceC8709uH1 interfaceC8709uH1) {
        Parcel parcelB = B();
        AbstractC6953nz1.f(parcelB, interfaceC8709uH1);
        I(21, parcelB);
    }

    @Override // com.daaw.InterfaceC9553xH1
    public final void zzA() {
        I(28, B());
    }

    @Override // com.daaw.InterfaceC9553xH1
    public final boolean zzH() {
        Parcel parcelG = G(24, B());
        boolean zG = AbstractC6953nz1.g(parcelG);
        parcelG.recycle();
        return zG;
    }

    @Override // com.daaw.InterfaceC9553xH1
    public final double zze() {
        Parcel parcelG = G(8, B());
        double d = parcelG.readDouble();
        parcelG.recycle();
        return d;
    }

    @Override // com.daaw.InterfaceC9553xH1
    public final Bundle zzf() {
        Parcel parcelG = G(20, B());
        Bundle bundle = (Bundle) AbstractC6953nz1.a(parcelG, Bundle.CREATOR);
        parcelG.recycle();
        return bundle;
    }

    @Override // com.daaw.InterfaceC9553xH1
    public final zzdn zzg() {
        Parcel parcelG = G(31, B());
        zzdn zzdnVarZzb = zzdm.zzb(parcelG.readStrongBinder());
        parcelG.recycle();
        return zzdnVarZzb;
    }

    @Override // com.daaw.InterfaceC9553xH1
    public final zzdq zzh() {
        Parcel parcelG = G(11, B());
        zzdq zzdqVarZzb = zzdp.zzb(parcelG.readStrongBinder());
        parcelG.recycle();
        return zzdqVarZzb;
    }

    @Override // com.daaw.InterfaceC9553xH1
    public final InterfaceC5907kG1 zzi() {
        InterfaceC5907kG1 c5348iG1;
        Parcel parcelG = G(14, B());
        IBinder strongBinder = parcelG.readStrongBinder();
        if (strongBinder == null) {
            c5348iG1 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
            c5348iG1 = iInterfaceQueryLocalInterface instanceof InterfaceC5907kG1 ? (InterfaceC5907kG1) iInterfaceQueryLocalInterface : new C5348iG1(strongBinder);
        }
        parcelG.recycle();
        return c5348iG1;
    }

    @Override // com.daaw.InterfaceC9553xH1
    public final InterfaceC7311pG1 zzj() {
        InterfaceC7311pG1 c6753nG1;
        Parcel parcelG = G(29, B());
        IBinder strongBinder = parcelG.readStrongBinder();
        if (strongBinder == null) {
            c6753nG1 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IMediaContent");
            c6753nG1 = iInterfaceQueryLocalInterface instanceof InterfaceC7311pG1 ? (InterfaceC7311pG1) iInterfaceQueryLocalInterface : new C6753nG1(strongBinder);
        }
        parcelG.recycle();
        return c6753nG1;
    }

    @Override // com.daaw.InterfaceC9553xH1
    public final InterfaceC8147sG1 zzk() {
        InterfaceC8147sG1 c7590qG1;
        Parcel parcelG = G(5, B());
        IBinder strongBinder = parcelG.readStrongBinder();
        if (strongBinder == null) {
            c7590qG1 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
            c7590qG1 = iInterfaceQueryLocalInterface instanceof InterfaceC8147sG1 ? (InterfaceC8147sG1) iInterfaceQueryLocalInterface : new C7590qG1(strongBinder);
        }
        parcelG.recycle();
        return c7590qG1;
    }

    @Override // com.daaw.InterfaceC9553xH1
    public final InterfaceC7934rX zzl() {
        Parcel parcelG = G(19, B());
        InterfaceC7934rX interfaceC7934rXG = InterfaceC7934rX.a.G(parcelG.readStrongBinder());
        parcelG.recycle();
        return interfaceC7934rXG;
    }

    @Override // com.daaw.InterfaceC9553xH1
    public final InterfaceC7934rX zzm() {
        Parcel parcelG = G(18, B());
        InterfaceC7934rX interfaceC7934rXG = InterfaceC7934rX.a.G(parcelG.readStrongBinder());
        parcelG.recycle();
        return interfaceC7934rXG;
    }

    @Override // com.daaw.InterfaceC9553xH1
    public final String zzn() {
        Parcel parcelG = G(7, B());
        String string = parcelG.readString();
        parcelG.recycle();
        return string;
    }

    @Override // com.daaw.InterfaceC9553xH1
    public final String zzo() {
        Parcel parcelG = G(4, B());
        String string = parcelG.readString();
        parcelG.recycle();
        return string;
    }

    @Override // com.daaw.InterfaceC9553xH1
    public final String zzp() {
        Parcel parcelG = G(6, B());
        String string = parcelG.readString();
        parcelG.recycle();
        return string;
    }

    @Override // com.daaw.InterfaceC9553xH1
    public final String zzq() {
        Parcel parcelG = G(2, B());
        String string = parcelG.readString();
        parcelG.recycle();
        return string;
    }

    @Override // com.daaw.InterfaceC9553xH1
    public final String zzr() {
        Parcel parcelG = G(12, B());
        String string = parcelG.readString();
        parcelG.recycle();
        return string;
    }

    @Override // com.daaw.InterfaceC9553xH1
    public final String zzs() {
        Parcel parcelG = G(10, B());
        String string = parcelG.readString();
        parcelG.recycle();
        return string;
    }

    @Override // com.daaw.InterfaceC9553xH1
    public final String zzt() {
        Parcel parcelG = G(9, B());
        String string = parcelG.readString();
        parcelG.recycle();
        return string;
    }

    @Override // com.daaw.InterfaceC9553xH1
    public final List zzu() {
        Parcel parcelG = G(3, B());
        ArrayList arrayListB = AbstractC6953nz1.b(parcelG);
        parcelG.recycle();
        return arrayListB;
    }

    @Override // com.daaw.InterfaceC9553xH1
    public final List zzv() {
        Parcel parcelG = G(23, B());
        ArrayList arrayListB = AbstractC6953nz1.b(parcelG);
        parcelG.recycle();
        return arrayListB;
    }

    @Override // com.daaw.InterfaceC9553xH1
    public final void zzx() {
        I(13, B());
    }
}
