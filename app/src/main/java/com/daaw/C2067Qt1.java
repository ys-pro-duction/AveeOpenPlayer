package com.daaw;

import android.os.Handler;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.daaw.Qt1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2067Qt1 {
    public final Executor a;

    public C2067Qt1(Handler handler) {
        this.a = new ExecutorC1837Ot1(this, handler);
    }

    public final void a(AbstractC4970gu1 abstractC4970gu1, C6933nu1 c6933nu1) {
        abstractC4970gu1.zzm("post-error");
        ((ExecutorC1837Ot1) this.a).B.post(new RunnableC1941Pt1(abstractC4970gu1, C6096ku1.a(c6933nu1), null));
    }

    public final void b(AbstractC4970gu1 abstractC4970gu1, C6096ku1 c6096ku1, Runnable runnable) {
        abstractC4970gu1.zzq();
        abstractC4970gu1.zzm("post-response");
        ((ExecutorC1837Ot1) this.a).B.post(new RunnableC1941Pt1(abstractC4970gu1, c6096ku1, runnable));
    }
}
