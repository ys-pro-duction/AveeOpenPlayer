package com.daaw;

import com.daaw.AbstractC3454bX0;

/* JADX INFO: renamed from: com.daaw.md, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6567md extends AbstractC3454bX0 {
    public final AbstractC3454bX0.a a;
    public final AbstractC3454bX0.c b;
    public final AbstractC3454bX0.b c;

    public C6567md(AbstractC3454bX0.a aVar, AbstractC3454bX0.c cVar, AbstractC3454bX0.b bVar) {
        if (aVar == null) {
            throw new NullPointerException("Null appData");
        }
        this.a = aVar;
        if (cVar == null) {
            throw new NullPointerException("Null osData");
        }
        this.b = cVar;
        if (bVar == null) {
            throw new NullPointerException("Null deviceData");
        }
        this.c = bVar;
    }

    @Override // com.daaw.AbstractC3454bX0
    public AbstractC3454bX0.a a() {
        return this.a;
    }

    @Override // com.daaw.AbstractC3454bX0
    public AbstractC3454bX0.b c() {
        return this.c;
    }

    @Override // com.daaw.AbstractC3454bX0
    public AbstractC3454bX0.c d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC3454bX0) {
            AbstractC3454bX0 abstractC3454bX0 = (AbstractC3454bX0) obj;
            if (this.a.equals(abstractC3454bX0.a()) && this.b.equals(abstractC3454bX0.d()) && this.c.equals(abstractC3454bX0.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public String toString() {
        return "StaticSessionData{appData=" + this.a + ", osData=" + this.b + ", deviceData=" + this.c + "}";
    }
}
