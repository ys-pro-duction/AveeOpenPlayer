package com.android.billingclient.api;

import android.text.TextUtils;
import com.android.billingclient.api.f;
import com.daaw.AP1;
import com.daaw.AbstractC1601Mm1;
import com.daaw.AbstractC4262eQ1;
import com.daaw.AbstractC5951kR1;
import com.daaw.AbstractC6314li0;
import com.daaw.AbstractC9714xr1;
import com.daaw.HQ1;
import com.daaw.LS1;
import com.daaw.PR1;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class c {
    public boolean a;
    public String b;
    public String c;
    public C0042c d;
    public AbstractC9714xr1 e;
    public ArrayList f;
    public boolean g;

    public static class a {
        public String a;
        public String b;
        public List c;
        public ArrayList d;
        public boolean e;
        public C0042c.a f;

        public /* synthetic */ a(AP1 ap1) {
            C0042c.a aVarA = C0042c.a();
            C0042c.a.e(aVarA);
            this.f = aVarA;
        }

        public c a() {
            ArrayList arrayList = this.d;
            boolean z = (arrayList == null || arrayList.isEmpty()) ? false : true;
            List list = this.c;
            boolean z2 = (list == null || list.isEmpty()) ? false : true;
            if (!z && !z2) {
                throw new IllegalArgumentException("Details of the products must be provided.");
            }
            if (z && z2) {
                throw new IllegalArgumentException("Set SkuDetails or ProductDetailsParams, not both.");
            }
            LS1 ls1 = null;
            if (!z) {
                b bVar = (b) this.c.get(0);
                for (int i = 0; i < this.c.size(); i++) {
                    b bVar2 = (b) this.c.get(i);
                    if (bVar2 == null) {
                        throw new IllegalArgumentException("ProductDetailsParams cannot be null.");
                    }
                    if (i != 0 && !bVar2.b().d().equals(bVar.b().d()) && !bVar2.b().d().equals("play_pass_subs")) {
                        throw new IllegalArgumentException("All products should have same ProductType.");
                    }
                }
                String strG = bVar.b().g();
                for (b bVar3 : this.c) {
                    if (!bVar.b().d().equals("play_pass_subs") && !bVar3.b().d().equals("play_pass_subs") && !strG.equals(bVar3.b().g())) {
                        throw new IllegalArgumentException("All products must have the same package name.");
                    }
                }
            } else {
                if (this.d.contains(null)) {
                    throw new IllegalArgumentException("SKU cannot be null.");
                }
                if (this.d.size() > 1) {
                    AbstractC6314li0.a(this.d.get(0));
                    throw null;
                }
            }
            c cVar = new c(ls1);
            if (z) {
                AbstractC6314li0.a(this.d.get(0));
                throw null;
            }
            cVar.a = z2 && !((b) this.c.get(0)).b().g().isEmpty();
            cVar.b = this.a;
            cVar.c = this.b;
            cVar.d = this.f.a();
            ArrayList arrayList2 = this.d;
            cVar.f = arrayList2 != null ? new ArrayList(arrayList2) : new ArrayList();
            cVar.g = this.e;
            List list2 = this.c;
            cVar.e = list2 != null ? AbstractC9714xr1.G(list2) : AbstractC9714xr1.H();
            return cVar;
        }

        public a b(boolean z) {
            this.e = z;
            return this;
        }

        public a c(String str) {
            this.a = str;
            return this;
        }

        public a d(List list) {
            this.c = new ArrayList(list);
            return this;
        }

        public a e(C0042c c0042c) {
            this.f = C0042c.c(c0042c);
            return this;
        }
    }

    public static final class b {
        public final f a;
        public final String b;

        public static class a {
            public f a;
            public String b;

            public /* synthetic */ a(AbstractC4262eQ1 abstractC4262eQ1) {
            }

            public b a() {
                AbstractC1601Mm1.c(this.a, "ProductDetails is required for constructing ProductDetailsParams.");
                if (this.a.e() != null) {
                    AbstractC1601Mm1.c(this.b, "offerToken is required for constructing ProductDetailsParams for subscriptions.");
                }
                return new b(this, null);
            }

            public a b(String str) {
                if (TextUtils.isEmpty(str)) {
                    throw new IllegalArgumentException("offerToken can not be empty");
                }
                this.b = str;
                return this;
            }

            public a c(f fVar) {
                this.a = fVar;
                if (fVar.b() != null) {
                    fVar.b().getClass();
                    f.b bVarB = fVar.b();
                    if (bVarB.d() != null) {
                        this.b = bVarB.d();
                    }
                }
                return this;
            }
        }

        public /* synthetic */ b(a aVar, HQ1 hq1) {
            this.a = aVar.a;
            this.b = aVar.b;
        }

        public static a a() {
            return new a(null);
        }

        public final f b() {
            return this.a;
        }

        public final String c() {
            return this.b;
        }
    }

    /* JADX INFO: renamed from: com.android.billingclient.api.c$c, reason: collision with other inner class name */
    public static class C0042c {
        public String a;
        public String b;
        public int c = 0;

        /* JADX INFO: renamed from: com.android.billingclient.api.c$c$a */
        public static class a {
            public String a;
            public String b;
            public boolean c;
            public int d = 0;

            public /* synthetic */ a(AbstractC5951kR1 abstractC5951kR1) {
            }

            public static /* synthetic */ a e(a aVar) {
                aVar.c = true;
                return aVar;
            }

            public C0042c a() {
                boolean z = true;
                PR1 pr1 = null;
                if (TextUtils.isEmpty(this.a) && TextUtils.isEmpty(null)) {
                    z = false;
                }
                boolean zIsEmpty = TextUtils.isEmpty(this.b);
                if (z && !zIsEmpty) {
                    throw new IllegalArgumentException("Please provide Old SKU purchase information(token/id) or original external transaction id, not both.");
                }
                if (!this.c && !z && zIsEmpty) {
                    throw new IllegalArgumentException("Old SKU purchase information(token/id) or original external transaction id must be provided.");
                }
                C0042c c0042c = new C0042c(pr1);
                c0042c.a = this.a;
                c0042c.c = this.d;
                c0042c.b = this.b;
                return c0042c;
            }

            public a b(String str) {
                this.a = str;
                return this;
            }

            public a c(String str) {
                this.b = str;
                return this;
            }

            public a d(int i) {
                this.d = i;
                return this;
            }

            public final a f(String str) {
                this.a = str;
                return this;
            }
        }

        public /* synthetic */ C0042c(PR1 pr1) {
        }

        public static a a() {
            return new a(null);
        }

        public static /* bridge */ /* synthetic */ a c(C0042c c0042c) {
            a aVarA = a();
            aVarA.f(c0042c.a);
            aVarA.d(c0042c.c);
            aVarA.c(c0042c.b);
            return aVarA;
        }

        public final int b() {
            return this.c;
        }

        public final String d() {
            return this.a;
        }

        public final String e() {
            return this.b;
        }
    }

    public /* synthetic */ c(LS1 ls1) {
    }

    public static a a() {
        return new a(null);
    }

    public final int b() {
        return this.d.b();
    }

    public final String c() {
        return this.b;
    }

    public final String d() {
        return this.c;
    }

    public final String e() {
        return this.d.d();
    }

    public final String f() {
        return this.d.e();
    }

    public final ArrayList g() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f);
        return arrayList;
    }

    public final List h() {
        return this.e;
    }

    public final boolean p() {
        return this.g;
    }

    public final boolean q() {
        return (this.b == null && this.c == null && this.d.e() == null && this.d.b() == 0 && !this.a && !this.g) ? false : true;
    }
}
