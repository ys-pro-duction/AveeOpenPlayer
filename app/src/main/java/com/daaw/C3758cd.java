package com.daaw;

import com.daaw.AbstractC1045Hd0;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.cd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3758cd extends AbstractC1045Hd0 {
    public final long a;
    public final long b;
    public final AbstractC2137Rl c;
    public final Integer d;
    public final String e;
    public final List f;
    public final EnumC3927dC0 g;

    /* JADX INFO: renamed from: com.daaw.cd$b */
    public static final class b extends AbstractC1045Hd0.a {
        public Long a;
        public Long b;
        public AbstractC2137Rl c;
        public Integer d;
        public String e;
        public List f;
        public EnumC3927dC0 g;

        @Override // com.daaw.AbstractC1045Hd0.a
        public AbstractC1045Hd0 a() {
            String str = "";
            if (this.a == null) {
                str = " requestTimeMs";
            }
            if (this.b == null) {
                str = str + " requestUptimeMs";
            }
            if (str.isEmpty()) {
                return new C3758cd(this.a.longValue(), this.b.longValue(), this.c, this.d, this.e, this.f, this.g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.daaw.AbstractC1045Hd0.a
        public AbstractC1045Hd0.a b(AbstractC2137Rl abstractC2137Rl) {
            this.c = abstractC2137Rl;
            return this;
        }

        @Override // com.daaw.AbstractC1045Hd0.a
        public AbstractC1045Hd0.a c(List list) {
            this.f = list;
            return this;
        }

        @Override // com.daaw.AbstractC1045Hd0.a
        public AbstractC1045Hd0.a d(Integer num) {
            this.d = num;
            return this;
        }

        @Override // com.daaw.AbstractC1045Hd0.a
        public AbstractC1045Hd0.a e(String str) {
            this.e = str;
            return this;
        }

        @Override // com.daaw.AbstractC1045Hd0.a
        public AbstractC1045Hd0.a f(EnumC3927dC0 enumC3927dC0) {
            this.g = enumC3927dC0;
            return this;
        }

        @Override // com.daaw.AbstractC1045Hd0.a
        public AbstractC1045Hd0.a g(long j) {
            this.a = Long.valueOf(j);
            return this;
        }

        @Override // com.daaw.AbstractC1045Hd0.a
        public AbstractC1045Hd0.a h(long j) {
            this.b = Long.valueOf(j);
            return this;
        }
    }

    @Override // com.daaw.AbstractC1045Hd0
    public AbstractC2137Rl b() {
        return this.c;
    }

    @Override // com.daaw.AbstractC1045Hd0
    public List c() {
        return this.f;
    }

    @Override // com.daaw.AbstractC1045Hd0
    public Integer d() {
        return this.d;
    }

    @Override // com.daaw.AbstractC1045Hd0
    public String e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        AbstractC2137Rl abstractC2137Rl;
        Integer num;
        String str;
        List list;
        EnumC3927dC0 enumC3927dC0;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC1045Hd0) {
            AbstractC1045Hd0 abstractC1045Hd0 = (AbstractC1045Hd0) obj;
            if (this.a == abstractC1045Hd0.g() && this.b == abstractC1045Hd0.h() && ((abstractC2137Rl = this.c) != null ? abstractC2137Rl.equals(abstractC1045Hd0.b()) : abstractC1045Hd0.b() == null) && ((num = this.d) != null ? num.equals(abstractC1045Hd0.d()) : abstractC1045Hd0.d() == null) && ((str = this.e) != null ? str.equals(abstractC1045Hd0.e()) : abstractC1045Hd0.e() == null) && ((list = this.f) != null ? list.equals(abstractC1045Hd0.c()) : abstractC1045Hd0.c() == null) && ((enumC3927dC0 = this.g) != null ? enumC3927dC0.equals(abstractC1045Hd0.f()) : abstractC1045Hd0.f() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.daaw.AbstractC1045Hd0
    public EnumC3927dC0 f() {
        return this.g;
    }

    @Override // com.daaw.AbstractC1045Hd0
    public long g() {
        return this.a;
    }

    @Override // com.daaw.AbstractC1045Hd0
    public long h() {
        return this.b;
    }

    public int hashCode() {
        long j = this.a;
        long j2 = this.b;
        int i = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        AbstractC2137Rl abstractC2137Rl = this.c;
        int iHashCode = (i ^ (abstractC2137Rl == null ? 0 : abstractC2137Rl.hashCode())) * 1000003;
        Integer num = this.d;
        int iHashCode2 = (iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.e;
        int iHashCode3 = (iHashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List list = this.f;
        int iHashCode4 = (iHashCode3 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        EnumC3927dC0 enumC3927dC0 = this.g;
        return iHashCode4 ^ (enumC3927dC0 != null ? enumC3927dC0.hashCode() : 0);
    }

    public String toString() {
        return "LogRequest{requestTimeMs=" + this.a + ", requestUptimeMs=" + this.b + ", clientInfo=" + this.c + ", logSource=" + this.d + ", logSourceName=" + this.e + ", logEvents=" + this.f + ", qosTier=" + this.g + "}";
    }

    public C3758cd(long j, long j2, AbstractC2137Rl abstractC2137Rl, Integer num, String str, List list, EnumC3927dC0 enumC3927dC0) {
        this.a = j;
        this.b = j2;
        this.c = abstractC2137Rl;
        this.d = num;
        this.e = str;
        this.f = list;
        this.g = enumC3927dC0;
    }
}
