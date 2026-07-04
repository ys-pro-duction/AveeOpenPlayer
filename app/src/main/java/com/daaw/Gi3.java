package com.daaw;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public final class Gi3 {
    public final H32 a;
    public OP2 b = OP2.J();
    public RP2 c = RP2.e();
    public Vp3 d;
    public Vp3 e;
    public Vp3 f;

    public Gi3(H32 h32) {
        this.a = h32;
    }

    public static Vp3 j(InterfaceC6406m12 interfaceC6406m12, OP2 op2, Vp3 vp3, H32 h32) {
        AbstractC8657u52 abstractC8657u52Zzn = interfaceC6406m12.zzn();
        int iZze = interfaceC6406m12.zze();
        Object objF = abstractC8657u52Zzn.o() ? null : abstractC8657u52Zzn.f(iZze);
        int iC = (interfaceC6406m12.zzx() || abstractC8657u52Zzn.o()) ? -1 : abstractC8657u52Zzn.d(iZze, h32, false).c(AbstractC9004vJ2.C(interfaceC6406m12.zzk()));
        for (int i = 0; i < op2.size(); i++) {
            Vp3 vp32 = (Vp3) op2.get(i);
            if (m(vp32, objF, interfaceC6406m12.zzx(), interfaceC6406m12.zzb(), interfaceC6406m12.zzc(), iC)) {
                return vp32;
            }
        }
        if (op2.isEmpty() && vp3 != null && m(vp3, objF, interfaceC6406m12.zzx(), interfaceC6406m12.zzb(), interfaceC6406m12.zzc(), iC)) {
            return vp3;
        }
        return null;
    }

    public static boolean m(Vp3 vp3, Object obj, boolean z, int i, int i2, int i3) {
        if (vp3.a.equals(obj)) {
            return z ? vp3.b == i && vp3.c == i2 : vp3.b == -1 && vp3.e == i3;
        }
        return false;
    }

    public final AbstractC8657u52 a(Vp3 vp3) {
        return (AbstractC8657u52) this.c.get(vp3);
    }

    public final Vp3 b() {
        return this.d;
    }

    public final Vp3 c() {
        Object next;
        Object obj;
        if (this.b.isEmpty()) {
            return null;
        }
        OP2 op2 = this.b;
        if (!AbstractC2988Zp0.a(op2)) {
            Iterator<E> it = op2.iterator();
            do {
                next = it.next();
            } while (it.hasNext());
            obj = next;
        } else {
            if (op2.isEmpty()) {
                throw new NoSuchElementException();
            }
            obj = op2.get(op2.size() - 1);
        }
        return (Vp3) obj;
    }

    public final Vp3 d() {
        return this.e;
    }

    public final Vp3 e() {
        return this.f;
    }

    public final void g(InterfaceC6406m12 interfaceC6406m12) {
        this.d = j(interfaceC6406m12, this.b, this.e, this.a);
    }

    public final void h(List list, Vp3 vp3, InterfaceC6406m12 interfaceC6406m12) {
        this.b = OP2.H(list);
        if (!list.isEmpty()) {
            this.e = (Vp3) list.get(0);
            vp3.getClass();
            this.f = vp3;
        }
        if (this.d == null) {
            this.d = j(interfaceC6406m12, this.b, this.e, this.a);
        }
        l(interfaceC6406m12.zzn());
    }

    public final void i(InterfaceC6406m12 interfaceC6406m12) {
        this.d = j(interfaceC6406m12, this.b, this.e, this.a);
        l(interfaceC6406m12.zzn());
    }

    public final void k(QP2 qp2, Vp3 vp3, AbstractC8657u52 abstractC8657u52) {
        if (vp3 == null) {
            return;
        }
        if (abstractC8657u52.a(vp3.a) != -1) {
            qp2.a(vp3, abstractC8657u52);
            return;
        }
        AbstractC8657u52 abstractC8657u522 = (AbstractC8657u52) this.c.get(vp3);
        if (abstractC8657u522 != null) {
            qp2.a(vp3, abstractC8657u522);
        }
    }

    public final void l(AbstractC8657u52 abstractC8657u52) {
        QP2 qp2 = new QP2();
        if (this.b.isEmpty()) {
            k(qp2, this.e, abstractC8657u52);
            if (!AbstractC3977dO2.a(this.f, this.e)) {
                k(qp2, this.f, abstractC8657u52);
            }
            if (!AbstractC3977dO2.a(this.d, this.e) && !AbstractC3977dO2.a(this.d, this.f)) {
                k(qp2, this.d, abstractC8657u52);
            }
        } else {
            for (int i = 0; i < this.b.size(); i++) {
                k(qp2, (Vp3) this.b.get(i), abstractC8657u52);
            }
            if (!this.b.contains(this.d)) {
                k(qp2, this.d, abstractC8657u52);
            }
        }
        this.c = qp2.c();
    }
}
