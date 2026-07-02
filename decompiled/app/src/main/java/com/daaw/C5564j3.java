package com.daaw;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.daaw.C0746Eg1;
import com.daaw.C0850Fg1;
import com.daaw.C10217zg1;
import com.daaw.C9938yg1;
import com.daaw.avee.MainActivity;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: com.daaw.j3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5564j3 {
    public static int f;
    public static boolean g;
    public final List a;
    public final HashMap b;
    public final List c;
    public static final a d = new a(null);
    public static final int e = 8;
    public static int h = -1;

    /* JADX INFO: renamed from: com.daaw.j3$a */
    public static final class a {
        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public final void b(boolean z) {
            C5564j3.g = z;
        }

        public final String c(int i, Context context) {
            String string = context.getString(i == AbstractC5056hD0.Q0 ? JD0.z : i == AbstractC5056hD0.O0 ? JD0.w : i == AbstractC5056hD0.N0 ? JD0.v : i == AbstractC5056hD0.K0 ? JD0.y : i == AbstractC5056hD0.H0 ? JD0.t : i == AbstractC5056hD0.A ? JD0.u : JD0.x);
            G10.f(string, "let(...)");
            return string;
        }

        public a() {
        }
    }

    /* JADX INFO: renamed from: com.daaw.j3$b */
    public static final class b extends RewardedAdLoadCallback {
        public final /* synthetic */ int b;

        public b(int i) {
            this.b = i;
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onAdLoaded(RewardedAd rewardedAd) {
            G10.g(rewardedAd, "ad");
            super.onAdLoaded(rewardedAd);
            C5564j3.this.b.put(Integer.valueOf(this.b), rewardedAd);
            C5564j3.d.b(false);
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public void onAdFailedToLoad(LoadAdError loadAdError) {
            G10.g(loadAdError, "error");
            super.onAdFailedToLoad(loadAdError);
            C5564j3.this.u(loadAdError);
        }
    }

    public C5564j3() {
        LinkedList linkedList = new LinkedList();
        this.a = linkedList;
        this.b = new HashMap();
        this.c = new ArrayList();
        q();
        MainActivity.J0.b(new C10217zg1.a() { // from class: com.daaw.b3
            @Override // com.daaw.C10217zg1.a
            public final void invoke(Object obj) {
                C5564j3.i(this.a, (Activity) obj);
            }
        }, linkedList);
        MainActivity.P0.b(new C9938yg1.a() { // from class: com.daaw.c3
            @Override // com.daaw.C9938yg1.a
            public final void invoke() {
                C5564j3.j(this.a);
            }
        }, linkedList);
        AbstractC2916Yx0.e.b(new C0746Eg1.a() { // from class: com.daaw.d3
            @Override // com.daaw.C0746Eg1.a
            public final Object invoke() {
                return C5564j3.k();
            }
        }, linkedList);
        AbstractC2916Yx0.b.b(new C0850Fg1.a() { // from class: com.daaw.e3
            @Override // com.daaw.C0850Fg1.a
            public final Object invoke(Object obj) {
                return C5564j3.l(this.a, (Integer) obj);
            }
        }, linkedList);
        AbstractC2916Yx0.c.b(new C0850Fg1.a() { // from class: com.daaw.f3
            @Override // com.daaw.C0850Fg1.a
            public final Object invoke(Object obj) {
                return C5564j3.m(this.a, (Integer) obj);
            }
        }, linkedList);
        C2221Sf1.S.b(new C10217zg1.a() { // from class: com.daaw.g3
            @Override // com.daaw.C10217zg1.a
            public final void invoke(Object obj) {
                C5564j3.n(this.a, (Boolean) obj);
            }
        }, linkedList);
    }

    public static void h(C5564j3 c5564j3, Integer num) {
        G10.g(c5564j3, "this$0");
        RewardedAd rewardedAd = (RewardedAd) c5564j3.b.get(num);
        if (rewardedAd == null) {
            c5564j3.r(JD0.K4);
            return;
        }
        MainActivity mainActivityE = MainActivity.INSTANCE.e();
        if (mainActivityE != null) {
            rewardedAd.show(mainActivityE, new C5008h3(c5564j3));
        }
    }

    public static final void i(C5564j3 c5564j3, Activity activity) {
        G10.g(c5564j3, "this$0");
        c5564j3.q();
        Set setKeySet = c5564j3.b.keySet();
        G10.f(setKeySet, "<get-keys>(...)");
        Iterator it = setKeySet.iterator();
        while (it.hasNext()) {
            c5564j3.s(((Number) it.next()).intValue());
        }
    }

    public static final void j(C5564j3 c5564j3) {
        G10.g(c5564j3, "this$0");
        c5564j3.b.clear();
    }

    public static final Boolean k() {
        Object objA = WB0.m.a(Boolean.FALSE);
        G10.f(objA, "invoke(...)");
        return Boolean.valueOf(((Boolean) objA).booleanValue() && C4989gz0.a.e());
    }

    public static final Boolean l(final C5564j3 c5564j3, final Integer num) {
        G10.g(c5564j3, "this$0");
        if (c5564j3.c.contains(num)) {
            return Boolean.TRUE;
        }
        int i = f;
        if (i > 0) {
            f = i - 1;
            List list = c5564j3.c;
            G10.d(num);
            list.add(num);
            return Boolean.TRUE;
        }
        G10.d(num);
        h = num.intValue();
        RewardedAd rewardedAd = (RewardedAd) c5564j3.b.get(num);
        if (rewardedAd != null) {
            MainActivity mainActivityE = MainActivity.INSTANCE.e();
            if (mainActivityE != null) {
                rewardedAd.show(mainActivityE, new C5008h3(c5564j3));
            }
        } else if (g) {
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.daaw.i3
                @Override // java.lang.Runnable
                public final void run() {
                    C5564j3.h(this.B, num);
                }
            }, 1000L);
        } else {
            c5564j3.s(num.intValue());
            c5564j3.r(JD0.J4);
        }
        return Boolean.FALSE;
    }

    public static final Boolean m(C5564j3 c5564j3, Integer num) {
        G10.g(c5564j3, "this$0");
        return Boolean.valueOf(c5564j3.c.contains(num));
    }

    public static final void n(C5564j3 c5564j3, Boolean bool) {
        G10.g(c5564j3, "this$0");
        if (bool.booleanValue()) {
            return;
        }
        Iterator it = c5564j3.c.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            c5564j3.b.put(Integer.valueOf(iIntValue), null);
            c5564j3.s(iIntValue);
        }
        c5564j3.c.clear();
    }

    public final void q() {
        this.b.put(Integer.valueOf(AbstractC5056hD0.t0), null);
    }

    public final void r(int i) {
        Context contextA = com.daaw.avee.a.d.a();
        if (contextA == null) {
            return;
        }
        C6015kg.b(contextA, i).f(true);
    }

    public final void s(int i) {
        Context contextA = com.daaw.avee.a.d.a();
        if (contextA == null) {
            return;
        }
        g = true;
        RewardedAd.load(contextA, d.c(i, contextA), P2.a.b(), new b(i));
    }

    public final void t(RewardItem rewardItem) {
        int i = h;
        if (i <= 0) {
            f++;
        } else {
            this.c.add(Integer.valueOf(i));
            AbstractC2916Yx0.d.a(Integer.valueOf(h), Boolean.FALSE);
        }
    }

    public final void u(LoadAdError loadAdError) {
        G10.g(loadAdError, "loadAdError");
        g = false;
        loadAdError.getCode();
        loadAdError.toString();
    }
}
