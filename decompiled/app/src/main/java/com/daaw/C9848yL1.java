package com.daaw;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.daaw.yL1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9848yL1 implements VI1 {
    public final WK1 a;
    public final BT1 b;
    public final /* synthetic */ C10127zL1 c;

    public C9848yL1(C10127zL1 c10127zL1, WK1 wk1, BT1 bt1) {
        this.c = c10127zL1;
        this.a = wk1;
        this.b = bt1;
    }

    @Override // com.daaw.VI1
    public final void a(JSONObject jSONObject) {
        WK1 wk1;
        try {
            try {
                this.b.b(this.c.a.b(jSONObject));
                wk1 = this.a;
            } catch (IllegalStateException unused) {
                wk1 = this.a;
            } catch (JSONException e) {
                this.b.c(e);
                wk1 = this.a;
            }
            wk1.g();
        } catch (Throwable th) {
            this.a.g();
            throw th;
        }
    }

    @Override // com.daaw.VI1
    public final void zza(String str) {
        WK1 wk1;
        try {
            if (str == null) {
                this.b.c(new C4521fL1());
            } else {
                this.b.c(new C4521fL1(str));
            }
            wk1 = this.a;
        } catch (IllegalStateException unused) {
            wk1 = this.a;
        } catch (Throwable th) {
            this.a.g();
            throw th;
        }
        wk1.g();
    }
}
