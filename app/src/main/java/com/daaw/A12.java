package com.daaw;

import android.text.TextUtils;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class A12 implements X02 {
    public final C7447pl2 a;

    public A12(C7447pl2 c7447pl2) {
        this.a = c7447pl2;
    }

    @Override // com.daaw.X02
    public final void a(Map map) {
        String str = (String) map.get("test_mode_enabled");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.a.n(str.equals("true"));
    }
}
