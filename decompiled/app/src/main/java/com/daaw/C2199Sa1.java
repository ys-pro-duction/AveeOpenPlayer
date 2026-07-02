package com.daaw;

import com.daaw.C2199Sa1;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.daaw.Sa1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C2199Sa1 {
    public final C2652Wj0 a;
    public final C9722xt b;
    public final String c;
    public final a d = new a(false);
    public final a e = new a(true);
    public final AtomicMarkableReference f = new AtomicMarkableReference(null, false);

    /* JADX INFO: renamed from: com.daaw.Sa1$a */
    public class a {
        public final AtomicMarkableReference a;
        public final AtomicReference b = new AtomicReference(null);
        public final boolean c;

        public a(boolean z) {
            this.c = z;
            this.a = new AtomicMarkableReference(new C3630c80(64, z ? 8192 : 1024), false);
        }

        public static /* synthetic */ Void a(a aVar) throws Throwable {
            aVar.b.set(null);
            aVar.d();
            return null;
        }

        public Map b() {
            return ((C3630c80) this.a.getReference()).a();
        }

        public final void c() {
            Callable callable = new Callable() { // from class: com.daaw.Ra1
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return C2199Sa1.a.a(this.a);
                }
            };
            if (AbstractC0552Cm0.a(this.b, null, callable)) {
                C2199Sa1.this.b.h(callable);
            }
        }

        public final void d() throws Throwable {
            Map mapA;
            synchronized (this) {
                try {
                    if (this.a.isMarked()) {
                        mapA = ((C3630c80) this.a.getReference()).a();
                        AtomicMarkableReference atomicMarkableReference = this.a;
                        atomicMarkableReference.set((C3630c80) atomicMarkableReference.getReference(), false);
                    } else {
                        mapA = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (mapA != null) {
                C2199Sa1.this.a.k(C2199Sa1.this.c, mapA, this.c);
            }
        }

        public boolean e(String str, String str2) {
            synchronized (this) {
                try {
                    if (!((C3630c80) this.a.getReference()).d(str, str2)) {
                        return false;
                    }
                    AtomicMarkableReference atomicMarkableReference = this.a;
                    atomicMarkableReference.set((C3630c80) atomicMarkableReference.getReference(), true);
                    c();
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public C2199Sa1(String str, RK rk, C9722xt c9722xt) {
        this.c = str;
        this.a = new C2652Wj0(rk);
        this.b = c9722xt;
    }

    public static C2199Sa1 f(String str, RK rk, C9722xt c9722xt) {
        C2652Wj0 c2652Wj0 = new C2652Wj0(rk);
        C2199Sa1 c2199Sa1 = new C2199Sa1(str, rk, c9722xt);
        ((C3630c80) c2199Sa1.d.a.getReference()).e(c2652Wj0.g(str, false));
        ((C3630c80) c2199Sa1.e.a.getReference()).e(c2652Wj0.g(str, true));
        c2199Sa1.f.set(c2652Wj0.h(str), false);
        return c2199Sa1;
    }

    public static String g(String str, RK rk) {
        return new C2652Wj0(rk).h(str);
    }

    public Map d() {
        return this.d.b();
    }

    public Map e() {
        return this.e.b();
    }

    public boolean h(String str, String str2) {
        return this.e.e(str, str2);
    }
}
