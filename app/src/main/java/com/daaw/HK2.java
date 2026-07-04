package com.daaw;

import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class HK2 {
    public final BlockingQueue a;
    public final ThreadPoolExecutor b;
    public final ArrayDeque c = new ArrayDeque();
    public GK2 d = null;

    public HK2() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.a = linkedBlockingQueue;
        this.b = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    public final void a(GK2 gk2) {
        this.d = null;
        c();
    }

    public final void b(GK2 gk2) {
        gk2.b(this);
        this.c.add(gk2);
        if (this.d == null) {
            c();
        }
    }

    public final void c() {
        GK2 gk2 = (GK2) this.c.poll();
        this.d = gk2;
        if (gk2 != null) {
            gk2.executeOnExecutor(this.b, new Object[0]);
        }
    }
}
