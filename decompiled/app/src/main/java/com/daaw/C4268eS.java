package com.daaw;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.view.View;
import com.daaw.C0321Ag1;
import com.daaw.C0425Bg1;
import com.daaw.C0746Eg1;
import com.daaw.C0850Fg1;
import com.daaw.C10217zg1;
import com.daaw.C9938yg1;
import com.daaw.avee.MainActivity;
import com.daaw.avee.MediaControlsView;
import com.daaw.avee.SettingsActivity;
import com.daaw.avee.a;
import com.daaw.avee.comp.playback.MediaPlaybackService;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.eS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4268eS {
    public static final a i = new a(null);
    public static final int j = 8;
    public static boolean k;
    public static boolean l;
    public static boolean m;
    public static int n;
    public static volatile boolean o;
    public final List a;
    public final Handler b;
    public boolean c;
    public final Date d;
    public final Date e;
    public final Date f;
    public final Date g;
    public final Date h;

    /* JADX INFO: renamed from: com.daaw.eS$a */
    public static final class a {
        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public final boolean a() {
            return SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.e().k(SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.X) == 201709;
        }

        public final int b() {
            return C4268eS.n;
        }

        public final void c(int i) {
            C4268eS.n = i;
        }

        public a() {
        }
    }

    public C4268eS() {
        LinkedList linkedList = new LinkedList();
        this.a = linkedList;
        this.b = new Handler();
        this.d = new Date(117, 11, 24);
        this.e = new Date(117, 11, 26);
        this.f = new Date(118, 0, 1);
        this.g = new Date(118, 0, 2);
        this.h = new Date(118, 0, 4);
        SettingsActivity.F.b(new C9938yg1.a() { // from class: com.daaw.NR
            @Override // com.daaw.C9938yg1.a
            public final void invoke() {
                C4268eS.r();
            }
        }, linkedList);
        SettingsActivity.G.b(new C9938yg1.a() { // from class: com.daaw.bS
            @Override // com.daaw.C9938yg1.a
            public final void invoke() {
                C4268eS.s(this.a);
            }
        }, linkedList);
        J();
        EH.H.b(new C10217zg1.a() { // from class: com.daaw.cS
            @Override // com.daaw.C10217zg1.a
            public final void invoke(Object obj) {
                C4268eS.A((EH) obj);
            }
        }, linkedList);
        EH.I.b(new C10217zg1.a() { // from class: com.daaw.dS
            @Override // com.daaw.C10217zg1.a
            public final void invoke(Object obj) {
                C4268eS.B((EH) obj);
            }
        }, linkedList);
        MainActivity.J0.b(new C10217zg1.a() { // from class: com.daaw.OR
            @Override // com.daaw.C10217zg1.a
            public final void invoke(Object obj) {
                C4268eS.C((Activity) obj);
            }
        }, linkedList);
        MainActivity.K0.b(new C10217zg1.a() { // from class: com.daaw.PR
            @Override // com.daaw.C10217zg1.a
            public final void invoke(Object obj) {
                C4268eS.D(this.a, (Activity) obj);
            }
        }, linkedList);
        MainActivity.N0.b(new C10217zg1.a() { // from class: com.daaw.QR
            @Override // com.daaw.C10217zg1.a
            public final void invoke(Object obj) {
                C4268eS.E((Activity) obj);
            }
        }, linkedList);
        MainActivity.S0.b(new C10217zg1.a() { // from class: com.daaw.RR
            @Override // com.daaw.C10217zg1.a
            public final void invoke(Object obj) {
                C4268eS.F(this.a, (Context) obj);
            }
        }, linkedList);
        MediaPlaybackService.n0.b(new C10217zg1.a() { // from class: com.daaw.SR
            @Override // com.daaw.C10217zg1.a
            public final void invoke(Object obj) {
                C4268eS.G(this.a, (Context) obj);
            }
        }, linkedList);
        C8974vC0.F.b(new C0746Eg1.a() { // from class: com.daaw.TR
            @Override // com.daaw.C0746Eg1.a
            public final Object invoke() {
                return C4268eS.t(this.a);
            }
        }, linkedList);
        C8974vC0.H.b(new C0321Ag1.a() { // from class: com.daaw.VR
            @Override // com.daaw.C0321Ag1.a
            public final void invoke(Object obj, Object obj2) {
                C4268eS.u((C2138Rl0) obj, (InterfaceC8771uX) obj2);
            }
        }, linkedList);
        MainActivity.f1.b(new C0321Ag1.a() { // from class: com.daaw.WR
            @Override // com.daaw.C0321Ag1.a
            public final void invoke(Object obj, Object obj2) {
                C4268eS.v((Activity) obj, ((Integer) obj2).intValue());
            }
        }, linkedList);
        MediaControlsView.INSTANCE.a().b(new C0425Bg1.a() { // from class: com.daaw.XR
            @Override // com.daaw.C0425Bg1.a
            public final void invoke(Object obj, Object obj2, Object obj3) {
                C4268eS.w(this.a, (View) obj, (View) obj2, (View) obj3);
            }
        }, linkedList);
        FragmentC10191zb0.F.b(new C0321Ag1.a() { // from class: com.daaw.YR
            @Override // com.daaw.C0321Ag1.a
            public final void invoke(Object obj, Object obj2) {
                C4268eS.x(this.a, (Integer) obj, (View) obj2);
            }
        }, linkedList);
        E3.b.b(new C0850Fg1.a() { // from class: com.daaw.ZR
            @Override // com.daaw.C0850Fg1.a
            public final Object invoke(Object obj) {
                return C4268eS.y(obj);
            }
        }, linkedList);
        MainActivity.m1.b(new C0850Fg1.a() { // from class: com.daaw.aS
            @Override // com.daaw.C0850Fg1.a
            public final Object invoke(Object obj) {
                return C4268eS.z((Intent) obj);
            }
        }, linkedList);
    }

    public static final void A(EH eh) {
        G10.g(eh, "sender");
        SharedPreferencesOnSharedPreferenceChangeListenerC5706ja sharedPreferencesOnSharedPreferenceChangeListenerC5706jaE = SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.e();
        sharedPreferencesOnSharedPreferenceChangeListenerC5706jaE.c0(SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.X, 201709);
        a.C0151a c0151a = com.daaw.avee.a.d;
        sharedPreferencesOnSharedPreferenceChangeListenerC5706jaE.T(c0151a.b());
        Context contextB = c0151a.b();
        G10.d(contextB);
        C3465ba.a(contextB, eh.getActivity());
    }

    public static final void B(EH eh) {
        G10.g(eh, "sender");
        SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.e().c0(SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.X, 0);
        MainActivity mainActivityE = MainActivity.INSTANCE.e();
        if (mainActivityE != null) {
            mainActivityE.Y0();
        }
        Activity activity = eh.getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    public static final void D(C4268eS c4268eS, Activity activity) {
        G10.g(c4268eS, "this$0");
        c4268eS.L();
    }

    public static final void E(Activity activity) {
        SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.e().T(activity);
    }

    public static final void F(C4268eS c4268eS, Context context) {
        G10.g(c4268eS, "this$0");
        c4268eS.K(context);
    }

    public static final void G(final C4268eS c4268eS, final Context context) {
        G10.g(c4268eS, "this$0");
        c4268eS.b.post(new Runnable() { // from class: com.daaw.UR
            @Override // java.lang.Runnable
            public final void run() {
                C4268eS.j(this.B, context);
            }
        });
    }

    public static void j(C4268eS c4268eS, Context context) {
        G10.g(c4268eS, "this$0");
        c4268eS.K(context);
    }

    public static final void r() {
        Context contextB = com.daaw.avee.a.d.b();
        if (contextB != null) {
            String string = contextB.getResources().getString(JD0.u0);
            G10.f(string, "getString(...)");
            AbstractC5075hI.a.a(string);
            AbstractC0934Gb1.e(contextB);
        }
    }

    public static final void s(C4268eS c4268eS) {
        G10.g(c4268eS, "this$0");
        SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.e().c0(SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.X, 0);
        c4268eS.L();
    }

    public static final Boolean t(C4268eS c4268eS) {
        G10.g(c4268eS, "this$0");
        if (!c4268eS.c) {
            c4268eS.K(com.daaw.avee.a.d.d());
        }
        boolean z = l;
        l = false;
        return Boolean.valueOf(z);
    }

    public static final void u(C2138Rl0 c2138Rl0, InterfaceC8771uX interfaceC8771uX) {
        Object obj;
        G10.g(c2138Rl0, "list");
        if (m) {
            B61 b61 = c2138Rl0.size() > 0 ? c2138Rl0.get(0) : null;
            if (b61 != null && (obj = b61.a) != null) {
                com.daaw.avee.comp.playback.c.e.a(((C2078Qw0) obj).g(), Boolean.FALSE, 0L, null);
            }
            m = false;
        }
    }

    public static final void v(Activity activity, int i2) {
        G10.g(activity, "activity");
        com.daaw.avee.comp.playback.c.u.a();
        boolean z = k;
        l = z;
        m = z;
        if ((i2 == C3465ba.b || i2 == C3465ba.e) && Build.VERSION.SDK_INT >= 23) {
            activity.recreate();
        }
    }

    public static final void w(C4268eS c4268eS, View view, View view2, View view3) {
        G10.g(c4268eS, "this$0");
        Date date = new Date();
        if (date.after(c4268eS.d) && date.before(c4268eS.e)) {
            if (view != null) {
                view.setBackgroundResource(AbstractC3374bD0.y0);
            }
            if (view2 != null) {
                view2.setBackgroundResource(AbstractC3374bD0.y0);
            }
        } else if (date.after(c4268eS.f) && date.before(c4268eS.g)) {
            if (view != null) {
                view.setBackgroundResource(AbstractC3374bD0.i0);
            }
            if (view2 != null) {
                view2.setBackgroundResource(AbstractC3374bD0.i0);
            }
        }
        c4268eS.J();
    }

    public static final void x(C4268eS c4268eS, Integer num, View view) {
        G10.g(c4268eS, "this$0");
        Date date = new Date();
        if (date.after(c4268eS.d) && date.before(c4268eS.e)) {
            if (view != null) {
                view.setBackgroundResource(AbstractC3374bD0.y0);
            }
        } else if (date.after(c4268eS.f) && date.before(c4268eS.g) && view != null) {
            view.setBackgroundResource(AbstractC3374bD0.i0);
        }
    }

    public static final File y(Object obj) {
        G10.g(obj, "localFolderId");
        return SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.a(((Integer) obj).intValue());
    }

    public static final Boolean z(Intent intent) {
        C2078Qw0 c2078Qw0;
        String action;
        Uri data;
        String str;
        if (intent != null) {
            String action2 = intent.getAction();
            if (action2 != null) {
                str = ";" + intent.getData();
            } else {
                str = ";null";
            }
            AbstractC0441Bk1.c("LaunchIntent: action: " + action2 + str);
        }
        if (intent == null || (action = intent.getAction()) == null || !G10.c(action, "android.intent.action.VIEW") || (data = intent.getData()) == null) {
            c2078Qw0 = null;
        } else {
            Context contextA = com.daaw.avee.a.d.a();
            if (contextA == null) {
                return Boolean.FALSE;
            }
            if (C2429Uf1.d(contextA.getContentResolver(), data)) {
                int iC = C2429Uf1.c(contextA, data);
                if (iC > 0) {
                    C1989Qf1.Y(iC);
                }
                c2078Qw0 = null;
            } else {
                c2078Qw0 = new C2078Qw0(-1L, data);
            }
        }
        if (c2078Qw0 == null) {
            return Boolean.FALSE;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(c2078Qw0);
        MainActivity.b1.a(arrayList, 0);
        G10.d(intent);
        intent.setAction(null);
        return Boolean.TRUE;
    }

    public final void J() {
        Date date = new Date();
        if (date.after(this.d) && date.before(this.h)) {
            o = true;
        } else {
            o = false;
        }
    }

    public final void K(Context context) {
        this.c = true;
        if (context != null) {
            SharedPreferencesOnSharedPreferenceChangeListenerC5706ja sharedPreferencesOnSharedPreferenceChangeListenerC5706jaE = SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.e();
            sharedPreferencesOnSharedPreferenceChangeListenerC5706jaE.w(context);
            if (k) {
                return;
            }
            boolean zH = sharedPreferencesOnSharedPreferenceChangeListenerC5706jaE.h(SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.u);
            k = zH;
            AbstractC0441Bk1.a("isFirstLaunch: " + zH);
            sharedPreferencesOnSharedPreferenceChangeListenerC5706jaE.a0(SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.u, false);
            boolean z = k;
            l = z;
            m = z;
        }
    }

    public final void L() {
        if (i.a()) {
            return;
        }
        EH.i(true);
    }

    public static final void C(Activity activity) {
    }
}
