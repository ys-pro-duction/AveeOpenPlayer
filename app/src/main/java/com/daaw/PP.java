package com.daaw;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import androidx.fragment.app.FragmentManager;

/* JADX INFO: loaded from: classes.dex */
public class PP {
    public final QP a;

    public PP(QP qp) {
        this.a = qp;
    }

    public static PP b(QP qp) {
        return new PP((QP) AbstractC8621ty0.h(qp, "callbacks == null"));
    }

    public void a(androidx.fragment.app.c cVar) {
        FragmentManager fragmentManagerS = this.a.s();
        QP qp = this.a;
        fragmentManagerS.m(qp, qp, cVar);
    }

    public void c() {
        this.a.s().y();
    }

    public boolean d(MenuItem menuItem) {
        return this.a.s().B(menuItem);
    }

    public void e() {
        this.a.s().C();
    }

    public void f() {
        this.a.s().E();
    }

    public void g() {
        this.a.s().N();
    }

    public void h() {
        this.a.s().R();
    }

    public void i() {
        this.a.s().S();
    }

    public void j() {
        this.a.s().U();
    }

    public boolean k() {
        return this.a.s().b0(true);
    }

    public FragmentManager l() {
        return this.a.s();
    }

    public void m() {
        this.a.s().T0();
    }

    public View n(View view, String str, Context context, AttributeSet attributeSet) {
        return this.a.s().x0().onCreateView(view, str, context, attributeSet);
    }
}
