package com.daaw;

import com.daaw.AbstractC5362iK;

/* JADX INFO: renamed from: com.daaw.Tc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2311Tc extends AbstractC5362iK.a {
    public final CU0 D;
    public final TC E;
    public final int F;

    public C2311Tc(CU0 cu0, TC tc, int i) {
        if (cu0 == null) {
            throw new NullPointerException("Null readTime");
        }
        this.D = cu0;
        if (tc == null) {
            throw new NullPointerException("Null documentKey");
        }
        this.E = tc;
        this.F = i;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC5362iK.a) {
            AbstractC5362iK.a aVar = (AbstractC5362iK.a) obj;
            if (this.D.equals(aVar.n()) && this.E.equals(aVar.l()) && this.F == aVar.m()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.D.hashCode() ^ 1000003) * 1000003) ^ this.E.hashCode()) * 1000003) ^ this.F;
    }

    @Override // com.daaw.AbstractC5362iK.a
    public TC l() {
        return this.E;
    }

    @Override // com.daaw.AbstractC5362iK.a
    public int m() {
        return this.F;
    }

    @Override // com.daaw.AbstractC5362iK.a
    public CU0 n() {
        return this.D;
    }

    public String toString() {
        return "IndexOffset{readTime=" + this.D + ", documentKey=" + this.E + ", largestBatchId=" + this.F + "}";
    }
}
