package com.android.billingclient.api;

import com.daaw.AbstractC0506Ca2;
import com.daaw.AbstractC1558Mb2;
import com.daaw.AbstractC5155hb2;
import com.daaw.AbstractC9714xr1;
import com.daaw.W92;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class g {
    public final AbstractC9714xr1 a;

    public static class a {
        public AbstractC9714xr1 a;

        public /* synthetic */ a(W92 w92) {
        }

        public g a() {
            return new g(this, null);
        }

        public a b(List list) {
            if (list == null || list.isEmpty()) {
                throw new IllegalArgumentException("Product list cannot be empty.");
            }
            HashSet hashSet = new HashSet();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                b bVar = (b) it.next();
                if (!"play_pass_subs".equals(bVar.c())) {
                    hashSet.add(bVar.c());
                }
            }
            if (hashSet.size() > 1) {
                throw new IllegalArgumentException("All products should be of the same product type.");
            }
            this.a = AbstractC9714xr1.G(list);
            return this;
        }
    }

    public static class b {
        public final String a;
        public final String b;

        public static class a {
            public String a;
            public String b;

            public /* synthetic */ a(AbstractC0506Ca2 abstractC0506Ca2) {
            }

            public b a() {
                if ("first_party".equals(this.b)) {
                    throw new IllegalArgumentException("Serialized doc id must be provided for first party products.");
                }
                if (this.a == null) {
                    throw new IllegalArgumentException("Product id must be provided.");
                }
                if (this.b != null) {
                    return new b(this, null);
                }
                throw new IllegalArgumentException("Product type must be provided.");
            }

            public a b(String str) {
                this.a = str;
                return this;
            }

            public a c(String str) {
                this.b = str;
                return this;
            }
        }

        public /* synthetic */ b(a aVar, AbstractC5155hb2 abstractC5155hb2) {
            this.a = aVar.a;
            this.b = aVar.b;
        }

        public static a a() {
            return new a(null);
        }

        public final String b() {
            return this.a;
        }

        public final String c() {
            return this.b;
        }
    }

    public /* synthetic */ g(a aVar, AbstractC1558Mb2 abstractC1558Mb2) {
        this.a = aVar.a;
    }

    public static a a() {
        return new a(null);
    }

    public final AbstractC9714xr1 b() {
        return this.a;
    }

    public final String c() {
        return ((b) this.a.get(0)).c();
    }
}
