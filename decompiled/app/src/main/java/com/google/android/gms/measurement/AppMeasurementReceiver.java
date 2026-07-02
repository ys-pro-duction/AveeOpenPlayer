package com.google.android.gms.measurement;

import android.content.Context;
import android.content.Intent;
import com.daaw.AbstractC5179hg1;
import com.daaw.CK2;
import com.daaw.InterfaceC10124zK2;

/* JADX INFO: loaded from: classes3.dex */
public final class AppMeasurementReceiver extends AbstractC5179hg1 implements InterfaceC10124zK2 {
    public CK2 D;

    @Override // com.daaw.InterfaceC10124zK2
    public void a(Context context, Intent intent) {
        AbstractC5179hg1.c(context, intent);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (this.D == null) {
            this.D = new CK2(this);
        }
        this.D.a(context, intent);
    }
}
