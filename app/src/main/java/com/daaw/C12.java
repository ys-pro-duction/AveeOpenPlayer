package com.daaw;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class C12 implements InterfaceC7552q72 {
    public final C4502fG2 B;

    public C12(C4502fG2 c4502fG2) {
        this.B = c4502fG2;
    }

    @Override // com.daaw.InterfaceC7552q72
    public final void a(Context context) {
        try {
            this.B.z();
            if (context != null) {
                this.B.x(context);
            }
        } catch (KF2 e) {
            AbstractC4274eT1.zzk("Cannot invoke onResume for the mediation adapter.", e);
        }
    }

    @Override // com.daaw.InterfaceC7552q72
    public final void e(Context context) {
        try {
            this.B.l();
        } catch (KF2 e) {
            AbstractC4274eT1.zzk("Cannot invoke onDestroy for the mediation adapter.", e);
        }
    }

    @Override // com.daaw.InterfaceC7552q72
    public final void o(Context context) {
        try {
            this.B.y();
        } catch (KF2 e) {
            AbstractC4274eT1.zzk("Cannot invoke onPause for the mediation adapter.", e);
        }
    }
}
