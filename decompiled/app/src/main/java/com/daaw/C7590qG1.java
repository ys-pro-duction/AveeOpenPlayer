package com.daaw;

import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import com.daaw.InterfaceC7934rX;

/* JADX INFO: renamed from: com.daaw.qG1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7590qG1 extends AbstractC6395lz1 implements InterfaceC8147sG1 {
    public C7590qG1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    @Override // com.daaw.InterfaceC8147sG1
    public final double zzb() {
        Parcel parcelG = G(3, B());
        double d = parcelG.readDouble();
        parcelG.recycle();
        return d;
    }

    @Override // com.daaw.InterfaceC8147sG1
    public final int zzc() {
        Parcel parcelG = G(5, B());
        int i = parcelG.readInt();
        parcelG.recycle();
        return i;
    }

    @Override // com.daaw.InterfaceC8147sG1
    public final int zzd() {
        Parcel parcelG = G(4, B());
        int i = parcelG.readInt();
        parcelG.recycle();
        return i;
    }

    @Override // com.daaw.InterfaceC8147sG1
    public final Uri zze() {
        Parcel parcelG = G(2, B());
        Uri uri = (Uri) AbstractC6953nz1.a(parcelG, Uri.CREATOR);
        parcelG.recycle();
        return uri;
    }

    @Override // com.daaw.InterfaceC8147sG1
    public final InterfaceC7934rX zzf() {
        Parcel parcelG = G(1, B());
        InterfaceC7934rX interfaceC7934rXG = InterfaceC7934rX.a.G(parcelG.readStrongBinder());
        parcelG.recycle();
        return interfaceC7934rXG;
    }
}
