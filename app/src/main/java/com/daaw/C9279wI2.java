package com.daaw;

import android.net.Uri;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.wI2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9279wI2 {
    public final String a = (String) AbstractC7586qF1.b.e();

    public final String a(Map map) {
        Uri.Builder builderBuildUpon = Uri.parse(this.a).buildUpon();
        for (Map.Entry entry : map.entrySet()) {
            builderBuildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        return builderBuildUpon.build().toString();
    }
}
