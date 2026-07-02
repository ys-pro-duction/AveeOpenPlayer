package com.daaw;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.NativeAd;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.lG1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6195lG1 extends NativeAd.AdChoicesInfo {
    public final InterfaceC5907kG1 a;
    public final List b = new ArrayList();
    public String c;

    public C6195lG1(InterfaceC5907kG1 interfaceC5907kG1) {
        IBinder iBinder;
        this.a = interfaceC5907kG1;
        try {
            this.c = interfaceC5907kG1.zzg();
        } catch (RemoteException e) {
            AbstractC4274eT1.zzh("", e);
            this.c = "";
        }
        try {
            for (Object obj : interfaceC5907kG1.zzh()) {
                InterfaceC8147sG1 c7590qG1 = null;
                if ((obj instanceof IBinder) && (iBinder = (IBinder) obj) != null) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                    c7590qG1 = iInterfaceQueryLocalInterface instanceof InterfaceC8147sG1 ? (InterfaceC8147sG1) iInterfaceQueryLocalInterface : new C7590qG1(iBinder);
                }
                if (c7590qG1 != null) {
                    this.b.add(new C8426tG1(c7590qG1));
                }
            }
        } catch (RemoteException e2) {
            AbstractC4274eT1.zzh("", e2);
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.AdChoicesInfo
    public final List getImages() {
        return this.b;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.AdChoicesInfo
    public final CharSequence getText() {
        return this.c;
    }
}
