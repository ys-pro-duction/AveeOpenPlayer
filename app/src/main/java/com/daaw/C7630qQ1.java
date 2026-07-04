package com.daaw;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zzdd;
import com.google.android.gms.ads.internal.client.zzdg;
import com.google.android.gms.ads.internal.client.zzdm;
import com.google.android.gms.ads.internal.client.zzdn;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.internal.ads.zzbxd;

/* JADX INFO: renamed from: com.daaw.qQ1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7630qQ1 extends AbstractC6395lz1 implements InterfaceC8187sQ1 {
    public C7630qQ1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    @Override // com.daaw.InterfaceC8187sQ1
    public final Bundle zzb() {
        Parcel parcelG = G(9, B());
        Bundle bundle = (Bundle) AbstractC6953nz1.a(parcelG, Bundle.CREATOR);
        parcelG.recycle();
        return bundle;
    }

    @Override // com.daaw.InterfaceC8187sQ1
    public final zzdn zzc() {
        Parcel parcelG = G(12, B());
        zzdn zzdnVarZzb = zzdm.zzb(parcelG.readStrongBinder());
        parcelG.recycle();
        return zzdnVarZzb;
    }

    @Override // com.daaw.InterfaceC8187sQ1
    public final InterfaceC7351pQ1 zzd() {
        InterfaceC7351pQ1 c6793nQ1;
        Parcel parcelG = G(11, B());
        IBinder strongBinder = parcelG.readStrongBinder();
        if (strongBinder == null) {
            c6793nQ1 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
            c6793nQ1 = iInterfaceQueryLocalInterface instanceof InterfaceC7351pQ1 ? (InterfaceC7351pQ1) iInterfaceQueryLocalInterface : new C6793nQ1(strongBinder);
        }
        parcelG.recycle();
        return c6793nQ1;
    }

    @Override // com.daaw.InterfaceC8187sQ1
    public final void zzf(zzl zzlVar, InterfaceC10147zQ1 interfaceC10147zQ1) {
        Parcel parcelB = B();
        AbstractC6953nz1.d(parcelB, zzlVar);
        AbstractC6953nz1.f(parcelB, interfaceC10147zQ1);
        I(1, parcelB);
    }

    @Override // com.daaw.InterfaceC8187sQ1
    public final void zzg(zzl zzlVar, InterfaceC10147zQ1 interfaceC10147zQ1) {
        Parcel parcelB = B();
        AbstractC6953nz1.d(parcelB, zzlVar);
        AbstractC6953nz1.f(parcelB, interfaceC10147zQ1);
        I(14, parcelB);
    }

    @Override // com.daaw.InterfaceC8187sQ1
    public final void zzh(boolean z) {
        Parcel parcelB = B();
        ClassLoader classLoader = AbstractC6953nz1.a;
        parcelB.writeInt(z ? 1 : 0);
        I(15, parcelB);
    }

    @Override // com.daaw.InterfaceC8187sQ1
    public final void zzi(zzdd zzddVar) {
        Parcel parcelB = B();
        AbstractC6953nz1.f(parcelB, zzddVar);
        I(8, parcelB);
    }

    @Override // com.daaw.InterfaceC8187sQ1
    public final void zzj(zzdg zzdgVar) {
        Parcel parcelB = B();
        AbstractC6953nz1.f(parcelB, zzdgVar);
        I(13, parcelB);
    }

    @Override // com.daaw.InterfaceC8187sQ1
    public final void zzk(InterfaceC9031vQ1 interfaceC9031vQ1) {
        Parcel parcelB = B();
        AbstractC6953nz1.f(parcelB, interfaceC9031vQ1);
        I(2, parcelB);
    }

    @Override // com.daaw.InterfaceC8187sQ1
    public final void zzl(zzbxd zzbxdVar) {
        Parcel parcelB = B();
        AbstractC6953nz1.d(parcelB, zzbxdVar);
        I(7, parcelB);
    }

    @Override // com.daaw.InterfaceC8187sQ1
    public final void zzm(InterfaceC7934rX interfaceC7934rX) {
        Parcel parcelB = B();
        AbstractC6953nz1.f(parcelB, interfaceC7934rX);
        I(5, parcelB);
    }
}
