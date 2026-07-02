package com.daaw;

import android.os.Build;
import android.os.Bundle;
import android.os.ext.SdkExtensions;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;
import com.revenuecat.purchases.common.UtilsKt;

/* JADX INFO: renamed from: com.daaw.ex2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4415ex2 implements InterfaceC1343Jz2 {
    public final Integer a;

    public C4415ex2(Integer num) {
        this.a = num;
    }

    public static /* bridge */ /* synthetic */ C4415ex2 b() {
        if (!((Boolean) zzba.zzc().b(AbstractC9820yE1.u9)).booleanValue()) {
            return new C4415ex2(null);
        }
        zzt.zzp();
        int extensionVersion = 0;
        if (Build.VERSION.SDK_INT >= 30 && SdkExtensions.getExtensionVersion(30) > 3) {
            extensionVersion = SdkExtensions.getExtensionVersion(UtilsKt.MICROS_MULTIPLIER);
        }
        return new C4415ex2(Integer.valueOf(extensionVersion));
    }

    @Override // com.daaw.InterfaceC1343Jz2
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Integer num = this.a;
        Bundle bundle = (Bundle) obj;
        if (num != null) {
            bundle.putInt("aos", num.intValue());
        }
    }
}
