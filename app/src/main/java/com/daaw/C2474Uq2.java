package com.daaw;

import android.content.Context;
import com.daaw.C9595xS;
import com.google.android.gms.ads.MobileAds;

/* JADX INFO: renamed from: com.daaw.Uq2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2474Uq2 {
    public final Context a;

    public C2474Uq2(Context context) {
        this.a = context;
    }

    public final InterfaceFutureC8236sc0 a(boolean z) {
        C9595xS c9595xSA = new C9595xS.a().b(MobileAds.ERROR_DOMAIN).c(z).a();
        D41 d41A = D41.a(this.a);
        return d41A != null ? d41A.b(c9595xSA) : AbstractC7360pS2.g(new IllegalStateException());
    }
}
