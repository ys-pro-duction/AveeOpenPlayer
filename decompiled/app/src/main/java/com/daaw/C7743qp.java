package com.daaw;

import com.daaw.AbstractC0960Gi;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.daaw.qp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7743qp extends AbstractC0960Gi {
    public final AbstractC0960Gi a;
    public final AbstractC0960Gi b;

    /* JADX INFO: renamed from: com.daaw.qp$a */
    public static final class a extends AbstractC0960Gi.a {
        public final AbstractC0960Gi.a a;
        public final C2756Xj0 b;

        public a(AbstractC0960Gi.a aVar, C2756Xj0 c2756Xj0) {
            this.a = aVar;
            this.b = c2756Xj0;
        }

        @Override // com.daaw.AbstractC0960Gi.a
        public void a(C2756Xj0 c2756Xj0) {
            AbstractC7785qy0.o(c2756Xj0, "headers");
            C2756Xj0 c2756Xj02 = new C2756Xj0();
            c2756Xj02.m(this.b);
            c2756Xj02.m(c2756Xj0);
            this.a.a(c2756Xj02);
        }

        @Override // com.daaw.AbstractC0960Gi.a
        public void b(C6262lX0 c6262lX0) {
            this.a.b(c6262lX0);
        }
    }

    /* JADX INFO: renamed from: com.daaw.qp$b */
    public final class b extends AbstractC0960Gi.a {
        public final AbstractC0960Gi.b a;
        public final Executor b;
        public final AbstractC0960Gi.a c;
        public final C8594ts d;

        public b(AbstractC0960Gi.b bVar, Executor executor, AbstractC0960Gi.a aVar, C8594ts c8594ts) {
            this.a = bVar;
            this.b = executor;
            this.c = (AbstractC0960Gi.a) AbstractC7785qy0.o(aVar, "delegate");
            this.d = (C8594ts) AbstractC7785qy0.o(c8594ts, "context");
        }

        @Override // com.daaw.AbstractC0960Gi.a
        public void a(C2756Xj0 c2756Xj0) {
            AbstractC7785qy0.o(c2756Xj0, "headers");
            C8594ts c8594tsB = this.d.b();
            try {
                C7743qp.this.b.a(this.a, this.b, new a(this.c, c2756Xj0));
            } finally {
                this.d.f(c8594tsB);
            }
        }

        @Override // com.daaw.AbstractC0960Gi.a
        public void b(C6262lX0 c6262lX0) {
            this.c.b(c6262lX0);
        }
    }

    public C7743qp(AbstractC0960Gi abstractC0960Gi, AbstractC0960Gi abstractC0960Gi2) {
        this.a = (AbstractC0960Gi) AbstractC7785qy0.o(abstractC0960Gi, "creds1");
        this.b = (AbstractC0960Gi) AbstractC7785qy0.o(abstractC0960Gi2, "creds2");
    }

    @Override // com.daaw.AbstractC0960Gi
    public void a(AbstractC0960Gi.b bVar, Executor executor, AbstractC0960Gi.a aVar) {
        this.a.a(bVar, executor, new b(bVar, executor, aVar, C8594ts.e()));
    }
}
