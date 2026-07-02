package com.daaw;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/* JADX INFO: loaded from: classes3.dex */
public final class PC2 extends Be3 {
    public PC2(C8812uf3 c8812uf3) {
        super(c8812uf3);
    }

    @Override // com.daaw.Be3
    public final boolean h() {
        return false;
    }

    public final boolean i() {
        e();
        ConnectivityManager connectivityManager = (ConnectivityManager) this.a.v().getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = null;
        if (connectivityManager != null) {
            try {
                activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (SecurityException unused) {
            }
        }
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }
}
