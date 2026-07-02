package com.daaw.avee;

import android.app.Activity;
import android.content.Context;
import com.daaw.AbstractActivityC5776jo;
import com.daaw.AbstractC0441Bk1;
import com.daaw.AbstractC1349Kb0;
import com.daaw.AbstractC1623Ms;
import com.daaw.AbstractC1765Ob1;
import com.daaw.AbstractC1868Pb0;
import com.daaw.AbstractC2911Yw;
import com.daaw.AbstractC4801gJ0;
import com.daaw.AbstractC5624jG0;
import com.daaw.AbstractC6170lA0;
import com.daaw.AbstractC9104vh;
import com.daaw.C0612Db0;
import com.daaw.C0676Dp;
import com.daaw.C0746Eg1;
import com.daaw.C0797Et0;
import com.daaw.C10015yw0;
import com.daaw.C1104Hs;
import com.daaw.C1158If1;
import com.daaw.C1312Js;
import com.daaw.C1989Qf1;
import com.daaw.C2221Sf1;
import com.daaw.C2429Uf1;
import com.daaw.C2515Vb;
import com.daaw.C2537Vg1;
import com.daaw.C2600Vw0;
import com.daaw.C2604Vx0;
import com.daaw.C3207ae0;
import com.daaw.C4268eS;
import com.daaw.C4620fg0;
import com.daaw.C5415iX0;
import com.daaw.C5564j3;
import com.daaw.C6803nT;
import com.daaw.C7110oa;
import com.daaw.C7151oi0;
import com.daaw.C7342pO0;
import com.daaw.C7833r80;
import com.daaw.C8178sO0;
import com.daaw.C8899uw0;
import com.daaw.C8974vC0;
import com.daaw.C9732xv0;
import com.daaw.C9839yJ0;
import com.daaw.EV;
import com.daaw.G10;
import com.daaw.G91;
import com.daaw.HT0;
import com.daaw.I10;
import com.daaw.InterfaceC1416Ks;
import com.daaw.InterfaceC3429bR;
import com.daaw.InterfaceC7484pt;
import com.daaw.KT0;
import com.daaw.NU0;
import com.daaw.SZ0;
import com.daaw.V9;
import com.daaw.WB0;
import com.daaw.X60;
import com.daaw.X61;
import com.daaw.avee.comp.playback.MediaPlaybackService;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static final C0151a d = new C0151a(null);
    public static final int e = 8;
    public static final Object f = new Object();
    public static volatile a g;
    public boolean a;
    public final List b;
    public List c;

    /* JADX INFO: renamed from: com.daaw.avee.a$a, reason: collision with other inner class name */
    public static final class C0151a {
        public /* synthetic */ C0151a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public final Context a() {
            return b();
        }

        public final Context b() {
            return MainActivity.INSTANCE.e();
        }

        public final Activity c() {
            return MainActivity.INSTANCE.e();
        }

        public final Context d() {
            Context applicationContext;
            MainActivity mainActivityE = MainActivity.INSTANCE.e();
            if (mainActivityE != null && (applicationContext = mainActivityE.getApplicationContext()) != null) {
                return applicationContext;
            }
            MediaPlaybackService mediaPlaybackServiceD = MediaPlaybackService.D();
            Context applicationContext2 = mediaPlaybackServiceD != null ? mediaPlaybackServiceD.getApplicationContext() : null;
            if (applicationContext2 != null) {
                return applicationContext2;
            }
            AbstractC0441Bk1.c("app context is null");
            return null;
        }

        public final a e() {
            a aVar;
            AbstractC2911Yw abstractC2911Yw = null;
            if (a.g == null) {
                synchronized (a.f) {
                    try {
                        if (a.g == null) {
                            a aVar2 = new a(abstractC2911Yw);
                            aVar2.l();
                            a.g = aVar2;
                        }
                        G91 g91 = G91.a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } else {
                a aVar3 = a.g;
                G10.d(aVar3);
                if (!aVar3.a && (aVar = a.g) != null) {
                    aVar.m((WB0) C7833r80.a.a().e().b().c(AbstractC5624jG0.b(WB0.class), null, null));
                }
            }
            return a.g;
        }

        public C0151a() {
        }
    }

    public static final class b extends SZ0 implements InterfaceC3429bR {
        public int F;
        public final /* synthetic */ Activity H;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Activity activity, InterfaceC1416Ks interfaceC1416Ks) {
            super(2, interfaceC1416Ks);
            this.H = activity;
        }

        @Override // com.daaw.AbstractC7409pe
        public final InterfaceC1416Ks a(Object obj, InterfaceC1416Ks interfaceC1416Ks) {
            return a.this.new b(this.H, interfaceC1416Ks);
        }

        @Override // com.daaw.AbstractC7409pe
        public final Object q(Object obj) throws Throwable {
            Object objC = I10.c();
            int i = this.F;
            if (i == 0) {
                AbstractC4801gJ0.b(obj);
                a aVar = a.this;
                Activity activity = this.H;
                this.F = 1;
                if (aVar.o(activity, this) == objC) {
                    return objC;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC4801gJ0.b(obj);
            }
            return G91.a;
        }

        @Override // com.daaw.InterfaceC3429bR
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC7484pt interfaceC7484pt, InterfaceC1416Ks interfaceC1416Ks) {
            return ((b) a(interfaceC7484pt, interfaceC1416Ks)).q(G91.a);
        }
    }

    public static final class d extends AbstractC1623Ms {
        public Object E;
        public Object F;
        public Object G;
        public Object H;
        public Object I;
        public Object J;
        public Object K;
        public Object L;
        public int M;
        public int N;
        public /* synthetic */ Object O;
        public int Q;

        public d(InterfaceC1416Ks interfaceC1416Ks) {
            super(interfaceC1416Ks);
        }

        @Override // com.daaw.AbstractC7409pe
        public final Object q(Object obj) {
            this.O = obj;
            this.Q |= Integer.MIN_VALUE;
            return a.this.o(null, this);
        }
    }

    public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
        this();
    }

    public static final Context h() {
        return d.a();
    }

    public static final Context i() {
        return d.b();
    }

    public static final Activity j() {
        return d.c();
    }

    public static final Context k() {
        return d.d();
    }

    public static final Boolean n(X60 x60) {
        G10.g(x60, "$tmp0");
        return (Boolean) x60.invoke();
    }

    public static final a p() {
        return d.e();
    }

    public final void l() {
        AbstractC1765Ob1.c();
        this.b.clear();
        List list = this.b;
        list.add(new C4268eS());
        list.add(new V9());
        list.add(new C7342pO0());
        list.add(new C8178sO0());
        list.add(new KT0());
        list.add(new C0612Db0());
        C1989Qf1 c1989Qf1 = new C1989Qf1();
        list.add(c1989Qf1);
        list.add(new C9732xv0());
        C5415iX0 c5415iX0 = new C5415iX0();
        C8899uw0 c8899uw0 = new C8899uw0(c5415iX0);
        list.add(c8899uw0);
        C4620fg0 c4620fg0 = new C4620fg0();
        list.add(c4620fg0);
        list.add(new C0676Dp());
        list.add(new NU0());
        list.add(new C2600Vw0());
        list.add(new C10015yw0());
        list.add(new C1312Js());
        list.add(new C2515Vb());
        list.add(new C7110oa());
        C2537Vg1 c2537Vg1A = C2537Vg1.a();
        G10.f(c2537Vg1A, "createInstance(...)");
        list.add(c2537Vg1A);
        list.add(new C2221Sf1(c1989Qf1, c8899uw0, c4620fg0));
        list.add(new C9839yJ0());
        list.add(new EV());
        list.add(c5415iX0);
        list.add(new C0797Et0());
        list.add(new C3207ae0());
        list.add(new C2429Uf1());
        list.add(new C1158If1());
        list.add(new X61());
        C8974vC0.c();
        C1104Hs.j();
        HT0.c();
        C6803nT.a();
        C7151oi0.q();
    }

    public final void m(WB0 wb0) {
        AbstractC1349Kb0 abstractC1349Kb0A;
        C0746Eg1 c0746Eg1 = new C0746Eg1();
        final AbstractC6170lA0 abstractC6170lA0 = new AbstractC6170lA0(wb0) { // from class: com.daaw.avee.a.c
            @Override // com.daaw.X60
            public Object get() {
                return Boolean.valueOf(((WB0) this.receiver).m0());
            }
        };
        c0746Eg1.b(new C0746Eg1.a() { // from class: com.daaw.zw0
            @Override // com.daaw.C0746Eg1.a
            public final Object invoke() {
                return com.daaw.avee.a.n(abstractC6170lA0);
            }
        }, this.c);
        List list = this.b;
        list.add(new C5564j3());
        list.add(new C2604Vx0(c0746Eg1));
        this.a = true;
        C0151a c0151a = d;
        Activity activityC = c0151a.c();
        if (activityC != null) {
            Activity activityC2 = c0151a.c();
            AbstractActivityC5776jo abstractActivityC5776jo = activityC2 instanceof AbstractActivityC5776jo ? (AbstractActivityC5776jo) activityC2 : null;
            if (abstractActivityC5776jo == null || (abstractC1349Kb0A = AbstractC1868Pb0.a(abstractActivityC5776jo)) == null) {
                return;
            }
            AbstractC9104vh.d(abstractC1349Kb0A, null, null, new b(activityC, null), 3, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object o(android.app.Activity r12, com.daaw.InterfaceC1416Ks r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 267
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.avee.a.o(android.app.Activity, com.daaw.Ks):java.lang.Object");
    }

    public a() {
        this.b = new ArrayList(30);
        this.c = new LinkedList();
    }
}
