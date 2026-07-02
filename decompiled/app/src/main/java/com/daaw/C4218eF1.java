package com.daaw;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.eF1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4218eF1 {
    public C5528iv a;
    public AbstractC4693fv b;
    public AbstractServiceConnectionC5251hv c;
    public InterfaceC3661cF1 d;

    public static boolean g(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            return false;
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
        ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(intent, 0);
        List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
        if (listQueryIntentActivities != null && resolveInfoResolveActivity != null) {
            for (int i = 0; i < listQueryIntentActivities.size(); i++) {
                if (resolveInfoResolveActivity.activityInfo.name.equals(listQueryIntentActivities.get(i).activityInfo.name)) {
                    return resolveInfoResolveActivity.activityInfo.packageName.equals(AbstractC8673u83.a(context));
                }
            }
        }
        return false;
    }

    public final C5528iv a() {
        AbstractC4693fv abstractC4693fv = this.b;
        if (abstractC4693fv == null) {
            this.a = null;
        } else if (this.a == null) {
            this.a = abstractC4693fv.c(null);
        }
        return this.a;
    }

    public final void b(Activity activity) {
        String strA;
        if (this.b == null && (strA = AbstractC8673u83.a(activity)) != null) {
            C8959v83 c8959v83 = new C8959v83(this);
            this.c = c8959v83;
            AbstractC4693fv.a(activity, strA, c8959v83);
        }
    }

    public final void c(AbstractC4693fv abstractC4693fv) {
        this.b = abstractC4693fv;
        abstractC4693fv.e(0L);
        InterfaceC3661cF1 interfaceC3661cF1 = this.d;
        if (interfaceC3661cF1 != null) {
            interfaceC3661cF1.zza();
        }
    }

    public final void d() {
        this.b = null;
        this.a = null;
    }

    public final void e(InterfaceC3661cF1 interfaceC3661cF1) {
        this.d = interfaceC3661cF1;
    }

    public final void f(Activity activity) {
        AbstractServiceConnectionC5251hv abstractServiceConnectionC5251hv = this.c;
        if (abstractServiceConnectionC5251hv == null) {
            return;
        }
        activity.unbindService(abstractServiceConnectionC5251hv);
        this.b = null;
        this.a = null;
        this.c = null;
    }
}
