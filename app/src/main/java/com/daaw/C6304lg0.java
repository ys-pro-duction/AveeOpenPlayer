package com.daaw;

import j$.util.concurrent.ConcurrentHashMap;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

/* JADX INFO: renamed from: com.daaw.lg0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6304lg0 extends AbstractC8460tP {
    public static final ReferenceQueue c = new ReferenceQueue();
    public static final ConcurrentMap d = new ConcurrentHashMap();
    public static final Logger e = Logger.getLogger(C6304lg0.class.getName());
    public final a b;

    /* JADX INFO: renamed from: com.daaw.lg0$a */
    public static final class a extends WeakReference {
        public static final boolean f = Boolean.parseBoolean(System.getProperty("io.grpc.ManagedChannel.enableAllocationTracking", "true"));
        public static final RuntimeException g = e();
        public final ReferenceQueue a;
        public final ConcurrentMap b;
        public final String c;
        public final Reference d;
        public final AtomicBoolean e;

        public a(C6304lg0 c6304lg0, AbstractC5178hg0 abstractC5178hg0, ReferenceQueue referenceQueue, ConcurrentMap concurrentMap) {
            super(c6304lg0, referenceQueue);
            this.e = new AtomicBoolean();
            this.d = new SoftReference(f ? new RuntimeException("ManagedChannel allocation site") : g);
            this.c = abstractC5178hg0.toString();
            this.a = referenceQueue;
            this.b = concurrentMap;
            concurrentMap.put(this, this);
            b(referenceQueue);
        }

        public static int b(ReferenceQueue referenceQueue) {
            int i = 0;
            while (true) {
                a aVar = (a) referenceQueue.poll();
                if (aVar == null) {
                    return i;
                }
                RuntimeException runtimeException = (RuntimeException) aVar.d.get();
                aVar.c();
                if (!aVar.e.get()) {
                    i++;
                    Level level = Level.SEVERE;
                    if (C6304lg0.e.isLoggable(level)) {
                        LogRecord logRecord = new LogRecord(level, "*~*~*~ Previous channel {0} was not shutdown properly!!! ~*~*~*" + System.getProperty("line.separator") + "    Make sure to call shutdown()/shutdownNow() and wait until awaitTermination() returns true.");
                        logRecord.setLoggerName(C6304lg0.e.getName());
                        logRecord.setParameters(new Object[]{aVar.c});
                        logRecord.setThrown(runtimeException);
                        C6304lg0.e.log(logRecord);
                    }
                }
            }
        }

        public static RuntimeException e() {
            RuntimeException runtimeException = new RuntimeException("ManagedChannel allocation site not recorded.  Set -Dio.grpc.ManagedChannel.enableAllocationTracking=true to enable it");
            runtimeException.setStackTrace(new StackTraceElement[0]);
            return runtimeException;
        }

        public final void c() {
            super.clear();
            this.b.remove(this);
            this.d.clear();
        }

        @Override // java.lang.ref.Reference
        public void clear() {
            c();
            b(this.a);
        }

        public final void d() {
            if (this.e.getAndSet(true)) {
                return;
            }
            clear();
        }
    }

    public C6304lg0(AbstractC5178hg0 abstractC5178hg0) {
        this(abstractC5178hg0, c, d);
    }

    @Override // com.daaw.AbstractC8460tP, com.daaw.AbstractC5178hg0
    public AbstractC5178hg0 l() {
        this.b.d();
        return super.l();
    }

    public C6304lg0(AbstractC5178hg0 abstractC5178hg0, ReferenceQueue referenceQueue, ConcurrentMap concurrentMap) {
        super(abstractC5178hg0);
        this.b = new a(this, abstractC5178hg0, referenceQueue, concurrentMap);
    }
}
