package com.daaw;

import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class QC1 extends Thread {
    public final WeakReference B;
    public final long C;
    public final CountDownLatch D = new CountDownLatch(1);
    public boolean E = false;

    public QC1(AdvertisingIdClient advertisingIdClient, long j) {
        this.B = new WeakReference(advertisingIdClient);
        this.C = j;
        start();
    }

    public final void a() {
        AdvertisingIdClient advertisingIdClient = (AdvertisingIdClient) this.B.get();
        if (advertisingIdClient != null) {
            advertisingIdClient.zza();
            this.E = true;
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            if (this.D.await(this.C, TimeUnit.MILLISECONDS)) {
                return;
            }
            a();
        } catch (InterruptedException unused) {
            a();
        }
    }
}
