package com.daaw;

import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public class RG implements Runnable, InterfaceC8625tz0 {
    public final EnumC9190vz0 B;
    public final a C;
    public final C0704Dw D;
    public b E = b.CACHE;
    public volatile boolean F;

    public interface a extends MI0 {
        void h(RG rg);
    }

    public enum b {
        CACHE,
        SOURCE
    }

    public RG(a aVar, C0704Dw c0704Dw, EnumC9190vz0 enumC9190vz0) {
        this.C = aVar;
        this.D = c0704Dw;
        this.B = enumC9190vz0;
    }

    @Override // com.daaw.InterfaceC8625tz0
    public int a() {
        return this.B.ordinal();
    }

    public void b() {
        this.F = true;
        this.D.c();
    }

    public final KI0 c() {
        return f() ? d() : e();
    }

    public final KI0 d() {
        KI0 ki0F;
        try {
            ki0F = this.D.f();
        } catch (Exception e) {
            if (Log.isLoggable("EngineRunnable", 3)) {
                e.toString();
            }
            ki0F = null;
        }
        return ki0F == null ? this.D.h() : ki0F;
    }

    public final KI0 e() {
        return this.D.d();
    }

    public final boolean f() {
        return this.E == b.CACHE;
    }

    public final void g(KI0 ki0) {
        this.C.d(ki0);
    }

    public final void h(Exception exc) {
        if (!f()) {
            this.C.a(exc);
        } else {
            this.E = b.SOURCE;
            this.C.h(this);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        Exception e;
        if (this.F) {
            return;
        }
        KI0 ki0C = null;
        try {
            e = null;
            ki0C = c();
        } catch (Exception e2) {
            e = e2;
        } catch (OutOfMemoryError e3) {
            e = new DH(e3);
        }
        if (this.F) {
            if (ki0C != null) {
                ki0C.c();
            }
        } else if (ki0C == null) {
            h(e);
        } else {
            g(ki0C);
        }
    }
}
