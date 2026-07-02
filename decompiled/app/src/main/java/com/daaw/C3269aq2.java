package com.daaw;

import android.app.Activity;
import com.google.android.gms.ads.internal.overlay.zzl;

/* JADX INFO: renamed from: com.daaw.aq2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3269aq2 extends AbstractC0570Cq2 {
    public Activity a;
    public zzl b;
    public String c;
    public String d;

    @Override // com.daaw.AbstractC0570Cq2
    public final AbstractC0570Cq2 a(Activity activity) {
        if (activity == null) {
            throw new NullPointerException("Null activity");
        }
        this.a = activity;
        return this;
    }

    @Override // com.daaw.AbstractC0570Cq2
    public final AbstractC0570Cq2 b(zzl zzlVar) {
        this.b = zzlVar;
        return this;
    }

    @Override // com.daaw.AbstractC0570Cq2
    public final AbstractC0570Cq2 c(String str) {
        this.c = str;
        return this;
    }

    @Override // com.daaw.AbstractC0570Cq2
    public final AbstractC0570Cq2 d(String str) {
        this.d = str;
        return this;
    }

    @Override // com.daaw.AbstractC0570Cq2
    public final AbstractC0683Dq2 e() {
        Activity activity = this.a;
        if (activity != null) {
            return new C3826cq2(activity, this.b, this.c, this.d, null);
        }
        throw new IllegalStateException("Missing required properties: activity");
    }
}
