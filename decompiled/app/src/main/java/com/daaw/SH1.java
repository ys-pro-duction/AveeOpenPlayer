package com.daaw;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class SH1 implements HI1 {
    public final TH1 a;

    public SH1(TH1 th1) {
        this.a = th1;
    }

    @Override // com.daaw.HI1
    public final void a(Object obj, Map map) {
        String str = (String) map.get("name");
        if (str == null) {
            AbstractC4274eT1.zzj("App event with no name parameter.");
        } else {
            this.a.a(str, (String) map.get("info"));
        }
    }
}
