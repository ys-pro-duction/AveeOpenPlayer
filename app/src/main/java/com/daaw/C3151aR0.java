package com.daaw;

import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.aR0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C3151aR0 implements QW {
    public List a = new ArrayList();
    public Map b = new HashMap();
    public String c = "None";

    @Override // com.daaw.QW
    public void a(C2591Vu c2591Vu) {
        C2591Vu c2591VuH = c2591Vu.h("varGroup");
        for (int i = 0; i < c2591VuH.j("var"); i++) {
            if (this.a.size() <= i) {
                this.a.add(null);
            }
            C2591Vu c2591VuH2 = c2591VuH.h("var" + i);
            CX cxA = YQ0.a(c2591VuH2.D("None"), (CX) this.a.get(i));
            if (cxA != null) {
                cxA.a(c2591VuH2);
            }
            this.a.set(i, cxA);
        }
        String strD = c2591VuH.h("newVariable").D("None");
        this.c = strD;
        if (Objects.equals(strD, "None")) {
            return;
        }
        this.a.add(YQ0.a(this.c, null));
        this.c = "None";
    }

    public Map c() {
        j();
        return this.b;
    }

    public void j() {
        this.b.clear();
        for (CX cx : this.a) {
            if (cx != null) {
                this.b.put(cx.n(), cx.o());
            }
        }
    }

    @Override // com.daaw.QW
    public void q(C2591Vu c2591Vu) {
        C2591Vu c2591VuI = c2591Vu.I("varGroup", "variables");
        int i = 0;
        while (i < this.a.size()) {
            CX cx = (CX) this.a.get(i);
            if (cx == null) {
                this.a.remove(i);
                i--;
            } else {
                cx.q(c2591VuI.G("var" + i, YQ0.b(cx), "dyn", YQ0.c()));
            }
            i++;
        }
        c2591VuI.G("newVariable", this.c, "dyn", YQ0.c());
    }
}
