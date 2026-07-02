package com.daaw;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import j$.util.Objects;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: com.daaw.uh1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C8820uh1 {
    public static final C8820uh1 b;
    public final l a;

    /* JADX INFO: renamed from: com.daaw.uh1$a */
    public static class a {
        public static Field a;
        public static Field b;
        public static Field c;
        public static boolean d;

        static {
            try {
                Field declaredField = View.class.getDeclaredField("mAttachInfo");
                a = declaredField;
                declaredField.setAccessible(true);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                Field declaredField2 = cls.getDeclaredField("mStableInsets");
                b = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = cls.getDeclaredField("mContentInsets");
                c = declaredField3;
                declaredField3.setAccessible(true);
                d = true;
            } catch (ReflectiveOperationException e) {
                e.getMessage();
            }
        }

        public static C8820uh1 a(View view) {
            if (d && view.isAttachedToWindow()) {
                try {
                    Object obj = a.get(view.getRootView());
                    if (obj != null) {
                        Rect rect = (Rect) b.get(obj);
                        Rect rect2 = (Rect) c.get(obj);
                        if (rect != null && rect2 != null) {
                            C8820uh1 c8820uh1A = new b().c(C3590c00.c(rect)).d(C3590c00.c(rect2)).a();
                            c8820uh1A.v(c8820uh1A);
                            c8820uh1A.d(view.getRootView());
                            return c8820uh1A;
                        }
                    }
                } catch (IllegalAccessException e) {
                    e.getMessage();
                }
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: com.daaw.uh1$e */
    public static class e extends d {
        public e() {
        }

        @Override // com.daaw.C8820uh1.f
        public void c(int i, C3590c00 c3590c00) {
            this.c.setInsets(n.a(i), c3590c00.e());
        }

        public e(C8820uh1 c8820uh1) {
            super(c8820uh1);
        }
    }

    /* JADX INFO: renamed from: com.daaw.uh1$f */
    public static class f {
        public final C8820uh1 a;
        public C3590c00[] b;

        public f() {
            this(new C8820uh1((C8820uh1) null));
        }

        public final void a() {
            C3590c00[] c3590c00Arr = this.b;
            if (c3590c00Arr != null) {
                C3590c00 c3590c00F = c3590c00Arr[m.d(1)];
                C3590c00 c3590c00F2 = this.b[m.d(2)];
                if (c3590c00F2 == null) {
                    c3590c00F2 = this.a.f(2);
                }
                if (c3590c00F == null) {
                    c3590c00F = this.a.f(1);
                }
                g(C3590c00.a(c3590c00F, c3590c00F2));
                C3590c00 c3590c00 = this.b[m.d(16)];
                if (c3590c00 != null) {
                    f(c3590c00);
                }
                C3590c00 c3590c002 = this.b[m.d(32)];
                if (c3590c002 != null) {
                    d(c3590c002);
                }
                C3590c00 c3590c003 = this.b[m.d(64)];
                if (c3590c003 != null) {
                    h(c3590c003);
                }
            }
        }

        public abstract C8820uh1 b();

        public void c(int i, C3590c00 c3590c00) {
            if (this.b == null) {
                this.b = new C3590c00[9];
            }
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if ((i & i2) != 0) {
                    this.b[m.d(i2)] = c3590c00;
                }
            }
        }

        public abstract void e(C3590c00 c3590c00);

        public abstract void g(C3590c00 c3590c00);

        public f(C8820uh1 c8820uh1) {
            this.a = c8820uh1;
        }

        public void d(C3590c00 c3590c00) {
        }

        public void f(C3590c00 c3590c00) {
        }

        public void h(C3590c00 c3590c00) {
        }
    }

    /* JADX INFO: renamed from: com.daaw.uh1$i */
    public static class i extends h {
        public i(C8820uh1 c8820uh1, WindowInsets windowInsets) {
            super(c8820uh1, windowInsets);
        }

        @Override // com.daaw.C8820uh1.l
        public C8820uh1 a() {
            return C8820uh1.y(this.c.consumeDisplayCutout());
        }

        @Override // com.daaw.C8820uh1.g, com.daaw.C8820uh1.l
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return Objects.equals(this.c, iVar.c) && Objects.equals(this.g, iVar.g);
        }

        @Override // com.daaw.C8820uh1.l
        public C8408tC f() {
            return C8408tC.f(this.c.getDisplayCutout());
        }

        @Override // com.daaw.C8820uh1.l
        public int hashCode() {
            return this.c.hashCode();
        }

        public i(C8820uh1 c8820uh1, i iVar) {
            super(c8820uh1, iVar);
        }
    }

    /* JADX INFO: renamed from: com.daaw.uh1$k */
    public static class k extends j {
        public static final C8820uh1 q = C8820uh1.y(WindowInsets.CONSUMED);

        public k(C8820uh1 c8820uh1, WindowInsets windowInsets) {
            super(c8820uh1, windowInsets);
        }

        @Override // com.daaw.C8820uh1.g, com.daaw.C8820uh1.l
        public C3590c00 g(int i) {
            return C3590c00.d(this.c.getInsets(n.a(i)));
        }

        @Override // com.daaw.C8820uh1.g, com.daaw.C8820uh1.l
        public C3590c00 h(int i) {
            return C3590c00.d(this.c.getInsetsIgnoringVisibility(n.a(i)));
        }

        @Override // com.daaw.C8820uh1.g, com.daaw.C8820uh1.l
        public boolean q(int i) {
            return this.c.isVisible(n.a(i));
        }

        public k(C8820uh1 c8820uh1, k kVar) {
            super(c8820uh1, kVar);
        }

        @Override // com.daaw.C8820uh1.g, com.daaw.C8820uh1.l
        public final void d(View view) {
        }
    }

    /* JADX INFO: renamed from: com.daaw.uh1$m */
    public static final class m {
        public static int a() {
            return 4;
        }

        public static int b() {
            return 128;
        }

        public static int c() {
            return 8;
        }

        public static int d(int i) {
            if (i == 1) {
                return 0;
            }
            if (i == 2) {
                return 1;
            }
            if (i == 4) {
                return 2;
            }
            if (i == 8) {
                return 3;
            }
            if (i == 16) {
                return 4;
            }
            if (i == 32) {
                return 5;
            }
            if (i == 64) {
                return 6;
            }
            if (i == 128) {
                return 7;
            }
            if (i == 256) {
                return 8;
            }
            throw new IllegalArgumentException("type needs to be >= FIRST and <= LAST, type=" + i);
        }

        public static int e() {
            return 32;
        }

        public static int f() {
            return 2;
        }

        public static int g() {
            return 1;
        }

        public static int h() {
            return 7;
        }

        public static int i() {
            return 16;
        }

        public static int j() {
            return 64;
        }
    }

    /* JADX INFO: renamed from: com.daaw.uh1$n */
    public static final class n {
        public static int a(int i) {
            int iStatusBars;
            int i2 = 0;
            for (int i3 = 1; i3 <= 256; i3 <<= 1) {
                if ((i & i3) != 0) {
                    if (i3 == 1) {
                        iStatusBars = WindowInsets.Type.statusBars();
                    } else if (i3 == 2) {
                        iStatusBars = WindowInsets.Type.navigationBars();
                    } else if (i3 == 4) {
                        iStatusBars = WindowInsets.Type.captionBar();
                    } else if (i3 == 8) {
                        iStatusBars = WindowInsets.Type.ime();
                    } else if (i3 == 16) {
                        iStatusBars = WindowInsets.Type.systemGestures();
                    } else if (i3 == 32) {
                        iStatusBars = WindowInsets.Type.mandatorySystemGestures();
                    } else if (i3 == 64) {
                        iStatusBars = WindowInsets.Type.tappableElement();
                    } else if (i3 == 128) {
                        iStatusBars = WindowInsets.Type.displayCutout();
                    }
                    i2 |= iStatusBars;
                }
            }
            return i2;
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            b = k.q;
        } else {
            b = l.b;
        }
    }

    public C8820uh1(WindowInsets windowInsets) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30) {
            this.a = new k(this, windowInsets);
            return;
        }
        if (i2 >= 29) {
            this.a = new j(this, windowInsets);
        } else if (i2 >= 28) {
            this.a = new i(this, windowInsets);
        } else {
            this.a = new h(this, windowInsets);
        }
    }

    public static C3590c00 p(C3590c00 c3590c00, int i2, int i3, int i4, int i5) {
        int iMax = Math.max(0, c3590c00.a - i2);
        int iMax2 = Math.max(0, c3590c00.b - i3);
        int iMax3 = Math.max(0, c3590c00.c - i4);
        int iMax4 = Math.max(0, c3590c00.d - i5);
        return (iMax == i2 && iMax2 == i3 && iMax3 == i4 && iMax4 == i5) ? c3590c00 : C3590c00.b(iMax, iMax2, iMax3, iMax4);
    }

    public static C8820uh1 y(WindowInsets windowInsets) {
        return z(windowInsets, null);
    }

    public static C8820uh1 z(WindowInsets windowInsets, View view) {
        C8820uh1 c8820uh1 = new C8820uh1((WindowInsets) AbstractC8621ty0.g(windowInsets));
        if (view != null && view.isAttachedToWindow()) {
            c8820uh1.v(AbstractC2317Td1.K(view));
            c8820uh1.d(view.getRootView());
        }
        return c8820uh1;
    }

    public C8820uh1 a() {
        return this.a.a();
    }

    public C8820uh1 b() {
        return this.a.b();
    }

    public C8820uh1 c() {
        return this.a.c();
    }

    public void d(View view) {
        this.a.d(view);
    }

    public C8408tC e() {
        return this.a.f();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C8820uh1) {
            return AbstractC8580tp0.a(this.a, ((C8820uh1) obj).a);
        }
        return false;
    }

    public C3590c00 f(int i2) {
        return this.a.g(i2);
    }

    public C3590c00 g(int i2) {
        return this.a.h(i2);
    }

    public C3590c00 h() {
        return this.a.j();
    }

    public int hashCode() {
        l lVar = this.a;
        if (lVar == null) {
            return 0;
        }
        return lVar.hashCode();
    }

    public C3590c00 i() {
        return this.a.k();
    }

    public int j() {
        return this.a.l().d;
    }

    public int k() {
        return this.a.l().a;
    }

    public int l() {
        return this.a.l().c;
    }

    public int m() {
        return this.a.l().b;
    }

    public boolean n() {
        return !this.a.l().equals(C3590c00.e);
    }

    public C8820uh1 o(int i2, int i3, int i4, int i5) {
        return this.a.n(i2, i3, i4, i5);
    }

    public boolean q() {
        return this.a.o();
    }

    public boolean r(int i2) {
        return this.a.q(i2);
    }

    public C8820uh1 s(int i2, int i3, int i4, int i5) {
        return new b(this).d(C3590c00.b(i2, i3, i4, i5)).a();
    }

    public void t(C3590c00[] c3590c00Arr) {
        this.a.r(c3590c00Arr);
    }

    public void u(C3590c00 c3590c00) {
        this.a.s(c3590c00);
    }

    public void v(C8820uh1 c8820uh1) {
        this.a.t(c8820uh1);
    }

    public void w(C3590c00 c3590c00) {
        this.a.u(c3590c00);
    }

    public WindowInsets x() {
        l lVar = this.a;
        if (lVar instanceof g) {
            return ((g) lVar).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: com.daaw.uh1$c */
    public static class c extends f {
        public static Field e = null;
        public static boolean f = false;
        public static Constructor g = null;
        public static boolean h = false;
        public WindowInsets c;
        public C3590c00 d;

        public c() {
            this.c = i();
        }

        private static WindowInsets i() {
            if (!f) {
                try {
                    e = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException unused) {
                }
                f = true;
            }
            Field field = e;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get(null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException unused2) {
                }
            }
            if (!h) {
                try {
                    g = WindowInsets.class.getConstructor(Rect.class);
                } catch (ReflectiveOperationException unused3) {
                }
                h = true;
            }
            Constructor constructor = g;
            if (constructor != null) {
                try {
                    return (WindowInsets) constructor.newInstance(new Rect());
                } catch (ReflectiveOperationException unused4) {
                }
            }
            return null;
        }

        @Override // com.daaw.C8820uh1.f
        public C8820uh1 b() {
            a();
            C8820uh1 c8820uh1Y = C8820uh1.y(this.c);
            c8820uh1Y.t(this.b);
            c8820uh1Y.w(this.d);
            return c8820uh1Y;
        }

        @Override // com.daaw.C8820uh1.f
        public void e(C3590c00 c3590c00) {
            this.d = c3590c00;
        }

        @Override // com.daaw.C8820uh1.f
        public void g(C3590c00 c3590c00) {
            WindowInsets windowInsets = this.c;
            if (windowInsets != null) {
                this.c = windowInsets.replaceSystemWindowInsets(c3590c00.a, c3590c00.b, c3590c00.c, c3590c00.d);
            }
        }

        public c(C8820uh1 c8820uh1) {
            super(c8820uh1);
            this.c = c8820uh1.x();
        }
    }

    /* JADX INFO: renamed from: com.daaw.uh1$d */
    public static class d extends f {
        public final WindowInsets.Builder c;

        public d() {
            this.c = AbstractC0533Ch1.a();
        }

        @Override // com.daaw.C8820uh1.f
        public C8820uh1 b() {
            a();
            C8820uh1 c8820uh1Y = C8820uh1.y(this.c.build());
            c8820uh1Y.t(this.b);
            return c8820uh1Y;
        }

        @Override // com.daaw.C8820uh1.f
        public void d(C3590c00 c3590c00) {
            this.c.setMandatorySystemGestureInsets(c3590c00.e());
        }

        @Override // com.daaw.C8820uh1.f
        public void e(C3590c00 c3590c00) {
            this.c.setStableInsets(c3590c00.e());
        }

        @Override // com.daaw.C8820uh1.f
        public void f(C3590c00 c3590c00) {
            this.c.setSystemGestureInsets(c3590c00.e());
        }

        @Override // com.daaw.C8820uh1.f
        public void g(C3590c00 c3590c00) {
            this.c.setSystemWindowInsets(c3590c00.e());
        }

        @Override // com.daaw.C8820uh1.f
        public void h(C3590c00 c3590c00) {
            this.c.setTappableElementInsets(c3590c00.e());
        }

        public d(C8820uh1 c8820uh1) {
            WindowInsets.Builder builderA;
            super(c8820uh1);
            WindowInsets windowInsetsX = c8820uh1.x();
            if (windowInsetsX != null) {
                builderA = AbstractC0429Bh1.a(windowInsetsX);
            } else {
                builderA = AbstractC0533Ch1.a();
            }
            this.c = builderA;
        }
    }

    /* JADX INFO: renamed from: com.daaw.uh1$h */
    public static class h extends g {
        public C3590c00 m;

        public h(C8820uh1 c8820uh1, WindowInsets windowInsets) {
            super(c8820uh1, windowInsets);
            this.m = null;
        }

        @Override // com.daaw.C8820uh1.l
        public C8820uh1 b() {
            return C8820uh1.y(this.c.consumeStableInsets());
        }

        @Override // com.daaw.C8820uh1.l
        public C8820uh1 c() {
            return C8820uh1.y(this.c.consumeSystemWindowInsets());
        }

        @Override // com.daaw.C8820uh1.l
        public final C3590c00 j() {
            if (this.m == null) {
                this.m = C3590c00.b(this.c.getStableInsetLeft(), this.c.getStableInsetTop(), this.c.getStableInsetRight(), this.c.getStableInsetBottom());
            }
            return this.m;
        }

        @Override // com.daaw.C8820uh1.l
        public boolean o() {
            return this.c.isConsumed();
        }

        @Override // com.daaw.C8820uh1.l
        public void u(C3590c00 c3590c00) {
            this.m = c3590c00;
        }

        public h(C8820uh1 c8820uh1, h hVar) {
            super(c8820uh1, hVar);
            this.m = null;
            this.m = hVar.m;
        }
    }

    /* JADX INFO: renamed from: com.daaw.uh1$g */
    public static class g extends l {
        public static boolean h = false;
        public static Method i;
        public static Class j;
        public static Field k;
        public static Field l;
        public final WindowInsets c;
        public C3590c00[] d;
        public C3590c00 e;
        public C8820uh1 f;
        public C3590c00 g;

        public g(C8820uh1 c8820uh1, WindowInsets windowInsets) {
            super(c8820uh1);
            this.e = null;
            this.c = windowInsets;
        }

        private static void A() {
            try {
                i = View.class.getDeclaredMethod("getViewRootImpl", null);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                j = cls;
                k = cls.getDeclaredField("mVisibleInsets");
                l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
                k.setAccessible(true);
                l.setAccessible(true);
            } catch (ReflectiveOperationException e) {
                e.getMessage();
            }
            h = true;
        }

        private C3590c00 v(int i2, boolean z) {
            C3590c00 c3590c00A = C3590c00.e;
            for (int i3 = 1; i3 <= 256; i3 <<= 1) {
                if ((i2 & i3) != 0) {
                    c3590c00A = C3590c00.a(c3590c00A, w(i3, z));
                }
            }
            return c3590c00A;
        }

        private C3590c00 x() {
            C8820uh1 c8820uh1 = this.f;
            return c8820uh1 != null ? c8820uh1.h() : C3590c00.e;
        }

        private C3590c00 y(View view) {
            if (Build.VERSION.SDK_INT >= 30) {
                throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
            }
            if (!h) {
                A();
            }
            Method method = i;
            if (method != null && j != null && k != null) {
                try {
                    Object objInvoke = method.invoke(view, null);
                    if (objInvoke == null) {
                        return null;
                    }
                    Rect rect = (Rect) k.get(l.get(objInvoke));
                    if (rect != null) {
                        return C3590c00.c(rect);
                    }
                    return null;
                } catch (ReflectiveOperationException e) {
                    e.getMessage();
                }
            }
            return null;
        }

        @Override // com.daaw.C8820uh1.l
        public void d(View view) {
            C3590c00 c3590c00Y = y(view);
            if (c3590c00Y == null) {
                c3590c00Y = C3590c00.e;
            }
            s(c3590c00Y);
        }

        @Override // com.daaw.C8820uh1.l
        public void e(C8820uh1 c8820uh1) {
            c8820uh1.v(this.f);
            c8820uh1.u(this.g);
        }

        @Override // com.daaw.C8820uh1.l
        public boolean equals(Object obj) {
            if (super.equals(obj)) {
                return Objects.equals(this.g, ((g) obj).g);
            }
            return false;
        }

        @Override // com.daaw.C8820uh1.l
        public C3590c00 g(int i2) {
            return v(i2, false);
        }

        @Override // com.daaw.C8820uh1.l
        public C3590c00 h(int i2) {
            return v(i2, true);
        }

        @Override // com.daaw.C8820uh1.l
        public final C3590c00 l() {
            if (this.e == null) {
                this.e = C3590c00.b(this.c.getSystemWindowInsetLeft(), this.c.getSystemWindowInsetTop(), this.c.getSystemWindowInsetRight(), this.c.getSystemWindowInsetBottom());
            }
            return this.e;
        }

        @Override // com.daaw.C8820uh1.l
        public C8820uh1 n(int i2, int i3, int i4, int i5) {
            b bVar = new b(C8820uh1.y(this.c));
            bVar.d(C8820uh1.p(l(), i2, i3, i4, i5));
            bVar.c(C8820uh1.p(j(), i2, i3, i4, i5));
            return bVar.a();
        }

        @Override // com.daaw.C8820uh1.l
        public boolean p() {
            return this.c.isRound();
        }

        @Override // com.daaw.C8820uh1.l
        public boolean q(int i2) {
            for (int i3 = 1; i3 <= 256; i3 <<= 1) {
                if ((i2 & i3) != 0 && !z(i3)) {
                    return false;
                }
            }
            return true;
        }

        @Override // com.daaw.C8820uh1.l
        public void r(C3590c00[] c3590c00Arr) {
            this.d = c3590c00Arr;
        }

        @Override // com.daaw.C8820uh1.l
        public void s(C3590c00 c3590c00) {
            this.g = c3590c00;
        }

        @Override // com.daaw.C8820uh1.l
        public void t(C8820uh1 c8820uh1) {
            this.f = c8820uh1;
        }

        public C3590c00 w(int i2, boolean z) {
            C3590c00 c3590c00H;
            int i3;
            if (i2 == 1) {
                return z ? C3590c00.b(0, Math.max(x().b, l().b), 0, 0) : C3590c00.b(0, l().b, 0, 0);
            }
            if (i2 == 2) {
                if (z) {
                    C3590c00 c3590c00X = x();
                    C3590c00 c3590c00J = j();
                    return C3590c00.b(Math.max(c3590c00X.a, c3590c00J.a), 0, Math.max(c3590c00X.c, c3590c00J.c), Math.max(c3590c00X.d, c3590c00J.d));
                }
                C3590c00 c3590c00L = l();
                C8820uh1 c8820uh1 = this.f;
                c3590c00H = c8820uh1 != null ? c8820uh1.h() : null;
                int iMin = c3590c00L.d;
                if (c3590c00H != null) {
                    iMin = Math.min(iMin, c3590c00H.d);
                }
                return C3590c00.b(c3590c00L.a, 0, c3590c00L.c, iMin);
            }
            if (i2 != 8) {
                if (i2 == 16) {
                    return k();
                }
                if (i2 == 32) {
                    return i();
                }
                if (i2 == 64) {
                    return m();
                }
                if (i2 != 128) {
                    return C3590c00.e;
                }
                C8820uh1 c8820uh12 = this.f;
                C8408tC c8408tCE = c8820uh12 != null ? c8820uh12.e() : f();
                return c8408tCE != null ? C3590c00.b(c8408tCE.b(), c8408tCE.d(), c8408tCE.c(), c8408tCE.a()) : C3590c00.e;
            }
            C3590c00[] c3590c00Arr = this.d;
            c3590c00H = c3590c00Arr != null ? c3590c00Arr[m.d(8)] : null;
            if (c3590c00H != null) {
                return c3590c00H;
            }
            C3590c00 c3590c00L2 = l();
            C3590c00 c3590c00X2 = x();
            int i4 = c3590c00L2.d;
            if (i4 > c3590c00X2.d) {
                return C3590c00.b(0, 0, 0, i4);
            }
            C3590c00 c3590c00 = this.g;
            return (c3590c00 == null || c3590c00.equals(C3590c00.e) || (i3 = this.g.d) <= c3590c00X2.d) ? C3590c00.e : C3590c00.b(0, 0, 0, i3);
        }

        public boolean z(int i2) {
            if (i2 != 1 && i2 != 2) {
                if (i2 == 4) {
                    return false;
                }
                if (i2 != 8 && i2 != 128) {
                    return true;
                }
            }
            return !w(i2, false).equals(C3590c00.e);
        }

        public g(C8820uh1 c8820uh1, g gVar) {
            this(c8820uh1, new WindowInsets(gVar.c));
        }
    }

    /* JADX INFO: renamed from: com.daaw.uh1$j */
    public static class j extends i {
        public C3590c00 n;
        public C3590c00 o;
        public C3590c00 p;

        public j(C8820uh1 c8820uh1, WindowInsets windowInsets) {
            super(c8820uh1, windowInsets);
            this.n = null;
            this.o = null;
            this.p = null;
        }

        @Override // com.daaw.C8820uh1.l
        public C3590c00 i() {
            if (this.o == null) {
                this.o = C3590c00.d(this.c.getMandatorySystemGestureInsets());
            }
            return this.o;
        }

        @Override // com.daaw.C8820uh1.l
        public C3590c00 k() {
            if (this.n == null) {
                this.n = C3590c00.d(this.c.getSystemGestureInsets());
            }
            return this.n;
        }

        @Override // com.daaw.C8820uh1.l
        public C3590c00 m() {
            if (this.p == null) {
                this.p = C3590c00.d(this.c.getTappableElementInsets());
            }
            return this.p;
        }

        @Override // com.daaw.C8820uh1.g, com.daaw.C8820uh1.l
        public C8820uh1 n(int i, int i2, int i3, int i4) {
            return C8820uh1.y(this.c.inset(i, i2, i3, i4));
        }

        public j(C8820uh1 c8820uh1, j jVar) {
            super(c8820uh1, jVar);
            this.n = null;
            this.o = null;
            this.p = null;
        }

        @Override // com.daaw.C8820uh1.h, com.daaw.C8820uh1.l
        public void u(C3590c00 c3590c00) {
        }
    }

    /* JADX INFO: renamed from: com.daaw.uh1$b */
    public static final class b {
        public final f a;

        public b() {
            int i = Build.VERSION.SDK_INT;
            if (i >= 30) {
                this.a = new e();
            } else if (i >= 29) {
                this.a = new d();
            } else {
                this.a = new c();
            }
        }

        public C8820uh1 a() {
            return this.a.b();
        }

        public b b(int i, C3590c00 c3590c00) {
            this.a.c(i, c3590c00);
            return this;
        }

        public b c(C3590c00 c3590c00) {
            this.a.e(c3590c00);
            return this;
        }

        public b d(C3590c00 c3590c00) {
            this.a.g(c3590c00);
            return this;
        }

        public b(C8820uh1 c8820uh1) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 30) {
                this.a = new e(c8820uh1);
            } else if (i >= 29) {
                this.a = new d(c8820uh1);
            } else {
                this.a = new c(c8820uh1);
            }
        }
    }

    public C8820uh1(C8820uh1 c8820uh1) {
        if (c8820uh1 != null) {
            l lVar = c8820uh1.a;
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 30 && (lVar instanceof k)) {
                this.a = new k(this, (k) lVar);
            } else if (i2 >= 29 && (lVar instanceof j)) {
                this.a = new j(this, (j) lVar);
            } else if (i2 >= 28 && (lVar instanceof i)) {
                this.a = new i(this, (i) lVar);
            } else if (lVar instanceof h) {
                this.a = new h(this, (h) lVar);
            } else if (lVar instanceof g) {
                this.a = new g(this, (g) lVar);
            } else {
                this.a = new l(this);
            }
            lVar.e(this);
            return;
        }
        this.a = new l(this);
    }

    /* JADX INFO: renamed from: com.daaw.uh1$l */
    public static class l {
        public static final C8820uh1 b = new b().a().a().b().c();
        public final C8820uh1 a;

        public l(C8820uh1 c8820uh1) {
            this.a = c8820uh1;
        }

        public C8820uh1 a() {
            return this.a;
        }

        public C8820uh1 b() {
            return this.a;
        }

        public C8820uh1 c() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            return p() == lVar.p() && o() == lVar.o() && AbstractC8580tp0.a(l(), lVar.l()) && AbstractC8580tp0.a(j(), lVar.j()) && AbstractC8580tp0.a(f(), lVar.f());
        }

        public C8408tC f() {
            return null;
        }

        public C3590c00 g(int i) {
            return C3590c00.e;
        }

        public C3590c00 h(int i) {
            if ((i & 8) == 0) {
                return C3590c00.e;
            }
            throw new IllegalArgumentException("Unable to query the maximum insets for IME");
        }

        public int hashCode() {
            return AbstractC8580tp0.b(Boolean.valueOf(p()), Boolean.valueOf(o()), l(), j(), f());
        }

        public C3590c00 i() {
            return l();
        }

        public C3590c00 j() {
            return C3590c00.e;
        }

        public C3590c00 k() {
            return l();
        }

        public C3590c00 l() {
            return C3590c00.e;
        }

        public C3590c00 m() {
            return l();
        }

        public C8820uh1 n(int i, int i2, int i3, int i4) {
            return b;
        }

        public boolean o() {
            return false;
        }

        public boolean p() {
            return false;
        }

        public boolean q(int i) {
            return true;
        }

        public void d(View view) {
        }

        public void e(C8820uh1 c8820uh1) {
        }

        public void r(C3590c00[] c3590c00Arr) {
        }

        public void s(C3590c00 c3590c00) {
        }

        public void t(C8820uh1 c8820uh1) {
        }

        public void u(C3590c00 c3590c00) {
        }
    }
}
