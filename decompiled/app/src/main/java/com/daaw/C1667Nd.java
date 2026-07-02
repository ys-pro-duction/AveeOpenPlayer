package com.daaw;

import android.view.View;
import android.view.autofill.AutofillManager;

/* JADX INFO: renamed from: com.daaw.Nd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1667Nd extends AutofillManager.AutofillCallback {
    public static final C1667Nd a = new C1667Nd();

    public final void a(C8370t4 c8370t4) {
        G10.g(c8370t4, "autofill");
        c8370t4.a().registerCallback(AbstractC1356Kd.a(this));
    }

    public final void b(C8370t4 c8370t4) {
        G10.g(c8370t4, "autofill");
        c8370t4.a().unregisterCallback(AbstractC1356Kd.a(this));
    }

    @Override // android.view.autofill.AutofillManager.AutofillCallback
    public void onAutofillEvent(View view, int i, int i2) {
        G10.g(view, "view");
        super.onAutofillEvent(view, i, i2);
    }
}
