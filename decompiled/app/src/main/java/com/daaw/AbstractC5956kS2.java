package com.daaw;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.daaw.kS2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5956kS2 extends AbstractFutureC5397iS2 implements InterfaceFutureC8236sc0 {
    @Override // com.daaw.InterfaceFutureC8236sc0
    public final void g(Runnable runnable, Executor executor) {
        k().g(runnable, executor);
    }

    public abstract InterfaceFutureC8236sc0 k();
}
