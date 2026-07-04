package com.daaw;

import java.util.concurrent.TimeoutException;

/* JADX INFO: renamed from: com.daaw.aT2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3161aT2 extends TimeoutException {
    public /* synthetic */ C3161aT2(String str, ZS2 zs2) {
        super(str);
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
