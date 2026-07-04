package com.daaw;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;

/* JADX INFO: renamed from: com.daaw.tx1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8618tx1 extends ConnectivityManager.NetworkCallback {
    public final /* synthetic */ C8904ux1 a;

    public C8618tx1(C8904ux1 c8904ux1) {
        this.a = c8904ux1;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        synchronized (C8904ux1.class) {
            this.a.a = networkCapabilities;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        synchronized (C8904ux1.class) {
            this.a.a = null;
        }
    }
}
