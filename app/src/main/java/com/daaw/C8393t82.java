package com.daaw;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.daaw.t82, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8393t82 implements InterfaceC5489im3 {
    public final Executor a;
    public final InterfaceC1519Ls b;
    public final C9995yr3 c;

    public C8393t82(Executor executor, InterfaceC1519Ls interfaceC1519Ls, C9995yr3 c9995yr3) {
        this.a = executor;
        this.b = interfaceC1519Ls;
        this.c = c9995yr3;
    }

    @Override // com.daaw.InterfaceC5489im3
    public final void a(AbstractC6963o11 abstractC6963o11) {
        this.a.execute(new RunnableC8753uS1(this, abstractC6963o11));
    }
}
