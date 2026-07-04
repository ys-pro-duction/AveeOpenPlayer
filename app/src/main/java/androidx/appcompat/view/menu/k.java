package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.i;
import com.daaw.AbstractC0653Dj0;
import com.daaw.C0757Ej0;
import com.daaw.DD0;
import com.daaw.ZC0;

/* JADX INFO: loaded from: classes.dex */
public final class k extends AbstractC0653Dj0 implements PopupWindow.OnDismissListener, AdapterView.OnItemClickListener, i, View.OnKeyListener {
    public static final int W = DD0.m;
    public final Context C;
    public final e D;
    public final d E;
    public final boolean F;
    public final int G;
    public final int H;
    public final int I;
    public final C0757Ej0 J;
    public PopupWindow.OnDismissListener M;
    public View N;
    public View O;
    public i.a P;
    public ViewTreeObserver Q;
    public boolean R;
    public boolean S;
    public int T;
    public boolean V;
    public final ViewTreeObserver.OnGlobalLayoutListener K = new a();
    public final View.OnAttachStateChangeListener L = new b();
    public int U = 0;

    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!k.this.a() || k.this.J.B()) {
                return;
            }
            View view = k.this.O;
            if (view == null || !view.isShown()) {
                k.this.dismiss();
            } else {
                k.this.J.h();
            }
        }
    }

    public class b implements View.OnAttachStateChangeListener {
        public b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = k.this.Q;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    k.this.Q = view.getViewTreeObserver();
                }
                k kVar = k.this;
                kVar.Q.removeGlobalOnLayoutListener(kVar.K);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public k(Context context, e eVar, View view, int i, int i2, boolean z) {
        this.C = context;
        this.D = eVar;
        this.F = z;
        this.E = new d(eVar, LayoutInflater.from(context), z, W);
        this.H = i;
        this.I = i2;
        Resources resources = context.getResources();
        this.G = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(ZC0.b));
        this.N = view;
        this.J = new C0757Ej0(context, null, i, i2);
        eVar.c(this, context);
    }

    public final boolean B() {
        View view;
        if (a()) {
            return true;
        }
        if (this.R || (view = this.N) == null) {
            return false;
        }
        this.O = view;
        this.J.K(this);
        this.J.L(this);
        this.J.J(true);
        View view2 = this.O;
        boolean z = this.Q == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.Q = viewTreeObserver;
        if (z) {
            viewTreeObserver.addOnGlobalLayoutListener(this.K);
        }
        view2.addOnAttachStateChangeListener(this.L);
        this.J.D(view2);
        this.J.G(this.U);
        if (!this.S) {
            this.T = AbstractC0653Dj0.q(this.E, null, this.C, this.G);
            this.S = true;
        }
        this.J.F(this.T);
        this.J.I(2);
        this.J.H(p());
        this.J.h();
        ListView listViewK = this.J.k();
        listViewK.setOnKeyListener(this);
        if (this.V && this.D.z() != null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.C).inflate(DD0.l, (ViewGroup) listViewK, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            if (textView != null) {
                textView.setText(this.D.z());
            }
            frameLayout.setEnabled(false);
            listViewK.addHeaderView(frameLayout, null, false);
        }
        this.J.p(this.E);
        this.J.h();
        return true;
    }

    @Override // com.daaw.InterfaceC4269eS0
    public boolean a() {
        return !this.R && this.J.a();
    }

    @Override // androidx.appcompat.view.menu.i
    public void b(e eVar, boolean z) {
        if (eVar != this.D) {
            return;
        }
        dismiss();
        i.a aVar = this.P;
        if (aVar != null) {
            aVar.b(eVar, z);
        }
    }

    @Override // androidx.appcompat.view.menu.i
    public void c(boolean z) {
        this.S = false;
        d dVar = this.E;
        if (dVar != null) {
            dVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.i
    public boolean d() {
        return false;
    }

    @Override // com.daaw.InterfaceC4269eS0
    public void dismiss() {
        if (a()) {
            this.J.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.i
    public void g(i.a aVar) {
        this.P = aVar;
    }

    @Override // com.daaw.InterfaceC4269eS0
    public void h() {
        if (!B()) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    @Override // androidx.appcompat.view.menu.i
    public void j(Parcelable parcelable) {
    }

    @Override // com.daaw.InterfaceC4269eS0
    public ListView k() {
        return this.J.k();
    }

    @Override // androidx.appcompat.view.menu.i
    public boolean l(l lVar) {
        if (lVar.hasVisibleItems()) {
            h hVar = new h(this.C, lVar, this.O, this.F, this.H, this.I);
            hVar.j(this.P);
            hVar.g(AbstractC0653Dj0.z(lVar));
            hVar.i(this.M);
            this.M = null;
            this.D.e(false);
            int iB = this.J.b();
            int iO = this.J.o();
            if ((Gravity.getAbsoluteGravity(this.U, this.N.getLayoutDirection()) & 7) == 5) {
                iB += this.N.getWidth();
            }
            if (hVar.n(iB, iO)) {
                i.a aVar = this.P;
                if (aVar == null) {
                    return true;
                }
                aVar.c(lVar);
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.i
    public Parcelable m() {
        return null;
    }

    @Override // com.daaw.AbstractC0653Dj0
    public void n(e eVar) {
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.R = true;
        this.D.close();
        ViewTreeObserver viewTreeObserver = this.Q;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.Q = this.O.getViewTreeObserver();
            }
            this.Q.removeGlobalOnLayoutListener(this.K);
            this.Q = null;
        }
        this.O.removeOnAttachStateChangeListener(this.L);
        PopupWindow.OnDismissListener onDismissListener = this.M;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // com.daaw.AbstractC0653Dj0
    public void r(View view) {
        this.N = view;
    }

    @Override // com.daaw.AbstractC0653Dj0
    public void t(boolean z) {
        this.E.d(z);
    }

    @Override // com.daaw.AbstractC0653Dj0
    public void u(int i) {
        this.U = i;
    }

    @Override // com.daaw.AbstractC0653Dj0
    public void v(int i) {
        this.J.d(i);
    }

    @Override // com.daaw.AbstractC0653Dj0
    public void w(PopupWindow.OnDismissListener onDismissListener) {
        this.M = onDismissListener;
    }

    @Override // com.daaw.AbstractC0653Dj0
    public void x(boolean z) {
        this.V = z;
    }

    @Override // com.daaw.AbstractC0653Dj0
    public void y(int i) {
        this.J.l(i);
    }
}
