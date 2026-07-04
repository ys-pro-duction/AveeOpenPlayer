package com.daaw;

/* JADX INFO: renamed from: com.daaw.ng, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6861ng {
    public InterfaceC5418iY a;
    public InterfaceC6318lj b;
    public C6876nj c;
    public InterfaceC6090kt0 d;

    public C6861ng(InterfaceC5418iY interfaceC5418iY, InterfaceC6318lj interfaceC6318lj, C6876nj c6876nj, InterfaceC6090kt0 interfaceC6090kt0) {
        this.a = interfaceC5418iY;
        this.b = interfaceC6318lj;
        this.c = c6876nj;
        this.d = interfaceC6090kt0;
    }

    public final InterfaceC6090kt0 a() {
        InterfaceC6090kt0 interfaceC6090kt0 = this.d;
        if (interfaceC6090kt0 != null) {
            return interfaceC6090kt0;
        }
        InterfaceC6090kt0 interfaceC6090kt0A = AbstractC6428m6.a();
        this.d = interfaceC6090kt0A;
        return interfaceC6090kt0A;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6861ng)) {
            return false;
        }
        C6861ng c6861ng = (C6861ng) obj;
        return G10.c(this.a, c6861ng.a) && G10.c(this.b, c6861ng.b) && G10.c(this.c, c6861ng.c) && G10.c(this.d, c6861ng.d);
    }

    public int hashCode() {
        InterfaceC5418iY interfaceC5418iY = this.a;
        int iHashCode = (interfaceC5418iY == null ? 0 : interfaceC5418iY.hashCode()) * 31;
        InterfaceC6318lj interfaceC6318lj = this.b;
        int iHashCode2 = (iHashCode + (interfaceC6318lj == null ? 0 : interfaceC6318lj.hashCode())) * 31;
        C6876nj c6876nj = this.c;
        int iHashCode3 = (iHashCode2 + (c6876nj == null ? 0 : c6876nj.hashCode())) * 31;
        InterfaceC6090kt0 interfaceC6090kt0 = this.d;
        return iHashCode3 + (interfaceC6090kt0 != null ? interfaceC6090kt0.hashCode() : 0);
    }

    public String toString() {
        return "BorderCache(imageBitmap=" + this.a + ", canvas=" + this.b + ", canvasDrawScope=" + this.c + ", borderPath=" + this.d + ')';
    }

    public /* synthetic */ C6861ng(InterfaceC5418iY interfaceC5418iY, InterfaceC6318lj interfaceC6318lj, C6876nj c6876nj, InterfaceC6090kt0 interfaceC6090kt0, int i, AbstractC2911Yw abstractC2911Yw) {
        this((i & 1) != 0 ? null : interfaceC5418iY, (i & 2) != 0 ? null : interfaceC6318lj, (i & 4) != 0 ? null : c6876nj, (i & 8) != 0 ? null : interfaceC6090kt0);
    }
}
