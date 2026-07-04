package com.daaw;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: com.daaw.Gk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0968Gk extends CancellationException {
    public C0968Gk() {
        super("Child of the scoped flow was cancelled");
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
