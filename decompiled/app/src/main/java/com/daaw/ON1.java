package com.daaw;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.nativead.NativeAd;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ON1 extends NativeAd.AdChoicesInfo {
    public final List a = new ArrayList();
    public String b;

    public ON1(InterfaceC5907kG1 interfaceC5907kG1) {
        try {
            this.b = interfaceC5907kG1.zzg();
        } catch (RemoteException e) {
            AbstractC4274eT1.zzh("", e);
            this.b = "";
        }
        try {
            for (Object obj : interfaceC5907kG1.zzh()) {
                InterfaceC8147sG1 interfaceC8147sG1Z2 = obj instanceof IBinder ? AbstractBinderC7868rG1.Z2((IBinder) obj) : null;
                if (interfaceC8147sG1Z2 != null) {
                    this.a.add(new QN1(interfaceC8147sG1Z2));
                }
            }
        } catch (RemoteException e2) {
            AbstractC4274eT1.zzh("", e2);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.AdChoicesInfo
    public final List getImages() {
        return this.a;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.AdChoicesInfo
    public final CharSequence getText() {
        return this.b;
    }
}
