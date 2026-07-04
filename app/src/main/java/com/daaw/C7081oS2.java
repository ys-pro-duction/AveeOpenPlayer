package com.daaw;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.daaw.oS2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7081oS2 {
    public final boolean a;
    public final OP2 b;

    public /* synthetic */ C7081oS2(boolean z, OP2 op2, AbstractC6802nS2 abstractC6802nS2) {
        this.a = z;
        this.b = op2;
    }

    public final InterfaceFutureC8236sc0 a(Callable callable, Executor executor) {
        return new C3714cS2(this.b, this.a, executor, callable);
    }
}
