package com.daaw;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import com.google.android.gms.ads.internal.zzt;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.daaw.Zz2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3030Zz2 implements InterfaceC1447Kz2 {
    public final PS2 a;
    public final Context b;

    public C3030Zz2(PS2 ps2, Context context) {
        this.a = ps2;
        this.b = context;
    }

    public final /* synthetic */ C2822Xz2 a() {
        int i;
        boolean zIsActiveNetworkMetered;
        int i2;
        TelephonyManager telephonyManager = (TelephonyManager) this.b.getSystemService("phone");
        String networkOperator = telephonyManager.getNetworkOperator();
        int phoneType = telephonyManager.getPhoneType();
        zzt.zzp();
        int i3 = -1;
        if (com.google.android.gms.ads.internal.util.zzt.zzz(this.b, "android.permission.ACCESS_NETWORK_STATE")) {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.b.getSystemService("connectivity");
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                int type = activeNetworkInfo.getType();
                int iOrdinal = activeNetworkInfo.getDetailedState().ordinal();
                i = type;
                i3 = iOrdinal;
            } else {
                i = -1;
            }
            zIsActiveNetworkMetered = connectivityManager.isActiveNetworkMetered();
            i2 = i3;
        } else {
            i = -2;
            zIsActiveNetworkMetered = false;
            i2 = -1;
        }
        return new C2822Xz2(networkOperator, i, zzt.zzq().zzn(this.b), phoneType, zIsActiveNetworkMetered, i2);
    }

    @Override // com.daaw.InterfaceC1447Kz2
    public final int zza() {
        return 39;
    }

    @Override // com.daaw.InterfaceC1447Kz2
    public final InterfaceFutureC8236sc0 zzb() {
        return this.a.S0(new Callable() { // from class: com.daaw.Yz2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.a();
            }
        });
    }
}
