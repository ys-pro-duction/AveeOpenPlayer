package com.daaw;

import java.util.Collection;
import java.util.ServiceLoader;

/* JADX INFO: renamed from: com.daaw.lt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC6368lt {
    public static final Collection a = UP0.A(SP0.c(ServiceLoader.load(InterfaceC6089kt.class, InterfaceC6089kt.class.getClassLoader()).iterator()));

    public static final Collection a() {
        return a;
    }

    public static final void b(Throwable th) {
        Thread threadCurrentThread = Thread.currentThread();
        threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
    }
}
