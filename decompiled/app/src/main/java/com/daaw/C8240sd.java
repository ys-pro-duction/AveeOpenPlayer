package com.daaw;

import com.daaw.AbstractC5294i41;

/* JADX INFO: renamed from: com.daaw.sd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8240sd extends AbstractC5294i41 {
    public final String a;
    public final long b;
    public final AbstractC5294i41.b c;

    /* JADX INFO: renamed from: com.daaw.sd$b */
    public static final class b extends AbstractC5294i41.a {
        public String a;
        public Long b;
        public AbstractC5294i41.b c;

        @Override // com.daaw.AbstractC5294i41.a
        public AbstractC5294i41 a() {
            String str = "";
            if (this.b == null) {
                str = " tokenExpirationTimestamp";
            }
            if (str.isEmpty()) {
                return new C8240sd(this.a, this.b.longValue(), this.c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.daaw.AbstractC5294i41.a
        public AbstractC5294i41.a b(AbstractC5294i41.b bVar) {
            this.c = bVar;
            return this;
        }

        @Override // com.daaw.AbstractC5294i41.a
        public AbstractC5294i41.a c(String str) {
            this.a = str;
            return this;
        }

        @Override // com.daaw.AbstractC5294i41.a
        public AbstractC5294i41.a d(long j) {
            this.b = Long.valueOf(j);
            return this;
        }
    }

    @Override // com.daaw.AbstractC5294i41
    public AbstractC5294i41.b b() {
        return this.c;
    }

    @Override // com.daaw.AbstractC5294i41
    public String c() {
        return this.a;
    }

    @Override // com.daaw.AbstractC5294i41
    public long d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        AbstractC5294i41.b bVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC5294i41) {
            AbstractC5294i41 abstractC5294i41 = (AbstractC5294i41) obj;
            String str = this.a;
            if (str != null ? str.equals(abstractC5294i41.c()) : abstractC5294i41.c() == null) {
                if (this.b == abstractC5294i41.d() && ((bVar = this.c) != null ? bVar.equals(abstractC5294i41.b()) : abstractC5294i41.b() == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.a;
        int iHashCode = str == null ? 0 : str.hashCode();
        long j = this.b;
        int i = (((iHashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        AbstractC5294i41.b bVar = this.c;
        return i ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "TokenResult{token=" + this.a + ", tokenExpirationTimestamp=" + this.b + ", responseCode=" + this.c + "}";
    }

    public C8240sd(String str, long j, AbstractC5294i41.b bVar) {
        this.a = str;
        this.b = j;
        this.c = bVar;
    }
}
