package com.daaw;

/* JADX INFO: renamed from: com.daaw.my0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6669my0 {
    public static final C6669my0 c = new C6669my0(null, null);
    public final CU0 a;
    public final Boolean b;

    public C6669my0(CU0 cu0, Boolean bool) {
        AbstractC6557mb.d(cu0 == null || bool == null, "Precondition can specify \"exists\" or \"updateTime\" but not both", new Object[0]);
        this.a = cu0;
        this.b = bool;
    }

    public static C6669my0 a(boolean z) {
        return new C6669my0(null, Boolean.valueOf(z));
    }

    public static C6669my0 f(CU0 cu0) {
        return new C6669my0(cu0, null);
    }

    public Boolean b() {
        return this.b;
    }

    public CU0 c() {
        return this.a;
    }

    public boolean d() {
        return this.a == null && this.b == null;
    }

    public boolean e(C4083dm0 c4083dm0) {
        if (this.a != null) {
            return c4083dm0.b() && c4083dm0.k().equals(this.a);
        }
        Boolean bool = this.b;
        if (bool != null) {
            return bool.booleanValue() == c4083dm0.b();
        }
        AbstractC6557mb.d(d(), "Precondition should be empty", new Object[0]);
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C6669my0.class == obj.getClass()) {
            C6669my0 c6669my0 = (C6669my0) obj;
            CU0 cu0 = this.a;
            if (cu0 == null ? c6669my0.a != null : !cu0.equals(c6669my0.a)) {
                return false;
            }
            Boolean bool = this.b;
            Boolean bool2 = c6669my0.b;
            if (bool != null) {
                return bool.equals(bool2);
            }
            if (bool2 == null) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        CU0 cu0 = this.a;
        int iHashCode = (cu0 != null ? cu0.hashCode() : 0) * 31;
        Boolean bool = this.b;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        if (d()) {
            return "Precondition{<none>}";
        }
        if (this.a != null) {
            return "Precondition{updateTime=" + this.a + "}";
        }
        if (this.b == null) {
            throw AbstractC6557mb.a("Invalid Precondition", new Object[0]);
        }
        return "Precondition{exists=" + this.b + "}";
    }
}
