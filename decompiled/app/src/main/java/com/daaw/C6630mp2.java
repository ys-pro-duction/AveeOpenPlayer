package com.daaw;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: com.daaw.mp2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6630mp2 implements ZH2 {
    public final Map B = new HashMap();
    public final Map C = new HashMap();
    public final C6204lI2 D;

    public C6630mp2(Set set, C6204lI2 c6204lI2) {
        this.D = c6204lI2;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C6351lp2 c6351lp2 = (C6351lp2) it.next();
            this.B.put(c6351lp2.b, c6351lp2.a);
            this.C.put(c6351lp2.c, c6351lp2.a);
        }
    }

    @Override // com.daaw.ZH2
    public final void d(SH2 sh2, String str) {
        this.D.d("task.".concat(String.valueOf(str)));
        if (this.B.containsKey(sh2)) {
            this.D.d("label.".concat(String.valueOf((String) this.B.get(sh2))));
        }
    }

    @Override // com.daaw.ZH2
    public final void m(SH2 sh2, String str) {
        this.D.e("task.".concat(String.valueOf(str)), "s.");
        if (this.C.containsKey(sh2)) {
            this.D.e("label.".concat(String.valueOf((String) this.C.get(sh2))), "s.");
        }
    }

    @Override // com.daaw.ZH2
    public final void r(SH2 sh2, String str, Throwable th) {
        this.D.e("task.".concat(String.valueOf(str)), "f.");
        if (this.C.containsKey(sh2)) {
            this.D.e("label.".concat(String.valueOf((String) this.C.get(sh2))), "f.");
        }
    }

    @Override // com.daaw.ZH2
    public final void l(SH2 sh2, String str) {
    }
}
