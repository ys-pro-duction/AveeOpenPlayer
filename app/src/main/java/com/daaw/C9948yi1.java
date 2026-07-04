package com.daaw;

import com.daaw.InterfaceC3591c01;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.daaw.yi1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C9948yi1 {
    public final Executor a;
    public final XH b;
    public final InterfaceC1689Ni1 c;
    public final InterfaceC3591c01 d;

    public C9948yi1(Executor executor, XH xh, InterfaceC1689Ni1 interfaceC1689Ni1, InterfaceC3591c01 interfaceC3591c01) {
        this.a = executor;
        this.b = xh;
        this.c = interfaceC1689Ni1;
        this.d = interfaceC3591c01;
    }

    public static /* synthetic */ Object a(C9948yi1 c9948yi1) {
        Iterator it = c9948yi1.b.O().iterator();
        while (it.hasNext()) {
            c9948yi1.c.a((H51) it.next(), 1);
        }
        return null;
    }

    public void c() {
        this.a.execute(new Runnable() { // from class: com.daaw.wi1
            @Override // java.lang.Runnable
            public final void run() {
                C9948yi1 c9948yi1 = this.B;
                c9948yi1.d.d(new InterfaceC3591c01.a() { // from class: com.daaw.xi1
                    @Override // com.daaw.InterfaceC3591c01.a
                    public final Object a() {
                        return C9948yi1.a(c9948yi1);
                    }
                });
            }
        });
    }
}
