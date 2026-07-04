package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public abstract class K91 {
    public abstract void a(Object obj, int i, int i2);

    public abstract void b(Object obj, int i, long j);

    public abstract void c(Object obj, int i, Object obj2);

    public abstract void d(Object obj, int i, AbstractC4340ei abstractC4340ei);

    public abstract void e(Object obj, int i, long j);

    public abstract Object f(Object obj);

    public abstract Object g(Object obj);

    public abstract int h(Object obj);

    public abstract int i(Object obj);

    public abstract void j(Object obj);

    public abstract Object k(Object obj, Object obj2);

    public final void l(Object obj, KE0 ke0) {
        while (ke0.z() != Integer.MAX_VALUE && m(obj, ke0)) {
        }
    }

    public final boolean m(Object obj, KE0 ke0) throws P10 {
        int iT = ke0.t();
        int iA = AbstractC6027ki1.a(iT);
        int iB = AbstractC6027ki1.b(iT);
        if (iB == 0) {
            e(obj, iA, ke0.M());
            return true;
        }
        if (iB == 1) {
            b(obj, iA, ke0.d());
            return true;
        }
        if (iB == 2) {
            d(obj, iA, ke0.C());
            return true;
        }
        if (iB != 3) {
            if (iB == 4) {
                return false;
            }
            if (iB != 5) {
                throw P10.e();
            }
            a(obj, iA, ke0.i());
            return true;
        }
        Object objN = n();
        int iC = AbstractC6027ki1.c(iA, 4);
        l(objN, ke0);
        if (iC != ke0.t()) {
            throw P10.b();
        }
        c(obj, iA, r(objN));
        return true;
    }

    public abstract Object n();

    public abstract void o(Object obj, Object obj2);

    public abstract void p(Object obj, Object obj2);

    public abstract boolean q(KE0 ke0);

    public abstract Object r(Object obj);

    public abstract void s(Object obj, InterfaceC9674xj1 interfaceC9674xj1);

    public abstract void t(Object obj, InterfaceC9674xj1 interfaceC9674xj1);
}
