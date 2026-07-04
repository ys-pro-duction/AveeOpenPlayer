package com.daaw;

import android.view.View;
import android.view.autofill.AutofillManager;

/* JADX INFO: renamed from: com.daaw.t4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C8370t4 implements InterfaceC8798ud {
    public final View a;
    public final C1875Pd b;
    public final AutofillManager c;

    public C8370t4(View view, C1875Pd c1875Pd) {
        G10.g(view, "view");
        G10.g(c1875Pd, "autofillTree");
        this.a = view;
        this.b = c1875Pd;
        AutofillManager autofillManagerA = AbstractC7812r4.a(view.getContext().getSystemService(AbstractC7255p4.a()));
        if (autofillManagerA == null) {
            throw new IllegalStateException("Autofill service could not be located.");
        }
        this.c = autofillManagerA;
        view.setImportantForAutofill(1);
    }

    public final AutofillManager a() {
        return this.c;
    }

    public final C1875Pd b() {
        return this.b;
    }

    public final View c() {
        return this.a;
    }
}
