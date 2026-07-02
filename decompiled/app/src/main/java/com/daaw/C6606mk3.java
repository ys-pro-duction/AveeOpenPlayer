package com.daaw;

/* JADX INFO: renamed from: com.daaw.mk3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6606mk3 {
    public static final C6606mk3 d = new C5479ik3().d();
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public /* synthetic */ C6606mk3(C5479ik3 c5479ik3, AbstractC6039kk3 abstractC6039kk3) {
        this.a = c5479ik3.a;
        this.b = c5479ik3.b;
        this.c = c5479ik3.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C6606mk3.class == obj.getClass()) {
            C6606mk3 c6606mk3 = (C6606mk3) obj;
            if (this.a == c6606mk3.a && this.b == c6606mk3.b && this.c == c6606mk3.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        boolean z = this.a;
        boolean z2 = this.b;
        return ((z ? 1 : 0) << 2) + (z2 ? 1 : 0) + (z2 ? 1 : 0) + (this.c ? 1 : 0);
    }
}
