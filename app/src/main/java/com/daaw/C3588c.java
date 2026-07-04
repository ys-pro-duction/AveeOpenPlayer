package com.daaw;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: com.daaw.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3588c extends CancellationException {
    public final transient InterfaceC7337pN B;

    public C3588c(InterfaceC7337pN interfaceC7337pN) {
        super("Flow was aborted, no more elements needed");
        this.B = interfaceC7337pN;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
