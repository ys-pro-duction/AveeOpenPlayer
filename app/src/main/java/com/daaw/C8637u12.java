package com.daaw;

import android.text.TextUtils;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.u12, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8637u12 implements X02 {
    public final C4219eF2 a;

    public C8637u12(C4219eF2 c4219eF2) {
        this.a = c4219eF2;
    }

    @Override // com.daaw.X02
    public final void a(Map map) {
        String str = (String) map.get("render_in_browser");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            this.a.b(Boolean.parseBoolean(str));
        } catch (Exception e) {
            throw new IllegalStateException("Invalid render_in_browser state", e);
        }
    }
}
