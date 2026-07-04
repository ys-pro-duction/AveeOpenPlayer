package com.daaw;

import android.content.Context;
import android.content.res.Configuration;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.widget.Toolbar;
import com.daaw.LayoutInflaterFactory2C3356b9;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.daaw.m41, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C6420m41 extends AbstractC6687n2 {
    public final InterfaceC1432Kw a;
    public final Window.Callback b;
    public final LayoutInflaterFactory2C3356b9.f c;
    public boolean d;
    public boolean e;
    public boolean f;
    public ArrayList g = new ArrayList();
    public final Runnable h = new a();
    public final Toolbar.h i;

    /* JADX INFO: renamed from: com.daaw.m41$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C6420m41.this.B();
        }
    }

    /* JADX INFO: renamed from: com.daaw.m41$b */
    public class b implements Toolbar.h {
        public b() {
        }

        @Override // androidx.appcompat.widget.Toolbar.h
        public boolean onMenuItemClick(MenuItem menuItem) {
            return C6420m41.this.b.onMenuItemSelected(0, menuItem);
        }
    }

    /* JADX INFO: renamed from: com.daaw.m41$c */
    public final class c implements i.a {
        public boolean B;

        public c() {
        }

        @Override // androidx.appcompat.view.menu.i.a
        public void b(androidx.appcompat.view.menu.e eVar, boolean z) {
            if (this.B) {
                return;
            }
            this.B = true;
            C6420m41.this.a.h();
            C6420m41.this.b.onPanelClosed(108, eVar);
            this.B = false;
        }

        @Override // androidx.appcompat.view.menu.i.a
        public boolean c(androidx.appcompat.view.menu.e eVar) {
            C6420m41.this.b.onMenuOpened(108, eVar);
            return true;
        }
    }

    /* JADX INFO: renamed from: com.daaw.m41$d */
    public final class d implements e.a {
        public d() {
        }

        @Override // androidx.appcompat.view.menu.e.a
        public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.e.a
        public void b(androidx.appcompat.view.menu.e eVar) {
            if (C6420m41.this.a.b()) {
                C6420m41.this.b.onPanelClosed(108, eVar);
            } else if (C6420m41.this.b.onPreparePanel(0, null, eVar)) {
                C6420m41.this.b.onMenuOpened(108, eVar);
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.m41$e */
    public class e implements LayoutInflaterFactory2C3356b9.f {
        public e() {
        }

        @Override // com.daaw.LayoutInflaterFactory2C3356b9.f
        public boolean a(int i) {
            if (i != 0) {
                return false;
            }
            C6420m41 c6420m41 = C6420m41.this;
            if (c6420m41.d) {
                return false;
            }
            c6420m41.a.c();
            C6420m41.this.d = true;
            return false;
        }

        @Override // com.daaw.LayoutInflaterFactory2C3356b9.f
        public View onCreatePanelView(int i) {
            if (i == 0) {
                return new View(C6420m41.this.a.getContext());
            }
            return null;
        }
    }

    public C6420m41(Toolbar toolbar, CharSequence charSequence, Window.Callback callback) {
        b bVar = new b();
        this.i = bVar;
        AbstractC8621ty0.g(toolbar);
        androidx.appcompat.widget.c cVar = new androidx.appcompat.widget.c(toolbar, false);
        this.a = cVar;
        this.b = (Window.Callback) AbstractC8621ty0.g(callback);
        cVar.setWindowCallback(callback);
        toolbar.setOnMenuItemClickListener(bVar);
        cVar.setWindowTitle(charSequence);
        this.c = new e();
    }

    public final Menu A() {
        if (!this.e) {
            this.a.q(new c(), new d());
            this.e = true;
        }
        return this.a.m();
    }

    public void B() {
        Menu menuA = A();
        androidx.appcompat.view.menu.e eVar = menuA instanceof androidx.appcompat.view.menu.e ? (androidx.appcompat.view.menu.e) menuA : null;
        if (eVar != null) {
            eVar.i0();
        }
        try {
            menuA.clear();
            if (!this.b.onCreatePanelMenu(0, menuA) || !this.b.onPreparePanel(0, null, menuA)) {
                menuA.clear();
            }
            if (eVar != null) {
                eVar.h0();
            }
        } catch (Throwable th) {
            if (eVar != null) {
                eVar.h0();
            }
            throw th;
        }
    }

    public void C(int i, int i2) {
        this.a.k((i & i2) | ((~i2) & this.a.u()));
    }

    @Override // com.daaw.AbstractC6687n2
    public boolean f() {
        return this.a.f();
    }

    @Override // com.daaw.AbstractC6687n2
    public boolean g() {
        if (!this.a.j()) {
            return false;
        }
        this.a.collapseActionView();
        return true;
    }

    @Override // com.daaw.AbstractC6687n2
    public void h(boolean z) {
        if (z == this.f) {
            return;
        }
        this.f = z;
        if (this.g.size() <= 0) {
            return;
        }
        AbstractC6314li0.a(this.g.get(0));
        throw null;
    }

    @Override // com.daaw.AbstractC6687n2
    public int i() {
        return this.a.u();
    }

    @Override // com.daaw.AbstractC6687n2
    public Context j() {
        return this.a.getContext();
    }

    @Override // com.daaw.AbstractC6687n2
    public boolean k() {
        this.a.s().removeCallbacks(this.h);
        AbstractC2317Td1.h0(this.a.s(), this.h);
        return true;
    }

    @Override // com.daaw.AbstractC6687n2
    public boolean l() {
        return this.a.getVisibility() == 0;
    }

    @Override // com.daaw.AbstractC6687n2
    public void m(Configuration configuration) {
        super.m(configuration);
    }

    @Override // com.daaw.AbstractC6687n2
    public void n() {
        this.a.s().removeCallbacks(this.h);
    }

    @Override // com.daaw.AbstractC6687n2
    public boolean o(int i, KeyEvent keyEvent) {
        Menu menuA = A();
        if (menuA == null) {
            return false;
        }
        menuA.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return menuA.performShortcut(i, keyEvent, 0);
    }

    @Override // com.daaw.AbstractC6687n2
    public boolean p(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            q();
        }
        return true;
    }

    @Override // com.daaw.AbstractC6687n2
    public boolean q() {
        return this.a.g();
    }

    @Override // com.daaw.AbstractC6687n2
    public void s(boolean z) {
        C(z ? 4 : 0, 4);
    }

    @Override // com.daaw.AbstractC6687n2
    public void t(boolean z) {
        C(z ? 2 : 0, 2);
    }

    @Override // com.daaw.AbstractC6687n2
    public void u(boolean z) {
        C(z ? 8 : 0, 8);
    }

    @Override // com.daaw.AbstractC6687n2
    public void w(CharSequence charSequence) {
        this.a.l(charSequence);
    }

    @Override // com.daaw.AbstractC6687n2
    public void x(CharSequence charSequence) {
        this.a.setTitle(charSequence);
    }

    @Override // com.daaw.AbstractC6687n2
    public void y(CharSequence charSequence) {
        this.a.setWindowTitle(charSequence);
    }

    @Override // com.daaw.AbstractC6687n2
    public void r(boolean z) {
    }

    @Override // com.daaw.AbstractC6687n2
    public void v(boolean z) {
    }
}
