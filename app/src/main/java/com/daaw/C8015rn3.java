package com.daaw;

import android.os.Handler;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: com.daaw.rn3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8015rn3 {
    public final int a;
    public final Vp3 b;
    public final CopyOnWriteArrayList c;

    public C8015rn3(CopyOnWriteArrayList copyOnWriteArrayList, int i, Vp3 vp3) {
        this.c = copyOnWriteArrayList;
        this.a = 0;
        this.b = vp3;
    }

    public final C8015rn3 a(int i, Vp3 vp3) {
        return new C8015rn3(this.c, 0, vp3);
    }

    public final void b(Handler handler, InterfaceC8573tn3 interfaceC8573tn3) {
        this.c.add(new C7458pn3(handler, interfaceC8573tn3));
    }

    public final void c(InterfaceC8573tn3 interfaceC8573tn3) {
        for (C7458pn3 c7458pn3 : this.c) {
            if (c7458pn3.b == interfaceC8573tn3) {
                this.c.remove(c7458pn3);
            }
        }
    }

    public C8015rn3() {
        this(new CopyOnWriteArrayList(), 0, null);
    }
}
