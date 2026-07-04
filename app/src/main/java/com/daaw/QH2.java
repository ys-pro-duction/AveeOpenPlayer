package com.daaw;

import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes3.dex */
public abstract class QH2 {
    public static final InterfaceFutureC8236sc0 d = AbstractC7360pS2.h(null);
    public final PS2 a;
    public final ScheduledExecutorService b;
    public final RH2 c;

    public QH2(PS2 ps2, ScheduledExecutorService scheduledExecutorService, RH2 rh2) {
        this.a = ps2;
        this.b = scheduledExecutorService;
        this.c = rh2;
    }

    public final CH2 a(Object obj, InterfaceFutureC8236sc0... interfaceFutureC8236sc0Arr) {
        return new CH2(this, obj, Arrays.asList(interfaceFutureC8236sc0Arr), null);
    }

    public final PH2 b(Object obj, InterfaceFutureC8236sc0 interfaceFutureC8236sc0) {
        return new PH2(this, obj, interfaceFutureC8236sc0, Collections.singletonList(interfaceFutureC8236sc0), interfaceFutureC8236sc0);
    }

    public abstract String f(Object obj);
}
