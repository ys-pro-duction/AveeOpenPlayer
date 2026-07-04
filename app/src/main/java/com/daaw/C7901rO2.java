package com.daaw;

/* JADX INFO: renamed from: com.daaw.rO2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7901rO2 extends AbstractC4255eO2 {
    public final Object B;

    public C7901rO2(Object obj) {
        this.B = obj;
    }

    @Override // com.daaw.AbstractC4255eO2
    public final AbstractC4255eO2 a(WN2 wn2) {
        Object objApply = wn2.apply(this.B);
        AbstractC5381iO2.c(objApply, "the Function passed to Optional.transform() must not return null.");
        return new C7901rO2(objApply);
    }

    @Override // com.daaw.AbstractC4255eO2
    public final Object b(Object obj) {
        return this.B;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C7901rO2) {
            return this.B.equals(((C7901rO2) obj).B);
        }
        return false;
    }

    public final int hashCode() {
        return this.B.hashCode() + 1502476572;
    }

    public final String toString() {
        return "Optional.of(" + this.B.toString() + ")";
    }
}
