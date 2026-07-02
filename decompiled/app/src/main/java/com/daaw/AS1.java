package com.daaw;

/* JADX INFO: loaded from: classes.dex */
public abstract class AS1 {
    public Object a;
    public boolean b = false;
    public final /* synthetic */ AbstractC8245se c;

    public AS1(AbstractC8245se abstractC8245se, Object obj) {
        this.c = abstractC8245se;
        this.a = obj;
    }

    public abstract void a(Object obj);

    public abstract void b();

    public final void c() {
        Object obj;
        synchronized (this) {
            try {
                obj = this.a;
                if (this.b) {
                    toString();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (obj != null) {
            a(obj);
        }
        synchronized (this) {
            this.b = true;
        }
        e();
    }

    public final void d() {
        synchronized (this) {
            this.a = null;
        }
    }

    public final void e() {
        d();
        synchronized (this.c.r) {
            this.c.r.remove(this);
        }
    }
}
