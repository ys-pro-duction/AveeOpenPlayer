package com.daaw;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import com.daaw.C8820uh1;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: com.daaw.Zh1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2957Zh1 {
    public static final a v = new a(null);
    public static final WeakHashMap w = new WeakHashMap();
    public static boolean x;
    public final E6 a;
    public final E6 b;
    public final E6 c;
    public final E6 d;
    public final E6 e;
    public final E6 f;
    public final E6 g;
    public final E6 h;
    public final E6 i;
    public final C9360wc1 j;
    public final InterfaceC4905gh1 k;
    public final InterfaceC4905gh1 l;
    public final InterfaceC4905gh1 m;
    public final C9360wc1 n;
    public final C9360wc1 o;
    public final C9360wc1 p;
    public final C9360wc1 q;
    public final C9360wc1 r;
    public final boolean s;
    public int t;
    public final RunnableC4147e00 u;

    /* JADX INFO: renamed from: com.daaw.Zh1$a */
    public static final class a {

        /* JADX INFO: renamed from: com.daaw.Zh1$a$a, reason: collision with other inner class name */
        public static final class C0143a extends AbstractC4192e90 implements NQ {
            public final /* synthetic */ C2957Zh1 B;
            public final /* synthetic */ View C;

            /* JADX INFO: renamed from: com.daaw.Zh1$a$a$a, reason: collision with other inner class name */
            public static final class C0144a implements InterfaceC8973vC {
                public final /* synthetic */ C2957Zh1 a;
                public final /* synthetic */ View b;

                public C0144a(C2957Zh1 c2957Zh1, View view) {
                    this.a = c2957Zh1;
                    this.b = view;
                }

                @Override // com.daaw.InterfaceC8973vC
                public void a() {
                    this.a.b(this.b);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0143a(C2957Zh1 c2957Zh1, View view) {
                super(1);
                this.B = c2957Zh1;
                this.C = view;
            }

            @Override // com.daaw.NQ
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final InterfaceC8973vC invoke(C9252wC c9252wC) {
                G10.g(c9252wC, "$this$DisposableEffect");
                this.B.e(this.C);
                return new C0144a(this.B, this.C);
            }
        }

        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public final C2957Zh1 c(InterfaceC5781jp interfaceC5781jp, int i) {
            interfaceC5781jp.e(-1366542614);
            View view = (View) interfaceC5781jp.O(B5.i());
            C2957Zh1 c2957Zh1D = d(view);
            AbstractC8420tF.a(c2957Zh1D, new C0143a(c2957Zh1D, view), interfaceC5781jp, 8);
            interfaceC5781jp.L();
            return c2957Zh1D;
        }

        public final C2957Zh1 d(View view) {
            C2957Zh1 c2957Zh1;
            synchronized (C2957Zh1.w) {
                try {
                    WeakHashMap weakHashMap = C2957Zh1.w;
                    Object obj = weakHashMap.get(view);
                    Object obj2 = obj;
                    if (obj == null) {
                        C2957Zh1 c2957Zh12 = new C2957Zh1(null, view, false ? 1 : 0);
                        weakHashMap.put(view, c2957Zh12);
                        obj2 = c2957Zh12;
                    }
                    c2957Zh1 = (C2957Zh1) obj2;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return c2957Zh1;
        }

        public final E6 e(C8820uh1 c8820uh1, int i, String str) {
            E6 e6 = new E6(i, str);
            if (c8820uh1 != null) {
                e6.h(c8820uh1, i);
            }
            return e6;
        }

        public final C9360wc1 f(C8820uh1 c8820uh1, int i, String str) {
            C3590c00 c3590c00G;
            if (c8820uh1 == null || (c3590c00G = c8820uh1.g(i)) == null) {
                c3590c00G = C3590c00.e;
            }
            G10.f(c3590c00G, "windowInsets?.getInsetsI…e) ?: AndroidXInsets.NONE");
            return AbstractC4064di1.a(c3590c00G, str);
        }

        public a() {
        }
    }

    public /* synthetic */ C2957Zh1(C8820uh1 c8820uh1, View view, AbstractC2911Yw abstractC2911Yw) {
        this(c8820uh1, view);
    }

    public static /* synthetic */ void g(C2957Zh1 c2957Zh1, C8820uh1 c8820uh1, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        c2957Zh1.f(c8820uh1, i);
    }

    public final void b(View view) {
        G10.g(view, "view");
        int i = this.t - 1;
        this.t = i;
        if (i == 0) {
            AbstractC2317Td1.D0(view, null);
            AbstractC2317Td1.J0(view, null);
            view.removeOnAttachStateChangeListener(this.u);
        }
    }

    public final boolean c() {
        return this.s;
    }

    public final E6 d() {
        return this.g;
    }

    public final void e(View view) {
        G10.g(view, "view");
        if (this.t == 0) {
            AbstractC2317Td1.D0(view, this.u);
            if (view.isAttachedToWindow()) {
                view.requestApplyInsets();
            }
            view.addOnAttachStateChangeListener(this.u);
            if (Build.VERSION.SDK_INT >= 30) {
                AbstractC2317Td1.J0(view, this.u);
            }
        }
        this.t++;
    }

    public final void f(C8820uh1 c8820uh1, int i) {
        G10.g(c8820uh1, "windowInsets");
        if (x) {
            WindowInsets windowInsetsX = c8820uh1.x();
            G10.d(windowInsetsX);
            c8820uh1 = C8820uh1.y(windowInsetsX);
        }
        G10.f(c8820uh1, "if (testInsets) {\n      …   windowInsets\n        }");
        this.a.h(c8820uh1, i);
        this.c.h(c8820uh1, i);
        this.b.h(c8820uh1, i);
        this.e.h(c8820uh1, i);
        this.f.h(c8820uh1, i);
        this.g.h(c8820uh1, i);
        this.h.h(c8820uh1, i);
        this.i.h(c8820uh1, i);
        this.d.h(c8820uh1, i);
        if (i == 0) {
            C9360wc1 c9360wc1 = this.n;
            C3590c00 c3590c00G = c8820uh1.g(C8820uh1.m.a());
            G10.f(c3590c00G, "insets.getInsetsIgnoring…aptionBar()\n            )");
            c9360wc1.f(AbstractC4064di1.b(c3590c00G));
            C9360wc1 c9360wc12 = this.o;
            C3590c00 c3590c00G2 = c8820uh1.g(C8820uh1.m.f());
            G10.f(c3590c00G2, "insets.getInsetsIgnoring…ationBars()\n            )");
            c9360wc12.f(AbstractC4064di1.b(c3590c00G2));
            C9360wc1 c9360wc13 = this.p;
            C3590c00 c3590c00G3 = c8820uh1.g(C8820uh1.m.g());
            G10.f(c3590c00G3, "insets.getInsetsIgnoring…tatusBars()\n            )");
            c9360wc13.f(AbstractC4064di1.b(c3590c00G3));
            C9360wc1 c9360wc14 = this.q;
            C3590c00 c3590c00G4 = c8820uh1.g(C8820uh1.m.h());
            G10.f(c3590c00G4, "insets.getInsetsIgnoring…ystemBars()\n            )");
            c9360wc14.f(AbstractC4064di1.b(c3590c00G4));
            C9360wc1 c9360wc15 = this.r;
            C3590c00 c3590c00G5 = c8820uh1.g(C8820uh1.m.j());
            G10.f(c3590c00G5, "insets.getInsetsIgnoring…leElement()\n            )");
            c9360wc15.f(AbstractC4064di1.b(c3590c00G5));
            C8408tC c8408tCE = c8820uh1.e();
            if (c8408tCE != null) {
                C3590c00 c3590c00E = c8408tCE.e();
                G10.f(c3590c00E, "cutout.waterfallInsets");
                this.j.f(AbstractC4064di1.b(c3590c00E));
            }
        }
        AbstractC3720cU0.e.g();
    }

    public C2957Zh1(C8820uh1 c8820uh1, View view) {
        C8408tC c8408tCE;
        a aVar = v;
        this.a = aVar.e(c8820uh1, C8820uh1.m.a(), "captionBar");
        E6 e6E = aVar.e(c8820uh1, C8820uh1.m.b(), "displayCutout");
        this.b = e6E;
        E6 e6E2 = aVar.e(c8820uh1, C8820uh1.m.c(), "ime");
        this.c = e6E2;
        E6 e6E3 = aVar.e(c8820uh1, C8820uh1.m.e(), "mandatorySystemGestures");
        this.d = e6E3;
        this.e = aVar.e(c8820uh1, C8820uh1.m.f(), "navigationBars");
        this.f = aVar.e(c8820uh1, C8820uh1.m.g(), "statusBars");
        E6 e6E4 = aVar.e(c8820uh1, C8820uh1.m.h(), "systemBars");
        this.g = e6E4;
        E6 e6E5 = aVar.e(c8820uh1, C8820uh1.m.i(), "systemGestures");
        this.h = e6E5;
        E6 e6E6 = aVar.e(c8820uh1, C8820uh1.m.j(), "tappableElement");
        this.i = e6E6;
        C3590c00 c3590c00E = (c8820uh1 == null || (c8408tCE = c8820uh1.e()) == null || (c3590c00E = c8408tCE.e()) == null) ? C3590c00.e : c3590c00E;
        G10.f(c3590c00E, "insets?.displayCutout?.w…ts ?: AndroidXInsets.NONE");
        C9360wc1 c9360wc1A = AbstractC4064di1.a(c3590c00E, "waterfall");
        this.j = c9360wc1A;
        InterfaceC4905gh1 interfaceC4905gh1C = AbstractC3228ai1.c(AbstractC3228ai1.c(e6E4, e6E2), e6E);
        this.k = interfaceC4905gh1C;
        InterfaceC4905gh1 interfaceC4905gh1C2 = AbstractC3228ai1.c(AbstractC3228ai1.c(AbstractC3228ai1.c(e6E6, e6E3), e6E5), c9360wc1A);
        this.l = interfaceC4905gh1C2;
        this.m = AbstractC3228ai1.c(interfaceC4905gh1C, interfaceC4905gh1C2);
        this.n = aVar.f(c8820uh1, C8820uh1.m.a(), "captionBarIgnoringVisibility");
        this.o = aVar.f(c8820uh1, C8820uh1.m.f(), "navigationBarsIgnoringVisibility");
        this.p = aVar.f(c8820uh1, C8820uh1.m.g(), "statusBarsIgnoringVisibility");
        this.q = aVar.f(c8820uh1, C8820uh1.m.h(), "systemBarsIgnoringVisibility");
        this.r = aVar.f(c8820uh1, C8820uh1.m.j(), "tappableElementIgnoringVisibility");
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        Object tag = view2 != null ? view2.getTag(AbstractC6740nD0.I) : null;
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        this.s = bool != null ? bool.booleanValue() : true;
        this.u = new RunnableC4147e00(this);
    }
}
