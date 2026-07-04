package com.daaw.avee.comp.playback.view;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.widget.RemoteViews;
import com.daaw.AbstractC0857Fi0;
import com.daaw.AbstractC3374bD0;
import com.daaw.AbstractC5056hD0;
import com.daaw.AbstractC9815yD0;
import com.daaw.C2078Qw0;
import com.daaw.C2537Vg1;
import com.daaw.InterfaceC5559j2;
import com.daaw.avee.MainActivity;
import com.daaw.avee.comp.playback.MediaPlaybackService;

/* JADX INFO: loaded from: classes.dex */
public class MediaAppWidgetProvider extends AppWidgetProvider {
    public static MediaAppWidgetProvider a;

    public class a implements InterfaceC5559j2 {
        public final /* synthetic */ RemoteViews a;
        public final /* synthetic */ Context b;
        public final /* synthetic */ int[] c;

        public a(RemoteViews remoteViews, Context context, int[] iArr) {
            this.a = remoteViews;
            this.b = context;
            this.c = iArr;
        }

        @Override // com.daaw.InterfaceC5559j2
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Bitmap bitmap) {
            if (bitmap != null) {
                this.a.setImageViewBitmap(AbstractC5056hD0.w1, bitmap);
            } else {
                this.a.setImageViewResource(AbstractC5056hD0.w1, AbstractC3374bD0.q0);
            }
            MediaAppWidgetProvider.this.g(this.b, this.c, this.a);
        }
    }

    public class b implements InterfaceC5559j2 {
        public final /* synthetic */ RemoteViews a;
        public final /* synthetic */ Context b;
        public final /* synthetic */ int[] c;

        public b(RemoteViews remoteViews, Context context, int[] iArr) {
            this.a = remoteViews;
            this.b = context;
            this.c = iArr;
        }

        @Override // com.daaw.InterfaceC5559j2
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Bitmap bitmap) {
            if (bitmap != null) {
                this.a.setImageViewBitmap(AbstractC5056hD0.w1, bitmap);
            } else {
                this.a.setImageViewResource(AbstractC5056hD0.w1, AbstractC3374bD0.q0);
            }
            MediaAppWidgetProvider.this.g(this.b, this.c, this.a);
        }
    }

    public MediaAppWidgetProvider() {
        C2537Vg1.a();
    }

    public static synchronized MediaAppWidgetProvider c() {
        try {
            if (a == null) {
                a = new MediaAppWidgetProvider();
            }
        } catch (Throwable th) {
            throw th;
        }
        return a;
    }

    public final void b(Context context, int[] iArr, Class cls) {
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), AbstractC9815yD0.v0);
        C2078Qw0.b bVar = C2078Qw0.h;
        h(context, remoteViews, bVar, false, false, cls, 0);
        AbstractC0857Fi0.j(context, remoteViews, bVar, new a(remoteViews, context, iArr), null);
        g(context, iArr, remoteViews);
    }

    public final boolean d(Context context) {
        return AppWidgetManager.getInstance(context).getAppWidgetIds(new ComponentName(context, getClass())).length > 0;
    }

    public void e(Context context, C2078Qw0.b bVar, boolean z, boolean z2, Class cls) {
        if (d(context)) {
            f(context, null, bVar, z, z2, cls);
        }
    }

    public void f(Context context, int[] iArr, C2078Qw0.b bVar, boolean z, boolean z2, Class cls) {
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), AbstractC9815yD0.v0);
        h(context, remoteViews, bVar, z, z2, cls, 0);
        AbstractC0857Fi0.j(context, remoteViews, bVar, new b(remoteViews, context, iArr), null);
        g(context, iArr, remoteViews);
    }

    public final void g(Context context, int[] iArr, RemoteViews remoteViews) {
        AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(context);
        if (iArr != null) {
            appWidgetManager.updateAppWidget(iArr, remoteViews);
        } else {
            appWidgetManager.updateAppWidget(new ComponentName(context, getClass()), remoteViews);
        }
    }

    public void h(Context context, RemoteViews remoteViews, C2078Qw0.b bVar, boolean z, boolean z2, Class cls, int i) {
        AbstractC0857Fi0.i(context, remoteViews, bVar, z, z2, cls, i, null);
        remoteViews.setViewVisibility(AbstractC5056hD0.v, 8);
        Intent intent = new Intent(context, (Class<?>) MainActivity.class);
        intent.setFlags(131072);
        remoteViews.setOnClickPendingIntent(AbstractC5056hD0.k, PendingIntent.getActivity(context, 0, intent, 67108864));
    }

    @Override // android.appwidget.AppWidgetProvider
    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        b(context, iArr, MediaPlaybackService.class);
        Intent intent = new Intent("APP_WIDGET_UPDATE_ACTION");
        intent.putExtra("appWidgetIds", iArr);
        intent.addFlags(1073741824);
        context.sendBroadcast(intent);
    }
}
