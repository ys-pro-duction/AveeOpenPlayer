package com.daaw;

/* JADX INFO: renamed from: com.daaw.pr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7474pr {
    public String a;

    /* JADX INFO: renamed from: com.daaw.pr$a */
    public static final class a {
        public String a;

        public /* synthetic */ a(OV1 ov1) {
        }

        public C7474pr a() {
            String str = this.a;
            if (str == null) {
                throw new IllegalArgumentException("Purchase token must be set");
            }
            C7474pr c7474pr = new C7474pr(null);
            c7474pr.a = str;
            return c7474pr;
        }

        public a b(String str) {
            this.a = str;
            return this;
        }
    }

    public /* synthetic */ C7474pr(AbstractC8769uW1 abstractC8769uW1) {
    }

    public static a b() {
        return new a(null);
    }

    public String a() {
        return this.a;
    }
}
