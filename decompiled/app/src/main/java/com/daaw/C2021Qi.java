package com.daaw;

/* JADX INFO: renamed from: com.daaw.Qi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2021Qi {
    public final NQ a;

    public C2021Qi(NQ nq) {
        this.a = nq;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2021Qi) && G10.c(this.a, ((C2021Qi) obj).a);
    }

    public int hashCode() {
        NQ nq = this.a;
        if (nq == null) {
            return 0;
        }
        return nq.hashCode();
    }

    public String toString() {
        return "Callbacks(onClose=" + this.a + ')';
    }

    public /* synthetic */ C2021Qi(NQ nq, int i, AbstractC2911Yw abstractC2911Yw) {
        this((i & 1) != 0 ? null : nq);
    }
}
