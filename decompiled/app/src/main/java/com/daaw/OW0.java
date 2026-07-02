package com.daaw;

import android.os.Build;
import android.text.StaticLayout;

/* JADX INFO: loaded from: classes.dex */
public final class OW0 implements UW0 {
    @Override // com.daaw.UW0
    public StaticLayout a(WW0 ww0) {
        G10.g(ww0, "params");
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(ww0.p(), ww0.o(), ww0.e(), ww0.m(), ww0.s());
        builderObtain.setTextDirection(ww0.q());
        builderObtain.setAlignment(ww0.a());
        builderObtain.setMaxLines(ww0.l());
        builderObtain.setEllipsize(ww0.c());
        builderObtain.setEllipsizedWidth(ww0.d());
        builderObtain.setLineSpacing(ww0.j(), ww0.k());
        builderObtain.setIncludePad(ww0.g());
        builderObtain.setBreakStrategy(ww0.b());
        builderObtain.setHyphenationFrequency(ww0.f());
        builderObtain.setIndents(ww0.i(), ww0.n());
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            QW0 qw0 = QW0.a;
            G10.f(builderObtain, "this");
            qw0.a(builderObtain, ww0.h());
        }
        if (i >= 28) {
            SW0 sw0 = SW0.a;
            G10.f(builderObtain, "this");
            sw0.a(builderObtain, ww0.r());
        }
        StaticLayout staticLayoutBuild = builderObtain.build();
        G10.f(staticLayoutBuild, "obtain(params.text, para…  }\n            }.build()");
        return staticLayoutBuild;
    }
}
