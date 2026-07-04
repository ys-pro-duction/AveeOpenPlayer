package com.daaw;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.daaw.ya, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C9906ya extends AbstractC8636u11 {
    public static volatile C9906ya c;
    public static final Executor d = new Executor() { // from class: com.daaw.wa
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            C9906ya.g().c(runnable);
        }
    };
    public static final Executor e = new Executor() { // from class: com.daaw.xa
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            C9906ya.g().a(runnable);
        }
    };
    public AbstractC8636u11 a;
    public final AbstractC8636u11 b;

    public C9906ya() {
        C4705fy c4705fy = new C4705fy();
        this.b = c4705fy;
        this.a = c4705fy;
    }

    public static Executor f() {
        return e;
    }

    public static C9906ya g() {
        if (c != null) {
            return c;
        }
        synchronized (C9906ya.class) {
            try {
                if (c == null) {
                    c = new C9906ya();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c;
    }

    @Override // com.daaw.AbstractC8636u11
    public void a(Runnable runnable) {
        this.a.a(runnable);
    }

    @Override // com.daaw.AbstractC8636u11
    public boolean b() {
        return this.a.b();
    }

    @Override // com.daaw.AbstractC8636u11
    public void c(Runnable runnable) {
        this.a.c(runnable);
    }
}
