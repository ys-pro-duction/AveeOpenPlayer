package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.RemoteException;
import com.daaw.AQ1;
import com.daaw.AbstractBinderC7908rQ1;
import com.daaw.AbstractC4274eT1;
import com.daaw.InterfaceC10147zQ1;
import com.daaw.InterfaceC7351pQ1;
import com.daaw.InterfaceC7934rX;
import com.daaw.InterfaceC9031vQ1;
import com.daaw.XS1;
import com.google.android.gms.internal.ads.zzbxd;

/* JADX INFO: loaded from: classes.dex */
public final class zzfc extends AbstractBinderC7908rQ1 {
    public static void Z2(final InterfaceC10147zQ1 interfaceC10147zQ1) {
        AbstractC4274eT1.zzg("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
        XS1.b.post(new Runnable() { // from class: com.google.android.gms.ads.internal.client.zzfb
            @Override // java.lang.Runnable
            public final void run() {
                InterfaceC10147zQ1 interfaceC10147zQ12 = interfaceC10147zQ1;
                if (interfaceC10147zQ12 != null) {
                    try {
                        interfaceC10147zQ12.zze(1);
                    } catch (RemoteException e) {
                        AbstractC4274eT1.zzl("#007 Could not call remote method.", e);
                    }
                }
            }
        });
    }

    @Override // com.daaw.InterfaceC8187sQ1
    public final Bundle zzb() {
        return new Bundle();
    }

    @Override // com.daaw.InterfaceC8187sQ1
    public final zzdn zzc() {
        return null;
    }

    @Override // com.daaw.InterfaceC8187sQ1
    public final InterfaceC7351pQ1 zzd() {
        return null;
    }

    @Override // com.daaw.InterfaceC8187sQ1
    public final String zze() {
        return "";
    }

    @Override // com.daaw.InterfaceC8187sQ1
    public final void zzf(zzl zzlVar, InterfaceC10147zQ1 interfaceC10147zQ1) {
        Z2(interfaceC10147zQ1);
    }

    @Override // com.daaw.InterfaceC8187sQ1
    public final void zzg(zzl zzlVar, InterfaceC10147zQ1 interfaceC10147zQ1) {
        Z2(interfaceC10147zQ1);
    }

    @Override // com.daaw.InterfaceC8187sQ1
    public final void zzh(boolean z) {
    }

    @Override // com.daaw.InterfaceC8187sQ1
    public final void zzi(zzdd zzddVar) {
    }

    @Override // com.daaw.InterfaceC8187sQ1
    public final void zzj(zzdg zzdgVar) {
    }

    @Override // com.daaw.InterfaceC8187sQ1
    public final void zzl(zzbxd zzbxdVar) {
    }

    @Override // com.daaw.InterfaceC8187sQ1
    public final boolean zzo() {
        return false;
    }

    @Override // com.daaw.InterfaceC8187sQ1
    public final void zzk(InterfaceC9031vQ1 interfaceC9031vQ1) {
    }

    @Override // com.daaw.InterfaceC8187sQ1
    public final void zzm(InterfaceC7934rX interfaceC7934rX) {
    }

    @Override // com.daaw.InterfaceC8187sQ1
    public final void zzp(AQ1 aq1) {
    }

    @Override // com.daaw.InterfaceC8187sQ1
    public final void zzn(InterfaceC7934rX interfaceC7934rX, boolean z) {
    }
}
