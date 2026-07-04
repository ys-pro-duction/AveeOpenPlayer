package com.daaw;

/* JADX INFO: renamed from: com.daaw.Kq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1408Kq {
    public final EnumC1304Jq a;
    public final C6262lX0 b;

    public C1408Kq(EnumC1304Jq enumC1304Jq, C6262lX0 c6262lX0) {
        this.a = (EnumC1304Jq) AbstractC7785qy0.o(enumC1304Jq, "state is null");
        this.b = (C6262lX0) AbstractC7785qy0.o(c6262lX0, "status is null");
    }

    public static C1408Kq a(EnumC1304Jq enumC1304Jq) {
        AbstractC7785qy0.e(enumC1304Jq != EnumC1304Jq.TRANSIENT_FAILURE, "state is TRANSIENT_ERROR. Use forError() instead");
        return new C1408Kq(enumC1304Jq, C6262lX0.f);
    }

    public static C1408Kq b(C6262lX0 c6262lX0) {
        AbstractC7785qy0.e(!c6262lX0.o(), "The error status must not be OK");
        return new C1408Kq(EnumC1304Jq.TRANSIENT_FAILURE, c6262lX0);
    }

    public EnumC1304Jq c() {
        return this.a;
    }

    public C6262lX0 d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C1408Kq)) {
            return false;
        }
        C1408Kq c1408Kq = (C1408Kq) obj;
        return this.a.equals(c1408Kq.a) && this.b.equals(c1408Kq.b);
    }

    public int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    public String toString() {
        if (this.b.o()) {
            return this.a.toString();
        }
        return this.a + "(" + this.b + ")";
    }
}
