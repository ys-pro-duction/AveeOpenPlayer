package com.daaw;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes3.dex */
public final class KM0 implements O90, Serializable {
    public static final a E = new a(null);
    public static final AtomicReferenceFieldUpdater F = AtomicReferenceFieldUpdater.newUpdater(KM0.class, Object.class, "C");
    public volatile LQ B;
    public volatile Object C;
    public final Object D;

    public static final class a {
        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public a() {
        }
    }

    public KM0(LQ lq) {
        G10.g(lq, "initializer");
        this.B = lq;
        C7282p91 c7282p91 = C7282p91.a;
        this.C = c7282p91;
        this.D = c7282p91;
    }

    public boolean a() {
        return this.C != C7282p91.a;
    }

    @Override // com.daaw.O90
    public Object getValue() {
        Object obj = this.C;
        C7282p91 c7282p91 = C7282p91.a;
        if (obj != c7282p91) {
            return obj;
        }
        LQ lq = this.B;
        if (lq != null) {
            Object objInvoke = lq.invoke();
            if (AbstractC5549j0.a(F, this, c7282p91, objInvoke)) {
                this.B = null;
                return objInvoke;
            }
        }
        return this.C;
    }

    public String toString() {
        return a() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
