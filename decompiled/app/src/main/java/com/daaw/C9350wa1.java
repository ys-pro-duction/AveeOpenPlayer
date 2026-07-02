package com.daaw;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.daaw.AbstractC2835Yd;
import com.daaw.C0629Dd0;
import com.daaw.InterfaceC3591c01;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.daaw.wa1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C9350wa1 {
    public final Context a;
    public final InterfaceC2627Wd b;
    public final XH c;
    public final InterfaceC1689Ni1 d;
    public final Executor e;
    public final InterfaceC3591c01 f;
    public final InterfaceC6333lm g;
    public final InterfaceC6333lm h;
    public final InterfaceC2033Ql i;

    public C9350wa1(Context context, InterfaceC2627Wd interfaceC2627Wd, XH xh, InterfaceC1689Ni1 interfaceC1689Ni1, Executor executor, InterfaceC3591c01 interfaceC3591c01, InterfaceC6333lm interfaceC6333lm, InterfaceC6333lm interfaceC6333lm2, InterfaceC2033Ql interfaceC2033Ql) {
        this.a = context;
        this.b = interfaceC2627Wd;
        this.c = xh;
        this.d = interfaceC1689Ni1;
        this.e = executor;
        this.f = interfaceC3591c01;
        this.g = interfaceC6333lm;
        this.h = interfaceC6333lm2;
        this.i = interfaceC2033Ql;
    }

    public static /* synthetic */ Object b(C9350wa1 c9350wa1, Iterable iterable, H51 h51, long j) {
        c9350wa1.c.U0(iterable);
        c9350wa1.c.P(h51, c9350wa1.g.a() + j);
        return null;
    }

    public static /* synthetic */ Object c(C9350wa1 c9350wa1) {
        c9350wa1.i.a();
        return null;
    }

    public static /* synthetic */ Object e(C9350wa1 c9350wa1, Iterable iterable) {
        c9350wa1.c.q(iterable);
        return null;
    }

    public static /* synthetic */ Object f(C9350wa1 c9350wa1, H51 h51, int i) {
        c9350wa1.d.a(h51, i + 1);
        return null;
    }

    public static /* synthetic */ Object g(C9350wa1 c9350wa1, H51 h51, long j) {
        c9350wa1.c.P(h51, c9350wa1.g.a() + j);
        return null;
    }

    public static /* synthetic */ Object h(C9350wa1 c9350wa1, Map map) {
        c9350wa1.getClass();
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            c9350wa1.i.j(((Integer) r0.getValue()).intValue(), C0629Dd0.b.INVALID_PAYLOD, (String) ((Map.Entry) it.next()).getKey());
        }
        return null;
    }

    public static /* synthetic */ void i(final C9350wa1 c9350wa1, final H51 h51, final int i, Runnable runnable) {
        c9350wa1.getClass();
        try {
            try {
                InterfaceC3591c01 interfaceC3591c01 = c9350wa1.f;
                final XH xh = c9350wa1.c;
                Objects.requireNonNull(xh);
                interfaceC3591c01.d(new InterfaceC3591c01.a() { // from class: com.daaw.na1
                    @Override // com.daaw.InterfaceC3591c01.a
                    public final Object a() {
                        return Integer.valueOf(xh.n());
                    }
                });
                if (c9350wa1.k()) {
                    c9350wa1.l(h51, i);
                } else {
                    c9350wa1.f.d(new InterfaceC3591c01.a() { // from class: com.daaw.oa1
                        @Override // com.daaw.InterfaceC3591c01.a
                        public final Object a() {
                            return C9350wa1.f(this.a, h51, i);
                        }
                    });
                }
                runnable.run();
            } catch (C3313b01 unused) {
                c9350wa1.d.a(h51, i + 1);
                runnable.run();
            }
        } catch (Throwable th) {
            runnable.run();
            throw th;
        }
    }

    public KH j(G51 g51) {
        InterfaceC3591c01 interfaceC3591c01 = this.f;
        final InterfaceC2033Ql interfaceC2033Ql = this.i;
        Objects.requireNonNull(interfaceC2033Ql);
        return g51.b(KH.a().i(this.g.a()).k(this.h.a()).j("GDT_CLIENT_METRICS").h(new C10105zG(EG.b("proto"), ((C2659Wl) interfaceC3591c01.d(new InterfaceC3591c01.a() { // from class: com.daaw.ma1
            @Override // com.daaw.InterfaceC3591c01.a
            public final Object a() {
                return interfaceC2033Ql.c();
            }
        })).f())).d());
    }

    public boolean k() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.a.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public AbstractC2835Yd l(final H51 h51, int i) {
        AbstractC2835Yd abstractC2835YdA;
        G51 g51A = this.b.a(h51.b());
        AbstractC2835Yd abstractC2835YdE = AbstractC2835Yd.e(0L);
        final long j = 0;
        while (((Boolean) this.f.d(new InterfaceC3591c01.a() { // from class: com.daaw.pa1
            @Override // com.daaw.InterfaceC3591c01.a
            public final Object a() {
                return Boolean.valueOf(this.a.c.D(h51));
            }
        })).booleanValue()) {
            final Iterable iterable = (Iterable) this.f.d(new InterfaceC3591c01.a() { // from class: com.daaw.qa1
                @Override // com.daaw.InterfaceC3591c01.a
                public final Object a() {
                    return this.a.c.a0(h51);
                }
            });
            if (!iterable.iterator().hasNext()) {
                return abstractC2835YdE;
            }
            if (g51A == null) {
                AbstractC2732Xd0.b("Uploader", "Unknown backend for %s, deleting event batch for it...", h51);
                abstractC2835YdA = AbstractC2835Yd.a();
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(((AbstractC1628Mt0) it.next()).b());
                }
                if (h51.e()) {
                    arrayList.add(j(g51A));
                }
                abstractC2835YdA = g51A.a(AbstractC2731Xd.a().b(arrayList).c(h51.c()).a());
            }
            abstractC2835YdE = abstractC2835YdA;
            if (abstractC2835YdE.c() == AbstractC2835Yd.a.TRANSIENT_ERROR) {
                final H51 h512 = h51;
                this.f.d(new InterfaceC3591c01.a() { // from class: com.daaw.ra1
                    @Override // com.daaw.InterfaceC3591c01.a
                    public final Object a() {
                        return C9350wa1.b(this.a, iterable, h512, j);
                    }
                });
                this.d.b(h512, i + 1, true);
                return abstractC2835YdE;
            }
            H51 h513 = h51;
            this.f.d(new InterfaceC3591c01.a() { // from class: com.daaw.sa1
                @Override // com.daaw.InterfaceC3591c01.a
                public final Object a() {
                    return C9350wa1.e(this.a, iterable);
                }
            });
            if (abstractC2835YdE.c() == AbstractC2835Yd.a.OK) {
                long jMax = Math.max(j, abstractC2835YdE.b());
                if (h513.e()) {
                    this.f.d(new InterfaceC3591c01.a() { // from class: com.daaw.ta1
                        @Override // com.daaw.InterfaceC3591c01.a
                        public final Object a() {
                            return C9350wa1.c(this.a);
                        }
                    });
                }
                j = jMax;
            } else if (abstractC2835YdE.c() == AbstractC2835Yd.a.INVALID_PAYLOAD) {
                final HashMap map = new HashMap();
                Iterator it2 = iterable.iterator();
                while (it2.hasNext()) {
                    String strJ = ((AbstractC1628Mt0) it2.next()).b().j();
                    if (map.containsKey(strJ)) {
                        map.put(strJ, Integer.valueOf(((Integer) map.get(strJ)).intValue() + 1));
                    } else {
                        map.put(strJ, 1);
                    }
                }
                this.f.d(new InterfaceC3591c01.a() { // from class: com.daaw.ua1
                    @Override // com.daaw.InterfaceC3591c01.a
                    public final Object a() {
                        return C9350wa1.h(this.a, map);
                    }
                });
            }
            h51 = h513;
        }
        final H51 h514 = h51;
        this.f.d(new InterfaceC3591c01.a() { // from class: com.daaw.va1
            @Override // com.daaw.InterfaceC3591c01.a
            public final Object a() {
                return C9350wa1.g(this.a, h514, j);
            }
        });
        return abstractC2835YdE;
    }

    public void m(final H51 h51, final int i, final Runnable runnable) {
        this.e.execute(new Runnable() { // from class: com.daaw.la1
            @Override // java.lang.Runnable
            public final void run() {
                C9350wa1.i(this.B, h51, i, runnable);
            }
        });
    }
}
