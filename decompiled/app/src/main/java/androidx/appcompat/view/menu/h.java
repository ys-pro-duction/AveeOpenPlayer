package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.i;
import com.daaw.AbstractC0653Dj0;
import com.daaw.WT;
import com.daaw.ZC0;

/* JADX INFO: loaded from: classes.dex */
public class h {
    public final Context a;
    public final e b;
    public final boolean c;
    public final int d;
    public final int e;
    public View f;
    public int g;
    public boolean h;
    public i.a i;
    public AbstractC0653Dj0 j;
    public PopupWindow.OnDismissListener k;
    public final PopupWindow.OnDismissListener l;

    public class a implements PopupWindow.OnDismissListener {
        public a() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            h.this.e();
        }
    }

    public h(Context context, e eVar, View view, boolean z, int i) {
        this(context, eVar, view, z, i, 0);
    }

    public final AbstractC0653Dj0 a() {
        Display defaultDisplay = ((WindowManager) this.a.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        AbstractC0653Dj0 bVar = Math.min(point.x, point.y) >= this.a.getResources().getDimensionPixelSize(ZC0.a) ? new b(this.a, this.f, this.d, this.e, this.c) : new k(this.a, this.b, this.f, this.d, this.e, this.c);
        bVar.n(this.b);
        bVar.w(this.l);
        bVar.r(this.f);
        bVar.g(this.i);
        bVar.t(this.h);
        bVar.u(this.g);
        return bVar;
    }

    public void b() {
        if (d()) {
            this.j.dismiss();
        }
    }

    public AbstractC0653Dj0 c() {
        if (this.j == null) {
            this.j = a();
        }
        return this.j;
    }

    public boolean d() {
        AbstractC0653Dj0 abstractC0653Dj0 = this.j;
        return abstractC0653Dj0 != null && abstractC0653Dj0.a();
    }

    public void e() {
        this.j = null;
        PopupWindow.OnDismissListener onDismissListener = this.k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public void f(View view) {
        this.f = view;
    }

    public void g(boolean z) {
        this.h = z;
        AbstractC0653Dj0 abstractC0653Dj0 = this.j;
        if (abstractC0653Dj0 != null) {
            abstractC0653Dj0.t(z);
        }
    }

    public void h(int i) {
        this.g = i;
    }

    public void i(PopupWindow.OnDismissListener onDismissListener) {
        this.k = onDismissListener;
    }

    public void j(i.a aVar) {
        this.i = aVar;
        AbstractC0653Dj0 abstractC0653Dj0 = this.j;
        if (abstractC0653Dj0 != null) {
            abstractC0653Dj0.g(aVar);
        }
    }

    public void k() {
        if (!m()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    public final void l(int i, int i2, boolean z, boolean z2) {
        AbstractC0653Dj0 abstractC0653Dj0C = c();
        abstractC0653Dj0C.x(z2);
        if (z) {
            if ((WT.b(this.g, this.f.getLayoutDirection()) & 7) == 5) {
                i -= this.f.getWidth();
            }
            abstractC0653Dj0C.v(i);
            abstractC0653Dj0C.y(i2);
            int i3 = (int) ((this.a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            abstractC0653Dj0C.s(new Rect(i - i3, i2 - i3, i + i3, i2 + i3));
        }
        abstractC0653Dj0C.h();
    }

    public boolean m() {
        if (d()) {
            return true;
        }
        if (this.f == null) {
            return false;
        }
        l(0, 0, false, false);
        return true;
    }

    public boolean n(int i, int i2) {
        if (d()) {
            return true;
        }
        if (this.f == null) {
            return false;
        }
        l(i, i2, true, true);
        return true;
    }

    public h(Context context, e eVar, View view, boolean z, int i, int i2) {
        this.g = 8388611;
        this.l = new a();
        this.a = context;
        this.b = eVar;
        this.f = view;
        this.c = z;
        this.d = i;
        this.e = i2;
    }
}
