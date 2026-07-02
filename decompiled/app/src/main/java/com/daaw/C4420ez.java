package com.daaw;

/* JADX INFO: renamed from: com.daaw.ez, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4420ez {
    public int a;

    public C4420ez(int i) {
        this.a = i;
    }

    public final int a() {
        return this.a;
    }

    public final void b(int i) {
        this.a += i;
    }

    public final void c(int i) {
        this.a = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4420ez) && this.a == ((C4420ez) obj).a;
    }

    public int hashCode() {
        return this.a;
    }

    public String toString() {
        return "DeltaCounter(count=" + this.a + ')';
    }

    public /* synthetic */ C4420ez(int i, int i2, AbstractC2911Yw abstractC2911Yw) {
        this((i2 & 1) != 0 ? 0 : i);
    }
}
