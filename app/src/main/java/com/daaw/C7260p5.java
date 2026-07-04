package com.daaw;

import android.R;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.SpannableString;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.lifecycle.g;
import com.daaw.AbstractC7898rO;
import com.daaw.C10196zc0;
import com.daaw.C6403m1;
import com.daaw.C6423m5;
import com.daaw.C7797r1;
import com.daaw.OJ0;
import com.daaw.Z1;
import com.google.android.gms.ads.AdRequest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: com.daaw.p5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7260p5 extends C5554j1 {
    public static final d A = new d(null);
    public static final int[] B = {AbstractC6740nD0.a, AbstractC6740nD0.b, AbstractC6740nD0.m, AbstractC6740nD0.x, AbstractC6740nD0.A, AbstractC6740nD0.B, AbstractC6740nD0.C, AbstractC6740nD0.D, AbstractC6740nD0.E, AbstractC6740nD0.F, AbstractC6740nD0.c, AbstractC6740nD0.d, AbstractC6740nD0.e, AbstractC6740nD0.f, AbstractC6740nD0.g, AbstractC6740nD0.h, AbstractC6740nD0.i, AbstractC6740nD0.j, AbstractC6740nD0.k, AbstractC6740nD0.l, AbstractC6740nD0.n, AbstractC6740nD0.o, AbstractC6740nD0.p, AbstractC6740nD0.q, AbstractC6740nD0.r, AbstractC6740nD0.s, AbstractC6740nD0.t, AbstractC6740nD0.u, AbstractC6740nD0.v, AbstractC6740nD0.w, AbstractC6740nD0.y, AbstractC6740nD0.z};
    public final C6423m5 d;
    public int e;
    public final AccessibilityManager f;
    public boolean g;
    public final Handler h;
    public C4156e2 i;
    public int j;
    public C3724cV0 k;
    public C3724cV0 l;
    public int m;
    public Integer n;
    public final C2823Ya o;
    public final InterfaceC3236ak p;
    public boolean q;
    public f r;
    public Map s;
    public C2823Ya t;
    public Map u;
    public g v;
    public boolean w;
    public final Runnable x;
    public final List y;
    public final NQ z;

    /* JADX INFO: renamed from: com.daaw.p5$a */
    public static final class a implements View.OnAttachStateChangeListener {
        public a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            G10.g(view, "view");
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            G10.g(view, "view");
            C7260p5.this.h.removeCallbacks(C7260p5.this.x);
        }
    }

    /* JADX INFO: renamed from: com.daaw.p5$b */
    public static final class b {
        public static final b a = new b();

        public static final void a(Z1 z1, C8461tP0 c8461tP0) {
            C4998h1 c4998h1;
            G10.g(z1, "info");
            G10.g(c8461tP0, "semanticsNode");
            if (!AbstractC7539q5.k(c8461tP0) || (c4998h1 = (C4998h1) AbstractC7067oP0.a(c8461tP0.s(), C6509mP0.a.m())) == null) {
                return;
            }
            z1.b(new Z1.a(R.id.accessibilityActionSetProgress, c4998h1.b()));
        }
    }

    /* JADX INFO: renamed from: com.daaw.p5$c */
    public static final class c {
        public static final c a = new c();

        public static final void a(AccessibilityEvent accessibilityEvent, int i, int i2) {
            G10.g(accessibilityEvent, "event");
            accessibilityEvent.setScrollDeltaX(i);
            accessibilityEvent.setScrollDeltaY(i2);
        }
    }

    /* JADX INFO: renamed from: com.daaw.p5$d */
    public static final class d {
        public /* synthetic */ d(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public d() {
        }
    }

    /* JADX INFO: renamed from: com.daaw.p5$e */
    public final class e extends AccessibilityNodeProvider {
        public e() {
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public void addExtraDataToAccessibilityNodeInfo(int i, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
            G10.g(accessibilityNodeInfo, "info");
            G10.g(str, "extraDataKey");
            C7260p5.this.w(i, accessibilityNodeInfo, str, bundle);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
            return C7260p5.this.D(i);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public boolean performAction(int i, int i2, Bundle bundle) {
            return C7260p5.this.T(i, i2, bundle);
        }
    }

    /* JADX INFO: renamed from: com.daaw.p5$f */
    public static final class f {
        public final C8461tP0 a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final long f;

        public f(C8461tP0 c8461tP0, int i, int i2, int i3, int i4, long j) {
            G10.g(c8461tP0, "node");
            this.a = c8461tP0;
            this.b = i;
            this.c = i2;
            this.d = i3;
            this.e = i4;
            this.f = j;
        }

        public final int a() {
            return this.b;
        }

        public final int b() {
            return this.d;
        }

        public final int c() {
            return this.c;
        }

        public final C8461tP0 d() {
            return this.a;
        }

        public final int e() {
            return this.e;
        }

        public final long f() {
            return this.f;
        }
    }

    /* JADX INFO: renamed from: com.daaw.p5$g */
    public static final class g {
        public final C6788nP0 a;
        public final Set b;

        public g(C8461tP0 c8461tP0, Map map) {
            G10.g(c8461tP0, "semanticsNode");
            G10.g(map, "currentSemanticsNodes");
            this.a = c8461tP0.s();
            this.b = new LinkedHashSet();
            List listO = c8461tP0.o();
            int size = listO.size();
            for (int i = 0; i < size; i++) {
                C8461tP0 c8461tP02 = (C8461tP0) listO.get(i);
                if (map.containsKey(Integer.valueOf(c8461tP02.i()))) {
                    this.b.add(Integer.valueOf(c8461tP02.i()));
                }
            }
        }

        public final Set a() {
            return this.b;
        }

        public final C6788nP0 b() {
            return this.a;
        }

        public final boolean c() {
            return this.a.p(C9584xP0.a.n());
        }
    }

    /* JADX INFO: renamed from: com.daaw.p5$h */
    public /* synthetic */ class h {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[EnumC4447f41.values().length];
            iArr[EnumC4447f41.On.ordinal()] = 1;
            iArr[EnumC4447f41.Off.ordinal()] = 2;
            iArr[EnumC4447f41.Indeterminate.ordinal()] = 3;
            a = iArr;
        }
    }

    /* JADX INFO: renamed from: com.daaw.p5$i */
    public static final class i extends AbstractC1623Ms {
        public Object E;
        public Object F;
        public Object G;
        public /* synthetic */ Object H;
        public int J;

        public i(InterfaceC1416Ks interfaceC1416Ks) {
            super(interfaceC1416Ks);
        }

        @Override // com.daaw.AbstractC7409pe
        public final Object q(Object obj) {
            this.H = obj;
            this.J |= Integer.MIN_VALUE;
            return C7260p5.this.x(this);
        }
    }

    /* JADX INFO: renamed from: com.daaw.p5$j */
    public static final class j extends AbstractC4192e90 implements NQ {
        public static final j B = new j();

        public j() {
            super(1);
        }

        @Override // com.daaw.NQ
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(E90 e90) {
            C6788nP0 c6788nP0J;
            G10.g(e90, "parent");
            C7346pP0 c7346pP0J = AbstractC8740uP0.j(e90);
            boolean z = false;
            if (c7346pP0J != null && (c6788nP0J = c7346pP0J.j()) != null && c6788nP0J.E()) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    /* JADX INFO: renamed from: com.daaw.p5$k */
    public static final class k extends AbstractC4192e90 implements LQ {
        public final /* synthetic */ ZN0 B;
        public final /* synthetic */ C7260p5 C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(ZN0 zn0, C7260p5 c7260p5) {
            super(0);
            this.B = zn0;
            this.C = c7260p5;
        }

        @Override // com.daaw.LQ
        public /* bridge */ /* synthetic */ Object invoke() {
            m61invoke();
            return G91.a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m61invoke() {
            this.B.a();
            this.B.e();
            this.B.b();
            this.B.c();
            if (0.0f == 0.0f && 0.0f == 0.0f) {
                return;
            }
            int iZ = this.C.Z(this.B.d());
            C7260p5.c0(this.C, iZ, 2048, 1, null, 8, null);
            AccessibilityEvent accessibilityEventC = this.C.C(iZ, 4096);
            if (Build.VERSION.SDK_INT >= 28) {
                c.a(accessibilityEventC, (int) 0.0f, (int) 0.0f);
            }
            this.C.a0(accessibilityEventC);
        }
    }

    /* JADX INFO: renamed from: com.daaw.p5$l */
    public static final class l extends AbstractC4192e90 implements NQ {
        public l() {
            super(1);
        }

        public final void a(ZN0 zn0) {
            G10.g(zn0, "it");
            C7260p5.this.f0(zn0);
        }

        @Override // com.daaw.NQ
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((ZN0) obj);
            return G91.a;
        }
    }

    /* JADX INFO: renamed from: com.daaw.p5$m */
    public static final class m extends AbstractC4192e90 implements NQ {
        public static final m B = new m();

        public m() {
            super(1);
        }

        @Override // com.daaw.NQ
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(E90 e90) {
            C6788nP0 c6788nP0J;
            G10.g(e90, "it");
            C7346pP0 c7346pP0J = AbstractC8740uP0.j(e90);
            boolean z = false;
            if (c7346pP0J != null && (c6788nP0J = c7346pP0J.j()) != null && c6788nP0J.E()) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    /* JADX INFO: renamed from: com.daaw.p5$n */
    public static final class n extends AbstractC4192e90 implements NQ {
        public static final n B = new n();

        public n() {
            super(1);
        }

        @Override // com.daaw.NQ
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(E90 e90) {
            G10.g(e90, "it");
            return Boolean.valueOf(AbstractC8740uP0.j(e90) != null);
        }
    }

    public C7260p5(C6423m5 c6423m5) {
        G10.g(c6423m5, "view");
        this.d = c6423m5;
        this.e = Integer.MIN_VALUE;
        Object systemService = c6423m5.getContext().getSystemService("accessibility");
        if (systemService == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        }
        this.f = (AccessibilityManager) systemService;
        this.h = new Handler(Looper.getMainLooper());
        this.i = new C4156e2(new e());
        this.j = Integer.MIN_VALUE;
        this.k = new C3724cV0();
        this.l = new C3724cV0();
        this.m = -1;
        this.o = new C2823Ya();
        this.p = AbstractC6035kk.b(-1, null, null, 6, null);
        this.q = true;
        this.s = AbstractC1473Lg0.h();
        this.t = new C2823Ya();
        this.u = new LinkedHashMap();
        this.v = new g(c6423m5.getSemanticsOwner().a(), AbstractC1473Lg0.h());
        c6423m5.addOnAttachStateChangeListener(new a());
        this.x = new Runnable() { // from class: com.daaw.o5
            @Override // java.lang.Runnable
            public final void run() {
                C7260p5.Y(this.B);
            }
        };
        this.y = new ArrayList();
        this.z = new l();
    }

    public static final float U(float f2, float f3) {
        if (Math.signum(f2) == Math.signum(f3)) {
            return Math.abs(f2) < Math.abs(f3) ? f2 : f3;
        }
        return 0.0f;
    }

    public static final void Y(C7260p5 c7260p5) {
        G10.g(c7260p5, "this$0");
        AbstractC1309Jr0.a(c7260p5.d, false, 1, null);
        c7260p5.A();
        c7260p5.w = false;
    }

    public static /* synthetic */ boolean c0(C7260p5 c7260p5, int i2, int i3, Integer num, List list, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            num = null;
        }
        if ((i4 & 8) != 0) {
            list = null;
        }
        return c7260p5.b0(i2, i3, num, list);
    }

    public final void A() {
        h0(this.d.getSemanticsOwner().a(), this.v);
        g0(I());
        q0();
    }

    public final boolean B(int i2) {
        if (!O(i2)) {
            return false;
        }
        this.j = Integer.MIN_VALUE;
        this.d.invalidate();
        c0(this, i2, 65536, null, null, 12, null);
        return true;
    }

    public final AccessibilityEvent C(int i2, int i3) {
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i3);
        G10.f(accessibilityEventObtain, "obtain(eventType)");
        accessibilityEventObtain.setEnabled(true);
        accessibilityEventObtain.setClassName("android.view.View");
        accessibilityEventObtain.setPackageName(this.d.getContext().getPackageName());
        accessibilityEventObtain.setSource(this.d, i2);
        C9026vP0 c9026vP0 = (C9026vP0) I().get(Integer.valueOf(i2));
        if (c9026vP0 != null) {
            accessibilityEventObtain.setPassword(AbstractC7539q5.r(c9026vP0.b()));
        }
        return accessibilityEventObtain;
    }

    public final AccessibilityNodeInfo D(int i2) {
        InterfaceC1764Ob0 interfaceC1764Ob0A;
        androidx.lifecycle.g gVarW;
        C6423m5.b viewTreeOwners = this.d.getViewTreeOwners();
        if (((viewTreeOwners == null || (interfaceC1764Ob0A = viewTreeOwners.a()) == null || (gVarW = interfaceC1764Ob0A.w()) == null) ? null : gVarW.b()) == g.b.DESTROYED) {
            return null;
        }
        Z1 z1A0 = Z1.a0();
        G10.f(z1A0, "obtain()");
        C9026vP0 c9026vP0 = (C9026vP0) I().get(Integer.valueOf(i2));
        if (c9026vP0 == null) {
            z1A0.e0();
            return null;
        }
        C8461tP0 c8461tP0B = c9026vP0.b();
        if (i2 == -1) {
            Object objJ = AbstractC2317Td1.J(this.d);
            z1A0.H0(objJ instanceof View ? (View) objJ : null);
        } else {
            if (c8461tP0B.m() == null) {
                throw new IllegalStateException("semanticsNode " + i2 + " has null parent");
            }
            C8461tP0 c8461tP0M = c8461tP0B.m();
            G10.d(c8461tP0M);
            int i3 = c8461tP0M.i();
            z1A0.I0(this.d, i3 != this.d.getSemanticsOwner().a().i() ? i3 : -1);
        }
        z1A0.R0(this.d, i2);
        Rect rectA = c9026vP0.a();
        long jH = this.d.h(AbstractC0460Bp0.a(rectA.left, rectA.top));
        long jH2 = this.d.h(AbstractC0460Bp0.a(rectA.right, rectA.bottom));
        z1A0.k0(new Rect((int) Math.floor(C9982yp0.l(jH)), (int) Math.floor(C9982yp0.m(jH)), (int) Math.ceil(C9982yp0.l(jH2)), (int) Math.ceil(C9982yp0.m(jH2))));
        V(i2, z1A0, c8461tP0B);
        return z1A0.Y0();
    }

    public final AccessibilityEvent E(int i2, Integer num, Integer num2, Integer num3, String str) {
        AccessibilityEvent accessibilityEventC = C(i2, 8192);
        if (num != null) {
            accessibilityEventC.setFromIndex(num.intValue());
        }
        if (num2 != null) {
            accessibilityEventC.setToIndex(num2.intValue());
        }
        if (num3 != null) {
            accessibilityEventC.setItemCount(num3.intValue());
        }
        if (str != null) {
            accessibilityEventC.getText().add(str);
        }
        return accessibilityEventC;
    }

    public final boolean F(MotionEvent motionEvent) {
        G10.g(motionEvent, "event");
        if (!N()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 7 || action == 9) {
            int iM = M(motionEvent.getX(), motionEvent.getY());
            boolean zDispatchGenericMotionEvent = this.d.getAndroidViewsHandler$ui_release().dispatchGenericMotionEvent(motionEvent);
            p0(iM);
            if (iM == Integer.MIN_VALUE) {
                return zDispatchGenericMotionEvent;
            }
            return true;
        }
        if (action != 10) {
            return false;
        }
        if (this.e == Integer.MIN_VALUE) {
            return this.d.getAndroidViewsHandler$ui_release().dispatchGenericMotionEvent(motionEvent);
        }
        p0(Integer.MIN_VALUE);
        return true;
    }

    public final int G(C8461tP0 c8461tP0) {
        C6788nP0 c6788nP0S = c8461tP0.s();
        C9584xP0 c9584xP0 = C9584xP0.a;
        return (c6788nP0S.p(c9584xP0.c()) || !c8461tP0.s().p(c9584xP0.w())) ? this.m : G21.g(((G21) c8461tP0.s().v(c9584xP0.w())).m());
    }

    public final int H(C8461tP0 c8461tP0) {
        C6788nP0 c6788nP0S = c8461tP0.s();
        C9584xP0 c9584xP0 = C9584xP0.a;
        return (c6788nP0S.p(c9584xP0.c()) || !c8461tP0.s().p(c9584xP0.w())) ? this.m : G21.j(((G21) c8461tP0.s().v(c9584xP0.w())).m());
    }

    public final Map I() {
        if (this.q) {
            this.s = AbstractC7539q5.o(this.d.getSemanticsOwner());
            this.q = false;
        }
        return this.s;
    }

    public final String J(C8461tP0 c8461tP0) {
        D7 d7;
        if (c8461tP0 == null) {
            return null;
        }
        C6788nP0 c6788nP0S = c8461tP0.s();
        C9584xP0 c9584xP0 = C9584xP0.a;
        if (c6788nP0S.p(c9584xP0.c())) {
            return G11.d((List) c8461tP0.s().v(c9584xP0.c()), ",", null, null, 0, null, null, 62, null);
        }
        if (AbstractC7539q5.t(c8461tP0)) {
            D7 d7L = L(c8461tP0.s());
            if (d7L != null) {
                return d7L.g();
            }
            return null;
        }
        List list = (List) AbstractC7067oP0.a(c8461tP0.s(), c9584xP0.v());
        if (list == null || (d7 = (D7) AbstractC2455Um.g0(list)) == null) {
            return null;
        }
        return d7.g();
    }

    public final InterfaceC7519q1 K(C8461tP0 c8461tP0, int i2) {
        String strJ;
        if (c8461tP0 == null || (strJ = J(c8461tP0)) == null || strJ.length() == 0) {
            return null;
        }
        if (i2 == 1) {
            C6403m1.a aVar = C6403m1.d;
            Locale locale = this.d.getContext().getResources().getConfiguration().locale;
            G10.f(locale, "view.context.resources.configuration.locale");
            C6403m1 c6403m1A = aVar.a(locale);
            c6403m1A.e(strJ);
            return c6403m1A;
        }
        if (i2 == 2) {
            C7797r1.a aVar2 = C7797r1.d;
            Locale locale2 = this.d.getContext().getResources().getConfiguration().locale;
            G10.f(locale2, "view.context.resources.configuration.locale");
            C7797r1 c7797r1A = aVar2.a(locale2);
            c7797r1A.e(strJ);
            return c7797r1A;
        }
        if (i2 != 4) {
            if (i2 == 8) {
                C7240p1 c7240p1A = C7240p1.c.a();
                c7240p1A.e(strJ);
                return c7240p1A;
            }
            if (i2 != 16) {
                return null;
            }
        }
        C6788nP0 c6788nP0S = c8461tP0.s();
        C6509mP0 c6509mP0 = C6509mP0.a;
        if (!c6788nP0S.p(c6509mP0.g())) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        NQ nq = (NQ) ((C4998h1) c8461tP0.s().v(c6509mP0.g())).a();
        if (!G10.c(nq != null ? (Boolean) nq.invoke(arrayList) : null, Boolean.TRUE)) {
            return null;
        }
        A21 a21 = (A21) arrayList.get(0);
        if (i2 == 4) {
            C6682n1 c6682n1A = C6682n1.d.a();
            c6682n1A.j(strJ, a21);
            return c6682n1A;
        }
        C6961o1 c6961o1A = C6961o1.f.a();
        c6961o1A.j(strJ, a21, c8461tP0);
        return c6961o1A;
    }

    public final D7 L(C6788nP0 c6788nP0) {
        return (D7) AbstractC7067oP0.a(c6788nP0, C9584xP0.a.e());
    }

    public final int M(float f2, float f3) {
        E90 e90A;
        C7346pP0 c7346pP0J = null;
        AbstractC1309Jr0.a(this.d, false, 1, null);
        VV vv = new VV();
        E90.x0(this.d.getRoot(), AbstractC0460Bp0.a(f2, f3), vv, false, false, 12, null);
        C7346pP0 c7346pP0 = (C7346pP0) AbstractC2455Um.r0(vv);
        if (c7346pP0 != null && (e90A = c7346pP0.a()) != null) {
            c7346pP0J = AbstractC8740uP0.j(e90A);
        }
        if (c7346pP0J == null) {
            return Integer.MIN_VALUE;
        }
        C8461tP0 c8461tP0 = new C8461tP0(c7346pP0J, false);
        K90 k90E = c8461tP0.e();
        if (c8461tP0.s().p(C9584xP0.a.k()) || k90E.q1()) {
            return Integer.MIN_VALUE;
        }
        AbstractC6314li0.a(this.d.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().get(c7346pP0J.a()));
        return Z(((InterfaceC7625qP0) c7346pP0J.c()).getId());
    }

    public final boolean N() {
        if (this.g) {
            return true;
        }
        return this.f.isEnabled() && this.f.isTouchExplorationEnabled();
    }

    public final boolean O(int i2) {
        return this.j == i2;
    }

    public final boolean P(C8461tP0 c8461tP0) {
        C6788nP0 c6788nP0S = c8461tP0.s();
        C9584xP0 c9584xP0 = C9584xP0.a;
        return !c6788nP0S.p(c9584xP0.c()) && c8461tP0.s().p(c9584xP0.e());
    }

    public final void Q(E90 e90) {
        if (this.o.add(e90)) {
            this.p.k(G91.a);
        }
    }

    public final void R(E90 e90) {
        G10.g(e90, "layoutNode");
        this.q = true;
        if (N()) {
            Q(e90);
        }
    }

    public final void S() {
        this.q = true;
        if (!N() || this.w) {
            return;
        }
        this.w = true;
        this.h.post(this.x);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x00d1 -> B:58:0x00d2). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:58:0x00d2
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:226)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:196)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:63)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:125)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.addCases(SwitchRegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:71)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:102)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:102)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:102)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    public final boolean T(int r15, int r16, android.os.Bundle r17) {
        /*
            Method dump skipped, instruction units count: 1272
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C7260p5.T(int, int, android.os.Bundle):boolean");
    }

    public final void V(int i2, Z1 z1, C8461tP0 c8461tP0) {
        K90 k90E;
        int iL;
        boolean zBooleanValue;
        G10.g(z1, "info");
        G10.g(c8461tP0, "semanticsNode");
        z1.n0("android.view.View");
        C6788nP0 c6788nP0S = c8461tP0.s();
        C9584xP0 c9584xP0 = C9584xP0.a;
        OJ0 oj0 = (OJ0) AbstractC7067oP0.a(c6788nP0S, c9584xP0.q());
        if (oj0 != null) {
            int iM = oj0.m();
            if (c8461tP0.t() || c8461tP0.o().isEmpty()) {
                OJ0.a aVar = OJ0.b;
                if (OJ0.j(oj0.m(), aVar.f())) {
                    z1.L0(this.d.getContext().getResources().getString(HD0.n));
                } else {
                    String str = OJ0.j(iM, aVar.a()) ? "android.widget.Button" : OJ0.j(iM, aVar.b()) ? "android.widget.CheckBox" : OJ0.j(iM, aVar.e()) ? "android.widget.Switch" : OJ0.j(iM, aVar.d()) ? "android.widget.RadioButton" : OJ0.j(iM, aVar.c()) ? "android.widget.ImageView" : null;
                    if (!OJ0.j(oj0.m(), aVar.c()) || AbstractC7539q5.n(c8461tP0.k(), j.B) == null || c8461tP0.s().E()) {
                        z1.n0(str);
                    }
                }
            }
            G91 g91 = G91.a;
        }
        if (AbstractC7539q5.t(c8461tP0)) {
            z1.n0("android.widget.EditText");
        }
        if (c8461tP0.h().p(c9584xP0.v())) {
            z1.n0("android.widget.TextView");
        }
        z1.F0(this.d.getContext().getPackageName());
        List listP = c8461tP0.p();
        int size = listP.size();
        for (int i3 = 0; i3 < size; i3++) {
            C8461tP0 c8461tP02 = (C8461tP0) listP.get(i3);
            if (I().containsKey(Integer.valueOf(c8461tP02.i()))) {
                AbstractC6314li0.a(this.d.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().get(c8461tP02.k()));
                z1.d(this.d, c8461tP02.i());
            }
        }
        if (this.j == i2) {
            z1.h0(true);
            z1.b(Z1.a.l);
        } else {
            z1.h0(false);
            z1.b(Z1.a.k);
        }
        l0(c8461tP0, z1);
        k0(c8461tP0, z1);
        C6788nP0 c6788nP0S2 = c8461tP0.s();
        C9584xP0 c9584xP02 = C9584xP0.a;
        z1.S0((CharSequence) AbstractC7067oP0.a(c6788nP0S2, c9584xP02.t()));
        EnumC4447f41 enumC4447f41 = (EnumC4447f41) AbstractC7067oP0.a(c8461tP0.s(), c9584xP02.x());
        if (enumC4447f41 != null) {
            z1.l0(true);
            int i4 = h.a[enumC4447f41.ordinal()];
            if (i4 == 1) {
                z1.m0(true);
                if ((oj0 == null ? false : OJ0.j(oj0.m(), OJ0.b.e())) && z1.B() == null) {
                    z1.S0(this.d.getContext().getResources().getString(HD0.j));
                }
            } else if (i4 == 2) {
                z1.m0(false);
                if ((oj0 == null ? false : OJ0.j(oj0.m(), OJ0.b.e())) && z1.B() == null) {
                    z1.S0(this.d.getContext().getResources().getString(HD0.i));
                }
            } else if (i4 == 3 && z1.B() == null) {
                z1.S0(this.d.getContext().getResources().getString(HD0.f));
            }
            G91 g912 = G91.a;
        }
        Boolean bool = (Boolean) AbstractC7067oP0.a(c8461tP0.s(), c9584xP02.s());
        if (bool != null) {
            boolean zBooleanValue2 = bool.booleanValue();
            if (oj0 == null ? false : OJ0.j(oj0.m(), OJ0.b.f())) {
                z1.O0(zBooleanValue2);
            } else {
                z1.l0(true);
                z1.m0(zBooleanValue2);
                if (z1.B() == null) {
                    z1.S0(zBooleanValue2 ? this.d.getContext().getResources().getString(HD0.m) : this.d.getContext().getResources().getString(HD0.h));
                }
            }
            G91 g913 = G91.a;
        }
        if (!c8461tP0.s().E() || c8461tP0.o().isEmpty()) {
            List list = (List) AbstractC7067oP0.a(c8461tP0.s(), c9584xP02.c());
            z1.r0(list != null ? (String) AbstractC2455Um.g0(list) : null);
        }
        if (c8461tP0.s().E()) {
            z1.M0(true);
        }
        String str2 = (String) AbstractC7067oP0.a(c8461tP0.s(), c9584xP02.u());
        if (str2 != null) {
            C8461tP0 c8461tP0M = c8461tP0;
            while (true) {
                if (c8461tP0M == null) {
                    zBooleanValue = false;
                    break;
                }
                C6788nP0 c6788nP0S3 = c8461tP0M.s();
                C9863yP0 c9863yP0 = C9863yP0.a;
                if (c6788nP0S3.p(c9863yP0.a())) {
                    zBooleanValue = ((Boolean) c8461tP0M.s().v(c9863yP0.a())).booleanValue();
                    break;
                }
                c8461tP0M = c8461tP0M.m();
            }
            if (zBooleanValue) {
                z1.W0(str2);
            }
        }
        C6788nP0 c6788nP0S4 = c8461tP0.s();
        C9584xP0 c9584xP03 = C9584xP0.a;
        if (((G91) AbstractC7067oP0.a(c6788nP0S4, c9584xP03.h())) != null) {
            z1.y0(true);
            G91 g914 = G91.a;
        }
        z1.J0(AbstractC7539q5.r(c8461tP0));
        z1.t0(AbstractC7539q5.t(c8461tP0));
        z1.u0(AbstractC7539q5.k(c8461tP0));
        z1.w0(c8461tP0.s().p(c9584xP03.g()));
        if (z1.P()) {
            z1.x0(((Boolean) c8461tP0.s().v(c9584xP03.g())).booleanValue());
            if (z1.Q()) {
                z1.a(2);
            } else {
                z1.a(1);
            }
        }
        if (c8461tP0.t()) {
            C8461tP0 c8461tP0M2 = c8461tP0.m();
            k90E = c8461tP0M2 != null ? c8461tP0M2.e() : null;
        } else {
            k90E = c8461tP0.e();
        }
        z1.X0(!(k90E != null ? k90E.q1() : false) && AbstractC7067oP0.a(c8461tP0.s(), c9584xP03.k()) == null);
        C10196zc0 c10196zc0 = (C10196zc0) AbstractC7067oP0.a(c8461tP0.s(), c9584xP03.m());
        if (c10196zc0 != null) {
            int i5 = c10196zc0.i();
            C10196zc0.a aVar2 = C10196zc0.b;
            z1.B0((C10196zc0.f(i5, aVar2.b()) || !C10196zc0.f(i5, aVar2.a())) ? 1 : 2);
            G91 g915 = G91.a;
        }
        z1.o0(false);
        C6788nP0 c6788nP0S5 = c8461tP0.s();
        C6509mP0 c6509mP0 = C6509mP0.a;
        C4998h1 c4998h1 = (C4998h1) AbstractC7067oP0.a(c6788nP0S5, c6509mP0.h());
        if (c4998h1 != null) {
            boolean zC = G10.c(AbstractC7067oP0.a(c8461tP0.s(), c9584xP03.s()), Boolean.TRUE);
            z1.o0(!zC);
            if (AbstractC7539q5.k(c8461tP0) && !zC) {
                z1.b(new Z1.a(16, c4998h1.b()));
            }
            G91 g916 = G91.a;
        }
        z1.C0(false);
        C4998h1 c4998h12 = (C4998h1) AbstractC7067oP0.a(c8461tP0.s(), c6509mP0.i());
        if (c4998h12 != null) {
            z1.C0(true);
            if (AbstractC7539q5.k(c8461tP0)) {
                z1.b(new Z1.a(32, c4998h12.b()));
            }
            G91 g917 = G91.a;
        }
        C4998h1 c4998h13 = (C4998h1) AbstractC7067oP0.a(c8461tP0.s(), c6509mP0.b());
        if (c4998h13 != null) {
            z1.b(new Z1.a(16384, c4998h13.b()));
            G91 g918 = G91.a;
        }
        if (AbstractC7539q5.k(c8461tP0)) {
            C4998h1 c4998h14 = (C4998h1) AbstractC7067oP0.a(c8461tP0.s(), c6509mP0.o());
            if (c4998h14 != null) {
                z1.b(new Z1.a(2097152, c4998h14.b()));
                G91 g919 = G91.a;
            }
            C4998h1 c4998h15 = (C4998h1) AbstractC7067oP0.a(c8461tP0.s(), c6509mP0.d());
            if (c4998h15 != null) {
                z1.b(new Z1.a(65536, c4998h15.b()));
                G91 g9110 = G91.a;
            }
            C4998h1 c4998h16 = (C4998h1) AbstractC7067oP0.a(c8461tP0.s(), c6509mP0.j());
            if (c4998h16 != null) {
                if (z1.Q() && this.d.getClipboardManager().a()) {
                    z1.b(new Z1.a(32768, c4998h16.b()));
                }
                G91 g9111 = G91.a;
            }
        }
        String strJ = J(c8461tP0);
        if (!(strJ == null || strJ.length() == 0)) {
            z1.U0(H(c8461tP0), G(c8461tP0));
            C4998h1 c4998h17 = (C4998h1) AbstractC7067oP0.a(c8461tP0.s(), c6509mP0.n());
            z1.b(new Z1.a(131072, c4998h17 != null ? c4998h17.b() : null));
            z1.a(PSKKeyManager.MAX_KEY_LENGTH_BYTES);
            z1.a(AdRequest.MAX_CONTENT_URL_LENGTH);
            z1.E0(11);
            List list2 = (List) AbstractC7067oP0.a(c8461tP0.s(), c9584xP03.c());
            if ((list2 == null || list2.isEmpty()) && c8461tP0.s().p(c6509mP0.g()) && !AbstractC7539q5.l(c8461tP0)) {
                z1.E0(z1.x() | 20);
            }
        }
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 26) {
            ArrayList arrayList = new ArrayList();
            CharSequence charSequenceC = z1.C();
            if (!(charSequenceC == null || charSequenceC.length() == 0) && c8461tP0.s().p(c6509mP0.g())) {
                arrayList.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
            }
            if (c8461tP0.s().p(c9584xP03.u())) {
                arrayList.add("androidx.compose.ui.semantics.testTag");
            }
            if (!arrayList.isEmpty()) {
                C3878d2 c3878d2 = C3878d2.a;
                AccessibilityNodeInfo accessibilityNodeInfoY0 = z1.Y0();
                G10.f(accessibilityNodeInfoY0, "info.unwrap()");
                c3878d2.a(accessibilityNodeInfoY0, arrayList);
            }
        }
        C2404Tz0 c2404Tz0 = (C2404Tz0) AbstractC7067oP0.a(c8461tP0.s(), c9584xP03.p());
        if (c2404Tz0 != null) {
            if (c8461tP0.s().p(c6509mP0.m())) {
                z1.n0("android.widget.SeekBar");
            } else {
                z1.n0("android.widget.ProgressBar");
            }
            if (c2404Tz0 != C2404Tz0.d.a()) {
                z1.K0(Z1.g.a(1, ((Number) c2404Tz0.c().e()).floatValue(), ((Number) c2404Tz0.c().m()).floatValue(), c2404Tz0.b()));
                if (z1.B() == null) {
                    InterfaceC7449pm interfaceC7449pmC = c2404Tz0.c();
                    float fK = AbstractC8417tE0.k(((((Number) interfaceC7449pmC.m()).floatValue() - ((Number) interfaceC7449pmC.e()).floatValue()) > 0.0f ? 1 : ((((Number) interfaceC7449pmC.m()).floatValue() - ((Number) interfaceC7449pmC.e()).floatValue()) == 0.0f ? 0 : -1)) == 0 ? 0.0f : (c2404Tz0.b() - ((Number) interfaceC7449pmC.e()).floatValue()) / (((Number) interfaceC7449pmC.m()).floatValue() - ((Number) interfaceC7449pmC.e()).floatValue()), 0.0f, 1.0f);
                    if (fK == 0.0f) {
                        iL = 0;
                    } else {
                        iL = 100;
                        if (!(fK == 1.0f)) {
                            iL = AbstractC8417tE0.l(AbstractC8261sh0.b(fK * 100), 1, 99);
                        }
                    }
                    z1.S0(this.d.getContext().getResources().getString(HD0.o, Integer.valueOf(iL)));
                }
            } else if (z1.B() == null) {
                z1.S0(this.d.getContext().getResources().getString(HD0.e));
            }
            if (c8461tP0.s().p(c6509mP0.m()) && AbstractC7539q5.k(c8461tP0)) {
                if (c2404Tz0.b() < AbstractC8417tE0.c(((Number) c2404Tz0.c().m()).floatValue(), ((Number) c2404Tz0.c().e()).floatValue())) {
                    z1.b(Z1.a.q);
                }
                if (c2404Tz0.b() > AbstractC8417tE0.g(((Number) c2404Tz0.c().e()).floatValue(), ((Number) c2404Tz0.c().m()).floatValue())) {
                    z1.b(Z1.a.r);
                }
            }
        }
        if (i6 >= 24) {
            b.a(z1, c8461tP0);
        }
        AbstractC0872Fm.b(c8461tP0, z1);
        AbstractC0872Fm.c(c8461tP0, z1);
        AbstractC6314li0.a(AbstractC7067oP0.a(c8461tP0.s(), c9584xP03.i()));
        AbstractC6314li0.a(AbstractC7067oP0.a(c8461tP0.s(), c9584xP03.y()));
        z1.G0((CharSequence) AbstractC7067oP0.a(c8461tP0.s(), c9584xP03.n()));
        if (AbstractC7539q5.k(c8461tP0)) {
            C4998h1 c4998h18 = (C4998h1) AbstractC7067oP0.a(c8461tP0.s(), c6509mP0.f());
            if (c4998h18 != null) {
                z1.b(new Z1.a(262144, c4998h18.b()));
                G91 g9112 = G91.a;
            }
            C4998h1 c4998h19 = (C4998h1) AbstractC7067oP0.a(c8461tP0.s(), c6509mP0.a());
            if (c4998h19 != null) {
                z1.b(new Z1.a(524288, c4998h19.b()));
                G91 g9113 = G91.a;
            }
            C4998h1 c4998h110 = (C4998h1) AbstractC7067oP0.a(c8461tP0.s(), c6509mP0.e());
            if (c4998h110 != null) {
                z1.b(new Z1.a(1048576, c4998h110.b()));
                G91 g9114 = G91.a;
            }
            if (c8461tP0.s().p(c6509mP0.c())) {
                List list3 = (List) c8461tP0.s().v(c6509mP0.c());
                int size2 = list3.size();
                int[] iArr = B;
                if (size2 >= iArr.length) {
                    throw new IllegalStateException("Can't have more than " + iArr.length + " custom actions for one widget");
                }
                C3724cV0 c3724cV0 = new C3724cV0();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                if (this.l.e(i2)) {
                    Map map = (Map) this.l.g(i2);
                    List listO0 = AbstractC5431ib.o0(iArr);
                    ArrayList arrayList2 = new ArrayList();
                    if (list3.size() > 0) {
                        AbstractC6314li0.a(list3.get(0));
                        G10.d(map);
                        throw null;
                    }
                    if (arrayList2.size() > 0) {
                        AbstractC6314li0.a(arrayList2.get(0));
                        ((Number) listO0.get(0)).intValue();
                        throw null;
                    }
                } else if (list3.size() > 0) {
                    AbstractC6314li0.a(list3.get(0));
                    int i7 = iArr[0];
                    throw null;
                }
                this.k.l(i2, c3724cV0);
                this.l.l(i2, linkedHashMap);
            }
        }
    }

    public final boolean W(int i2, List list) {
        boolean z;
        ZN0 zn0M = AbstractC7539q5.m(list, i2);
        if (zn0M != null) {
            z = false;
        } else {
            ZN0 zn0 = new ZN0(i2, this.y, null, null, null, null);
            z = true;
            zn0M = zn0;
        }
        this.y.add(zn0M);
        return z;
    }

    public final boolean X(int i2) {
        if (!N() || O(i2)) {
            return false;
        }
        int i3 = this.j;
        if (i3 != Integer.MIN_VALUE) {
            c0(this, i3, 65536, null, null, 12, null);
        }
        this.j = i2;
        this.d.invalidate();
        c0(this, i2, 32768, null, null, 12, null);
        return true;
    }

    public final int Z(int i2) {
        if (i2 == this.d.getSemanticsOwner().a().i()) {
            return -1;
        }
        return i2;
    }

    public final boolean a0(AccessibilityEvent accessibilityEvent) {
        if (N()) {
            return this.d.getParent().requestSendAccessibilityEvent(this.d, accessibilityEvent);
        }
        return false;
    }

    @Override // com.daaw.C5554j1
    public C4156e2 b(View view) {
        G10.g(view, "host");
        return this.i;
    }

    public final boolean b0(int i2, int i3, Integer num, List list) {
        if (i2 == Integer.MIN_VALUE || !N()) {
            return false;
        }
        AccessibilityEvent accessibilityEventC = C(i2, i3);
        if (num != null) {
            accessibilityEventC.setContentChangeTypes(num.intValue());
        }
        if (list != null) {
            accessibilityEventC.setContentDescription(G11.d(list, ",", null, null, 0, null, null, 62, null));
        }
        return a0(accessibilityEventC);
    }

    public final void d0(int i2, int i3, String str) {
        AccessibilityEvent accessibilityEventC = C(Z(i2), 32);
        accessibilityEventC.setContentChangeTypes(i3);
        if (str != null) {
            accessibilityEventC.getText().add(str);
        }
        a0(accessibilityEventC);
    }

    public final void e0(int i2) {
        f fVar = this.r;
        if (fVar != null) {
            if (i2 != fVar.d().i()) {
                return;
            }
            if (SystemClock.uptimeMillis() - fVar.f() <= 1000) {
                AccessibilityEvent accessibilityEventC = C(Z(fVar.d().i()), 131072);
                accessibilityEventC.setFromIndex(fVar.b());
                accessibilityEventC.setToIndex(fVar.e());
                accessibilityEventC.setAction(fVar.a());
                accessibilityEventC.setMovementGranularity(fVar.c());
                accessibilityEventC.getText().add(J(fVar.d()));
                a0(accessibilityEventC);
            }
        }
        this.r = null;
    }

    public final void f0(ZN0 zn0) {
        if (zn0.isValid()) {
            this.d.getSnapshotObserver().e(zn0, this.z, new k(zn0, this));
        }
    }

    public final void g0(Map map) {
        int i2;
        String strG;
        C7260p5 c7260p5 = this;
        boolean z = true;
        G10.g(map, "newSemanticsNodes");
        ArrayList arrayList = new ArrayList(c7260p5.y);
        c7260p5.y.clear();
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            g gVar = (g) c7260p5.u.get(Integer.valueOf(iIntValue));
            if (gVar != null) {
                C9026vP0 c9026vP0 = (C9026vP0) map.get(Integer.valueOf(iIntValue));
                C8461tP0 c8461tP0B = c9026vP0 != null ? c9026vP0.b() : null;
                G10.d(c8461tP0B);
                boolean zU = false;
                for (Map.Entry entry : c8461tP0B.s()) {
                    Object key = entry.getKey();
                    C9584xP0 c9584xP0 = C9584xP0.a;
                    if (((G10.c(key, c9584xP0.i()) || G10.c(entry.getKey(), c9584xP0.y())) ? c7260p5.W(iIntValue, arrayList) : false) || !G10.c(entry.getValue(), AbstractC7067oP0.a(gVar.b(), (BP0) entry.getKey()))) {
                        BP0 bp0 = (BP0) entry.getKey();
                        if (G10.c(bp0, c9584xP0.n())) {
                            Object value = entry.getValue();
                            if (value == null) {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                            }
                            String str = (String) value;
                            if (gVar.c()) {
                                c7260p5.d0(iIntValue, 8, str);
                            }
                        } else if (G10.c(bp0, c9584xP0.t()) ? true : G10.c(bp0, c9584xP0.x())) {
                            c0(c7260p5, c7260p5.Z(iIntValue), 2048, 64, null, 8, null);
                            c0(c7260p5, c7260p5.Z(iIntValue), 2048, 0, null, 8, null);
                        } else if (G10.c(bp0, c9584xP0.p())) {
                            c0(c7260p5, c7260p5.Z(iIntValue), 2048, 64, null, 8, null);
                            c0(c7260p5, c7260p5.Z(iIntValue), 2048, 0, null, 8, null);
                        } else if (G10.c(bp0, c9584xP0.s())) {
                            OJ0 oj0 = (OJ0) AbstractC7067oP0.a(c8461tP0B.h(), c9584xP0.q());
                            if (!(oj0 == null ? false : OJ0.j(oj0.m(), OJ0.b.f()))) {
                                c0(c7260p5, c7260p5.Z(iIntValue), 2048, 64, null, 8, null);
                                c0(c7260p5, c7260p5.Z(iIntValue), 2048, 0, null, 8, null);
                            } else if (G10.c(AbstractC7067oP0.a(c8461tP0B.h(), c9584xP0.s()), Boolean.TRUE)) {
                                AccessibilityEvent accessibilityEventC = c7260p5.C(c7260p5.Z(iIntValue), 4);
                                C8461tP0 c8461tP0 = new C8461tP0(c8461tP0B.l(), z);
                                List list = (List) AbstractC7067oP0.a(c8461tP0.h(), c9584xP0.c());
                                String strD = list != null ? G11.d(list, ",", null, null, 0, null, null, 62, null) : null;
                                List list2 = (List) AbstractC7067oP0.a(c8461tP0.h(), c9584xP0.v());
                                String strD2 = list2 != null ? G11.d(list2, ",", null, null, 0, null, null, 62, null) : null;
                                if (strD != null) {
                                    accessibilityEventC.setContentDescription(strD);
                                    G91 g91 = G91.a;
                                }
                                if (strD2 != null) {
                                    accessibilityEventC.getText().add(strD2);
                                }
                                c7260p5.a0(accessibilityEventC);
                            } else {
                                c0(c7260p5, c7260p5.Z(iIntValue), 2048, 0, null, 8, null);
                            }
                        } else if (G10.c(bp0, c9584xP0.c())) {
                            int iZ = c7260p5.Z(iIntValue);
                            Object value2 = entry.getValue();
                            if (value2 == null) {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            }
                            c7260p5.b0(iZ, 2048, 4, (List) value2);
                        } else {
                            if (G10.c(bp0, c9584xP0.e())) {
                                if (AbstractC7539q5.t(c8461tP0B)) {
                                    D7 d7L = c7260p5.L(gVar.b());
                                    if (d7L == null) {
                                        d7L = "";
                                    }
                                    D7 d7L2 = c7260p5.L(c8461tP0B.s());
                                    if (d7L2 == null) {
                                        d7L2 = "";
                                    }
                                    int length = d7L.length();
                                    int length2 = d7L2.length();
                                    int iH = AbstractC8417tE0.h(length, length2);
                                    int i3 = 0;
                                    while (i3 < iH && d7L.charAt(i3) == d7L2.charAt(i3)) {
                                        i3++;
                                    }
                                    int i4 = 0;
                                    while (true) {
                                        if (i4 >= iH - i3) {
                                            i2 = length;
                                            break;
                                        }
                                        i2 = length;
                                        if (d7L.charAt((length - 1) - i4) != d7L2.charAt((length2 - 1) - i4)) {
                                            break;
                                        }
                                        i4++;
                                        length = i2;
                                    }
                                    int i5 = (i2 - i4) - i3;
                                    int i6 = (length2 - i4) - i3;
                                    AccessibilityEvent accessibilityEventC2 = c7260p5.C(c7260p5.Z(iIntValue), 16);
                                    accessibilityEventC2.setFromIndex(i3);
                                    accessibilityEventC2.setRemovedCount(i5);
                                    accessibilityEventC2.setAddedCount(i6);
                                    accessibilityEventC2.setBeforeText(d7L);
                                    accessibilityEventC2.getText().add(c7260p5.o0(d7L2, 100000));
                                    c7260p5.a0(accessibilityEventC2);
                                } else {
                                    c0(c7260p5, c7260p5.Z(iIntValue), 2048, 2, null, 8, null);
                                }
                            } else if (G10.c(bp0, c9584xP0.w())) {
                                D7 d7L3 = c7260p5.L(c8461tP0B.s());
                                if (d7L3 == null || (strG = d7L3.g()) == null) {
                                    strG = "";
                                }
                                long jM = ((G21) c8461tP0B.s().v(c9584xP0.w())).m();
                                c7260p5.a0(c7260p5.E(c7260p5.Z(iIntValue), Integer.valueOf(G21.j(jM)), Integer.valueOf(G21.g(jM)), Integer.valueOf(strG.length()), (String) c7260p5.o0(strG, 100000)));
                                c7260p5.e0(c8461tP0B.i());
                            } else if (G10.c(bp0, c9584xP0.i()) ? true : G10.c(bp0, c9584xP0.y())) {
                                c7260p5.Q(c8461tP0B.k());
                                ZN0 zn0M = AbstractC7539q5.m(c7260p5.y, iIntValue);
                                G10.d(zn0M);
                                AbstractC6314li0.a(AbstractC7067oP0.a(c8461tP0B.s(), c9584xP0.i()));
                                zn0M.f(null);
                                AbstractC6314li0.a(AbstractC7067oP0.a(c8461tP0B.s(), c9584xP0.y()));
                                zn0M.g(null);
                                c7260p5.f0(zn0M);
                            } else if (G10.c(bp0, c9584xP0.g())) {
                                Object value3 = entry.getValue();
                                if (value3 == null) {
                                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
                                }
                                if (((Boolean) value3).booleanValue()) {
                                    c7260p5.a0(c7260p5.C(c7260p5.Z(c8461tP0B.i()), 8));
                                }
                                c0(c7260p5, c7260p5.Z(c8461tP0B.i()), 2048, 0, null, 8, null);
                            } else {
                                C6509mP0 c6509mP0 = C6509mP0.a;
                                if (G10.c(bp0, c6509mP0.c())) {
                                    List list3 = (List) c8461tP0B.s().v(c6509mP0.c());
                                    List list4 = (List) AbstractC7067oP0.a(gVar.b(), c6509mP0.c());
                                    if (list4 != null) {
                                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                                        if (list3.size() > 0) {
                                            AbstractC6314li0.a(list3.get(0));
                                            throw null;
                                        }
                                        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                                        if (list4.size() > 0) {
                                            AbstractC6314li0.a(list4.get(0));
                                            throw null;
                                        }
                                        zU = (linkedHashSet.containsAll(linkedHashSet2) && linkedHashSet2.containsAll(linkedHashSet)) ? false : true;
                                    } else if (!list3.isEmpty()) {
                                        z = true;
                                        zU = true;
                                    }
                                    z = true;
                                } else if (entry.getValue() instanceof C4998h1) {
                                    Object value4 = entry.getValue();
                                    if (value4 == null) {
                                        throw new NullPointerException("null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
                                    }
                                    zU = !AbstractC7539q5.j((C4998h1) value4, AbstractC7067oP0.a(gVar.b(), (BP0) entry.getKey()));
                                    z = true;
                                } else {
                                    z = true;
                                    zU = true;
                                }
                            }
                            z = true;
                        }
                    }
                    z = true;
                }
                if (!zU) {
                    zU = AbstractC7539q5.u(c8461tP0B, gVar);
                }
                if (zU) {
                    c0(c7260p5, c7260p5.Z(iIntValue), 2048, 0, null, 8, null);
                }
                z = true;
                c7260p5 = this;
            }
        }
    }

    public final void h0(C8461tP0 c8461tP0, g gVar) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        List listO = c8461tP0.o();
        int size = listO.size();
        for (int i2 = 0; i2 < size; i2++) {
            C8461tP0 c8461tP02 = (C8461tP0) listO.get(i2);
            if (I().containsKey(Integer.valueOf(c8461tP02.i()))) {
                if (!gVar.a().contains(Integer.valueOf(c8461tP02.i()))) {
                    Q(c8461tP0.k());
                    return;
                }
                linkedHashSet.add(Integer.valueOf(c8461tP02.i()));
            }
        }
        Iterator it = gVar.a().iterator();
        while (it.hasNext()) {
            if (!linkedHashSet.contains(Integer.valueOf(((Number) it.next()).intValue()))) {
                Q(c8461tP0.k());
                return;
            }
        }
        List listO2 = c8461tP0.o();
        int size2 = listO2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            C8461tP0 c8461tP03 = (C8461tP0) listO2.get(i3);
            if (I().containsKey(Integer.valueOf(c8461tP03.i()))) {
                Object obj = this.u.get(Integer.valueOf(c8461tP03.i()));
                G10.d(obj);
                h0(c8461tP03, (g) obj);
            }
        }
    }

    public final void i0(E90 e90, C2823Ya c2823Ya) {
        E90 e90N;
        C7346pP0 c7346pP0J;
        if (e90.C0() && !this.d.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().containsKey(e90)) {
            C7346pP0 c7346pP0J2 = AbstractC8740uP0.j(e90);
            if (c7346pP0J2 == null) {
                E90 e90N2 = AbstractC7539q5.n(e90, n.B);
                c7346pP0J2 = e90N2 != null ? AbstractC8740uP0.j(e90N2) : null;
                if (c7346pP0J2 == null) {
                    return;
                }
            }
            if (!c7346pP0J2.j().E() && (e90N = AbstractC7539q5.n(e90, m.B)) != null && (c7346pP0J = AbstractC8740uP0.j(e90N)) != null) {
                c7346pP0J2 = c7346pP0J;
            }
            int id = ((InterfaceC7625qP0) c7346pP0J2.c()).getId();
            if (c2823Ya.add(Integer.valueOf(id))) {
                c0(this, Z(id), 2048, 1, null, 8, null);
            }
        }
    }

    public final boolean j0(C8461tP0 c8461tP0, int i2, int i3, boolean z) {
        String strJ;
        C6788nP0 c6788nP0S = c8461tP0.s();
        C6509mP0 c6509mP0 = C6509mP0.a;
        if (c6788nP0S.p(c6509mP0.n()) && AbstractC7539q5.k(c8461tP0)) {
            InterfaceC3986dR interfaceC3986dR = (InterfaceC3986dR) ((C4998h1) c8461tP0.s().v(c6509mP0.n())).a();
            if (interfaceC3986dR != null) {
                return ((Boolean) interfaceC3986dR.invoke(Integer.valueOf(i2), Integer.valueOf(i3), Boolean.valueOf(z))).booleanValue();
            }
            return false;
        }
        if ((i2 == i3 && i3 == this.m) || (strJ = J(c8461tP0)) == null) {
            return false;
        }
        if (i2 < 0 || i2 != i3 || i3 > strJ.length()) {
            i2 = -1;
        }
        this.m = i2;
        boolean z2 = strJ.length() > 0;
        a0(E(Z(c8461tP0.i()), z2 ? Integer.valueOf(this.m) : null, z2 ? Integer.valueOf(this.m) : null, z2 ? Integer.valueOf(strJ.length()) : null, strJ));
        e0(c8461tP0.i());
        return true;
    }

    public final void k0(C8461tP0 c8461tP0, Z1 z1) {
        C6788nP0 c6788nP0S = c8461tP0.s();
        C9584xP0 c9584xP0 = C9584xP0.a;
        if (c6788nP0S.p(c9584xP0.f())) {
            z1.s0(true);
            z1.v0((CharSequence) AbstractC7067oP0.a(c8461tP0.s(), c9584xP0.f()));
        }
    }

    public final void l0(C8461tP0 c8461tP0, Z1 z1) {
        D7 d7;
        AbstractC7898rO.b fontFamilyResolver = this.d.getFontFamilyResolver();
        D7 d7L = L(c8461tP0.s());
        SpannableString spannableStringB = null;
        SpannableString spannableString = (SpannableString) o0(d7L != null ? AbstractC6976o4.b(d7L, this.d.getDensity(), fontFamilyResolver) : null, 100000);
        List list = (List) AbstractC7067oP0.a(c8461tP0.s(), C9584xP0.a.v());
        if (list != null && (d7 = (D7) AbstractC2455Um.g0(list)) != null) {
            spannableStringB = AbstractC6976o4.b(d7, this.d.getDensity(), fontFamilyResolver);
        }
        SpannableString spannableString2 = (SpannableString) o0(spannableStringB, 100000);
        if (spannableString == null) {
            spannableString = spannableString2;
        }
        z1.T0(spannableString);
    }

    public final RectF m0(C8461tP0 c8461tP0, C3103aF0 c3103aF0) {
        if (c8461tP0 == null) {
            return null;
        }
        C3103aF0 c3103aF0N = c3103aF0.n(c8461tP0.n());
        C3103aF0 c3103aF0F = c8461tP0.f();
        C3103aF0 c3103aF0K = c3103aF0N.l(c3103aF0F) ? c3103aF0N.k(c3103aF0F) : null;
        if (c3103aF0K == null) {
            return null;
        }
        long jH = this.d.h(AbstractC0460Bp0.a(c3103aF0K.f(), c3103aF0K.i()));
        long jH2 = this.d.h(AbstractC0460Bp0.a(c3103aF0K.g(), c3103aF0K.c()));
        return new RectF(C9982yp0.l(jH), C9982yp0.m(jH), C9982yp0.l(jH2), C9982yp0.m(jH2));
    }

    public final boolean n0(C8461tP0 c8461tP0, int i2, boolean z, boolean z2) {
        int iH;
        int i3;
        int i4 = c8461tP0.i();
        Integer num = this.n;
        if (num == null || i4 != num.intValue()) {
            this.m = -1;
            this.n = Integer.valueOf(c8461tP0.i());
        }
        String strJ = J(c8461tP0);
        boolean z3 = false;
        if (strJ != null && strJ.length() != 0) {
            InterfaceC7519q1 interfaceC7519q1K = K(c8461tP0, i2);
            if (interfaceC7519q1K == null) {
                return false;
            }
            int iG = G(c8461tP0);
            if (iG == -1) {
                iG = z ? 0 : strJ.length();
            }
            int[] iArrA = z ? interfaceC7519q1K.a(iG) : interfaceC7519q1K.b(iG);
            if (iArrA == null) {
                return false;
            }
            int i5 = iArrA[0];
            z3 = true;
            int i6 = iArrA[1];
            if (z2 && P(c8461tP0)) {
                iH = H(c8461tP0);
                if (iH == -1) {
                    iH = z ? i5 : i6;
                }
                i3 = z ? i6 : i5;
            } else {
                iH = z ? i6 : i5;
                i3 = iH;
            }
            this.r = new f(c8461tP0, z ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : AdRequest.MAX_CONTENT_URL_LENGTH, i2, i5, i6, SystemClock.uptimeMillis());
            j0(c8461tP0, iH, i3, true);
        }
        return z3;
    }

    public final CharSequence o0(CharSequence charSequence, int i2) {
        if (i2 <= 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (charSequence == null || charSequence.length() == 0 || charSequence.length() <= i2) {
            return charSequence;
        }
        int i3 = i2 - 1;
        if (Character.isHighSurrogate(charSequence.charAt(i3)) && Character.isLowSurrogate(charSequence.charAt(i2))) {
            i2 = i3;
        }
        return charSequence.subSequence(0, i2);
    }

    public final void p0(int i2) {
        int i3 = this.e;
        if (i3 == i2) {
            return;
        }
        this.e = i2;
        c0(this, i2, 128, null, null, 12, null);
        c0(this, i3, PSKKeyManager.MAX_KEY_LENGTH_BYTES, null, null, 12, null);
    }

    public final void q0() {
        C6788nP0 c6788nP0B;
        for (Integer num : this.t) {
            C9026vP0 c9026vP0 = (C9026vP0) I().get(num);
            String str = null;
            C8461tP0 c8461tP0B = c9026vP0 != null ? c9026vP0.b() : null;
            if (c8461tP0B == null || !AbstractC7539q5.q(c8461tP0B)) {
                this.t.remove(num);
                G10.f(num, "id");
                int iIntValue = num.intValue();
                g gVar = (g) this.u.get(num);
                if (gVar != null && (c6788nP0B = gVar.b()) != null) {
                    str = (String) AbstractC7067oP0.a(c6788nP0B, C9584xP0.a.n());
                }
                d0(iIntValue, 32, str);
            }
        }
        this.u.clear();
        for (Map.Entry entry : I().entrySet()) {
            if (AbstractC7539q5.q(((C9026vP0) entry.getValue()).b()) && this.t.add(entry.getKey())) {
                d0(((Number) entry.getKey()).intValue(), 16, (String) ((C9026vP0) entry.getValue()).b().s().v(C9584xP0.a.n()));
            }
            this.u.put(entry.getKey(), new g(((C9026vP0) entry.getValue()).b(), I()));
        }
        this.v = new g(this.d.getSemanticsOwner().a(), I());
    }

    public final void w(int i2, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
        C8461tP0 c8461tP0B;
        String str2;
        C9026vP0 c9026vP0 = (C9026vP0) I().get(Integer.valueOf(i2));
        if (c9026vP0 == null || (c8461tP0B = c9026vP0.b()) == null) {
            return;
        }
        String strJ = J(c8461tP0B);
        C6788nP0 c6788nP0S = c8461tP0B.s();
        C6509mP0 c6509mP0 = C6509mP0.a;
        if (!c6788nP0S.p(c6509mP0.g()) || bundle == null || !G10.c(str, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
            C6788nP0 c6788nP0S2 = c8461tP0B.s();
            C9584xP0 c9584xP0 = C9584xP0.a;
            if (!c6788nP0S2.p(c9584xP0.u()) || bundle == null || !G10.c(str, "androidx.compose.ui.semantics.testTag") || (str2 = (String) AbstractC7067oP0.a(c8461tP0B.s(), c9584xP0.u())) == null) {
                return;
            }
            accessibilityNodeInfo.getExtras().putCharSequence(str, str2);
            return;
        }
        int i3 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
        int i4 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1);
        if (i4 <= 0 || i3 < 0) {
            return;
        }
        if (i3 >= (strJ != null ? strJ.length() : Integer.MAX_VALUE)) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        NQ nq = (NQ) ((C4998h1) c8461tP0B.s().v(c6509mP0.g())).a();
        if (G10.c(nq != null ? (Boolean) nq.invoke(arrayList) : null, Boolean.TRUE)) {
            A21 a21 = (A21) arrayList.get(0);
            ArrayList arrayList2 = new ArrayList();
            for (int i5 = 0; i5 < i4; i5++) {
                int i6 = i3 + i5;
                if (i6 >= a21.h().j().length()) {
                    arrayList2.add(null);
                } else {
                    arrayList2.add(m0(c8461tP0B, a21.b(i6)));
                }
            }
            Bundle extras = accessibilityNodeInfo.getExtras();
            Object[] array = arrayList2.toArray(new RectF[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            extras.putParcelableArray(str, (Parcelable[]) array);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c3, code lost:
    
        if (com.daaw.AbstractC0391Ay.a(100, r0) == r1) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007d A[Catch: all -> 0x0039, TryCatch #0 {all -> 0x0039, blocks: (B:13:0x0034, B:25:0x0063, B:29:0x0075, B:31:0x007d, B:33:0x0086, B:35:0x008f, B:36:0x00a0, B:38:0x00a7, B:39:0x00b0, B:20:0x0050), top: B:48:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00c3 -> B:14:0x0037). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object x(com.daaw.InterfaceC1416Ks r11) {
        /*
            Method dump skipped, instruction units count: 214
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C7260p5.x(com.daaw.Ks):java.lang.Object");
    }

    public final boolean y(boolean z, int i2, long j2) {
        return z(I().values(), z, i2, j2);
    }

    public final boolean z(Collection collection, boolean z, int i2, long j2) {
        BP0 bp0I;
        G10.g(collection, "currentSemanticsNodes");
        if (C9982yp0.i(j2, C9982yp0.b.b()) || !C9982yp0.o(j2)) {
            return false;
        }
        if (z) {
            bp0I = C9584xP0.a.y();
        } else {
            if (z) {
                throw new C6902no0();
            }
            bp0I = C9584xP0.a.i();
        }
        Collection<C9026vP0> collection2 = collection;
        if (collection2.isEmpty()) {
            return false;
        }
        for (C9026vP0 c9026vP0 : collection2) {
            if (AbstractC3660cF0.c(c9026vP0.a()).b(j2)) {
                AbstractC6314li0.a(AbstractC7067oP0.a(c9026vP0.b().h(), bp0I));
            }
        }
        return false;
    }
}
