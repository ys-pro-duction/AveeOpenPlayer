package com.daaw;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: com.daaw.hC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5051hC {
    public final Map a = new HashMap();
    public final c b = new c();

    /* JADX INFO: renamed from: com.daaw.hC$b */
    public static class b {
        public final Lock a;
        public int b;

        public b() {
            this.a = new ReentrantLock();
        }
    }

    /* JADX INFO: renamed from: com.daaw.hC$c */
    public static class c {
        public final Queue a;

        public c() {
            this.a = new ArrayDeque();
        }

        public b a() {
            b bVar;
            synchronized (this.a) {
                bVar = (b) this.a.poll();
            }
            return bVar == null ? new b() : bVar;
        }

        public void b(b bVar) {
            synchronized (this.a) {
                try {
                    if (this.a.size() < 10) {
                        this.a.offer(bVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public void a(H70 h70) {
        b bVarA;
        synchronized (this) {
            try {
                bVarA = (b) this.a.get(h70);
                if (bVarA == null) {
                    bVarA = this.b.a();
                    this.a.put(h70, bVarA);
                }
                bVarA.b++;
            } catch (Throwable th) {
                throw th;
            }
        }
        bVarA.a.lock();
    }

    public void b(H70 h70) {
        b bVar;
        int i;
        synchronized (this) {
            try {
                bVar = (b) this.a.get(h70);
                if (bVar != null && (i = bVar.b) > 0) {
                    int i2 = i - 1;
                    bVar.b = i2;
                    if (i2 == 0) {
                        b bVar2 = (b) this.a.remove(h70);
                        if (!bVar2.equals(bVar)) {
                            throw new IllegalStateException("Removed the wrong lock, expected to remove: " + bVar + ", but actually removed: " + bVar2 + ", key: " + h70);
                        }
                        this.b.b(bVar2);
                    }
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Cannot release a lock that is not held, key: ");
                sb.append(h70);
                sb.append(", interestedThreads: ");
                sb.append(bVar == null ? 0 : bVar.b);
                throw new IllegalArgumentException(sb.toString());
            } finally {
            }
        }
        bVar.a.unlock();
    }
}
