package com.daaw;

import android.os.IBinder;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class AN2 extends AbstractRunnableC8734uN2 {
    public final /* synthetic */ IBinder C;
    public final /* synthetic */ DN2 D;

    public AN2(DN2 dn2, IBinder iBinder) {
        this.D = dn2;
        this.C = iBinder;
    }

    @Override // com.daaw.AbstractRunnableC8734uN2
    public final void a() {
        this.D.a.m = AbstractBinderC7340pN2.Z2(this.C);
        EN2.q(this.D.a);
        this.D.a.g = false;
        Iterator it = this.D.a.d.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        this.D.a.d.clear();
    }
}
