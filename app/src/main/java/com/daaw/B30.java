package com.daaw;

import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class B30 extends AbstractC6476mH {
    public final C81 d;
    public final F30 e;
    public final boolean f;
    public final boolean g;
    public final Set h;
    public final YS0 i;

    public /* synthetic */ B30(C81 c81, F30 f30, boolean z, boolean z2, Set set, YS0 ys0, int i, AbstractC2911Yw abstractC2911Yw) {
        this(c81, (i & 2) != 0 ? F30.B : f30, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? null : set, (i & 32) != 0 ? null : ys0);
    }

    public static /* synthetic */ B30 f(B30 b30, C81 c81, F30 f30, boolean z, boolean z2, Set set, YS0 ys0, int i, Object obj) {
        if ((i & 1) != 0) {
            c81 = b30.d;
        }
        if ((i & 2) != 0) {
            f30 = b30.e;
        }
        if ((i & 4) != 0) {
            z = b30.f;
        }
        if ((i & 8) != 0) {
            z2 = b30.g;
        }
        if ((i & 16) != 0) {
            set = b30.h;
        }
        if ((i & 32) != 0) {
            ys0 = b30.i;
        }
        Set set2 = set;
        YS0 ys02 = ys0;
        return b30.e(c81, f30, z, z2, set2, ys02);
    }

    @Override // com.daaw.AbstractC6476mH
    public YS0 a() {
        return this.i;
    }

    @Override // com.daaw.AbstractC6476mH
    public C81 b() {
        return this.d;
    }

    @Override // com.daaw.AbstractC6476mH
    public Set c() {
        return this.h;
    }

    public final B30 e(C81 c81, F30 f30, boolean z, boolean z2, Set set, YS0 ys0) {
        G10.g(c81, "howThisTypeIsUsed");
        G10.g(f30, "flexibility");
        return new B30(c81, f30, z, z2, set, ys0);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof B30)) {
            return false;
        }
        B30 b30 = (B30) obj;
        return G10.c(b30.a(), a()) && b30.b() == b() && b30.e == this.e && b30.f == this.f && b30.g == this.g;
    }

    public final F30 g() {
        return this.e;
    }

    public final boolean h() {
        return this.g;
    }

    @Override // com.daaw.AbstractC6476mH
    public int hashCode() {
        YS0 ys0A = a();
        int iHashCode = ys0A != null ? ys0A.hashCode() : 0;
        int iHashCode2 = iHashCode + (iHashCode * 31) + b().hashCode();
        int iHashCode3 = iHashCode2 + (iHashCode2 * 31) + this.e.hashCode();
        int i = iHashCode3 + (iHashCode3 * 31) + (this.f ? 1 : 0);
        return i + (i * 31) + (this.g ? 1 : 0);
    }

    public final boolean i() {
        return this.f;
    }

    public final B30 j(boolean z) {
        return f(this, null, null, z, false, null, null, 59, null);
    }

    public B30 k(YS0 ys0) {
        return f(this, null, null, false, false, null, ys0, 31, null);
    }

    public final B30 l(F30 f30) {
        G10.g(f30, "flexibility");
        return f(this, null, f30, false, false, null, null, 61, null);
    }

    @Override // com.daaw.AbstractC6476mH
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public B30 d(Z71 z71) {
        G10.g(z71, "typeParameter");
        return f(this, null, null, false, false, c() != null ? AbstractC10146zQ0.k(c(), z71) : AbstractC9588xQ0.c(z71), null, 47, null);
    }

    public String toString() {
        return "JavaTypeAttributes(howThisTypeIsUsed=" + this.d + ", flexibility=" + this.e + ", isRaw=" + this.f + ", isForAnnotationParameter=" + this.g + ", visitedTypeParameters=" + this.h + ", defaultType=" + this.i + ')';
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B30(C81 c81, F30 f30, boolean z, boolean z2, Set set, YS0 ys0) {
        super(c81, set, ys0);
        G10.g(c81, "howThisTypeIsUsed");
        G10.g(f30, "flexibility");
        this.d = c81;
        this.e = f30;
        this.f = z;
        this.g = z2;
        this.h = set;
        this.i = ys0;
    }
}
