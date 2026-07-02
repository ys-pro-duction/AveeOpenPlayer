package com.daaw;

import android.os.IBinder;
import java.util.Iterator;

/* JADX INFO: renamed from: com.daaw.vk1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9121vk1 extends AbstractRunnableC5758jk1 {
    public final /* synthetic */ IBinder C;
    public final /* synthetic */ ServiceConnectionC0545Ck1 D;

    public C9121vk1(ServiceConnectionC0545Ck1 serviceConnectionC0545Ck1, IBinder iBinder) {
        this.D = serviceConnectionC0545Ck1;
        this.C = iBinder;
    }

    @Override // com.daaw.AbstractRunnableC5758jk1
    public final void b() {
        this.D.a.m = AbstractBinderC2965Zj1.G(this.C);
        C0762Ek1.n(this.D.a);
        this.D.a.g = false;
        Iterator it = this.D.a.d.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        this.D.a.d.clear();
    }
}
