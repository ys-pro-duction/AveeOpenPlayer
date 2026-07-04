package com.daaw;

import java.util.Deque;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingDeque;

/* JADX INFO: renamed from: com.daaw.gG2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4791gG2 {
    public final Deque a = new LinkedBlockingDeque();
    public final Callable b;
    public final PS2 c;

    public C4791gG2(Callable callable, PS2 ps2) {
        this.b = callable;
        this.c = ps2;
    }

    public final synchronized InterfaceFutureC8236sc0 a() {
        c(1);
        return (InterfaceFutureC8236sc0) this.a.poll();
    }

    public final synchronized void b(InterfaceFutureC8236sc0 interfaceFutureC8236sc0) {
        this.a.addFirst(interfaceFutureC8236sc0);
    }

    public final synchronized void c(int i) {
        int size = i - this.a.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.a.add(this.c.S0(this.b));
        }
    }
}
