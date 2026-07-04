package com.daaw;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: com.daaw.Kj2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1383Kj2 implements ZH2 {
    public final C0542Cj2 C;
    public final InterfaceC5485im D;
    public final Map B = new HashMap();
    public final Map E = new HashMap();

    public C1383Kj2(C0542Cj2 c0542Cj2, Set set, InterfaceC5485im interfaceC5485im) {
        this.C = c0542Cj2;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C1279Jj2 c1279Jj2 = (C1279Jj2) it.next();
            this.E.put(c1279Jj2.c, c1279Jj2);
        }
        this.D = interfaceC5485im;
    }

    public final void a(SH2 sh2, boolean z) {
        SH2 sh22 = ((C1279Jj2) this.E.get(sh2)).b;
        if (this.B.containsKey(sh22)) {
            String str = true != z ? "f." : "s.";
            long jB = this.D.b() - ((Long) this.B.get(sh22)).longValue();
            this.C.a().put("label.".concat(((C1279Jj2) this.E.get(sh2)).a), str.concat(String.valueOf(Long.toString(jB))));
        }
    }

    @Override // com.daaw.ZH2
    public final void d(SH2 sh2, String str) {
        this.B.put(sh2, Long.valueOf(this.D.b()));
    }

    @Override // com.daaw.ZH2
    public final void m(SH2 sh2, String str) {
        if (this.B.containsKey(sh2)) {
            long jB = this.D.b() - ((Long) this.B.get(sh2)).longValue();
            C0542Cj2 c0542Cj2 = this.C;
            String strValueOf = String.valueOf(str);
            c0542Cj2.a().put("task.".concat(strValueOf), "s.".concat(String.valueOf(Long.toString(jB))));
        }
        if (this.E.containsKey(sh2)) {
            a(sh2, true);
        }
    }

    @Override // com.daaw.ZH2
    public final void r(SH2 sh2, String str, Throwable th) {
        if (this.B.containsKey(sh2)) {
            long jB = this.D.b() - ((Long) this.B.get(sh2)).longValue();
            C0542Cj2 c0542Cj2 = this.C;
            String strValueOf = String.valueOf(str);
            c0542Cj2.a().put("task.".concat(strValueOf), "f.".concat(String.valueOf(Long.toString(jB))));
        }
        if (this.E.containsKey(sh2)) {
            a(sh2, false);
        }
    }

    @Override // com.daaw.ZH2
    public final void l(SH2 sh2, String str) {
    }
}
