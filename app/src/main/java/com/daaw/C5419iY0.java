package com.daaw;

import android.content.Context;
import android.content.res.Resources;

/* JADX INFO: renamed from: com.daaw.iY0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C5419iY0 {
    public final Resources a;
    public final String b;

    public C5419iY0(Context context) {
        AbstractC7506py0.l(context);
        Resources resources = context.getResources();
        this.a = resources;
        this.b = resources.getResourcePackageName(MD0.a);
    }

    public String a(String str) {
        int identifier = this.a.getIdentifier(str, "string", this.b);
        if (identifier == 0) {
            return null;
        }
        return this.a.getString(identifier);
    }
}
