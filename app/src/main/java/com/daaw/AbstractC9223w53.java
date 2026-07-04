package com.daaw;

/* JADX INFO: renamed from: com.daaw.w53, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC9223w53 {
    public abstract int a(Object obj);

    public abstract int b(Object obj);

    public abstract Object c(Object obj);

    public abstract Object d(Object obj);

    public abstract Object e(Object obj, Object obj2);

    public abstract Object f();

    public abstract Object g(Object obj);

    public abstract void h(Object obj, int i, int i2);

    public abstract void i(Object obj, int i, long j);

    public abstract void j(Object obj, int i, Object obj2);

    public abstract void k(Object obj, int i, AbstractC9213w33 abstractC9213w33);

    public abstract void l(Object obj, int i, long j);

    public abstract void m(Object obj);

    public abstract void n(Object obj, Object obj2);

    public abstract void o(Object obj, Object obj2);

    public final boolean p(Object obj, InterfaceC4454f53 interfaceC4454f53) throws C8939v43 {
        int iZzd = interfaceC4454f53.zzd();
        int i = iZzd >>> 3;
        int i2 = iZzd & 7;
        if (i2 == 0) {
            l(obj, i, interfaceC4454f53.zzl());
            return true;
        }
        if (i2 == 1) {
            i(obj, i, interfaceC4454f53.zzk());
            return true;
        }
        if (i2 == 2) {
            k(obj, i, interfaceC4454f53.zzp());
            return true;
        }
        if (i2 != 3) {
            if (i2 == 4) {
                return false;
            }
            if (i2 != 5) {
                throw C8939v43.a();
            }
            h(obj, i, interfaceC4454f53.zzf());
            return true;
        }
        Object objF = f();
        int i3 = i << 3;
        while (interfaceC4454f53.zzc() != Integer.MAX_VALUE && p(objF, interfaceC4454f53)) {
        }
        if ((4 | i3) != interfaceC4454f53.zzd()) {
            throw C8939v43.b();
        }
        g(objF);
        j(obj, i, objF);
        return true;
    }

    public abstract boolean q(InterfaceC4454f53 interfaceC4454f53);

    public abstract void r(Object obj, Q33 q33);
}
