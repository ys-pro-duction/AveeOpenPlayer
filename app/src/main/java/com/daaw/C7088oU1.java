package com.daaw;

import android.content.Context;
import android.view.ViewGroup;

/* JADX INFO: renamed from: com.daaw.oU1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7088oU1 {
    public final Context a;
    public final FU1 b;
    public final ViewGroup c;
    public C6809nU1 d;

    public C7088oU1(Context context, ViewGroup viewGroup, InterfaceC9334wW1 interfaceC9334wW1) {
        this.a = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.c = viewGroup;
        this.b = interfaceC9334wW1;
        this.d = null;
    }

    public final C6809nU1 a() {
        return this.d;
    }

    public final Integer b() {
        C6809nU1 c6809nU1 = this.d;
        if (c6809nU1 != null) {
            return c6809nU1.o();
        }
        return null;
    }

    public final void c(int i, int i2, int i3, int i4) {
        AbstractC7506py0.e("The underlay may only be modified from the UI thread.");
        C6809nU1 c6809nU1 = this.d;
        if (c6809nU1 != null) {
            c6809nU1.h(i, i2, i3, i4);
        }
    }

    public final void d(int i, int i2, int i3, int i4, int i5, boolean z, EU1 eu1) {
        if (this.d != null) {
            return;
        }
        IE1.a(this.b.zzm().a(), this.b.zzk(), "vpr2");
        Context context = this.a;
        FU1 fu1 = this.b;
        C6809nU1 c6809nU1 = new C6809nU1(context, fu1, i5, z, fu1.zzm().a(), eu1);
        this.d = c6809nU1;
        this.c.addView(c6809nU1, 0, new ViewGroup.LayoutParams(-1, -1));
        this.d.h(i, i2, i3, i4);
        this.b.zzz(false);
    }

    public final void e() {
        AbstractC7506py0.e("onDestroy must be called from the UI thread.");
        C6809nU1 c6809nU1 = this.d;
        if (c6809nU1 != null) {
            c6809nU1.r();
            this.c.removeView(this.d);
            this.d = null;
        }
    }

    public final void f() {
        AbstractC7506py0.e("onPause must be called from the UI thread.");
        C6809nU1 c6809nU1 = this.d;
        if (c6809nU1 != null) {
            c6809nU1.x();
        }
    }

    public final void g(int i) {
        C6809nU1 c6809nU1 = this.d;
        if (c6809nU1 != null) {
            c6809nU1.e(i);
        }
    }
}
