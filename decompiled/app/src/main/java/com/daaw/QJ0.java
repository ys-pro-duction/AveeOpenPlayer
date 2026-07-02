package com.daaw;

import android.app.ActivityManager;
import android.content.Context;
import android.database.Cursor;
import android.os.CancellationSignal;
import android.os.Looper;
import com.daaw.KZ0;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes.dex */
public abstract class QJ0 {
    public volatile JZ0 a;
    public Executor b;
    public Executor c;
    public KZ0 d;
    public boolean f;
    public boolean g;
    public List h;
    public final ReentrantReadWriteLock i = new ReentrantReadWriteLock();
    public final ThreadLocal j = new ThreadLocal();
    public final Map k = new ConcurrentHashMap();
    public final androidx.room.c e = e();

    public static class a {
        public final Class a;
        public final String b;
        public final Context c;
        public ArrayList d;
        public Executor e;
        public Executor f;
        public KZ0.c g;
        public boolean h;
        public boolean j;
        public boolean l;
        public Set n;
        public Set o;
        public String p;
        public File q;
        public c i = c.AUTOMATIC;
        public boolean k = true;
        public final d m = new d();

        public a(Context context, Class cls, String str) {
            this.c = context;
            this.a = cls;
            this.b = str;
        }

        public a a(b bVar) {
            if (this.d == null) {
                this.d = new ArrayList();
            }
            this.d.add(bVar);
            return this;
        }

        public a b(AbstractC8555tk0... abstractC8555tk0Arr) {
            if (this.o == null) {
                this.o = new HashSet();
            }
            for (AbstractC8555tk0 abstractC8555tk0 : abstractC8555tk0Arr) {
                this.o.add(Integer.valueOf(abstractC8555tk0.a));
                this.o.add(Integer.valueOf(abstractC8555tk0.b));
            }
            this.m.b(abstractC8555tk0Arr);
            return this;
        }

        public a c() {
            this.h = true;
            return this;
        }

        public QJ0 d() {
            Executor executor;
            if (this.c == null) {
                throw new IllegalArgumentException("Cannot provide null context for the database.");
            }
            if (this.a == null) {
                throw new IllegalArgumentException("Must provide an abstract class that extends RoomDatabase");
            }
            Executor executor2 = this.e;
            if (executor2 == null && this.f == null) {
                Executor executorF = C9906ya.f();
                this.f = executorF;
                this.e = executorF;
            } else if (executor2 != null && this.f == null) {
                this.f = executor2;
            } else if (executor2 == null && (executor = this.f) != null) {
                this.e = executor;
            }
            Set<Integer> set = this.o;
            if (set != null && this.n != null) {
                for (Integer num : set) {
                    if (this.n.contains(num)) {
                        throw new IllegalArgumentException("Inconsistency detected. A Migration was supplied to addMigration(Migration... migrations) that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(int... startVersions). Start version: " + num);
                    }
                }
            }
            if (this.g == null) {
                this.g = new C9587xQ();
            }
            String str = this.p;
            if (str != null || this.q != null) {
                if (this.b == null) {
                    throw new IllegalArgumentException("Cannot create from asset or file for an in-memory database.");
                }
                if (str != null && this.q != null) {
                    throw new IllegalArgumentException("Both createFromAsset() and createFromFile() was called on this Builder but the database can only be created using one of the two configurations.");
                }
                this.g = new EK0(str, this.q, this.g);
            }
            Context context = this.c;
            C3573bw c3573bw = new C3573bw(context, this.b, this.g, this.m, this.d, this.h, this.i.c(context), this.e, this.f, this.j, this.k, this.l, this.n, this.p, this.q);
            QJ0 qj0 = (QJ0) PJ0.b(this.a, "_Impl");
            qj0.l(c3573bw);
            return qj0;
        }

        public a e() {
            this.k = false;
            this.l = true;
            return this;
        }

        public a f(KZ0.c cVar) {
            this.g = cVar;
            return this;
        }

        public a g(Executor executor) {
            this.e = executor;
            return this;
        }
    }

    public enum c {
        AUTOMATIC,
        TRUNCATE,
        WRITE_AHEAD_LOGGING;

        public static boolean a(ActivityManager activityManager) {
            return activityManager.isLowRamDevice();
        }

        public c c(Context context) {
            if (this != AUTOMATIC) {
                return this;
            }
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            return (activityManager == null || a(activityManager)) ? TRUNCATE : WRITE_AHEAD_LOGGING;
        }
    }

    public static class d {
        public HashMap a = new HashMap();

        public final void a(AbstractC8555tk0 abstractC8555tk0) {
            int i = abstractC8555tk0.a;
            int i2 = abstractC8555tk0.b;
            TreeMap treeMap = (TreeMap) this.a.get(Integer.valueOf(i));
            if (treeMap == null) {
                treeMap = new TreeMap();
                this.a.put(Integer.valueOf(i), treeMap);
            }
            AbstractC8555tk0 abstractC8555tk02 = (AbstractC8555tk0) treeMap.get(Integer.valueOf(i2));
            if (abstractC8555tk02 != null) {
                abstractC8555tk02.toString();
                abstractC8555tk0.toString();
            }
            treeMap.put(Integer.valueOf(i2), abstractC8555tk0);
        }

        public void b(AbstractC8555tk0... abstractC8555tk0Arr) {
            for (AbstractC8555tk0 abstractC8555tk0 : abstractC8555tk0Arr) {
                a(abstractC8555tk0);
            }
        }

        public List c(int i, int i2) {
            if (i == i2) {
                return Collections.EMPTY_LIST;
            }
            return d(new ArrayList(), i2 > i, i, i2);
        }

        /* JADX WARN: Code restructure failed: missing block: B:27:0x0052, code lost:
        
            return r6;
         */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0016 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0017  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.util.List d(java.util.List r6, boolean r7, int r8, int r9) {
            /*
                r5 = this;
            L0:
                if (r7 == 0) goto L5
                if (r8 >= r9) goto L52
                goto L7
            L5:
                if (r8 <= r9) goto L52
            L7:
                java.util.HashMap r0 = r5.a
                java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
                java.lang.Object r0 = r0.get(r1)
                java.util.TreeMap r0 = (java.util.TreeMap) r0
                r1 = 0
                if (r0 != 0) goto L17
                return r1
            L17:
                if (r7 == 0) goto L1e
                java.util.NavigableSet r2 = r0.descendingKeySet()
                goto L22
            L1e:
                java.util.Set r2 = r0.keySet()
            L22:
                java.util.Iterator r2 = r2.iterator()
            L26:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto L4a
                java.lang.Object r3 = r2.next()
                java.lang.Integer r3 = (java.lang.Integer) r3
                int r4 = r3.intValue()
                if (r7 == 0) goto L3d
                if (r4 > r9) goto L26
                if (r4 <= r8) goto L26
                goto L41
            L3d:
                if (r4 < r9) goto L26
                if (r4 >= r8) goto L26
            L41:
                java.lang.Object r8 = r0.get(r3)
                r6.add(r8)
                r8 = 1
                goto L4d
            L4a:
                r0 = 0
                r4 = r8
                r8 = 0
            L4d:
                if (r8 != 0) goto L50
                return r1
            L50:
                r8 = r4
                goto L0
            L52:
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.daaw.QJ0.d.d(java.util.List, boolean, int, int):java.util.List");
        }
    }

    public static boolean n() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public void a() {
        if (!this.f && n()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public void b() {
        if (!k() && this.j.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    public void c() {
        a();
        JZ0 jz0E0 = this.d.e0();
        this.e.m(jz0E0);
        jz0E0.m();
    }

    public NZ0 d(String str) {
        a();
        b();
        return this.d.e0().A(str);
    }

    public abstract androidx.room.c e();

    public abstract KZ0 f(C3573bw c3573bw);

    public void g() {
        this.d.e0().l0();
        if (k()) {
            return;
        }
        this.e.f();
    }

    public Lock h() {
        return this.i.readLock();
    }

    public KZ0 i() {
        return this.d;
    }

    public Executor j() {
        return this.b;
    }

    public boolean k() {
        return this.d.e0().F0();
    }

    public void l(C3573bw c3573bw) {
        KZ0 kz0F = f(c3573bw);
        this.d = kz0F;
        if (kz0F instanceof DK0) {
            ((DK0) kz0F).c(c3573bw);
        }
        boolean z = c3573bw.g == c.WRITE_AHEAD_LOGGING;
        this.d.setWriteAheadLoggingEnabled(z);
        this.h = c3573bw.e;
        this.b = c3573bw.h;
        this.c = new ExecutorC4741g51(c3573bw.i);
        this.f = c3573bw.f;
        this.g = z;
        if (c3573bw.j) {
            this.e.i(c3573bw.b, c3573bw.c);
        }
    }

    public void m(JZ0 jz0) {
        this.e.d(jz0);
    }

    public boolean o() {
        JZ0 jz0 = this.a;
        return jz0 != null && jz0.isOpen();
    }

    public Cursor p(MZ0 mz0) {
        return q(mz0, null);
    }

    public Cursor q(MZ0 mz0, CancellationSignal cancellationSignal) {
        a();
        b();
        return cancellationSignal != null ? this.d.e0().b0(mz0, cancellationSignal) : this.d.e0().H0(mz0);
    }

    public void r() {
        this.d.e0().T();
    }

    public static abstract class b {
        public void a(JZ0 jz0) {
        }

        public void b(JZ0 jz0) {
        }

        public void c(JZ0 jz0) {
        }
    }
}
