package com.daaw;

/* JADX INFO: renamed from: com.daaw.f61, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C4457f61 {
    public final String a;
    public final String b;
    public final StackTraceElement[] c;
    public final C4457f61 d;

    public C4457f61(Throwable th, SV0 sv0) {
        this.a = th.getLocalizedMessage();
        this.b = th.getClass().getName();
        this.c = sv0.a(th.getStackTrace());
        Throwable cause = th.getCause();
        this.d = cause != null ? new C4457f61(cause, sv0) : null;
    }
}
