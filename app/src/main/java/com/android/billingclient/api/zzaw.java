package com.android.billingclient.api;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import com.daaw.InterfaceC3182aZ;
import com.daaw.JC1;

/* JADX INFO: loaded from: classes.dex */
final class zzaw extends ResultReceiver {
    public final /* synthetic */ InterfaceC3182aZ B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzaw(b bVar, Handler handler, InterfaceC3182aZ interfaceC3182aZ) {
        super(handler);
        this.B = interfaceC3182aZ;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, Bundle bundle) {
        this.B.a(JC1.e(bundle, "BillingClient"));
    }
}
