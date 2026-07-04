package com.daaw;

import java.io.Serializable;

/* JADX INFO: renamed from: com.daaw.Zh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2955Zh extends AbstractC5511ir0 implements Serializable {
    public final InterfaceC4264eR B;
    public final AbstractC5511ir0 C;

    public C2955Zh(InterfaceC4264eR interfaceC4264eR, AbstractC5511ir0 abstractC5511ir0) {
        this.B = (InterfaceC4264eR) AbstractC7785qy0.n(interfaceC4264eR);
        this.C = (AbstractC5511ir0) AbstractC7785qy0.n(abstractC5511ir0);
    }

    @Override // com.daaw.AbstractC5511ir0, java.util.Comparator
    public int compare(Object obj, Object obj2) {
        return this.C.compare(this.B.apply(obj), this.B.apply(obj2));
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C2955Zh) {
            C2955Zh c2955Zh = (C2955Zh) obj;
            if (this.B.equals(c2955Zh.B) && this.C.equals(c2955Zh.C)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return AbstractC8301sp0.b(this.B, this.C);
    }

    public String toString() {
        String strValueOf = String.valueOf(this.C);
        String strValueOf2 = String.valueOf(this.B);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 13 + strValueOf2.length());
        sb.append(strValueOf);
        sb.append(".onResultOf(");
        sb.append(strValueOf2);
        sb.append(")");
        return sb.toString();
    }
}
