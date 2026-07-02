package com.daaw;

import android.os.Handler;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class Is3 {
    public final CopyOnWriteArrayList a = new CopyOnWriteArrayList();

    public final void a(Handler handler, Js3 js3) {
        c(js3);
        this.a.add(new Hs3(handler, js3));
    }

    public final void b(final int i, final long j, final long j2) {
        for (final Hs3 hs3 : this.a) {
            if (!hs3.c) {
                hs3.a.post(new Runnable() { // from class: com.daaw.Gs3
                    @Override // java.lang.Runnable
                    public final void run() {
                        hs3.b.P(i, j, j2);
                    }
                });
            }
        }
    }

    public final void c(Js3 js3) {
        for (Hs3 hs3 : this.a) {
            if (hs3.b == js3) {
                hs3.c();
                this.a.remove(hs3);
            }
        }
    }
}
