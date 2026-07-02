package com.daaw;

import android.telephony.TelephonyCallback;
import android.telephony.TelephonyDisplayInfo;

/* JADX INFO: renamed from: com.daaw.bB2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3368bB2 extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {
    public final QC2 a;

    public C3368bB2(QC2 qc2) {
        this.a = qc2;
    }

    @Override // android.telephony.TelephonyCallback.DisplayInfoListener
    public final void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) throws Throwable {
        int overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
        QC2.c(this.a, true == (overrideNetworkType == 3 || overrideNetworkType == 4 || overrideNetworkType == 5) ? 10 : 5);
    }
}
