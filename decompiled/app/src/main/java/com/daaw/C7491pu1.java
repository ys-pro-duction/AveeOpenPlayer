package com.daaw;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.pu1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7491pu1 {
    public static final boolean c = AbstractC7770qu1.a;
    public final List a = new ArrayList();
    public boolean b = false;

    public final synchronized void a(String str, long j) {
        if (this.b) {
            throw new IllegalStateException("Marker added to finished log");
        }
        this.a.add(new C7212ou1(str, j, SystemClock.elapsedRealtime()));
    }

    public final synchronized void b(String str) {
        long j;
        this.b = true;
        if (this.a.size() == 0) {
            j = 0;
        } else {
            j = ((C7212ou1) this.a.get(r3.size() - 1)).c - ((C7212ou1) this.a.get(0)).c;
        }
        if (j <= 0) {
            return;
        }
        long j2 = ((C7212ou1) this.a.get(0)).c;
        AbstractC7770qu1.a("(%-4d ms) %s", Long.valueOf(j), str);
        for (C7212ou1 c7212ou1 : this.a) {
            long j3 = c7212ou1.c;
            AbstractC7770qu1.a("(+%-4d) [%2d] %s", Long.valueOf(j3 - j2), Long.valueOf(c7212ou1.b), c7212ou1.a);
            j2 = j3;
        }
    }

    public final void finalize() {
        if (this.b) {
            return;
        }
        b("Request on the loose");
        AbstractC7770qu1.b("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
    }
}
