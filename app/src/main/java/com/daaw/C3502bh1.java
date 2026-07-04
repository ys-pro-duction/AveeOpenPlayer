package com.daaw;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import com.daaw.AbstractC8081s2;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.daaw.bh1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C3502bh1 extends AbstractC6687n2 implements ActionBarOverlayLayout.d {
    public static final Interpolator D = new AccelerateInterpolator();
    public static final Interpolator E = new DecelerateInterpolator();
    public Context a;
    public Context b;
    public Activity c;
    public ActionBarOverlayLayout d;
    public ActionBarContainer e;
    public InterfaceC1432Kw f;
    public ActionBarContextView g;
    public View h;
    public boolean k;
    public d l;
    public AbstractC8081s2 m;
    public AbstractC8081s2.a n;
    public boolean o;
    public boolean q;
    public boolean t;
    public boolean u;
    public boolean v;
    public C1258Je1 x;
    public boolean y;
    public boolean z;
    public ArrayList i = new ArrayList();
    public int j = -1;
    public ArrayList p = new ArrayList();
    public int r = 0;
    public boolean s = true;
    public boolean w = true;
    public final InterfaceC1362Ke1 A = new a();
    public final InterfaceC1362Ke1 B = new b();
    public final InterfaceC1569Me1 C = new c();

    /* JADX INFO: renamed from: com.daaw.bh1$a */
    public class a extends AbstractC1466Le1 {
        public a() {
        }

        @Override // com.daaw.InterfaceC1362Ke1
        public void b(View view) {
            View view2;
            C3502bh1 c3502bh1 = C3502bh1.this;
            if (c3502bh1.s && (view2 = c3502bh1.h) != null) {
                view2.setTranslationY(0.0f);
                C3502bh1.this.e.setTranslationY(0.0f);
            }
            C3502bh1.this.e.setVisibility(8);
            C3502bh1.this.e.setTransitioning(false);
            C3502bh1 c3502bh12 = C3502bh1.this;
            c3502bh12.x = null;
            c3502bh12.C();
            ActionBarOverlayLayout actionBarOverlayLayout = C3502bh1.this.d;
            if (actionBarOverlayLayout != null) {
                AbstractC2317Td1.m0(actionBarOverlayLayout);
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.bh1$b */
    public class b extends AbstractC1466Le1 {
        public b() {
        }

        @Override // com.daaw.InterfaceC1362Ke1
        public void b(View view) {
            C3502bh1 c3502bh1 = C3502bh1.this;
            c3502bh1.x = null;
            c3502bh1.e.requestLayout();
        }
    }

    /* JADX INFO: renamed from: com.daaw.bh1$c */
    public class c implements InterfaceC1569Me1 {
        public c() {
        }

        @Override // com.daaw.InterfaceC1569Me1
        public void a(View view) {
            ((View) C3502bh1.this.e.getParent()).invalidate();
        }
    }

    /* JADX INFO: renamed from: com.daaw.bh1$d */
    public class d extends AbstractC8081s2 implements e.a {
        public final Context D;
        public final androidx.appcompat.view.menu.e E;
        public AbstractC8081s2.a F;
        public WeakReference G;

        public d(Context context, AbstractC8081s2.a aVar) {
            this.D = context;
            this.F = aVar;
            androidx.appcompat.view.menu.e eVarX = new androidx.appcompat.view.menu.e(context).X(1);
            this.E = eVarX;
            eVarX.W(this);
        }

        @Override // androidx.appcompat.view.menu.e.a
        public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
            AbstractC8081s2.a aVar = this.F;
            if (aVar != null) {
                return aVar.d(this, menuItem);
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.e.a
        public void b(androidx.appcompat.view.menu.e eVar) {
            if (this.F == null) {
                return;
            }
            k();
            C3502bh1.this.g.l();
        }

        @Override // com.daaw.AbstractC8081s2
        public void c() {
            C3502bh1 c3502bh1 = C3502bh1.this;
            if (c3502bh1.l != this) {
                return;
            }
            if (C3502bh1.B(c3502bh1.t, c3502bh1.u, false)) {
                this.F.c(this);
            } else {
                C3502bh1 c3502bh12 = C3502bh1.this;
                c3502bh12.m = this;
                c3502bh12.n = this.F;
            }
            this.F = null;
            C3502bh1.this.A(false);
            C3502bh1.this.g.g();
            C3502bh1 c3502bh13 = C3502bh1.this;
            c3502bh13.d.setHideOnContentScrollEnabled(c3502bh13.z);
            C3502bh1.this.l = null;
        }

        @Override // com.daaw.AbstractC8081s2
        public View d() {
            WeakReference weakReference = this.G;
            if (weakReference != null) {
                return (View) weakReference.get();
            }
            return null;
        }

        @Override // com.daaw.AbstractC8081s2
        public Menu e() {
            return this.E;
        }

        @Override // com.daaw.AbstractC8081s2
        public MenuInflater f() {
            return new GZ0(this.D);
        }

        @Override // com.daaw.AbstractC8081s2
        public CharSequence g() {
            return C3502bh1.this.g.getSubtitle();
        }

        @Override // com.daaw.AbstractC8081s2
        public CharSequence i() {
            return C3502bh1.this.g.getTitle();
        }

        @Override // com.daaw.AbstractC8081s2
        public void k() {
            if (C3502bh1.this.l != this) {
                return;
            }
            this.E.i0();
            try {
                this.F.a(this, this.E);
            } finally {
                this.E.h0();
            }
        }

        @Override // com.daaw.AbstractC8081s2
        public boolean l() {
            return C3502bh1.this.g.j();
        }

        @Override // com.daaw.AbstractC8081s2
        public void m(View view) {
            C3502bh1.this.g.setCustomView(view);
            this.G = new WeakReference(view);
        }

        @Override // com.daaw.AbstractC8081s2
        public void n(int i) {
            o(C3502bh1.this.a.getResources().getString(i));
        }

        @Override // com.daaw.AbstractC8081s2
        public void o(CharSequence charSequence) {
            C3502bh1.this.g.setSubtitle(charSequence);
        }

        @Override // com.daaw.AbstractC8081s2
        public void q(int i) {
            r(C3502bh1.this.a.getResources().getString(i));
        }

        @Override // com.daaw.AbstractC8081s2
        public void r(CharSequence charSequence) {
            C3502bh1.this.g.setTitle(charSequence);
        }

        @Override // com.daaw.AbstractC8081s2
        public void s(boolean z) {
            super.s(z);
            C3502bh1.this.g.setTitleOptional(z);
        }

        public boolean t() {
            this.E.i0();
            try {
                return this.F.b(this, this.E);
            } finally {
                this.E.h0();
            }
        }
    }

    public C3502bh1(Activity activity, boolean z) {
        this.c = activity;
        View decorView = activity.getWindow().getDecorView();
        K(decorView);
        if (z) {
            return;
        }
        this.h = decorView.findViewById(R.id.content);
    }

    public static boolean B(boolean z, boolean z2, boolean z3) {
        if (z3) {
            return true;
        }
        return (z || z2) ? false : true;
    }

    public void A(boolean z) {
        C1154Ie1 c1154Ie1P;
        C1154Ie1 c1154Ie1F;
        if (z) {
            R();
        } else {
            J();
        }
        if (!Q()) {
            if (z) {
                this.f.r(4);
                this.g.setVisibility(0);
                return;
            } else {
                this.f.r(0);
                this.g.setVisibility(8);
                return;
            }
        }
        if (z) {
            c1154Ie1F = this.f.p(4, 100L);
            c1154Ie1P = this.g.f(0, 200L);
        } else {
            c1154Ie1P = this.f.p(0, 200L);
            c1154Ie1F = this.g.f(8, 100L);
        }
        C1258Je1 c1258Je1 = new C1258Je1();
        c1258Je1.d(c1154Ie1F, c1154Ie1P);
        c1258Je1.h();
    }

    public void C() {
        AbstractC8081s2.a aVar = this.n;
        if (aVar != null) {
            aVar.c(this.m);
            this.m = null;
            this.n = null;
        }
    }

    public void D(boolean z) {
        View view;
        C1258Je1 c1258Je1 = this.x;
        if (c1258Je1 != null) {
            c1258Je1.a();
        }
        if (this.r != 0 || (!this.y && !z)) {
            this.A.b(null);
            return;
        }
        this.e.setAlpha(1.0f);
        this.e.setTransitioning(true);
        C1258Je1 c1258Je12 = new C1258Je1();
        float f = -this.e.getHeight();
        if (z) {
            this.e.getLocationInWindow(new int[]{0, 0});
            f -= r5[1];
        }
        C1154Ie1 c1154Ie1L = AbstractC2317Td1.e(this.e).l(f);
        c1154Ie1L.j(this.C);
        c1258Je12.c(c1154Ie1L);
        if (this.s && (view = this.h) != null) {
            c1258Je12.c(AbstractC2317Td1.e(view).l(f));
        }
        c1258Je12.f(D);
        c1258Je12.e(250L);
        c1258Je12.g(this.A);
        this.x = c1258Je12;
        c1258Je12.h();
    }

    public void E(boolean z) {
        View view;
        View view2;
        C1258Je1 c1258Je1 = this.x;
        if (c1258Je1 != null) {
            c1258Je1.a();
        }
        this.e.setVisibility(0);
        if (this.r == 0 && (this.y || z)) {
            this.e.setTranslationY(0.0f);
            float f = -this.e.getHeight();
            if (z) {
                this.e.getLocationInWindow(new int[]{0, 0});
                f -= r5[1];
            }
            this.e.setTranslationY(f);
            C1258Je1 c1258Je12 = new C1258Je1();
            C1154Ie1 c1154Ie1L = AbstractC2317Td1.e(this.e).l(0.0f);
            c1154Ie1L.j(this.C);
            c1258Je12.c(c1154Ie1L);
            if (this.s && (view2 = this.h) != null) {
                view2.setTranslationY(f);
                c1258Je12.c(AbstractC2317Td1.e(this.h).l(0.0f));
            }
            c1258Je12.f(E);
            c1258Je12.e(250L);
            c1258Je12.g(this.B);
            this.x = c1258Je12;
            c1258Je12.h();
        } else {
            this.e.setAlpha(1.0f);
            this.e.setTranslationY(0.0f);
            if (this.s && (view = this.h) != null) {
                view.setTranslationY(0.0f);
            }
            this.B.b(null);
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.d;
        if (actionBarOverlayLayout != null) {
            AbstractC2317Td1.m0(actionBarOverlayLayout);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final InterfaceC1432Kw F(View view) {
        if (view instanceof InterfaceC1432Kw) {
            return (InterfaceC1432Kw) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Can't make a decor toolbar out of ");
        sb.append(view != 0 ? view.getClass().getSimpleName() : "null");
        throw new IllegalStateException(sb.toString());
    }

    public int G() {
        return this.e.getHeight();
    }

    public int H() {
        return this.d.getActionBarHideOffset();
    }

    public int I() {
        return this.f.o();
    }

    public final void J() {
        if (this.v) {
            this.v = false;
            ActionBarOverlayLayout actionBarOverlayLayout = this.d;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(false);
            }
            S(false);
        }
    }

    public final void K(View view) {
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(AbstractC6461mD0.p);
        this.d = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        this.f = F(view.findViewById(AbstractC6461mD0.a));
        this.g = (ActionBarContextView) view.findViewById(AbstractC6461mD0.f);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(AbstractC6461mD0.c);
        this.e = actionBarContainer;
        InterfaceC1432Kw interfaceC1432Kw = this.f;
        if (interfaceC1432Kw == null || this.g == null || actionBarContainer == null) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.a = interfaceC1432Kw.getContext();
        boolean z = (this.f.u() & 4) != 0;
        if (z) {
            this.k = true;
        }
        C7245p2 c7245p2B = C7245p2.b(this.a);
        P(c7245p2B.a() || z);
        N(c7245p2B.e());
        TypedArray typedArrayObtainStyledAttributes = this.a.obtainStyledAttributes(null, AbstractC5060hE0.a, KC0.c, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(AbstractC5060hE0.k, false)) {
            O(true);
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(AbstractC5060hE0.i, 0);
        if (dimensionPixelSize != 0) {
            M(dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public void L(int i, int i2) {
        int iU = this.f.u();
        if ((i2 & 4) != 0) {
            this.k = true;
        }
        this.f.k((i & i2) | ((~i2) & iU));
    }

    public void M(float f) {
        AbstractC2317Td1.x0(this.e, f);
    }

    public final void N(boolean z) {
        this.q = z;
        if (z) {
            this.e.setTabContainer(null);
            this.f.i(null);
        } else {
            this.f.i(null);
            this.e.setTabContainer(null);
        }
        boolean z2 = false;
        boolean z3 = I() == 2;
        this.f.x(!this.q && z3);
        ActionBarOverlayLayout actionBarOverlayLayout = this.d;
        if (!this.q && z3) {
            z2 = true;
        }
        actionBarOverlayLayout.setHasNonEmbeddedTabs(z2);
    }

    public void O(boolean z) {
        if (z && !this.d.x()) {
            throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
        }
        this.z = z;
        this.d.setHideOnContentScrollEnabled(z);
    }

    public void P(boolean z) {
        this.f.t(z);
    }

    public final boolean Q() {
        return this.e.isLaidOut();
    }

    public final void R() {
        if (this.v) {
            return;
        }
        this.v = true;
        ActionBarOverlayLayout actionBarOverlayLayout = this.d;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setShowingForActionMode(true);
        }
        S(false);
    }

    public final void S(boolean z) {
        if (B(this.t, this.u, this.v)) {
            if (this.w) {
                return;
            }
            this.w = true;
            E(z);
            return;
        }
        if (this.w) {
            this.w = false;
            D(z);
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void a() {
        if (this.u) {
            this.u = false;
            S(true);
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void c(boolean z) {
        this.s = z;
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void d() {
        if (this.u) {
            return;
        }
        this.u = true;
        S(true);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void e() {
        C1258Je1 c1258Je1 = this.x;
        if (c1258Je1 != null) {
            c1258Je1.a();
            this.x = null;
        }
    }

    @Override // com.daaw.AbstractC6687n2
    public boolean g() {
        InterfaceC1432Kw interfaceC1432Kw = this.f;
        if (interfaceC1432Kw == null || !interfaceC1432Kw.j()) {
            return false;
        }
        this.f.collapseActionView();
        return true;
    }

    @Override // com.daaw.AbstractC6687n2
    public void h(boolean z) {
        if (z == this.o) {
            return;
        }
        this.o = z;
        if (this.p.size() <= 0) {
            return;
        }
        AbstractC6314li0.a(this.p.get(0));
        throw null;
    }

    @Override // com.daaw.AbstractC6687n2
    public int i() {
        return this.f.u();
    }

    @Override // com.daaw.AbstractC6687n2
    public Context j() {
        if (this.b == null) {
            TypedValue typedValue = new TypedValue();
            this.a.getTheme().resolveAttribute(KC0.e, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.b = new ContextThemeWrapper(this.a, i);
            } else {
                this.b = this.a;
            }
        }
        return this.b;
    }

    @Override // com.daaw.AbstractC6687n2
    public boolean l() {
        int iG = G();
        if (this.w) {
            return iG == 0 || H() < iG;
        }
        return false;
    }

    @Override // com.daaw.AbstractC6687n2
    public void m(Configuration configuration) {
        N(C7245p2.b(this.a).e());
    }

    @Override // com.daaw.AbstractC6687n2
    public boolean o(int i, KeyEvent keyEvent) {
        Menu menuE;
        d dVar = this.l;
        if (dVar == null || (menuE = dVar.e()) == null) {
            return false;
        }
        menuE.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return menuE.performShortcut(i, keyEvent, 0);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void onWindowVisibilityChanged(int i) {
        this.r = i;
    }

    @Override // com.daaw.AbstractC6687n2
    public void r(boolean z) {
        if (this.k) {
            return;
        }
        s(z);
    }

    @Override // com.daaw.AbstractC6687n2
    public void s(boolean z) {
        L(z ? 4 : 0, 4);
    }

    @Override // com.daaw.AbstractC6687n2
    public void t(boolean z) {
        L(z ? 2 : 0, 2);
    }

    @Override // com.daaw.AbstractC6687n2
    public void u(boolean z) {
        L(z ? 8 : 0, 8);
    }

    @Override // com.daaw.AbstractC6687n2
    public void v(boolean z) {
        C1258Je1 c1258Je1;
        this.y = z;
        if (z || (c1258Je1 = this.x) == null) {
            return;
        }
        c1258Je1.a();
    }

    @Override // com.daaw.AbstractC6687n2
    public void w(CharSequence charSequence) {
        this.f.l(charSequence);
    }

    @Override // com.daaw.AbstractC6687n2
    public void x(CharSequence charSequence) {
        this.f.setTitle(charSequence);
    }

    @Override // com.daaw.AbstractC6687n2
    public void y(CharSequence charSequence) {
        this.f.setWindowTitle(charSequence);
    }

    @Override // com.daaw.AbstractC6687n2
    public AbstractC8081s2 z(AbstractC8081s2.a aVar) {
        d dVar = this.l;
        if (dVar != null) {
            dVar.c();
        }
        this.d.setHideOnContentScrollEnabled(false);
        this.g.k();
        d dVar2 = new d(this.g.getContext(), aVar);
        if (!dVar2.t()) {
            return null;
        }
        this.l = dVar2;
        dVar2.k();
        this.g.h(dVar2);
        A(true);
        return dVar2;
    }

    public C3502bh1(Dialog dialog) {
        K(dialog.getWindow().getDecorView());
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void b() {
    }
}
