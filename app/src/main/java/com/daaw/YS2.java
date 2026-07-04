package com.daaw;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class YS2 implements Runnable {
    public C3440bT2 B;

    public YS2(C3440bT2 c3440bT2) {
        this.B = c3440bT2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceFutureC8236sc0 interfaceFutureC8236sc0;
        C3440bT2 c3440bT2 = this.B;
        if (c3440bT2 == null || (interfaceFutureC8236sc0 = c3440bT2.I) == null) {
            return;
        }
        this.B = null;
        if (interfaceFutureC8236sc0.isDone()) {
            c3440bT2.u(interfaceFutureC8236sc0);
            return;
        }
        try {
            ScheduledFuture scheduledFuture = c3440bT2.J;
            c3440bT2.J = null;
            String str = "Timed out";
            if (scheduledFuture != null) {
                try {
                    long jAbs = Math.abs(scheduledFuture.getDelay(TimeUnit.MILLISECONDS));
                    if (jAbs > 10) {
                        str = "Timed out (timeout delayed by " + jAbs + " ms after scheduled time)";
                    }
                } catch (Throwable th) {
                    c3440bT2.f(new C3161aT2(str, null));
                    throw th;
                }
            }
            c3440bT2.f(new C3161aT2(str + ": " + interfaceFutureC8236sc0.toString(), null));
        } finally {
            interfaceFutureC8236sc0.cancel(true);
        }
    }
}
