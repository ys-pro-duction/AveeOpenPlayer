package com.daaw;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.ads.internal.util.zzb;
import java.io.IOException;

/* JADX INFO: renamed from: com.daaw.wS1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C9318wS1 extends zzb {
    public final Context c;

    public C9318wS1(Context context) {
        this.c = context;
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final void zza() {
        boolean isAdIdFakeForDebugLogging;
        try {
            isAdIdFakeForDebugLogging = AdvertisingIdClient.getIsAdIdFakeForDebugLogging(this.c);
        } catch (BT | CT | IOException | IllegalStateException e) {
            AbstractC4274eT1.zzh("Fail to get isAdIdFakeForDebugLogging", e);
            isAdIdFakeForDebugLogging = false;
        }
        C3996dT1.j(isAdIdFakeForDebugLogging);
        AbstractC4274eT1.zzj("Update ad debug logging enablement as " + isAdIdFakeForDebugLogging);
    }
}
