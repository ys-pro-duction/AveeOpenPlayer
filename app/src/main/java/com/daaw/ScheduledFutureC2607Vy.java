package com.daaw;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.daaw.Vy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class ScheduledFutureC2607Vy extends AbstractC5272i0 implements ScheduledFuture {
    public final ScheduledFuture I;

    /* JADX INFO: renamed from: com.daaw.Vy$a */
    public class a implements b {
        public a() {
        }

        @Override // com.daaw.ScheduledFutureC2607Vy.b
        public void a(Throwable th) {
            ScheduledFutureC2607Vy.this.v(th);
        }

        @Override // com.daaw.ScheduledFutureC2607Vy.b
        public void set(Object obj) {
            ScheduledFutureC2607Vy.this.u(obj);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Vy$b */
    public interface b {
        void a(Throwable th);

        void set(Object obj);
    }

    /* JADX INFO: renamed from: com.daaw.Vy$c */
    public interface c {
        ScheduledFuture a(b bVar);
    }

    public ScheduledFutureC2607Vy(c cVar) {
        this.I = cVar.a(new a());
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public int compareTo(Delayed delayed) {
        return this.I.compareTo(delayed);
    }

    @Override // com.daaw.AbstractC5272i0
    public void c() {
        this.I.cancel(x());
    }

    @Override // java.util.concurrent.Delayed
    public long getDelay(TimeUnit timeUnit) {
        return this.I.getDelay(timeUnit);
    }
}
