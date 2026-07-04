package com.daaw;

import android.text.TextUtils;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class PW1 implements HI1 {
    public final /* synthetic */ RW1 a;

    public PW1(RW1 rw1) {
        this.a = rw1;
    }

    @Override // com.daaw.HI1
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        if (map != null) {
            String str = (String) map.get("height");
            if (TextUtils.isEmpty(str)) {
                return;
            }
            try {
                int i = Integer.parseInt(str);
                synchronized (this.a) {
                    try {
                        RW1 rw1 = this.a;
                        if (rw1.j0 != i) {
                            rw1.j0 = i;
                            this.a.requestLayout();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Exception e) {
                AbstractC4274eT1.zzk("Exception occurred while getting webview content height", e);
            }
        }
    }
}
