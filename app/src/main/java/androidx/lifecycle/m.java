package androidx.lifecycle;

import androidx.lifecycle.g;
import com.daaw.C9906ya;
import com.daaw.FM0;
import com.daaw.InterfaceC1764Ob0;
import com.daaw.InterfaceC9145vp0;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class m {
    public static final Object k = new Object();
    public final Object a = new Object();
    public FM0 b = new FM0();
    public int c = 0;
    public boolean d;
    public volatile Object e;
    public volatile Object f;
    public int g;
    public boolean h;
    public boolean i;
    public final Runnable j;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Object obj;
            synchronized (m.this.a) {
                obj = m.this.f;
                m.this.f = m.k;
            }
            m.this.l(obj);
        }
    }

    public class b extends d {
        public b(InterfaceC9145vp0 interfaceC9145vp0) {
            super(interfaceC9145vp0);
        }

        @Override // androidx.lifecycle.m.d
        public boolean e() {
            return true;
        }
    }

    public class c extends d implements j {
        public final InterfaceC1764Ob0 F;

        public c(InterfaceC1764Ob0 interfaceC1764Ob0, InterfaceC9145vp0 interfaceC9145vp0) {
            super(interfaceC9145vp0);
            this.F = interfaceC1764Ob0;
        }

        @Override // androidx.lifecycle.m.d
        public void b() {
            this.F.w().d(this);
        }

        @Override // androidx.lifecycle.j
        public void c(InterfaceC1764Ob0 interfaceC1764Ob0, g.a aVar) {
            g.b bVarB = this.F.w().b();
            if (bVarB == g.b.DESTROYED) {
                m.this.k(this.B);
                return;
            }
            g.b bVar = null;
            while (bVar != bVarB) {
                a(e());
                bVar = bVarB;
                bVarB = this.F.w().b();
            }
        }

        @Override // androidx.lifecycle.m.d
        public boolean d(InterfaceC1764Ob0 interfaceC1764Ob0) {
            return this.F == interfaceC1764Ob0;
        }

        @Override // androidx.lifecycle.m.d
        public boolean e() {
            return this.F.w().b().c(g.b.STARTED);
        }
    }

    public abstract class d {
        public final InterfaceC9145vp0 B;
        public boolean C;
        public int D = -1;

        public d(InterfaceC9145vp0 interfaceC9145vp0) {
            this.B = interfaceC9145vp0;
        }

        public void a(boolean z) {
            if (z == this.C) {
                return;
            }
            this.C = z;
            m.this.b(z ? 1 : -1);
            if (this.C) {
                m.this.d(this);
            }
        }

        public void b() {
        }

        public boolean d(InterfaceC1764Ob0 interfaceC1764Ob0) {
            return false;
        }

        public abstract boolean e();
    }

    public m() {
        Object obj = k;
        this.f = obj;
        this.j = new a();
        this.e = obj;
        this.g = -1;
    }

    public static void a(String str) {
        if (C9906ya.g().b()) {
            return;
        }
        throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
    }

    public void b(int i) {
        int i2 = this.c;
        this.c = i + i2;
        if (this.d) {
            return;
        }
        this.d = true;
        while (true) {
            try {
                int i3 = this.c;
                if (i2 == i3) {
                    this.d = false;
                    return;
                }
                boolean z = i2 == 0 && i3 > 0;
                boolean z2 = i2 > 0 && i3 == 0;
                if (z) {
                    h();
                } else if (z2) {
                    i();
                }
                i2 = i3;
            } catch (Throwable th) {
                this.d = false;
                throw th;
            }
        }
    }

    public final void c(d dVar) {
        if (dVar.C) {
            if (!dVar.e()) {
                dVar.a(false);
                return;
            }
            int i = dVar.D;
            int i2 = this.g;
            if (i >= i2) {
                return;
            }
            dVar.D = i2;
            dVar.B.b(this.e);
        }
    }

    public void d(d dVar) {
        if (this.h) {
            this.i = true;
            return;
        }
        this.h = true;
        do {
            this.i = false;
            if (dVar != null) {
                c(dVar);
                dVar = null;
            } else {
                FM0.d dVarP = this.b.p();
                while (dVarP.hasNext()) {
                    c((d) ((Map.Entry) dVarP.next()).getValue());
                    if (this.i) {
                        break;
                    }
                }
            }
        } while (this.i);
        this.h = false;
    }

    public Object e() {
        Object obj = this.e;
        if (obj != k) {
            return obj;
        }
        return null;
    }

    public void f(InterfaceC1764Ob0 interfaceC1764Ob0, InterfaceC9145vp0 interfaceC9145vp0) {
        a("observe");
        if (interfaceC1764Ob0.w().b() == g.b.DESTROYED) {
            return;
        }
        c cVar = new c(interfaceC1764Ob0, interfaceC9145vp0);
        d dVar = (d) this.b.v(interfaceC9145vp0, cVar);
        if (dVar != null && !dVar.d(interfaceC1764Ob0)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (dVar != null) {
            return;
        }
        interfaceC1764Ob0.w().a(cVar);
    }

    public void g(InterfaceC9145vp0 interfaceC9145vp0) {
        a("observeForever");
        b bVar = new b(interfaceC9145vp0);
        d dVar = (d) this.b.v(interfaceC9145vp0, bVar);
        if (dVar instanceof c) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (dVar != null) {
            return;
        }
        bVar.a(true);
    }

    public void h() {
    }

    public void i() {
    }

    public void j(Object obj) {
        boolean z;
        synchronized (this.a) {
            z = this.f == k;
            this.f = obj;
        }
        if (z) {
            C9906ya.g().c(this.j);
        }
    }

    public void k(InterfaceC9145vp0 interfaceC9145vp0) {
        a("removeObserver");
        d dVar = (d) this.b.w(interfaceC9145vp0);
        if (dVar == null) {
            return;
        }
        dVar.b();
        dVar.a(false);
    }

    public void l(Object obj) {
        a("setValue");
        this.g++;
        this.e = obj;
        d(null);
    }
}
