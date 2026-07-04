package com.daaw;

import android.os.Handler;

/* JADX INFO: renamed from: com.daaw.Bw0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0488Bw0 {
    public final b a;
    public final a b;
    public final L31 c;
    public int d;
    public Object e;
    public Handler f;
    public int g;
    public long h = -9223372036854775807L;
    public boolean i = true;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;

    /* JADX INFO: renamed from: com.daaw.Bw0$a */
    public interface a {
        void b(C0488Bw0 c0488Bw0);
    }

    /* JADX INFO: renamed from: com.daaw.Bw0$b */
    public interface b {
        void q(int i, Object obj);
    }

    public C0488Bw0(a aVar, b bVar, L31 l31, int i, Handler handler) {
        this.b = aVar;
        this.a = bVar;
        this.c = l31;
        this.f = handler;
        this.g = i;
    }

    public synchronized boolean a() {
        try {
            AbstractC7115ob.f(this.j);
            AbstractC7115ob.f(this.f.getLooper().getThread() != Thread.currentThread());
            while (!this.l) {
                wait();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.k;
    }

    public boolean b() {
        return this.i;
    }

    public Handler c() {
        return this.f;
    }

    public Object d() {
        return this.e;
    }

    public long e() {
        return this.h;
    }

    public b f() {
        return this.a;
    }

    public L31 g() {
        return this.c;
    }

    public int h() {
        return this.d;
    }

    public int i() {
        return this.g;
    }

    public synchronized boolean j() {
        return this.m;
    }

    public synchronized void k(boolean z) {
        this.k = z | this.k;
        this.l = true;
        notifyAll();
    }

    public C0488Bw0 l() {
        AbstractC7115ob.f(!this.j);
        if (this.h == -9223372036854775807L) {
            AbstractC7115ob.a(this.i);
        }
        this.j = true;
        this.b.b(this);
        return this;
    }

    public C0488Bw0 m(Object obj) {
        AbstractC7115ob.f(!this.j);
        this.e = obj;
        return this;
    }

    public C0488Bw0 n(int i) {
        AbstractC7115ob.f(!this.j);
        this.d = i;
        return this;
    }
}
