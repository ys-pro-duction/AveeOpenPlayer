package com.daaw;

import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes.dex */
public final class HL {
    public static final int h = GL.d;
    public final GL a;
    public final GL b;
    public final GL c;
    public final GL d;
    public final GL e;
    public final GL f;
    public final GL g;

    public HL(SharedPreferences sharedPreferences) {
        G10.g(sharedPreferences, "prefs");
        this.a = new GL("show_open_ad", Boolean.TRUE, sharedPreferences);
        Boolean bool = Boolean.FALSE;
        this.b = new GL("show_premium_full_dialog", bool, sharedPreferences);
        this.c = new GL("show_discount_30_dialog", bool, sharedPreferences);
        this.d = new GL("show_1m_discount_70_dialog", bool, sharedPreferences);
        this.e = new GL("dialog_donation_app_freq", 20, sharedPreferences);
        this.f = new GL("dialog_more_templates_app_freq", 0, sharedPreferences);
        this.g = new GL("dialog_premium_cron_offer", "", sharedPreferences);
    }

    public final GL a() {
        return this.g;
    }

    public final GL b() {
        return this.e;
    }

    public final GL c() {
        return this.f;
    }

    public final GL d() {
        return this.d;
    }

    public final GL e() {
        return this.a;
    }

    public final GL f() {
        return this.b;
    }
}
