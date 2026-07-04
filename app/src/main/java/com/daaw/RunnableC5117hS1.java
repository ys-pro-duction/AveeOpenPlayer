package com.daaw;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.io.IOException;

/* JADX INFO: renamed from: com.daaw.hS1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC5117hS1 implements Runnable {
    public final /* synthetic */ Context B;
    public final /* synthetic */ BT1 C;

    public RunnableC5117hS1(C5396iS1 c5396iS1, Context context, BT1 bt1) {
        this.B = context;
        this.C = bt1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.C.b(AdvertisingIdClient.getAdvertisingIdInfo(this.B));
        } catch (BT | CT | IOException | IllegalStateException e) {
            this.C.c(e);
            AbstractC4274eT1.zzh("Exception while getting advertising Id info", e);
        }
    }
}
