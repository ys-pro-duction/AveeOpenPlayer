package com.daaw;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.fJ1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4513fJ1 implements HI1 {
    public final Context a;

    public C4513fJ1(Context context) {
        this.a = context;
    }

    @Override // com.daaw.HI1
    public final void a(Object obj, Map map) {
        if (!map.containsKey("text") || TextUtils.isEmpty((CharSequence) map.get("text"))) {
            return;
        }
        zze.zza("Opening Share Sheet with text: ".concat(String.valueOf((String) map.get("text"))));
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", (String) map.get("text"));
        if (map.containsKey("title")) {
            intent.putExtra("android.intent.extra.TITLE", (String) map.get("title"));
        }
        try {
            zzt.zzp();
            com.google.android.gms.ads.internal.util.zzt.zzS(this.a, intent);
        } catch (RuntimeException e) {
            AbstractC4274eT1.zzk("Failed to open Share Sheet", e);
            zzt.zzo().u(e, "ShareSheetGmsgHandler.onGmsg");
        }
    }
}
