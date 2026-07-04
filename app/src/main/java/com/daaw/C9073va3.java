package com.daaw;

/* JADX INFO: renamed from: com.daaw.va3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9073va3 extends Ha3 {
    public static final C9073va3 B = new C9073va3();

    @Override // com.daaw.Ha3
    public final Object a() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // com.daaw.Ha3
    public final boolean b() {
        return false;
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return 2040732332;
    }

    public final String toString() {
        return "Optional.absent()";
    }
}
