package com.daaw;

import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: com.daaw.Ed0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC0733Ed0 implements Runnable {
    public static final Logger C = Logger.getLogger(RunnableC0733Ed0.class.getName());
    public final Runnable B;

    public RunnableC0733Ed0(Runnable runnable) {
        this.B = (Runnable) AbstractC7785qy0.o(runnable, "task");
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.B.run();
        } catch (Throwable th) {
            C.log(Level.SEVERE, "Exception while executing runnable " + this.B, th);
            AbstractC9490x31.f(th);
            throw new AssertionError(th);
        }
    }

    public String toString() {
        return "LogExceptionRunnable(" + this.B + ")";
    }
}
