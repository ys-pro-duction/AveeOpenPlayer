package com.daaw;

import android.os.Bundle;
import androidx.lifecycle.g;

/* JADX INFO: loaded from: classes.dex */
public final class ZM0 {
    public static final a d = new a(null);
    public final InterfaceC3135aN0 a;
    public final YM0 b;
    public boolean c;

    public static final class a {
        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public final ZM0 a(InterfaceC3135aN0 interfaceC3135aN0) {
            G10.g(interfaceC3135aN0, "owner");
            return new ZM0(interfaceC3135aN0, null);
        }

        public a() {
        }
    }

    public /* synthetic */ ZM0(InterfaceC3135aN0 interfaceC3135aN0, AbstractC2911Yw abstractC2911Yw) {
        this(interfaceC3135aN0);
    }

    public static final ZM0 a(InterfaceC3135aN0 interfaceC3135aN0) {
        return d.a(interfaceC3135aN0);
    }

    public final YM0 b() {
        return this.b;
    }

    public final void c() {
        androidx.lifecycle.g gVarW = this.a.w();
        if (gVarW.b() != g.b.INITIALIZED) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        gVarW.a(new ZE0(this.a));
        this.b.e(gVarW);
        this.c = true;
    }

    public final void d(Bundle bundle) {
        if (!this.c) {
            c();
        }
        androidx.lifecycle.g gVarW = this.a.w();
        if (!gVarW.b().c(g.b.STARTED)) {
            this.b.f(bundle);
            return;
        }
        throw new IllegalStateException(("performRestore cannot be called when owner is " + gVarW.b()).toString());
    }

    public final void e(Bundle bundle) {
        G10.g(bundle, "outBundle");
        this.b.g(bundle);
    }

    public ZM0(InterfaceC3135aN0 interfaceC3135aN0) {
        this.a = interfaceC3135aN0;
        this.b = new YM0();
    }
}
