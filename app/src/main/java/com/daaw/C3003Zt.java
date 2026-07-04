package com.daaw;

import java.lang.Thread;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.daaw.Zt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C3003Zt implements Thread.UncaughtExceptionHandler {
    public final a a;
    public final OQ0 b;
    public final Thread.UncaughtExceptionHandler c;
    public final InterfaceC0692Dt d;
    public final AtomicBoolean e = new AtomicBoolean(false);

    /* JADX INFO: renamed from: com.daaw.Zt$a */
    public interface a {
        void a(OQ0 oq0, Thread thread, Throwable th);
    }

    public C3003Zt(a aVar, OQ0 oq0, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, InterfaceC0692Dt interfaceC0692Dt) {
        this.a = aVar;
        this.b = oq0;
        this.c = uncaughtExceptionHandler;
        this.d = interfaceC0692Dt;
    }

    public boolean a() {
        return this.e.get();
    }

    public final boolean b(Thread thread, Throwable th) {
        if (thread == null) {
            C2106Rd0.f().d("Crashlytics will not record uncaught exception; null thread");
            return false;
        }
        if (th == null) {
            C2106Rd0.f().d("Crashlytics will not record uncaught exception; null throwable");
            return false;
        }
        if (!this.d.b()) {
            return true;
        }
        C2106Rd0.f().b("Crashlytics will not record uncaught exception; native crash exists for session.");
        return false;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        this.e.set(true);
        try {
            try {
                if (b(thread, th)) {
                    this.a.a(this.b, thread, th);
                } else {
                    C2106Rd0.f().b("Uncaught exception will not be recorded by Crashlytics.");
                }
                C2106Rd0.f().b("Completed exception processing. Invoking default exception handler.");
                this.c.uncaughtException(thread, th);
                this.e.set(false);
            } catch (Exception e) {
                C2106Rd0.f().e("An error occurred in the uncaught exception handler", e);
                C2106Rd0.f().b("Completed exception processing. Invoking default exception handler.");
                this.c.uncaughtException(thread, th);
                this.e.set(false);
            }
        } catch (Throwable th2) {
            C2106Rd0.f().b("Completed exception processing. Invoking default exception handler.");
            this.c.uncaughtException(thread, th);
            this.e.set(false);
            throw th2;
        }
    }
}
