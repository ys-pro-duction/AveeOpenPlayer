package com.daaw;

/* JADX INFO: loaded from: classes.dex */
public final class PB {
    public final boolean a;
    public final boolean b;
    public final EnumC9580xO0 c;
    public final boolean d;

    public PB(boolean z, boolean z2, EnumC9580xO0 enumC9580xO0, boolean z3) {
        G10.g(enumC9580xO0, "securePolicy");
        this.a = z;
        this.b = z2;
        this.c = enumC9580xO0;
        this.d = z3;
    }

    public final boolean a() {
        return this.a;
    }

    public final boolean b() {
        return this.b;
    }

    public final EnumC9580xO0 c() {
        return this.c;
    }

    public final boolean d() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PB)) {
            return false;
        }
        PB pb = (PB) obj;
        return this.a == pb.a && this.b == pb.b && this.c == pb.c && this.d == pb.d;
    }

    public int hashCode() {
        return (((((AbstractC8813ug.a(this.a) * 31) + AbstractC8813ug.a(this.b)) * 31) + this.c.hashCode()) * 31) + AbstractC8813ug.a(this.d);
    }

    public /* synthetic */ PB(boolean z, boolean z2, EnumC9580xO0 enumC9580xO0, boolean z3, int i, AbstractC2911Yw abstractC2911Yw) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? true : z2, (i & 4) != 0 ? EnumC9580xO0.Inherit : enumC9580xO0, (i & 8) != 0 ? true : z3);
    }

    public /* synthetic */ PB(boolean z, boolean z2, EnumC9580xO0 enumC9580xO0, int i, AbstractC2911Yw abstractC2911Yw) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? true : z2, (i & 4) != 0 ? EnumC9580xO0.Inherit : enumC9580xO0);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PB(boolean z, boolean z2, EnumC9580xO0 enumC9580xO0) {
        this(z, z2, enumC9580xO0, true);
        G10.g(enumC9580xO0, "securePolicy");
    }
}
