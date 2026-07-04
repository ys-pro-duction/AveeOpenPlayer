package com.daaw;

import com.daaw.AbstractC0304Ac0;

/* JADX INFO: loaded from: classes3.dex */
public final class GT extends AbstractC7902rP {
    public static final AbstractC0304Ac0.i l = new c();
    public final AbstractC0304Ac0 c;
    public final AbstractC0304Ac0.d d;
    public AbstractC0304Ac0.c e;
    public AbstractC0304Ac0 f;
    public AbstractC0304Ac0.c g;
    public AbstractC0304Ac0 h;
    public EnumC1304Jq i;
    public AbstractC0304Ac0.i j;
    public boolean k;

    public class b extends AbstractC8181sP {
        public AbstractC0304Ac0 a;

        public b() {
        }

        @Override // com.daaw.AbstractC0304Ac0.d
        public void f(EnumC1304Jq enumC1304Jq, AbstractC0304Ac0.i iVar) {
            if (this.a == GT.this.h) {
                AbstractC7785qy0.u(GT.this.k, "there's pending lb while current lb has been out of READY");
                GT.this.i = enumC1304Jq;
                GT.this.j = iVar;
                if (enumC1304Jq == EnumC1304Jq.READY) {
                    GT.this.q();
                    return;
                }
                return;
            }
            if (this.a == GT.this.f) {
                GT.this.k = enumC1304Jq == EnumC1304Jq.READY;
                if (GT.this.k || GT.this.h == GT.this.c) {
                    GT.this.d.f(enumC1304Jq, iVar);
                } else {
                    GT.this.q();
                }
            }
        }

        @Override // com.daaw.AbstractC8181sP
        public AbstractC0304Ac0.d g() {
            return GT.this.d;
        }
    }

    public class c extends AbstractC0304Ac0.i {
        @Override // com.daaw.AbstractC0304Ac0.i
        public AbstractC0304Ac0.e a(AbstractC0304Ac0.f fVar) {
            return AbstractC0304Ac0.e.g();
        }

        public String toString() {
            return "BUFFER_PICKER";
        }
    }

    public GT(AbstractC0304Ac0.d dVar) {
        a aVar = new a();
        this.c = aVar;
        this.f = aVar;
        this.h = aVar;
        this.d = (AbstractC0304Ac0.d) AbstractC7785qy0.o(dVar, "helper");
    }

    @Override // com.daaw.AbstractC0304Ac0
    public void f() {
        this.h.f();
        this.f.f();
    }

    @Override // com.daaw.AbstractC7902rP
    public AbstractC0304Ac0 g() {
        AbstractC0304Ac0 abstractC0304Ac0 = this.h;
        return abstractC0304Ac0 == this.c ? this.f : abstractC0304Ac0;
    }

    public final void q() {
        this.d.f(this.i, this.j);
        this.f.f();
        this.f = this.h;
        this.e = this.g;
        this.h = this.c;
        this.g = null;
    }

    public void r(AbstractC0304Ac0.c cVar) {
        AbstractC7785qy0.o(cVar, "newBalancerFactory");
        if (cVar.equals(this.g)) {
            return;
        }
        this.h.f();
        this.h = this.c;
        this.g = null;
        this.i = EnumC1304Jq.CONNECTING;
        this.j = l;
        if (cVar.equals(this.e)) {
            return;
        }
        b bVar = new b();
        AbstractC0304Ac0 abstractC0304Ac0A = cVar.a(bVar);
        bVar.a = abstractC0304Ac0A;
        this.h = abstractC0304Ac0A;
        this.g = cVar;
        if (this.k) {
            return;
        }
        q();
    }

    public class a extends AbstractC0304Ac0 {

        /* JADX INFO: renamed from: com.daaw.GT$a$a, reason: collision with other inner class name */
        public class C0062a extends AbstractC0304Ac0.i {
            public final /* synthetic */ C6262lX0 a;

            public C0062a(C6262lX0 c6262lX0) {
                this.a = c6262lX0;
            }

            @Override // com.daaw.AbstractC0304Ac0.i
            public AbstractC0304Ac0.e a(AbstractC0304Ac0.f fVar) {
                return AbstractC0304Ac0.e.f(this.a);
            }

            public String toString() {
                return AbstractC6329ll0.a(C0062a.class).d("error", this.a).toString();
            }
        }

        public a() {
        }

        @Override // com.daaw.AbstractC0304Ac0
        public void c(C6262lX0 c6262lX0) {
            GT.this.d.f(EnumC1304Jq.TRANSIENT_FAILURE, new C0062a(c6262lX0));
        }

        @Override // com.daaw.AbstractC0304Ac0
        public void d(AbstractC0304Ac0.g gVar) {
            throw new IllegalStateException("GracefulSwitchLoadBalancer must switch to a load balancing policy before handling ResolvedAddresses");
        }

        @Override // com.daaw.AbstractC0304Ac0
        public void f() {
        }
    }
}
