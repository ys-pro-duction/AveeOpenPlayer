package com.daaw;

import android.app.Dialog;
import android.app.PendingIntent;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiActivity;

/* JADX INFO: renamed from: com.daaw.fm1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC4651fm1 implements Runnable {
    public final C2869Yl1 B;
    public final /* synthetic */ AbstractDialogInterfaceOnCancelListenerC5487im1 C;

    public RunnableC4651fm1(AbstractDialogInterfaceOnCancelListenerC5487im1 abstractDialogInterfaceOnCancelListenerC5487im1, C2869Yl1 c2869Yl1) {
        this.C = abstractDialogInterfaceOnCancelListenerC5487im1;
        this.B = c2869Yl1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.C.C) {
            ConnectionResult connectionResultB = this.B.b();
            if (connectionResultB.s()) {
                AbstractDialogInterfaceOnCancelListenerC5487im1 abstractDialogInterfaceOnCancelListenerC5487im1 = this.C;
                abstractDialogInterfaceOnCancelListenerC5487im1.B.startActivityForResult(GoogleApiActivity.a(abstractDialogInterfaceOnCancelListenerC5487im1.b(), (PendingIntent) AbstractC7506py0.l(connectionResultB.p()), this.B.a(), false), 1);
                return;
            }
            AbstractDialogInterfaceOnCancelListenerC5487im1 abstractDialogInterfaceOnCancelListenerC5487im12 = this.C;
            if (abstractDialogInterfaceOnCancelListenerC5487im12.F.b(abstractDialogInterfaceOnCancelListenerC5487im12.b(), connectionResultB.e(), null) != null) {
                AbstractDialogInterfaceOnCancelListenerC5487im1 abstractDialogInterfaceOnCancelListenerC5487im13 = this.C;
                abstractDialogInterfaceOnCancelListenerC5487im13.F.w(abstractDialogInterfaceOnCancelListenerC5487im13.b(), abstractDialogInterfaceOnCancelListenerC5487im13.B, connectionResultB.e(), 2, this.C);
                return;
            }
            if (connectionResultB.e() != 18) {
                this.C.l(connectionResultB, this.B.a());
                return;
            }
            AbstractDialogInterfaceOnCancelListenerC5487im1 abstractDialogInterfaceOnCancelListenerC5487im14 = this.C;
            Dialog dialogR = abstractDialogInterfaceOnCancelListenerC5487im14.F.r(abstractDialogInterfaceOnCancelListenerC5487im14.b(), abstractDialogInterfaceOnCancelListenerC5487im14);
            AbstractDialogInterfaceOnCancelListenerC5487im1 abstractDialogInterfaceOnCancelListenerC5487im15 = this.C;
            abstractDialogInterfaceOnCancelListenerC5487im15.F.s(abstractDialogInterfaceOnCancelListenerC5487im15.b().getApplicationContext(), new C3805cm1(this, dialogR));
        }
    }
}
