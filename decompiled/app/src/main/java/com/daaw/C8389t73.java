package com.daaw;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.daaw.t73, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8389t73 implements InterfaceC5489im3 {
    public final Executor a;
    public final Object b = new Object();
    public InterfaceC4381eq0 c;

    public C8389t73(Executor executor, InterfaceC4381eq0 interfaceC4381eq0) {
        this.a = executor;
        this.c = interfaceC4381eq0;
    }

    @Override // com.daaw.InterfaceC5489im3
    public final void a(AbstractC6963o11 abstractC6963o11) {
        if (abstractC6963o11.l()) {
            synchronized (this.b) {
                try {
                    if (this.c == null) {
                        return;
                    }
                    this.a.execute(new GS2(this));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
