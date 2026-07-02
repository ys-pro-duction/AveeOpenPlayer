package com.daaw;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.daaw.fI2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4510fI2 {
    public final Executor a;
    public final C5680jT1 b;

    public C4510fI2(Executor executor, C5680jT1 c5680jT1) {
        this.a = executor;
        this.b = c5680jT1;
    }

    public final /* synthetic */ void a(String str) {
        this.b.zza(str);
    }

    public final void b(final String str) {
        this.a.execute(new Runnable() { // from class: com.daaw.eI2
            @Override // java.lang.Runnable
            public final void run() {
                this.B.a(str);
            }
        });
    }
}
