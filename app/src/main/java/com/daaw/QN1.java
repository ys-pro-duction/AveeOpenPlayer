package com.daaw;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.ads.nativead.NativeAd;

/* JADX INFO: loaded from: classes3.dex */
public final class QN1 extends NativeAd.Image {
    public final InterfaceC8147sG1 a;
    public final Drawable b;
    public final Uri c;
    public final double d;

    public QN1(InterfaceC8147sG1 interfaceC8147sG1) {
        double dZzb;
        InterfaceC7934rX interfaceC7934rXZzf;
        this.a = interfaceC8147sG1;
        Uri uriZze = null;
        try {
            interfaceC7934rXZzf = interfaceC8147sG1.zzf();
        } catch (RemoteException e) {
            AbstractC4274eT1.zzh("", e);
        }
        Drawable drawable = interfaceC7934rXZzf != null ? (Drawable) BinderC7744qp0.I(interfaceC7934rXZzf) : null;
        this.b = drawable;
        try {
            uriZze = this.a.zze();
        } catch (RemoteException e2) {
            AbstractC4274eT1.zzh("", e2);
        }
        this.c = uriZze;
        try {
            dZzb = this.a.zzb();
        } catch (RemoteException e3) {
            AbstractC4274eT1.zzh("", e3);
            dZzb = 1.0d;
        }
        this.d = dZzb;
        try {
            this.a.zzd();
        } catch (RemoteException e4) {
            AbstractC4274eT1.zzh("", e4);
        }
        try {
            this.a.zzc();
        } catch (RemoteException e5) {
            AbstractC4274eT1.zzh("", e5);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.Image
    public final Drawable getDrawable() {
        return this.b;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.Image
    public final double getScale() {
        return this.d;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.Image
    public final Uri getUri() {
        return this.c;
    }
}
