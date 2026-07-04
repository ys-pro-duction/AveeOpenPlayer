package com.daaw;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Handler;
import android.widget.RemoteViews;
import com.daaw.C2078Qw0;
import com.daaw.avee.MainActivity;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;

/* JADX INFO: renamed from: com.daaw.Fi0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0857Fi0 {
    public static C0642Dg1 a = new C0642Dg1();

    /* JADX INFO: renamed from: com.daaw.Fi0$a */
    public class a implements InterfaceC7381pY {
        public Object a;
        public final /* synthetic */ InterfaceC5559j2 b;

        public a(InterfaceC5559j2 interfaceC5559j2) {
            this.b = interfaceC5559j2;
        }

        @Override // com.daaw.InterfaceC7381pY
        public void a(Object obj) {
            this.a = obj;
        }

        @Override // com.daaw.InterfaceC7381pY
        public void b(C8217sY c8217sY, String str, String str2) {
            this.b.a(AbstractC1765Ob1.h(C8217sY.g(c8217sY)));
            C8217sY.c(c8217sY);
        }
    }

    public static /* synthetic */ void a(Bitmap bitmap, RemoteViews remoteViews, Context context, String str, int i) {
        if (bitmap != null) {
            remoteViews.setImageViewBitmap(AbstractC5056hD0.w1, bitmap);
        } else {
            remoteViews.setImageViewResource(AbstractC5056hD0.w1, AbstractC3374bD0.q0);
        }
        ((NotificationManager) context.getSystemService("notification")).notify(i, g(context, str).setContent(remoteViews).build());
    }

    public static /* synthetic */ void b(KQ kq, final RemoteViews remoteViews, final Context context, final String str, final int i, final Bitmap bitmap) {
        Handler handler = (Handler) kq.a();
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.daaw.Ei0
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC0857Fi0.a(bitmap, remoteViews, context, str, i);
                }
            });
        }
    }

    public static void c(Context context, int i) {
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        if (notificationManager != null) {
            notificationManager.cancel(i);
        }
    }

    public static String d(Context context) {
        if (Build.VERSION.SDK_INT < 26) {
            return null;
        }
        String string = context.getString(JD0.r4);
        NotificationChannel notificationChannelA = AbstractC10226zi0.a(string, "Playback Service", 2);
        notificationChannelA.setLockscreenVisibility(0);
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        if (notificationManager != null) {
            notificationManager.createNotificationChannel(notificationChannelA);
        }
        return string;
    }

    public static Notification e(final Context context, final int i, final String str, C2078Qw0.b bVar, boolean z, boolean z2, Class cls, int i2, final KQ kq) {
        final RemoteViews remoteViews = new RemoteViews(context.getPackageName(), AbstractC9815yD0.u0);
        i(context, remoteViews, bVar, z, z2, cls, i2, kq);
        Notification.Builder builderG = g(context, str);
        builderG.setContent(remoteViews);
        builderG.setOngoing(true);
        j(context, remoteViews, bVar, new InterfaceC5559j2() { // from class: com.daaw.Di0
            @Override // com.daaw.InterfaceC5559j2
            public final void a(Object obj) {
                AbstractC0857Fi0.b(kq, remoteViews, context, str, i, (Bitmap) obj);
            }
        }, kq);
        return builderG.build();
    }

    public static Notification f(Context context, int i, String str, C2078Qw0.b bVar, boolean z, boolean z2, Class cls, int i2, KQ kq) {
        return e(context, i, str, bVar, z, z2, cls, i2, kq);
    }

    public static Notification.Builder g(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) MainActivity.class);
        intent.setFlags(131072);
        PendingIntent activity = PendingIntent.getActivity(context, 0, intent, 67108864);
        Notification.Builder builderA = Build.VERSION.SDK_INT >= 26 ? AbstractC0328Ai0.a(context, str) : new Notification.Builder(context);
        builderA.setSmallIcon(AbstractC3374bD0.G);
        builderA.setContentIntent(activity);
        return builderA;
    }

    public static void h(Context context, int i, String str, C2078Qw0.b bVar, boolean z, boolean z2, Class cls, int i2, KQ kq) {
        ((NotificationManager) context.getSystemService("notification")).notify(i, f(context, i, str, bVar, z, z2, cls, i2, kq));
    }

    public static void i(Context context, RemoteViews remoteViews, C2078Qw0.b bVar, boolean z, boolean z2, Class cls, int i, KQ kq) {
        remoteViews.setImageViewResource(AbstractC5056hD0.w1, AbstractC3374bD0.q0);
        String str = bVar.e;
        String string = bVar.h;
        String str2 = bVar.f;
        if (string == null || string.equals("<unknown>")) {
            string = context.getString(JD0.R6);
        }
        if (str2 == null || str2.equals("<unknown>")) {
            context.getString(JD0.Q6);
        }
        int i2 = Build.VERSION.SDK_INT;
        remoteViews.setImageViewResource(AbstractC5056hD0.P, z2 ? AbstractC3374bD0.x : AbstractC3374bD0.z);
        ComponentName componentName = new ComponentName(context, (Class<?>) cls);
        Intent intent = new Intent("PREVIOUS_ACTION");
        int i3 = i2 >= 23 ? 67108864 : 0;
        intent.setComponent(componentName);
        remoteViews.setOnClickPendingIntent(AbstractC5056hD0.S, PendingIntent.getService(context, 0, intent, i3));
        Intent intent2 = new Intent("TOGGLE_PAUSE_ACTION");
        intent2.setComponent(componentName);
        remoteViews.setOnClickPendingIntent(AbstractC5056hD0.P, PendingIntent.getService(context, 0, intent2, i3));
        Intent intent3 = new Intent("NEXT_ACTION");
        intent3.setComponent(componentName);
        remoteViews.setOnClickPendingIntent(AbstractC5056hD0.M, PendingIntent.getService(context, 0, intent3, i3));
        Intent intent4 = new Intent("ACTIVITY_AND_SERVICE_EXIT_ACTION");
        intent4.setComponent(componentName);
        remoteViews.setOnClickPendingIntent(AbstractC5056hD0.v, PendingIntent.getService(context, 0, intent4, i3));
        remoteViews.setTextViewText(AbstractC5056hD0.e4, str);
        remoteViews.setTextViewText(AbstractC5056hD0.Z3, string);
    }

    public static void j(Context context, RemoteViews remoteViews, C2078Qw0.b bVar, InterfaceC5559j2 interfaceC5559j2, KQ kq) {
        new E3();
        a.a(context, new G3(bVar.a, bVar.d(), bVar.b()), new a(interfaceC5559j2), Integer.valueOf(RCHTTPStatusCodes.SUCCESS), Integer.valueOf(RCHTTPStatusCodes.SUCCESS));
    }
}
