package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Parcelable;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.i;
import com.daaw.AbstractC0653Dj0;
import com.daaw.C0757Ej0;
import com.daaw.DD0;
import com.daaw.InterfaceC0436Bj0;
import com.daaw.WT;
import com.daaw.ZC0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class b extends AbstractC0653Dj0 implements i, View.OnKeyListener, PopupWindow.OnDismissListener {
    public static final int c0 = DD0.e;
    public final Context C;
    public final int D;
    public final int E;
    public final int F;
    public final boolean G;
    public final Handler H;
    public View P;
    public View Q;
    public boolean S;
    public boolean T;
    public int U;
    public int V;
    public boolean X;
    public i.a Y;
    public ViewTreeObserver Z;
    public PopupWindow.OnDismissListener a0;
    public boolean b0;
    public final List I = new ArrayList();
    public final List J = new ArrayList();
    public final ViewTreeObserver.OnGlobalLayoutListener K = new a();
    public final View.OnAttachStateChangeListener L = new ViewOnAttachStateChangeListenerC0004b();
    public final InterfaceC0436Bj0 M = new c();
    public int N = 0;
    public int O = 0;
    public boolean W = false;
    public int R = F();

    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!b.this.a() || b.this.J.size() <= 0 || ((d) b.this.J.get(0)).a.B()) {
                return;
            }
            View view = b.this.Q;
            if (view == null || !view.isShown()) {
                b.this.dismiss();
                return;
            }
            Iterator it = b.this.J.iterator();
            while (it.hasNext()) {
                ((d) it.next()).a.h();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.b$b, reason: collision with other inner class name */
    public class ViewOnAttachStateChangeListenerC0004b implements View.OnAttachStateChangeListener {
        public ViewOnAttachStateChangeListenerC0004b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = b.this.Z;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    b.this.Z = view.getViewTreeObserver();
                }
                b bVar = b.this;
                bVar.Z.removeGlobalOnLayoutListener(bVar.K);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public class c implements InterfaceC0436Bj0 {

        public class a implements Runnable {
            public final /* synthetic */ d B;
            public final /* synthetic */ MenuItem C;
            public final /* synthetic */ e D;

            public a(d dVar, MenuItem menuItem, e eVar) {
                this.B = dVar;
                this.C = menuItem;
                this.D = eVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                d dVar = this.B;
                if (dVar != null) {
                    b.this.b0 = true;
                    dVar.b.e(false);
                    b.this.b0 = false;
                }
                if (this.C.isEnabled() && this.C.hasSubMenu()) {
                    this.D.O(this.C, 4);
                }
            }
        }

        public c() {
        }

        @Override // com.daaw.InterfaceC0436Bj0
        public void c(e eVar, MenuItem menuItem) {
            b.this.H.removeCallbacksAndMessages(null);
            int size = b.this.J.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    i = -1;
                    break;
                } else if (eVar == ((d) b.this.J.get(i)).b) {
                    break;
                } else {
                    i++;
                }
            }
            if (i == -1) {
                return;
            }
            int i2 = i + 1;
            b.this.H.postAtTime(new a(i2 < b.this.J.size() ? (d) b.this.J.get(i2) : null, menuItem, eVar), eVar, SystemClock.uptimeMillis() + 200);
        }

        @Override // com.daaw.InterfaceC0436Bj0
        public void f(e eVar, MenuItem menuItem) {
            b.this.H.removeCallbacksAndMessages(eVar);
        }
    }

    public static class d {
        public final C0757Ej0 a;
        public final e b;
        public final int c;

        public d(C0757Ej0 c0757Ej0, e eVar, int i) {
            this.a = c0757Ej0;
            this.b = eVar;
            this.c = i;
        }

        public ListView a() {
            return this.a.k();
        }
    }

    public b(Context context, View view, int i, int i2, boolean z) {
        this.C = context;
        this.P = view;
        this.E = i;
        this.F = i2;
        this.G = z;
        Resources resources = context.getResources();
        this.D = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(ZC0.b));
        this.H = new Handler();
    }

    public final C0757Ej0 B() {
        C0757Ej0 c0757Ej0 = new C0757Ej0(this.C, null, this.E, this.F);
        c0757Ej0.U(this.M);
        c0757Ej0.L(this);
        c0757Ej0.K(this);
        c0757Ej0.D(this.P);
        c0757Ej0.G(this.O);
        c0757Ej0.J(true);
        c0757Ej0.I(2);
        return c0757Ej0;
    }

    public final int C(e eVar) {
        int size = this.J.size();
        for (int i = 0; i < size; i++) {
            if (eVar == ((d) this.J.get(i)).b) {
                return i;
            }
        }
        return -1;
    }

    public final MenuItem D(e eVar, e eVar2) {
        int size = eVar.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = eVar.getItem(i);
            if (item.hasSubMenu() && eVar2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    public final View E(d dVar, e eVar) {
        androidx.appcompat.view.menu.d dVar2;
        int headersCount;
        int firstVisiblePosition;
        MenuItem menuItemD = D(dVar.b, eVar);
        if (menuItemD == null) {
            return null;
        }
        ListView listViewA = dVar.a();
        ListAdapter adapter = listViewA.getAdapter();
        int i = 0;
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            headersCount = headerViewListAdapter.getHeadersCount();
            dVar2 = (androidx.appcompat.view.menu.d) headerViewListAdapter.getWrappedAdapter();
        } else {
            dVar2 = (androidx.appcompat.view.menu.d) adapter;
            headersCount = 0;
        }
        int count = dVar2.getCount();
        while (true) {
            if (i >= count) {
                i = -1;
                break;
            }
            if (menuItemD == dVar2.getItem(i)) {
                break;
            }
            i++;
        }
        if (i != -1 && (firstVisiblePosition = (i + headersCount) - listViewA.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < listViewA.getChildCount()) {
            return listViewA.getChildAt(firstVisiblePosition);
        }
        return null;
    }

    public final int F() {
        return this.P.getLayoutDirection() == 1 ? 0 : 1;
    }

    public final int G(int i) {
        List list = this.J;
        ListView listViewA = ((d) list.get(list.size() - 1)).a();
        int[] iArr = new int[2];
        listViewA.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.Q.getWindowVisibleDisplayFrame(rect);
        return this.R == 1 ? (iArr[0] + listViewA.getWidth()) + i > rect.right ? 0 : 1 : iArr[0] - i < 0 ? 1 : 0;
    }

    public final void H(e eVar) {
        d dVar;
        View viewE;
        int i;
        int i2;
        int i3;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.C);
        androidx.appcompat.view.menu.d dVar2 = new androidx.appcompat.view.menu.d(eVar, layoutInflaterFrom, this.G, c0);
        if (!a() && this.W) {
            dVar2.d(true);
        } else if (a()) {
            dVar2.d(AbstractC0653Dj0.z(eVar));
        }
        int iQ = AbstractC0653Dj0.q(dVar2, null, this.C, this.D);
        C0757Ej0 c0757Ej0B = B();
        c0757Ej0B.p(dVar2);
        c0757Ej0B.F(iQ);
        c0757Ej0B.G(this.O);
        if (this.J.size() > 0) {
            List list = this.J;
            dVar = (d) list.get(list.size() - 1);
            viewE = E(dVar, eVar);
        } else {
            dVar = null;
            viewE = null;
        }
        if (viewE != null) {
            c0757Ej0B.V(false);
            c0757Ej0B.S(null);
            int iG = G(iQ);
            boolean z = iG == 1;
            this.R = iG;
            if (Build.VERSION.SDK_INT >= 26) {
                c0757Ej0B.D(viewE);
                i2 = 0;
                i = 0;
            } else {
                int[] iArr = new int[2];
                this.P.getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                viewE.getLocationOnScreen(iArr2);
                if ((this.O & 7) == 5) {
                    iArr[0] = iArr[0] + this.P.getWidth();
                    iArr2[0] = iArr2[0] + viewE.getWidth();
                }
                i = iArr2[0] - iArr[0];
                i2 = iArr2[1] - iArr[1];
            }
            if ((this.O & 5) == 5) {
                if (!z) {
                    iQ = viewE.getWidth();
                    i3 = i - iQ;
                }
                i3 = i + iQ;
            } else {
                if (z) {
                    iQ = viewE.getWidth();
                    i3 = i + iQ;
                }
                i3 = i - iQ;
            }
            c0757Ej0B.d(i3);
            c0757Ej0B.N(true);
            c0757Ej0B.l(i2);
        } else {
            if (this.S) {
                c0757Ej0B.d(this.U);
            }
            if (this.T) {
                c0757Ej0B.l(this.V);
            }
            c0757Ej0B.H(p());
        }
        this.J.add(new d(c0757Ej0B, eVar, this.R));
        c0757Ej0B.h();
        ListView listViewK = c0757Ej0B.k();
        listViewK.setOnKeyListener(this);
        if (dVar == null && this.X && eVar.z() != null) {
            FrameLayout frameLayout = (FrameLayout) layoutInflaterFrom.inflate(DD0.l, (ViewGroup) listViewK, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(eVar.z());
            listViewK.addHeaderView(frameLayout, null, false);
            c0757Ej0B.h();
        }
    }

    @Override // com.daaw.InterfaceC4269eS0
    public boolean a() {
        return this.J.size() > 0 && ((d) this.J.get(0)).a.a();
    }

    @Override // androidx.appcompat.view.menu.i
    public void b(e eVar, boolean z) {
        int iC = C(eVar);
        if (iC < 0) {
            return;
        }
        int i = iC + 1;
        if (i < this.J.size()) {
            ((d) this.J.get(i)).b.e(false);
        }
        d dVar = (d) this.J.remove(iC);
        dVar.b.R(this);
        if (this.b0) {
            dVar.a.T(null);
            dVar.a.E(0);
        }
        dVar.a.dismiss();
        int size = this.J.size();
        if (size > 0) {
            this.R = ((d) this.J.get(size - 1)).c;
        } else {
            this.R = F();
        }
        if (size != 0) {
            if (z) {
                ((d) this.J.get(0)).b.e(false);
                return;
            }
            return;
        }
        dismiss();
        i.a aVar = this.Y;
        if (aVar != null) {
            aVar.b(eVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.Z;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.Z.removeGlobalOnLayoutListener(this.K);
            }
            this.Z = null;
        }
        this.Q.removeOnAttachStateChangeListener(this.L);
        this.a0.onDismiss();
    }

    @Override // androidx.appcompat.view.menu.i
    public void c(boolean z) {
        Iterator it = this.J.iterator();
        while (it.hasNext()) {
            AbstractC0653Dj0.A(((d) it.next()).a().getAdapter()).notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.i
    public boolean d() {
        return false;
    }

    @Override // com.daaw.InterfaceC4269eS0
    public void dismiss() {
        int size = this.J.size();
        if (size > 0) {
            d[] dVarArr = (d[]) this.J.toArray(new d[size]);
            for (int i = size - 1; i >= 0; i--) {
                d dVar = dVarArr[i];
                if (dVar.a.a()) {
                    dVar.a.dismiss();
                }
            }
        }
    }

    @Override // androidx.appcompat.view.menu.i
    public void g(i.a aVar) {
        this.Y = aVar;
    }

    @Override // com.daaw.InterfaceC4269eS0
    public void h() {
        if (a()) {
            return;
        }
        Iterator it = this.I.iterator();
        while (it.hasNext()) {
            H((e) it.next());
        }
        this.I.clear();
        View view = this.P;
        this.Q = view;
        if (view != null) {
            boolean z = this.Z == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.Z = viewTreeObserver;
            if (z) {
                viewTreeObserver.addOnGlobalLayoutListener(this.K);
            }
            this.Q.addOnAttachStateChangeListener(this.L);
        }
    }

    @Override // androidx.appcompat.view.menu.i
    public void j(Parcelable parcelable) {
    }

    @Override // com.daaw.InterfaceC4269eS0
    public ListView k() {
        if (this.J.isEmpty()) {
            return null;
        }
        return ((d) this.J.get(r0.size() - 1)).a();
    }

    @Override // androidx.appcompat.view.menu.i
    public boolean l(l lVar) {
        for (d dVar : this.J) {
            if (lVar == dVar.b) {
                dVar.a().requestFocus();
                return true;
            }
        }
        if (!lVar.hasVisibleItems()) {
            return false;
        }
        n(lVar);
        i.a aVar = this.Y;
        if (aVar != null) {
            aVar.c(lVar);
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.i
    public Parcelable m() {
        return null;
    }

    @Override // com.daaw.AbstractC0653Dj0
    public void n(e eVar) {
        eVar.c(this, this.C);
        if (a()) {
            H(eVar);
        } else {
            this.I.add(eVar);
        }
    }

    @Override // com.daaw.AbstractC0653Dj0
    public boolean o() {
        return false;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        d dVar;
        int size = this.J.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                dVar = null;
                break;
            }
            dVar = (d) this.J.get(i);
            if (!dVar.a.a()) {
                break;
            } else {
                i++;
            }
        }
        if (dVar != null) {
            dVar.b.e(false);
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
        if (this.P != view) {
            this.P = view;
            this.O = WT.b(this.N, view.getLayoutDirection());
        }
    }

    @Override // com.daaw.AbstractC0653Dj0
    public void t(boolean z) {
        this.W = z;
    }

    @Override // com.daaw.AbstractC0653Dj0
    public void u(int i) {
        if (this.N != i) {
            this.N = i;
            this.O = WT.b(i, this.P.getLayoutDirection());
        }
    }

    @Override // com.daaw.AbstractC0653Dj0
    public void v(int i) {
        this.S = true;
        this.U = i;
    }

    @Override // com.daaw.AbstractC0653Dj0
    public void w(PopupWindow.OnDismissListener onDismissListener) {
        this.a0 = onDismissListener;
    }

    @Override // com.daaw.AbstractC0653Dj0
    public void x(boolean z) {
        this.X = z;
    }

    @Override // com.daaw.AbstractC0653Dj0
    public void y(int i) {
        this.T = true;
        this.V = i;
    }
}
