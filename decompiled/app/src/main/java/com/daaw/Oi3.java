package com.daaw;

import android.util.Base64;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

/* JADX INFO: loaded from: classes3.dex */
public final class Oi3 implements Xj3 {
    public static final CO2 i = new CO2() { // from class: com.daaw.Ki3
        @Override // com.daaw.CO2
        public final Object zza() {
            return Oi3.m();
        }
    };
    public static final Random j = new Random();
    public final CO2 d;
    public Vj3 e;
    public String g;
    public final Q42 a = new Q42();
    public final H32 b = new H32();
    public final HashMap c = new HashMap();
    public AbstractC8657u52 f = AbstractC8657u52.a;
    public long h = -1;

    public Oi3(CO2 co2) {
        this.d = co2;
    }

    public static String m() {
        byte[] bArr = new byte[12];
        j.nextBytes(bArr);
        return Base64.encodeToString(bArr, 10);
    }

    @Override // com.daaw.Xj3
    public final void a(Vj3 vj3) {
        this.e = vj3;
    }

    @Override // com.daaw.Xj3
    public final synchronized void b(C10219zg3 c10219zg3) {
        Vj3 vj3;
        try {
            String str = this.g;
            if (str != null) {
                Mi3 mi3 = (Mi3) this.c.get(str);
                if (mi3 == null) {
                    throw null;
                }
                n(mi3);
            }
            Iterator it = this.c.values().iterator();
            while (it.hasNext()) {
                Mi3 mi32 = (Mi3) it.next();
                it.remove();
                if (mi32.e && (vj3 = this.e) != null) {
                    vj3.f(c10219zg3, mi32.a, false);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.daaw.Xj3
    public final synchronized void c(C10219zg3 c10219zg3, int i2) {
        try {
            if (this.e == null) {
                throw null;
            }
            Iterator it = this.c.values().iterator();
            while (it.hasNext()) {
                Mi3 mi3 = (Mi3) it.next();
                if (mi3.k(c10219zg3)) {
                    it.remove();
                    if (mi3.e) {
                        boolean zEquals = mi3.a.equals(this.g);
                        boolean z = false;
                        if (i2 == 0 && zEquals && mi3.f) {
                            z = true;
                        }
                        if (zEquals) {
                            n(mi3);
                        }
                        this.e.f(c10219zg3, mi3.a, z);
                    }
                }
            }
            o(c10219zg3);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.daaw.Xj3
    public final synchronized void d(C10219zg3 c10219zg3) {
        if (this.e == null) {
            throw null;
        }
        if (c10219zg3.b.o()) {
            return;
        }
        Vp3 vp3 = c10219zg3.d;
        if (vp3 != null) {
            if (vp3.d < k()) {
                return;
            }
            Mi3 mi3 = (Mi3) this.c.get(this.g);
            if (mi3 != null && mi3.c == -1 && mi3.b != c10219zg3.c) {
                return;
            }
        }
        Mi3 mi3L = l(c10219zg3.c, c10219zg3.d);
        if (this.g == null) {
            this.g = mi3L.a;
        }
        Vp3 vp32 = c10219zg3.d;
        if (vp32 != null && vp32.b()) {
            Mi3 mi3L2 = l(c10219zg3.c, new Vp3(vp32.a, vp32.d, vp32.b));
            if (!mi3L2.e) {
                mi3L2.e = true;
                AbstractC8657u52 abstractC8657u52 = c10219zg3.b;
                Vp3 vp33 = c10219zg3.d;
                abstractC8657u52.n(vp33.a, this.b);
                this.b.i(c10219zg3.d.b);
                Math.max(0L, AbstractC9004vJ2.E(0L) + AbstractC9004vJ2.E(0L));
                String unused = mi3L2.a;
            }
        }
        if (!mi3L.e) {
            mi3L.e = true;
            String unused2 = mi3L.a;
        }
        if (!mi3L.a.equals(this.g) || mi3L.f) {
            return;
        }
        mi3L.f = true;
        this.e.a(c10219zg3, mi3L.a);
    }

    @Override // com.daaw.Xj3
    public final synchronized String e(AbstractC8657u52 abstractC8657u52, Vp3 vp3) {
        return l(abstractC8657u52.n(vp3.a, this.b).c, vp3).a;
    }

    @Override // com.daaw.Xj3
    public final synchronized void f(C10219zg3 c10219zg3) {
        try {
            if (this.e == null) {
                throw null;
            }
            AbstractC8657u52 abstractC8657u52 = this.f;
            this.f = c10219zg3.b;
            Iterator it = this.c.values().iterator();
            while (it.hasNext()) {
                Mi3 mi3 = (Mi3) it.next();
                if (!mi3.l(abstractC8657u52, this.f) || mi3.k(c10219zg3)) {
                    it.remove();
                    if (mi3.e) {
                        if (mi3.a.equals(this.g)) {
                            n(mi3);
                        }
                        this.e.f(c10219zg3, mi3.a, false);
                    }
                }
            }
            o(c10219zg3);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final long k() {
        Mi3 mi3 = (Mi3) this.c.get(this.g);
        return (mi3 == null || mi3.c == -1) ? this.h + 1 : mi3.c;
    }

    public final Mi3 l(int i2, Vp3 vp3) {
        long j2 = Long.MAX_VALUE;
        Mi3 mi3 = null;
        for (Mi3 mi32 : this.c.values()) {
            mi32.g(i2, vp3);
            if (mi32.j(i2, vp3)) {
                long j3 = mi32.c;
                if (j3 == -1 || j3 < j2) {
                    mi3 = mi32;
                    j2 = j3;
                } else if (j3 == j2) {
                    int i3 = AbstractC9004vJ2.a;
                    if (mi3.d != null && mi32.d != null) {
                        mi3 = mi32;
                    }
                }
            }
        }
        if (mi3 != null) {
            return mi3;
        }
        String strM = m();
        Mi3 mi33 = new Mi3(this, strM, i2, vp3);
        this.c.put(strM, mi33);
        return mi33;
    }

    public final void n(Mi3 mi3) {
        if (mi3.c != -1) {
            this.h = mi3.c;
        }
        this.g = null;
    }

    public final void o(C10219zg3 c10219zg3) {
        if (c10219zg3.b.o()) {
            String str = this.g;
            if (str != null) {
                Mi3 mi3 = (Mi3) this.c.get(str);
                mi3.getClass();
                n(mi3);
                return;
            }
            return;
        }
        Mi3 mi32 = (Mi3) this.c.get(this.g);
        Mi3 mi3L = l(c10219zg3.c, c10219zg3.d);
        this.g = mi3L.a;
        d(c10219zg3);
        Vp3 vp3 = c10219zg3.d;
        if (vp3 == null || !vp3.b()) {
            return;
        }
        if (mi32 != null) {
            if (mi32.c == vp3.d && mi32.d != null && mi32.d.b == c10219zg3.d.b && mi32.d.c == c10219zg3.d.c) {
                return;
            }
        }
        Vp3 vp32 = c10219zg3.d;
        String unused = l(c10219zg3.c, new Vp3(vp32.a, vp32.d)).a;
        String unused2 = mi3L.a;
    }

    @Override // com.daaw.Xj3
    public final synchronized String zze() {
        return this.g;
    }
}
