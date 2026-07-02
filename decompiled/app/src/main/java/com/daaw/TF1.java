package com.daaw;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public abstract class TF1 {
    public static final AtomicReference a = new AtomicReference();
    public static final AtomicReference b = new AtomicReference();
    public static final AtomicBoolean c = new AtomicBoolean();

    public static RF1 a() {
        return (RF1) a.get();
    }

    public static SF1 b() {
        AbstractC6314li0.a(b.get());
        return null;
    }

    public static void c(RF1 rf1) {
        a.set(rf1);
    }
}
