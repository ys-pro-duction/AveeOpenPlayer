package com.daaw;

/* JADX INFO: loaded from: classes.dex */
public final class OM implements InterfaceC8367t31 {
    public final float a;

    public /* synthetic */ OM(float f, AbstractC2911Yw abstractC2911Yw) {
        this(f);
    }

    @Override // com.daaw.InterfaceC8367t31
    public float a(InterfaceC4988gz interfaceC4988gz, float f, float f2) {
        G10.g(interfaceC4988gz, "<this>");
        return f + (interfaceC4988gz.O(this.a) * Math.signum(f2 - f));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OM) && C6460mD.n(this.a, ((OM) obj).a);
    }

    public int hashCode() {
        return C6460mD.o(this.a);
    }

    public String toString() {
        return "FixedThreshold(offset=" + ((Object) C6460mD.p(this.a)) + ')';
    }

    public OM(float f) {
        this.a = f;
    }
}
