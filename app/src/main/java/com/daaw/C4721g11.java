package com.daaw;

/* JADX INFO: renamed from: com.daaw.g11, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4721g11 {
    public final AbstractC4340ei a;
    public final boolean b;
    public final UY c;
    public final UY d;
    public final UY e;

    public C4721g11(AbstractC4340ei abstractC4340ei, boolean z, UY uy, UY uy2, UY uy3) {
        this.a = abstractC4340ei;
        this.b = z;
        this.c = uy;
        this.d = uy2;
        this.e = uy3;
    }

    public static C4721g11 a(boolean z, AbstractC4340ei abstractC4340ei) {
        return new C4721g11(abstractC4340ei, z, TC.h(), TC.h(), TC.h());
    }

    public UY b() {
        return this.c;
    }

    public UY c() {
        return this.d;
    }

    public UY d() {
        return this.e;
    }

    public AbstractC4340ei e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4721g11.class != obj.getClass()) {
            return false;
        }
        C4721g11 c4721g11 = (C4721g11) obj;
        if (this.b == c4721g11.b && this.a.equals(c4721g11.a) && this.c.equals(c4721g11.c) && this.d.equals(c4721g11.d)) {
            return this.e.equals(c4721g11.e);
        }
        return false;
    }

    public boolean f() {
        return this.b;
    }

    public int hashCode() {
        return (((((((this.a.hashCode() * 31) + (this.b ? 1 : 0)) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
    }
}
