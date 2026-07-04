package com.daaw;

import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public class QG implements KI0 {
    public final KI0 a;
    public final boolean b;
    public a c;
    public H70 d;
    public int e;
    public boolean f;

    public interface a {
        void a(H70 h70, QG qg);
    }

    public QG(KI0 ki0, boolean z) {
        if (ki0 == null) {
            throw new NullPointerException("Wrapped resource must not be null");
        }
        this.a = ki0;
        this.b = z;
    }

    @Override // com.daaw.KI0
    public int a() {
        return this.a.a();
    }

    public void b() {
        if (this.f) {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
        if (!Looper.getMainLooper().equals(Looper.myLooper())) {
            throw new IllegalThreadStateException("Must call acquire on the main thread");
        }
        this.e++;
    }

    @Override // com.daaw.KI0
    public void c() {
        if (this.e > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
        if (this.f) {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
        this.f = true;
        this.a.c();
    }

    public boolean d() {
        return this.b;
    }

    public void e() {
        if (this.e <= 0) {
            throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
        }
        if (!Looper.getMainLooper().equals(Looper.myLooper())) {
            throw new IllegalThreadStateException("Must call release on the main thread");
        }
        int i = this.e - 1;
        this.e = i;
        if (i == 0) {
            this.c.a(this.d, this);
        }
    }

    public void f(H70 h70, a aVar) {
        this.d = h70;
        this.c = aVar;
    }

    @Override // com.daaw.KI0
    public Object get() {
        return this.a.get();
    }
}
