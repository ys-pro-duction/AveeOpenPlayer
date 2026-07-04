package com.daaw;

/* JADX INFO: renamed from: com.daaw.cl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3798cl {
    public final InterfaceC2664Wm0 a;
    public final C9245wA0 b;
    public final AbstractC1156If c;
    public final RU0 d;

    public C3798cl(InterfaceC2664Wm0 interfaceC2664Wm0, C9245wA0 c9245wA0, AbstractC1156If abstractC1156If, RU0 ru0) {
        G10.g(interfaceC2664Wm0, "nameResolver");
        G10.g(c9245wA0, "classProto");
        G10.g(abstractC1156If, "metadataVersion");
        G10.g(ru0, "sourceElement");
        this.a = interfaceC2664Wm0;
        this.b = c9245wA0;
        this.c = abstractC1156If;
        this.d = ru0;
    }

    public final InterfaceC2664Wm0 a() {
        return this.a;
    }

    public final C9245wA0 b() {
        return this.b;
    }

    public final AbstractC1156If c() {
        return this.c;
    }

    public final RU0 d() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3798cl)) {
            return false;
        }
        C3798cl c3798cl = (C3798cl) obj;
        return G10.c(this.a, c3798cl.a) && G10.c(this.b, c3798cl.b) && G10.c(this.c, c3798cl.c) && G10.c(this.d, c3798cl.d);
    }

    public int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "ClassData(nameResolver=" + this.a + ", classProto=" + this.b + ", metadataVersion=" + this.c + ", sourceElement=" + this.d + ')';
    }
}
