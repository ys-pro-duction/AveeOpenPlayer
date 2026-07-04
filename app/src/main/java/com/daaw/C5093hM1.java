package com.daaw;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.daaw.InterfaceC7934rX;
import com.google.android.gms.ads.internal.client.zzdp;
import com.google.android.gms.ads.internal.client.zzdq;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.hM1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5093hM1 extends AbstractC6395lz1 implements IInterface {
    public C5093hM1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
    }

    public final zzdq a3() {
        Parcel parcelG = G(17, B());
        zzdq zzdqVarZzb = zzdp.zzb(parcelG.readStrongBinder());
        parcelG.recycle();
        return zzdqVarZzb;
    }

    public final InterfaceC5907kG1 b3() {
        Parcel parcelG = G(19, B());
        InterfaceC5907kG1 interfaceC5907kG1Z2 = AbstractBinderC5625jG1.Z2(parcelG.readStrongBinder());
        parcelG.recycle();
        return interfaceC5907kG1Z2;
    }

    public final InterfaceC8147sG1 c3() {
        Parcel parcelG = G(5, B());
        InterfaceC8147sG1 interfaceC8147sG1Z2 = AbstractBinderC7868rG1.Z2(parcelG.readStrongBinder());
        parcelG.recycle();
        return interfaceC8147sG1Z2;
    }

    public final InterfaceC7934rX d3() {
        Parcel parcelG = G(18, B());
        InterfaceC7934rX interfaceC7934rXG = InterfaceC7934rX.a.G(parcelG.readStrongBinder());
        parcelG.recycle();
        return interfaceC7934rXG;
    }

    public final InterfaceC7934rX e3() {
        Parcel parcelG = G(20, B());
        InterfaceC7934rX interfaceC7934rXG = InterfaceC7934rX.a.G(parcelG.readStrongBinder());
        parcelG.recycle();
        return interfaceC7934rXG;
    }

    public final List f3() {
        Parcel parcelG = G(3, B());
        ArrayList arrayListB = AbstractC6953nz1.b(parcelG);
        parcelG.recycle();
        return arrayListB;
    }

    public final void g3(InterfaceC7934rX interfaceC7934rX) {
        Parcel parcelB = B();
        AbstractC6953nz1.f(parcelB, interfaceC7934rX);
        I(11, parcelB);
    }

    public final void h3(InterfaceC7934rX interfaceC7934rX) {
        Parcel parcelB = B();
        AbstractC6953nz1.f(parcelB, interfaceC7934rX);
        I(12, parcelB);
    }

    public final void i3(InterfaceC7934rX interfaceC7934rX, InterfaceC7934rX interfaceC7934rX2, InterfaceC7934rX interfaceC7934rX3) {
        Parcel parcelB = B();
        AbstractC6953nz1.f(parcelB, interfaceC7934rX);
        AbstractC6953nz1.f(parcelB, interfaceC7934rX2);
        AbstractC6953nz1.f(parcelB, interfaceC7934rX3);
        I(22, parcelB);
    }

    public final boolean j3() {
        Parcel parcelG = G(14, B());
        boolean zG = AbstractC6953nz1.g(parcelG);
        parcelG.recycle();
        return zG;
    }

    public final void k2(InterfaceC7934rX interfaceC7934rX) {
        Parcel parcelB = B();
        AbstractC6953nz1.f(parcelB, interfaceC7934rX);
        I(16, parcelB);
    }

    public final boolean k3() {
        Parcel parcelG = G(13, B());
        boolean zG = AbstractC6953nz1.g(parcelG);
        parcelG.recycle();
        return zG;
    }

    public final double zze() {
        Parcel parcelG = G(7, B());
        double d = parcelG.readDouble();
        parcelG.recycle();
        return d;
    }

    public final Bundle zzf() {
        Parcel parcelG = G(15, B());
        Bundle bundle = (Bundle) AbstractC6953nz1.a(parcelG, Bundle.CREATOR);
        parcelG.recycle();
        return bundle;
    }

    public final InterfaceC7934rX zzl() {
        Parcel parcelG = G(21, B());
        InterfaceC7934rX interfaceC7934rXG = InterfaceC7934rX.a.G(parcelG.readStrongBinder());
        parcelG.recycle();
        return interfaceC7934rXG;
    }

    public final String zzm() {
        Parcel parcelG = G(4, B());
        String string = parcelG.readString();
        parcelG.recycle();
        return string;
    }

    public final String zzn() {
        Parcel parcelG = G(6, B());
        String string = parcelG.readString();
        parcelG.recycle();
        return string;
    }

    public final String zzo() {
        Parcel parcelG = G(2, B());
        String string = parcelG.readString();
        parcelG.recycle();
        return string;
    }

    public final String zzp() {
        Parcel parcelG = G(9, B());
        String string = parcelG.readString();
        parcelG.recycle();
        return string;
    }

    public final String zzq() {
        Parcel parcelG = G(8, B());
        String string = parcelG.readString();
        parcelG.recycle();
        return string;
    }

    public final void zzt() {
        I(10, B());
    }
}
