package com.daaw;

import android.app.Dialog;

/* JADX INFO: renamed from: com.daaw.cm1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3805cm1 extends AbstractC6330ll1 {
    public final /* synthetic */ Dialog a;
    public final /* synthetic */ RunnableC4651fm1 b;

    public C3805cm1(RunnableC4651fm1 runnableC4651fm1, Dialog dialog) {
        this.b = runnableC4651fm1;
        this.a = dialog;
    }

    @Override // com.daaw.AbstractC6330ll1
    public final void a() {
        this.b.C.o();
        if (this.a.isShowing()) {
            this.a.dismiss();
        }
    }
}
