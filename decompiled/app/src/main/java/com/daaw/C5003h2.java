package com.daaw;

/* JADX INFO: renamed from: com.daaw.h2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5003h2 {
    public String a;

    /* JADX INFO: renamed from: com.daaw.h2$a */
    public static final class a {
        public String a;

        public /* synthetic */ a(AbstractC1082Hm1 abstractC1082Hm1) {
        }

        public C5003h2 a() {
            String str = this.a;
            if (str == null) {
                throw new IllegalArgumentException("Purchase token must be set");
            }
            C5003h2 c5003h2 = new C5003h2(null);
            c5003h2.a = str;
            return c5003h2;
        }

        public a b(String str) {
            this.a = str;
            return this;
        }
    }

    public /* synthetic */ C5003h2(YC1 yc1) {
    }

    public static a b() {
        return new a(null);
    }

    public String a() {
        return this.a;
    }
}
