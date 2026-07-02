package com.daaw;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzbw;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.daaw.ve2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9092ve2 extends C9371we2 {
    public final JSONObject b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final String g;
    public final JSONObject h;

    public C9092ve2(C4498fF2 c4498fF2, JSONObject jSONObject) {
        super(c4498fF2);
        this.b = zzbw.zzg(jSONObject, "tracking_urls_and_actions", "active_view");
        this.c = zzbw.zzk(false, jSONObject, "allow_pub_owned_ad_view");
        this.d = zzbw.zzk(false, jSONObject, "attribution", "allow_pub_rendering");
        this.e = zzbw.zzk(false, jSONObject, "enable_omid");
        this.g = zzbw.zzb("", jSONObject, "watermark_overlay_png_base64");
        this.f = jSONObject.optJSONObject("overlay") != null;
        this.h = ((Boolean) zzba.zzc().b(AbstractC9820yE1.W4)).booleanValue() ? jSONObject.optJSONObject("omid_settings") : null;
    }

    @Override // com.daaw.C9371we2
    public final IF2 a() {
        JSONObject jSONObject = this.h;
        return jSONObject != null ? new IF2(jSONObject) : this.a.X;
    }

    @Override // com.daaw.C9371we2
    public final String b() {
        return this.g;
    }

    @Override // com.daaw.C9371we2
    public final JSONObject c() {
        JSONObject jSONObject = this.b;
        if (jSONObject != null) {
            return jSONObject;
        }
        try {
            return new JSONObject(this.a.B);
        } catch (JSONException unused) {
            return null;
        }
    }

    @Override // com.daaw.C9371we2
    public final boolean d() {
        return this.e;
    }

    @Override // com.daaw.C9371we2
    public final boolean e() {
        return this.c;
    }

    @Override // com.daaw.C9371we2
    public final boolean f() {
        return this.d;
    }

    @Override // com.daaw.C9371we2
    public final boolean g() {
        return this.f;
    }
}
