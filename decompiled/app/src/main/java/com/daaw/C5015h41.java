package com.daaw;

import android.app.Application;
import android.content.Context;
import com.daaw.ComponentCallbacks2C3485be;
import com.daaw.InterfaceC5766jm;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: renamed from: com.daaw.h41, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5015h41 {
    public final C5822jy a;
    public final InterfaceC5766jm b;
    public volatile boolean c;
    public volatile int d;
    public volatile long e;
    public volatile boolean f;

    /* JADX INFO: renamed from: com.daaw.h41$a */
    public class a implements ComponentCallbacks2C3485be.a {
        public final /* synthetic */ C5822jy a;
        public final /* synthetic */ InterfaceC5766jm b;

        public a(C5822jy c5822jy, InterfaceC5766jm interfaceC5766jm) {
            this.a = c5822jy;
            this.b = interfaceC5766jm;
        }

        @Override // com.daaw.ComponentCallbacks2C3485be.a
        public void a(boolean z) {
            C5015h41.this.c = z;
            if (z) {
                this.a.c();
            } else if (C5015h41.this.g()) {
                this.a.f(C5015h41.this.e - this.b.a());
            }
        }
    }

    public C5015h41(Context context, C7501px c7501px, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        this((Context) AbstractC7506py0.l(context), new C5822jy((C7501px) AbstractC7506py0.l(c7501px), executor, scheduledExecutorService), new InterfaceC5766jm.a());
    }

    public void d(L8 l8) {
        C1639Mw c1639MwD = l8 instanceof C1639Mw ? (C1639Mw) l8 : C1639Mw.d(l8.b());
        this.e = c1639MwD.h() + ((long) (c1639MwD.f() * 0.5d)) + 300000;
        if (this.e > c1639MwD.a()) {
            this.e = c1639MwD.a() - 60000;
        }
        if (g()) {
            this.a.f(this.e - this.b.a());
        }
    }

    public void e(int i) {
        if (this.d == 0 && i > 0) {
            this.d = i;
            if (g()) {
                this.a.f(this.e - this.b.a());
            }
        } else if (this.d > 0 && i == 0) {
            this.a.c();
        }
        this.d = i;
    }

    public void f(boolean z) {
        this.f = z;
    }

    public final boolean g() {
        return this.f && !this.c && this.d > 0 && this.e != -1;
    }

    public C5015h41(Context context, C5822jy c5822jy, InterfaceC5766jm interfaceC5766jm) {
        this.a = c5822jy;
        this.b = interfaceC5766jm;
        this.e = -1L;
        ComponentCallbacks2C3485be.c((Application) context.getApplicationContext());
        ComponentCallbacks2C3485be.b().a(new a(c5822jy, interfaceC5766jm));
    }
}
