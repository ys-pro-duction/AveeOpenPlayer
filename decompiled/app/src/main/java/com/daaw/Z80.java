package com.daaw;

import com.daaw.X80;
import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Z80 implements X80 {
    public final Object a;
    public final Object b;
    public X80 c;
    public final X80 d;

    public Z80(Object obj, Object obj2, X80 x80, X80 x802) {
        this.a = obj;
        this.b = obj2;
        this.c = x80 == null ? W80.i() : x80;
        this.d = x802 == null ? W80.i() : x802;
    }

    public static X80.a p(X80 x80) {
        return x80.f() ? X80.a.BLACK : X80.a.RED;
    }

    @Override // com.daaw.X80
    public X80 a() {
        return this.c;
    }

    @Override // com.daaw.X80
    public X80 b(Object obj, Object obj2, Comparator comparator) {
        int iCompare = comparator.compare(obj, this.a);
        return (iCompare < 0 ? k(null, null, this.c.b(obj, obj2, comparator), null) : iCompare == 0 ? k(obj, obj2, null, null) : k(null, null, null, this.d.b(obj, obj2, comparator))).l();
    }

    @Override // com.daaw.X80
    public X80 c(Object obj, Comparator comparator) {
        Z80 z80K;
        if (comparator.compare(obj, this.a) < 0) {
            Z80 z80N = (this.c.isEmpty() || this.c.f() || ((Z80) this.c).c.f()) ? this : n();
            z80K = z80N.k(null, null, z80N.c.c(obj, comparator), null);
        } else {
            Z80 z80S = this.c.f() ? s() : this;
            if (!z80S.d.isEmpty() && !z80S.d.f() && !((Z80) z80S.d).c.f()) {
                z80S = z80S.o();
            }
            if (comparator.compare(obj, z80S.a) == 0) {
                if (z80S.d.isEmpty()) {
                    return W80.i();
                }
                X80 x80G = z80S.d.g();
                z80S = z80S.k(x80G.getKey(), x80G.getValue(), null, ((Z80) z80S.d).q());
            }
            z80K = z80S.k(null, null, null, z80S.d.c(obj, comparator));
        }
        return z80K.l();
    }

    @Override // com.daaw.X80
    public X80 d() {
        return this.d;
    }

    @Override // com.daaw.X80
    public X80 g() {
        return this.c.isEmpty() ? this : this.c.g();
    }

    @Override // com.daaw.X80
    public Object getKey() {
        return this.a;
    }

    @Override // com.daaw.X80
    public Object getValue() {
        return this.b;
    }

    @Override // com.daaw.X80
    public X80 h() {
        return this.d.isEmpty() ? this : this.d.h();
    }

    public final Z80 i() {
        X80 x80 = this.c;
        X80 x80E = x80.e(null, null, p(x80), null, null);
        X80 x802 = this.d;
        return e(null, null, p(this), x80E, x802.e(null, null, p(x802), null, null));
    }

    @Override // com.daaw.X80
    public boolean isEmpty() {
        return false;
    }

    @Override // com.daaw.X80
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public Z80 e(Object obj, Object obj2, X80.a aVar, X80 x80, X80 x802) {
        if (obj == null) {
            obj = this.a;
        }
        if (obj2 == null) {
            obj2 = this.b;
        }
        if (x80 == null) {
            x80 = this.c;
        }
        if (x802 == null) {
            x802 = this.d;
        }
        return aVar == X80.a.RED ? new Y80(obj, obj2, x80, x802) : new V80(obj, obj2, x80, x802);
    }

    public abstract Z80 k(Object obj, Object obj2, X80 x80, X80 x802);

    public final Z80 l() {
        Z80 z80R = (!this.d.f() || this.c.f()) ? this : r();
        if (z80R.c.f() && ((Z80) z80R.c).c.f()) {
            z80R = z80R.s();
        }
        return (z80R.c.f() && z80R.d.f()) ? z80R.i() : z80R;
    }

    public abstract X80.a m();

    public final Z80 n() {
        Z80 z80I = i();
        return z80I.d().a().f() ? z80I.k(null, null, null, ((Z80) z80I.d()).s()).r().i() : z80I;
    }

    public final Z80 o() {
        Z80 z80I = i();
        return z80I.a().a().f() ? z80I.s().i() : z80I;
    }

    public final X80 q() {
        if (this.c.isEmpty()) {
            return W80.i();
        }
        Z80 z80N = (a().f() || a().a().f()) ? this : n();
        return z80N.k(null, null, ((Z80) z80N.c).q(), null).l();
    }

    public final Z80 r() {
        return (Z80) this.d.e(null, null, m(), e(null, null, X80.a.RED, null, ((Z80) this.d).c), null);
    }

    public final Z80 s() {
        return (Z80) this.c.e(null, null, m(), null, e(null, null, X80.a.RED, ((Z80) this.c).d, null));
    }

    public void t(X80 x80) {
        this.c = x80;
    }
}
