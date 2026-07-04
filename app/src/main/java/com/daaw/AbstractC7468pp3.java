package com.daaw;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: renamed from: com.daaw.pp3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7468pp3 implements Xp3 {
    public final ArrayList a = new ArrayList(1);
    public final HashSet b = new HashSet(1);
    public final C6636mq3 c = new C6636mq3();
    public final C8015rn3 d = new C8015rn3();
    public Looper e;
    public AbstractC8657u52 f;
    public C3519bk3 g;

    @Override // com.daaw.Xp3
    public final void c(Wp3 wp3) {
        boolean zIsEmpty = this.b.isEmpty();
        this.b.remove(wp3);
        if (zIsEmpty || !this.b.isEmpty()) {
            return;
        }
        t();
    }

    @Override // com.daaw.Xp3
    public final void d(Handler handler, InterfaceC6915nq3 interfaceC6915nq3) {
        this.c.b(handler, interfaceC6915nq3);
    }

    @Override // com.daaw.Xp3
    public final void e(InterfaceC6915nq3 interfaceC6915nq3) {
        this.c.h(interfaceC6915nq3);
    }

    @Override // com.daaw.Xp3
    public final void f(Wp3 wp3) {
        this.a.remove(wp3);
        if (!this.a.isEmpty()) {
            c(wp3);
            return;
        }
        this.e = null;
        this.f = null;
        this.g = null;
        this.b.clear();
        x();
    }

    @Override // com.daaw.Xp3
    public abstract /* synthetic */ void i(YL1 yl1);

    @Override // com.daaw.Xp3
    public final void j(InterfaceC8573tn3 interfaceC8573tn3) {
        this.d.c(interfaceC8573tn3);
    }

    @Override // com.daaw.Xp3
    public /* synthetic */ AbstractC8657u52 k() {
        return null;
    }

    @Override // com.daaw.Xp3
    public final void l(Wp3 wp3) {
        this.e.getClass();
        HashSet hashSet = this.b;
        boolean zIsEmpty = hashSet.isEmpty();
        hashSet.add(wp3);
        if (zIsEmpty) {
            u();
        }
    }

    @Override // com.daaw.Xp3
    public final void m(Wp3 wp3, InterfaceC3917d93 interfaceC3917d93, C3519bk3 c3519bk3) {
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.e;
        boolean z = true;
        if (looper != null && looper != looperMyLooper) {
            z = false;
        }
        AbstractC6048km2.d(z);
        this.g = c3519bk3;
        AbstractC8657u52 abstractC8657u52 = this.f;
        this.a.add(wp3);
        if (this.e == null) {
            this.e = looperMyLooper;
            this.b.add(wp3);
            v(interfaceC3917d93);
        } else if (abstractC8657u52 != null) {
            l(wp3);
            wp3.a(this, abstractC8657u52);
        }
    }

    @Override // com.daaw.Xp3
    public final void n(Handler handler, InterfaceC8573tn3 interfaceC8573tn3) {
        this.d.b(handler, interfaceC8573tn3);
    }

    public final C3519bk3 o() {
        C3519bk3 c3519bk3 = this.g;
        AbstractC6048km2.b(c3519bk3);
        return c3519bk3;
    }

    public final C8015rn3 p(Vp3 vp3) {
        return this.d.a(0, vp3);
    }

    public final C8015rn3 q(int i, Vp3 vp3) {
        return this.d.a(0, vp3);
    }

    public final C6636mq3 r(Vp3 vp3) {
        return this.c.a(0, vp3);
    }

    public final C6636mq3 s(int i, Vp3 vp3) {
        return this.c.a(0, vp3);
    }

    public abstract void v(InterfaceC3917d93 interfaceC3917d93);

    public final void w(AbstractC8657u52 abstractC8657u52) {
        this.f = abstractC8657u52;
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((Wp3) arrayList.get(i)).a(this, abstractC8657u52);
        }
    }

    public abstract void x();

    public final boolean y() {
        return !this.b.isEmpty();
    }

    @Override // com.daaw.Xp3
    public /* synthetic */ boolean zzv() {
        return true;
    }

    public void t() {
    }

    public void u() {
    }
}
