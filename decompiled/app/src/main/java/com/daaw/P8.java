package com.daaw;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
import com.daaw.AbstractC8081s2;
import com.daaw.C9759y11;
import com.daaw.YM0;

/* JADX INFO: loaded from: classes.dex */
public abstract class P8 extends MP implements T8, C9759y11.a {
    public Z8 c0;
    public Resources d0;

    public class a implements YM0.c {
        public a() {
        }

        @Override // com.daaw.YM0.c
        public Bundle a() {
            Bundle bundle = new Bundle();
            P8.this.l0().F(bundle);
            return bundle;
        }
    }

    public class b implements InterfaceC6075kq0 {
        public b() {
        }

        @Override // com.daaw.InterfaceC6075kq0
        public void a(Context context) {
            Z8 z8L0 = P8.this.l0();
            z8L0.x();
            z8L0.B(P8.this.p().b("androidx:appcompat"));
        }
    }

    public P8() {
        n0();
    }

    @Override // com.daaw.AbstractActivityC5776jo, android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        o0();
        l0().f(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(l0().k(context));
    }

    @Override // android.app.Activity
    public void closeOptionsMenu() {
        AbstractC6687n2 abstractC6687n2M0 = m0();
        if (getWindow().hasFeature(0)) {
            if (abstractC6687n2M0 == null || !abstractC6687n2M0.f()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Override // com.daaw.AbstractActivityC7459po, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        AbstractC6687n2 abstractC6687n2M0 = m0();
        if (keyCode == 82 && abstractC6687n2M0 != null && abstractC6687n2M0.p(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public View findViewById(int i) {
        return l0().n(i);
    }

    @Override // android.app.Activity
    public MenuInflater getMenuInflater() {
        return l0().t();
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        if (this.d0 == null && C2833Yc1.c()) {
            this.d0 = new C2833Yc1(this, super.getResources());
        }
        Resources resources = this.d0;
        return resources == null ? super.getResources() : resources;
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        l0().y();
    }

    public Z8 l0() {
        if (this.c0 == null) {
            this.c0 = Z8.l(this, this);
        }
        return this.c0;
    }

    @Override // com.daaw.C9759y11.a
    public Intent m() {
        return AbstractC6339ln0.a(this);
    }

    public AbstractC6687n2 m0() {
        return l0().w();
    }

    public final void n0() {
        p().h("androidx:appcompat", new a());
        P(new b());
    }

    public final void o0() {
        AbstractC2217Se1.b(getWindow().getDecorView(), this);
        AbstractC2529Ve1.b(getWindow().getDecorView(), this);
        AbstractC2425Ue1.b(getWindow().getDecorView(), this);
        AbstractC2321Te1.a(getWindow().getDecorView(), this);
    }

    @Override // com.daaw.AbstractActivityC5776jo, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        l0().A(configuration);
        if (this.d0 != null) {
            this.d0.updateConfiguration(super.getResources().getConfiguration(), super.getResources().getDisplayMetrics());
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
        t0();
    }

    @Override // com.daaw.MP, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        l0().C();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (v0(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // com.daaw.MP, com.daaw.AbstractActivityC5776jo, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        AbstractC6687n2 abstractC6687n2M0 = m0();
        if (menuItem.getItemId() != 16908332 || abstractC6687n2M0 == null || (abstractC6687n2M0.i() & 4) == 0) {
            return false;
        }
        return u0();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuOpened(int i, Menu menu) {
        return super.onMenuOpened(i, menu);
    }

    @Override // com.daaw.AbstractActivityC5776jo, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        l0().D(bundle);
    }

    @Override // com.daaw.MP, android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        l0().E();
    }

    @Override // com.daaw.MP, android.app.Activity
    public void onStart() {
        super.onStart();
        l0().G();
    }

    @Override // com.daaw.MP, android.app.Activity
    public void onStop() {
        super.onStop();
        l0().H();
    }

    @Override // android.app.Activity
    public void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        l0().S(charSequence);
    }

    @Override // android.app.Activity
    public void openOptionsMenu() {
        AbstractC6687n2 abstractC6687n2M0 = m0();
        if (getWindow().hasFeature(0)) {
            if (abstractC6687n2M0 == null || !abstractC6687n2M0.q()) {
                super.openOptionsMenu();
            }
        }
    }

    public void p0(C9759y11 c9759y11) {
        c9759y11.m(this);
    }

    @Override // com.daaw.AbstractActivityC5776jo, android.app.Activity
    public void setContentView(int i) {
        o0();
        l0().M(i);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        super.setTheme(i);
        l0().R(i);
    }

    @Override // com.daaw.T8
    public AbstractC8081s2 t(AbstractC8081s2.a aVar) {
        return null;
    }

    public boolean u0() {
        Intent intentM = m();
        if (intentM == null) {
            return false;
        }
        if (!z0(intentM)) {
            y0(intentM);
            return true;
        }
        C9759y11 c9759y11Q = C9759y11.q(this);
        p0(c9759y11Q);
        s0(c9759y11Q);
        c9759y11Q.s();
        try {
            AbstractC9204w2.m(this);
            return true;
        } catch (IllegalStateException unused) {
            finish();
            return true;
        }
    }

    public final boolean v0(KeyEvent keyEvent) {
        Window window;
        return (Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) ? false : true;
    }

    public void w0(Toolbar toolbar) {
        l0().Q(toolbar);
    }

    public AbstractC8081s2 x0(AbstractC8081s2.a aVar) {
        return l0().T(aVar);
    }

    public void y0(Intent intent) {
        AbstractC6339ln0.f(this, intent);
    }

    public boolean z0(Intent intent) {
        return AbstractC6339ln0.g(this, intent);
    }

    @Override // com.daaw.AbstractActivityC5776jo, android.app.Activity
    public void setContentView(View view) {
        o0();
        l0().N(view);
    }

    @Override // com.daaw.AbstractActivityC5776jo, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        o0();
        l0().O(view, layoutParams);
    }

    public void t0() {
    }

    @Override // com.daaw.T8
    public void o(AbstractC8081s2 abstractC8081s2) {
    }

    public void q0(C5163hd0 c5163hd0) {
    }

    @Override // com.daaw.T8
    public void r(AbstractC8081s2 abstractC8081s2) {
    }

    public void r0(int i) {
    }

    public void s0(C9759y11 c9759y11) {
    }
}
