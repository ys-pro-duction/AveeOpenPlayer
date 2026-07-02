package com.android.billingclient.api;

import android.R;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.view.View;
import com.android.billingclient.api.c;
import com.android.billingclient.api.g;
import com.daaw.AbstractC0481Bu1;
import com.daaw.AbstractC1601Mm1;
import com.daaw.AbstractC2227Sh;
import com.daaw.AbstractC6314li0;
import com.daaw.AbstractC7363pT1;
import com.daaw.AbstractC9714xr1;
import com.daaw.C3355b83;
import com.daaw.C3733cX1;
import com.daaw.C5003h2;
import com.daaw.C5017h43;
import com.daaw.C5134hW2;
import com.daaw.C7015oC0;
import com.daaw.C7294pC0;
import com.daaw.C7474pr;
import com.daaw.C8458tO1;
import com.daaw.C9048vU2;
import com.daaw.C9343wY2;
import com.daaw.CallableC1030Gz1;
import com.daaw.CallableC2609Vy1;
import com.daaw.Ei3;
import com.daaw.FS1;
import com.daaw.G33;
import com.daaw.InterfaceC1548Lz0;
import com.daaw.InterfaceC3182aZ;
import com.daaw.InterfaceC3370bC0;
import com.daaw.InterfaceC3648cC0;
import com.daaw.InterfaceC5282i2;
import com.daaw.InterfaceC7135of;
import com.daaw.InterfaceC7753qr;
import com.daaw.InterfaceC9807yB0;
import com.daaw.J63;
import com.daaw.JC1;
import com.daaw.JS2;
import com.daaw.Ko3;
import com.daaw.L82;
import com.daaw.NN1;
import com.daaw.O72;
import com.daaw.TR2;
import com.daaw.ThreadFactoryC7228oy1;
import com.daaw.UY1;
import com.daaw.VT1;
import com.daaw.ZU2;
import com.daaw.ZY;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;

/* JADX INFO: loaded from: classes.dex */
public class b extends a {
    public boolean A;
    public ExecutorService B;
    public volatile int a;
    public final String b;
    public final Handler c;
    public volatile Ei3 d;
    public Context e;
    public VT1 f;
    public volatile Ko3 g;
    public volatile h h;
    public boolean i;
    public boolean j;
    public int k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public e z;

    public b(String str, Context context, VT1 vt1, ExecutorService executorService) {
        this.a = 0;
        this.c = new Handler(Looper.getMainLooper());
        this.k = 0;
        String strT = T();
        this.b = strT;
        this.e = context.getApplicationContext();
        G33 g33A = C5017h43.A();
        g33A.l(strT);
        g33A.k(this.e.getPackageName());
        this.f = new C3733cX1(this.e, (C5017h43) g33A.e());
        this.e.getPackageName();
    }

    public static /* bridge */ /* synthetic */ O72 M(b bVar, String str, int i) {
        JC1.i("BillingClient", "Querying owned items, item type: ".concat(String.valueOf(str)));
        ArrayList arrayList = new ArrayList();
        Bundle bundleC = JC1.c(bVar.n, bVar.v, bVar.z.a(), bVar.z.b(), bVar.b);
        List list = null;
        String string = null;
        while (true) {
            try {
                Bundle bundleD2 = bVar.n ? bVar.g.D2(true != bVar.v ? 9 : 19, bVar.e.getPackageName(), str, string, bundleC) : bVar.g.P0(3, bVar.e.getPackageName(), str, string);
                L82 l82A = p.a(bundleD2, "BillingClient", "getPurchase()");
                d dVarA = l82A.a();
                if (dVarA != i.l) {
                    bVar.V(AbstractC7363pT1.a(l82A.b(), 9, dVarA));
                    return new O72(dVarA, list);
                }
                ArrayList<String> stringArrayList = bundleD2.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                ArrayList<String> stringArrayList2 = bundleD2.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                ArrayList<String> stringArrayList3 = bundleD2.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                boolean z = false;
                for (int i2 = 0; i2 < stringArrayList2.size(); i2++) {
                    String str2 = stringArrayList2.get(i2);
                    String str3 = stringArrayList3.get(i2);
                    JC1.i("BillingClient", "Sku is owned: ".concat(String.valueOf(stringArrayList.get(i2))));
                    try {
                        Purchase purchase = new Purchase(str2, str3);
                        if (TextUtils.isEmpty(purchase.f())) {
                            JC1.j("BillingClient", "BUG: empty/null token!");
                            z = true;
                        }
                        arrayList.add(purchase);
                    } catch (JSONException e) {
                        JC1.k("BillingClient", "Got an exception trying to decode the purchase!", e);
                        d dVar = i.j;
                        bVar.V(AbstractC7363pT1.a(51, 9, dVar));
                        return new O72(dVar, null);
                    }
                }
                if (z) {
                    bVar.V(AbstractC7363pT1.a(26, 9, i.j));
                }
                string = bundleD2.getString("INAPP_CONTINUATION_TOKEN");
                JC1.i("BillingClient", "Continuation token: ".concat(String.valueOf(string)));
                if (TextUtils.isEmpty(string)) {
                    return new O72(i.l, arrayList);
                }
                list = null;
            } catch (Exception e2) {
                d dVar2 = i.m;
                bVar.V(AbstractC7363pT1.a(52, 9, dVar2));
                JC1.k("BillingClient", "Got exception trying to get purchasesm try to reconnect", e2);
                return new O72(dVar2, null);
            }
        }
    }

    public static String T() {
        try {
            return (String) Class.forName("com.android.billingclient.ktx.BuildConfig").getField("VERSION_NAME").get(null);
        } catch (Exception unused) {
            return "7.0.0";
        }
    }

    public static /* bridge */ /* synthetic */ C8458tO1 g0(b bVar, String str) {
        JC1.i("BillingClient", "Querying purchase history, item type: ".concat(String.valueOf(str)));
        ArrayList arrayList = new ArrayList();
        Bundle bundleC = JC1.c(bVar.n, bVar.v, bVar.z.a(), bVar.z.b(), bVar.b);
        String string = null;
        while (bVar.l) {
            try {
                Bundle bundleP0 = bVar.g.p0(6, bVar.e.getPackageName(), str, string, bundleC);
                L82 l82A = p.a(bundleP0, "BillingClient", "getPurchaseHistory()");
                d dVarA = l82A.a();
                if (dVarA != i.l) {
                    bVar.V(AbstractC7363pT1.a(l82A.b(), 11, dVarA));
                    return new C8458tO1(dVarA, null);
                }
                ArrayList<String> stringArrayList = bundleP0.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                ArrayList<String> stringArrayList2 = bundleP0.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                ArrayList<String> stringArrayList3 = bundleP0.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                boolean z = false;
                for (int i = 0; i < stringArrayList2.size(); i++) {
                    String str2 = stringArrayList2.get(i);
                    String str3 = stringArrayList3.get(i);
                    JC1.i("BillingClient", "Purchase record found for sku : ".concat(String.valueOf(stringArrayList.get(i))));
                    try {
                        PurchaseHistoryRecord purchaseHistoryRecord = new PurchaseHistoryRecord(str2, str3);
                        if (TextUtils.isEmpty(purchaseHistoryRecord.d())) {
                            JC1.j("BillingClient", "BUG: empty/null token!");
                            z = true;
                        }
                        arrayList.add(purchaseHistoryRecord);
                    } catch (JSONException e) {
                        JC1.k("BillingClient", "Got an exception trying to decode the purchase!", e);
                        d dVar = i.j;
                        bVar.V(AbstractC7363pT1.a(51, 11, dVar));
                        return new C8458tO1(dVar, null);
                    }
                }
                if (z) {
                    bVar.V(AbstractC7363pT1.a(26, 11, i.j));
                }
                string = bundleP0.getString("INAPP_CONTINUATION_TOKEN");
                JC1.i("BillingClient", "Continuation token: ".concat(String.valueOf(string)));
                if (TextUtils.isEmpty(string)) {
                    return new C8458tO1(i.l, arrayList);
                }
            } catch (RemoteException e2) {
                JC1.k("BillingClient", "Got exception trying to get purchase history, try to reconnect", e2);
                d dVar2 = i.m;
                bVar.V(AbstractC7363pT1.a(59, 11, dVar2));
                return new C8458tO1(dVar2, null);
            }
        }
        JC1.j("BillingClient", "getPurchaseHistory is not supported on current device");
        return new C8458tO1(i.q, null);
    }

    public final /* synthetic */ void E(InterfaceC5282i2 interfaceC5282i2) {
        d dVar = i.n;
        V(AbstractC7363pT1.a(24, 3, dVar));
        interfaceC5282i2.b(dVar);
    }

    public final /* synthetic */ void F(d dVar) {
        if (this.d.d() != null) {
            this.d.d().onPurchasesUpdated(dVar, null);
        } else {
            JC1.j("BillingClient", "No valid listener is set in BroadcastManager");
        }
    }

    public final /* synthetic */ void G(InterfaceC7753qr interfaceC7753qr, C7474pr c7474pr) {
        d dVar = i.n;
        V(AbstractC7363pT1.a(24, 4, dVar));
        interfaceC7753qr.a(dVar, c7474pr.a());
    }

    public final /* synthetic */ void H(InterfaceC1548Lz0 interfaceC1548Lz0) {
        d dVar = i.n;
        V(AbstractC7363pT1.a(24, 7, dVar));
        interfaceC1548Lz0.a(dVar, new ArrayList());
    }

    public final /* synthetic */ void J(InterfaceC9807yB0 interfaceC9807yB0) {
        d dVar = i.n;
        V(AbstractC7363pT1.a(24, 11, dVar));
        interfaceC9807yB0.c(dVar, null);
    }

    public final /* synthetic */ void K(InterfaceC3370bC0 interfaceC3370bC0) {
        d dVar = i.n;
        V(AbstractC7363pT1.a(24, 9, dVar));
        interfaceC3370bC0.a(dVar, AbstractC9714xr1.H());
    }

    public final Handler P() {
        return Looper.myLooper() == null ? this.c : new Handler(Looper.myLooper());
    }

    public final d Q(final d dVar) {
        if (Thread.interrupted()) {
            return dVar;
        }
        this.c.post(new Runnable() { // from class: com.daaw.sm3
            @Override // java.lang.Runnable
            public final void run() {
                this.B.F(dVar);
            }
        });
        return dVar;
    }

    public final d R() {
        return (this.a == 0 || this.a == 3) ? i.m : i.j;
    }

    public final String S(g gVar) {
        if (TextUtils.isEmpty(null)) {
            return this.e.getPackageName();
        }
        return null;
    }

    public final Future U(Callable callable, long j, final Runnable runnable, Handler handler) {
        if (this.B == null) {
            this.B = Executors.newFixedThreadPool(JC1.a, new ThreadFactoryC7228oy1(this));
        }
        try {
            final Future futureSubmit = this.B.submit(callable);
            handler.postDelayed(new Runnable() { // from class: com.daaw.Ys3
                @Override // java.lang.Runnable
                public final void run() {
                    Future future = futureSubmit;
                    if (future.isDone() || future.isCancelled()) {
                        return;
                    }
                    Runnable runnable2 = runnable;
                    future.cancel(true);
                    JC1.j("BillingClient", "Async task is taking too long, cancel it!");
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                }
            }, (long) (j * 0.95d));
            return futureSubmit;
        } catch (Exception e) {
            JC1.k("BillingClient", "Async task throws exception!", e);
            return null;
        }
    }

    public final void V(JS2 js2) {
        this.f.c(js2, this.k);
    }

    public final void W(ZU2 zu2) {
        this.f.b(zu2, this.k);
    }

    public final void X(String str, final InterfaceC9807yB0 interfaceC9807yB0) {
        if (!e()) {
            d dVar = i.m;
            V(AbstractC7363pT1.a(2, 11, dVar));
            interfaceC9807yB0.c(dVar, null);
        } else if (U(new CallableC1030Gz1(this, str, interfaceC9807yB0), 30000L, new Runnable() { // from class: com.daaw.Zt1
            @Override // java.lang.Runnable
            public final void run() {
                this.B.J(interfaceC9807yB0);
            }
        }, P()) == null) {
            d dVarR = R();
            V(AbstractC7363pT1.a(25, 11, dVarR));
            interfaceC9807yB0.c(dVarR, null);
        }
    }

    public final void Y(String str, final InterfaceC3370bC0 interfaceC3370bC0) {
        if (!e()) {
            d dVar = i.m;
            V(AbstractC7363pT1.a(2, 9, dVar));
            interfaceC3370bC0.a(dVar, AbstractC9714xr1.H());
        } else {
            if (TextUtils.isEmpty(str)) {
                JC1.j("BillingClient", "Please provide a valid product type.");
                d dVar2 = i.g;
                V(AbstractC7363pT1.a(50, 9, dVar2));
                interfaceC3370bC0.a(dVar2, AbstractC9714xr1.H());
                return;
            }
            if (U(new CallableC2609Vy1(this, str, interfaceC3370bC0), 30000L, new Runnable() { // from class: com.daaw.pp1
                @Override // java.lang.Runnable
                public final void run() {
                    this.B.K(interfaceC3370bC0);
                }
            }, P()) == null) {
                d dVarR = R();
                V(AbstractC7363pT1.a(25, 9, dVarR));
                interfaceC3370bC0.a(dVarR, AbstractC9714xr1.H());
            }
        }
    }

    public final boolean Z() {
        return this.v && this.z.b();
    }

    @Override // com.android.billingclient.api.a
    public final void a(final C5003h2 c5003h2, final InterfaceC5282i2 interfaceC5282i2) {
        if (!e()) {
            d dVar = i.m;
            V(AbstractC7363pT1.a(2, 3, dVar));
            interfaceC5282i2.b(dVar);
            return;
        }
        if (TextUtils.isEmpty(c5003h2.a())) {
            JC1.j("BillingClient", "Please provide a valid purchase token.");
            d dVar2 = i.i;
            V(AbstractC7363pT1.a(26, 3, dVar2));
            interfaceC5282i2.b(dVar2);
            return;
        }
        if (!this.n) {
            d dVar3 = i.b;
            V(AbstractC7363pT1.a(27, 3, dVar3));
            interfaceC5282i2.b(dVar3);
        } else if (U(new Callable() { // from class: com.daaw.gq3
            @Override // java.util.concurrent.Callable
            public final Object call() {
                this.a.k0(c5003h2, interfaceC5282i2);
                return null;
            }
        }, 30000L, new Runnable() { // from class: com.daaw.Oq3
            @Override // java.lang.Runnable
            public final void run() {
                this.B.E(interfaceC5282i2);
            }
        }, P()) == null) {
            d dVarR = R();
            V(AbstractC7363pT1.a(25, 3, dVarR));
            interfaceC5282i2.b(dVarR);
        }
    }

    public final void a0(d dVar, int i, int i2) {
        ZU2 zu2 = null;
        JS2 js2 = null;
        if (dVar.b() == 0) {
            int i3 = AbstractC7363pT1.a;
            try {
                C9048vU2 c9048vU2Z = ZU2.z();
                c9048vU2Z.k(5);
                J63 j63Y = C3355b83.y();
                j63Y.j(i2);
                c9048vU2Z.j((C3355b83) j63Y.e());
                zu2 = (ZU2) c9048vU2Z.e();
            } catch (Exception e) {
                JC1.k("BillingLogger", "Unable to create logging payload", e);
            }
            W(zu2);
            return;
        }
        int i4 = AbstractC7363pT1.a;
        try {
            TR2 tr2B = JS2.B();
            C5134hW2 c5134hW2B = C9343wY2.B();
            c5134hW2B.l(dVar.b());
            c5134hW2B.k(dVar.a());
            c5134hW2B.m(i);
            tr2B.j(c5134hW2B);
            tr2B.l(5);
            J63 j63Y2 = C3355b83.y();
            j63Y2.j(i2);
            tr2B.k((C3355b83) j63Y2.e());
            js2 = (JS2) tr2B.e();
        } catch (Exception e2) {
            JC1.k("BillingLogger", "Unable to create logging payload", e2);
        }
        V(js2);
    }

    @Override // com.android.billingclient.api.a
    public final void b(final C7474pr c7474pr, final InterfaceC7753qr interfaceC7753qr) {
        if (!e()) {
            d dVar = i.m;
            V(AbstractC7363pT1.a(2, 4, dVar));
            interfaceC7753qr.a(dVar, c7474pr.a());
        } else if (U(new Callable() { // from class: com.daaw.Rq1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                this.a.l0(c7474pr, interfaceC7753qr);
                return null;
            }
        }, 30000L, new Runnable() { // from class: com.daaw.zr1
            @Override // java.lang.Runnable
            public final void run() {
                this.B.G(interfaceC7753qr, c7474pr);
            }
        }, P()) == null) {
            d dVarR = R();
            V(AbstractC7363pT1.a(25, 4, dVarR));
            interfaceC7753qr.a(dVarR, c7474pr.a());
        }
    }

    @Override // com.android.billingclient.api.a
    public final void c() {
        W(AbstractC7363pT1.c(12));
        try {
            try {
                if (this.d != null) {
                    this.d.f();
                }
                if (this.h != null) {
                    this.h.c();
                }
                if (this.h != null && this.g != null) {
                    JC1.i("BillingClient", "Unbinding from service.");
                    this.e.unbindService(this.h);
                    this.h = null;
                }
                this.g = null;
                ExecutorService executorService = this.B;
                if (executorService != null) {
                    executorService.shutdownNow();
                    this.B = null;
                }
            } catch (Exception e) {
                JC1.k("BillingClient", "There was an exception while ending connection!", e);
            }
            this.a = 3;
        } catch (Throwable th) {
            this.a = 3;
            throw th;
        }
    }

    public final /* synthetic */ Bundle c0(int i, String str, String str2, c cVar, Bundle bundle) {
        return this.g.E1(i, this.e.getPackageName(), str, str2, null, bundle);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d2  */
    @Override // com.android.billingclient.api.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.android.billingclient.api.d d(java.lang.String r15) {
        /*
            Method dump skipped, instruction units count: 534
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.b.d(java.lang.String):com.android.billingclient.api.d");
    }

    public final /* synthetic */ Bundle d0(String str, String str2) {
        return this.g.U0(3, this.e.getPackageName(), str, str2, null);
    }

    @Override // com.android.billingclient.api.a
    public final boolean e() {
        return (this.a != 2 || this.g == null || this.h == null) ? false : true;
    }

    @Override // com.android.billingclient.api.a
    public final d f(Activity activity, final c cVar) {
        String str;
        Future futureU;
        int i;
        String str2;
        String str3;
        boolean z;
        c.b bVar;
        String str4;
        c.b bVar2;
        String str5;
        boolean z2;
        if (this.d == null || this.d.d() == null) {
            d dVar = i.F;
            V(AbstractC7363pT1.a(12, 2, dVar));
            return dVar;
        }
        if (!e()) {
            d dVar2 = i.m;
            V(AbstractC7363pT1.a(2, 2, dVar2));
            Q(dVar2);
            return dVar2;
        }
        ArrayList arrayListG = cVar.g();
        List listH = cVar.h();
        AbstractC6314li0.a(AbstractC0481Bu1.a(arrayListG, null));
        c.b bVar3 = (c.b) AbstractC0481Bu1.a(listH, null);
        final String strC = bVar3.b().c();
        final String strD = bVar3.b().d();
        if (strD.equals("subs") && !this.i) {
            JC1.j("BillingClient", "Current client doesn't support subscriptions.");
            d dVar3 = i.o;
            V(AbstractC7363pT1.a(9, 2, dVar3));
            Q(dVar3);
            return dVar3;
        }
        if (cVar.q() && !this.l) {
            JC1.j("BillingClient", "Current client doesn't support extra params for buy intent.");
            d dVar4 = i.h;
            V(AbstractC7363pT1.a(18, 2, dVar4));
            Q(dVar4);
            return dVar4;
        }
        if (arrayListG.size() > 1 && !this.s) {
            JC1.j("BillingClient", "Current client doesn't support multi-item purchases.");
            d dVar5 = i.t;
            V(AbstractC7363pT1.a(19, 2, dVar5));
            Q(dVar5);
            return dVar5;
        }
        if (!listH.isEmpty() && !this.t) {
            JC1.j("BillingClient", "Current client doesn't support purchases with ProductDetails.");
            d dVar6 = i.v;
            V(AbstractC7363pT1.a(20, 2, dVar6));
            Q(dVar6);
            return dVar6;
        }
        if (this.l) {
            boolean z3 = this.n;
            boolean z4 = this.v;
            boolean zA = this.z.a();
            boolean zB = this.z.b();
            boolean z5 = this.A;
            String str6 = this.b;
            final Bundle bundle = new Bundle();
            bundle.putString("playBillingLibraryVersion", str6);
            if (cVar.b() != 0) {
                bundle.putInt("prorationMode", cVar.b());
            }
            if (!TextUtils.isEmpty(cVar.c())) {
                bundle.putString("accountId", cVar.c());
            }
            if (!TextUtils.isEmpty(cVar.d())) {
                bundle.putString("obfuscatedProfileId", cVar.d());
            }
            if (cVar.p()) {
                bundle.putBoolean("isOfferPersonalizedByDeveloper", true);
            }
            if (!TextUtils.isEmpty(null)) {
                bundle.putStringArrayList("skusToReplace", new ArrayList<>(Arrays.asList(null)));
            }
            if (!TextUtils.isEmpty(cVar.e())) {
                bundle.putString("oldSkuPurchaseToken", cVar.e());
            }
            if (TextUtils.isEmpty(null)) {
                str2 = null;
            } else {
                str2 = null;
                bundle.putString("oldSkuPurchaseId", null);
            }
            if (TextUtils.isEmpty(cVar.f())) {
                str3 = str2;
            } else {
                str3 = str2;
                bundle.putString("originalExternalTransactionId", cVar.f());
            }
            if (!TextUtils.isEmpty(str3)) {
                bundle.putString("paymentsPurchaseParams", str3);
            }
            if (z3 && zA) {
                z = true;
                bundle.putBoolean("enablePendingPurchases", true);
            } else {
                z = true;
            }
            if (z4 && zB) {
                bundle.putBoolean("enablePendingPurchaseForSubscriptions", z);
            }
            if (z5) {
                bundle.putBoolean("enableAlternativeBilling", z);
            }
            if (arrayListG.isEmpty()) {
                bVar = bVar3;
                ArrayList<String> arrayList = new ArrayList<>(listH.size() - 1);
                ArrayList<String> arrayList2 = new ArrayList<>(listH.size() - 1);
                ArrayList<String> arrayList3 = new ArrayList<>();
                ArrayList<String> arrayList4 = new ArrayList<>();
                str4 = strD;
                ArrayList<String> arrayList5 = new ArrayList<>();
                str = "BUY_INTENT";
                for (int i2 = 0; i2 < listH.size(); i2++) {
                    c.b bVar4 = (c.b) listH.get(i2);
                    f fVarB = bVar4.b();
                    if (fVarB.h().isEmpty()) {
                        bVar2 = bVar4;
                    } else {
                        bVar2 = bVar4;
                        arrayList3.add(fVarB.h());
                    }
                    arrayList4.add(bVar2.c());
                    if (!TextUtils.isEmpty(fVarB.i())) {
                        arrayList5.add(fVarB.i());
                    }
                    if (i2 > 0) {
                        arrayList.add(((c.b) listH.get(i2)).b().c());
                        arrayList2.add(((c.b) listH.get(i2)).b().d());
                    }
                }
                bundle.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList4);
                if (!arrayList3.isEmpty()) {
                    bundle.putStringArrayList("skuDetailsTokens", arrayList3);
                }
                if (!arrayList5.isEmpty()) {
                    bundle.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", arrayList5);
                }
                if (!arrayList.isEmpty()) {
                    bundle.putStringArrayList("additionalSkus", arrayList);
                    bundle.putStringArrayList("additionalSkuTypes", arrayList2);
                }
            } else {
                ArrayList<String> arrayList6 = new ArrayList<>();
                new ArrayList();
                new ArrayList();
                new ArrayList();
                new ArrayList();
                Iterator it = arrayListG.iterator();
                if (it.hasNext()) {
                    AbstractC6314li0.a(it.next());
                    throw null;
                }
                if (!arrayList6.isEmpty()) {
                    bundle.putStringArrayList("skuDetailsTokens", arrayList6);
                }
                if (arrayListG.size() > 1) {
                    ArrayList<String> arrayList7 = new ArrayList<>(arrayListG.size() - 1);
                    ArrayList<String> arrayList8 = new ArrayList<>(arrayListG.size() - 1);
                    bVar = bVar3;
                    if (1 < arrayListG.size()) {
                        AbstractC6314li0.a(arrayListG.get(1));
                        throw null;
                    }
                    bundle.putStringArrayList("additionalSkus", arrayList7);
                    bundle.putStringArrayList("additionalSkuTypes", arrayList8);
                } else {
                    bVar = bVar3;
                }
                str = "BUY_INTENT";
                str4 = strD;
            }
            if (bundle.containsKey("SKU_OFFER_ID_TOKEN_LIST") && !this.q) {
                d dVar7 = i.u;
                V(AbstractC7363pT1.a(21, 2, dVar7));
                Q(dVar7);
                return dVar7;
            }
            if (bVar == null || TextUtils.isEmpty(bVar.b().g())) {
                str5 = null;
                z2 = false;
            } else {
                bundle.putString("skuPackageName", bVar.b().g());
                str5 = null;
                z2 = true;
            }
            if (!TextUtils.isEmpty(str5)) {
                bundle.putString("accountName", str5);
            }
            Intent intent = activity.getIntent();
            if (intent == null) {
                JC1.j("BillingClient", "Activity's intent is null.");
            } else if (!TextUtils.isEmpty(intent.getStringExtra("PROXY_PACKAGE"))) {
                String stringExtra = intent.getStringExtra("PROXY_PACKAGE");
                bundle.putString("proxyPackage", stringExtra);
                try {
                    bundle.putString("proxyPackageVersion", this.e.getPackageManager().getPackageInfo(stringExtra, 0).versionName);
                } catch (PackageManager.NameNotFoundException unused) {
                    bundle.putString("proxyPackageVersion", "package not found");
                }
            }
            final int i3 = (!this.t || listH.isEmpty()) ? (this.r && z2) ? 15 : this.n ? 9 : 6 : 17;
            final String str7 = str4;
            futureU = U(new Callable() { // from class: com.daaw.Hx1
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.a.c0(i3, strC, str7, cVar, bundle);
                }
            }, 5000L, null, this.c);
            i = 78;
        } else {
            str = "BUY_INTENT";
            futureU = U(new Callable() { // from class: com.daaw.Hn3
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.a.d0(strC, strD);
                }
            }, 5000L, null, this.c);
            i = 80;
        }
        try {
            if (futureU == null) {
                d dVar8 = i.m;
                V(AbstractC7363pT1.a(25, 2, dVar8));
                Q(dVar8);
                return dVar8;
            }
            Bundle bundle2 = (Bundle) futureU.get(5000L, TimeUnit.MILLISECONDS);
            int iB = JC1.b(bundle2, "BillingClient");
            String strF = JC1.f(bundle2, "BillingClient");
            if (iB == 0) {
                Intent intent2 = new Intent(activity, (Class<?>) ProxyBillingActivity.class);
                String str8 = str;
                intent2.putExtra(str8, (PendingIntent) bundle2.getParcelable(str8));
                activity.startActivity(intent2);
                return i.l;
            }
            JC1.j("BillingClient", "Unable to buy item, Error response code: " + iB);
            d dVarA = i.a(iB, strF);
            if (bundle2 != null) {
                i = 23;
            }
            V(AbstractC7363pT1.a(i, 2, dVarA));
            Q(dVarA);
            return dVarA;
        } catch (CancellationException e) {
            e = e;
            JC1.k("BillingClient", "Time out while launching billing flow. Try to reconnect", e);
            d dVar9 = i.n;
            V(AbstractC7363pT1.a(4, 2, dVar9));
            Q(dVar9);
            return dVar9;
        } catch (TimeoutException e2) {
            e = e2;
            JC1.k("BillingClient", "Time out while launching billing flow. Try to reconnect", e);
            d dVar92 = i.n;
            V(AbstractC7363pT1.a(4, 2, dVar92));
            Q(dVar92);
            return dVar92;
        } catch (Exception e3) {
            JC1.k("BillingClient", "Exception while launching billing flow. Try to reconnect", e3);
            d dVar10 = i.m;
            V(AbstractC7363pT1.a(5, 2, dVar10));
            Q(dVar10);
            return dVar10;
        }
    }

    @Override // com.android.billingclient.api.a
    public final void h(final g gVar, final InterfaceC1548Lz0 interfaceC1548Lz0) {
        if (!e()) {
            d dVar = i.m;
            V(AbstractC7363pT1.a(2, 7, dVar));
            interfaceC1548Lz0.a(dVar, new ArrayList());
        } else {
            if (!this.t) {
                JC1.j("BillingClient", "Querying product details is not supported.");
                d dVar2 = i.v;
                V(AbstractC7363pT1.a(20, 7, dVar2));
                interfaceC1548Lz0.a(dVar2, new ArrayList());
                return;
            }
            if (U(new Callable() { // from class: com.daaw.Du1
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    this.a.m0(gVar, interfaceC1548Lz0);
                    return null;
                }
            }, 30000L, new Runnable() { // from class: com.daaw.kv1
                @Override // java.lang.Runnable
                public final void run() {
                    this.B.H(interfaceC1548Lz0);
                }
            }, P()) == null) {
                d dVarR = R();
                V(AbstractC7363pT1.a(25, 7, dVarR));
                interfaceC1548Lz0.a(dVarR, new ArrayList());
            }
        }
    }

    @Override // com.android.billingclient.api.a
    public final void i(C7015oC0 c7015oC0, InterfaceC9807yB0 interfaceC9807yB0) {
        X(c7015oC0.b(), interfaceC9807yB0);
    }

    @Override // com.android.billingclient.api.a
    public final void j(C7294pC0 c7294pC0, InterfaceC3370bC0 interfaceC3370bC0) {
        Y(c7294pC0.b(), interfaceC3370bC0);
    }

    @Override // com.android.billingclient.api.a
    public final d k(final Activity activity, ZY zy, InterfaceC3182aZ interfaceC3182aZ) {
        if (!e()) {
            JC1.j("BillingClient", "Service disconnected.");
            return i.m;
        }
        if (!this.p) {
            JC1.j("BillingClient", "Current client doesn't support showing in-app messages.");
            return i.w;
        }
        View viewFindViewById = activity.findViewById(R.id.content);
        IBinder windowToken = viewFindViewById.getWindowToken();
        Rect rect = new Rect();
        viewFindViewById.getGlobalVisibleRect(rect);
        final Bundle bundle = new Bundle();
        AbstractC2227Sh.a(bundle, "KEY_WINDOW_TOKEN", windowToken);
        bundle.putInt("KEY_DIMEN_LEFT", rect.left);
        bundle.putInt("KEY_DIMEN_TOP", rect.top);
        bundle.putInt("KEY_DIMEN_RIGHT", rect.right);
        bundle.putInt("KEY_DIMEN_BOTTOM", rect.bottom);
        bundle.putString("playBillingLibraryVersion", this.b);
        bundle.putIntegerArrayList("KEY_CATEGORY_IDS", zy.b());
        final zzaw zzawVar = new zzaw(this, this.c, interfaceC3182aZ);
        U(new Callable() { // from class: com.daaw.Pv1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                this.a.n0(bundle, activity, zzawVar);
                return null;
            }
        }, 5000L, null, this.c);
        return i.l;
    }

    public final /* synthetic */ Object k0(C5003h2 c5003h2, InterfaceC5282i2 interfaceC5282i2) {
        try {
            Ko3 ko3 = this.g;
            String packageName = this.e.getPackageName();
            String strA = c5003h2.a();
            String str = this.b;
            Bundle bundle = new Bundle();
            bundle.putString("playBillingLibraryVersion", str);
            Bundle bundleU2 = ko3.U2(9, packageName, strA, bundle);
            interfaceC5282i2.b(i.a(JC1.b(bundleU2, "BillingClient"), JC1.f(bundleU2, "BillingClient")));
            return null;
        } catch (Exception e) {
            JC1.k("BillingClient", "Error acknowledge purchase!", e);
            d dVar = i.m;
            V(AbstractC7363pT1.a(28, 3, dVar));
            interfaceC5282i2.b(dVar);
            return null;
        }
    }

    @Override // com.android.billingclient.api.a
    public final void l(InterfaceC7135of interfaceC7135of) {
        if (e()) {
            JC1.i("BillingClient", "Service connection is valid. No need to re-initialize.");
            W(AbstractC7363pT1.c(6));
            interfaceC7135of.onBillingSetupFinished(i.l);
            return;
        }
        int i = 1;
        if (this.a == 1) {
            JC1.j("BillingClient", "Client is already in the process of connecting to billing service.");
            d dVar = i.d;
            V(AbstractC7363pT1.a(37, 6, dVar));
            interfaceC7135of.onBillingSetupFinished(dVar);
            return;
        }
        if (this.a == 3) {
            JC1.j("BillingClient", "Client was already closed and can't be reused. Please create another instance.");
            d dVar2 = i.m;
            V(AbstractC7363pT1.a(38, 6, dVar2));
            interfaceC7135of.onBillingSetupFinished(dVar2);
            return;
        }
        this.a = 1;
        JC1.i("BillingClient", "Starting in-app billing setup.");
        this.h = new h(this, interfaceC7135of, null);
        Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
        intent.setPackage("com.android.vending");
        List<ResolveInfo> listQueryIntentServices = this.e.getPackageManager().queryIntentServices(intent, 0);
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
            i = 41;
        } else {
            ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
            if (serviceInfo != null) {
                String str = serviceInfo.packageName;
                String str2 = serviceInfo.name;
                if (!"com.android.vending".equals(str) || str2 == null) {
                    JC1.j("BillingClient", "The device doesn't have valid Play Store.");
                    i = 40;
                } else {
                    ComponentName componentName = new ComponentName(str, str2);
                    Intent intent2 = new Intent(intent);
                    intent2.setComponent(componentName);
                    intent2.putExtra("playBillingLibraryVersion", this.b);
                    if (this.e.bindService(intent2, this.h, 1)) {
                        JC1.i("BillingClient", "Service was bonded successfully.");
                        return;
                    } else {
                        JC1.j("BillingClient", "Connection to Billing service is blocked.");
                        i = 39;
                    }
                }
            }
        }
        this.a = 0;
        JC1.i("BillingClient", "Billing service unavailable on device.");
        d dVar3 = i.c;
        V(AbstractC7363pT1.a(i, 6, dVar3));
        interfaceC7135of.onBillingSetupFinished(dVar3);
    }

    public final /* synthetic */ Object l0(C7474pr c7474pr, InterfaceC7753qr interfaceC7753qr) {
        int iX;
        String strF;
        String strA = c7474pr.a();
        try {
            JC1.i("BillingClient", "Consuming purchase with token: " + strA);
            if (this.n) {
                Ko3 ko3 = this.g;
                String packageName = this.e.getPackageName();
                boolean z = this.n;
                String str = this.b;
                Bundle bundle = new Bundle();
                if (z) {
                    bundle.putString("playBillingLibraryVersion", str);
                }
                Bundle bundleC0 = ko3.c0(9, packageName, strA, bundle);
                iX = bundleC0.getInt("RESPONSE_CODE");
                strF = JC1.f(bundleC0, "BillingClient");
            } else {
                iX = this.g.X(3, this.e.getPackageName(), strA);
                strF = "";
            }
            d dVarA = i.a(iX, strF);
            if (iX == 0) {
                JC1.i("BillingClient", "Successfully consumed purchase.");
                interfaceC7753qr.a(dVarA, strA);
                return null;
            }
            JC1.j("BillingClient", "Error consuming purchase with token. Response code: " + iX);
            V(AbstractC7363pT1.a(23, 4, dVarA));
            interfaceC7753qr.a(dVarA, strA);
            return null;
        } catch (Exception e) {
            JC1.k("BillingClient", "Error consuming purchase!", e);
            d dVar = i.m;
            V(AbstractC7363pT1.a(29, 4, dVar));
            interfaceC7753qr.a(dVar, strA);
            return null;
        }
    }

    public final void m(Context context, InterfaceC3648cC0 interfaceC3648cC0, e eVar, FS1 fs1, String str, VT1 vt1) {
        this.e = context.getApplicationContext();
        G33 g33A = C5017h43.A();
        g33A.l(str);
        g33A.k(this.e.getPackageName());
        if (vt1 != null) {
            this.f = vt1;
        } else {
            this.f = new C3733cX1(this.e, (C5017h43) g33A.e());
        }
        if (interfaceC3648cC0 == null) {
            JC1.j("BillingClient", "Billing client should have a valid listener but the provided is null.");
        }
        this.d = new Ei3(this.e, interfaceC3648cC0, null, fs1, null, this.f);
        this.z = eVar;
        this.A = fs1 != null;
        this.e.getPackageName();
    }

    public final /* synthetic */ Object m0(g gVar, InterfaceC1548Lz0 interfaceC1548Lz0) {
        String strF;
        int iB;
        ArrayList arrayList = new ArrayList();
        String strC = gVar.c();
        AbstractC9714xr1 abstractC9714xr1B = gVar.b();
        int size = abstractC9714xr1B.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                strF = "";
                iB = 0;
                break;
            }
            int i2 = i + 20;
            ArrayList arrayList2 = new ArrayList(abstractC9714xr1B.subList(i, i2 > size ? size : i2));
            ArrayList<String> arrayList3 = new ArrayList<>();
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                arrayList3.add(((g.b) arrayList2.get(i3)).b());
            }
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("ITEM_ID_LIST", arrayList3);
            bundle.putString("playBillingLibraryVersion", this.b);
            try {
                Ko3 ko3 = this.g;
                int i4 = true != this.w ? 17 : 20;
                String packageName = this.e.getPackageName();
                boolean Z = Z();
                String str = this.b;
                S(gVar);
                S(gVar);
                S(gVar);
                int i5 = i4;
                Bundle bundle2 = new Bundle();
                bundle2.putString("playBillingLibraryVersion", str);
                bundle2.putBoolean("enablePendingPurchases", true);
                bundle2.putString("SKU_DETAILS_RESPONSE_FORMAT", "PRODUCT_DETAILS");
                if (Z) {
                    bundle2.putBoolean("enablePendingPurchaseForSubscriptions", true);
                }
                ArrayList<String> arrayList4 = new ArrayList<>();
                ArrayList<String> arrayList5 = new ArrayList<>();
                int size3 = arrayList2.size();
                int i6 = 0;
                boolean z = false;
                boolean z2 = false;
                while (i6 < size3) {
                    g.b bVar = (g.b) arrayList2.get(i6);
                    Ko3 ko32 = ko3;
                    arrayList4.add(null);
                    z |= !TextUtils.isEmpty(null);
                    String strC2 = bVar.c();
                    AbstractC9714xr1 abstractC9714xr1 = abstractC9714xr1B;
                    if (strC2.equals("first_party")) {
                        AbstractC1601Mm1.c(null, "Serialized DocId is required for constructing ExtraParams to query ProductDetails for all first party products.");
                        arrayList5.add(null);
                        z2 = true;
                    }
                    i6++;
                    abstractC9714xr1B = abstractC9714xr1;
                    ko3 = ko32;
                }
                AbstractC9714xr1 abstractC9714xr12 = abstractC9714xr1B;
                Ko3 ko33 = ko3;
                if (z) {
                    bundle2.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList4);
                }
                if (!arrayList5.isEmpty()) {
                    bundle2.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", arrayList5);
                }
                if (z2 && !TextUtils.isEmpty(null)) {
                    bundle2.putString("accountName", null);
                }
                Bundle bundleV = ko33.V(i5, packageName, strC, bundle, bundle2);
                strF = "Item is unavailable for purchase.";
                if (bundleV == null) {
                    JC1.j("BillingClient", "queryProductDetailsAsync got empty product details response.");
                    V(AbstractC7363pT1.a(44, 7, i.C));
                    break;
                }
                if (bundleV.containsKey("DETAILS_LIST")) {
                    ArrayList<String> stringArrayList = bundleV.getStringArrayList("DETAILS_LIST");
                    if (stringArrayList == null) {
                        JC1.j("BillingClient", "queryProductDetailsAsync got null response list");
                        V(AbstractC7363pT1.a(46, 7, i.C));
                        break;
                    }
                    for (int i7 = 0; i7 < stringArrayList.size(); i7++) {
                        try {
                            f fVar = new f(stringArrayList.get(i7));
                            JC1.i("BillingClient", "Got product details: ".concat(fVar.toString()));
                            arrayList.add(fVar);
                        } catch (JSONException e) {
                            JC1.k("BillingClient", "Got a JSON exception trying to decode ProductDetails. \n Exception: ", e);
                            strF = "Error trying to decode SkuDetails.";
                            V(AbstractC7363pT1.a(47, 7, i.a(6, "Error trying to decode SkuDetails.")));
                            iB = 6;
                            interfaceC1548Lz0.a(i.a(iB, strF), arrayList);
                            return null;
                        }
                    }
                    i = i2;
                    abstractC9714xr1B = abstractC9714xr12;
                } else {
                    iB = JC1.b(bundleV, "BillingClient");
                    strF = JC1.f(bundleV, "BillingClient");
                    if (iB != 0) {
                        JC1.j("BillingClient", "getSkuDetails() failed for queryProductDetailsAsync. Response code: " + iB);
                        V(AbstractC7363pT1.a(23, 7, i.a(iB, strF)));
                    } else {
                        JC1.j("BillingClient", "getSkuDetails() returned a bundle with neither an error nor a product detail list for queryProductDetailsAsync.");
                        V(AbstractC7363pT1.a(45, 7, i.a(6, strF)));
                    }
                }
            } catch (Exception e2) {
                JC1.k("BillingClient", "queryProductDetailsAsync got a remote exception (try to reconnect).", e2);
                V(AbstractC7363pT1.a(43, 7, i.j));
                strF = "An internal error occurred.";
            }
        }
        iB = 4;
        interfaceC1548Lz0.a(i.a(iB, strF), arrayList);
        return null;
    }

    public final /* synthetic */ Object n0(Bundle bundle, Activity activity, ResultReceiver resultReceiver) {
        this.g.L(12, this.e.getPackageName(), bundle, new NN1(new WeakReference(activity), resultReceiver, null));
        return null;
    }

    public b(String str, e eVar, Context context, UY1 uy1, VT1 vt1, ExecutorService executorService) {
        this.a = 0;
        this.c = new Handler(Looper.getMainLooper());
        this.k = 0;
        this.b = T();
        this.e = context.getApplicationContext();
        G33 g33A = C5017h43.A();
        g33A.l(T());
        g33A.k(this.e.getPackageName());
        this.f = new C3733cX1(this.e, (C5017h43) g33A.e());
        JC1.j("BillingClient", "Billing client should have a valid listener but the provided is null.");
        this.d = new Ei3(this.e, null, null, null, null, this.f);
        this.z = eVar;
        this.e.getPackageName();
    }

    public b(String str, e eVar, Context context, InterfaceC3648cC0 interfaceC3648cC0, FS1 fs1, VT1 vt1, ExecutorService executorService) {
        String strT = T();
        this.a = 0;
        this.c = new Handler(Looper.getMainLooper());
        this.k = 0;
        this.b = strT;
        m(context, interfaceC3648cC0, eVar, null, strT, null);
    }
}
