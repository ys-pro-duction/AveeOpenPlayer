package com.daaw;

import com.daaw.AbstractC5362iK;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.Sc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2205Sc extends AbstractC5362iK {
    public final int c;
    public final String d;
    public final List e;
    public final AbstractC5362iK.b f;

    public C2205Sc(int i, String str, List list, AbstractC5362iK.b bVar) {
        this.c = i;
        if (str == null) {
            throw new NullPointerException("Null collectionGroup");
        }
        this.d = str;
        if (list == null) {
            throw new NullPointerException("Null segments");
        }
        this.e = list;
        if (bVar == null) {
            throw new NullPointerException("Null indexState");
        }
        this.f = bVar;
    }

    @Override // com.daaw.AbstractC5362iK
    public String d() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC5362iK) {
            AbstractC5362iK abstractC5362iK = (AbstractC5362iK) obj;
            if (this.c == abstractC5362iK.f() && this.d.equals(abstractC5362iK.d()) && this.e.equals(abstractC5362iK.h()) && this.f.equals(abstractC5362iK.g())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.daaw.AbstractC5362iK
    public int f() {
        return this.c;
    }

    @Override // com.daaw.AbstractC5362iK
    public AbstractC5362iK.b g() {
        return this.f;
    }

    @Override // com.daaw.AbstractC5362iK
    public List h() {
        return this.e;
    }

    public int hashCode() {
        return ((((((this.c ^ 1000003) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode();
    }

    public String toString() {
        return "FieldIndex{indexId=" + this.c + ", collectionGroup=" + this.d + ", segments=" + this.e + ", indexState=" + this.f + "}";
    }
}
