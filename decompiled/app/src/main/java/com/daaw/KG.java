package com.daaw;

import android.os.Looper;
import android.os.MessageQueue;
import android.util.Log;
import com.daaw.C0704Dw;
import com.daaw.InterfaceC4204eC;
import com.daaw.InterfaceC6319lj0;
import com.daaw.QG;
import j$.util.Objects;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public class KG implements NG, InterfaceC6319lj0.a, QG.a {
    public final Map a;
    public final PG b;
    public final InterfaceC6319lj0 c;
    public final a d;
    public final Map e;
    public final VI0 f;
    public final b g;
    public ReferenceQueue h;

    public static class a {
        public final ExecutorService a;
        public final ExecutorService b;
        public final NG c;

        public a(ExecutorService executorService, ExecutorService executorService2, NG ng) {
            this.a = executorService;
            this.b = executorService2;
            this.c = ng;
        }

        public MG a(H70 h70, boolean z) {
            return new MG(h70, this.a, this.b, z, this.c);
        }
    }

    public static class b implements C0704Dw.a {
        public final InterfaceC4204eC.a a;
        public volatile InterfaceC4204eC b;

        public b(InterfaceC4204eC.a aVar) {
            this.a = aVar;
        }

        @Override // com.daaw.C0704Dw.a
        public InterfaceC4204eC a() {
            if (this.b == null) {
                synchronized (this) {
                    try {
                        if (this.b == null) {
                            this.b = this.a.a();
                        }
                        if (this.b == null) {
                            this.b = new C4483fC();
                        }
                    } finally {
                    }
                }
            }
            return this.b;
        }
    }

    public static class c {
        public final MG a;
        public final MI0 b;

        public c(MI0 mi0, MG mg) {
            this.b = mi0;
            this.a = mg;
        }

        public void a() {
            this.a.l(this.b);
        }
    }

    public static class d implements MessageQueue.IdleHandler {
        public final Map a;
        public final ReferenceQueue b;

        public d(Map map, ReferenceQueue referenceQueue) {
            this.a = map;
            this.b = referenceQueue;
        }

        @Override // android.os.MessageQueue.IdleHandler
        public boolean queueIdle() {
            e eVar = (e) this.b.poll();
            if (eVar == null) {
                return true;
            }
            this.a.remove(eVar.a);
            return true;
        }
    }

    public static class e extends WeakReference {
        public final H70 a;

        public e(H70 h70, QG qg, ReferenceQueue referenceQueue) {
            super(qg, referenceQueue);
            this.a = h70;
        }
    }

    public KG(InterfaceC6319lj0 interfaceC6319lj0, InterfaceC4204eC.a aVar, ExecutorService executorService, ExecutorService executorService2) {
        this(interfaceC6319lj0, aVar, executorService, executorService2, null, null, null, null, null);
    }

    public static void j(String str, long j, H70 h70) {
        AbstractC1357Kd0.a(j);
        Objects.toString(h70);
    }

    @Override // com.daaw.QG.a
    public void a(H70 h70, QG qg) {
        AbstractC6559mb1.b();
        this.e.remove(h70);
        if (qg.d()) {
            this.c.a(h70, qg);
        } else {
            this.f.a(qg);
        }
    }

    @Override // com.daaw.InterfaceC6319lj0.a
    public void b(KI0 ki0) {
        AbstractC6559mb1.b();
        this.f.a(ki0);
    }

    @Override // com.daaw.NG
    public void c(H70 h70, QG qg) {
        AbstractC6559mb1.b();
        if (qg != null) {
            qg.f(h70, this);
            if (qg.d()) {
                this.e.put(h70, new e(h70, qg, f()));
            }
        }
        this.a.remove(h70);
    }

    @Override // com.daaw.NG
    public void d(MG mg, H70 h70) {
        AbstractC6559mb1.b();
        if (mg.equals((MG) this.a.get(h70))) {
            this.a.remove(h70);
        }
    }

    public final QG e(H70 h70) {
        KI0 ki0B = this.c.b(h70);
        if (ki0B == null) {
            return null;
        }
        return ki0B instanceof QG ? (QG) ki0B : new QG(ki0B, true);
    }

    public final ReferenceQueue f() {
        if (this.h == null) {
            this.h = new ReferenceQueue();
            Looper.myQueue().addIdleHandler(new d(this.e, this.h));
        }
        return this.h;
    }

    public c g(H70 h70, int i, int i2, InterfaceC2177Rv interfaceC2177Rv, InterfaceC2283Sv interfaceC2283Sv, InterfaceC6983o51 interfaceC6983o51, WI0 wi0, EnumC9190vz0 enumC9190vz0, boolean z, EnumC4772gC enumC4772gC, MI0 mi0) {
        AbstractC6559mb1.b();
        long jB = AbstractC1357Kd0.b();
        OG ogA = this.b.a(interfaceC2177Rv.getId(), h70, i, i2, interfaceC2283Sv.f(), interfaceC2283Sv.e(), interfaceC6983o51, interfaceC2283Sv.d(), wi0, interfaceC2283Sv.b());
        QG qgI = i(ogA, z);
        if (qgI != null) {
            mi0.d(qgI);
            if (Log.isLoggable("Engine", 2)) {
                j("Loaded resource from cache", jB, ogA);
            }
            return null;
        }
        QG qgH = h(ogA, z);
        if (qgH != null) {
            mi0.d(qgH);
            if (Log.isLoggable("Engine", 2)) {
                j("Loaded resource from active resources", jB, ogA);
            }
            return null;
        }
        MG mg = (MG) this.a.get(ogA);
        if (mg != null) {
            mg.e(mi0);
            if (Log.isLoggable("Engine", 2)) {
                j("Added to existing load", jB, ogA);
            }
            return new c(mi0, mg);
        }
        MG mgA = this.d.a(ogA, z);
        RG rg = new RG(mgA, new C0704Dw(ogA, i, i2, interfaceC2177Rv, interfaceC2283Sv, interfaceC6983o51, wi0, this.g, enumC4772gC, enumC9190vz0), enumC9190vz0);
        this.a.put(ogA, mgA);
        mgA.e(mi0);
        mgA.m(rg);
        if (Log.isLoggable("Engine", 2)) {
            j("Started new load", jB, ogA);
        }
        return new c(mi0, mgA);
    }

    public final QG h(H70 h70, boolean z) {
        WeakReference weakReference;
        if (!z || (weakReference = (WeakReference) this.e.get(h70)) == null) {
            return null;
        }
        QG qg = (QG) weakReference.get();
        if (qg != null) {
            qg.b();
            return qg;
        }
        this.e.remove(h70);
        return qg;
    }

    public final QG i(H70 h70, boolean z) {
        if (!z) {
            return null;
        }
        QG qgE = e(h70);
        if (qgE != null) {
            qgE.b();
            this.e.put(h70, new e(h70, qgE, f()));
        }
        return qgE;
    }

    public void k(KI0 ki0) {
        AbstractC6559mb1.b();
        if (!(ki0 instanceof QG)) {
            throw new IllegalArgumentException("Cannot release anything but an EngineResource");
        }
        ((QG) ki0).e();
    }

    public KG(InterfaceC6319lj0 interfaceC6319lj0, InterfaceC4204eC.a aVar, ExecutorService executorService, ExecutorService executorService2, Map map, PG pg, Map map2, a aVar2, VI0 vi0) {
        this.c = interfaceC6319lj0;
        this.g = new b(aVar);
        this.e = map2 == null ? new HashMap() : map2;
        this.b = pg == null ? new PG() : pg;
        this.a = map == null ? new HashMap() : map;
        this.d = aVar2 == null ? new a(executorService, executorService2, this) : aVar2;
        this.f = vi0 == null ? new VI0() : vi0;
        interfaceC6319lj0.e(this);
    }
}
