package com.daaw;

import com.daaw.AbstractC0304Ac0;
import com.daaw.C1971Qb;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: com.daaw.eK0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4237eK0 extends AbstractC0304Ac0 {
    public static final C1971Qb.c h = C1971Qb.c.a("state-info");
    public static final C6262lX0 i = C6262lX0.f.q("no subchannels ready");
    public final AbstractC0304Ac0.d c;
    public EnumC1304Jq f;
    public final Map d = new HashMap();
    public e g = new b(i);
    public final Random e = new Random();

    /* JADX INFO: renamed from: com.daaw.eK0$a */
    public class a implements AbstractC0304Ac0.j {
        public final /* synthetic */ AbstractC0304Ac0.h a;

        public a(AbstractC0304Ac0.h hVar) {
            this.a = hVar;
        }

        @Override // com.daaw.AbstractC0304Ac0.j
        public void a(C1408Kq c1408Kq) {
            C4237eK0.this.l(this.a, c1408Kq);
        }
    }

    /* JADX INFO: renamed from: com.daaw.eK0$b */
    public static final class b extends e {
        public final C6262lX0 a;

        public b(C6262lX0 c6262lX0) {
            super(null);
            this.a = (C6262lX0) AbstractC7785qy0.o(c6262lX0, "status");
        }

        @Override // com.daaw.AbstractC0304Ac0.i
        public AbstractC0304Ac0.e a(AbstractC0304Ac0.f fVar) {
            return this.a.o() ? AbstractC0304Ac0.e.g() : AbstractC0304Ac0.e.f(this.a);
        }

        @Override // com.daaw.C4237eK0.e
        public boolean c(e eVar) {
            if (!(eVar instanceof b)) {
                return false;
            }
            b bVar = (b) eVar;
            if (AbstractC8301sp0.a(this.a, bVar.a)) {
                return true;
            }
            return this.a.o() && bVar.a.o();
        }

        public String toString() {
            return AbstractC6329ll0.a(b.class).d("status", this.a).toString();
        }
    }

    /* JADX INFO: renamed from: com.daaw.eK0$c */
    public static final class c extends e {
        public static final AtomicIntegerFieldUpdater c = AtomicIntegerFieldUpdater.newUpdater(c.class, "b");
        public final List a;
        public volatile int b;

        public c(List list, int i) {
            super(null);
            AbstractC7785qy0.e(!list.isEmpty(), "empty list");
            this.a = list;
            this.b = i - 1;
        }

        @Override // com.daaw.AbstractC0304Ac0.i
        public AbstractC0304Ac0.e a(AbstractC0304Ac0.f fVar) {
            return AbstractC0304Ac0.e.h(d());
        }

        @Override // com.daaw.C4237eK0.e
        public boolean c(e eVar) {
            if (!(eVar instanceof c)) {
                return false;
            }
            c cVar = (c) eVar;
            if (cVar != this) {
                return this.a.size() == cVar.a.size() && new HashSet(this.a).containsAll(cVar.a);
            }
            return true;
        }

        public final AbstractC0304Ac0.h d() {
            int size = this.a.size();
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = c;
            int iIncrementAndGet = atomicIntegerFieldUpdater.incrementAndGet(this);
            if (iIncrementAndGet >= size) {
                int i = iIncrementAndGet % size;
                atomicIntegerFieldUpdater.compareAndSet(this, iIncrementAndGet, i);
                iIncrementAndGet = i;
            }
            return (AbstractC0304Ac0.h) this.a.get(iIncrementAndGet);
        }

        public String toString() {
            return AbstractC6329ll0.a(c.class).d("list", this.a).toString();
        }
    }

    /* JADX INFO: renamed from: com.daaw.eK0$d */
    public static final class d {
        public Object a;

        public d(Object obj) {
            this.a = obj;
        }
    }

    /* JADX INFO: renamed from: com.daaw.eK0$e */
    public static abstract class e extends AbstractC0304Ac0.i {
        public e() {
        }

        public abstract boolean c(e eVar);

        public /* synthetic */ e(a aVar) {
            this();
        }
    }

    public C4237eK0(AbstractC0304Ac0.d dVar) {
        this.c = (AbstractC0304Ac0.d) AbstractC7785qy0.o(dVar, "helper");
    }

    public static List h(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            AbstractC0304Ac0.h hVar = (AbstractC0304Ac0.h) it.next();
            if (k(hVar)) {
                arrayList.add(hVar);
            }
        }
        return arrayList;
    }

    public static d i(AbstractC0304Ac0.h hVar) {
        return (d) AbstractC7785qy0.o((d) hVar.c().b(h), "STATE_INFO");
    }

    public static boolean k(AbstractC0304Ac0.h hVar) {
        return ((C1408Kq) i(hVar).a).c() == EnumC1304Jq.READY;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l(AbstractC0304Ac0.h hVar, C1408Kq c1408Kq) {
        if (this.d.get(o(hVar.a())) != hVar) {
            return;
        }
        EnumC1304Jq enumC1304JqC = c1408Kq.c();
        EnumC1304Jq enumC1304Jq = EnumC1304Jq.TRANSIENT_FAILURE;
        if (enumC1304JqC == enumC1304Jq || c1408Kq.c() == EnumC1304Jq.IDLE) {
            this.c.e();
        }
        EnumC1304Jq enumC1304JqC2 = c1408Kq.c();
        EnumC1304Jq enumC1304Jq2 = EnumC1304Jq.IDLE;
        if (enumC1304JqC2 == enumC1304Jq2) {
            hVar.e();
        }
        d dVarI = i(hVar);
        if (((C1408Kq) dVarI.a).c().equals(enumC1304Jq) && (c1408Kq.c().equals(EnumC1304Jq.CONNECTING) || c1408Kq.c().equals(enumC1304Jq2))) {
            return;
        }
        dVarI.a = c1408Kq;
        q();
    }

    public static Set m(Set set, Set set2) {
        HashSet hashSet = new HashSet(set);
        hashSet.removeAll(set2);
        return hashSet;
    }

    public static C5350iH o(C5350iH c5350iH) {
        return new C5350iH(c5350iH.a());
    }

    public static Map p(List list) {
        HashMap map = new HashMap(list.size() * 2);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C5350iH c5350iH = (C5350iH) it.next();
            map.put(o(c5350iH), c5350iH);
        }
        return map;
    }

    @Override // com.daaw.AbstractC0304Ac0
    public boolean a(AbstractC0304Ac0.g gVar) {
        if (gVar.a().isEmpty()) {
            c(C6262lX0.u.q("NameResolver returned no usable address. addrs=" + gVar.a() + ", attrs=" + gVar.b()));
            return false;
        }
        List listA = gVar.a();
        Set setKeySet = this.d.keySet();
        Map mapP = p(listA);
        Set setM = m(setKeySet, mapP.keySet());
        for (Map.Entry entry : mapP.entrySet()) {
            C5350iH c5350iH = (C5350iH) entry.getKey();
            C5350iH c5350iH2 = (C5350iH) entry.getValue();
            AbstractC0304Ac0.h hVar = (AbstractC0304Ac0.h) this.d.get(c5350iH);
            if (hVar != null) {
                hVar.h(Collections.singletonList(c5350iH2));
            } else {
                AbstractC0304Ac0.h hVar2 = (AbstractC0304Ac0.h) AbstractC7785qy0.o(this.c.a(AbstractC0304Ac0.b.c().d(c5350iH2).f(C1971Qb.c().d(h, new d(C1408Kq.a(EnumC1304Jq.IDLE))).a()).b()), "subchannel");
                hVar2.g(new a(hVar2));
                this.d.put(c5350iH, hVar2);
                hVar2.e();
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = setM.iterator();
        while (it.hasNext()) {
            arrayList.add((AbstractC0304Ac0.h) this.d.remove((C5350iH) it.next()));
        }
        q();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            n((AbstractC0304Ac0.h) it2.next());
        }
        return true;
    }

    @Override // com.daaw.AbstractC0304Ac0
    public void c(C6262lX0 c6262lX0) {
        if (this.f != EnumC1304Jq.READY) {
            r(EnumC1304Jq.TRANSIENT_FAILURE, new b(c6262lX0));
        }
    }

    @Override // com.daaw.AbstractC0304Ac0
    public void f() {
        Iterator it = j().iterator();
        while (it.hasNext()) {
            n((AbstractC0304Ac0.h) it.next());
        }
        this.d.clear();
    }

    public Collection j() {
        return this.d.values();
    }

    public final void n(AbstractC0304Ac0.h hVar) {
        hVar.f();
        i(hVar).a = C1408Kq.a(EnumC1304Jq.SHUTDOWN);
    }

    public final void q() {
        List listH = h(j());
        if (!listH.isEmpty()) {
            r(EnumC1304Jq.READY, new c(listH, this.e.nextInt(listH.size())));
            return;
        }
        C6262lX0 c6262lX0D = i;
        Iterator it = j().iterator();
        boolean z = false;
        while (it.hasNext()) {
            C1408Kq c1408Kq = (C1408Kq) i((AbstractC0304Ac0.h) it.next()).a;
            if (c1408Kq.c() == EnumC1304Jq.CONNECTING || c1408Kq.c() == EnumC1304Jq.IDLE) {
                z = true;
            }
            if (c6262lX0D == i || !c6262lX0D.o()) {
                c6262lX0D = c1408Kq.d();
            }
        }
        r(z ? EnumC1304Jq.CONNECTING : EnumC1304Jq.TRANSIENT_FAILURE, new b(c6262lX0D));
    }

    public final void r(EnumC1304Jq enumC1304Jq, e eVar) {
        if (enumC1304Jq == this.f && eVar.c(this.g)) {
            return;
        }
        this.c.f(enumC1304Jq, eVar);
        this.f = enumC1304Jq;
        this.g = eVar;
    }
}
