package com.daaw;

/* JADX INFO: renamed from: com.daaw.oC0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7015oC0 {
    public final String a;

    /* JADX INFO: renamed from: com.daaw.oC0$a */
    public static class a {
        public String a;

        public /* synthetic */ a(AbstractC8238sc2 abstractC8238sc2) {
        }

        public C7015oC0 a() {
            if (this.a != null) {
                return new C7015oC0(this, null);
            }
            throw new IllegalArgumentException("Product type must be set");
        }

        public a b(String str) {
            this.a = str;
            return this;
        }
    }

    public /* synthetic */ C7015oC0(a aVar, AbstractC2626Wc2 abstractC2626Wc2) {
        this.a = aVar.a;
    }

    public static a a() {
        return new a(null);
    }

    public final String b() {
        return this.a;
    }
}
