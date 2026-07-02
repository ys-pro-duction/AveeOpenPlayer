package com.daaw;

import android.content.Context;
import android.net.wifi.WifiManager;

/* JADX INFO: renamed from: com.daaw.wg3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9382wg3 {
    public final WifiManager a;

    public C9382wg3(Context context) {
        this.a = (WifiManager) context.getApplicationContext().getSystemService("wifi");
    }
}
