package com.daaw;

import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: com.daaw.i0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5272i0 implements InterfaceFutureC8236sc0 {
    public static final boolean E = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public static final Logger F = Logger.getLogger(AbstractC5272i0.class.getName());
    public static final b G;
    public static final Object H;
    public volatile Object B;
    public volatile e C;
    public volatile h D;

    /* JADX INFO: renamed from: com.daaw.i0$b */
    public static abstract class b {
        public b() {
        }

        public abstract boolean a(AbstractC5272i0 abstractC5272i0, e eVar, e eVar2);

        public abstract boolean b(AbstractC5272i0 abstractC5272i0, Object obj, Object obj2);

        public abstract boolean c(AbstractC5272i0 abstractC5272i0, h hVar, h hVar2);

        public abstract void d(h hVar, h hVar2);

        public abstract void e(h hVar, Thread thread);
    }

    /* JADX INFO: renamed from: com.daaw.i0$c */
    public static final class c {
        public static final c c;
        public static final c d;
        public final boolean a;
        public final Throwable b;

        static {
            if (AbstractC5272i0.E) {
                d = null;
                c = null;
            } else {
                d = new c(false, null);
                c = new c(true, null);
            }
        }

        public c(boolean z, Throwable th) {
            this.a = z;
            this.b = th;
        }
    }

    /* JADX INFO: renamed from: com.daaw.i0$d */
    public static final class d {
        public static final d b = new d(new a("Failure occurred while trying to finish a future."));
        public final Throwable a;

        /* JADX INFO: renamed from: com.daaw.i0$d$a */
        public class a extends Throwable {
            public a(String str) {
                super(str);
            }

            @Override // java.lang.Throwable
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        public d(Throwable th) {
            this.a = (Throwable) AbstractC5272i0.k(th);
        }
    }

    /* JADX INFO: renamed from: com.daaw.i0$e */
    public static final class e {
        public static final e d = new e(null, null);
        public final Runnable a;
        public final Executor b;
        public e c;

        public e(Runnable runnable, Executor executor) {
            this.a = runnable;
            this.b = executor;
        }
    }

    /* JADX INFO: renamed from: com.daaw.i0$f */
    public static final class f extends b {
        public final AtomicReferenceFieldUpdater a;
        public final AtomicReferenceFieldUpdater b;
        public final AtomicReferenceFieldUpdater c;
        public final AtomicReferenceFieldUpdater d;
        public final AtomicReferenceFieldUpdater e;

        public f(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
            super();
            this.a = atomicReferenceFieldUpdater;
            this.b = atomicReferenceFieldUpdater2;
            this.c = atomicReferenceFieldUpdater3;
            this.d = atomicReferenceFieldUpdater4;
            this.e = atomicReferenceFieldUpdater5;
        }

        @Override // com.daaw.AbstractC5272i0.b
        public boolean a(AbstractC5272i0 abstractC5272i0, e eVar, e eVar2) {
            return AbstractC5549j0.a(this.d, abstractC5272i0, eVar, eVar2);
        }

        @Override // com.daaw.AbstractC5272i0.b
        public boolean b(AbstractC5272i0 abstractC5272i0, Object obj, Object obj2) {
            return AbstractC5549j0.a(this.e, abstractC5272i0, obj, obj2);
        }

        @Override // com.daaw.AbstractC5272i0.b
        public boolean c(AbstractC5272i0 abstractC5272i0, h hVar, h hVar2) {
            return AbstractC5549j0.a(this.c, abstractC5272i0, hVar, hVar2);
        }

        @Override // com.daaw.AbstractC5272i0.b
        public void d(h hVar, h hVar2) {
            this.b.lazySet(hVar, hVar2);
        }

        @Override // com.daaw.AbstractC5272i0.b
        public void e(h hVar, Thread thread) {
            this.a.lazySet(hVar, thread);
        }
    }

    /* JADX INFO: renamed from: com.daaw.i0$g */
    public static final class g extends b {
        public g() {
            super();
        }

        @Override // com.daaw.AbstractC5272i0.b
        public boolean a(AbstractC5272i0 abstractC5272i0, e eVar, e eVar2) {
            synchronized (abstractC5272i0) {
                try {
                    if (abstractC5272i0.C != eVar) {
                        return false;
                    }
                    abstractC5272i0.C = eVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.daaw.AbstractC5272i0.b
        public boolean b(AbstractC5272i0 abstractC5272i0, Object obj, Object obj2) {
            synchronized (abstractC5272i0) {
                try {
                    if (abstractC5272i0.B != obj) {
                        return false;
                    }
                    abstractC5272i0.B = obj2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.daaw.AbstractC5272i0.b
        public boolean c(AbstractC5272i0 abstractC5272i0, h hVar, h hVar2) {
            synchronized (abstractC5272i0) {
                try {
                    if (abstractC5272i0.D != hVar) {
                        return false;
                    }
                    abstractC5272i0.D = hVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.daaw.AbstractC5272i0.b
        public void d(h hVar, h hVar2) {
            hVar.b = hVar2;
        }

        @Override // com.daaw.AbstractC5272i0.b
        public void e(h hVar, Thread thread) {
            hVar.a = thread;
        }
    }

    /* JADX INFO: renamed from: com.daaw.i0$h */
    public static final class h {
        public static final h c = new h(false);
        public volatile Thread a;
        public volatile h b;

        public h(boolean z) {
        }

        public void a(h hVar) {
            AbstractC5272i0.G.d(this, hVar);
        }

        public void b() {
            Thread thread = this.a;
            if (thread != null) {
                this.a = null;
                LockSupport.unpark(thread);
            }
        }

        public h() {
            AbstractC5272i0.G.e(this, Thread.currentThread());
        }
    }

    static {
        b gVar;
        try {
            gVar = new f(AtomicReferenceFieldUpdater.newUpdater(h.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(h.class, h.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractC5272i0.class, h.class, "D"), AtomicReferenceFieldUpdater.newUpdater(AbstractC5272i0.class, e.class, "C"), AtomicReferenceFieldUpdater.newUpdater(AbstractC5272i0.class, Object.class, "B"));
            th = null;
        } catch (Throwable th) {
            th = th;
            gVar = new g();
        }
        G = gVar;
        if (th != null) {
            F.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        H = new Object();
    }

    public static CancellationException h(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    public static Object k(Object obj) {
        obj.getClass();
        return obj;
    }

    public static void m(AbstractC5272i0 abstractC5272i0) {
        abstractC5272i0.s();
        abstractC5272i0.c();
        e eVarL = abstractC5272i0.l(null);
        while (eVarL != null) {
            e eVar = eVarL.c;
            n(eVarL.a, eVarL.b);
            eVarL = eVar;
        }
    }

    public static void n(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e2) {
            F.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e2);
        }
    }

    public static Object p(Future future) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public final void a(StringBuilder sb) {
        try {
            Object objP = p(this);
            sb.append("SUCCESS, result=[");
            sb.append(w(objP));
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e2) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e2.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e3) {
            sb.append("FAILURE, cause=[");
            sb.append(e3.getCause());
            sb.append("]");
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        Object obj = this.B;
        if (obj == null) {
            if (G.b(this, obj, E ? new c(z, new CancellationException("Future.cancel() was called.")) : z ? c.c : c.d)) {
                if (z) {
                    q();
                }
                m(this);
                return true;
            }
        }
        return false;
    }

    @Override // com.daaw.InterfaceFutureC8236sc0
    public final void g(Runnable runnable, Executor executor) {
        k(runnable);
        k(executor);
        e eVar = this.C;
        if (eVar != e.d) {
            e eVar2 = new e(runnable, executor);
            do {
                eVar2.c = eVar;
                if (G.a(this, eVar, eVar2)) {
                    return;
                } else {
                    eVar = this.C;
                }
            } while (eVar != e.d);
        }
        n(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.B;
        if (obj != null) {
            return o(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            h hVar = this.D;
            if (hVar != h.c) {
                h hVar2 = new h();
                do {
                    hVar2.a(hVar);
                    if (G.c(this, hVar, hVar2)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                t(hVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.B;
                            if (obj2 != null) {
                                return o(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        t(hVar2);
                    } else {
                        hVar = this.D;
                    }
                } while (hVar != h.c);
            }
            return o(this.B);
        }
        while (nanos > 0) {
            Object obj3 = this.B;
            if (obj3 != null) {
                return o(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
        }
        String string = toString();
        String string2 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = string2.toLowerCase(locale);
        String str = "Waited " + j + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String str2 = str + " (plus ";
            long j2 = -nanos;
            long jConvert = timeUnit.convert(j2, TimeUnit.NANOSECONDS);
            long nanos2 = j2 - timeUnit.toNanos(jConvert);
            boolean z = jConvert == 0 || nanos2 > 1000;
            if (jConvert > 0) {
                String str3 = str2 + jConvert + " " + lowerCase;
                if (z) {
                    str3 = str3 + ",";
                }
                str2 = str3 + " ";
            }
            if (z) {
                str2 = str2 + nanos2 + " nanoseconds ";
            }
            str = str2 + "delay)";
        }
        if (isDone()) {
            throw new TimeoutException(str + " but future completed as timeout expired");
        }
        throw new TimeoutException(str + " for " + string);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.B instanceof c;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.B != null;
    }

    public final e l(e eVar) {
        e eVar2;
        do {
            eVar2 = this.C;
        } while (!G.a(this, eVar2, e.d));
        e eVar3 = eVar;
        e eVar4 = eVar2;
        while (eVar4 != null) {
            e eVar5 = eVar4.c;
            eVar4.c = eVar3;
            eVar3 = eVar4;
            eVar4 = eVar5;
        }
        return eVar3;
    }

    public final Object o(Object obj) throws ExecutionException {
        if (obj instanceof c) {
            throw h("Task was cancelled.", ((c) obj).b);
        }
        if (obj instanceof d) {
            throw new ExecutionException(((d) obj).a);
        }
        if (obj == H) {
            return null;
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String r() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public final void s() {
        h hVar;
        do {
            hVar = this.D;
        } while (!G.c(this, hVar, h.c));
        while (hVar != null) {
            hVar.b();
            hVar = hVar.b;
        }
    }

    public final void t(h hVar) {
        hVar.a = null;
        while (true) {
            h hVar2 = this.D;
            if (hVar2 == h.c) {
                return;
            }
            h hVar3 = null;
            while (hVar2 != null) {
                h hVar4 = hVar2.b;
                if (hVar2.a != null) {
                    hVar3 = hVar2;
                } else if (hVar3 != null) {
                    hVar3.b = hVar4;
                    if (hVar3.a == null) {
                        break;
                    }
                } else if (!G.c(this, hVar2, hVar4)) {
                    break;
                }
                hVar2 = hVar4;
            }
            return;
        }
    }

    public String toString() {
        String strR;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            a(sb);
        } else {
            try {
                strR = r();
            } catch (RuntimeException e2) {
                strR = "Exception thrown from implementation: " + e2.getClass();
            }
            if (strR != null && !strR.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(strR);
                sb.append("]");
            } else if (isDone()) {
                a(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public boolean u(Object obj) {
        if (obj == null) {
            obj = H;
        }
        if (!G.b(this, null, obj)) {
            return false;
        }
        m(this);
        return true;
    }

    public boolean v(Throwable th) {
        if (!G.b(this, null, new d((Throwable) k(th)))) {
            return false;
        }
        m(this);
        return true;
    }

    public final String w(Object obj) {
        return obj == this ? "this future" : String.valueOf(obj);
    }

    public final boolean x() {
        Object obj = this.B;
        return (obj instanceof c) && ((c) obj).a;
    }

    public void c() {
    }

    public void q() {
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.B;
            if (obj2 != null) {
                return o(obj2);
            }
            h hVar = this.D;
            if (hVar != h.c) {
                h hVar2 = new h();
                do {
                    hVar2.a(hVar);
                    if (G.c(this, hVar, hVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.B;
                            } else {
                                t(hVar2);
                                throw new InterruptedException();
                            }
                        } while (!(obj != null));
                        return o(obj);
                    }
                    hVar = this.D;
                } while (hVar != h.c);
            }
            return o(this.B);
        }
        throw new InterruptedException();
    }
}
