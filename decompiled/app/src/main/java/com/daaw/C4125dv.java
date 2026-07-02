package com.daaw;

import android.os.Bundle;

/* JADX INFO: renamed from: com.daaw.dv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4125dv {
    public final Integer a;
    public final Integer b;
    public final Integer c;
    public final Integer d;

    /* JADX INFO: renamed from: com.daaw.dv$a */
    public static final class a {
        public Integer a;
        public Integer b;
        public Integer c;
        public Integer d;

        public C4125dv a() {
            return new C4125dv(this.a, this.b, this.c, this.d);
        }
    }

    public C4125dv(Integer num, Integer num2, Integer num3, Integer num4) {
        this.a = num;
        this.b = num2;
        this.c = num3;
        this.d = num4;
    }

    public Bundle a() {
        Bundle bundle = new Bundle();
        Integer num = this.a;
        if (num != null) {
            bundle.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", num.intValue());
        }
        Integer num2 = this.b;
        if (num2 != null) {
            bundle.putInt("android.support.customtabs.extra.SECONDARY_TOOLBAR_COLOR", num2.intValue());
        }
        Integer num3 = this.c;
        if (num3 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_COLOR", num3.intValue());
        }
        Integer num4 = this.d;
        if (num4 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_DIVIDER_COLOR", num4.intValue());
        }
        return bundle;
    }
}
