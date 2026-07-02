package com.daaw;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: com.daaw.oq0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7191oq0 {
    public final AtomicInteger a = new AtomicInteger();
    public final AtomicInteger b = new AtomicInteger();

    public void a() {
        this.b.getAndIncrement();
    }

    public void b() {
        this.a.getAndIncrement();
    }

    public void c() {
        this.b.set(0);
    }
}
