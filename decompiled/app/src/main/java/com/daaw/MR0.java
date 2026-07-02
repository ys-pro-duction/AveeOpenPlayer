package com.daaw;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes.dex */
public final class MR0 {
    public final Context a;
    public final SharedPreferences b;
    public final C5255hw c;
    public final C3585bz0 d;
    public final C3585bz0 e;
    public final C3585bz0 f;
    public final C3585bz0 g;

    public MR0(Context context) {
        G10.g(context, "context");
        this.a = context;
        SharedPreferences sharedPreferences = context.getSharedPreferences("app_preferences", 0);
        G10.f(sharedPreferences, "getSharedPreferences(...)");
        this.b = sharedPreferences;
        this.c = new C5255hw("premium_offer_execution", null, sharedPreferences, null, 8, null);
        Class cls = Integer.TYPE;
        this.d = new C3585bz0(AbstractC5624jG0.k(cls), "app_open_count", 0, sharedPreferences);
        this.e = new C3585bz0(AbstractC5624jG0.k(cls), "last_donation_dialog_app_open_count", 0, sharedPreferences);
        this.f = new C3585bz0(AbstractC5624jG0.k(cls), "last_more_template_dialog_app_open_count", 0, sharedPreferences);
        this.g = new C3585bz0(AbstractC5624jG0.k(Boolean.TYPE), "permissions_asked", Boolean.FALSE, sharedPreferences);
    }

    public final C3585bz0 a() {
        return this.d;
    }

    public final C3585bz0 b() {
        return this.e;
    }

    public final C3585bz0 c() {
        return this.f;
    }

    public final C3585bz0 d() {
        return this.g;
    }

    public final SharedPreferences e() {
        return this.b;
    }

    public final C5255hw f() {
        return this.c;
    }
}
