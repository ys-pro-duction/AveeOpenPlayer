package com.daaw;

import java.util.List;

/* JADX INFO: renamed from: com.daaw.nc2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6844nc2 {
    public static final C6844nc2 b = new C6844nc2(OP2.J());
    public static final String c = Integer.toString(0, 36);
    public static final InterfaceC9666xh3 d = new InterfaceC9666xh3() { // from class: com.daaw.xa2
    };
    public final OP2 a;

    public C6844nc2(List list) {
        this.a = OP2.H(list);
    }

    public final OP2 a() {
        return this.a;
    }

    public final boolean b(int i) {
        for (int i2 = 0; i2 < this.a.size(); i2++) {
            C1143Ib2 c1143Ib2 = (C1143Ib2) this.a.get(i2);
            if (c1143Ib2.c() && c1143Ib2.a() == i) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6844nc2.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((C6844nc2) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
