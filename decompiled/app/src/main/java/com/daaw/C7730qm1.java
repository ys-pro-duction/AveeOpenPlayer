package com.daaw;

import android.app.Application;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.io.IOException;

/* JADX INFO: renamed from: com.daaw.qm1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7730qm1 {
    public final Application a;

    public C7730qm1(Application application) {
        this.a = application;
    }

    public final String a() {
        try {
            return AdvertisingIdClient.getAdvertisingIdInfo(this.a).getId();
        } catch (BT | CT | IOException unused) {
            return null;
        }
    }
}
