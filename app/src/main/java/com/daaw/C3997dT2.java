package com.daaw;

import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.daaw.dT2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3997dT2 extends OS2 {
    public final Callable D;
    public final /* synthetic */ RunnableFutureC4275eT2 E;

    public C3997dT2(RunnableFutureC4275eT2 runnableFutureC4275eT2, Callable callable) {
        this.E = runnableFutureC4275eT2;
        callable.getClass();
        this.D = callable;
    }

    @Override // com.daaw.OS2
    public final Object a() {
        return this.D.call();
    }

    @Override // com.daaw.OS2
    public final String b() {
        return this.D.toString();
    }

    @Override // com.daaw.OS2
    public final void d(Throwable th) {
        this.E.f(th);
    }

    @Override // com.daaw.OS2
    public final void e(Object obj) {
        this.E.e(obj);
    }

    @Override // com.daaw.OS2
    public final boolean f() {
        return this.E.isDone();
    }
}
