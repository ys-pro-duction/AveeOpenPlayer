package com.daaw;

/* JADX INFO: renamed from: com.daaw.mB0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6453mB0 extends AbstractC2049Qp {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC6453mB0(LQ lq) {
        super(lq, null);
        G10.g(lq, "defaultFactory");
    }

    public final C7011oB0 c(Object obj) {
        return new C7011oB0(this, obj, true);
    }

    public final C7011oB0 d(Object obj) {
        return new C7011oB0(this, obj, false);
    }
}
