package com.daaw;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

/* JADX INFO: renamed from: com.daaw.xi3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C9671xi3 {
    public static final Uri f = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();
    public final String a;
    public final String b;
    public final ComponentName c;
    public final int d;
    public final boolean e;

    public C9671xi3(String str, String str2, int i, boolean z) {
        AbstractC7506py0.f(str);
        this.a = str;
        AbstractC7506py0.f(str2);
        this.b = str2;
        this.c = null;
        this.d = 4225;
        this.e = z;
    }

    public final ComponentName a() {
        return this.c;
    }

    public final Intent b(Context context) {
        Bundle bundleCall;
        if (this.a == null) {
            return new Intent().setComponent(this.c);
        }
        if (this.e) {
            Bundle bundle = new Bundle();
            bundle.putString("serviceActionBundleKey", this.a);
            try {
                bundleCall = context.getContentResolver().call(f, "serviceIntentCall", (String) null, bundle);
            } catch (IllegalArgumentException e) {
                "Dynamic intent resolution failed: ".concat(e.toString());
                bundleCall = null;
            }
            intent = bundleCall != null ? (Intent) bundleCall.getParcelable("serviceResponseIntentKey") : null;
            if (intent == null) {
                "Dynamic lookup for intent failed for action: ".concat(String.valueOf(this.a));
            }
        }
        return intent == null ? new Intent(this.a).setPackage(this.b) : intent;
    }

    public final String c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9671xi3)) {
            return false;
        }
        C9671xi3 c9671xi3 = (C9671xi3) obj;
        return AbstractC8022rp0.a(this.a, c9671xi3.a) && AbstractC8022rp0.a(this.b, c9671xi3.b) && AbstractC8022rp0.a(this.c, c9671xi3.c) && this.e == c9671xi3.e;
    }

    public final int hashCode() {
        return AbstractC8022rp0.b(this.a, this.b, this.c, 4225, Boolean.valueOf(this.e));
    }

    public final String toString() {
        String str = this.a;
        if (str != null) {
            return str;
        }
        AbstractC7506py0.l(this.c);
        return this.c.flattenToString();
    }
}
