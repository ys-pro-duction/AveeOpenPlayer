package com.daaw;

import com.daaw.AbstractC0304Ac0;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.daaw.uu0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8884uu0 extends AbstractC0304Ac0 {
    public final AbstractC0304Ac0.d c;
    public AbstractC0304Ac0.h d;

    /* JADX INFO: renamed from: com.daaw.uu0$a */
    public class a implements AbstractC0304Ac0.j {
        public final /* synthetic */ AbstractC0304Ac0.h a;

        public a(AbstractC0304Ac0.h hVar) {
            this.a = hVar;
        }

        @Override // com.daaw.AbstractC0304Ac0.j
        public void a(C1408Kq c1408Kq) {
            C8884uu0.this.i(this.a, c1408Kq);
        }
    }

    /* JADX INFO: renamed from: com.daaw.uu0$b */
    public static /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[EnumC1304Jq.values().length];
            a = iArr;
            try {
                iArr[EnumC1304Jq.IDLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[EnumC1304Jq.CONNECTING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[EnumC1304Jq.READY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[EnumC1304Jq.TRANSIENT_FAILURE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.uu0$c */
    public static final class c extends AbstractC0304Ac0.i {
        public final AbstractC0304Ac0.e a;

        public c(AbstractC0304Ac0.e eVar) {
            this.a = (AbstractC0304Ac0.e) AbstractC7785qy0.o(eVar, "result");
        }

        @Override // com.daaw.AbstractC0304Ac0.i
        public AbstractC0304Ac0.e a(AbstractC0304Ac0.f fVar) {
            return this.a;
        }

        public String toString() {
            return AbstractC6329ll0.a(c.class).d("result", this.a).toString();
        }
    }

    /* JADX INFO: renamed from: com.daaw.uu0$d */
    public final class d extends AbstractC0304Ac0.i {
        public final AbstractC0304Ac0.h a;
        public final AtomicBoolean b = new AtomicBoolean(false);

        /* JADX INFO: renamed from: com.daaw.uu0$d$a */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                d.this.a.e();
            }
        }

        public d(AbstractC0304Ac0.h hVar) {
            this.a = (AbstractC0304Ac0.h) AbstractC7785qy0.o(hVar, "subchannel");
        }

        @Override // com.daaw.AbstractC0304Ac0.i
        public AbstractC0304Ac0.e a(AbstractC0304Ac0.f fVar) {
            if (this.b.compareAndSet(false, true)) {
                C8884uu0.this.c.d().execute(new a());
            }
            return AbstractC0304Ac0.e.g();
        }
    }

    public C8884uu0(AbstractC0304Ac0.d dVar) {
        this.c = (AbstractC0304Ac0.d) AbstractC7785qy0.o(dVar, "helper");
    }

    @Override // com.daaw.AbstractC0304Ac0
    public boolean a(AbstractC0304Ac0.g gVar) {
        List listA = gVar.a();
        if (listA.isEmpty()) {
            c(C6262lX0.u.q("NameResolver returned no usable address. addrs=" + gVar.a() + ", attrs=" + gVar.b()));
            return false;
        }
        AbstractC0304Ac0.h hVar = this.d;
        if (hVar != null) {
            hVar.h(listA);
            return true;
        }
        AbstractC0304Ac0.h hVarA = this.c.a(AbstractC0304Ac0.b.c().e(listA).b());
        hVarA.g(new a(hVarA));
        this.d = hVarA;
        this.c.f(EnumC1304Jq.CONNECTING, new c(AbstractC0304Ac0.e.h(hVarA)));
        hVarA.e();
        return true;
    }

    @Override // com.daaw.AbstractC0304Ac0
    public void c(C6262lX0 c6262lX0) {
        AbstractC0304Ac0.h hVar = this.d;
        if (hVar != null) {
            hVar.f();
            this.d = null;
        }
        this.c.f(EnumC1304Jq.TRANSIENT_FAILURE, new c(AbstractC0304Ac0.e.f(c6262lX0)));
    }

    @Override // com.daaw.AbstractC0304Ac0
    public void e() {
        AbstractC0304Ac0.h hVar = this.d;
        if (hVar != null) {
            hVar.e();
        }
    }

    @Override // com.daaw.AbstractC0304Ac0
    public void f() {
        AbstractC0304Ac0.h hVar = this.d;
        if (hVar != null) {
            hVar.f();
        }
    }

    public final void i(AbstractC0304Ac0.h hVar, C1408Kq c1408Kq) {
        AbstractC0304Ac0.i dVar;
        AbstractC0304Ac0.i cVar;
        EnumC1304Jq enumC1304JqC = c1408Kq.c();
        if (enumC1304JqC == EnumC1304Jq.SHUTDOWN) {
            return;
        }
        if (c1408Kq.c() == EnumC1304Jq.TRANSIENT_FAILURE || c1408Kq.c() == EnumC1304Jq.IDLE) {
            this.c.e();
        }
        int i = b.a[enumC1304JqC.ordinal()];
        if (i != 1) {
            if (i == 2) {
                cVar = new c(AbstractC0304Ac0.e.g());
            } else if (i == 3) {
                dVar = new c(AbstractC0304Ac0.e.h(hVar));
            } else {
                if (i != 4) {
                    throw new IllegalArgumentException("Unsupported state:" + enumC1304JqC);
                }
                cVar = new c(AbstractC0304Ac0.e.f(c1408Kq.d()));
            }
            this.c.f(enumC1304JqC, cVar);
        }
        dVar = new d(hVar);
        cVar = dVar;
        this.c.f(enumC1304JqC, cVar);
    }
}
