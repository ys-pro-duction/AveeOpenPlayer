package com.daaw;

import com.google.firebase.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.uQ0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8744uQ0 extends AbstractC9688xm0 {
    public final C7465pp0 d;

    public C8744uQ0(TC tc, C7465pp0 c7465pp0, C6669my0 c6669my0) {
        this(tc, c7465pp0, c6669my0, new ArrayList());
    }

    @Override // com.daaw.AbstractC9688xm0
    public C5642jK a(C4083dm0 c4083dm0, C5642jK c5642jK, Timestamp timestamp) {
        n(c4083dm0);
        if (!h().e(c4083dm0)) {
            return c5642jK;
        }
        Map mapL = l(timestamp, c4083dm0);
        C7465pp0 c7465pp0Clone = this.d.clone();
        c7465pp0Clone.m(mapL);
        c4083dm0.l(c4083dm0.k(), c7465pp0Clone).u();
        return null;
    }

    @Override // com.daaw.AbstractC9688xm0
    public void b(C4083dm0 c4083dm0, C0448Bm0 c0448Bm0) {
        n(c4083dm0);
        C7465pp0 c7465pp0Clone = this.d.clone();
        c7465pp0Clone.m(m(c4083dm0, c0448Bm0.a()));
        c4083dm0.l(c0448Bm0.b(), c7465pp0Clone).t();
    }

    @Override // com.daaw.AbstractC9688xm0
    public C5642jK e() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C8744uQ0.class == obj.getClass()) {
            C8744uQ0 c8744uQ0 = (C8744uQ0) obj;
            if (i(c8744uQ0) && this.d.equals(c8744uQ0.d) && f().equals(c8744uQ0.f())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (j() * 31) + this.d.hashCode();
    }

    public C7465pp0 o() {
        return this.d;
    }

    public String toString() {
        return "SetMutation{" + k() + ", value=" + this.d + "}";
    }

    public C8744uQ0(TC tc, C7465pp0 c7465pp0, C6669my0 c6669my0, List list) {
        super(tc, c6669my0, list);
        this.d = c7465pp0;
    }
}
