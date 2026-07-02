package com.daaw;

import android.content.Context;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public class FB {
    public final Context a;
    public b b = null;

    public class b {
        public final String a;
        public final String b;

        public b() {
            int iR = AbstractC0555Cn.r(FB.this.a, "com.google.firebase.crashlytics.unity_version", "string");
            if (iR == 0) {
                if (!FB.this.c("flutter_assets/NOTICES.Z")) {
                    this.a = null;
                    this.b = null;
                    return;
                } else {
                    this.a = "Flutter";
                    this.b = null;
                    C2106Rd0.f().i("Development platform is: Flutter");
                    return;
                }
            }
            this.a = "Unity";
            String string = FB.this.a.getResources().getString(iR);
            this.b = string;
            C2106Rd0.f().i("Unity Editor version is: " + string);
        }
    }

    public FB(Context context) {
        this.a = context;
    }

    public final boolean c(String str) {
        if (this.a.getAssets() == null) {
            return false;
        }
        try {
            InputStream inputStreamOpen = this.a.getAssets().open(str);
            if (inputStreamOpen != null) {
                inputStreamOpen.close();
            }
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    public String d() {
        return f().a;
    }

    public String e() {
        return f().b;
    }

    public final b f() {
        if (this.b == null) {
            this.b = new b();
        }
        return this.b;
    }
}
