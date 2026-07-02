package com.daaw;

import android.app.Activity;
import com.daaw.C2471Uq;
import com.daaw.InterfaceC2367Tq;

/* JADX INFO: loaded from: classes3.dex */
public final class Ve3 implements InterfaceC2367Tq {
    public final C0814Ex1 a;
    public final C3280as3 b;
    public final C10131zM1 c;
    public final Object d = new Object();
    public final Object e = new Object();
    public boolean f = false;
    public boolean g = false;
    public C2471Uq h = new C2471Uq.a().a();

    public Ve3(C0814Ex1 c0814Ex1, C3280as3 c3280as3, C10131zM1 c10131zM1) {
        this.a = c0814Ex1;
        this.b = c3280as3;
        this.c = c10131zM1;
    }

    @Override // com.daaw.InterfaceC2367Tq
    public final void a(Activity activity, C2471Uq c2471Uq, InterfaceC2367Tq.b bVar, InterfaceC2367Tq.a aVar) {
        synchronized (this.d) {
            this.f = true;
        }
        this.h = c2471Uq;
        this.b.c(activity, c2471Uq, bVar, aVar);
    }

    @Override // com.daaw.InterfaceC2367Tq
    public final int b() {
        if (c()) {
            return this.a.a();
        }
        return 0;
    }

    public final boolean c() {
        boolean z;
        synchronized (this.d) {
            z = this.f;
        }
        return z;
    }
}
