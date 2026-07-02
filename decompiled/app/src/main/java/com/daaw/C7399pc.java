package com.daaw;

import com.daaw.AbstractC2137Rl;

/* JADX INFO: renamed from: com.daaw.pc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7399pc extends AbstractC2137Rl {
    public final AbstractC2137Rl.b a;
    public final AbstractC4171e5 b;

    /* JADX INFO: renamed from: com.daaw.pc$b */
    public static final class b extends AbstractC2137Rl.a {
        public AbstractC2137Rl.b a;
        public AbstractC4171e5 b;

        @Override // com.daaw.AbstractC2137Rl.a
        public AbstractC2137Rl a() {
            return new C7399pc(this.a, this.b);
        }

        @Override // com.daaw.AbstractC2137Rl.a
        public AbstractC2137Rl.a b(AbstractC4171e5 abstractC4171e5) {
            this.b = abstractC4171e5;
            return this;
        }

        @Override // com.daaw.AbstractC2137Rl.a
        public AbstractC2137Rl.a c(AbstractC2137Rl.b bVar) {
            this.a = bVar;
            return this;
        }
    }

    @Override // com.daaw.AbstractC2137Rl
    public AbstractC4171e5 b() {
        return this.b;
    }

    @Override // com.daaw.AbstractC2137Rl
    public AbstractC2137Rl.b c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC2137Rl) {
            AbstractC2137Rl abstractC2137Rl = (AbstractC2137Rl) obj;
            AbstractC2137Rl.b bVar = this.a;
            if (bVar != null ? bVar.equals(abstractC2137Rl.c()) : abstractC2137Rl.c() == null) {
                AbstractC4171e5 abstractC4171e5 = this.b;
                if (abstractC4171e5 != null ? abstractC4171e5.equals(abstractC2137Rl.b()) : abstractC2137Rl.b() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        AbstractC2137Rl.b bVar = this.a;
        int iHashCode = ((bVar == null ? 0 : bVar.hashCode()) ^ 1000003) * 1000003;
        AbstractC4171e5 abstractC4171e5 = this.b;
        return iHashCode ^ (abstractC4171e5 != null ? abstractC4171e5.hashCode() : 0);
    }

    public String toString() {
        return "ClientInfo{clientType=" + this.a + ", androidClientInfo=" + this.b + "}";
    }

    public C7399pc(AbstractC2137Rl.b bVar, AbstractC4171e5 abstractC4171e5) {
        this.a = bVar;
        this.b = abstractC4171e5;
    }
}
