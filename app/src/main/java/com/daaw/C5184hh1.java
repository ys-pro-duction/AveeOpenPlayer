package com.daaw;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import com.daaw.C8820uh1;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.hh1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5184hh1 {
    public e a;

    /* JADX INFO: renamed from: com.daaw.hh1$c */
    public static class c extends e {
        public static final Interpolator e = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);
        public static final Interpolator f = new QJ();
        public static final Interpolator g = new DecelerateInterpolator();

        /* JADX INFO: renamed from: com.daaw.hh1$c$a */
        public static class a implements View.OnApplyWindowInsetsListener {
            public final b a;
            public C8820uh1 b;

            /* JADX INFO: renamed from: com.daaw.hh1$c$a$a, reason: collision with other inner class name */
            public class C0186a implements ValueAnimator.AnimatorUpdateListener {
                public final /* synthetic */ C5184hh1 a;
                public final /* synthetic */ C8820uh1 b;
                public final /* synthetic */ C8820uh1 c;
                public final /* synthetic */ int d;
                public final /* synthetic */ View e;

                public C0186a(C5184hh1 c5184hh1, C8820uh1 c8820uh1, C8820uh1 c8820uh12, int i, View view) {
                    this.a = c5184hh1;
                    this.b = c8820uh1;
                    this.c = c8820uh12;
                    this.d = i;
                    this.e = view;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.a.e(valueAnimator.getAnimatedFraction());
                    c.k(this.e, c.o(this.b, this.c, this.a.b(), this.d), Collections.singletonList(this.a));
                }
            }

            /* JADX INFO: renamed from: com.daaw.hh1$c$a$b */
            public class b extends AnimatorListenerAdapter {
                public final /* synthetic */ C5184hh1 a;
                public final /* synthetic */ View b;

                public b(C5184hh1 c5184hh1, View view) {
                    this.a = c5184hh1;
                    this.b = view;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    this.a.e(1.0f);
                    c.i(this.b, this.a);
                }
            }

            /* JADX INFO: renamed from: com.daaw.hh1$c$a$c, reason: collision with other inner class name */
            public class RunnableC0187c implements Runnable {
                public final /* synthetic */ View B;
                public final /* synthetic */ C5184hh1 C;
                public final /* synthetic */ a D;
                public final /* synthetic */ ValueAnimator E;

                public RunnableC0187c(View view, C5184hh1 c5184hh1, a aVar, ValueAnimator valueAnimator) {
                    this.B = view;
                    this.C = c5184hh1;
                    this.D = aVar;
                    this.E = valueAnimator;
                }

                @Override // java.lang.Runnable
                public void run() {
                    c.l(this.B, this.C, this.D);
                    this.E.start();
                }
            }

            public a(View view, b bVar) {
                this.a = bVar;
                C8820uh1 c8820uh1K = AbstractC2317Td1.K(view);
                this.b = c8820uh1K != null ? new C8820uh1.b(c8820uh1K).a() : null;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                if (!view.isLaidOut()) {
                    this.b = C8820uh1.z(windowInsets, view);
                    return c.m(view, windowInsets);
                }
                C8820uh1 c8820uh1Z = C8820uh1.z(windowInsets, view);
                if (this.b == null) {
                    this.b = AbstractC2317Td1.K(view);
                }
                if (this.b == null) {
                    this.b = c8820uh1Z;
                    return c.m(view, windowInsets);
                }
                b bVarN = c.n(view);
                if (bVarN != null && Objects.equals(bVarN.B, windowInsets)) {
                    return c.m(view, windowInsets);
                }
                int iE = c.e(c8820uh1Z, this.b);
                if (iE == 0) {
                    return c.m(view, windowInsets);
                }
                C8820uh1 c8820uh1 = this.b;
                C5184hh1 c5184hh1 = new C5184hh1(iE, c.g(iE, c8820uh1Z, c8820uh1), 160L);
                c5184hh1.e(0.0f);
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(c5184hh1.a());
                a aVarF = c.f(c8820uh1Z, c8820uh1, iE);
                c.j(view, c5184hh1, windowInsets, false);
                duration.addUpdateListener(new C0186a(c5184hh1, c8820uh1Z, c8820uh1, iE, view));
                duration.addListener(new b(c5184hh1, view));
                ViewTreeObserverOnPreDrawListenerC1201Iq0.a(view, new RunnableC0187c(view, c5184hh1, aVarF, duration));
                this.b = c8820uh1Z;
                return c.m(view, windowInsets);
            }
        }

        public c(int i, Interpolator interpolator, long j) {
            super(i, interpolator, j);
        }

        public static int e(C8820uh1 c8820uh1, C8820uh1 c8820uh12) {
            int i = 0;
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if (!c8820uh1.f(i2).equals(c8820uh12.f(i2))) {
                    i |= i2;
                }
            }
            return i;
        }

        public static a f(C8820uh1 c8820uh1, C8820uh1 c8820uh12, int i) {
            C3590c00 c3590c00F = c8820uh1.f(i);
            C3590c00 c3590c00F2 = c8820uh12.f(i);
            return new a(C3590c00.b(Math.min(c3590c00F.a, c3590c00F2.a), Math.min(c3590c00F.b, c3590c00F2.b), Math.min(c3590c00F.c, c3590c00F2.c), Math.min(c3590c00F.d, c3590c00F2.d)), C3590c00.b(Math.max(c3590c00F.a, c3590c00F2.a), Math.max(c3590c00F.b, c3590c00F2.b), Math.max(c3590c00F.c, c3590c00F2.c), Math.max(c3590c00F.d, c3590c00F2.d)));
        }

        public static Interpolator g(int i, C8820uh1 c8820uh1, C8820uh1 c8820uh12) {
            return (i & 8) != 0 ? c8820uh1.f(C8820uh1.m.c()).d > c8820uh12.f(C8820uh1.m.c()).d ? e : f : g;
        }

        public static View.OnApplyWindowInsetsListener h(View view, b bVar) {
            return new a(view, bVar);
        }

        public static void i(View view, C5184hh1 c5184hh1) {
            b bVarN = n(view);
            if (bVarN != null) {
                bVarN.c(c5184hh1);
                if (bVarN.b() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    i(viewGroup.getChildAt(i), c5184hh1);
                }
            }
        }

        public static void j(View view, C5184hh1 c5184hh1, WindowInsets windowInsets, boolean z) {
            b bVarN = n(view);
            if (bVarN != null) {
                bVarN.B = windowInsets;
                if (!z) {
                    bVarN.d(c5184hh1);
                    z = bVarN.b() == 0;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    j(viewGroup.getChildAt(i), c5184hh1, windowInsets, z);
                }
            }
        }

        public static void k(View view, C8820uh1 c8820uh1, List list) {
            b bVarN = n(view);
            if (bVarN != null) {
                c8820uh1 = bVarN.e(c8820uh1, list);
                if (bVarN.b() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    k(viewGroup.getChildAt(i), c8820uh1, list);
                }
            }
        }

        public static void l(View view, C5184hh1 c5184hh1, a aVar) {
            b bVarN = n(view);
            if (bVarN != null) {
                bVarN.f(c5184hh1, aVar);
                if (bVarN.b() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    l(viewGroup.getChildAt(i), c5184hh1, aVar);
                }
            }
        }

        public static WindowInsets m(View view, WindowInsets windowInsets) {
            return view.getTag(AbstractC7298pD0.L) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
        }

        public static b n(View view) {
            Object tag = view.getTag(AbstractC7298pD0.S);
            if (tag instanceof a) {
                return ((a) tag).a;
            }
            return null;
        }

        public static C8820uh1 o(C8820uh1 c8820uh1, C8820uh1 c8820uh12, float f2, int i) {
            C8820uh1.b bVar = new C8820uh1.b(c8820uh1);
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if ((i & i2) == 0) {
                    bVar.b(i2, c8820uh1.f(i2));
                } else {
                    C3590c00 c3590c00F = c8820uh1.f(i2);
                    C3590c00 c3590c00F2 = c8820uh12.f(i2);
                    float f3 = 1.0f - f2;
                    bVar.b(i2, C8820uh1.p(c3590c00F, (int) (((double) ((c3590c00F.a - c3590c00F2.a) * f3)) + 0.5d), (int) (((double) ((c3590c00F.b - c3590c00F2.b) * f3)) + 0.5d), (int) (((double) ((c3590c00F.c - c3590c00F2.c) * f3)) + 0.5d), (int) (((double) ((c3590c00F.d - c3590c00F2.d) * f3)) + 0.5d)));
                }
            }
            return bVar.a();
        }

        public static void p(View view, b bVar) {
            Object tag = view.getTag(AbstractC7298pD0.L);
            if (bVar == null) {
                view.setTag(AbstractC7298pD0.S, null);
                if (tag == null) {
                    view.setOnApplyWindowInsetsListener(null);
                    return;
                }
                return;
            }
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListenerH = h(view, bVar);
            view.setTag(AbstractC7298pD0.S, onApplyWindowInsetsListenerH);
            if (tag == null) {
                view.setOnApplyWindowInsetsListener(onApplyWindowInsetsListenerH);
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.hh1$e */
    public static class e {
        public final int a;
        public float b;
        public final Interpolator c;
        public final long d;

        public e(int i, Interpolator interpolator, long j) {
            this.a = i;
            this.c = interpolator;
            this.d = j;
        }

        public long a() {
            return this.d;
        }

        public float b() {
            Interpolator interpolator = this.c;
            return interpolator != null ? interpolator.getInterpolation(this.b) : this.b;
        }

        public int c() {
            return this.a;
        }

        public void d(float f) {
            this.b = f;
        }
    }

    public C5184hh1(int i, Interpolator interpolator, long j) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.a = new d(i, interpolator, j);
        } else {
            this.a = new c(i, interpolator, j);
        }
    }

    public static void d(View view, b bVar) {
        if (Build.VERSION.SDK_INT >= 30) {
            d.h(view, bVar);
        } else {
            c.p(view, bVar);
        }
    }

    public static C5184hh1 f(WindowInsetsAnimation windowInsetsAnimation) {
        return new C5184hh1(windowInsetsAnimation);
    }

    public long a() {
        return this.a.a();
    }

    public float b() {
        return this.a.b();
    }

    public int c() {
        return this.a.c();
    }

    public void e(float f) {
        this.a.d(f);
    }

    /* JADX INFO: renamed from: com.daaw.hh1$d */
    public static class d extends e {
        public final WindowInsetsAnimation e;

        /* JADX INFO: renamed from: com.daaw.hh1$d$a */
        public static class a extends WindowInsetsAnimation.Callback {
            public final b a;
            public List b;
            public ArrayList c;
            public final HashMap d;

            public a(b bVar) {
                super(bVar.b());
                this.d = new HashMap();
                this.a = bVar;
            }

            public final C5184hh1 a(WindowInsetsAnimation windowInsetsAnimation) {
                C5184hh1 c5184hh1 = (C5184hh1) this.d.get(windowInsetsAnimation);
                if (c5184hh1 != null) {
                    return c5184hh1;
                }
                C5184hh1 c5184hh1F = C5184hh1.f(windowInsetsAnimation);
                this.d.put(windowInsetsAnimation, c5184hh1F);
                return c5184hh1F;
            }

            @Override // android.view.WindowInsetsAnimation.Callback
            public void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
                this.a.c(a(windowInsetsAnimation));
                this.d.remove(windowInsetsAnimation);
            }

            @Override // android.view.WindowInsetsAnimation.Callback
            public void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
                this.a.d(a(windowInsetsAnimation));
            }

            @Override // android.view.WindowInsetsAnimation.Callback
            public WindowInsets onProgress(WindowInsets windowInsets, List list) {
                ArrayList arrayList = this.c;
                if (arrayList == null) {
                    ArrayList arrayList2 = new ArrayList(list.size());
                    this.c = arrayList2;
                    this.b = DesugarCollections.unmodifiableList(arrayList2);
                } else {
                    arrayList.clear();
                }
                for (int size = list.size() - 1; size >= 0; size--) {
                    WindowInsetsAnimation windowInsetsAnimationA = AbstractC8262sh1.a(list.get(size));
                    C5184hh1 c5184hh1A = a(windowInsetsAnimationA);
                    c5184hh1A.e(windowInsetsAnimationA.getFraction());
                    this.c.add(c5184hh1A);
                }
                return this.a.e(C8820uh1.y(windowInsets), this.b).x();
            }

            @Override // android.view.WindowInsetsAnimation.Callback
            public WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
                return this.a.f(a(windowInsetsAnimation), a.d(bounds)).c();
            }
        }

        public d(WindowInsetsAnimation windowInsetsAnimation) {
            super(0, null, 0L);
            this.e = windowInsetsAnimation;
        }

        public static WindowInsetsAnimation.Bounds e(a aVar) {
            AbstractC7426ph1.a();
            return AbstractC7147oh1.a(aVar.a().e(), aVar.b().e());
        }

        public static C3590c00 f(WindowInsetsAnimation.Bounds bounds) {
            return C3590c00.d(bounds.getUpperBound());
        }

        public static C3590c00 g(WindowInsetsAnimation.Bounds bounds) {
            return C3590c00.d(bounds.getLowerBound());
        }

        public static void h(View view, b bVar) {
            view.setWindowInsetsAnimationCallback(bVar != null ? new a(bVar) : null);
        }

        @Override // com.daaw.C5184hh1.e
        public long a() {
            return this.e.getDurationMillis();
        }

        @Override // com.daaw.C5184hh1.e
        public float b() {
            return this.e.getInterpolatedFraction();
        }

        @Override // com.daaw.C5184hh1.e
        public int c() {
            return this.e.getTypeMask();
        }

        @Override // com.daaw.C5184hh1.e
        public void d(float f) {
            this.e.setFraction(f);
        }

        public d(int i, Interpolator interpolator, long j) {
            this(AbstractC6868nh1.a(i, interpolator, j));
        }
    }

    /* JADX INFO: renamed from: com.daaw.hh1$a */
    public static final class a {
        public final C3590c00 a;
        public final C3590c00 b;

        public a(C3590c00 c3590c00, C3590c00 c3590c002) {
            this.a = c3590c00;
            this.b = c3590c002;
        }

        public static a d(WindowInsetsAnimation.Bounds bounds) {
            return new a(bounds);
        }

        public C3590c00 a() {
            return this.a;
        }

        public C3590c00 b() {
            return this.b;
        }

        public WindowInsetsAnimation.Bounds c() {
            return d.e(this);
        }

        public String toString() {
            return "Bounds{lower=" + this.a + " upper=" + this.b + "}";
        }

        public a(WindowInsetsAnimation.Bounds bounds) {
            this.a = d.g(bounds);
            this.b = d.f(bounds);
        }
    }

    public C5184hh1(WindowInsetsAnimation windowInsetsAnimation) {
        this(0, null, 0L);
        if (Build.VERSION.SDK_INT >= 30) {
            this.a = new d(windowInsetsAnimation);
        }
    }

    /* JADX INFO: renamed from: com.daaw.hh1$b */
    public static abstract class b {
        public WindowInsets B;
        public final int C;

        public b(int i) {
            this.C = i;
        }

        public final int b() {
            return this.C;
        }

        public abstract C8820uh1 e(C8820uh1 c8820uh1, List list);

        public void c(C5184hh1 c5184hh1) {
        }

        public void d(C5184hh1 c5184hh1) {
        }

        public a f(C5184hh1 c5184hh1, a aVar) {
            return aVar;
        }
    }
}
