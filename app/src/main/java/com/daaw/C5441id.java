package com.daaw;

import java.util.Map;

/* JADX INFO: renamed from: com.daaw.id, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5441id extends AbstractC9018vN0 {
    public final InterfaceC6333lm a;
    public final Map b;

    public C5441id(InterfaceC6333lm interfaceC6333lm, Map map) {
        if (interfaceC6333lm == null) {
            throw new NullPointerException("Null clock");
        }
        this.a = interfaceC6333lm;
        if (map == null) {
            throw new NullPointerException("Null values");
        }
        this.b = map;
    }

    @Override // com.daaw.AbstractC9018vN0
    public InterfaceC6333lm e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC9018vN0) {
            AbstractC9018vN0 abstractC9018vN0 = (AbstractC9018vN0) obj;
            if (this.a.equals(abstractC9018vN0.e()) && this.b.equals(abstractC9018vN0.h())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.daaw.AbstractC9018vN0
    public Map h() {
        return this.b;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public String toString() {
        return "SchedulerConfig{clock=" + this.a + ", values=" + this.b + "}";
    }
}
