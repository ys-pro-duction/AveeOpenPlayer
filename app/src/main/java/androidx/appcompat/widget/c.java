package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.i;
import com.daaw.AbstractC1466Le1;
import com.daaw.AbstractC2317Td1;
import com.daaw.AbstractC4209eD0;
import com.daaw.AbstractC5060hE0;
import com.daaw.AbstractC6461mD0;
import com.daaw.C1154Ie1;
import com.daaw.C7802r2;
import com.daaw.G9;
import com.daaw.InterfaceC1432Kw;
import com.daaw.KC0;
import com.daaw.OD0;
import com.daaw.Z31;

/* JADX INFO: loaded from: classes.dex */
public class c implements InterfaceC1432Kw {
    public Toolbar a;
    public int b;
    public View c;
    public View d;
    public Drawable e;
    public Drawable f;
    public Drawable g;
    public boolean h;
    public CharSequence i;
    public CharSequence j;
    public CharSequence k;
    public Window.Callback l;
    public boolean m;
    public ActionMenuPresenter n;
    public int o;
    public int p;
    public Drawable q;

    public class a implements View.OnClickListener {
        public final C7802r2 B;

        public a() {
            this.B = new C7802r2(c.this.a.getContext(), 0, R.id.home, 0, 0, c.this.i);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            c cVar = c.this;
            Window.Callback callback = cVar.l;
            if (callback == null || !cVar.m) {
                return;
            }
            callback.onMenuItemSelected(0, this.B);
        }
    }

    public class b extends AbstractC1466Le1 {
        public boolean a = false;
        public final /* synthetic */ int b;

        public b(int i) {
            this.b = i;
        }

        @Override // com.daaw.AbstractC1466Le1, com.daaw.InterfaceC1362Ke1
        public void a(View view) {
            this.a = true;
        }

        @Override // com.daaw.InterfaceC1362Ke1
        public void b(View view) {
            if (this.a) {
                return;
            }
            c.this.a.setVisibility(this.b);
        }

        @Override // com.daaw.AbstractC1466Le1, com.daaw.InterfaceC1362Ke1
        public void c(View view) {
            c.this.a.setVisibility(0);
        }
    }

    public c(Toolbar toolbar, boolean z) {
        this(toolbar, z, OD0.a, AbstractC4209eD0.n);
    }

    public void A(int i) {
        if (i == this.p) {
            return;
        }
        this.p = i;
        if (TextUtils.isEmpty(this.a.getNavigationContentDescription())) {
            C(this.p);
        }
    }

    public void B(Drawable drawable) {
        this.f = drawable;
        I();
    }

    public void C(int i) {
        D(i == 0 ? null : getContext().getString(i));
    }

    public void D(CharSequence charSequence) {
        this.k = charSequence;
        G();
    }

    public void E(Drawable drawable) {
        this.g = drawable;
        H();
    }

    public final void F(CharSequence charSequence) {
        this.i = charSequence;
        if ((this.b & 8) != 0) {
            this.a.setTitle(charSequence);
            if (this.h) {
                AbstractC2317Td1.s0(this.a.getRootView(), charSequence);
            }
        }
    }

    public final void G() {
        if ((this.b & 4) != 0) {
            if (TextUtils.isEmpty(this.k)) {
                this.a.setNavigationContentDescription(this.p);
            } else {
                this.a.setNavigationContentDescription(this.k);
            }
        }
    }

    public final void H() {
        if ((this.b & 4) == 0) {
            this.a.setNavigationIcon((Drawable) null);
            return;
        }
        Toolbar toolbar = this.a;
        Drawable drawable = this.g;
        if (drawable == null) {
            drawable = this.q;
        }
        toolbar.setNavigationIcon(drawable);
    }

    public final void I() {
        Drawable drawable;
        int i = this.b;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) == 0 || (drawable = this.f) == null) {
            drawable = this.e;
        }
        this.a.setLogo(drawable);
    }

    @Override // com.daaw.InterfaceC1432Kw
    public void a(Menu menu, i.a aVar) {
        if (this.n == null) {
            ActionMenuPresenter actionMenuPresenter = new ActionMenuPresenter(this.a.getContext());
            this.n = actionMenuPresenter;
            actionMenuPresenter.r(AbstractC6461mD0.g);
        }
        this.n.g(aVar);
        this.a.M((e) menu, this.n);
    }

    @Override // com.daaw.InterfaceC1432Kw
    public boolean b() {
        return this.a.D();
    }

    @Override // com.daaw.InterfaceC1432Kw
    public void c() {
        this.m = true;
    }

    @Override // com.daaw.InterfaceC1432Kw
    public void collapseActionView() {
        this.a.f();
    }

    @Override // com.daaw.InterfaceC1432Kw
    public boolean d() {
        return this.a.d();
    }

    @Override // com.daaw.InterfaceC1432Kw
    public boolean e() {
        return this.a.C();
    }

    @Override // com.daaw.InterfaceC1432Kw
    public boolean f() {
        return this.a.y();
    }

    @Override // com.daaw.InterfaceC1432Kw
    public boolean g() {
        return this.a.S();
    }

    @Override // com.daaw.InterfaceC1432Kw
    public Context getContext() {
        return this.a.getContext();
    }

    @Override // com.daaw.InterfaceC1432Kw
    public CharSequence getTitle() {
        return this.a.getTitle();
    }

    @Override // com.daaw.InterfaceC1432Kw
    public int getVisibility() {
        return this.a.getVisibility();
    }

    @Override // com.daaw.InterfaceC1432Kw
    public void h() {
        this.a.g();
    }

    @Override // com.daaw.InterfaceC1432Kw
    public void i(androidx.appcompat.widget.b bVar) {
        View view = this.c;
        if (view != null) {
            ViewParent parent = view.getParent();
            Toolbar toolbar = this.a;
            if (parent == toolbar) {
                toolbar.removeView(this.c);
            }
        }
        this.c = bVar;
    }

    @Override // com.daaw.InterfaceC1432Kw
    public boolean j() {
        return this.a.x();
    }

    @Override // com.daaw.InterfaceC1432Kw
    public void k(int i) {
        View view;
        int i2 = this.b ^ i;
        this.b = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    G();
                }
                H();
            }
            if ((i2 & 3) != 0) {
                I();
            }
            if ((i2 & 8) != 0) {
                if ((i & 8) != 0) {
                    this.a.setTitle(this.i);
                    this.a.setSubtitle(this.j);
                } else {
                    this.a.setTitle((CharSequence) null);
                    this.a.setSubtitle((CharSequence) null);
                }
            }
            if ((i2 & 16) == 0 || (view = this.d) == null) {
                return;
            }
            if ((i & 16) != 0) {
                this.a.addView(view);
            } else {
                this.a.removeView(view);
            }
        }
    }

    @Override // com.daaw.InterfaceC1432Kw
    public void l(CharSequence charSequence) {
        this.j = charSequence;
        if ((this.b & 8) != 0) {
            this.a.setSubtitle(charSequence);
        }
    }

    @Override // com.daaw.InterfaceC1432Kw
    public Menu m() {
        return this.a.getMenu();
    }

    @Override // com.daaw.InterfaceC1432Kw
    public void n(int i) {
        B(i != 0 ? G9.b(getContext(), i) : null);
    }

    @Override // com.daaw.InterfaceC1432Kw
    public int o() {
        return this.o;
    }

    @Override // com.daaw.InterfaceC1432Kw
    public C1154Ie1 p(int i, long j) {
        return AbstractC2317Td1.e(this.a).b(i == 0 ? 1.0f : 0.0f).e(j).g(new b(i));
    }

    @Override // com.daaw.InterfaceC1432Kw
    public void q(i.a aVar, e.a aVar2) {
        this.a.N(aVar, aVar2);
    }

    @Override // com.daaw.InterfaceC1432Kw
    public void r(int i) {
        this.a.setVisibility(i);
    }

    @Override // com.daaw.InterfaceC1432Kw
    public ViewGroup s() {
        return this.a;
    }

    @Override // com.daaw.InterfaceC1432Kw
    public void setIcon(int i) {
        setIcon(i != 0 ? G9.b(getContext(), i) : null);
    }

    @Override // com.daaw.InterfaceC1432Kw
    public void setTitle(CharSequence charSequence) {
        this.h = true;
        F(charSequence);
    }

    @Override // com.daaw.InterfaceC1432Kw
    public void setWindowCallback(Window.Callback callback) {
        this.l = callback;
    }

    @Override // com.daaw.InterfaceC1432Kw
    public void setWindowTitle(CharSequence charSequence) {
        if (this.h) {
            return;
        }
        F(charSequence);
    }

    @Override // com.daaw.InterfaceC1432Kw
    public void t(boolean z) {
    }

    @Override // com.daaw.InterfaceC1432Kw
    public int u() {
        return this.b;
    }

    @Override // com.daaw.InterfaceC1432Kw
    public void v() {
    }

    @Override // com.daaw.InterfaceC1432Kw
    public void w() {
    }

    @Override // com.daaw.InterfaceC1432Kw
    public void x(boolean z) {
        this.a.setCollapsible(z);
    }

    public final int y() {
        if (this.a.getNavigationIcon() == null) {
            return 11;
        }
        this.q = this.a.getNavigationIcon();
        return 15;
    }

    public void z(View view) {
        View view2 = this.d;
        if (view2 != null && (this.b & 16) != 0) {
            this.a.removeView(view2);
        }
        this.d = view;
        if (view == null || (this.b & 16) == 0) {
            return;
        }
        this.a.addView(view);
    }

    public c(Toolbar toolbar, boolean z, int i, int i2) {
        Drawable drawable;
        this.o = 0;
        this.p = 0;
        this.a = toolbar;
        this.i = toolbar.getTitle();
        this.j = toolbar.getSubtitle();
        this.h = this.i != null;
        this.g = toolbar.getNavigationIcon();
        Z31 z31V = Z31.v(toolbar.getContext(), null, AbstractC5060hE0.a, KC0.c, 0);
        this.q = z31V.g(AbstractC5060hE0.l);
        if (z) {
            CharSequence charSequenceP = z31V.p(AbstractC5060hE0.r);
            if (!TextUtils.isEmpty(charSequenceP)) {
                setTitle(charSequenceP);
            }
            CharSequence charSequenceP2 = z31V.p(AbstractC5060hE0.p);
            if (!TextUtils.isEmpty(charSequenceP2)) {
                l(charSequenceP2);
            }
            Drawable drawableG = z31V.g(AbstractC5060hE0.n);
            if (drawableG != null) {
                B(drawableG);
            }
            Drawable drawableG2 = z31V.g(AbstractC5060hE0.m);
            if (drawableG2 != null) {
                setIcon(drawableG2);
            }
            if (this.g == null && (drawable = this.q) != null) {
                E(drawable);
            }
            k(z31V.k(AbstractC5060hE0.h, 0));
            int iN = z31V.n(AbstractC5060hE0.g, 0);
            if (iN != 0) {
                z(LayoutInflater.from(this.a.getContext()).inflate(iN, (ViewGroup) this.a, false));
                k(this.b | 16);
            }
            int iM = z31V.m(AbstractC5060hE0.j, 0);
            if (iM > 0) {
                ViewGroup.LayoutParams layoutParams = this.a.getLayoutParams();
                layoutParams.height = iM;
                this.a.setLayoutParams(layoutParams);
            }
            int iE = z31V.e(AbstractC5060hE0.f, -1);
            int iE2 = z31V.e(AbstractC5060hE0.e, -1);
            if (iE >= 0 || iE2 >= 0) {
                this.a.L(Math.max(iE, 0), Math.max(iE2, 0));
            }
            int iN2 = z31V.n(AbstractC5060hE0.s, 0);
            if (iN2 != 0) {
                Toolbar toolbar2 = this.a;
                toolbar2.P(toolbar2.getContext(), iN2);
            }
            int iN3 = z31V.n(AbstractC5060hE0.q, 0);
            if (iN3 != 0) {
                Toolbar toolbar3 = this.a;
                toolbar3.O(toolbar3.getContext(), iN3);
            }
            int iN4 = z31V.n(AbstractC5060hE0.o, 0);
            if (iN4 != 0) {
                this.a.setPopupTheme(iN4);
            }
        } else {
            this.b = y();
        }
        z31V.x();
        A(i);
        this.k = this.a.getNavigationContentDescription();
        this.a.setNavigationOnClickListener(new a());
    }

    @Override // com.daaw.InterfaceC1432Kw
    public void setIcon(Drawable drawable) {
        this.e = drawable;
        I();
    }
}
