package com.daaw;

import android.app.Activity;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.c;
import com.android.billingclient.api.f;
import com.android.billingclient.api.g;
import j$.util.Objects;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.uf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C8808uf implements InterfaceC3648cC0, InterfaceC5282i2, InterfaceC3370bC0, InterfaceC9807yB0 {
    public static final b i = new b(null);
    public static final int j = 8;
    public static final C9380wg1 k = new C9380wg1();
    public final Activity a;
    public final a b;
    public com.android.billingclient.api.a c;
    public boolean d;
    public final List e;
    public List f;
    public int g;
    public int h;

    /* JADX INFO: renamed from: com.daaw.uf$a */
    public interface a {
        void a();

        void b();

        void c(List list, boolean z);

        void d(List list);
    }

    /* JADX INFO: renamed from: com.daaw.uf$b */
    public static final class b {
        public /* synthetic */ b(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public final f.c a(com.android.billingclient.api.f fVar) {
            f.e eVar;
            f.d dVarE;
            List listA;
            G10.g(fVar, "productDetails");
            List listE = fVar.e();
            if (listE == null || (eVar = (f.e) listE.get(0)) == null || (dVarE = eVar.e()) == null || (listA = dVarE.a()) == null) {
                return null;
            }
            return (f.c) listA.get(0);
        }

        public b() {
        }
    }

    /* JADX INFO: renamed from: com.daaw.uf$c */
    public static final class c implements InterfaceC7135of {
        public final /* synthetic */ Runnable b;
        public final /* synthetic */ Runnable c;

        public c(Runnable runnable, Runnable runnable2) {
            this.b = runnable;
            this.c = runnable2;
        }

        @Override // com.daaw.InterfaceC7135of
        public void onBillingServiceDisconnected() {
            C8808uf.this.d = false;
        }

        @Override // com.daaw.InterfaceC7135of
        public void onBillingSetupFinished(com.android.billingclient.api.d dVar) {
            G10.g(dVar, "billingResult");
            C8808uf.this.w(dVar.b());
            C8808uf.this.d = dVar.b() == 0;
            if (C8808uf.this.d) {
                Runnable runnable = this.b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            }
            Runnable runnable2 = this.c;
            if (runnable2 != null) {
                runnable2.run();
            }
        }
    }

    public C8808uf(Activity activity, a aVar) {
        G10.g(activity, "activity");
        G10.g(aVar, "billingUpdatesListener");
        this.a = activity;
        this.b = aVar;
        this.c = com.android.billingclient.api.a.g(activity).b().d(this).a();
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.h = -1;
        x(new Runnable() { // from class: com.daaw.pf
            @Override // java.lang.Runnable
            public final void run() {
                C8808uf.i(this.B);
            }
        }, new Runnable() { // from class: com.daaw.qf
            @Override // java.lang.Runnable
            public final void run() {
                C8808uf.j(this.B);
            }
        });
    }

    public static final void i(C8808uf c8808uf) {
        G10.g(c8808uf, "this$0");
        c8808uf.b.b();
        c8808uf.u();
    }

    public static final void j(C8808uf c8808uf) {
        G10.g(c8808uf, "this$0");
        c8808uf.b.a();
    }

    public static final void p(C8808uf c8808uf, List list, InterfaceC1548Lz0 interfaceC1548Lz0) {
        G10.g(c8808uf, "this$0");
        com.android.billingclient.api.a aVar = c8808uf.c;
        if (aVar != null) {
            g.a aVarA = com.android.billingclient.api.g.a();
            G10.d(list);
            com.android.billingclient.api.g gVarA = aVarA.b(list).a();
            G10.d(interfaceC1548Lz0);
            aVar.h(gVarA, interfaceC1548Lz0);
        }
    }

    public static final void t(com.android.billingclient.api.f fVar, Purchase purchase, C8808uf c8808uf) {
        G10.g(fVar, "$productDetails");
        G10.g(c8808uf, "this$0");
        Objects.toString(fVar);
        c.a aVarA = com.android.billingclient.api.c.a();
        c.b.a aVarC = c.b.a().c(fVar);
        List listE = fVar.e();
        G10.d(listE);
        c.a aVarD = aVarA.d(AbstractC1496Lm.e(aVarC.b(((f.e) listE.get(0)).d()).a()));
        G10.f(aVarD, "setProductDetailsParamsList(...)");
        if (purchase != null) {
            aVarD.e(c.C0042c.a().b(purchase.f()).d(3).a());
        }
        com.android.billingclient.api.a aVar = c8808uf.c;
        if (aVar != null) {
            aVar.f(c8808uf.a, aVarD.a());
        }
    }

    public static final void v(C8808uf c8808uf) {
        G10.g(c8808uf, "this$0");
        c8808uf.e.clear();
        c8808uf.f.clear();
        c8808uf.g = 0;
        com.android.billingclient.api.a aVar = c8808uf.c;
        if (aVar != null) {
            aVar.i(C7015oC0.a().b("subs").a(), c8808uf);
        }
        com.android.billingclient.api.a aVar2 = c8808uf.c;
        if (aVar2 != null) {
            aVar2.i(C7015oC0.a().b("inapp").a(), c8808uf);
        }
        com.android.billingclient.api.a aVar3 = c8808uf.c;
        if (aVar3 != null) {
            aVar3.j(C7294pC0.a().b("subs").a(), c8808uf);
        }
        com.android.billingclient.api.a aVar4 = c8808uf.c;
        if (aVar4 != null) {
            aVar4.j(C7294pC0.a().b("inapp").a(), c8808uf);
        }
    }

    @Override // com.daaw.InterfaceC3370bC0
    public void a(com.android.billingclient.api.d dVar, List list) {
        G10.g(dVar, "result");
        G10.g(list, "list");
        this.g++;
        if (this.c == null || dVar.b() != 0) {
            return;
        }
        onPurchasesUpdated(dVar, list);
    }

    @Override // com.daaw.InterfaceC5282i2
    public void b(com.android.billingclient.api.d dVar) {
        G10.g(dVar, "billingResult");
        dVar.a();
    }

    @Override // com.daaw.InterfaceC9807yB0
    public void c(com.android.billingclient.api.d dVar, List list) {
        G10.g(dVar, "result");
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return;
        }
        this.f = list;
        this.b.d(list);
    }

    public final void m() {
        com.android.billingclient.api.a aVar = this.c;
        if (aVar != null) {
            if (aVar.e()) {
                aVar.c();
            }
            this.c = null;
        }
    }

    public final void n(Runnable runnable) {
        if (this.d) {
            runnable.run();
        } else {
            x(runnable, null);
        }
    }

    public final void o(final List list, final InterfaceC1548Lz0 interfaceC1548Lz0) {
        n(new Runnable() { // from class: com.daaw.tf
            @Override // java.lang.Runnable
            public final void run() {
                C8808uf.p(this.B, list, interfaceC1548Lz0);
            }
        });
    }

    @Override // com.daaw.InterfaceC3648cC0
    public void onPurchasesUpdated(com.android.billingclient.api.d dVar, List list) {
        G10.g(dVar, "billingResult");
        if (dVar.b() != 0) {
            if (dVar.b() == 1) {
                return;
            }
            dVar.b();
        } else {
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    r((Purchase) it.next());
                }
            }
            this.b.c(this.e, this.g >= 2);
        }
    }

    public final int q() {
        return this.h;
    }

    public final void r(Purchase purchase) {
        com.android.billingclient.api.a aVar;
        String strB = purchase.b();
        G10.f(strB, "getOriginalJson(...)");
        String strG = purchase.g();
        G10.f(strG, "getSignature(...)");
        if (!y(strB, strG)) {
            purchase.toString();
            return;
        }
        if (purchase.d() == 1 && !purchase.h() && (aVar = this.c) != null) {
            aVar.a(C5003h2.b().b(purchase.f()).a(), this);
        }
        this.e.add(purchase);
    }

    public final void s(final com.android.billingclient.api.f fVar, final Purchase purchase) {
        G10.g(fVar, "productDetails");
        n(new Runnable() { // from class: com.daaw.sf
            @Override // java.lang.Runnable
            public final void run() {
                C8808uf.t(fVar, purchase, this);
            }
        });
    }

    public final void u() {
        n(new Runnable() { // from class: com.daaw.rf
            @Override // java.lang.Runnable
            public final void run() {
                C8808uf.v(this.B);
            }
        });
    }

    public final void w(int i2) {
        this.h = i2;
    }

    public final void x(Runnable runnable, Runnable runnable2) {
        com.android.billingclient.api.a aVar = this.c;
        if (aVar != null) {
            aVar.l(new c(runnable, runnable2));
        }
    }

    public final boolean y(String str, String str2) {
        try {
            return AO0.a.d((String) k.a("M", ""), str, str2);
        } catch (IOException unused) {
            return false;
        }
    }
}
