package com.daaw;

import com.google.android.gms.ads.internal.client.zzba;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.daaw.yf2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9934yf2 implements InterfaceC7273p72 {
    public final C7969re2 B;
    public final C9371we2 C;
    public final Executor D;
    public final Executor E;

    public C9934yf2(C7969re2 c7969re2, C9371we2 c9371we2, Executor executor, Executor executor2) {
        this.B = c7969re2;
        this.C = c9371we2;
        this.D = executor;
        this.E = executor2;
    }

    public final void b(final InterfaceC9334wW1 interfaceC9334wW1) {
        this.D.execute(new Runnable() { // from class: com.daaw.wf2
            @Override // java.lang.Runnable
            public final void run() {
                interfaceC9334wW1.U("onSdkImpression", new C2407Ua());
            }
        });
    }

    @Override // com.daaw.InterfaceC7273p72
    public final void zzq() {
        if (this.C.d()) {
            C7969re2 c7969re2 = this.B;
            AbstractC9841yJ2 abstractC9841yJ2H0 = c7969re2.h0();
            if (abstractC9841yJ2H0 == null && c7969re2.j0() != null && ((Boolean) zzba.zzc().b(AbstractC9820yE1.Y4)).booleanValue()) {
                C7969re2 c7969re22 = this.B;
                InterfaceFutureC8236sc0 interfaceFutureC8236sc0J0 = c7969re22.j0();
                BT1 bt1C0 = c7969re22.c0();
                if (interfaceFutureC8236sc0J0 == null || bt1C0 == null) {
                    return;
                }
                AbstractC7360pS2.r(AbstractC7360pS2.l(interfaceFutureC8236sc0J0, bt1C0), new C9655xf2(this), this.E);
                return;
            }
            if (abstractC9841yJ2H0 == null) {
                return;
            }
            C7969re2 c7969re23 = this.B;
            InterfaceC9334wW1 interfaceC9334wW1E0 = c7969re23.e0();
            InterfaceC9334wW1 interfaceC9334wW1F0 = c7969re23.f0();
            if (interfaceC9334wW1E0 == null) {
                interfaceC9334wW1E0 = interfaceC9334wW1F0 != null ? interfaceC9334wW1F0 : null;
            }
            if (interfaceC9334wW1E0 != null) {
                b(interfaceC9334wW1E0);
            }
        }
    }
}
