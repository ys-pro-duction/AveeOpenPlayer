package com.daaw;

import android.content.ComponentName;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.daaw.v83, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8959v83 extends AbstractServiceConnectionC5251hv {
    public final WeakReference b;

    public C8959v83(C4218eF1 c4218eF1) {
        this.b = new WeakReference(c4218eF1);
    }

    @Override // com.daaw.AbstractServiceConnectionC5251hv
    public final void a(ComponentName componentName, AbstractC4693fv abstractC4693fv) {
        C4218eF1 c4218eF1 = (C4218eF1) this.b.get();
        if (c4218eF1 != null) {
            c4218eF1.c(abstractC4693fv);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        C4218eF1 c4218eF1 = (C4218eF1) this.b.get();
        if (c4218eF1 != null) {
            c4218eF1.d();
        }
    }
}
