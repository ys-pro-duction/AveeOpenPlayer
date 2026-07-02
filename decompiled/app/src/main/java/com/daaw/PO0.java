package com.daaw;

/* JADX INFO: loaded from: classes4.dex */
public abstract class PO0 {
    public static final GO0 b(Object obj) {
        if (obj == AbstractC3823cq.a) {
            throw new IllegalStateException("Does not contain segment");
        }
        G10.e(obj, "null cannot be cast to non-null type S of kotlinx.coroutines.internal.SegmentOrClosed");
        return (GO0) obj;
    }

    public static final boolean c(Object obj) {
        return obj == AbstractC3823cq.a;
    }

    public static Object a(Object obj) {
        return obj;
    }
}
