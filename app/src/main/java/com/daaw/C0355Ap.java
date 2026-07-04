package com.daaw;

import android.text.TextUtils;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.Ap, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C0355Ap extends ZK {
    public final List a;
    public final a b;
    public List c;

    /* JADX INFO: renamed from: com.daaw.Ap$a */
    public enum a {
        AND("and"),
        OR("or");

        public final String B;

        a(String str) {
            this.B = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.B;
        }
    }

    public C0355Ap(List list, a aVar) {
        this.a = new ArrayList(list);
        this.b = aVar;
    }

    @Override // com.daaw.ZK
    public String a() {
        StringBuilder sb = new StringBuilder();
        if (l()) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                sb.append(((ZK) it.next()).a());
            }
            return sb.toString();
        }
        sb.append(this.b.toString() + "(");
        sb.append(TextUtils.join(",", this.a));
        sb.append(")");
        return sb.toString();
    }

    @Override // com.daaw.ZK
    public List b() {
        return DesugarCollections.unmodifiableList(this.a);
    }

    @Override // com.daaw.ZK
    public C6488mK c() {
        C4515fK c4515fKG = g(new InterfaceC4832gR() { // from class: com.daaw.zp
            @Override // com.daaw.InterfaceC4832gR
            public final Object apply(Object obj) {
                return Boolean.valueOf(((C4515fK) obj).j());
            }
        });
        if (c4515fKG != null) {
            return c4515fKG.g();
        }
        return null;
    }

    @Override // com.daaw.ZK
    public List d() {
        List list = this.c;
        if (list != null) {
            return DesugarCollections.unmodifiableList(list);
        }
        this.c = new ArrayList();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            this.c.addAll(((ZK) it.next()).d());
        }
        return DesugarCollections.unmodifiableList(this.c);
    }

    @Override // com.daaw.ZK
    public boolean e(LC lc) {
        if (i()) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                if (!((ZK) it.next()).e(lc)) {
                    return false;
                }
            }
            return true;
        }
        Iterator it2 = this.a.iterator();
        while (it2.hasNext()) {
            if (((ZK) it2.next()).e(lc)) {
                return true;
            }
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C0355Ap)) {
            C0355Ap c0355Ap = (C0355Ap) obj;
            if (this.b == c0355Ap.b && this.a.equals(c0355Ap.a)) {
                return true;
            }
        }
        return false;
    }

    public final C4515fK g(InterfaceC4832gR interfaceC4832gR) {
        for (C4515fK c4515fK : d()) {
            if (((Boolean) interfaceC4832gR.apply(c4515fK)).booleanValue()) {
                return c4515fK;
            }
        }
        return null;
    }

    public a h() {
        return this.b;
    }

    public int hashCode() {
        return ((1147 + this.b.hashCode()) * 31) + this.a.hashCode();
    }

    public boolean i() {
        return this.b == a.AND;
    }

    public boolean j() {
        return this.b == a.OR;
    }

    public boolean k() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            if (((ZK) it.next()) instanceof C0355Ap) {
                return false;
            }
        }
        return true;
    }

    public boolean l() {
        return k() && i();
    }

    public C0355Ap m(List list) {
        ArrayList arrayList = new ArrayList(this.a);
        arrayList.addAll(list);
        return new C0355Ap(arrayList, this.b);
    }

    public String toString() {
        return a();
    }
}
