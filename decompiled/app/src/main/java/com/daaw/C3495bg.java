package com.daaw;

import android.os.Bundle;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.daaw.bg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C3495bg implements InterfaceC3888d4, InterfaceC3609c4 {
    public final C1108Ht a;
    public final int b;
    public final TimeUnit c;
    public CountDownLatch e;
    public final Object d = new Object();
    public boolean f = false;

    public C3495bg(C1108Ht c1108Ht, int i, TimeUnit timeUnit) {
        this.a = c1108Ht;
        this.b = i;
        this.c = timeUnit;
    }

    @Override // com.daaw.InterfaceC3609c4
    public void a(String str, Bundle bundle) {
        synchronized (this.d) {
            try {
                C2106Rd0.f().i("Logging event " + str + " to Firebase Analytics with params " + bundle);
                this.e = new CountDownLatch(1);
                this.f = false;
                this.a.a(str, bundle);
                C2106Rd0.f().i("Awaiting app exception callback from Analytics...");
                try {
                    if (this.e.await(this.b, this.c)) {
                        this.f = true;
                        C2106Rd0.f().i("App exception callback received from Analytics listener.");
                    } else {
                        C2106Rd0.f().k("Timeout exceeded while awaiting app exception callback from Analytics listener.");
                    }
                } catch (InterruptedException unused) {
                    C2106Rd0.f().d("Interrupted while awaiting app exception callback from Analytics listener.");
                }
                this.e = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.daaw.InterfaceC3888d4
    public void b(String str, Bundle bundle) {
        CountDownLatch countDownLatch = this.e;
        if (countDownLatch != null && "_ae".equals(str)) {
            countDownLatch.countDown();
        }
    }
}
