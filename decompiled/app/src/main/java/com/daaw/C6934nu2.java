package com.daaw;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzdq;

/* JADX INFO: renamed from: com.daaw.nu2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6934nu2 implements InterfaceC2682Wq2 {
    public final Context a;
    public final AbstractC9212w32 b;
    public final InterfaceC3383bF1 c;
    public final PS2 d;
    public final YH2 e;

    public C6934nu2(Context context, AbstractC9212w32 abstractC9212w32, YH2 yh2, PS2 ps2, InterfaceC3383bF1 interfaceC3383bF1) {
        this.a = context;
        this.b = abstractC9212w32;
        this.e = yh2;
        this.d = ps2;
        this.c = interfaceC3383bF1;
    }

    @Override // com.daaw.InterfaceC2682Wq2
    public final InterfaceFutureC8236sc0 a(C9267wF2 c9267wF2, C4498fF2 c4498fF2) {
        C6376lu2 c6376lu2 = new C6376lu2(this, new View(this.a), null, new InterfaceC3891d42() { // from class: com.daaw.ju2
            @Override // com.daaw.InterfaceC3891d42
            public final zzdq zza() {
                return null;
            }
        }, (C4787gF2) c4498fF2.w.get(0));
        W22 w22A = this.b.a(new C10054z42(c9267wF2, c4498fF2, null), c6376lu2);
        C6655mu2 c6655mu2K = w22A.k();
        C6192lF2 c6192lF2 = c4498fF2.u;
        final WE1 we1 = new WE1(c6655mu2K, c6192lF2.b, c6192lF2.a);
        SH2 sh2 = SH2.CUSTOM_RENDER_SYN;
        return IH2.d(new InterfaceC9833yH2() { // from class: com.daaw.ku2
            @Override // com.daaw.InterfaceC9833yH2
            public final void zza() {
                this.a.c(we1);
            }
        }, this.d, sh2, this.e).b(SH2.CUSTOM_RENDER_ACK).d(AbstractC7360pS2.h(w22A.h())).a();
    }

    @Override // com.daaw.InterfaceC2682Wq2
    public final boolean b(C9267wF2 c9267wF2, C4498fF2 c4498fF2) {
        C6192lF2 c6192lF2;
        return (this.c == null || (c6192lF2 = c4498fF2.u) == null || c6192lF2.a == null) ? false : true;
    }

    public final /* synthetic */ void c(WE1 we1) {
        this.c.O0(we1);
    }
}
