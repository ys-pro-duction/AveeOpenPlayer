package com.daaw;

import com.daaw.AbstractC4512fJ0;
import com.daaw.InterfaceC4684ft;
import com.daaw.InterfaceC5203hl0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.Pg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1887Pg implements InterfaceC5203hl0 {
    public final LQ B;
    public Throwable D;
    public final Object C = new Object();
    public List E = new ArrayList();
    public List F = new ArrayList();

    /* JADX INFO: renamed from: com.daaw.Pg$a */
    public static final class a {
        public final NQ a;
        public final InterfaceC1416Ks b;

        public a(NQ nq, InterfaceC1416Ks interfaceC1416Ks) {
            G10.g(nq, "onFrame");
            G10.g(interfaceC1416Ks, "continuation");
            this.a = nq;
            this.b = interfaceC1416Ks;
        }

        public final InterfaceC1416Ks a() {
            return this.b;
        }

        public final void b(long j) {
            Object objA;
            InterfaceC1416Ks interfaceC1416Ks = this.b;
            try {
                AbstractC4512fJ0.a aVar = AbstractC4512fJ0.B;
                objA = AbstractC4512fJ0.a(this.a.invoke(Long.valueOf(j)));
            } catch (Throwable th) {
                AbstractC4512fJ0.a aVar2 = AbstractC4512fJ0.B;
                objA = AbstractC4512fJ0.a(AbstractC4801gJ0.a(th));
            }
            interfaceC1416Ks.x(objA);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Pg$b */
    public static final class b extends AbstractC4192e90 implements NQ {
        public final /* synthetic */ C6748nF0 C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C6748nF0 c6748nF0) {
            super(1);
            this.C = c6748nF0;
        }

        public final void a(Throwable th) {
            a aVar;
            Object obj = C1887Pg.this.C;
            C1887Pg c1887Pg = C1887Pg.this;
            C6748nF0 c6748nF0 = this.C;
            synchronized (obj) {
                try {
                    List list = c1887Pg.E;
                    Object obj2 = c6748nF0.B;
                    if (obj2 == null) {
                        G10.u("awaiter");
                        aVar = null;
                    } else {
                        aVar = (a) obj2;
                    }
                    list.remove(aVar);
                    G91 g91 = G91.a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // com.daaw.NQ
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return G91.a;
        }
    }

    public C1887Pg(LQ lq) {
        this.B = lq;
    }

    @Override // com.daaw.InterfaceC4684ft
    public InterfaceC4684ft Q0(InterfaceC4684ft.c cVar) {
        return InterfaceC5203hl0.a.c(this, cVar);
    }

    @Override // com.daaw.InterfaceC4684ft
    public InterfaceC4684ft U(InterfaceC4684ft interfaceC4684ft) {
        return InterfaceC5203hl0.a.d(this, interfaceC4684ft);
    }

    @Override // com.daaw.InterfaceC4684ft.b, com.daaw.InterfaceC4684ft
    public InterfaceC4684ft.b a(InterfaceC4684ft.c cVar) {
        return InterfaceC5203hl0.a.b(this, cVar);
    }

    @Override // com.daaw.InterfaceC4684ft
    public Object c1(Object obj, InterfaceC3429bR interfaceC3429bR) {
        return InterfaceC5203hl0.a.a(this, obj, interfaceC3429bR);
    }

    @Override // com.daaw.InterfaceC4684ft.b
    public /* synthetic */ InterfaceC4684ft.c getKey() {
        return AbstractC4924gl0.a(this);
    }

    public final void i(Throwable th) {
        synchronized (this.C) {
            try {
                if (this.D != null) {
                    return;
                }
                this.D = th;
                List list = this.E;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    InterfaceC1416Ks interfaceC1416KsA = ((a) list.get(i)).a();
                    AbstractC4512fJ0.a aVar = AbstractC4512fJ0.B;
                    interfaceC1416KsA.x(AbstractC4512fJ0.a(AbstractC4801gJ0.a(th)));
                }
                this.E.clear();
                G91 g91 = G91.a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean k() {
        boolean z;
        synchronized (this.C) {
            z = !this.E.isEmpty();
        }
        return z;
    }

    public final void l(long j) {
        synchronized (this.C) {
            try {
                List list = this.E;
                this.E = this.F;
                this.F = list;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    ((a) list.get(i)).b(j);
                }
                list.clear();
                G91 g91 = G91.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.daaw.InterfaceC5203hl0
    public Object p0(NQ nq, InterfaceC1416Ks interfaceC1416Ks) {
        a aVar;
        C4067dj c4067dj = new C4067dj(H10.b(interfaceC1416Ks), 1);
        c4067dj.y();
        C6748nF0 c6748nF0 = new C6748nF0();
        synchronized (this.C) {
            Throwable th = this.D;
            if (th != null) {
                AbstractC4512fJ0.a aVar2 = AbstractC4512fJ0.B;
                c4067dj.x(AbstractC4512fJ0.a(AbstractC4801gJ0.a(th)));
            } else {
                c6748nF0.B = new a(nq, c4067dj);
                boolean zIsEmpty = this.E.isEmpty();
                List list = this.E;
                Object obj = c6748nF0.B;
                if (obj == null) {
                    G10.u("awaiter");
                    aVar = null;
                } else {
                    aVar = (a) obj;
                }
                list.add(aVar);
                c4067dj.r(new b(c6748nF0));
                if (zIsEmpty && this.B != null) {
                    try {
                        this.B.invoke();
                    } catch (Throwable th2) {
                        i(th2);
                    }
                }
            }
        }
        Object objU = c4067dj.u();
        if (objU == I10.c()) {
            AbstractC7497pw.c(interfaceC1416Ks);
        }
        return objU;
    }
}
