package com.daaw;

import android.net.ConnectivityManager;
import android.net.Network;

/* JADX INFO: renamed from: com.daaw.oS1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7080oS1 extends ConnectivityManager.NetworkCallback {
    public final /* synthetic */ OS1 a;

    public C7080oS1(OS1 os1) {
        this.a = os1;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        this.a.n.set(true);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        this.a.n.set(false);
    }
}
