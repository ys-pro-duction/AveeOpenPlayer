package com.daaw;

import com.daaw.AbstractC5362iK;

/* JADX INFO: renamed from: com.daaw.Vc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2519Vc extends AbstractC5362iK.c {
    public final C6488mK B;
    public final AbstractC5362iK.c.a C;

    public C2519Vc(C6488mK c6488mK, AbstractC5362iK.c.a aVar) {
        if (c6488mK == null) {
            throw new NullPointerException("Null fieldPath");
        }
        this.B = c6488mK;
        if (aVar == null) {
            throw new NullPointerException("Null kind");
        }
        this.C = aVar;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC5362iK.c) {
            AbstractC5362iK.c cVar = (AbstractC5362iK.c) obj;
            if (this.B.equals(cVar.g()) && this.C.equals(cVar.h())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.daaw.AbstractC5362iK.c
    public C6488mK g() {
        return this.B;
    }

    @Override // com.daaw.AbstractC5362iK.c
    public AbstractC5362iK.c.a h() {
        return this.C;
    }

    public int hashCode() {
        return ((this.B.hashCode() ^ 1000003) * 1000003) ^ this.C.hashCode();
    }

    public String toString() {
        return "Segment{fieldPath=" + this.B + ", kind=" + this.C + "}";
    }
}
