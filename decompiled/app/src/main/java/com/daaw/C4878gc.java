package com.daaw;

import com.daaw.AbstractC0304Ac0;
import com.daaw.AbstractC2560Vm0;
import com.daaw.AbstractC3983dQ0;
import com.daaw.AbstractC6323lk;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.gc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4878gc {
    public final C0512Cc0 a;
    public final String b;

    /* JADX INFO: renamed from: com.daaw.gc$b */
    public final class b {
        public final AbstractC0304Ac0.d a;
        public AbstractC0304Ac0 b;
        public AbstractC0408Bc0 c;

        public b(AbstractC0304Ac0.d dVar) {
            this.a = dVar;
            AbstractC0408Bc0 abstractC0408Bc0D = C4878gc.this.a.d(C4878gc.this.b);
            this.c = abstractC0408Bc0D;
            if (abstractC0408Bc0D != null) {
                this.b = abstractC0408Bc0D.a(dVar);
                return;
            }
            throw new IllegalStateException("Could not find policy '" + C4878gc.this.b + "'. Make sure its implementation is either registered to LoadBalancerRegistry or included in META-INF/services/io.grpc.LoadBalancerProvider from your jar files.");
        }

        public AbstractC0304Ac0 a() {
            return this.b;
        }

        public void b(C6262lX0 c6262lX0) {
            a().c(c6262lX0);
        }

        public void c() {
            a().e();
        }

        public void d() {
            this.b.f();
            this.b = null;
        }

        public boolean e(AbstractC0304Ac0.g gVar) {
            AbstractC3983dQ0.b bVar = (AbstractC3983dQ0.b) gVar.c();
            if (bVar == null) {
                try {
                    C4878gc c4878gc = C4878gc.this;
                    bVar = new AbstractC3983dQ0.b(c4878gc.d(c4878gc.b, "using default policy"), null);
                } catch (f e) {
                    this.a.f(EnumC1304Jq.TRANSIENT_FAILURE, new d(C6262lX0.t.q(e.getMessage())));
                    this.b.f();
                    this.c = null;
                    this.b = new e();
                    return true;
                }
            }
            if (this.c == null || !bVar.a.b().equals(this.c.b())) {
                this.a.f(EnumC1304Jq.CONNECTING, new c());
                this.b.f();
                AbstractC0408Bc0 abstractC0408Bc0 = bVar.a;
                this.c = abstractC0408Bc0;
                AbstractC0304Ac0 abstractC0304Ac0 = this.b;
                this.b = abstractC0408Bc0.a(this.a);
                this.a.b().b(AbstractC6323lk.a.INFO, "Load balancer changed from {0} to {1}", abstractC0304Ac0.getClass().getSimpleName(), this.b.getClass().getSimpleName());
            }
            Object obj = bVar.b;
            if (obj != null) {
                this.a.b().b(AbstractC6323lk.a.DEBUG, "Load-balancing config: {0}", bVar.b);
            }
            return a().a(AbstractC0304Ac0.g.d().b(gVar.a()).c(gVar.b()).d(obj).a());
        }
    }

    /* JADX INFO: renamed from: com.daaw.gc$c */
    public static final class c extends AbstractC0304Ac0.i {
        public c() {
        }

        @Override // com.daaw.AbstractC0304Ac0.i
        public AbstractC0304Ac0.e a(AbstractC0304Ac0.f fVar) {
            return AbstractC0304Ac0.e.g();
        }

        public String toString() {
            return AbstractC6329ll0.a(c.class).toString();
        }
    }

    /* JADX INFO: renamed from: com.daaw.gc$d */
    public static final class d extends AbstractC0304Ac0.i {
        public final C6262lX0 a;

        public d(C6262lX0 c6262lX0) {
            this.a = c6262lX0;
        }

        @Override // com.daaw.AbstractC0304Ac0.i
        public AbstractC0304Ac0.e a(AbstractC0304Ac0.f fVar) {
            return AbstractC0304Ac0.e.f(this.a);
        }
    }

    /* JADX INFO: renamed from: com.daaw.gc$f */
    public static final class f extends Exception {
        public f(String str) {
            super(str);
        }
    }

    public C4878gc(String str) {
        this(C0512Cc0.b(), str);
    }

    public final AbstractC0408Bc0 d(String str, String str2) throws f {
        AbstractC0408Bc0 abstractC0408Bc0D = this.a.d(str);
        if (abstractC0408Bc0D != null) {
            return abstractC0408Bc0D;
        }
        throw new f("Trying to load '" + str + "' because " + str2 + ", but it's unavailable");
    }

    public b e(AbstractC0304Ac0.d dVar) {
        return new b(dVar);
    }

    public AbstractC2560Vm0.b f(Map map) {
        List listA;
        if (map != null) {
            try {
                listA = AbstractC3983dQ0.A(AbstractC3983dQ0.g(map));
            } catch (RuntimeException e2) {
                return AbstractC2560Vm0.b.b(C6262lX0.h.q("can't parse load balancer configuration").p(e2));
            }
        } else {
            listA = null;
        }
        if (listA == null || listA.isEmpty()) {
            return null;
        }
        return AbstractC3983dQ0.y(listA, this.a);
    }

    public C4878gc(C0512Cc0 c0512Cc0, String str) {
        this.a = (C0512Cc0) AbstractC7785qy0.o(c0512Cc0, "registry");
        this.b = (String) AbstractC7785qy0.o(str, "defaultPolicy");
    }

    /* JADX INFO: renamed from: com.daaw.gc$e */
    public static final class e extends AbstractC0304Ac0 {
        public e() {
        }

        @Override // com.daaw.AbstractC0304Ac0
        public boolean a(AbstractC0304Ac0.g gVar) {
            return true;
        }

        @Override // com.daaw.AbstractC0304Ac0
        public void f() {
        }

        @Override // com.daaw.AbstractC0304Ac0
        public void c(C6262lX0 c6262lX0) {
        }

        @Override // com.daaw.AbstractC0304Ac0
        public void d(AbstractC0304Ac0.g gVar) {
        }
    }
}
