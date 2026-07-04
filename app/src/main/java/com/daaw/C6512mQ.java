package com.daaw;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import androidx.lifecycle.g;
import androidx.lifecycle.y;

/* JADX INFO: renamed from: com.daaw.mQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C6512mQ implements androidx.lifecycle.e, InterfaceC3135aN0, InterfaceC0417Be1 {
    public final androidx.fragment.app.c B;
    public final C0313Ae1 C;
    public final Runnable D;
    public y.c E;
    public androidx.lifecycle.l F = null;
    public ZM0 G = null;

    public C6512mQ(androidx.fragment.app.c cVar, C0313Ae1 c0313Ae1, Runnable runnable) {
        this.B = cVar;
        this.C = c0313Ae1;
        this.D = runnable;
    }

    public void a(g.a aVar) {
        this.F.i(aVar);
    }

    public void b() {
        if (this.F == null) {
            this.F = new androidx.lifecycle.l(this);
            ZM0 zm0A = ZM0.a(this);
            this.G = zm0A;
            zm0A.c();
            this.D.run();
        }
    }

    public boolean d() {
        return this.F != null;
    }

    public void e(Bundle bundle) {
        this.G.d(bundle);
    }

    public void f(Bundle bundle) {
        this.G.e(bundle);
    }

    public void g(g.b bVar) {
        this.F.n(bVar);
    }

    @Override // androidx.lifecycle.e
    public y.c j() {
        Application application;
        y.c cVarJ = this.B.j();
        if (!cVarJ.equals(this.B.z0)) {
            this.E = cVarJ;
            return cVarJ;
        }
        if (this.E == null) {
            Context applicationContext = this.B.s1().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
            androidx.fragment.app.c cVar = this.B;
            this.E = new androidx.lifecycle.v(application, cVar, cVar.s());
        }
        return this.E;
    }

    @Override // androidx.lifecycle.e
    public AbstractC5247hu k() {
        Application application;
        Context applicationContext = this.B.s1().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        C3804cm0 c3804cm0 = new C3804cm0();
        if (application != null) {
            c3804cm0.c(y.a.g, application);
        }
        c3804cm0.c(androidx.lifecycle.u.a, this.B);
        c3804cm0.c(androidx.lifecycle.u.b, this);
        if (this.B.s() != null) {
            c3804cm0.c(androidx.lifecycle.u.c, this.B.s());
        }
        return c3804cm0;
    }

    @Override // com.daaw.InterfaceC0417Be1
    public C0313Ae1 n() {
        b();
        return this.C;
    }

    @Override // com.daaw.InterfaceC3135aN0
    public YM0 p() {
        b();
        return this.G.b();
    }

    @Override // com.daaw.InterfaceC1764Ob0
    public androidx.lifecycle.g w() {
        b();
        return this.F;
    }
}
