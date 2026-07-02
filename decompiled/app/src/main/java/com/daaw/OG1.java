package com.daaw;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.daaw.InterfaceC7934rX;
import com.google.android.gms.ads.internal.client.zzdp;
import com.google.android.gms.ads.internal.client.zzdq;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class OG1 extends AbstractC6395lz1 implements QG1 {
    public OG1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
    }

    @Override // com.daaw.QG1
    public final void a0(InterfaceC7934rX interfaceC7934rX) {
        Parcel parcelB = B();
        AbstractC6953nz1.f(parcelB, interfaceC7934rX);
        I(14, parcelB);
    }

    @Override // com.daaw.QG1
    public final boolean s(InterfaceC7934rX interfaceC7934rX) {
        Parcel parcelB = B();
        AbstractC6953nz1.f(parcelB, interfaceC7934rX);
        Parcel parcelG = G(17, parcelB);
        boolean zG = AbstractC6953nz1.g(parcelG);
        parcelG.recycle();
        return zG;
    }

    @Override // com.daaw.QG1
    public final InterfaceC8147sG1 t(String str) {
        InterfaceC8147sG1 c7590qG1;
        Parcel parcelB = B();
        parcelB.writeString(str);
        Parcel parcelG = G(2, parcelB);
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

    @Override // com.daaw.QG1
    public final String u2(String str) {
        Parcel parcelB = B();
        parcelB.writeString(str);
        Parcel parcelG = G(1, parcelB);
        String string = parcelG.readString();
        parcelG.recycle();
        return string;
    }

    @Override // com.daaw.QG1
    public final boolean z(InterfaceC7934rX interfaceC7934rX) {
        Parcel parcelB = B();
        AbstractC6953nz1.f(parcelB, interfaceC7934rX);
        Parcel parcelG = G(10, parcelB);
        boolean zG = AbstractC6953nz1.g(parcelG);
        parcelG.recycle();
        return zG;
    }

    @Override // com.daaw.QG1
    public final zzdq zze() {
        Parcel parcelG = G(7, B());
        zzdq zzdqVarZzb = zzdp.zzb(parcelG.readStrongBinder());
        parcelG.recycle();
        return zzdqVarZzb;
    }

    @Override // com.daaw.QG1
    public final InterfaceC7311pG1 zzf() {
        InterfaceC7311pG1 c6753nG1;
        Parcel parcelG = G(16, B());
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

    @Override // com.daaw.QG1
    public final InterfaceC7934rX zzh() {
        Parcel parcelG = G(9, B());
        InterfaceC7934rX interfaceC7934rXG = InterfaceC7934rX.a.G(parcelG.readStrongBinder());
        parcelG.recycle();
        return interfaceC7934rXG;
    }

    @Override // com.daaw.QG1
    public final String zzi() {
        Parcel parcelG = G(4, B());
        String string = parcelG.readString();
        parcelG.recycle();
        return string;
    }

    @Override // com.daaw.QG1
    public final List zzk() {
        Parcel parcelG = G(3, B());
        ArrayList<String> arrayListCreateStringArrayList = parcelG.createStringArrayList();
        parcelG.recycle();
        return arrayListCreateStringArrayList;
    }

    @Override // com.daaw.QG1
    public final void zzl() {
        I(8, B());
    }

    @Override // com.daaw.QG1
    public final void zzm() {
        I(15, B());
    }

    @Override // com.daaw.QG1
    public final void zzn(String str) {
        Parcel parcelB = B();
        parcelB.writeString(str);
        I(5, parcelB);
    }

    @Override // com.daaw.QG1
    public final void zzo() {
        I(6, B());
    }

    @Override // com.daaw.QG1
    public final boolean zzq() {
        Parcel parcelG = G(12, B());
        boolean zG = AbstractC6953nz1.g(parcelG);
        parcelG.recycle();
        return zG;
    }

    @Override // com.daaw.QG1
    public final boolean zzt() {
        Parcel parcelG = G(13, B());
        boolean zG = AbstractC6953nz1.g(parcelG);
        parcelG.recycle();
        return zG;
    }
}
