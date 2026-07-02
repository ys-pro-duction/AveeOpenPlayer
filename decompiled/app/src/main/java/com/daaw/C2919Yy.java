package com.daaw;

import com.google.firebase.Timestamp;

/* JADX INFO: renamed from: com.daaw.Yy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2919Yy extends AbstractC9688xm0 {
    public C2919Yy(TC tc, C6669my0 c6669my0) {
        super(tc, c6669my0);
    }

    @Override // com.daaw.AbstractC9688xm0
    public C5642jK a(C4083dm0 c4083dm0, C5642jK c5642jK, Timestamp timestamp) {
        n(c4083dm0);
        if (!h().e(c4083dm0)) {
            return c5642jK;
        }
        c4083dm0.m(c4083dm0.k()).u();
        return null;
    }

    @Override // com.daaw.AbstractC9688xm0
    public void b(C4083dm0 c4083dm0, C0448Bm0 c0448Bm0) {
        n(c4083dm0);
        AbstractC6557mb.d(c0448Bm0.a().isEmpty(), "Transform results received by DeleteMutation.", new Object[0]);
        c4083dm0.m(c0448Bm0.b()).t();
    }

    @Override // com.daaw.AbstractC9688xm0
    public C5642jK e() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2919Yy.class != obj.getClass()) {
            return false;
        }
        return i((C2919Yy) obj);
    }

    public int hashCode() {
        return j();
    }

    public String toString() {
        return "DeleteMutation{" + k() + "}";
    }
}
