package com.daaw;

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: renamed from: com.daaw.Em1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0770Em1 extends AS1 {
    public final int d;
    public final Bundle e;
    public final /* synthetic */ AbstractC8245se f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC0770Em1(AbstractC8245se abstractC8245se, int i, Bundle bundle) {
        super(abstractC8245se, Boolean.TRUE);
        this.f = abstractC8245se;
        this.d = i;
        this.e = bundle;
    }

    @Override // com.daaw.AS1
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        if (this.d != 0) {
            this.f.I(1, null);
            Bundle bundle = this.e;
            f(new ConnectionResult(this.d, bundle != null ? (PendingIntent) bundle.getParcelable(AbstractC8245se.KEY_PENDING_INTENT) : null));
        } else {
            if (g()) {
                return;
            }
            this.f.I(1, null);
            f(new ConnectionResult(8, null));
        }
    }

    public abstract void f(ConnectionResult connectionResult);

    public abstract boolean g();

    @Override // com.daaw.AS1
    public final void b() {
    }
}
