package com.daaw;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzba;
import com.revenuecat.purchases.amazon.purchasing.ProxyAmazonBillingActivity;

/* JADX INFO: renamed from: com.daaw.Yy2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2922Yy2 implements InterfaceC1343Jz2 {
    public final String a;
    public final String b;

    public C2922Yy2(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // com.daaw.InterfaceC1343Jz2
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.S6)).booleanValue()) {
            bundle.putString(ProxyAmazonBillingActivity.EXTRAS_REQUEST_ID, this.b);
        } else {
            bundle.putString(ProxyAmazonBillingActivity.EXTRAS_REQUEST_ID, this.a);
        }
    }
}
