package com.daaw;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.daaw.InterfaceC7934rX;
import com.google.android.gms.ads.internal.client.zzdp;
import com.google.android.gms.ads.internal.client.zzdq;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.jM1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5652jM1 extends AbstractC6395lz1 implements InterfaceC6219lM1 {
    public C5652jM1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
    }

    @Override // com.daaw.InterfaceC6219lM1
    public final void Z1(InterfaceC7934rX interfaceC7934rX, InterfaceC7934rX interfaceC7934rX2, InterfaceC7934rX interfaceC7934rX3) {
        Parcel parcelB = B();
        AbstractC6953nz1.f(parcelB, interfaceC7934rX);
        AbstractC6953nz1.f(parcelB, interfaceC7934rX2);
        AbstractC6953nz1.f(parcelB, interfaceC7934rX3);
        I(21, parcelB);
    }

    @Override // com.daaw.InterfaceC6219lM1
    public final void j0(InterfaceC7934rX interfaceC7934rX) {
        Parcel parcelB = B();
        AbstractC6953nz1.f(parcelB, interfaceC7934rX);
        I(22, parcelB);
    }

    @Override // com.daaw.InterfaceC6219lM1
    public final void k2(InterfaceC7934rX interfaceC7934rX) {
        Parcel parcelB = B();
        AbstractC6953nz1.f(parcelB, interfaceC7934rX);
        I(20, parcelB);
    }

    @Override // com.daaw.InterfaceC6219lM1
    public final boolean zzA() {
        Parcel parcelG = G(18, B());
        boolean zG = AbstractC6953nz1.g(parcelG);
        parcelG.recycle();
        return zG;
    }

    @Override // com.daaw.InterfaceC6219lM1
    public final boolean zzB() {
        Parcel parcelG = G(17, B());
        boolean zG = AbstractC6953nz1.g(parcelG);
        parcelG.recycle();
        return zG;
    }

    @Override // com.daaw.InterfaceC6219lM1
    public final double zze() {
        Parcel parcelG = G(8, B());
        double d = parcelG.readDouble();
        parcelG.recycle();
        return d;
    }

    @Override // com.daaw.InterfaceC6219lM1
    public final float zzf() {
        Parcel parcelG = G(23, B());
        float f = parcelG.readFloat();
        parcelG.recycle();
        return f;
    }

    @Override // com.daaw.InterfaceC6219lM1
    public final float zzg() {
        Parcel parcelG = G(25, B());
        float f = parcelG.readFloat();
        parcelG.recycle();
        return f;
    }

    @Override // com.daaw.InterfaceC6219lM1
    public final float zzh() {
        Parcel parcelG = G(24, B());
        float f = parcelG.readFloat();
        parcelG.recycle();
        return f;
    }

    @Override // com.daaw.InterfaceC6219lM1
    public final Bundle zzi() {
        Parcel parcelG = G(16, B());
        Bundle bundle = (Bundle) AbstractC6953nz1.a(parcelG, Bundle.CREATOR);
        parcelG.recycle();
        return bundle;
    }

    @Override // com.daaw.InterfaceC6219lM1
    public final zzdq zzj() {
        Parcel parcelG = G(11, B());
        zzdq zzdqVarZzb = zzdp.zzb(parcelG.readStrongBinder());
        parcelG.recycle();
        return zzdqVarZzb;
    }

    @Override // com.daaw.InterfaceC6219lM1
    public final InterfaceC5907kG1 zzk() {
        Parcel parcelG = G(12, B());
        InterfaceC5907kG1 interfaceC5907kG1Z2 = AbstractBinderC5625jG1.Z2(parcelG.readStrongBinder());
        parcelG.recycle();
        return interfaceC5907kG1Z2;
    }

    @Override // com.daaw.InterfaceC6219lM1
    public final InterfaceC8147sG1 zzl() {
        Parcel parcelG = G(5, B());
        InterfaceC8147sG1 interfaceC8147sG1Z2 = AbstractBinderC7868rG1.Z2(parcelG.readStrongBinder());
        parcelG.recycle();
        return interfaceC8147sG1Z2;
    }

    @Override // com.daaw.InterfaceC6219lM1
    public final InterfaceC7934rX zzm() {
        Parcel parcelG = G(13, B());
        InterfaceC7934rX interfaceC7934rXG = InterfaceC7934rX.a.G(parcelG.readStrongBinder());
        parcelG.recycle();
        return interfaceC7934rXG;
    }

    @Override // com.daaw.InterfaceC6219lM1
    public final InterfaceC7934rX zzn() {
        Parcel parcelG = G(14, B());
        InterfaceC7934rX interfaceC7934rXG = InterfaceC7934rX.a.G(parcelG.readStrongBinder());
        parcelG.recycle();
        return interfaceC7934rXG;
    }

    @Override // com.daaw.InterfaceC6219lM1
    public final InterfaceC7934rX zzo() {
        Parcel parcelG = G(15, B());
        InterfaceC7934rX interfaceC7934rXG = InterfaceC7934rX.a.G(parcelG.readStrongBinder());
        parcelG.recycle();
        return interfaceC7934rXG;
    }

    @Override // com.daaw.InterfaceC6219lM1
    public final String zzp() {
        Parcel parcelG = G(7, B());
        String string = parcelG.readString();
        parcelG.recycle();
        return string;
    }

    @Override // com.daaw.InterfaceC6219lM1
    public final String zzq() {
        Parcel parcelG = G(4, B());
        String string = parcelG.readString();
        parcelG.recycle();
        return string;
    }

    @Override // com.daaw.InterfaceC6219lM1
    public final String zzr() {
        Parcel parcelG = G(6, B());
        String string = parcelG.readString();
        parcelG.recycle();
        return string;
    }

    @Override // com.daaw.InterfaceC6219lM1
    public final String zzs() {
        Parcel parcelG = G(2, B());
        String string = parcelG.readString();
        parcelG.recycle();
        return string;
    }

    @Override // com.daaw.InterfaceC6219lM1
    public final String zzt() {
        Parcel parcelG = G(10, B());
        String string = parcelG.readString();
        parcelG.recycle();
        return string;
    }

    @Override // com.daaw.InterfaceC6219lM1
    public final String zzu() {
        Parcel parcelG = G(9, B());
        String string = parcelG.readString();
        parcelG.recycle();
        return string;
    }

    @Override // com.daaw.InterfaceC6219lM1
    public final List zzv() {
        Parcel parcelG = G(3, B());
        ArrayList arrayListB = AbstractC6953nz1.b(parcelG);
        parcelG.recycle();
        return arrayListB;
    }

    @Override // com.daaw.InterfaceC6219lM1
    public final void zzx() {
        I(19, B());
    }
}
