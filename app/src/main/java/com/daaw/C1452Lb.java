package com.daaw;

import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: com.daaw.Lb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1452Lb {
    public static final Logger c = Logger.getLogger(C1452Lb.class.getName());
    public final String a;
    public final AtomicLong b;

    /* JADX INFO: renamed from: com.daaw.Lb$b */
    public final class b {
        public final long a;

        public void a() {
            long j = this.a;
            long jMax = Math.max(2 * j, j);
            if (C1452Lb.this.b.compareAndSet(this.a, jMax)) {
                C1452Lb.c.log(Level.WARNING, "Increased {0} to {1}", new Object[]{C1452Lb.this.a, Long.valueOf(jMax)});
            }
        }

        public long b() {
            return this.a;
        }

        public b(long j) {
            this.a = j;
        }
    }

    public C1452Lb(String str, long j) {
        AtomicLong atomicLong = new AtomicLong();
        this.b = atomicLong;
        AbstractC7785qy0.e(j > 0, "value must be positive");
        this.a = str;
        atomicLong.set(j);
    }

    public b d() {
        return new b(this.b.get());
    }
}
