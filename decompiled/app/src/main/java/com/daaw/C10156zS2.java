package com.daaw;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: renamed from: com.daaw.zS2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C10156zS2 extends AbstractC0770Em1 {
    public final /* synthetic */ AbstractC8245se g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10156zS2(AbstractC8245se abstractC8245se, int i, Bundle bundle) {
        super(abstractC8245se, i, null);
        this.g = abstractC8245se;
    }

    @Override // com.daaw.AbstractC0770Em1
    public final void f(ConnectionResult connectionResult) {
        if (this.g.f() && AbstractC8245se.H(this.g)) {
            AbstractC8245se.D(this.g, 16);
        } else {
            this.g.p.a(connectionResult);
            this.g.p(connectionResult);
        }
    }

    @Override // com.daaw.AbstractC0770Em1
    public final boolean g() {
        this.g.p.a(ConnectionResult.F);
        return true;
    }
}
