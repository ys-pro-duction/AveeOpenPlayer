package com.daaw;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewTreeObserver;
import com.daaw.C2951Zg;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.daaw.bh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3500bh {
    public WeakReference a;
    public Drawable b;
    public String c;
    public String d;
    public Drawable e;
    public Integer f;
    public Integer g;
    public Integer h;
    public Integer i;
    public C2951Zg.b j;
    public boolean k;
    public boolean l;
    public String m;
    public Boolean n;
    public Boolean o;
    public final ArrayList p;
    public WeakReference q;
    public InterfaceC3778ch r;
    public ViewTreeObserver.OnGlobalLayoutListener s;

    public C3500bh(Activity activity) {
        G10.g(activity, "activity");
        this.p = new ArrayList();
        this.a = new WeakReference(activity);
    }

    public static final void B(C2951Zg c2951Zg, View view, C3500bh c3500bh) {
        G10.g(c2951Zg, "$bubbleShowCase");
        G10.g(c3500bh, "this$0");
        c2951Zg.E();
        view.getViewTreeObserver().removeOnGlobalLayoutListener(c3500bh.s);
    }

    public final C2951Zg A() {
        final C2951Zg c2951ZgD = d();
        WeakReference weakReference = this.q;
        if (weakReference == null) {
            c2951ZgD.E();
            return c2951ZgD;
        }
        G10.d(weakReference);
        final View view = (View) weakReference.get();
        G10.d(view);
        if (view.getHeight() != 0 && view.getWidth() != 0) {
            c2951ZgD.E();
            return c2951ZgD;
        }
        this.s = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.daaw.ah
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                C3500bh.B(c2951ZgD, view, this);
            }
        };
        view.getViewTreeObserver().addOnGlobalLayoutListener(this.s);
        return c2951ZgD;
    }

    public final C3500bh C(View view) {
        G10.g(view, "targetView");
        this.q = new WeakReference(view);
        return this;
    }

    public final C3500bh D(int i) {
        this.g = Integer.valueOf(i);
        return this;
    }

    public final C3500bh E(String str) {
        G10.g(str, "title");
        this.c = str;
        return this;
    }

    public final C3500bh b(C2951Zg.a aVar) {
        G10.g(aVar, "arrowPosition");
        this.p.clear();
        this.p.add(aVar);
        return this;
    }

    public final C3500bh c(int i) {
        this.f = Integer.valueOf(i);
        return this;
    }

    public final C2951Zg d() {
        if (this.n == null) {
            this.n = Boolean.TRUE;
        }
        if (this.o == null) {
            this.o = Boolean.TRUE;
        }
        return new C2951Zg(this);
    }

    public final C3500bh e(Drawable drawable) {
        this.e = drawable;
        return this;
    }

    public final WeakReference f() {
        return this.a;
    }

    public final ArrayList g() {
        return this.p;
    }

    public final Integer h() {
        return this.f;
    }

    public final InterfaceC3778ch i() {
        return this.r;
    }

    public final Drawable j() {
        return this.e;
    }

    public final boolean k() {
        return this.l;
    }

    public final boolean l() {
        return this.k;
    }

    public final C2951Zg.b m() {
        return this.j;
    }

    public final Drawable n() {
        return this.b;
    }

    public final Boolean o() {
        return this.n;
    }

    public final Boolean p() {
        return this.o;
    }

    public final OP0 q() {
        return null;
    }

    public final String r() {
        return this.m;
    }

    public final String s() {
        return this.d;
    }

    public final Integer t() {
        return this.i;
    }

    public final WeakReference u() {
        return this.q;
    }

    public final Integer v() {
        return this.g;
    }

    public final String w() {
        return this.c;
    }

    public final Integer x() {
        return this.h;
    }

    public final C3500bh y(int i) {
        WeakReference weakReference = this.a;
        G10.d(weakReference);
        this.b = AbstractC9438ws.e((Context) weakReference.get(), i);
        return this;
    }

    public final C3500bh z(InterfaceC3778ch interfaceC3778ch) {
        G10.g(interfaceC3778ch, "bubbleShowCaseListener");
        this.r = interfaceC3778ch;
        return this;
    }
}
