package com.daaw;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

/* JADX INFO: renamed from: com.daaw.Rj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2129Rj implements InterfaceC6828nZ0 {
    public final ArrayDeque a = new ArrayDeque();
    public final ArrayDeque b;
    public final PriorityQueue c;
    public b d;
    public long e;
    public long f;

    /* JADX INFO: renamed from: com.daaw.Rj$b */
    public static final class b extends C7665qZ0 implements Comparable {
        public long H;

        public b() {
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
        public int compareTo(b bVar) {
            if (p() != bVar.p()) {
                return p() ? 1 : -1;
            }
            long j = this.E - bVar.E;
            if (j == 0) {
                j = this.H - bVar.H;
                if (j == 0) {
                    return 0;
                }
            }
            return j > 0 ? 1 : -1;
        }
    }

    /* JADX INFO: renamed from: com.daaw.Rj$c */
    public final class c extends AbstractC7943rZ0 {
        public c() {
        }

        @Override // com.daaw.AbstractC7943rZ0
        public final void s() {
            AbstractC2129Rj.this.m(this);
        }
    }

    public AbstractC2129Rj() {
        int i = 0;
        while (true) {
            if (i >= 10) {
                break;
            }
            this.a.add(new b());
            i++;
        }
        this.b = new ArrayDeque();
        for (int i2 = 0; i2 < 2; i2++) {
            this.b.add(new c());
        }
        this.c = new PriorityQueue();
    }

    @Override // com.daaw.InterfaceC6828nZ0
    public void b(long j) {
        this.e = j;
    }

    public abstract InterfaceC6549mZ0 f();

    @Override // com.daaw.InterfaceC0808Ew
    public void flush() {
        this.f = 0L;
        this.e = 0L;
        while (!this.c.isEmpty()) {
            l((b) this.c.poll());
        }
        b bVar = this.d;
        if (bVar != null) {
            l(bVar);
            this.d = null;
        }
    }

    public abstract void g(C7665qZ0 c7665qZ0);

    @Override // com.daaw.InterfaceC0808Ew
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public C7665qZ0 d() {
        AbstractC7115ob.f(this.d == null);
        if (this.a.isEmpty()) {
            return null;
        }
        b bVar = (b) this.a.pollFirst();
        this.d = bVar;
        return bVar;
    }

    @Override // com.daaw.InterfaceC0808Ew
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public AbstractC7943rZ0 c() {
        if (this.b.isEmpty()) {
            return null;
        }
        while (!this.c.isEmpty() && ((b) this.c.peek()).E <= this.e) {
            b bVar = (b) this.c.poll();
            if (bVar.p()) {
                AbstractC7943rZ0 abstractC7943rZ0 = (AbstractC7943rZ0) this.b.pollFirst();
                abstractC7943rZ0.k(4);
                l(bVar);
                return abstractC7943rZ0;
            }
            g(bVar);
            if (j()) {
                InterfaceC6549mZ0 interfaceC6549mZ0F = f();
                if (!bVar.o()) {
                    AbstractC7943rZ0 abstractC7943rZ02 = (AbstractC7943rZ0) this.b.pollFirst();
                    abstractC7943rZ02.t(bVar.E, interfaceC6549mZ0F, Long.MAX_VALUE);
                    l(bVar);
                    return abstractC7943rZ02;
                }
            }
            l(bVar);
        }
        return null;
    }

    public abstract boolean j();

    @Override // com.daaw.InterfaceC0808Ew
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public void e(C7665qZ0 c7665qZ0) {
        AbstractC7115ob.a(c7665qZ0 == this.d);
        if (c7665qZ0.o()) {
            l(this.d);
        } else {
            b bVar = this.d;
            long j = this.f;
            this.f = 1 + j;
            bVar.H = j;
            this.c.add(this.d);
        }
        this.d = null;
    }

    public final void l(b bVar) {
        bVar.l();
        this.a.add(bVar);
    }

    public void m(AbstractC7943rZ0 abstractC7943rZ0) {
        abstractC7943rZ0.l();
        this.b.add(abstractC7943rZ0);
    }

    @Override // com.daaw.InterfaceC0808Ew
    public void a() {
    }
}
