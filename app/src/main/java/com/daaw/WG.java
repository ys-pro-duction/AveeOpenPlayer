package com.daaw;

/* JADX INFO: loaded from: classes.dex */
public abstract class WG extends PR0 {
    public WG(QJ0 qj0) {
        super(qj0);
    }

    public abstract void g(NZ0 nz0, Object obj);

    public final void h(Object obj) {
        NZ0 nz0A = a();
        try {
            g(nz0A, obj);
            nz0A.d1();
        } finally {
            f(nz0A);
        }
    }
}
