package com.daaw;

import com.google.firebase.Timestamp;

/* JADX INFO: renamed from: com.daaw.yd1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9923yd1 extends AbstractC9688xm0 {
    public C9923yd1(TC tc, C6669my0 c6669my0) {
        super(tc, c6669my0);
    }

    @Override // com.daaw.AbstractC9688xm0
    public C5642jK a(C4083dm0 c4083dm0, C5642jK c5642jK, Timestamp timestamp) {
        throw AbstractC6557mb.a("VerifyMutation should only be used in Transactions.", new Object[0]);
    }

    @Override // com.daaw.AbstractC9688xm0
    public void b(C4083dm0 c4083dm0, C0448Bm0 c0448Bm0) {
        throw AbstractC6557mb.a("VerifyMutation should only be used in Transactions.", new Object[0]);
    }

    @Override // com.daaw.AbstractC9688xm0
    public C5642jK e() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C9923yd1.class != obj.getClass()) {
            return false;
        }
        return i((C9923yd1) obj);
    }

    public int hashCode() {
        return j();
    }

    public String toString() {
        return "VerifyMutation{" + k() + "}";
    }
}
