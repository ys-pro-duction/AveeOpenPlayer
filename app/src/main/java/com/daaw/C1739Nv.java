package com.daaw;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.daaw.Nv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C1739Nv {
    public final SharedPreferences a;
    public final C7050oL b;
    public final Object c;
    public C7521q11 d;
    public boolean e;
    public boolean f;
    public Boolean g;
    public final C7521q11 h;

    public C1739Nv(C7050oL c7050oL) {
        Object obj = new Object();
        this.c = obj;
        this.d = new C7521q11();
        this.e = false;
        this.f = false;
        this.h = new C7521q11();
        Context contextK = c7050oL.k();
        this.b = c7050oL;
        this.a = AbstractC0555Cn.s(contextK);
        Boolean boolB = b();
        this.g = boolB == null ? a(contextK) : boolB;
        synchronized (obj) {
            try {
                if (d()) {
                    this.d.e(null);
                    this.e = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static Boolean f(Context context) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_crashlytics_collection_enabled")) {
                return null;
            }
            return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_crashlytics_collection_enabled"));
        } catch (PackageManager.NameNotFoundException e) {
            C2106Rd0.f().e("Could not read data collection permission from manifest", e);
            return null;
        }
    }

    public final Boolean a(Context context) {
        Boolean boolF = f(context);
        if (boolF == null) {
            this.f = false;
            return null;
        }
        this.f = true;
        return Boolean.valueOf(Boolean.TRUE.equals(boolF));
    }

    public final Boolean b() {
        if (!this.a.contains("firebase_crashlytics_collection_enabled")) {
            return null;
        }
        this.f = false;
        return Boolean.valueOf(this.a.getBoolean("firebase_crashlytics_collection_enabled", true));
    }

    public void c(boolean z) {
        if (!z) {
            throw new IllegalStateException("An invalid data collection token was used.");
        }
        this.h.e(null);
    }

    public synchronized boolean d() {
        boolean zBooleanValue;
        try {
            Boolean bool = this.g;
            zBooleanValue = bool != null ? bool.booleanValue() : this.b.t();
            e(zBooleanValue);
        } catch (Throwable th) {
            throw th;
        }
        return zBooleanValue;
    }

    public final void e(boolean z) {
        C2106Rd0.f().b(String.format("Crashlytics automatic data collection %s by %s.", z ? "ENABLED" : "DISABLED", this.g == null ? "global Firebase setting" : this.f ? "firebase_crashlytics_collection_enabled manifest flag" : "API"));
    }

    public AbstractC6963o11 g() {
        AbstractC6963o11 abstractC6963o11A;
        synchronized (this.c) {
            abstractC6963o11A = this.d.a();
        }
        return abstractC6963o11A;
    }

    public AbstractC6963o11 h(Executor executor) {
        return AbstractC0622Db1.j(executor, this.h.a(), g());
    }
}
