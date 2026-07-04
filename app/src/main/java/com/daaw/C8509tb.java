package com.daaw;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.daaw.tb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C8509tb implements LH {
    public final Executor a;
    public final LH b;
    public volatile boolean c = false;

    public C8509tb(Executor executor, LH lh) {
        this.a = executor;
        this.b = lh;
    }

    public static /* synthetic */ void b(C8509tb c8509tb, Object obj, com.google.firebase.firestore.c cVar) {
        if (c8509tb.c) {
            return;
        }
        c8509tb.b.a(obj, cVar);
    }

    @Override // com.daaw.LH
    public void a(final Object obj, final com.google.firebase.firestore.c cVar) {
        this.a.execute(new Runnable() { // from class: com.daaw.sb
            @Override // java.lang.Runnable
            public final void run() {
                C8509tb.b(this.B, obj, cVar);
            }
        });
    }

    public void c() {
        this.c = true;
    }
}
