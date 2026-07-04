package com.daaw;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.daaw.Oi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1791Oi {

    /* JADX INFO: renamed from: com.daaw.Oi$a */
    public static final class a {
        public Object a;
        public d b;
        public HI0 c = HI0.y();
        public boolean d;

        public void a() {
            this.a = null;
            this.b = null;
            this.c.u(null);
        }

        public boolean b(Object obj) {
            this.d = true;
            d dVar = this.b;
            boolean z = dVar != null && dVar.b(obj);
            if (z) {
                d();
            }
            return z;
        }

        public boolean c() {
            this.d = true;
            d dVar = this.b;
            boolean z = dVar != null && dVar.a(true);
            if (z) {
                d();
            }
            return z;
        }

        public final void d() {
            this.a = null;
            this.b = null;
            this.c = null;
        }

        public boolean e(Throwable th) {
            this.d = true;
            d dVar = this.b;
            boolean z = dVar != null && dVar.c(th);
            if (z) {
                d();
            }
            return z;
        }

        public void finalize() {
            HI0 hi0;
            d dVar = this.b;
            if (dVar != null && !dVar.isDone()) {
                dVar.c(new b("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.a));
            }
            if (this.d || (hi0 = this.c) == null) {
                return;
            }
            hi0.u(null);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Oi$b */
    public static final class b extends Throwable {
        public b(String str) {
            super(str);
        }

        @Override // java.lang.Throwable
        public synchronized Throwable fillInStackTrace() {
            return this;
        }
    }

    /* JADX INFO: renamed from: com.daaw.Oi$c */
    public interface c {
        Object a(a aVar);
    }

    /* JADX INFO: renamed from: com.daaw.Oi$d */
    public static final class d implements InterfaceFutureC8236sc0 {
        public final WeakReference B;
        public final AbstractC5272i0 C = new a();

        /* JADX INFO: renamed from: com.daaw.Oi$d$a */
        public class a extends AbstractC5272i0 {
            public a() {
            }

            @Override // com.daaw.AbstractC5272i0
            public String r() {
                a aVar = (a) d.this.B.get();
                if (aVar == null) {
                    return "Completer object has been garbage collected, future will fail soon";
                }
                return "tag=[" + aVar.a + "]";
            }
        }

        public d(a aVar) {
            this.B = new WeakReference(aVar);
        }

        public boolean a(boolean z) {
            return this.C.cancel(z);
        }

        public boolean b(Object obj) {
            return this.C.u(obj);
        }

        public boolean c(Throwable th) {
            return this.C.v(th);
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean z) {
            a aVar = (a) this.B.get();
            boolean zCancel = this.C.cancel(z);
            if (zCancel && aVar != null) {
                aVar.a();
            }
            return zCancel;
        }

        @Override // com.daaw.InterfaceFutureC8236sc0
        public void g(Runnable runnable, Executor executor) {
            this.C.g(runnable, executor);
        }

        @Override // java.util.concurrent.Future
        public Object get() {
            return this.C.get();
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            return this.C.isCancelled();
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            return this.C.isDone();
        }

        public String toString() {
            return this.C.toString();
        }

        @Override // java.util.concurrent.Future
        public Object get(long j, TimeUnit timeUnit) {
            return this.C.get(j, timeUnit);
        }
    }

    public static InterfaceFutureC8236sc0 a(c cVar) {
        a aVar = new a();
        d dVar = new d(aVar);
        aVar.b = dVar;
        aVar.a = cVar.getClass();
        try {
            Object objA = cVar.a(aVar);
            if (objA != null) {
                aVar.a = objA;
                return dVar;
            }
        } catch (Exception e) {
            dVar.c(e);
        }
        return dVar;
    }
}
