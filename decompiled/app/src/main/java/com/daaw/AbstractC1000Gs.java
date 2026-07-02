package com.daaw;

import com.daaw.C6262lX0;
import java.util.concurrent.TimeoutException;

/* JADX INFO: renamed from: com.daaw.Gs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1000Gs {
    public static C6262lX0 a(C8594ts c8594ts) {
        AbstractC7785qy0.o(c8594ts, "context must not be null");
        if (!c8594ts.h()) {
            return null;
        }
        Throwable thC = c8594ts.c();
        if (thC == null) {
            return C6262lX0.g.q("io.grpc.Context was cancelled without error");
        }
        if (thC instanceof TimeoutException) {
            return C6262lX0.j.q(thC.getMessage()).p(thC);
        }
        C6262lX0 c6262lX0K = C6262lX0.k(thC);
        return (C6262lX0.b.UNKNOWN.equals(c6262lX0K.m()) && c6262lX0K.l() == thC) ? C6262lX0.g.q("Context cancelled").p(thC) : c6262lX0K.p(thC);
    }
}
