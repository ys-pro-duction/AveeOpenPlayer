package com.daaw;

import java.io.Serializable;

/* JADX INFO: renamed from: com.daaw.e01, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4148e01 implements O90, Serializable {
    public LQ B;
    public volatile Object C;
    public final Object D;

    public C4148e01(LQ lq, Object obj) {
        G10.g(lq, "initializer");
        this.B = lq;
        this.C = C7282p91.a;
        this.D = obj == null ? this : obj;
    }

    public boolean a() {
        return this.C != C7282p91.a;
    }

    @Override // com.daaw.O90
    public Object getValue() {
        Object objInvoke;
        Object obj = this.C;
        C7282p91 c7282p91 = C7282p91.a;
        if (obj != c7282p91) {
            return obj;
        }
        synchronized (this.D) {
            objInvoke = this.C;
            if (objInvoke == c7282p91) {
                LQ lq = this.B;
                G10.d(lq);
                objInvoke = lq.invoke();
                this.C = objInvoke;
                this.B = null;
            }
        }
        return objInvoke;
    }

    public String toString() {
        return a() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }

    public /* synthetic */ C4148e01(LQ lq, Object obj, int i, AbstractC2911Yw abstractC2911Yw) {
        this(lq, (i & 2) != 0 ? null : obj);
    }
}
