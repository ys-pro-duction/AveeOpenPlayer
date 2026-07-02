package com.daaw;

import android.os.Bundle;

/* JADX INFO: renamed from: com.daaw.yk1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class BinderC9958yk1 extends AbstractBinderC4074dk1 {
    public final C5199hk1 B = new C5199hk1("OnRequestIntegrityTokenCallback");
    public final C7521q11 C;
    public final /* synthetic */ C0337Ak1 D;

    public BinderC9958yk1(C0337Ak1 c0337Ak1, C7521q11 c7521q11) {
        this.D = c0337Ak1;
        this.C = c7521q11;
    }

    @Override // com.daaw.InterfaceC4641fk1
    public final void f1(Bundle bundle) {
        this.D.c.r(this.C);
        this.B.d("onRequestIntegrityToken", new Object[0]);
        int i = bundle.getInt("error");
        if (i != 0) {
            this.C.d(new V00(i, null));
            return;
        }
        String string = bundle.getString("token");
        if (string == null) {
            this.C.d(new V00(-100, null));
            return;
        }
        C7521q11 c7521q11 = this.C;
        C2445Uj1 c2445Uj1 = new C2445Uj1();
        c2445Uj1.a(string);
        c7521q11.e(c2445Uj1.b());
    }
}
