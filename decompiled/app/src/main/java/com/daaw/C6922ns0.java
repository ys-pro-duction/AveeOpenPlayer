package com.daaw;

/* JADX INFO: renamed from: com.daaw.ns0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6922ns0 implements InterfaceC6643ms0 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public /* synthetic */ C6922ns0(float f, float f2, float f3, float f4, AbstractC2911Yw abstractC2911Yw) {
        this(f, f2, f3, f4);
    }

    @Override // com.daaw.InterfaceC6643ms0
    public float a(EnumC7560q90 enumC7560q90) {
        G10.g(enumC7560q90, "layoutDirection");
        return enumC7560q90 == EnumC7560q90.Ltr ? this.a : this.c;
    }

    @Override // com.daaw.InterfaceC6643ms0
    public float b(EnumC7560q90 enumC7560q90) {
        G10.g(enumC7560q90, "layoutDirection");
        return enumC7560q90 == EnumC7560q90.Ltr ? this.c : this.a;
    }

    @Override // com.daaw.InterfaceC6643ms0
    public float c() {
        return this.d;
    }

    @Override // com.daaw.InterfaceC6643ms0
    public float d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C6922ns0)) {
            return false;
        }
        C6922ns0 c6922ns0 = (C6922ns0) obj;
        return C6460mD.n(this.a, c6922ns0.a) && C6460mD.n(this.b, c6922ns0.b) && C6460mD.n(this.c, c6922ns0.c) && C6460mD.n(this.d, c6922ns0.d);
    }

    public int hashCode() {
        return (((((C6460mD.o(this.a) * 31) + C6460mD.o(this.b)) * 31) + C6460mD.o(this.c)) * 31) + C6460mD.o(this.d);
    }

    public String toString() {
        return "PaddingValues(start=" + ((Object) C6460mD.p(this.a)) + ", top=" + ((Object) C6460mD.p(this.b)) + ", end=" + ((Object) C6460mD.p(this.c)) + ", bottom=" + ((Object) C6460mD.p(this.d)) + ')';
    }

    public C6922ns0(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }
}
