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

/* JADX INFO: loaded from: classes.dex */
public abstract class D implements InterfaceFutureC8236sc0 {
    public static final boolean E = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public static final Logger F = Logger.getLogger(D.class.getName());
    public static final b G;
    public static final Object H;
    public volatile Object B;
    public volatile e C;
    public volatile i D;

    public static abstract class b {
        public b() {
        }

        public abstract boolean a(D d, e eVar, e eVar2);

        public abstract boolean b(D d, Object obj, Object obj2);

        public abstract boolean c(D d, i iVar, i iVar2);

        public abstract void d(i iVar, i iVar2);

        public abstract void e(i iVar, Thread thread);
    }

    public static final class c {
        public static final c c;
        public static final c d;
        public final boolean a;
        public final Throwable b;

        static {
            if (D.E) {
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

    public static final class d {
        public static final d b = new d(new a("Failure occurred while trying to finish a future."));
        public final Throwable a;

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
            this.a = (Throwable) D.d(th);
        }
    }

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

        @Override // com.daaw.D.b
        public boolean a(D d, e eVar, e eVar2) {
            return AbstractC5549j0.a(this.d, d, eVar, eVar2);
        }

        @Override // com.daaw.D.b
        public boolean b(D d, Object obj, Object obj2) {
            return AbstractC5549j0.a(this.e, d, obj, obj2);
        }

        @Override // com.daaw.D.b
        public boolean c(D d, i iVar, i iVar2) {
            return AbstractC5549j0.a(this.c, d, iVar, iVar2);
        }

        @Override // com.daaw.D.b
        public void d(i iVar, i iVar2) {
            this.b.lazySet(iVar, iVar2);
        }

        @Override // com.daaw.D.b
        public void e(i iVar, Thread thread) {
            this.a.lazySet(iVar, thread);
        }
    }

    public static final class g implements Runnable {
        public final D B;
        public final InterfaceFutureC8236sc0 C;

        public g(D d, InterfaceFutureC8236sc0 interfaceFutureC8236sc0) {
            this.B = d;
            this.C = interfaceFutureC8236sc0;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.B.B != this) {
                return;
            }
            if (D.G.b(this.B, this, D.j(this.C))) {
                D.f(this.B);
            }
        }
    }

    public static final class h extends b {
        public h() {
            super();
        }

        @Override // com.daaw.D.b
        public boolean a(D d, e eVar, e eVar2) {
            synchronized (d) {
                try {
                    if (d.C != eVar) {
                        return false;
                    }
                    d.C = eVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.daaw.D.b
        public boolean b(D d, Object obj, Object obj2) {
            synchronized (d) {
                try {
                    if (d.B != obj) {
                        return false;
                    }
                    d.B = obj2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.daaw.D.b
        public boolean c(D d, i iVar, i iVar2) {
            synchronized (d) {
                try {
                    if (d.D != iVar) {
                        return false;
                    }
                    d.D = iVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.daaw.D.b
        public void d(i iVar, i iVar2) {
            iVar.b = iVar2;
        }

        @Override // com.daaw.D.b
        public void e(i iVar, Thread thread) {
            iVar.a = thread;
        }
    }

    public static final class i {
        public static final i c = new i(false);
        public volatile Thread a;
        public volatile i b;

        public i(boolean z) {
        }

        public void a(i iVar) {
            D.G.d(this, iVar);
        }

        public void b() {
            Thread thread = this.a;
            if (thread != null) {
                this.a = null;
                LockSupport.unpark(thread);
            }
        }

        public i() {
            D.G.e(this, Thread.currentThread());
        }
    }

    static {
        b hVar;
        try {
            hVar = new f(AtomicReferenceFieldUpdater.newUpdater(i.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(i.class, i.class, "b"), AtomicReferenceFieldUpdater.newUpdater(D.class, i.class, "D"), AtomicReferenceFieldUpdater.newUpdater(D.class, e.class, "C"), AtomicReferenceFieldUpdater.newUpdater(D.class, Object.class, "B"));
            th = null;
        } catch (Throwable th) {
            th = th;
            hVar = new h();
        }
        G = hVar;
        if (th != null) {
            F.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        H = new Object();
    }

    private void a(StringBuilder sb) {
        try {
            Object objK = k(this);
            sb.append("SUCCESS, result=[");
            sb.append(s(objK));
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

    private static CancellationException c(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    public static Object d(Object obj) {
        obj.getClass();
        return obj;
    }

    public static void f(D d2) {
        e eVar = null;
        while (true) {
            d2.n();
            d2.b();
            e eVarE = d2.e(eVar);
            while (eVarE != null) {
                eVar = eVarE.c;
                Runnable runnable = eVarE.a;
                if (runnable instanceof g) {
                    g gVar = (g) runnable;
                    d2 = gVar.B;
                    if (d2.B == gVar) {
                        if (G.b(d2, gVar, j(gVar.C))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    h(runnable, eVarE.b);
                }
                eVarE = eVar;
            }
            return;
        }
    }

    private static void h(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e2) {
            F.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e2);
        }
    }

    private Object i(Object obj) throws ExecutionException {
        if (obj instanceof c) {
            throw c("Task was cancelled.", ((c) obj).b);
        }
        if (obj instanceof d) {
            throw new ExecutionException(((d) obj).a);
        }
        if (obj == H) {
            return null;
        }
        return obj;
    }

    public static Object j(InterfaceFutureC8236sc0 interfaceFutureC8236sc0) {
        if (interfaceFutureC8236sc0 instanceof D) {
            Object obj = ((D) interfaceFutureC8236sc0).B;
            if (!(obj instanceof c)) {
                return obj;
            }
            c cVar = (c) obj;
            return cVar.a ? cVar.b != null ? new c(false, cVar.b) : c.d : obj;
        }
        boolean zIsCancelled = interfaceFutureC8236sc0.isCancelled();
        if ((!E) && zIsCancelled) {
            return c.d;
        }
        try {
            Object objK = k(interfaceFutureC8236sc0);
            return objK == null ? H : objK;
        } catch (CancellationException e2) {
            if (zIsCancelled) {
                return new c(false, e2);
            }
            return new d(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + interfaceFutureC8236sc0, e2));
        } catch (ExecutionException e3) {
            return new d(e3.getCause());
        } catch (Throwable th) {
            return new d(th);
        }
    }

    private static Object k(Future future) {
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

    private void n() {
        i iVar;
        do {
            iVar = this.D;
        } while (!G.c(this, iVar, i.c));
        while (iVar != null) {
            iVar.b();
            iVar = iVar.b;
        }
    }

    private String s(Object obj) {
        return obj == this ? "this future" : String.valueOf(obj);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        Object obj = this.B;
        if (!(obj == null) && !(obj instanceof g)) {
            return false;
        }
        c cVar = E ? new c(z, new CancellationException("Future.cancel() was called.")) : z ? c.c : c.d;
        boolean z2 = false;
        D d2 = this;
        while (true) {
            if (G.b(d2, obj, cVar)) {
                if (z) {
                    d2.l();
                }
                f(d2);
                if (!(obj instanceof g)) {
                    break;
                }
                InterfaceFutureC8236sc0 interfaceFutureC8236sc0 = ((g) obj).C;
                if (!(interfaceFutureC8236sc0 instanceof D)) {
                    interfaceFutureC8236sc0.cancel(z);
                    break;
                }
                d2 = (D) interfaceFutureC8236sc0;
                obj = d2.B;
                if (!(obj == null) && !(obj instanceof g)) {
                    break;
                }
                z2 = true;
            } else {
                obj = d2.B;
                if (!(obj instanceof g)) {
                    return z2;
                }
            }
        }
        return true;
    }

    public final e e(e eVar) {
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

    @Override // com.daaw.InterfaceFutureC8236sc0
    public final void g(Runnable runnable, Executor executor) {
        d(runnable);
        d(executor);
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
        h(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.B;
        if ((obj != null) && (!(obj instanceof g))) {
            return i(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            i iVar = this.D;
            if (iVar != i.c) {
                i iVar2 = new i();
                do {
                    iVar2.a(iVar);
                    if (G.c(this, iVar, iVar2)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                o(iVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.B;
                            if ((obj2 != null) && (!(obj2 instanceof g))) {
                                return i(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        o(iVar2);
                    } else {
                        iVar = this.D;
                    }
                } while (iVar != i.c);
            }
            return i(this.B);
        }
        while (nanos > 0) {
            Object obj3 = this.B;
            if ((obj3 != null) && (!(obj3 instanceof g))) {
                return i(obj3);
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
        return (!(r0 instanceof g)) & (this.B != null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String m() {
        Object obj = this.B;
        if (obj instanceof g) {
            return "setFuture=[" + s(((g) obj).C) + "]";
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public final void o(i iVar) {
        iVar.a = null;
        while (true) {
            i iVar2 = this.D;
            if (iVar2 == i.c) {
                return;
            }
            i iVar3 = null;
            while (iVar2 != null) {
                i iVar4 = iVar2.b;
                if (iVar2.a != null) {
                    iVar3 = iVar2;
                } else if (iVar3 != null) {
                    iVar3.b = iVar4;
                    if (iVar3.a == null) {
                        break;
                    }
                } else if (!G.c(this, iVar2, iVar4)) {
                    break;
                }
                iVar2 = iVar4;
            }
            return;
        }
    }

    public boolean p(Object obj) {
        if (obj == null) {
            obj = H;
        }
        if (!G.b(this, null, obj)) {
            return false;
        }
        f(this);
        return true;
    }

    public boolean q(Throwable th) {
        if (!G.b(this, null, new d((Throwable) d(th)))) {
            return false;
        }
        f(this);
        return true;
    }

    public boolean r(InterfaceFutureC8236sc0 interfaceFutureC8236sc0) {
        d dVar;
        d(interfaceFutureC8236sc0);
        Object obj = this.B;
        if (obj == null) {
            if (interfaceFutureC8236sc0.isDone()) {
                if (!G.b(this, null, j(interfaceFutureC8236sc0))) {
                    return false;
                }
                f(this);
                return true;
            }
            g gVar = new g(this, interfaceFutureC8236sc0);
            if (G.b(this, null, gVar)) {
                try {
                    interfaceFutureC8236sc0.g(gVar, XB.INSTANCE);
                } catch (Throwable th) {
                    try {
                        dVar = new d(th);
                    } catch (Throwable unused) {
                        dVar = d.b;
                    }
                    G.b(this, gVar, dVar);
                }
                return true;
            }
            obj = this.B;
        }
        if (obj instanceof c) {
            interfaceFutureC8236sc0.cancel(((c) obj).a);
        }
        return false;
    }

    public String toString() {
        String strM;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            a(sb);
        } else {
            try {
                strM = m();
            } catch (RuntimeException e2) {
                strM = "Exception thrown from implementation: " + e2.getClass();
            }
            if (strM != null && !strM.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(strM);
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

    public void b() {
    }

    public void l() {
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.B;
            if ((obj2 != null) & (!(obj2 instanceof g))) {
                return i(obj2);
            }
            i iVar = this.D;
            if (iVar != i.c) {
                i iVar2 = new i();
                do {
                    iVar2.a(iVar);
                    if (G.c(this, iVar, iVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.B;
                            } else {
                                o(iVar2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof g))));
                        return i(obj);
                    }
                    iVar = this.D;
                } while (iVar != i.c);
            }
            return i(this.B);
        }
        throw new InterruptedException();
    }
}
