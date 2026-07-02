package com.daaw;

import com.daaw.AbstractC5738jg1;
import com.daaw.C1616Mq0;
import com.daaw.C6017kg1;
import com.daaw.C6305lg1;
import com.daaw.C9395wj1;
import com.daaw.InterfaceC1096Hq;
import j$.util.Objects;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class QG0 implements C6017kg1.c {
    public final c a;
    public final C3481bd0 b;
    public final C4408ew c;
    public final InterfaceC1096Hq d;
    public final C1616Mq0 f;
    public final C6305lg1 h;
    public final C9395wj1 i;
    public C6017kg1 j;
    public boolean g = false;
    public final Map e = new HashMap();
    public final Deque k = new ArrayDeque();

    public class a implements C6305lg1.a {
        public a() {
        }

        @Override // com.daaw.KX0
        public void a() {
            QG0.this.w();
        }

        @Override // com.daaw.KX0
        public void b(C6262lX0 c6262lX0) {
            QG0.this.v(c6262lX0);
        }

        @Override // com.daaw.C6305lg1.a
        public void e(CU0 cu0, AbstractC5738jg1 abstractC5738jg1) {
            QG0.this.u(cu0, abstractC5738jg1);
        }
    }

    public class b implements C9395wj1.a {
        public b() {
        }

        @Override // com.daaw.KX0
        public void a() {
            QG0.this.i.A();
        }

        @Override // com.daaw.KX0
        public void b(C6262lX0 c6262lX0) {
            QG0.this.z(c6262lX0);
        }

        @Override // com.daaw.C9395wj1.a
        public void c(CU0 cu0, List list) {
            QG0.this.B(cu0, list);
        }

        @Override // com.daaw.C9395wj1.a
        public void d() {
            QG0.this.A();
        }
    }

    public interface c {
        void a(EnumC1409Kq0 enumC1409Kq0);

        UY b(int i);

        void c(KG0 kg0);

        void d(int i, C6262lX0 c6262lX0);

        void e(int i, C6262lX0 c6262lX0);

        void f(C10246zm0 c10246zm0);
    }

    public QG0(final c cVar, C3481bd0 c3481bd0, C4408ew c4408ew, final C9632xb c9632xb, InterfaceC1096Hq interfaceC1096Hq) {
        this.a = cVar;
        this.b = c3481bd0;
        this.c = c4408ew;
        this.d = interfaceC1096Hq;
        Objects.requireNonNull(cVar);
        this.f = new C1616Mq0(c9632xb, new C1616Mq0.a() { // from class: com.daaw.NG0
            @Override // com.daaw.C1616Mq0.a
            public final void a(EnumC1409Kq0 enumC1409Kq0) {
                cVar.a(enumC1409Kq0);
            }
        });
        this.h = c4408ew.a(new a());
        this.i = c4408ew.b(new b());
        interfaceC1096Hq.a(new InterfaceC8310sr() { // from class: com.daaw.OG0
            @Override // com.daaw.InterfaceC8310sr
            public final void accept(Object obj) {
                QG0.e(this.a, c9632xb, (InterfaceC1096Hq.a) obj);
            }
        });
    }

    public static /* synthetic */ void d(QG0 qg0, InterfaceC1096Hq.a aVar) {
        qg0.getClass();
        if (aVar.equals(InterfaceC1096Hq.a.REACHABLE) && qg0.f.c().equals(EnumC1409Kq0.ONLINE)) {
            return;
        }
        if (!(aVar.equals(InterfaceC1096Hq.a.UNREACHABLE) && qg0.f.c().equals(EnumC1409Kq0.OFFLINE)) && qg0.o()) {
            AbstractC2212Sd0.a("RemoteStore", "Restarting streams for network reachability change.", new Object[0]);
            qg0.F();
        }
    }

    public static /* synthetic */ void e(final QG0 qg0, C9632xb c9632xb, final InterfaceC1096Hq.a aVar) {
        qg0.getClass();
        c9632xb.i(new Runnable() { // from class: com.daaw.PG0
            @Override // java.lang.Runnable
            public final void run() {
                QG0.d(this.B, aVar);
            }
        });
    }

    public final void A() {
        this.b.E(this.i.w());
        Iterator it = this.k.iterator();
        while (it.hasNext()) {
            this.i.B(((C9967ym0) it.next()).h());
        }
    }

    public final void B(CU0 cu0, List list) {
        this.a.f(C10246zm0.a((C9967ym0) this.k.poll(), cu0, list, this.i.w()));
        s();
    }

    public void C(C5000h11 c5000h11) {
        Integer numValueOf = Integer.valueOf(c5000h11.h());
        if (this.e.containsKey(numValueOf)) {
            return;
        }
        this.e.put(numValueOf, c5000h11);
        if (I()) {
            L();
        } else if (this.h.m()) {
            H(c5000h11);
        }
    }

    public final void D(AbstractC5738jg1.d dVar) {
        AbstractC6557mb.d(dVar.a() != null, "Processing target error without a cause", new Object[0]);
        for (Integer num : dVar.d()) {
            if (this.e.containsKey(num)) {
                this.e.remove(num);
                this.j.p(num.intValue());
                this.a.e(num.intValue(), dVar.a());
            }
        }
    }

    public final void E(CU0 cu0) {
        AbstractC6557mb.d(!cu0.equals(CU0.C), "Can't raise event for unknown SnapshotVersion", new Object[0]);
        KG0 kg0C = this.j.c(cu0);
        for (Map.Entry entry : kg0C.d().entrySet()) {
            C4721g11 c4721g11 = (C4721g11) entry.getValue();
            if (!c4721g11.e().isEmpty()) {
                Integer num = (Integer) entry.getKey();
                num.intValue();
                C5000h11 c5000h11 = (C5000h11) this.e.get(num);
                if (c5000h11 != null) {
                    this.e.put(num, c5000h11.k(c4721g11.e(), cu0));
                }
            }
        }
        for (Map.Entry entry2 : kg0C.e().entrySet()) {
            Integer num2 = (Integer) entry2.getKey();
            int iIntValue = num2.intValue();
            C5000h11 c5000h112 = (C5000h11) this.e.get(num2);
            if (c5000h112 != null) {
                this.e.put(num2, c5000h112.k(AbstractC4340ei.C, c5000h112.f()));
                G(iIntValue);
                H(new C5000h11(c5000h112.g(), iIntValue, c5000h112.e(), (EnumC7573qC0) entry2.getValue()));
            }
        }
        this.a.c(kg0C);
    }

    public final void F() {
        this.g = false;
        q();
        this.f.h(EnumC1409Kq0.UNKNOWN);
        this.i.l();
        this.h.l();
        r();
    }

    public final void G(int i) {
        this.j.n(i);
        this.h.x(i);
    }

    public final void H(C5000h11 c5000h11) {
        this.j.n(c5000h11.h());
        if (!c5000h11.d().isEmpty() || c5000h11.f().compareTo(CU0.C) > 0) {
            c5000h11 = c5000h11.i(Integer.valueOf(b(c5000h11.h()).size()));
        }
        this.h.y(c5000h11);
    }

    public final boolean I() {
        return (!o() || this.h.n() || this.e.isEmpty()) ? false : true;
    }

    public final boolean J() {
        return (!o() || this.i.n() || this.k.isEmpty()) ? false : true;
    }

    public void K() {
        r();
    }

    public final void L() {
        AbstractC6557mb.d(I(), "startWatchStream() called when shouldStartWatchStream() is false.", new Object[0]);
        this.j = new C6017kg1(this);
        this.h.s();
        this.f.e();
    }

    public final void M() {
        AbstractC6557mb.d(J(), "startWriteStream() called when shouldStartWriteStream() is false.", new Object[0]);
        this.i.s();
    }

    public void N(int i) {
        AbstractC6557mb.d(((C5000h11) this.e.remove(Integer.valueOf(i))) != null, "stopListening called on target no currently watched: %d", Integer.valueOf(i));
        if (this.h.m()) {
            G(i);
        }
        if (this.e.isEmpty()) {
            if (this.h.m()) {
                this.h.o();
            } else if (o()) {
                this.f.h(EnumC1409Kq0.UNKNOWN);
            }
        }
    }

    @Override // com.daaw.C6017kg1.c
    public C5000h11 a(int i) {
        return (C5000h11) this.e.get(Integer.valueOf(i));
    }

    @Override // com.daaw.C6017kg1.c
    public UY b(int i) {
        return this.a.b(i);
    }

    @Override // com.daaw.C6017kg1.c
    public C3851cw c() {
        return this.c.c().a();
    }

    public final void m(C9967ym0 c9967ym0) {
        AbstractC6557mb.d(n(), "addToWritePipeline called when pipeline is full", new Object[0]);
        this.k.add(c9967ym0);
        if (this.i.m() && this.i.x()) {
            this.i.B(c9967ym0.h());
        }
    }

    public final boolean n() {
        return o() && this.k.size() < 10;
    }

    public boolean o() {
        return this.g;
    }

    public final void p() {
        this.j = null;
    }

    public final void q() {
        this.h.t();
        this.i.t();
        if (!this.k.isEmpty()) {
            AbstractC2212Sd0.a("RemoteStore", "Stopping write stream with %d pending writes", Integer.valueOf(this.k.size()));
            this.k.clear();
        }
        p();
    }

    public void r() {
        this.g = true;
        if (o()) {
            this.i.z(this.b.u());
            if (I()) {
                L();
            } else {
                this.f.h(EnumC1409Kq0.UNKNOWN);
            }
            s();
        }
    }

    public void s() {
        int iE = this.k.isEmpty() ? -1 : ((C9967ym0) this.k.getLast()).e();
        while (true) {
            if (!n()) {
                break;
            }
            C9967ym0 c9967ym0W = this.b.w(iE);
            if (c9967ym0W != null) {
                m(c9967ym0W);
                iE = c9967ym0W.e();
            } else if (this.k.size() == 0) {
                this.i.o();
            }
        }
        if (J()) {
            M();
        }
    }

    public void t() {
        if (o()) {
            AbstractC2212Sd0.a("RemoteStore", "Restarting streams for new credential.", new Object[0]);
            F();
        }
    }

    public final void u(CU0 cu0, AbstractC5738jg1 abstractC5738jg1) {
        this.f.h(EnumC1409Kq0.ONLINE);
        AbstractC6557mb.d((this.h == null || this.j == null) ? false : true, "WatchStream and WatchStreamAggregator should both be non-null", new Object[0]);
        boolean z = abstractC5738jg1 instanceof AbstractC5738jg1.d;
        AbstractC5738jg1.d dVar = z ? (AbstractC5738jg1.d) abstractC5738jg1 : null;
        if (dVar != null && dVar.b().equals(AbstractC5738jg1.e.Removed) && dVar.a() != null) {
            D(dVar);
            return;
        }
        if (abstractC5738jg1 instanceof AbstractC5738jg1.b) {
            this.j.i((AbstractC5738jg1.b) abstractC5738jg1);
        } else if (abstractC5738jg1 instanceof AbstractC5738jg1.c) {
            this.j.j((AbstractC5738jg1.c) abstractC5738jg1);
        } else {
            AbstractC6557mb.d(z, "Expected watchChange to be an instance of WatchTargetChange", new Object[0]);
            this.j.k((AbstractC5738jg1.d) abstractC5738jg1);
        }
        if (cu0.equals(CU0.C) || cu0.compareTo(this.b.t()) < 0) {
            return;
        }
        E(cu0);
    }

    public final void v(C6262lX0 c6262lX0) {
        if (c6262lX0.o()) {
            AbstractC6557mb.d(!I(), "Watch stream was stopped gracefully while still needed.", new Object[0]);
        }
        p();
        if (!I()) {
            this.f.h(EnumC1409Kq0.UNKNOWN);
        } else {
            this.f.d(c6262lX0);
            L();
        }
    }

    public final void w() {
        Iterator it = this.e.values().iterator();
        while (it.hasNext()) {
            H((C5000h11) it.next());
        }
    }

    public final void x(C6262lX0 c6262lX0) {
        AbstractC6557mb.d(!c6262lX0.o(), "Handling write error with status OK.", new Object[0]);
        if (C4408ew.h(c6262lX0)) {
            C9967ym0 c9967ym0 = (C9967ym0) this.k.poll();
            this.i.l();
            this.a.d(c9967ym0.e(), c6262lX0);
            s();
        }
    }

    public final void y(C6262lX0 c6262lX0) {
        AbstractC6557mb.d(!c6262lX0.o(), "Handling write error with status OK.", new Object[0]);
        if (C4408ew.f(c6262lX0)) {
            AbstractC2212Sd0.a("RemoteStore", "RemoteStore error before completed handshake; resetting stream token %s: %s", AbstractC6838nb1.v(this.i.w()), c6262lX0);
            C9395wj1 c9395wj1 = this.i;
            AbstractC4340ei abstractC4340ei = C9395wj1.v;
            c9395wj1.z(abstractC4340ei);
            this.b.E(abstractC4340ei);
        }
    }

    public final void z(C6262lX0 c6262lX0) {
        if (c6262lX0.o()) {
            AbstractC6557mb.d(!J(), "Write stream was stopped gracefully while still needed.", new Object[0]);
        }
        if (!c6262lX0.o() && !this.k.isEmpty()) {
            if (this.i.x()) {
                x(c6262lX0);
            } else {
                y(c6262lX0);
            }
        }
        if (J()) {
            M();
        }
    }
}
