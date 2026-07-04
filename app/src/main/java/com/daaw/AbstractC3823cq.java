package com.daaw;

/* JADX INFO: renamed from: com.daaw.cq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC3823cq {
    public static final YZ0 a = new YZ0("CLOSED");

    public static final AbstractC4101dq b(AbstractC4101dq abstractC4101dq) {
        while (true) {
            Object objF = abstractC4101dq.f();
            if (objF == a) {
                return abstractC4101dq;
            }
            AbstractC4101dq abstractC4101dq2 = (AbstractC4101dq) objF;
            if (abstractC4101dq2 != null) {
                abstractC4101dq = abstractC4101dq2;
            } else if (abstractC4101dq.j()) {
                return abstractC4101dq;
            }
        }
    }

    public static final Object c(GO0 go0, long j, InterfaceC3429bR interfaceC3429bR) {
        while (true) {
            if (go0.D >= j && !go0.h()) {
                return PO0.a(go0);
            }
            Object objF = go0.f();
            if (objF == a) {
                return PO0.a(a);
            }
            GO0 go02 = (GO0) ((AbstractC4101dq) objF);
            if (go02 == null) {
                go02 = (GO0) interfaceC3429bR.invoke(Long.valueOf(go0.D + 1), go0);
                if (go0.l(go02)) {
                    if (go0.h()) {
                        go0.k();
                    }
                }
            }
            go0 = go02;
        }
    }
}
