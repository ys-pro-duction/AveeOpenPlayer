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

/* JADX INFO: renamed from: com.daaw.yR2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC9873yR2 extends AbstractC5122hT2 implements InterfaceFutureC8236sc0 {
    public static final boolean E;
    public static final Logger F;
    public static final AbstractC6798nR2 G;
    public static final Object H;
    public volatile Object B;
    public volatile C7635qR2 C;
    public volatile C9594xR2 D;

    static {
        boolean z;
        Throwable th;
        AbstractC6798nR2 c8471tR2;
        Throwable th2;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        E = z;
        F = Logger.getLogger(AbstractC9873yR2.class.getName());
        byte b = 0;
        try {
            c8471tR2 = new C9315wR2(null);
            th = null;
            th2 = null;
        } catch (Error | RuntimeException e) {
            try {
                th = null;
                th2 = e;
                c8471tR2 = new C7913rR2(AtomicReferenceFieldUpdater.newUpdater(C9594xR2.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(C9594xR2.class, C9594xR2.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractC9873yR2.class, C9594xR2.class, "D"), AtomicReferenceFieldUpdater.newUpdater(AbstractC9873yR2.class, C7635qR2.class, "C"), AtomicReferenceFieldUpdater.newUpdater(AbstractC9873yR2.class, Object.class, "B"));
            } catch (Error | RuntimeException e2) {
                th = e2;
                c8471tR2 = new C8471tR2(b == true ? 1 : 0);
                th2 = e;
            }
        }
        G = c8471tR2;
        if (th != null) {
            Logger logger = F;
            Level level = Level.SEVERE;
            logger.logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "UnsafeAtomicHelper is broken!", th2);
            logger.logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
        H = new Object();
    }

    public static void A(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            F.logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "executeListener", "RuntimeException while executing runnable " + String.valueOf(runnable) + " with executor " + String.valueOf(executor), (Throwable) e);
        }
    }

    public static final Object b(Object obj) throws ExecutionException {
        if (obj instanceof C7077oR2) {
            Throwable th = ((C7077oR2) obj).b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof C7356pR2) {
            throw new ExecutionException(((C7356pR2) obj).a);
        }
        if (obj == H) {
            return null;
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Object h(InterfaceFutureC8236sc0 interfaceFutureC8236sc0) {
        Throwable thA;
        if (interfaceFutureC8236sc0 instanceof InterfaceC8750uR2) {
            Object c7077oR2 = ((AbstractC9873yR2) interfaceFutureC8236sc0).B;
            if (c7077oR2 instanceof C7077oR2) {
                C7077oR2 c7077oR22 = (C7077oR2) c7077oR2;
                if (c7077oR22.a) {
                    Throwable th = c7077oR22.b;
                    c7077oR2 = th != null ? new C7077oR2(false, th) : C7077oR2.d;
                }
            }
            c7077oR2.getClass();
            return c7077oR2;
        }
        if ((interfaceFutureC8236sc0 instanceof AbstractC5122hT2) && (thA = ((AbstractC5122hT2) interfaceFutureC8236sc0).a()) != null) {
            return new C7356pR2(thA);
        }
        boolean zIsCancelled = interfaceFutureC8236sc0.isCancelled();
        if ((!E) && zIsCancelled) {
            C7077oR2 c7077oR23 = C7077oR2.d;
            c7077oR23.getClass();
            return c7077oR23;
        }
        try {
            Object objI = i(interfaceFutureC8236sc0);
            if (!zIsCancelled) {
                return objI == null ? H : objI;
            }
            return new C7077oR2(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + String.valueOf(interfaceFutureC8236sc0)));
        } catch (Error | RuntimeException e) {
            return new C7356pR2(e);
        } catch (CancellationException e2) {
            return !zIsCancelled ? new C7356pR2(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(interfaceFutureC8236sc0)), e2)) : new C7077oR2(false, e2);
        } catch (ExecutionException e3) {
            return zIsCancelled ? new C7077oR2(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(interfaceFutureC8236sc0)), e3)) : new C7356pR2(e3.getCause());
        }
    }

    public static Object i(Future future) {
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

    public static void z(AbstractC9873yR2 abstractC9873yR2, boolean z) {
        C7635qR2 c7635qR2 = null;
        while (true) {
            for (C9594xR2 c9594xR2B = G.b(abstractC9873yR2, C9594xR2.c); c9594xR2B != null; c9594xR2B = c9594xR2B.b) {
                Thread thread = c9594xR2B.a;
                if (thread != null) {
                    c9594xR2B.a = null;
                    LockSupport.unpark(thread);
                }
            }
            if (z) {
                abstractC9873yR2.s();
            }
            abstractC9873yR2.d();
            C7635qR2 c7635qR22 = c7635qR2;
            C7635qR2 c7635qR2A = G.a(abstractC9873yR2, C7635qR2.d);
            C7635qR2 c7635qR23 = c7635qR22;
            while (c7635qR2A != null) {
                C7635qR2 c7635qR24 = c7635qR2A.c;
                c7635qR2A.c = c7635qR23;
                c7635qR23 = c7635qR2A;
                c7635qR2A = c7635qR24;
            }
            while (c7635qR23 != null) {
                c7635qR2 = c7635qR23.c;
                Runnable runnable = c7635qR23.a;
                runnable.getClass();
                if (runnable instanceof RunnableC8192sR2) {
                    RunnableC8192sR2 runnableC8192sR2 = (RunnableC8192sR2) runnable;
                    abstractC9873yR2 = runnableC8192sR2.B;
                    if (abstractC9873yR2.B == runnableC8192sR2) {
                        if (G.f(abstractC9873yR2, runnableC8192sR2, h(runnableC8192sR2.C))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = c7635qR23.b;
                    executor.getClass();
                    A(runnable, executor);
                }
                c7635qR23 = c7635qR2;
            }
            return;
            z = false;
        }
    }

    public final void B(C9594xR2 c9594xR2) {
        c9594xR2.a = null;
        while (true) {
            C9594xR2 c9594xR22 = this.D;
            if (c9594xR22 != C9594xR2.c) {
                C9594xR2 c9594xR23 = null;
                while (c9594xR22 != null) {
                    C9594xR2 c9594xR24 = c9594xR22.b;
                    if (c9594xR22.a != null) {
                        c9594xR23 = c9594xR22;
                    } else if (c9594xR23 != null) {
                        c9594xR23.b = c9594xR24;
                        if (c9594xR23.a == null) {
                            break;
                        }
                    } else if (!G.g(this, c9594xR22, c9594xR24)) {
                        break;
                    }
                    c9594xR22 = c9594xR24;
                }
                return;
            }
            return;
        }
    }

    @Override // com.daaw.AbstractC5122hT2
    public final Throwable a() {
        if (!(this instanceof InterfaceC8750uR2)) {
            return null;
        }
        Object obj = this.B;
        if (obj instanceof C7356pR2) {
            return ((C7356pR2) obj).a;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String c() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0057, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean cancel(boolean r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.B
            boolean r1 = r0 instanceof com.daaw.RunnableC8192sR2
            r2 = 0
            r3 = 1
            if (r0 != 0) goto La
            r4 = 1
            goto Lb
        La:
            r4 = 0
        Lb:
            r1 = r1 | r4
            if (r1 == 0) goto L5f
            boolean r1 = com.daaw.AbstractC9873yR2.E
            if (r1 == 0) goto L1f
            com.daaw.oR2 r1 = new com.daaw.oR2
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.String r5 = "Future.cancel() was called."
            r4.<init>(r5)
            r1.<init>(r8, r4)
            goto L29
        L1f:
            if (r8 == 0) goto L24
            com.daaw.oR2 r1 = com.daaw.C7077oR2.c
            goto L26
        L24:
            com.daaw.oR2 r1 = com.daaw.C7077oR2.d
        L26:
            r1.getClass()
        L29:
            r5 = 0
            r4 = r7
        L2b:
            com.daaw.nR2 r6 = com.daaw.AbstractC9873yR2.G
            boolean r6 = r6.f(r4, r0, r1)
            if (r6 == 0) goto L58
            z(r4, r8)
            boolean r4 = r0 instanceof com.daaw.RunnableC8192sR2
            if (r4 == 0) goto L57
            com.daaw.sR2 r0 = (com.daaw.RunnableC8192sR2) r0
            com.daaw.sc0 r0 = r0.C
            boolean r4 = r0 instanceof com.daaw.InterfaceC8750uR2
            if (r4 == 0) goto L54
            r4 = r0
            com.daaw.yR2 r4 = (com.daaw.AbstractC9873yR2) r4
            java.lang.Object r0 = r4.B
            if (r0 != 0) goto L4b
            r5 = 1
            goto L4c
        L4b:
            r5 = 0
        L4c:
            boolean r6 = r0 instanceof com.daaw.RunnableC8192sR2
            r5 = r5 | r6
            if (r5 == 0) goto L53
            r5 = 1
            goto L2b
        L53:
            return r3
        L54:
            r0.cancel(r8)
        L57:
            return r3
        L58:
            java.lang.Object r0 = r4.B
            boolean r6 = r0 instanceof com.daaw.RunnableC8192sR2
            if (r6 != 0) goto L2b
            return r5
        L5f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.AbstractC9873yR2.cancel(boolean):boolean");
    }

    public boolean e(Object obj) {
        if (obj == null) {
            obj = H;
        }
        if (!G.f(this, null, obj)) {
            return false;
        }
        z(this, false);
        return true;
    }

    public boolean f(Throwable th) {
        th.getClass();
        if (!G.f(this, null, new C7356pR2(th))) {
            return false;
        }
        z(this, false);
        return true;
    }

    public void g(Runnable runnable, Executor executor) {
        C7635qR2 c7635qR2;
        AbstractC5381iO2.c(runnable, "Runnable was null.");
        AbstractC5381iO2.c(executor, "Executor was null.");
        if (!isDone() && (c7635qR2 = this.C) != C7635qR2.d) {
            C7635qR2 c7635qR22 = new C7635qR2(runnable, executor);
            do {
                c7635qR22.c = c7635qR2;
                if (G.e(this, c7635qR2, c7635qR22)) {
                    return;
                } else {
                    c7635qR2 = this.C;
                }
            } while (c7635qR2 != C7635qR2.d);
        }
        A(runnable, executor);
    }

    public Object get() throws InterruptedException {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.B;
        if ((obj2 != null) && (!(obj2 instanceof RunnableC8192sR2))) {
            return b(obj2);
        }
        C9594xR2 c9594xR2 = this.D;
        if (c9594xR2 != C9594xR2.c) {
            C9594xR2 c9594xR22 = new C9594xR2();
            do {
                AbstractC6798nR2 abstractC6798nR2 = G;
                abstractC6798nR2.c(c9594xR22, c9594xR2);
                if (abstractC6798nR2.g(this, c9594xR2, c9594xR22)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            B(c9594xR22);
                            throw new InterruptedException();
                        }
                        obj = this.B;
                    } while (!((obj != null) & (!(obj instanceof RunnableC8192sR2))));
                    return b(obj);
                }
                c9594xR2 = this.D;
            } while (c9594xR2 != C9594xR2.c);
        }
        Object obj3 = this.B;
        obj3.getClass();
        return b(obj3);
    }

    public boolean isCancelled() {
        return this.B instanceof C7077oR2;
    }

    public boolean isDone() {
        return (this.B != null) & (!(r0 instanceof RunnableC8192sR2));
    }

    public final void t(Future future) {
        if ((future != null) && isCancelled()) {
            future.cancel(v());
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb.append(getClass().getSimpleName());
        } else {
            sb.append(getClass().getName());
        }
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            w(sb);
        } else {
            x(sb);
        }
        sb.append("]");
        return sb.toString();
    }

    public final boolean u(InterfaceFutureC8236sc0 interfaceFutureC8236sc0) {
        C7356pR2 c7356pR2;
        interfaceFutureC8236sc0.getClass();
        Object obj = this.B;
        if (obj == null) {
            if (interfaceFutureC8236sc0.isDone()) {
                if (!G.f(this, null, h(interfaceFutureC8236sc0))) {
                    return false;
                }
                z(this, false);
                return true;
            }
            RunnableC8192sR2 runnableC8192sR2 = new RunnableC8192sR2(this, interfaceFutureC8236sc0);
            if (G.f(this, null, runnableC8192sR2)) {
                try {
                    interfaceFutureC8236sc0.g(runnableC8192sR2, EnumC3993dS2.INSTANCE);
                } catch (Error | RuntimeException e) {
                    try {
                        c7356pR2 = new C7356pR2(e);
                    } catch (Error | RuntimeException unused) {
                        c7356pR2 = C7356pR2.b;
                    }
                    G.f(this, runnableC8192sR2, c7356pR2);
                }
                return true;
            }
            obj = this.B;
        }
        if (obj instanceof C7077oR2) {
            interfaceFutureC8236sc0.cancel(((C7077oR2) obj).a);
        }
        return false;
    }

    public final boolean v() {
        Object obj = this.B;
        return (obj instanceof C7077oR2) && ((C7077oR2) obj).a;
    }

    public final void w(StringBuilder sb) {
        try {
            Object objI = i(this);
            sb.append("SUCCESS, result=[");
            if (objI == null) {
                sb.append("null");
            } else if (objI == this) {
                sb.append("this future");
            } else {
                sb.append(objI.getClass().getName());
                sb.append("@");
                sb.append(Integer.toHexString(System.identityHashCode(objI)));
            }
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e2) {
            sb.append("FAILURE, cause=[");
            sb.append(e2.getCause());
            sb.append("]");
        }
    }

    public final void x(StringBuilder sb) {
        String strConcat;
        int length = sb.length();
        sb.append("PENDING");
        Object obj = this.B;
        if (obj instanceof RunnableC8192sR2) {
            sb.append(", setFuture=[");
            y(sb, ((RunnableC8192sR2) obj).C);
            sb.append("]");
        } else {
            try {
                strConcat = BO2.a(c());
            } catch (RuntimeException | StackOverflowError e) {
                strConcat = "Exception thrown from implementation: ".concat(String.valueOf(e.getClass()));
            }
            if (strConcat != null) {
                sb.append(", info=[");
                sb.append(strConcat);
                sb.append("]");
            }
        }
        if (isDone()) {
            sb.delete(length, sb.length());
            w(sb);
        }
    }

    public final void y(StringBuilder sb, Object obj) {
        try {
            if (obj == this) {
                sb.append("this future");
            } else {
                sb.append(obj);
            }
        } catch (RuntimeException e) {
            e = e;
            sb.append("Exception thrown from implementation: ");
            sb.append(e.getClass());
        } catch (StackOverflowError e2) {
            e = e2;
            sb.append("Exception thrown from implementation: ");
            sb.append(e.getClass());
        }
    }

    public Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j);
        if (!Thread.interrupted()) {
            Object obj = this.B;
            boolean z = true;
            if ((obj != null) & (!(obj instanceof RunnableC8192sR2))) {
                return b(obj);
            }
            long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                C9594xR2 c9594xR2 = this.D;
                if (c9594xR2 != C9594xR2.c) {
                    C9594xR2 c9594xR22 = new C9594xR2();
                    do {
                        AbstractC6798nR2 abstractC6798nR2 = G;
                        abstractC6798nR2.c(c9594xR22, c9594xR2);
                        if (abstractC6798nR2.g(this, c9594xR2, c9594xR22)) {
                            do {
                                LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.B;
                                    if ((obj2 != null) & (!(obj2 instanceof RunnableC8192sR2))) {
                                        return b(obj2);
                                    }
                                    nanos = jNanoTime - System.nanoTime();
                                } else {
                                    B(c9594xR22);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            B(c9594xR22);
                        } else {
                            c9594xR2 = this.D;
                        }
                    } while (c9594xR2 != C9594xR2.c);
                }
                Object obj3 = this.B;
                obj3.getClass();
                return b(obj3);
            }
            while (nanos > 0) {
                Object obj4 = this.B;
                if ((obj4 != null) & (!(obj4 instanceof RunnableC8192sR2))) {
                    return b(obj4);
                }
                if (!Thread.interrupted()) {
                    nanos = jNanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String string = toString();
            String string2 = timeUnit.toString();
            Locale locale = Locale.ROOT;
            String lowerCase = string2.toLowerCase(locale);
            String strConcat = "Waited " + j + " " + timeUnit.toString().toLowerCase(locale);
            if (nanos + 1000 < 0) {
                String strConcat2 = strConcat.concat(" (plus ");
                long j2 = -nanos;
                long jConvert = timeUnit.convert(j2, TimeUnit.NANOSECONDS);
                long nanos2 = j2 - timeUnit.toNanos(jConvert);
                if (jConvert != 0 && nanos2 <= 1000) {
                    z = false;
                }
                if (jConvert > 0) {
                    String strConcat3 = strConcat2 + jConvert + " " + lowerCase;
                    if (z) {
                        strConcat3 = strConcat3.concat(",");
                    }
                    strConcat2 = strConcat3.concat(" ");
                }
                if (z) {
                    strConcat2 = strConcat2 + nanos2 + " nanoseconds ";
                }
                strConcat = strConcat2.concat("delay)");
            }
            if (isDone()) {
                throw new TimeoutException(strConcat.concat(" but future completed as timeout expired"));
            }
            throw new TimeoutException(strConcat + " for " + string);
        }
        throw new InterruptedException();
    }

    public void d() {
    }

    public void s() {
    }
}
