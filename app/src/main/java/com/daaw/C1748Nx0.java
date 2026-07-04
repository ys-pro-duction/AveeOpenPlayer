package com.daaw;

import android.content.Context;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.e;

/* JADX INFO: renamed from: com.daaw.Nx0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1748Nx0 {
    public final Context a;
    public final androidx.appcompat.view.menu.e b;
    public final View c;
    public final androidx.appcompat.view.menu.h d;
    public c e;

    /* JADX INFO: renamed from: com.daaw.Nx0$b */
    public class b implements PopupWindow.OnDismissListener {
        public b() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            C1748Nx0.this.getClass();
        }
    }

    /* JADX INFO: renamed from: com.daaw.Nx0$c */
    public interface c {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public C1748Nx0(Context context, View view) {
        this(context, view, 0);
    }

    public Menu a() {
        return this.b;
    }

    public void b(c cVar) {
        this.e = cVar;
    }

    public void c() {
        this.d.k();
    }

    public C1748Nx0(Context context, View view, int i) {
        this(context, view, i, KC0.E, 0);
    }

    public C1748Nx0(Context context, View view, int i, int i2, int i3) {
        this.a = context;
        this.c = view;
        androidx.appcompat.view.menu.e eVar = new androidx.appcompat.view.menu.e(context);
        this.b = eVar;
        eVar.W(new a());
        androidx.appcompat.view.menu.h hVar = new androidx.appcompat.view.menu.h(context, eVar, view, false, i2, i3);
        this.d = hVar;
        hVar.h(i);
        hVar.i(new b());
    }

    /* JADX INFO: renamed from: com.daaw.Nx0$a */
    public class a implements e.a {
        public a() {
        }

        @Override // androidx.appcompat.view.menu.e.a
        public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
            c cVar = C1748Nx0.this.e;
            if (cVar != null) {
                return cVar.onMenuItemClick(menuItem);
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.e.a
        public void b(androidx.appcompat.view.menu.e eVar) {
        }
    }
}
