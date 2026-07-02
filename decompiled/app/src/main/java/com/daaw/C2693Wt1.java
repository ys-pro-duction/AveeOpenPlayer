package com.daaw;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.Wt1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C2693Wt1 implements InterfaceC1637Mv1, InterfaceC7486pt1 {
    public final Map B = new HashMap();

    public final List a() {
        return new ArrayList(this.B.keySet());
    }

    @Override // com.daaw.InterfaceC7486pt1
    public final InterfaceC1637Mv1 e(String str) {
        return this.B.containsKey(str) ? (InterfaceC1637Mv1) this.B.get(str) : InterfaceC1637Mv1.t;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2693Wt1) {
            return this.B.equals(((C2693Wt1) obj).B);
        }
        return false;
    }

    public final int hashCode() {
        return this.B.hashCode();
    }

    @Override // com.daaw.InterfaceC1637Mv1
    public InterfaceC1637Mv1 m(String str, ES2 es2, List list) {
        return "toString".equals(str) ? new C6391ly1(toString()) : AbstractC4113ds1.a(this, new C6391ly1(str), es2, list);
    }

    @Override // com.daaw.InterfaceC7486pt1
    public final void p(String str, InterfaceC1637Mv1 interfaceC1637Mv1) {
        if (interfaceC1637Mv1 == null) {
            this.B.remove(str);
        } else {
            this.B.put(str, interfaceC1637Mv1);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (!this.B.isEmpty()) {
            for (String str : this.B.keySet()) {
                sb.append(String.format("%s: %s,", str, this.B.get(str)));
            }
            sb.deleteCharAt(sb.lastIndexOf(","));
        }
        sb.append("}");
        return sb.toString();
    }

    @Override // com.daaw.InterfaceC1637Mv1
    public final InterfaceC1637Mv1 zzd() {
        C2693Wt1 c2693Wt1 = new C2693Wt1();
        for (Map.Entry entry : this.B.entrySet()) {
            if (entry.getValue() instanceof InterfaceC7486pt1) {
                c2693Wt1.B.put((String) entry.getKey(), (InterfaceC1637Mv1) entry.getValue());
            } else {
                c2693Wt1.B.put((String) entry.getKey(), ((InterfaceC1637Mv1) entry.getValue()).zzd());
            }
        }
        return c2693Wt1;
    }

    @Override // com.daaw.InterfaceC1637Mv1
    public final Boolean zzg() {
        return Boolean.TRUE;
    }

    @Override // com.daaw.InterfaceC1637Mv1
    public final Double zzh() {
        return Double.valueOf(Double.NaN);
    }

    @Override // com.daaw.InterfaceC1637Mv1
    public final String zzi() {
        return "[object Object]";
    }

    @Override // com.daaw.InterfaceC1637Mv1
    public final Iterator zzl() {
        return AbstractC4113ds1.b(this.B);
    }

    @Override // com.daaw.InterfaceC7486pt1
    public final boolean zzt(String str) {
        return this.B.containsKey(str);
    }
}
