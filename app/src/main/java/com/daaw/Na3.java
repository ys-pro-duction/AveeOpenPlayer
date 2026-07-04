package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public final class Na3 extends Ha3 {
    public final Object B;

    public Na3(Object obj) {
        this.B = obj;
    }

    @Override // com.daaw.Ha3
    public final Object a() {
        return this.B;
    }

    @Override // com.daaw.Ha3
    public final boolean b() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Na3) {
            return this.B.equals(((Na3) obj).B);
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
