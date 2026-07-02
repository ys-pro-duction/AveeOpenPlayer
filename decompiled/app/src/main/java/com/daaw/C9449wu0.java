package com.daaw;

import com.daaw.AbstractC0304Ac0;

/* JADX INFO: renamed from: com.daaw.wu0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9449wu0 extends AbstractC0304Ac0.f {
    public final C1168Ii a;
    public final C2756Xj0 b;
    public final C6882nk0 c;

    public C9449wu0(C6882nk0 c6882nk0, C2756Xj0 c2756Xj0, C1168Ii c1168Ii) {
        this.c = (C6882nk0) AbstractC7785qy0.o(c6882nk0, "method");
        this.b = (C2756Xj0) AbstractC7785qy0.o(c2756Xj0, "headers");
        this.a = (C1168Ii) AbstractC7785qy0.o(c1168Ii, "callOptions");
    }

    @Override // com.daaw.AbstractC0304Ac0.f
    public C1168Ii a() {
        return this.a;
    }

    @Override // com.daaw.AbstractC0304Ac0.f
    public C2756Xj0 b() {
        return this.b;
    }

    @Override // com.daaw.AbstractC0304Ac0.f
    public C6882nk0 c() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C9449wu0.class == obj.getClass()) {
            C9449wu0 c9449wu0 = (C9449wu0) obj;
            if (AbstractC8301sp0.a(this.a, c9449wu0.a) && AbstractC8301sp0.a(this.b, c9449wu0.b) && AbstractC8301sp0.a(this.c, c9449wu0.c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return AbstractC8301sp0.b(this.a, this.b, this.c);
    }

    public final String toString() {
        return "[method=" + this.c + " headers=" + this.b + " callOptions=" + this.a + "]";
    }
}
