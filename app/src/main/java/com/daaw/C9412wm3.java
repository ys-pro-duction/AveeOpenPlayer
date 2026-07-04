package com.daaw;

import android.os.SystemClock;

/* JADX INFO: renamed from: com.daaw.wm3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9412wm3 {
    public Exception a;
    public long b;

    public C9412wm3(long j) {
    }

    public final void a() {
        this.a = null;
    }

    public final void b(Exception exc) throws Exception {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (this.a == null) {
            this.a = exc;
            this.b = 100 + jElapsedRealtime;
        }
        if (jElapsedRealtime >= this.b) {
            Exception exc2 = this.a;
            if (exc2 != exc) {
                try {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(exc2, exc);
                } catch (Exception unused) {
                }
            }
            Exception exc3 = this.a;
            this.a = null;
            throw exc3;
        }
    }
}
