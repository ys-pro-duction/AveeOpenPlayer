package com.daaw;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.LocaleList;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseArray;
import com.daaw.C4125dv;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.daaw.gv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4972gv {
    public final Intent a;
    public final Bundle b;

    /* JADX INFO: renamed from: com.daaw.gv$a */
    public static class a {
        public static String a() {
            LocaleList adjustedDefault = LocaleList.getAdjustedDefault();
            if (adjustedDefault.size() > 0) {
                return adjustedDefault.get(0).toLanguageTag();
            }
            return null;
        }
    }

    public C4972gv(Intent intent, Bundle bundle) {
        this.a = intent;
        this.b = bundle;
    }

    public void a(Context context, Uri uri) {
        this.a.setData(uri);
        AbstractC9438ws.j(context, this.a, this.b);
    }

    /* JADX INFO: renamed from: com.daaw.gv$b */
    public static final class b {
        public ArrayList c;
        public Bundle d;
        public ArrayList e;
        public SparseArray f;
        public Bundle g;
        public final Intent a = new Intent("android.intent.action.VIEW");
        public final C4125dv.a b = new C4125dv.a();
        public int h = 0;
        public boolean i = true;

        public b() {
        }

        public C4972gv a() {
            if (!this.a.hasExtra("android.support.customtabs.extra.SESSION")) {
                d(null, null);
            }
            ArrayList<? extends Parcelable> arrayList = this.c;
            if (arrayList != null) {
                this.a.putParcelableArrayListExtra("android.support.customtabs.extra.MENU_ITEMS", arrayList);
            }
            ArrayList<? extends Parcelable> arrayList2 = this.e;
            if (arrayList2 != null) {
                this.a.putParcelableArrayListExtra("android.support.customtabs.extra.TOOLBAR_ITEMS", arrayList2);
            }
            this.a.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.i);
            this.a.putExtras(this.b.a().a());
            Bundle bundle = this.g;
            if (bundle != null) {
                this.a.putExtras(bundle);
            }
            if (this.f != null) {
                Bundle bundle2 = new Bundle();
                bundle2.putSparseParcelableArray("androidx.browser.customtabs.extra.COLOR_SCHEME_PARAMS", this.f);
                this.a.putExtras(bundle2);
            }
            this.a.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", this.h);
            if (Build.VERSION.SDK_INT >= 24) {
                b();
            }
            return new C4972gv(this.a, this.d);
        }

        public final void b() {
            String strA = a.a();
            if (TextUtils.isEmpty(strA)) {
                return;
            }
            Bundle bundleExtra = this.a.hasExtra("com.android.browser.headers") ? this.a.getBundleExtra("com.android.browser.headers") : new Bundle();
            if (bundleExtra.containsKey("Accept-Language")) {
                return;
            }
            bundleExtra.putString("Accept-Language", strA);
            this.a.putExtra("com.android.browser.headers", bundleExtra);
        }

        public b c(C5528iv c5528iv) {
            this.a.setPackage(c5528iv.b().getPackageName());
            d(c5528iv.a(), c5528iv.c());
            return this;
        }

        public final void d(IBinder iBinder, PendingIntent pendingIntent) {
            Bundle bundle = new Bundle();
            AbstractC2227Sh.a(bundle, "android.support.customtabs.extra.SESSION", iBinder);
            if (pendingIntent != null) {
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
            }
            this.a.putExtras(bundle);
        }

        public b(C5528iv c5528iv) {
            if (c5528iv != null) {
                c(c5528iv);
            }
        }
    }
}
