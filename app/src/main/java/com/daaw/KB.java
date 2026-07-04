package com.daaw;

/* JADX INFO: loaded from: classes4.dex */
public final class KB extends RuntimeException {
    public final transient InterfaceC4684ft B;

    public KB(InterfaceC4684ft interfaceC4684ft) {
        this.B = interfaceC4684ft;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public String getLocalizedMessage() {
        return this.B.toString();
    }
}
