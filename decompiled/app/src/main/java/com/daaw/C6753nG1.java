package com.daaw;

import android.os.IBinder;
import android.os.Parcel;
import com.daaw.InterfaceC7934rX;
import com.google.android.gms.ads.internal.client.zzdp;
import com.google.android.gms.ads.internal.client.zzdq;

/* JADX INFO: renamed from: com.daaw.nG1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6753nG1 extends AbstractC6395lz1 implements InterfaceC7311pG1 {
    public C6753nG1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IMediaContent");
    }

    @Override // com.daaw.InterfaceC7311pG1
    public final float zze() {
        Parcel parcelG = G(2, B());
        float f = parcelG.readFloat();
        parcelG.recycle();
        return f;
    }

    @Override // com.daaw.InterfaceC7311pG1
    public final float zzf() {
        Parcel parcelG = G(6, B());
        float f = parcelG.readFloat();
        parcelG.recycle();
        return f;
    }

    @Override // com.daaw.InterfaceC7311pG1
    public final float zzg() {
        Parcel parcelG = G(5, B());
        float f = parcelG.readFloat();
        parcelG.recycle();
        return f;
    }

    @Override // com.daaw.InterfaceC7311pG1
    public final zzdq zzh() {
        Parcel parcelG = G(7, B());
        zzdq zzdqVarZzb = zzdp.zzb(parcelG.readStrongBinder());
        parcelG.recycle();
        return zzdqVarZzb;
    }

    @Override // com.daaw.InterfaceC7311pG1
    public final InterfaceC7934rX zzi() {
        Parcel parcelG = G(4, B());
        InterfaceC7934rX interfaceC7934rXG = InterfaceC7934rX.a.G(parcelG.readStrongBinder());
        parcelG.recycle();
        return interfaceC7934rXG;
    }

    @Override // com.daaw.InterfaceC7311pG1
    public final void zzj(InterfaceC7934rX interfaceC7934rX) {
        Parcel parcelB = B();
        AbstractC6953nz1.f(parcelB, interfaceC7934rX);
        I(3, parcelB);
    }

    @Override // com.daaw.InterfaceC7311pG1
    public final boolean zzk() {
        Parcel parcelG = G(10, B());
        boolean zG = AbstractC6953nz1.g(parcelG);
        parcelG.recycle();
        return zG;
    }

    @Override // com.daaw.InterfaceC7311pG1
    public final boolean zzl() {
        Parcel parcelG = G(8, B());
        boolean zG = AbstractC6953nz1.g(parcelG);
        parcelG.recycle();
        return zG;
    }
}
