package com.daaw;

/* JADX INFO: renamed from: com.daaw.bp0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3541bp0 {
    public final EnumC3262ap0 a;
    public final boolean b;

    public C3541bp0(EnumC3262ap0 enumC3262ap0, boolean z) {
        G10.g(enumC3262ap0, "qualifier");
        this.a = enumC3262ap0;
        this.b = z;
    }

    public static /* synthetic */ C3541bp0 b(C3541bp0 c3541bp0, EnumC3262ap0 enumC3262ap0, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            enumC3262ap0 = c3541bp0.a;
        }
        if ((i & 2) != 0) {
            z = c3541bp0.b;
        }
        return c3541bp0.a(enumC3262ap0, z);
    }

    public final C3541bp0 a(EnumC3262ap0 enumC3262ap0, boolean z) {
        G10.g(enumC3262ap0, "qualifier");
        return new C3541bp0(enumC3262ap0, z);
    }

    public final EnumC3262ap0 c() {
        return this.a;
    }

    public final boolean d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3541bp0)) {
            return false;
        }
        C3541bp0 c3541bp0 = (C3541bp0) obj;
        return this.a == c3541bp0.a && this.b == c3541bp0.b;
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + AbstractC8813ug.a(this.b);
    }

    public String toString() {
        return "NullabilityQualifierWithMigrationStatus(qualifier=" + this.a + ", isForWarningOnly=" + this.b + ')';
    }

    public /* synthetic */ C3541bp0(EnumC3262ap0 enumC3262ap0, boolean z, int i, AbstractC2911Yw abstractC2911Yw) {
        this(enumC3262ap0, (i & 2) != 0 ? false : z);
    }
}
