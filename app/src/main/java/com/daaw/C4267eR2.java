package com.daaw;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* JADX INFO: renamed from: com.daaw.eR2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4267eR2 extends FutureTask implements Comparable {
    public final long B;
    public final boolean C;
    public final String D;
    public final /* synthetic */ KS2 E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4267eR2(KS2 ks2, Runnable runnable, boolean z, String str) {
        super(runnable, null);
        this.E = ks2;
        AbstractC7506py0.l(str);
        long andIncrement = KS2.l.getAndIncrement();
        this.B = andIncrement;
        this.D = str;
        this.C = z;
        if (andIncrement == Long.MAX_VALUE) {
            ks2.a.w().n().a("Tasks index overflow");
        }
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        C4267eR2 c4267eR2 = (C4267eR2) obj;
        boolean z = this.C;
        if (z != c4267eR2.C) {
            return !z ? 1 : -1;
        }
        long j = this.B;
        long j2 = c4267eR2.B;
        if (j < j2) {
            return -1;
        }
        if (j > j2) {
            return 1;
        }
        this.E.a.w().q().b("Two tasks share the same index. index", Long.valueOf(this.B));
        return 0;
    }

    @Override // java.util.concurrent.FutureTask
    public final void setException(Throwable th) {
        this.E.a.w().n().b(this.D, th);
        super.setException(th);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4267eR2(KS2 ks2, Callable callable, boolean z, String str) {
        super(callable);
        this.E = ks2;
        AbstractC7506py0.l("Task exception on worker thread");
        long andIncrement = KS2.l.getAndIncrement();
        this.B = andIncrement;
        this.D = "Task exception on worker thread";
        this.C = z;
        if (andIncrement == Long.MAX_VALUE) {
            ks2.a.w().n().a("Tasks index overflow");
        }
    }
}
