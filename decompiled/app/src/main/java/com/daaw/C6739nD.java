package com.daaw;

/* JADX INFO: renamed from: com.daaw.nD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6739nD implements InterfaceC3281at {
    public final float a;

    public /* synthetic */ C6739nD(float f, AbstractC2911Yw abstractC2911Yw) {
        this(f);
    }

    @Override // com.daaw.InterfaceC3281at
    public float a(long j, InterfaceC4988gz interfaceC4988gz) {
        G10.g(interfaceC4988gz, "density");
        return interfaceC4988gz.O(this.a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C6739nD) && C6460mD.n(this.a, ((C6739nD) obj).a);
    }

    public int hashCode() {
        return C6460mD.o(this.a);
    }

    public String toString() {
        return "CornerSize(size = " + this.a + ".dp)";
    }

    public C6739nD(float f) {
        this.a = f;
    }
}
