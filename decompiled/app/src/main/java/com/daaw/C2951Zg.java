package com.daaw;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.daaw.C2535Vg;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import java.lang.ref.WeakReference;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.Zg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2951Zg {
    public final String a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final WeakReference g;
    public final Drawable h;
    public final String i;
    public final String j;
    public final Drawable k;
    public final Integer l;
    public final Integer m;
    public final Integer n;
    public final Integer o;
    public final String p;
    public final boolean q;
    public final boolean r;
    public final b s;
    public final List t;
    public final WeakReference u;
    public final InterfaceC3778ch v;
    public final boolean w;
    public final boolean x;
    public RelativeLayout y;
    public C2535Vg.a z;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: com.daaw.Zg$a */
    public static final class a {
        public static final a B = new a("TOP", 0);
        public static final a C = new a("BOTTOM", 1);
        public static final a D = new a("LEFT", 2);
        public static final a E = new a("RIGHT", 3);
        public static final /* synthetic */ a[] F;
        public static final /* synthetic */ YG G;

        static {
            a[] aVarArrA = a();
            F = aVarArrA;
            G = AbstractC3110aH.a(aVarArrA);
        }

        public a(String str, int i) {
        }

        public static final /* synthetic */ a[] a() {
            return new a[]{B, C, D, E};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) F.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: com.daaw.Zg$b */
    public static final class b {
        public static final b B = new b("VIEW_LAYOUT", 0);
        public static final b C = new b("VIEW_SURFACE", 1);
        public static final /* synthetic */ b[] D;
        public static final /* synthetic */ YG E;

        static {
            b[] bVarArrA = a();
            D = bVarArrA;
            E = AbstractC3110aH.a(bVarArrA);
        }

        public b(String str, int i) {
        }

        public static final /* synthetic */ b[] a() {
            return new b[]{B, C};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) D.clone();
        }
    }

    /* JADX INFO: renamed from: com.daaw.Zg$c */
    public /* synthetic */ class c {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.D.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.E.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.B.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[a.C.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            a = iArr;
        }
    }

    /* JADX INFO: renamed from: com.daaw.Zg$d */
    public static final class d implements InterfaceC4102dq0 {
        public d() {
        }

        @Override // com.daaw.InterfaceC4102dq0
        public void a() {
            C2951Zg.this.j();
            InterfaceC3778ch interfaceC3778ch = C2951Zg.this.v;
            if (interfaceC3778ch != null) {
                interfaceC3778ch.c(C2951Zg.this);
            }
        }

        @Override // com.daaw.InterfaceC4102dq0
        public void b() {
            InterfaceC3778ch interfaceC3778ch = C2951Zg.this.v;
            if (interfaceC3778ch != null) {
                interfaceC3778ch.a(C2951Zg.this);
            }
        }
    }

    public C2951Zg(C3500bh c3500bh) {
        G10.g(c3500bh, "builder");
        this.a = "BubbleShowCasePrefs";
        this.b = 731;
        this.c = RCHTTPStatusCodes.SUCCESS;
        this.d = 700;
        this.e = 700;
        this.f = 420;
        WeakReference weakReferenceF = c3500bh.f();
        G10.d(weakReferenceF);
        this.g = weakReferenceF;
        this.h = c3500bh.n();
        this.i = c3500bh.w();
        this.j = c3500bh.s();
        this.k = c3500bh.j();
        this.l = c3500bh.h();
        this.m = c3500bh.v();
        this.n = c3500bh.x();
        this.o = c3500bh.t();
        this.p = c3500bh.r();
        this.q = c3500bh.l();
        this.r = c3500bh.k();
        this.s = c3500bh.m();
        this.t = c3500bh.g();
        this.u = c3500bh.u();
        this.v = c3500bh.i();
        c3500bh.q();
        Boolean boolO = c3500bh.o();
        G10.d(boolO);
        this.w = boolO.booleanValue();
        Boolean boolP = c3500bh.p();
        G10.d(boolP);
        this.x = boolP.booleanValue();
    }

    public static final void C(C2951Zg c2951Zg, View view) {
        G10.g(c2951Zg, "this$0");
        InterfaceC3778ch interfaceC3778ch = c2951Zg.v;
        if (interfaceC3778ch != null) {
            interfaceC3778ch.b(c2951Zg);
        }
    }

    public static final void F(C2951Zg c2951Zg) {
        List list;
        a aVar;
        G10.g(c2951Zg, "this$0");
        Object obj = c2951Zg.u.get();
        G10.d(obj);
        View view = (View) obj;
        if (c2951Zg.t.isEmpty()) {
            VN0 vn0 = VN0.a;
            Object obj2 = c2951Zg.g.get();
            G10.d(obj2);
            if (vn0.h((Activity) obj2, view)) {
                list = c2951Zg.t;
                aVar = a.B;
            } else {
                list = c2951Zg.t;
                aVar = a.C;
            }
            list.add(aVar);
            c2951Zg.z = c2951Zg.m();
        }
        if (!c2951Zg.y(view)) {
            c2951Zg.j();
            return;
        }
        c2951Zg.g(view, c2951Zg.y);
        C2535Vg.a aVar2 = c2951Zg.z;
        G10.d(aVar2);
        c2951Zg.e(view, aVar2, c2951Zg.y);
    }

    public static final void h(C2951Zg c2951Zg, View view) {
        G10.g(c2951Zg, "this$0");
        if (!c2951Zg.q) {
            c2951Zg.j();
        }
        InterfaceC3778ch interfaceC3778ch = c2951Zg.v;
        if (interfaceC3778ch != null) {
            interfaceC3778ch.d(c2951Zg);
        }
    }

    public final void A(String str) {
        Object obj = this.g.get();
        G10.d(obj);
        SharedPreferences sharedPreferences = ((Activity) obj).getSharedPreferences(this.a, 0);
        G10.d(sharedPreferences);
        D(sharedPreferences, str, str);
    }

    public final void B(RelativeLayout relativeLayout) {
        if (relativeLayout != null) {
            relativeLayout.setOnClickListener(new View.OnClickListener() { // from class: com.daaw.Yg
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C2951Zg.C(this.B, view);
                }
            });
        }
    }

    public final void D(SharedPreferences sharedPreferences, String str, String str2) {
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putString(str, str2);
        editorEdit.apply();
    }

    public final void E() {
        String str = this.p;
        if (str != null) {
            if (w(str)) {
                z();
                return;
            }
            A(this.p);
        }
        Object obj = this.g.get();
        G10.d(obj);
        ViewGroup viewGroupT = t((Activity) obj);
        RelativeLayout relativeLayoutL = l();
        this.y = relativeLayoutL;
        B(relativeLayoutL);
        this.z = m();
        if (this.u == null || this.t.size() > 1) {
            C2535Vg.a aVar = this.z;
            G10.d(aVar);
            f(aVar, this.y);
        } else {
            new Handler().postDelayed(new Runnable() { // from class: com.daaw.Wg
                @Override // java.lang.Runnable
                public final void run() {
                    C2951Zg.F(this.B);
                }
            }, this.d);
        }
        if (this.w) {
            C7270p7 c7270p7 = C7270p7.a;
            Animation animationA = c7270p7.a(0, this.d);
            RelativeLayout relativeLayout = this.y;
            if (relativeLayout != null) {
                G10.d(relativeLayout);
                viewGroupT.addView(c7270p7.c(relativeLayout, animationA));
            }
        }
    }

    public final Bitmap G(View view, b bVar) {
        return (bVar == null || bVar == b.B) ? H(view) : I(view);
    }

    public final Bitmap H(View view) {
        if (view.getWidth() == 0 || view.getHeight() == 0) {
            return null;
        }
        Object obj = this.g.get();
        G10.d(obj);
        View childAt = t((Activity) obj).getChildAt(0);
        childAt.buildDrawingCache();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(childAt.getDrawingCache(), u(view), v(view), view.getWidth(), view.getHeight());
        G10.f(bitmapCreateBitmap, "createBitmap(...)");
        childAt.setDrawingCacheEnabled(false);
        childAt.destroyDrawingCache();
        return bitmapCreateBitmap;
    }

    public final Bitmap I(View view) {
        if (view.getWidth() == 0 || view.getHeight() == 0) {
            return null;
        }
        view.setDrawingCacheEnabled(true);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view.getDrawingCache());
        G10.f(bitmapCreateBitmap, "createBitmap(...)");
        view.setDrawingCacheEnabled(false);
        return bitmapCreateBitmap;
    }

    public final void e(View view, C2535Vg.a aVar, RelativeLayout relativeLayout) {
        int iN;
        int iN2;
        int iR;
        int iN3;
        int iR2;
        int iN4;
        if (view == null) {
            return;
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        int i = c.a[((a) aVar.g().get(0)).ordinal()];
        if (i == 1) {
            layoutParams.addRule(9);
            VN0 vn0 = VN0.a;
            Object obj = this.g.get();
            G10.d(obj);
            if (vn0.h((Activity) obj, view)) {
                int iU = u(view) + view.getWidth();
                int iV = v(view);
                if (x()) {
                    Object obj2 = this.g.get();
                    G10.d(obj2);
                    int iR3 = r((Context) obj2) - (u(view) + view.getWidth());
                    Object obj3 = this.g.get();
                    G10.d(obj3);
                    iN2 = iR3 - n(r((Context) obj3) - (u(view) + view.getWidth()));
                } else {
                    iN2 = 0;
                }
                layoutParams.setMargins(iU, iV, iN2, 0);
                layoutParams.addRule(10);
            } else {
                int iU2 = u(view) + view.getWidth();
                if (x()) {
                    Object obj4 = this.g.get();
                    G10.d(obj4);
                    int iR4 = r((Context) obj4) - (u(view) + view.getWidth());
                    Object obj5 = this.g.get();
                    G10.d(obj5);
                    iN = iR4 - n(r((Context) obj5) - (u(view) + view.getWidth()));
                } else {
                    iN = 0;
                }
                Object obj6 = this.g.get();
                G10.d(obj6);
                layoutParams.setMargins(iU2, 0, iN, (o((Context) obj6) - v(view)) - view.getHeight());
                layoutParams.addRule(12);
            }
        } else if (i == 2) {
            layoutParams.addRule(11);
            VN0 vn02 = VN0.a;
            Object obj7 = this.g.get();
            G10.d(obj7);
            if (vn02.h((Activity) obj7, view)) {
                int iU3 = x() ? u(view) - n(u(view)) : 0;
                int iV2 = v(view);
                Object obj8 = this.g.get();
                G10.d(obj8);
                layoutParams.setMargins(iU3, iV2, r((Context) obj8) - u(view), 0);
                layoutParams.addRule(10);
            } else {
                int iU4 = x() ? u(view) - n(u(view)) : 0;
                Object obj9 = this.g.get();
                G10.d(obj9);
                int iR5 = r((Context) obj9) - u(view);
                Object obj10 = this.g.get();
                G10.d(obj10);
                layoutParams.setMargins(iU4, 0, iR5, (o((Context) obj10) - v(view)) - view.getHeight());
                layoutParams.addRule(12);
            }
        } else if (i == 3) {
            layoutParams.addRule(10);
            VN0 vn03 = VN0.a;
            Object obj11 = this.g.get();
            G10.d(obj11);
            if (vn03.g((Activity) obj11, view)) {
                int iU5 = x() ? u(view) : 0;
                int iV3 = v(view) + view.getHeight();
                if (x()) {
                    Object obj12 = this.g.get();
                    G10.d(obj12);
                    int iR6 = r((Context) obj12) - u(view);
                    Object obj13 = this.g.get();
                    G10.d(obj13);
                    iN3 = iR6 - n(r((Context) obj13) - u(view));
                } else {
                    iN3 = 0;
                }
                layoutParams.setMargins(iU5, iV3, iN3, 0);
            } else {
                int iU6 = x() ? (u(view) + view.getWidth()) - n(u(view)) : 0;
                int iV4 = v(view) + view.getHeight();
                if (x()) {
                    Object obj14 = this.g.get();
                    G10.d(obj14);
                    iR = (r((Context) obj14) - u(view)) - view.getWidth();
                } else {
                    iR = 0;
                }
                layoutParams.setMargins(iU6, iV4, iR, 0);
            }
        } else if (i == 4) {
            layoutParams.addRule(12);
            VN0 vn04 = VN0.a;
            Object obj15 = this.g.get();
            G10.d(obj15);
            if (vn04.g((Activity) obj15, view)) {
                int iU7 = x() ? u(view) : 0;
                if (x()) {
                    Object obj16 = this.g.get();
                    G10.d(obj16);
                    int iR7 = r((Context) obj16) - u(view);
                    Object obj17 = this.g.get();
                    G10.d(obj17);
                    iN4 = iR7 - n(r((Context) obj17) - u(view));
                } else {
                    iN4 = 0;
                }
                Object obj18 = this.g.get();
                G10.d(obj18);
                layoutParams.setMargins(iU7, 0, iN4, o((Context) obj18) - v(view));
            } else {
                int iU8 = x() ? (u(view) + view.getWidth()) - n(u(view)) : 0;
                if (x()) {
                    Object obj19 = this.g.get();
                    G10.d(obj19);
                    iR2 = (r((Context) obj19) - u(view)) - view.getWidth();
                } else {
                    iR2 = 0;
                }
                Object obj20 = this.g.get();
                G10.d(obj20);
                layoutParams.setMargins(iU8, 0, iR2, o((Context) obj20) - v(view));
            }
        }
        C2535Vg c2535VgC = aVar.y(new RectF(u(view), v(view), u(view) + view.getWidth(), v(view) + view.getHeight())).c();
        c2535VgC.setId(i());
        C7270p7 c7270p7 = C7270p7.a;
        Animation animationB = c7270p7.b(0, this.c);
        if (relativeLayout != null) {
            relativeLayout.addView(c7270p7.c(c2535VgC, animationB), layoutParams);
        }
    }

    public final void f(C2535Vg.a aVar, RelativeLayout relativeLayout) {
        int iR;
        int iR2;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(15);
        C2535Vg c2535VgC = aVar.c();
        c2535VgC.setId(i());
        if (x()) {
            if (x()) {
                Object obj = this.g.get();
                G10.d(obj);
                iR = (r((Context) obj) / 2) - (VN0.a.a(this.f) / 2);
            } else {
                iR = 0;
            }
            if (x()) {
                Object obj2 = this.g.get();
                G10.d(obj2);
                iR2 = (r((Context) obj2) / 2) - (VN0.a.a(this.f) / 2);
            } else {
                iR2 = 0;
            }
            layoutParams.setMargins(iR, 0, iR2, 0);
        }
        C7270p7 c7270p7 = C7270p7.a;
        Animation animationB = c7270p7.b(0, this.c);
        if (relativeLayout != null) {
            relativeLayout.addView(c7270p7.c(c2535VgC, animationB), layoutParams);
        }
    }

    public final void g(View view, RelativeLayout relativeLayout) {
        if (view == null) {
            return;
        }
        Bitmap bitmapG = G(view, this.s);
        Object obj = this.g.get();
        G10.d(obj);
        ImageView imageView = new ImageView((Context) obj);
        imageView.setImageBitmap(bitmapG);
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.daaw.Xg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                C2951Zg.h(this.B, view2);
            }
        });
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        int iU = u(view);
        int iV = v(view);
        Object obj2 = this.g.get();
        G10.d(obj2);
        layoutParams.setMargins(iU, iV, r((Context) obj2) - (u(view) + view.getWidth()), 0);
        if (relativeLayout != null) {
            relativeLayout.addView(C7270p7.a.d(imageView, 0, this.e), layoutParams);
        }
    }

    public final int i() {
        return View.generateViewId();
    }

    public final void j() {
        RelativeLayout relativeLayout = this.y;
        if (relativeLayout != null && this.x) {
            k();
        } else if (relativeLayout != null) {
            relativeLayout.removeAllViews();
        }
        z();
    }

    public final void k() {
        Object obj = this.g.get();
        G10.d(obj);
        t((Activity) obj).removeView(this.y);
        this.y = null;
    }

    public final RelativeLayout l() {
        Object obj = this.g.get();
        G10.d(obj);
        if (((Activity) obj).findViewById(this.b) != null) {
            Object obj2 = this.g.get();
            G10.d(obj2);
            View viewFindViewById = ((Activity) obj2).findViewById(this.b);
            G10.f(viewFindViewById, "findViewById(...)");
            return (RelativeLayout) viewFindViewById;
        }
        Object obj3 = this.g.get();
        G10.d(obj3);
        RelativeLayout relativeLayout = new RelativeLayout((Context) obj3);
        relativeLayout.setId(this.b);
        relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        Object obj4 = this.g.get();
        G10.d(obj4);
        relativeLayout.setBackgroundColor(AbstractC9438ws.c((Context) obj4, QC0.b));
        relativeLayout.setClickable(true);
        return relativeLayout;
    }

    public final C2535Vg.a m() {
        C2535Vg.a aVar = new C2535Vg.a();
        Object obj = this.g.get();
        G10.d(obj);
        return aVar.f((Context) obj).a(this.t).b(this.l).z(this.m).B(this.n).x(this.o).A(this.i).w(this.j).t(this.h).d(this.k).e(this.r).u(new d());
    }

    public final int n(int i) {
        VN0 vn0 = VN0.a;
        return i > vn0.a(this.f) ? vn0.a(this.f) : i;
    }

    public final int o(Context context) {
        return VN0.a.d(context) - q();
    }

    public final int p() {
        RelativeLayout relativeLayout = this.y;
        if (relativeLayout == null) {
            return 0;
        }
        VN0 vn0 = VN0.a;
        G10.d(relativeLayout);
        return vn0.b(relativeLayout);
    }

    public final int q() {
        RelativeLayout relativeLayout = this.y;
        if (relativeLayout == null) {
            return 0;
        }
        VN0 vn0 = VN0.a;
        G10.d(relativeLayout);
        return vn0.c(relativeLayout);
    }

    public final int r(Context context) {
        return VN0.a.e(context) - p();
    }

    public final String s(SharedPreferences sharedPreferences, String str) {
        return sharedPreferences.getString(str, null);
    }

    public final ViewGroup t(Activity activity) {
        ViewParent parent = ((ViewGroup) activity.findViewById(R.id.content)).getParent().getParent();
        G10.e(parent, "null cannot be cast to non-null type android.view.ViewGroup");
        return (ViewGroup) parent;
    }

    public final int u(View view) {
        return VN0.a.b(view) - p();
    }

    public final int v(View view) {
        return VN0.a.c(view) - q();
    }

    public final boolean w(String str) {
        Object obj = this.g.get();
        G10.d(obj);
        SharedPreferences sharedPreferences = ((Activity) obj).getSharedPreferences(this.a, 0);
        G10.d(sharedPreferences);
        return s(sharedPreferences, str) != null;
    }

    public final boolean x() {
        Object obj = this.g.get();
        G10.d(obj);
        return ((Activity) obj).getResources().getBoolean(NC0.a);
    }

    public final boolean y(View view) {
        if (view == null || u(view) < 0 || v(view) < 0) {
            return false;
        }
        return (u(view) == 0 && v(view) == 0) ? false : true;
    }

    public final void z() {
    }
}
