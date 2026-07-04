package com.daaw;

import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.nP0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6788nP0 implements CP0, Iterable, InterfaceC9783y60 {
    public final Map B = new LinkedHashMap();
    public boolean C;
    public boolean D;

    public final boolean D() {
        return this.D;
    }

    public final boolean E() {
        return this.C;
    }

    public final void F(C6788nP0 c6788nP0) {
        G10.g(c6788nP0, "child");
        for (Map.Entry entry : c6788nP0.B.entrySet()) {
            BP0 bp0 = (BP0) entry.getKey();
            Object objB = bp0.b(this.B.get(bp0), entry.getValue());
            if (objB != null) {
                this.B.put(bp0, objB);
            }
        }
    }

    public final void G(boolean z) {
        this.D = z;
    }

    public final void H(boolean z) {
        this.C = z;
    }

    @Override // com.daaw.CP0
    public void e(BP0 bp0, Object obj) {
        G10.g(bp0, SubscriberAttributeKt.JSON_NAME_KEY);
        this.B.put(bp0, obj);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6788nP0)) {
            return false;
        }
        C6788nP0 c6788nP0 = (C6788nP0) obj;
        return G10.c(this.B, c6788nP0.B) && this.C == c6788nP0.C && this.D == c6788nP0.D;
    }

    public int hashCode() {
        return (((this.B.hashCode() * 31) + AbstractC8813ug.a(this.C)) * 31) + AbstractC8813ug.a(this.D);
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return this.B.entrySet().iterator();
    }

    public final void m(C6788nP0 c6788nP0) {
        G10.g(c6788nP0, "peer");
        if (c6788nP0.C) {
            this.C = true;
        }
        if (c6788nP0.D) {
            this.D = true;
        }
        for (Map.Entry entry : c6788nP0.B.entrySet()) {
            BP0 bp0 = (BP0) entry.getKey();
            Object value = entry.getValue();
            if (!this.B.containsKey(bp0)) {
                this.B.put(bp0, value);
            } else if (value instanceof C4998h1) {
                Object obj = this.B.get(bp0);
                if (obj == null) {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
                }
                C4998h1 c4998h1 = (C4998h1) obj;
                Map map = this.B;
                String strB = c4998h1.b();
                if (strB == null) {
                    strB = ((C4998h1) value).b();
                }
                InterfaceC5390iR interfaceC5390iRA = c4998h1.a();
                if (interfaceC5390iRA == null) {
                    interfaceC5390iRA = ((C4998h1) value).a();
                }
                map.put(bp0, new C4998h1(strB, interfaceC5390iRA));
            } else {
                continue;
            }
        }
    }

    public final boolean p(BP0 bp0) {
        G10.g(bp0, SubscriberAttributeKt.JSON_NAME_KEY);
        return this.B.containsKey(bp0);
    }

    public final C6788nP0 s() {
        C6788nP0 c6788nP0 = new C6788nP0();
        c6788nP0.C = this.C;
        c6788nP0.D = this.D;
        c6788nP0.B.putAll(this.B);
        return c6788nP0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        String str = "";
        if (this.C) {
            sb.append("");
            sb.append("mergeDescendants=true");
            str = ", ";
        }
        if (this.D) {
            sb.append(str);
            sb.append("isClearingSemantics=true");
            str = ", ";
        }
        for (Map.Entry entry : this.B.entrySet()) {
            BP0 bp0 = (BP0) entry.getKey();
            Object value = entry.getValue();
            sb.append(str);
            sb.append(bp0.a());
            sb.append(" : ");
            sb.append(value);
            str = ", ";
        }
        return A40.a(this, null) + "{ " + ((Object) sb) + " }";
    }

    public final Object v(BP0 bp0) {
        G10.g(bp0, SubscriberAttributeKt.JSON_NAME_KEY);
        Object obj = this.B.get(bp0);
        if (obj != null) {
            return obj;
        }
        throw new IllegalStateException("Key not present: " + bp0 + " - consider getOrElse or getOrNull");
    }

    public final Object w(BP0 bp0, LQ lq) {
        G10.g(bp0, SubscriberAttributeKt.JSON_NAME_KEY);
        G10.g(lq, "defaultValue");
        Object obj = this.B.get(bp0);
        return obj == null ? lq.invoke() : obj;
    }

    public final Object y(BP0 bp0, LQ lq) {
        G10.g(bp0, SubscriberAttributeKt.JSON_NAME_KEY);
        G10.g(lq, "defaultValue");
        Object obj = this.B.get(bp0);
        return obj == null ? lq.invoke() : obj;
    }
}
