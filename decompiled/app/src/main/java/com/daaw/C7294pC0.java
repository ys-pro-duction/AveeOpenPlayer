package com.daaw;

/* JADX INFO: renamed from: com.daaw.pC0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7294pC0 {
    public final String a;

    /* JADX INFO: renamed from: com.daaw.pC0$a */
    public static class a {
        public String a;

        public /* synthetic */ a(AbstractC0414Bd2 abstractC0414Bd2) {
        }

        public C7294pC0 a() {
            if (this.a != null) {
                return new C7294pC0(this, null);
            }
            throw new IllegalArgumentException("Product type must be set");
        }

        public a b(String str) {
            this.a = str;
            return this;
        }
    }

    public /* synthetic */ C7294pC0(a aVar, AbstractC5170he2 abstractC5170he2) {
        this.a = aVar.a;
    }

    public static a a() {
        return new a(null);
    }

    public final String b() {
        return this.a;
    }
}
