package com.daaw;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.wr1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC9435wr1 implements InterfaceC1637Mv1, InterfaceC7486pt1 {
    public final String B;
    public final Map C = new HashMap();

    public AbstractC9435wr1(String str) {
        this.B = str;
    }

    public abstract InterfaceC1637Mv1 a(ES2 es2, List list);

    public final String b() {
        return this.B;
    }

    @Override // com.daaw.InterfaceC7486pt1
    public final InterfaceC1637Mv1 e(String str) {
        return this.C.containsKey(str) ? (InterfaceC1637Mv1) this.C.get(str) : InterfaceC1637Mv1.t;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC9435wr1)) {
            return false;
        }
        AbstractC9435wr1 abstractC9435wr1 = (AbstractC9435wr1) obj;
        String str = this.B;
        if (str != null) {
            return str.equals(abstractC9435wr1.B);
        }
        return false;
    }

    public final int hashCode() {
        String str = this.B;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @Override // com.daaw.InterfaceC1637Mv1
    public final InterfaceC1637Mv1 m(String str, ES2 es2, List list) {
        return "toString".equals(str) ? new C6391ly1(this.B) : AbstractC4113ds1.a(this, new C6391ly1(str), es2, list);
    }

    @Override // com.daaw.InterfaceC7486pt1
    public final void p(String str, InterfaceC1637Mv1 interfaceC1637Mv1) {
        if (interfaceC1637Mv1 == null) {
            this.C.remove(str);
        } else {
            this.C.put(str, interfaceC1637Mv1);
        }
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
        return this.B;
    }

    @Override // com.daaw.InterfaceC1637Mv1
    public final Iterator zzl() {
        return AbstractC4113ds1.b(this.C);
    }

    @Override // com.daaw.InterfaceC7486pt1
    public final boolean zzt(String str) {
        return this.C.containsKey(str);
    }

    @Override // com.daaw.InterfaceC1637Mv1
    public InterfaceC1637Mv1 zzd() {
        return this;
    }
}
