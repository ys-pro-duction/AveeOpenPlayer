package com.daaw;

import android.view.View;

/* JADX INFO: renamed from: com.daaw.ne, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6851ne extends AbstractC1464Le {
    public C6572me u;

    public AbstractC6851ne(View view, int i, boolean z) {
        super(view);
        this.u = new C6572me(i, z ? view.findViewById(AbstractC5056hD0.g) : null);
    }

    @Override // com.daaw.AbstractC1464Le
    public void Q(NW nw, int i) {
        this.u.d(nw.a());
    }
}
