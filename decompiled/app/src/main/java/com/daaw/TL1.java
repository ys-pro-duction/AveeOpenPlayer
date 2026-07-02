package com.daaw;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.daaw.InterfaceC7934rX;
import com.google.android.gms.ads.internal.client.zzdp;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.internal.ads.zzbfc;
import com.google.android.gms.internal.ads.zzbrj;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class TL1 extends AbstractC6395lz1 implements ZL1 {
    public TL1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    @Override // com.daaw.ZL1
    public final void D1(InterfaceC7934rX interfaceC7934rX, zzl zzlVar, String str, String str2, InterfaceC3689cM1 interfaceC3689cM1) {
        Parcel parcelB = B();
        AbstractC6953nz1.f(parcelB, interfaceC7934rX);
        AbstractC6953nz1.d(parcelB, zzlVar);
        parcelB.writeString(str);
        parcelB.writeString(str2);
        AbstractC6953nz1.f(parcelB, interfaceC3689cM1);
        I(7, parcelB);
    }

    @Override // com.daaw.ZL1
    public final void G0(InterfaceC7934rX interfaceC7934rX) {
        Parcel parcelB = B();
        AbstractC6953nz1.f(parcelB, interfaceC7934rX);
        I(39, parcelB);
    }

    @Override // com.daaw.ZL1
    public final void J1(InterfaceC7934rX interfaceC7934rX) {
        Parcel parcelB = B();
        AbstractC6953nz1.f(parcelB, interfaceC7934rX);
        I(30, parcelB);
    }

    @Override // com.daaw.ZL1
    public final void K(InterfaceC7934rX interfaceC7934rX, zzl zzlVar, String str, InterfaceC6235lQ1 interfaceC6235lQ1, String str2) {
        Parcel parcelB = B();
        AbstractC6953nz1.f(parcelB, interfaceC7934rX);
        AbstractC6953nz1.d(parcelB, zzlVar);
        parcelB.writeString(null);
        AbstractC6953nz1.f(parcelB, interfaceC6235lQ1);
        parcelB.writeString(str2);
        I(10, parcelB);
    }

    @Override // com.daaw.ZL1
    public final void K1(boolean z) {
        Parcel parcelB = B();
        ClassLoader classLoader = AbstractC6953nz1.a;
        parcelB.writeInt(z ? 1 : 0);
        I(25, parcelB);
    }

    @Override // com.daaw.ZL1
    public final void M0(InterfaceC7934rX interfaceC7934rX, zzl zzlVar, String str, InterfaceC3689cM1 interfaceC3689cM1) {
        Parcel parcelB = B();
        AbstractC6953nz1.f(parcelB, interfaceC7934rX);
        AbstractC6953nz1.d(parcelB, zzlVar);
        parcelB.writeString(str);
        AbstractC6953nz1.f(parcelB, interfaceC3689cM1);
        I(38, parcelB);
    }

    @Override // com.daaw.ZL1
    public final void O1(InterfaceC7934rX interfaceC7934rX, zzq zzqVar, zzl zzlVar, String str, String str2, InterfaceC3689cM1 interfaceC3689cM1) {
        Parcel parcelB = B();
        AbstractC6953nz1.f(parcelB, interfaceC7934rX);
        AbstractC6953nz1.d(parcelB, zzqVar);
        AbstractC6953nz1.d(parcelB, zzlVar);
        parcelB.writeString(str);
        parcelB.writeString(str2);
        AbstractC6953nz1.f(parcelB, interfaceC3689cM1);
        I(35, parcelB);
    }

    @Override // com.daaw.ZL1
    public final void V1(InterfaceC7934rX interfaceC7934rX, InterfaceC6235lQ1 interfaceC6235lQ1, List list) {
        Parcel parcelB = B();
        AbstractC6953nz1.f(parcelB, interfaceC7934rX);
        AbstractC6953nz1.f(parcelB, interfaceC6235lQ1);
        parcelB.writeStringList(list);
        I(23, parcelB);
    }

    @Override // com.daaw.ZL1
    public final void W0(InterfaceC7934rX interfaceC7934rX, zzl zzlVar, String str, InterfaceC3689cM1 interfaceC3689cM1) {
        Parcel parcelB = B();
        AbstractC6953nz1.f(parcelB, interfaceC7934rX);
        AbstractC6953nz1.d(parcelB, zzlVar);
        parcelB.writeString(str);
        AbstractC6953nz1.f(parcelB, interfaceC3689cM1);
        I(28, parcelB);
    }

    @Override // com.daaw.ZL1
    public final void c() {
        I(12, B());
    }

    @Override // com.daaw.ZL1
    public final void d2(InterfaceC7934rX interfaceC7934rX, zzl zzlVar, String str, String str2, InterfaceC3689cM1 interfaceC3689cM1, zzbfc zzbfcVar, List list) {
        Parcel parcelB = B();
        AbstractC6953nz1.f(parcelB, interfaceC7934rX);
        AbstractC6953nz1.d(parcelB, zzlVar);
        parcelB.writeString(str);
        parcelB.writeString(str2);
        AbstractC6953nz1.f(parcelB, interfaceC3689cM1);
        AbstractC6953nz1.d(parcelB, zzbfcVar);
        parcelB.writeStringList(list);
        I(14, parcelB);
    }

    @Override // com.daaw.ZL1
    public final void f() {
        I(4, B());
    }

    @Override // com.daaw.ZL1
    public final void g2(InterfaceC7934rX interfaceC7934rX) {
        Parcel parcelB = B();
        AbstractC6953nz1.f(parcelB, interfaceC7934rX);
        I(21, parcelB);
    }

    @Override // com.daaw.ZL1
    public final void h() {
        I(9, B());
    }

    @Override // com.daaw.ZL1
    public final void j2(zzl zzlVar, String str) {
        Parcel parcelB = B();
        AbstractC6953nz1.d(parcelB, zzlVar);
        parcelB.writeString(str);
        I(11, parcelB);
    }

    @Override // com.daaw.ZL1
    public final boolean k() {
        Parcel parcelG = G(22, B());
        boolean zG = AbstractC6953nz1.g(parcelG);
        parcelG.recycle();
        return zG;
    }

    @Override // com.daaw.ZL1
    public final void t2(InterfaceC7934rX interfaceC7934rX, zzq zzqVar, zzl zzlVar, String str, String str2, InterfaceC3689cM1 interfaceC3689cM1) {
        Parcel parcelB = B();
        AbstractC6953nz1.f(parcelB, interfaceC7934rX);
        AbstractC6953nz1.d(parcelB, zzqVar);
        AbstractC6953nz1.d(parcelB, zzlVar);
        parcelB.writeString(str);
        parcelB.writeString(str2);
        AbstractC6953nz1.f(parcelB, interfaceC3689cM1);
        I(6, parcelB);
    }

    @Override // com.daaw.ZL1
    public final void v1(InterfaceC7934rX interfaceC7934rX) {
        Parcel parcelB = B();
        AbstractC6953nz1.f(parcelB, interfaceC7934rX);
        I(37, parcelB);
    }

    @Override // com.daaw.ZL1
    public final void w2(InterfaceC7934rX interfaceC7934rX, VJ1 vj1, List list) {
        Parcel parcelB = B();
        AbstractC6953nz1.f(parcelB, interfaceC7934rX);
        AbstractC6953nz1.f(parcelB, vj1);
        parcelB.writeTypedList(list);
        I(31, parcelB);
    }

    @Override // com.daaw.ZL1
    public final void x1(InterfaceC7934rX interfaceC7934rX, zzl zzlVar, String str, InterfaceC3689cM1 interfaceC3689cM1) {
        Parcel parcelB = B();
        AbstractC6953nz1.f(parcelB, interfaceC7934rX);
        AbstractC6953nz1.d(parcelB, zzlVar);
        parcelB.writeString(str);
        AbstractC6953nz1.f(parcelB, interfaceC3689cM1);
        I(32, parcelB);
    }

    @Override // com.daaw.ZL1
    public final void zzE() {
        I(8, B());
    }

    @Override // com.daaw.ZL1
    public final boolean zzN() {
        Parcel parcelG = G(13, B());
        boolean zG = AbstractC6953nz1.g(parcelG);
        parcelG.recycle();
        return zG;
    }

    @Override // com.daaw.ZL1
    public final C5093hM1 zzO() {
        C5093hM1 c5093hM1;
        Parcel parcelG = G(15, B());
        IBinder strongBinder = parcelG.readStrongBinder();
        if (strongBinder == null) {
            c5093hM1 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
            c5093hM1 = iInterfaceQueryLocalInterface instanceof C5093hM1 ? (C5093hM1) iInterfaceQueryLocalInterface : new C5093hM1(strongBinder);
        }
        parcelG.recycle();
        return c5093hM1;
    }

    @Override // com.daaw.ZL1
    public final C5372iM1 zzP() {
        C5372iM1 c5372iM1;
        Parcel parcelG = G(16, B());
        IBinder strongBinder = parcelG.readStrongBinder();
        if (strongBinder == null) {
            c5372iM1 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
            c5372iM1 = iInterfaceQueryLocalInterface instanceof C5372iM1 ? (C5372iM1) iInterfaceQueryLocalInterface : new C5372iM1(strongBinder);
        }
        parcelG.recycle();
        return c5372iM1;
    }

    @Override // com.daaw.ZL1
    public final zzdq zzh() {
        Parcel parcelG = G(26, B());
        zzdq zzdqVarZzb = zzdp.zzb(parcelG.readStrongBinder());
        parcelG.recycle();
        return zzdqVarZzb;
    }

    @Override // com.daaw.ZL1
    public final InterfaceC4525fM1 zzj() {
        InterfaceC4525fM1 c3968dM1;
        Parcel parcelG = G(36, B());
        IBinder strongBinder = parcelG.readStrongBinder();
        if (strongBinder == null) {
            c3968dM1 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
            c3968dM1 = iInterfaceQueryLocalInterface instanceof InterfaceC4525fM1 ? (InterfaceC4525fM1) iInterfaceQueryLocalInterface : new C3968dM1(strongBinder);
        }
        parcelG.recycle();
        return c3968dM1;
    }

    @Override // com.daaw.ZL1
    public final InterfaceC6219lM1 zzk() {
        InterfaceC6219lM1 c5652jM1;
        Parcel parcelG = G(27, B());
        IBinder strongBinder = parcelG.readStrongBinder();
        if (strongBinder == null) {
            c5652jM1 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
            c5652jM1 = iInterfaceQueryLocalInterface instanceof InterfaceC6219lM1 ? (InterfaceC6219lM1) iInterfaceQueryLocalInterface : new C5652jM1(strongBinder);
        }
        parcelG.recycle();
        return c5652jM1;
    }

    @Override // com.daaw.ZL1
    public final zzbrj zzl() {
        Parcel parcelG = G(33, B());
        zzbrj zzbrjVar = (zzbrj) AbstractC6953nz1.a(parcelG, zzbrj.CREATOR);
        parcelG.recycle();
        return zzbrjVar;
    }

    @Override // com.daaw.ZL1
    public final zzbrj zzm() {
        Parcel parcelG = G(34, B());
        zzbrj zzbrjVar = (zzbrj) AbstractC6953nz1.a(parcelG, zzbrj.CREATOR);
        parcelG.recycle();
        return zzbrjVar;
    }

    @Override // com.daaw.ZL1
    public final InterfaceC7934rX zzn() {
        Parcel parcelG = G(2, B());
        InterfaceC7934rX interfaceC7934rXG = InterfaceC7934rX.a.G(parcelG.readStrongBinder());
        parcelG.recycle();
        return interfaceC7934rXG;
    }

    @Override // com.daaw.ZL1
    public final void zzo() {
        I(5, B());
    }
}
