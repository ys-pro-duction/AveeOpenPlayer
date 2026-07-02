package com.daaw;

import com.daaw.AbstractC0304Ac0;
import com.daaw.AbstractC3246am;
import com.daaw.AbstractC3983dQ0;
import com.daaw.C1971Qb;
import com.daaw.ExecutorC3034a01;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: com.daaw.rr0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8032rr0 extends AbstractC0304Ac0 {
    public static final C1971Qb.c k = C1971Qb.c.a("addressTrackerKey");
    public final c c;
    public final ExecutorC3034a01 d;
    public final AbstractC0304Ac0.d e;
    public final GT f;
    public G31 g;
    public final ScheduledExecutorService h;
    public ExecutorC3034a01.d i;
    public Long j;

    /* JADX INFO: renamed from: com.daaw.rr0$b */
    public static class b {
        public g a;
        public volatile a b;
        public a c;
        public Long d;
        public int e;
        public final Set f = new HashSet();

        /* JADX INFO: renamed from: com.daaw.rr0$b$a */
        public static class a {
            public AtomicLong a;
            public AtomicLong b;

            public a() {
                this.a = new AtomicLong();
                this.b = new AtomicLong();
            }

            public void a() {
                this.a.set(0L);
                this.b.set(0L);
            }
        }

        public b(g gVar) {
            this.b = new a();
            this.c = new a();
            this.a = gVar;
        }

        public boolean b(i iVar) {
            if (m() && !iVar.n()) {
                iVar.m();
            } else if (!m() && iVar.n()) {
                iVar.p();
            }
            iVar.o(this);
            return this.f.add(iVar);
        }

        public void c() {
            int i = this.e;
            this.e = i == 0 ? 0 : i - 1;
        }

        public void d(long j) {
            this.d = Long.valueOf(j);
            this.e++;
            Iterator it = this.f.iterator();
            while (it.hasNext()) {
                ((i) it.next()).m();
            }
        }

        public double e() {
            return this.c.b.get() / f();
        }

        public long f() {
            return this.c.a.get() + this.c.b.get();
        }

        public void g(boolean z) {
            g gVar = this.a;
            if (gVar.e == null && gVar.f == null) {
                return;
            }
            if (z) {
                this.b.a.getAndIncrement();
            } else {
                this.b.b.getAndIncrement();
            }
        }

        public boolean h(long j) {
            return j > this.d.longValue() + Math.min(this.a.b.longValue() * ((long) this.e), Math.max(this.a.b.longValue(), this.a.c.longValue()));
        }

        public boolean i(i iVar) {
            iVar.l();
            return this.f.remove(iVar);
        }

        public void j() {
            this.b.a();
            this.c.a();
        }

        public void k() {
            this.e = 0;
        }

        public void l(g gVar) {
            this.a = gVar;
        }

        public boolean m() {
            return this.d != null;
        }

        public double n() {
            return this.c.a.get() / f();
        }

        public void o() {
            this.c.a();
            a aVar = this.b;
            this.b = this.c;
            this.c = aVar;
        }

        public void p() {
            AbstractC7785qy0.u(this.d != null, "not currently ejected");
            this.d = null;
            Iterator it = this.f.iterator();
            while (it.hasNext()) {
                ((i) it.next()).p();
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.rr0$c */
    public static class c extends AbstractC8739uP {
        public final Map B = new HashMap();

        @Override // com.daaw.AbstractC9304wP
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Map b() {
            return this.B;
        }

        public void d() {
            for (b bVar : this.B.values()) {
                if (bVar.m()) {
                    bVar.p();
                }
                bVar.k();
            }
        }

        public double e() {
            if (this.B.isEmpty()) {
                return 0.0d;
            }
            Iterator it = this.B.values().iterator();
            int i = 0;
            int i2 = 0;
            while (it.hasNext()) {
                i2++;
                if (((b) it.next()).m()) {
                    i++;
                }
            }
            return (((double) i) / ((double) i2)) * 100.0d;
        }

        public void f(Long l) {
            for (b bVar : this.B.values()) {
                if (!bVar.m()) {
                    bVar.c();
                }
                if (bVar.m() && bVar.h(l.longValue())) {
                    bVar.p();
                }
            }
        }

        public void g(g gVar, Collection collection) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                SocketAddress socketAddress = (SocketAddress) it.next();
                if (!this.B.containsKey(socketAddress)) {
                    this.B.put(socketAddress, new b(gVar));
                }
            }
        }

        public void h() {
            Iterator it = this.B.values().iterator();
            while (it.hasNext()) {
                ((b) it.next()).j();
            }
        }

        public void i() {
            Iterator it = this.B.values().iterator();
            while (it.hasNext()) {
                ((b) it.next()).o();
            }
        }

        public void j(g gVar) {
            Iterator it = this.B.values().iterator();
            while (it.hasNext()) {
                ((b) it.next()).l(gVar);
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.rr0$d */
    public class d extends AbstractC8181sP {
        public AbstractC0304Ac0.d a;

        public d(AbstractC0304Ac0.d dVar) {
            this.a = dVar;
        }

        @Override // com.daaw.AbstractC8181sP, com.daaw.AbstractC0304Ac0.d
        public AbstractC0304Ac0.h a(AbstractC0304Ac0.b bVar) {
            i iVar = C8032rr0.this.new i(this.a.a(bVar));
            List listA = bVar.a();
            if (C8032rr0.m(listA) && C8032rr0.this.c.containsKey(((C5350iH) listA.get(0)).a().get(0))) {
                b bVar2 = (b) C8032rr0.this.c.get(((C5350iH) listA.get(0)).a().get(0));
                bVar2.b(iVar);
                if (bVar2.d != null) {
                    iVar.m();
                }
            }
            return iVar;
        }

        @Override // com.daaw.AbstractC0304Ac0.d
        public void f(EnumC1304Jq enumC1304Jq, AbstractC0304Ac0.i iVar) {
            this.a.f(enumC1304Jq, C8032rr0.this.new h(iVar));
        }

        @Override // com.daaw.AbstractC8181sP
        public AbstractC0304Ac0.d g() {
            return this.a;
        }
    }

    /* JADX INFO: renamed from: com.daaw.rr0$e */
    public class e implements Runnable {
        public g B;

        public e(g gVar) {
            this.B = gVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            C8032rr0 c8032rr0 = C8032rr0.this;
            c8032rr0.j = Long.valueOf(c8032rr0.g.a());
            C8032rr0.this.c.i();
            for (j jVar : AbstractC8311sr0.a(this.B)) {
                C8032rr0 c8032rr02 = C8032rr0.this;
                jVar.a(c8032rr02.c, c8032rr02.j.longValue());
            }
            C8032rr0 c8032rr03 = C8032rr0.this;
            c8032rr03.c.f(c8032rr03.j);
        }
    }

    /* JADX INFO: renamed from: com.daaw.rr0$f */
    public static class f implements j {
        public final g a;

        public f(g gVar) {
            this.a = gVar;
        }

        @Override // com.daaw.C8032rr0.j
        public void a(c cVar, long j) {
            List<b> listN = C8032rr0.n(cVar, this.a.f.d.intValue());
            if (listN.size() < this.a.f.c.intValue() || listN.size() == 0) {
                return;
            }
            for (b bVar : listN) {
                if (cVar.e() >= this.a.d.intValue()) {
                    return;
                }
                if (bVar.f() >= this.a.f.d.intValue()) {
                    if (bVar.e() > ((double) this.a.f.a.intValue()) / 100.0d && new Random().nextInt(100) < this.a.f.b.intValue()) {
                        bVar.d(j);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.rr0$g */
    public static final class g {
        public final Long a;
        public final Long b;
        public final Long c;
        public final Integer d;
        public final c e;
        public final b f;
        public final AbstractC3983dQ0.b g;

        /* JADX INFO: renamed from: com.daaw.rr0$g$a */
        public static class a {
            public Long a = 10000000000L;
            public Long b = 30000000000L;
            public Long c = 30000000000L;
            public Integer d = 10;
            public c e;
            public b f;
            public AbstractC3983dQ0.b g;

            public g a() {
                AbstractC7785qy0.t(this.g != null);
                return new g(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
            }

            public a b(Long l) {
                AbstractC7785qy0.d(l != null);
                this.b = l;
                return this;
            }

            public a c(AbstractC3983dQ0.b bVar) {
                AbstractC7785qy0.t(bVar != null);
                this.g = bVar;
                return this;
            }

            public a d(b bVar) {
                this.f = bVar;
                return this;
            }

            public a e(Long l) {
                AbstractC7785qy0.d(l != null);
                this.a = l;
                return this;
            }

            public a f(Integer num) {
                AbstractC7785qy0.d(num != null);
                this.d = num;
                return this;
            }

            public a g(Long l) {
                AbstractC7785qy0.d(l != null);
                this.c = l;
                return this;
            }

            public a h(c cVar) {
                this.e = cVar;
                return this;
            }
        }

        /* JADX INFO: renamed from: com.daaw.rr0$g$b */
        public static class b {
            public final Integer a;
            public final Integer b;
            public final Integer c;
            public final Integer d;

            /* JADX INFO: renamed from: com.daaw.rr0$g$b$a */
            public static class a {
                public Integer a = 85;
                public Integer b = 100;
                public Integer c = 5;
                public Integer d = 50;

                public b a() {
                    return new b(this.a, this.b, this.c, this.d);
                }

                public a b(Integer num) {
                    boolean z = false;
                    AbstractC7785qy0.d(num != null);
                    if (num.intValue() >= 0 && num.intValue() <= 100) {
                        z = true;
                    }
                    AbstractC7785qy0.d(z);
                    this.b = num;
                    return this;
                }

                public a c(Integer num) {
                    AbstractC7785qy0.d(num != null);
                    AbstractC7785qy0.d(num.intValue() >= 0);
                    this.c = num;
                    return this;
                }

                public a d(Integer num) {
                    AbstractC7785qy0.d(num != null);
                    AbstractC7785qy0.d(num.intValue() >= 0);
                    this.d = num;
                    return this;
                }

                public a e(Integer num) {
                    boolean z = false;
                    AbstractC7785qy0.d(num != null);
                    if (num.intValue() >= 0 && num.intValue() <= 100) {
                        z = true;
                    }
                    AbstractC7785qy0.d(z);
                    this.a = num;
                    return this;
                }
            }

            public b(Integer num, Integer num2, Integer num3, Integer num4) {
                this.a = num;
                this.b = num2;
                this.c = num3;
                this.d = num4;
            }
        }

        /* JADX INFO: renamed from: com.daaw.rr0$g$c */
        public static class c {
            public final Integer a;
            public final Integer b;
            public final Integer c;
            public final Integer d;

            /* JADX INFO: renamed from: com.daaw.rr0$g$c$a */
            public static final class a {
                public Integer a = 1900;
                public Integer b = 100;
                public Integer c = 5;
                public Integer d = 100;

                public c a() {
                    return new c(this.a, this.b, this.c, this.d);
                }

                public a b(Integer num) {
                    boolean z = false;
                    AbstractC7785qy0.d(num != null);
                    if (num.intValue() >= 0 && num.intValue() <= 100) {
                        z = true;
                    }
                    AbstractC7785qy0.d(z);
                    this.b = num;
                    return this;
                }

                public a c(Integer num) {
                    AbstractC7785qy0.d(num != null);
                    AbstractC7785qy0.d(num.intValue() >= 0);
                    this.c = num;
                    return this;
                }

                public a d(Integer num) {
                    AbstractC7785qy0.d(num != null);
                    AbstractC7785qy0.d(num.intValue() >= 0);
                    this.d = num;
                    return this;
                }

                public a e(Integer num) {
                    AbstractC7785qy0.d(num != null);
                    this.a = num;
                    return this;
                }
            }

            public c(Integer num, Integer num2, Integer num3, Integer num4) {
                this.a = num;
                this.b = num2;
                this.c = num3;
                this.d = num4;
            }
        }

        public boolean a() {
            return (this.e == null && this.f == null) ? false : true;
        }

        public g(Long l, Long l2, Long l3, Integer num, c cVar, b bVar, AbstractC3983dQ0.b bVar2) {
            this.a = l;
            this.b = l2;
            this.c = l3;
            this.d = num;
            this.e = cVar;
            this.f = bVar;
            this.g = bVar2;
        }
    }

    /* JADX INFO: renamed from: com.daaw.rr0$h */
    public class h extends AbstractC0304Ac0.i {
        public final AbstractC0304Ac0.i a;

        /* JADX INFO: renamed from: com.daaw.rr0$h$a */
        public class a extends AbstractC3246am {
            public b a;

            public a(b bVar) {
                this.a = bVar;
            }

            @Override // com.daaw.ZX0
            public void i(C6262lX0 c6262lX0) {
                this.a.g(c6262lX0.o());
            }
        }

        /* JADX INFO: renamed from: com.daaw.rr0$h$b */
        public class b extends AbstractC3246am.a {
            public final b a;

            public b(b bVar) {
                this.a = bVar;
            }

            @Override // com.daaw.AbstractC3246am.a
            public AbstractC3246am a(AbstractC3246am.b bVar, C2756Xj0 c2756Xj0) {
                return h.this.new a(this.a);
            }
        }

        public h(AbstractC0304Ac0.i iVar) {
            this.a = iVar;
        }

        @Override // com.daaw.AbstractC0304Ac0.i
        public AbstractC0304Ac0.e a(AbstractC0304Ac0.f fVar) {
            AbstractC0304Ac0.e eVarA = this.a.a(fVar);
            AbstractC0304Ac0.h hVarC = eVarA.c();
            return hVarC != null ? AbstractC0304Ac0.e.i(hVarC, new b((b) hVarC.c().b(C8032rr0.k))) : eVarA;
        }
    }

    /* JADX INFO: renamed from: com.daaw.rr0$i */
    public class i extends AbstractC9862yP {
        public final AbstractC0304Ac0.h a;
        public b b;
        public boolean c;
        public C1408Kq d;
        public AbstractC0304Ac0.j e;

        /* JADX INFO: renamed from: com.daaw.rr0$i$a */
        public class a implements AbstractC0304Ac0.j {
            public final AbstractC0304Ac0.j a;

            public a(AbstractC0304Ac0.j jVar) {
                this.a = jVar;
            }

            @Override // com.daaw.AbstractC0304Ac0.j
            public void a(C1408Kq c1408Kq) {
                i.this.d = c1408Kq;
                if (i.this.c) {
                    return;
                }
                this.a.a(c1408Kq);
            }
        }

        public i(AbstractC0304Ac0.h hVar) {
            this.a = hVar;
        }

        @Override // com.daaw.AbstractC0304Ac0.h
        public C1971Qb c() {
            return this.b != null ? this.a.c().d().d(C8032rr0.k, this.b).a() : this.a.c();
        }

        @Override // com.daaw.AbstractC9862yP, com.daaw.AbstractC0304Ac0.h
        public void g(AbstractC0304Ac0.j jVar) {
            this.e = jVar;
            super.g(new a(jVar));
        }

        @Override // com.daaw.AbstractC0304Ac0.h
        public void h(List list) {
            if (C8032rr0.m(b()) && C8032rr0.m(list)) {
                if (C8032rr0.this.c.containsValue(this.b)) {
                    this.b.i(this);
                }
                SocketAddress socketAddress = (SocketAddress) ((C5350iH) list.get(0)).a().get(0);
                if (C8032rr0.this.c.containsKey(socketAddress)) {
                    ((b) C8032rr0.this.c.get(socketAddress)).b(this);
                }
            } else if (!C8032rr0.m(b()) || C8032rr0.m(list)) {
                if (!C8032rr0.m(b()) && C8032rr0.m(list)) {
                    SocketAddress socketAddress2 = (SocketAddress) ((C5350iH) list.get(0)).a().get(0);
                    if (C8032rr0.this.c.containsKey(socketAddress2)) {
                        ((b) C8032rr0.this.c.get(socketAddress2)).b(this);
                    }
                }
            } else if (C8032rr0.this.c.containsKey(a().a().get(0))) {
                b bVar = (b) C8032rr0.this.c.get(a().a().get(0));
                bVar.i(this);
                bVar.j();
            }
            this.a.h(list);
        }

        @Override // com.daaw.AbstractC9862yP
        public AbstractC0304Ac0.h i() {
            return this.a;
        }

        public void l() {
            this.b = null;
        }

        public void m() {
            this.c = true;
            this.e.a(C1408Kq.b(C6262lX0.u));
        }

        public boolean n() {
            return this.c;
        }

        public void o(b bVar) {
            this.b = bVar;
        }

        public void p() {
            this.c = false;
            C1408Kq c1408Kq = this.d;
            if (c1408Kq != null) {
                this.e.a(c1408Kq);
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.rr0$j */
    public interface j {
        void a(c cVar, long j);
    }

    /* JADX INFO: renamed from: com.daaw.rr0$k */
    public static class k implements j {
        public final g a;

        public k(g gVar) {
            AbstractC7785qy0.e(gVar.e != null, "success rate ejection config is null");
            this.a = gVar;
        }

        public static double b(Collection collection) {
            Iterator it = collection.iterator();
            double dDoubleValue = 0.0d;
            while (it.hasNext()) {
                dDoubleValue += ((Double) it.next()).doubleValue();
            }
            return dDoubleValue / ((double) collection.size());
        }

        public static double c(Collection collection, double d) {
            Iterator it = collection.iterator();
            double d2 = 0.0d;
            while (it.hasNext()) {
                double dDoubleValue = ((Double) it.next()).doubleValue() - d;
                d2 += dDoubleValue * dDoubleValue;
            }
            return Math.sqrt(d2 / ((double) collection.size()));
        }

        @Override // com.daaw.C8032rr0.j
        public void a(c cVar, long j) {
            List<b> listN = C8032rr0.n(cVar, this.a.e.d.intValue());
            if (listN.size() < this.a.e.c.intValue() || listN.size() == 0) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = listN.iterator();
            while (it.hasNext()) {
                arrayList.add(Double.valueOf(((b) it.next()).n()));
            }
            double dB = b(arrayList);
            double dC = dB - (c(arrayList, dB) * ((double) (this.a.e.a.intValue() / 1000.0f)));
            for (b bVar : listN) {
                if (cVar.e() >= this.a.d.intValue()) {
                    return;
                }
                if (bVar.n() < dC && new Random().nextInt(100) < this.a.e.b.intValue()) {
                    bVar.d(j);
                }
            }
        }
    }

    public C8032rr0(AbstractC0304Ac0.d dVar, G31 g31) {
        d dVar2 = new d((AbstractC0304Ac0.d) AbstractC7785qy0.o(dVar, "helper"));
        this.e = dVar2;
        this.f = new GT(dVar2);
        this.c = new c();
        this.d = (ExecutorC3034a01) AbstractC7785qy0.o(dVar.d(), "syncContext");
        this.h = (ScheduledExecutorService) AbstractC7785qy0.o(dVar.c(), "timeService");
        this.g = g31;
    }

    public static boolean m(List list) {
        Iterator it = list.iterator();
        int size = 0;
        while (it.hasNext()) {
            size += ((C5350iH) it.next()).a().size();
            if (size > 1) {
                return false;
            }
        }
        return true;
    }

    public static List n(c cVar, int i2) {
        ArrayList arrayList = new ArrayList();
        for (b bVar : cVar.values()) {
            if (bVar.f() >= i2) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    @Override // com.daaw.AbstractC0304Ac0
    public boolean a(AbstractC0304Ac0.g gVar) {
        g gVar2 = (g) gVar.c();
        ArrayList arrayList = new ArrayList();
        Iterator it = gVar.a().iterator();
        while (it.hasNext()) {
            arrayList.addAll(((C5350iH) it.next()).a());
        }
        this.c.keySet().retainAll(arrayList);
        this.c.j(gVar2);
        this.c.g(gVar2, arrayList);
        this.f.r(gVar2.g.b());
        if (gVar2.a()) {
            Long lValueOf = this.j == null ? gVar2.a : Long.valueOf(Math.max(0L, gVar2.a.longValue() - (this.g.a() - this.j.longValue())));
            ExecutorC3034a01.d dVar = this.i;
            if (dVar != null) {
                dVar.a();
                this.c.h();
            }
            this.i = this.d.d(new e(gVar2), lValueOf.longValue(), gVar2.a.longValue(), TimeUnit.NANOSECONDS, this.h);
        } else {
            ExecutorC3034a01.d dVar2 = this.i;
            if (dVar2 != null) {
                dVar2.a();
                this.j = null;
                this.c.d();
            }
        }
        this.f.d(gVar.e().d(gVar2.g.a()).a());
        return true;
    }

    @Override // com.daaw.AbstractC0304Ac0
    public void c(C6262lX0 c6262lX0) {
        this.f.c(c6262lX0);
    }

    @Override // com.daaw.AbstractC0304Ac0
    public void f() {
        this.f.f();
    }
}
