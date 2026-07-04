package com.daaw;

import j$.util.DesugarCollections;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: renamed from: com.daaw.Vm0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2560Vm0 {

    /* JADX INFO: renamed from: com.daaw.Vm0$a */
    public static final class a {
        public final int a;
        public final InterfaceC8405tB0 b;
        public final ExecutorC3034a01 c;
        public final f d;
        public final ScheduledExecutorService e;
        public final AbstractC6323lk f;
        public final Executor g;
        public final String h;

        /* JADX INFO: renamed from: com.daaw.Vm0$a$a, reason: collision with other inner class name */
        public static final class C0127a {
            public Integer a;
            public InterfaceC8405tB0 b;
            public ExecutorC3034a01 c;
            public f d;
            public ScheduledExecutorService e;
            public AbstractC6323lk f;
            public Executor g;
            public String h;

            public a a() {
                return new a(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, null);
            }

            public C0127a b(AbstractC6323lk abstractC6323lk) {
                this.f = (AbstractC6323lk) AbstractC7785qy0.n(abstractC6323lk);
                return this;
            }

            public C0127a c(int i) {
                this.a = Integer.valueOf(i);
                return this;
            }

            public C0127a d(Executor executor) {
                this.g = executor;
                return this;
            }

            public C0127a e(String str) {
                this.h = str;
                return this;
            }

            public C0127a f(InterfaceC8405tB0 interfaceC8405tB0) {
                this.b = (InterfaceC8405tB0) AbstractC7785qy0.n(interfaceC8405tB0);
                return this;
            }

            public C0127a g(ScheduledExecutorService scheduledExecutorService) {
                this.e = (ScheduledExecutorService) AbstractC7785qy0.n(scheduledExecutorService);
                return this;
            }

            public C0127a h(f fVar) {
                this.d = (f) AbstractC7785qy0.n(fVar);
                return this;
            }

            public C0127a i(ExecutorC3034a01 executorC3034a01) {
                this.c = (ExecutorC3034a01) AbstractC7785qy0.n(executorC3034a01);
                return this;
            }
        }

        public /* synthetic */ a(Integer num, InterfaceC8405tB0 interfaceC8405tB0, ExecutorC3034a01 executorC3034a01, f fVar, ScheduledExecutorService scheduledExecutorService, AbstractC6323lk abstractC6323lk, Executor executor, String str, AbstractC2456Um0 abstractC2456Um0) {
            this(num, interfaceC8405tB0, executorC3034a01, fVar, scheduledExecutorService, abstractC6323lk, executor, str);
        }

        public static C0127a f() {
            return new C0127a();
        }

        public int a() {
            return this.a;
        }

        public Executor b() {
            return this.g;
        }

        public InterfaceC8405tB0 c() {
            return this.b;
        }

        public f d() {
            return this.d;
        }

        public ExecutorC3034a01 e() {
            return this.c;
        }

        public String toString() {
            return AbstractC6329ll0.b(this).b("defaultPort", this.a).d("proxyDetector", this.b).d("syncContext", this.c).d("serviceConfigParser", this.d).d("scheduledExecutorService", this.e).d("channelLogger", this.f).d("executor", this.g).d("overrideAuthority", this.h).toString();
        }

        public a(Integer num, InterfaceC8405tB0 interfaceC8405tB0, ExecutorC3034a01 executorC3034a01, f fVar, ScheduledExecutorService scheduledExecutorService, AbstractC6323lk abstractC6323lk, Executor executor, String str) {
            this.a = ((Integer) AbstractC7785qy0.o(num, "defaultPort not set")).intValue();
            this.b = (InterfaceC8405tB0) AbstractC7785qy0.o(interfaceC8405tB0, "proxyDetector not set");
            this.c = (ExecutorC3034a01) AbstractC7785qy0.o(executorC3034a01, "syncContext not set");
            this.d = (f) AbstractC7785qy0.o(fVar, "serviceConfigParser not set");
            this.e = scheduledExecutorService;
            this.f = abstractC6323lk;
            this.g = executor;
            this.h = str;
        }
    }

    /* JADX INFO: renamed from: com.daaw.Vm0$c */
    public static abstract class c {
        public abstract String a();

        public abstract AbstractC2560Vm0 b(URI uri, a aVar);
    }

    /* JADX INFO: renamed from: com.daaw.Vm0$d */
    public static abstract class d {
        public abstract void a(C6262lX0 c6262lX0);

        public abstract void b(e eVar);
    }

    /* JADX INFO: renamed from: com.daaw.Vm0$e */
    public static final class e {
        public final List a;
        public final C1971Qb b;
        public final b c;

        /* JADX INFO: renamed from: com.daaw.Vm0$e$a */
        public static final class a {
            public List a = Collections.EMPTY_LIST;
            public C1971Qb b = C1971Qb.c;
            public b c;

            public e a() {
                return new e(this.a, this.b, this.c);
            }

            public a b(List list) {
                this.a = list;
                return this;
            }

            public a c(C1971Qb c1971Qb) {
                this.b = c1971Qb;
                return this;
            }

            public a d(b bVar) {
                this.c = bVar;
                return this;
            }
        }

        public e(List list, C1971Qb c1971Qb, b bVar) {
            this.a = DesugarCollections.unmodifiableList(new ArrayList(list));
            this.b = (C1971Qb) AbstractC7785qy0.o(c1971Qb, "attributes");
            this.c = bVar;
        }

        public static a d() {
            return new a();
        }

        public List a() {
            return this.a;
        }

        public C1971Qb b() {
            return this.b;
        }

        public b c() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return AbstractC8301sp0.a(this.a, eVar.a) && AbstractC8301sp0.a(this.b, eVar.b) && AbstractC8301sp0.a(this.c, eVar.c);
        }

        public int hashCode() {
            return AbstractC8301sp0.b(this.a, this.b, this.c);
        }

        public String toString() {
            return AbstractC6329ll0.b(this).d("addresses", this.a).d("attributes", this.b).d("serviceConfig", this.c).toString();
        }
    }

    /* JADX INFO: renamed from: com.daaw.Vm0$f */
    public static abstract class f {
        public abstract b a(Map map);
    }

    public abstract String a();

    public abstract void b();

    public abstract void c();

    public abstract void d(d dVar);

    /* JADX INFO: renamed from: com.daaw.Vm0$b */
    public static final class b {
        public final C6262lX0 a;
        public final Object b;

        public b(Object obj) {
            this.b = AbstractC7785qy0.o(obj, "config");
            this.a = null;
        }

        public static b a(Object obj) {
            return new b(obj);
        }

        public static b b(C6262lX0 c6262lX0) {
            return new b(c6262lX0);
        }

        public Object c() {
            return this.b;
        }

        public C6262lX0 d() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && b.class == obj.getClass()) {
                b bVar = (b) obj;
                if (AbstractC8301sp0.a(this.a, bVar.a) && AbstractC8301sp0.a(this.b, bVar.b)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return AbstractC8301sp0.b(this.a, this.b);
        }

        public String toString() {
            return this.b != null ? AbstractC6329ll0.b(this).d("config", this.b).toString() : AbstractC6329ll0.b(this).d("error", this.a).toString();
        }

        public b(C6262lX0 c6262lX0) {
            this.b = null;
            this.a = (C6262lX0) AbstractC7785qy0.o(c6262lX0, "status");
            AbstractC7785qy0.j(!c6262lX0.o(), "cannot use OK status: %s", c6262lX0);
        }
    }
}
