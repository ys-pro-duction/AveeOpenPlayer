package com.daaw;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.widget.ActionBarContextView;
import com.daaw.AbstractC8081s2;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public class TV0 extends AbstractC8081s2 implements e.a {
    public Context D;
    public ActionBarContextView E;
    public AbstractC8081s2.a F;
    public WeakReference G;
    public boolean H;
    public boolean I;
    public androidx.appcompat.view.menu.e J;

    public TV0(Context context, ActionBarContextView actionBarContextView, AbstractC8081s2.a aVar, boolean z) {
        this.D = context;
        this.E = actionBarContextView;
        this.F = aVar;
        androidx.appcompat.view.menu.e eVarX = new androidx.appcompat.view.menu.e(actionBarContextView.getContext()).X(1);
        this.J = eVarX;
        eVarX.W(this);
        this.I = z;
    }

    @Override // androidx.appcompat.view.menu.e.a
    public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
        return this.F.d(this, menuItem);
    }

    @Override // androidx.appcompat.view.menu.e.a
    public void b(androidx.appcompat.view.menu.e eVar) {
        k();
        this.E.l();
    }

    @Override // com.daaw.AbstractC8081s2
    public void c() {
        if (this.H) {
            return;
        }
        this.H = true;
        this.F.c(this);
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
        return this.J;
    }

    @Override // com.daaw.AbstractC8081s2
    public MenuInflater f() {
        return new GZ0(this.E.getContext());
    }

    @Override // com.daaw.AbstractC8081s2
    public CharSequence g() {
        return this.E.getSubtitle();
    }

    @Override // com.daaw.AbstractC8081s2
    public CharSequence i() {
        return this.E.getTitle();
    }

    @Override // com.daaw.AbstractC8081s2
    public void k() {
        this.F.a(this, this.J);
    }

    @Override // com.daaw.AbstractC8081s2
    public boolean l() {
        return this.E.j();
    }

    @Override // com.daaw.AbstractC8081s2
    public void m(View view) {
        this.E.setCustomView(view);
        this.G = view != null ? new WeakReference(view) : null;
    }

    @Override // com.daaw.AbstractC8081s2
    public void n(int i) {
        o(this.D.getString(i));
    }

    @Override // com.daaw.AbstractC8081s2
    public void o(CharSequence charSequence) {
        this.E.setSubtitle(charSequence);
    }

    @Override // com.daaw.AbstractC8081s2
    public void q(int i) {
        r(this.D.getString(i));
    }

    @Override // com.daaw.AbstractC8081s2
    public void r(CharSequence charSequence) {
        this.E.setTitle(charSequence);
    }

    @Override // com.daaw.AbstractC8081s2
    public void s(boolean z) {
        super.s(z);
        this.E.setTitleOptional(z);
    }
}
