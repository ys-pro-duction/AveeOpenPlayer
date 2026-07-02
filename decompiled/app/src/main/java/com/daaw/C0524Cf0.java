package com.daaw;

import android.util.SparseArray;
import com.daaw.C0524Cf0;
import com.daaw.C9632xb;
import java.util.Comparator;
import java.util.Locale;
import java.util.PriorityQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.daaw.Cf0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C0524Cf0 {
    public static final long c;
    public static final long d;
    public final InterfaceC9932yf0 a;
    public final b b;

    /* JADX INFO: renamed from: com.daaw.Cf0$a */
    public class a implements InterfaceC8453tN0 {
        public final C9632xb a;
        public final C3481bd0 b;
        public boolean c = false;
        public C9632xb.b d;

        public a(C9632xb c9632xb, C3481bd0 c3481bd0) {
            this.a = c9632xb;
            this.b = c3481bd0;
        }

        public static /* synthetic */ void a(a aVar) {
            aVar.b.p(C0524Cf0.this);
            aVar.c = true;
            aVar.b();
        }

        public final void b() {
            this.d = this.a.h(C9632xb.d.GARBAGE_COLLECTION, this.c ? C0524Cf0.d : C0524Cf0.c, new Runnable() { // from class: com.daaw.Bf0
                @Override // java.lang.Runnable
                public final void run() {
                    C0524Cf0.a.a(this.B);
                }
            });
        }

        @Override // com.daaw.InterfaceC8453tN0
        public void start() {
            if (C0524Cf0.this.b.a != -1) {
                b();
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.Cf0$b */
    public static class b {
        public long a;
        public int b;
        public final int c;

        public b(long j, int i, int i2) {
            this.a = j;
            this.b = i;
            this.c = i2;
        }

        public static b a(long j) {
            return new b(j, 10, 1000);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Cf0$c */
    public static class c {
        public final boolean a;
        public final int b;
        public final int c;
        public final int d;

        public c(boolean z, int i, int i2, int i3) {
            this.a = z;
            this.b = i;
            this.c = i2;
            this.d = i3;
        }

        public static c a() {
            return new c(false, 0, 0, 0);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Cf0$d */
    public static class d {
        public static final Comparator c = new Comparator() { // from class: com.daaw.Df0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((Long) obj2).compareTo((Long) obj);
            }
        };
        public final PriorityQueue a;
        public final int b;

        public d(int i) {
            this.b = i;
            this.a = new PriorityQueue(i, c);
        }

        public void b(Long l) {
            if (this.a.size() < this.b) {
                this.a.add(l);
                return;
            }
            if (l.longValue() < ((Long) this.a.peek()).longValue()) {
                this.a.poll();
                this.a.add(l);
            }
        }

        public long c() {
            return ((Long) this.a.peek()).longValue();
        }
    }

    static {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        c = timeUnit.toMillis(1L);
        d = timeUnit.toMillis(5L);
    }

    public C0524Cf0(InterfaceC9932yf0 interfaceC9932yf0, b bVar) {
        this.a = interfaceC9932yf0;
        this.b = bVar;
    }

    public int e(int i) {
        return (int) ((i / 100.0f) * this.a.i());
    }

    public c f(SparseArray sparseArray) {
        if (this.b.a == -1) {
            AbstractC2212Sd0.a("LruGarbageCollector", "Garbage collection skipped; disabled", new Object[0]);
            return c.a();
        }
        long jG = g();
        if (jG >= this.b.a) {
            return l(sparseArray);
        }
        AbstractC2212Sd0.a("LruGarbageCollector", "Garbage collection skipped; Cache size " + jG + " is lower than threshold " + this.b.a, new Object[0]);
        return c.a();
    }

    public long g() {
        return this.a.m();
    }

    public long h(int i) {
        if (i == 0) {
            return -1L;
        }
        final d dVar = new d(i);
        this.a.e(new InterfaceC8310sr() { // from class: com.daaw.zf0
            @Override // com.daaw.InterfaceC8310sr
            public final void accept(Object obj) {
                dVar.b(Long.valueOf(((C5000h11) obj).e()));
            }
        });
        this.a.n(new InterfaceC8310sr() { // from class: com.daaw.Af0
            @Override // com.daaw.InterfaceC8310sr
            public final void accept(Object obj) {
                dVar.b((Long) obj);
            }
        });
        return dVar.c();
    }

    public a i(C9632xb c9632xb, C3481bd0 c3481bd0) {
        return new a(c9632xb, c3481bd0);
    }

    public int j(long j) {
        return this.a.k(j);
    }

    public int k(long j, SparseArray sparseArray) {
        return this.a.a(j, sparseArray);
    }

    public final c l(SparseArray sparseArray) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        int iE = e(this.b.b);
        if (iE > this.b.c) {
            AbstractC2212Sd0.a("LruGarbageCollector", "Capping sequence numbers to collect down to the maximum of " + this.b.c + " from " + iE, new Object[0]);
            iE = this.b.c;
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        long jH = h(iE);
        long jCurrentTimeMillis3 = System.currentTimeMillis();
        int iK = k(jH, sparseArray);
        long jCurrentTimeMillis4 = System.currentTimeMillis();
        int iJ = j(jH);
        long jCurrentTimeMillis5 = System.currentTimeMillis();
        if (AbstractC2212Sd0.c()) {
            StringBuilder sb = new StringBuilder();
            sb.append("LRU Garbage Collection:\n\tCounted targets in " + (jCurrentTimeMillis2 - jCurrentTimeMillis) + "ms\n");
            Locale locale = Locale.ROOT;
            sb.append(String.format(locale, "\tDetermined least recently used %d sequence numbers in %dms\n", Integer.valueOf(iE), Long.valueOf(jCurrentTimeMillis3 - jCurrentTimeMillis2)));
            AbstractC2212Sd0.a("LruGarbageCollector", ((sb.toString() + String.format(locale, "\tRemoved %d targets in %dms\n", Integer.valueOf(iK), Long.valueOf(jCurrentTimeMillis4 - jCurrentTimeMillis3))) + String.format(locale, "\tRemoved %d documents in %dms\n", Integer.valueOf(iJ), Long.valueOf(jCurrentTimeMillis5 - jCurrentTimeMillis4))) + String.format(locale, "Total Duration: %dms", Long.valueOf(jCurrentTimeMillis5 - jCurrentTimeMillis)), new Object[0]);
        }
        return new c(true, iE, iK, iJ);
    }
}
