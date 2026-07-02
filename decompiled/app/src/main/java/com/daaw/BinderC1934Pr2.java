package com.daaw;

import android.view.View;
import com.google.android.gms.ads.internal.client.zze;

/* JADX INFO: renamed from: com.daaw.Pr2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class BinderC1934Pr2 extends MM1 {
    public final C2994Zq2 B;
    public final /* synthetic */ C2060Qr2 C;

    public /* synthetic */ BinderC1934Pr2(C2060Qr2 c2060Qr2, C2994Zq2 c2994Zq2, AbstractC1830Or2 abstractC1830Or2) {
        this.C = c2060Qr2;
        this.B = c2994Zq2;
    }

    @Override // com.daaw.NM1
    public final void H(InterfaceC7934rX interfaceC7934rX) {
        this.C.c = (View) BinderC7744qp0.I(interfaceC7934rX);
        ((BinderC3558bs2) this.B.c).zzo();
    }

    @Override // com.daaw.NM1
    public final void O2(InterfaceC4525fM1 interfaceC4525fM1) {
        this.C.d = interfaceC4525fM1;
        ((BinderC3558bs2) this.B.c).zzo();
    }

    @Override // com.daaw.NM1
    public final void a(String str) {
        ((BinderC3558bs2) this.B.c).d0(0, str);
    }

    @Override // com.daaw.NM1
    public final void zzf(zze zzeVar) {
        ((BinderC3558bs2) this.B.c).l0(zzeVar);
    }
}
