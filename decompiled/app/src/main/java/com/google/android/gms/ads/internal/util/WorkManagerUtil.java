package com.google.android.gms.ads.internal.util;

import android.content.Context;
import androidx.work.a;
import androidx.work.b;
import com.daaw.AbstractC0329Ai1;
import com.daaw.AbstractC4274eT1;
import com.daaw.BinderC7744qp0;
import com.daaw.C1305Jq0;
import com.daaw.C6358lr;
import com.daaw.EnumC1189In0;
import com.daaw.InterfaceC7934rX;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.ads.internal.offline.buffering.OfflineNotificationPoster;
import com.google.android.gms.ads.internal.offline.buffering.OfflinePingSender;

/* JADX INFO: loaded from: classes.dex */
public class WorkManagerUtil extends zzbs {
    @UsedByReflection("This class must be instantiated reflectively so that the default class loader can be used.")
    public WorkManagerUtil() {
    }

    private static void Z2(Context context) {
        try {
            AbstractC0329Ai1.e(context.getApplicationContext(), new a.b().a());
        } catch (IllegalStateException unused) {
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzbt
    public final void zze(InterfaceC7934rX interfaceC7934rX) {
        Context context = (Context) BinderC7744qp0.I(interfaceC7934rX);
        Z2(context);
        try {
            AbstractC0329Ai1 abstractC0329Ai1D = AbstractC0329Ai1.d(context);
            abstractC0329Ai1D.a("offline_ping_sender_work");
            abstractC0329Ai1D.b((C1305Jq0) ((C1305Jq0.a) ((C1305Jq0.a) new C1305Jq0.a(OfflinePingSender.class).e(new C6358lr.a().b(EnumC1189In0.CONNECTED).a())).a("offline_ping_sender_work")).b());
        } catch (IllegalStateException e) {
            AbstractC4274eT1.zzk("Failed to instantiate WorkManager.", e);
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzbt
    public final boolean zzf(InterfaceC7934rX interfaceC7934rX, String str, String str2) throws Throwable {
        Context context = (Context) BinderC7744qp0.I(interfaceC7934rX);
        Z2(context);
        C6358lr c6358lrA = new C6358lr.a().b(EnumC1189In0.CONNECTED).a();
        try {
            AbstractC0329Ai1.d(context).b((C1305Jq0) ((C1305Jq0.a) ((C1305Jq0.a) ((C1305Jq0.a) new C1305Jq0.a(OfflineNotificationPoster.class).e(c6358lrA)).f(new b.a().e("uri", str).e("gws_query_id", str2).a())).a("offline_notification_work")).b());
            return true;
        } catch (IllegalStateException e) {
            AbstractC4274eT1.zzk("Failed to instantiate WorkManager.", e);
            return false;
        }
    }
}
