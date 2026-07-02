package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.daaw.AbstractC6395lz1;
import com.daaw.AbstractC6953nz1;
import com.daaw.InterfaceC3112aH1;
import com.daaw.InterfaceC3948dH1;
import com.daaw.InterfaceC5073hH1;
import com.daaw.InterfaceC6769nK1;
import com.daaw.InterfaceC7036oH1;
import com.daaw.UG1;
import com.daaw.XG1;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.internal.ads.zzbfc;
import com.google.android.gms.internal.ads.zzbls;

/* JADX INFO: loaded from: classes.dex */
public final class zzbo extends AbstractC6395lz1 implements zzbq {
    public zzbo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final zzbn zze() {
        zzbn zzblVar;
        Parcel parcelG = G(1, B());
        IBinder strongBinder = parcelG.readStrongBinder();
        if (strongBinder == null) {
            zzblVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoader");
            zzblVar = iInterfaceQueryLocalInterface instanceof zzbn ? (zzbn) iInterfaceQueryLocalInterface : new zzbl(strongBinder);
        }
        parcelG.recycle();
        return zzblVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzf(UG1 ug1) {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzg(XG1 xg1) {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzh(String str, InterfaceC3948dH1 interfaceC3948dH1, InterfaceC3112aH1 interfaceC3112aH1) {
        Parcel parcelB = B();
        parcelB.writeString(str);
        AbstractC6953nz1.f(parcelB, interfaceC3948dH1);
        AbstractC6953nz1.f(parcelB, interfaceC3112aH1);
        I(5, parcelB);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzi(InterfaceC6769nK1 interfaceC6769nK1) {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzj(InterfaceC5073hH1 interfaceC5073hH1, zzq zzqVar) {
        Parcel parcelB = B();
        AbstractC6953nz1.f(parcelB, interfaceC5073hH1);
        AbstractC6953nz1.d(parcelB, zzqVar);
        I(8, parcelB);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzk(InterfaceC7036oH1 interfaceC7036oH1) {
        Parcel parcelB = B();
        AbstractC6953nz1.f(parcelB, interfaceC7036oH1);
        I(10, parcelB);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzl(zzbh zzbhVar) {
        Parcel parcelB = B();
        AbstractC6953nz1.f(parcelB, zzbhVar);
        I(2, parcelB);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzm(AdManagerAdViewOptions adManagerAdViewOptions) {
        Parcel parcelB = B();
        AbstractC6953nz1.d(parcelB, adManagerAdViewOptions);
        I(15, parcelB);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzn(zzbls zzblsVar) {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzo(zzbfc zzbfcVar) {
        Parcel parcelB = B();
        AbstractC6953nz1.d(parcelB, zzbfcVar);
        I(6, parcelB);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzp(PublisherAdViewOptions publisherAdViewOptions) {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzq(zzcf zzcfVar) {
        throw null;
    }
}
