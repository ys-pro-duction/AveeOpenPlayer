package com.daaw;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.app.RemoteInput;
import android.content.Context;
import android.content.LocusId;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import com.daaw.AbstractC1401Ko0;
import com.google.android.gms.ads.AdRequest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.Lo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1505Lo0 implements InterfaceC1297Jo0 {
    public final Context a;
    public final Notification.Builder b;
    public final AbstractC1401Ko0.d c;
    public RemoteViews d;
    public RemoteViews e;
    public final List f = new ArrayList();
    public final Bundle g = new Bundle();
    public int h;
    public RemoteViews i;

    /* JADX INFO: renamed from: com.daaw.Lo0$a */
    public static class a {
        public static Notification.Builder a(Notification.Builder builder, Notification.Action action) {
            return builder.addAction(action);
        }

        public static Notification.Action.Builder b(Notification.Action.Builder builder, Bundle bundle) {
            return builder.addExtras(bundle);
        }

        public static Notification.Action.Builder c(Notification.Action.Builder builder, RemoteInput remoteInput) {
            return builder.addRemoteInput(remoteInput);
        }

        public static Notification.Action d(Notification.Action.Builder builder) {
            return builder.build();
        }

        public static Notification.Action.Builder e(int i, CharSequence charSequence, PendingIntent pendingIntent) {
            return new Notification.Action.Builder(i, charSequence, pendingIntent);
        }

        public static String f(Notification notification) {
            return notification.getGroup();
        }

        public static Notification.Builder g(Notification.Builder builder, String str) {
            return builder.setGroup(str);
        }

        public static Notification.Builder h(Notification.Builder builder, boolean z) {
            return builder.setGroupSummary(z);
        }

        public static Notification.Builder i(Notification.Builder builder, boolean z) {
            return builder.setLocalOnly(z);
        }

        public static Notification.Builder j(Notification.Builder builder, String str) {
            return builder.setSortKey(str);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Lo0$b */
    public static class b {
        public static Notification.Builder a(Notification.Builder builder, String str) {
            return builder.addPerson(str);
        }

        public static Notification.Builder b(Notification.Builder builder, String str) {
            return builder.setCategory(str);
        }

        public static Notification.Builder c(Notification.Builder builder, int i) {
            return builder.setColor(i);
        }

        public static Notification.Builder d(Notification.Builder builder, Notification notification) {
            return builder.setPublicVersion(notification);
        }

        public static Notification.Builder e(Notification.Builder builder, Uri uri, Object obj) {
            return builder.setSound(uri, (AudioAttributes) obj);
        }

        public static Notification.Builder f(Notification.Builder builder, int i) {
            return builder.setVisibility(i);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Lo0$c */
    public static class c {
        public static Notification.Action.Builder a(Icon icon, CharSequence charSequence, PendingIntent pendingIntent) {
            return new Notification.Action.Builder(icon, charSequence, pendingIntent);
        }

        public static Notification.Builder b(Notification.Builder builder, Icon icon) {
            return builder.setLargeIcon(icon);
        }

        public static Notification.Builder c(Notification.Builder builder, Object obj) {
            return builder.setSmallIcon((Icon) obj);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Lo0$d */
    public static class d {
        public static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z) {
            return builder.setAllowGeneratedReplies(z);
        }

        public static Notification.Builder b(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomBigContentView(remoteViews);
        }

        public static Notification.Builder c(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomContentView(remoteViews);
        }

        public static Notification.Builder d(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomHeadsUpContentView(remoteViews);
        }

        public static Notification.Builder e(Notification.Builder builder, CharSequence[] charSequenceArr) {
            return builder.setRemoteInputHistory(charSequenceArr);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Lo0$e */
    public static class e {
        public static Notification.Builder a(Context context, String str) {
            return new Notification.Builder(context, str);
        }

        public static Notification.Builder b(Notification.Builder builder, int i) {
            return builder.setBadgeIconType(i);
        }

        public static Notification.Builder c(Notification.Builder builder, boolean z) {
            return builder.setColorized(z);
        }

        public static Notification.Builder d(Notification.Builder builder, int i) {
            return builder.setGroupAlertBehavior(i);
        }

        public static Notification.Builder e(Notification.Builder builder, CharSequence charSequence) {
            return builder.setSettingsText(charSequence);
        }

        public static Notification.Builder f(Notification.Builder builder, String str) {
            return builder.setShortcutId(str);
        }

        public static Notification.Builder g(Notification.Builder builder, long j) {
            return builder.setTimeoutAfter(j);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Lo0$f */
    public static class f {
        public static Notification.Builder a(Notification.Builder builder, Person person) {
            return builder.addPerson(person);
        }

        public static Notification.Action.Builder b(Notification.Action.Builder builder, int i) {
            return builder.setSemanticAction(i);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Lo0$g */
    public static class g {
        public static Notification.Builder a(Notification.Builder builder, boolean z) {
            return builder.setAllowSystemGeneratedContextualActions(z);
        }

        public static Notification.Builder b(Notification.Builder builder, Notification.BubbleMetadata bubbleMetadata) {
            return builder.setBubbleMetadata(bubbleMetadata);
        }

        public static Notification.Action.Builder c(Notification.Action.Builder builder, boolean z) {
            return builder.setContextual(z);
        }

        public static Notification.Builder d(Notification.Builder builder, Object obj) {
            return builder.setLocusId((LocusId) obj);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Lo0$h */
    public static class h {
        public static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z) {
            return builder.setAuthenticationRequired(z);
        }

        public static Notification.Builder b(Notification.Builder builder, int i) {
            return builder.setForegroundServiceBehavior(i);
        }
    }

    public C1505Lo0(AbstractC1401Ko0.d dVar) {
        int i;
        Object obj;
        this.c = dVar;
        Context context = dVar.a;
        this.a = context;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 26) {
            this.b = e.a(context, dVar.K);
        } else {
            this.b = new Notification.Builder(dVar.a);
        }
        Notification notification = dVar.R;
        this.b.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, dVar.i).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(dVar.e).setContentText(dVar.f).setContentInfo(dVar.k).setContentIntent(dVar.g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(dVar.h, (notification.flags & 128) != 0).setNumber(dVar.l).setProgress(dVar.t, dVar.u, dVar.v);
        if (i2 < 23) {
            Notification.Builder builder = this.b;
            IconCompat iconCompat = dVar.j;
            builder.setLargeIcon(iconCompat == null ? null : iconCompat.c());
        } else {
            Notification.Builder builder2 = this.b;
            IconCompat iconCompat2 = dVar.j;
            c.b(builder2, iconCompat2 == null ? null : iconCompat2.l(context));
        }
        this.b.setSubText(dVar.q).setUsesChronometer(dVar.o).setPriority(dVar.m);
        Iterator it = dVar.b.iterator();
        while (it.hasNext()) {
            b((AbstractC1401Ko0.a) it.next());
        }
        Bundle bundle = dVar.D;
        if (bundle != null) {
            this.g.putAll(bundle);
        }
        int i3 = Build.VERSION.SDK_INT;
        this.d = dVar.H;
        this.e = dVar.I;
        this.b.setShowWhen(dVar.n);
        a.i(this.b, dVar.z);
        a.g(this.b, dVar.w);
        a.j(this.b, dVar.y);
        a.h(this.b, dVar.x);
        this.h = dVar.O;
        b.b(this.b, dVar.C);
        b.c(this.b, dVar.E);
        b.f(this.b, dVar.F);
        b.d(this.b, dVar.G);
        b.e(this.b, notification.sound, notification.audioAttributes);
        List listE = i3 < 28 ? e(f(dVar.c), dVar.U) : dVar.U;
        if (listE != null && !listE.isEmpty()) {
            Iterator it2 = listE.iterator();
            while (it2.hasNext()) {
                b.a(this.b, (String) it2.next());
            }
        }
        this.i = dVar.J;
        if (dVar.d.size() > 0) {
            Bundle bundle2 = dVar.c().getBundle("android.car.EXTENSIONS");
            bundle2 = bundle2 == null ? new Bundle() : bundle2;
            Bundle bundle3 = new Bundle(bundle2);
            Bundle bundle4 = new Bundle();
            for (int i4 = 0; i4 < dVar.d.size(); i4++) {
                bundle4.putBundle(Integer.toString(i4), AbstractC1608Mo0.a((AbstractC1401Ko0.a) dVar.d.get(i4)));
            }
            bundle2.putBundle("invisible_actions", bundle4);
            bundle3.putBundle("invisible_actions", bundle4);
            dVar.c().putBundle("android.car.EXTENSIONS", bundle2);
            this.g.putBundle("android.car.EXTENSIONS", bundle3);
        }
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 23 && (obj = dVar.T) != null) {
            c.c(this.b, obj);
        }
        if (i5 >= 24) {
            this.b.setExtras(dVar.D);
            d.e(this.b, dVar.s);
            RemoteViews remoteViews = dVar.H;
            if (remoteViews != null) {
                d.c(this.b, remoteViews);
            }
            RemoteViews remoteViews2 = dVar.I;
            if (remoteViews2 != null) {
                d.b(this.b, remoteViews2);
            }
            RemoteViews remoteViews3 = dVar.J;
            if (remoteViews3 != null) {
                d.d(this.b, remoteViews3);
            }
        }
        if (i5 >= 26) {
            e.b(this.b, dVar.L);
            e.e(this.b, dVar.r);
            e.f(this.b, dVar.M);
            e.g(this.b, dVar.N);
            e.d(this.b, dVar.O);
            if (dVar.B) {
                e.c(this.b, dVar.A);
            }
            if (!TextUtils.isEmpty(dVar.K)) {
                this.b.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i5 >= 28) {
            Iterator it3 = dVar.c.iterator();
            if (it3.hasNext()) {
                AbstractC6314li0.a(it3.next());
                throw null;
            }
        }
        if (i5 >= 29) {
            g.a(this.b, dVar.Q);
            g.b(this.b, AbstractC1401Ko0.c.a(null));
        }
        if (i5 >= 31 && (i = dVar.P) != 0) {
            h.b(this.b, i);
        }
        if (dVar.S) {
            if (this.c.x) {
                this.h = 2;
            } else {
                this.h = 1;
            }
            this.b.setVibrate(null);
            this.b.setSound(null);
            int i6 = notification.defaults & (-4);
            notification.defaults = i6;
            this.b.setDefaults(i6);
            if (i5 >= 26) {
                if (TextUtils.isEmpty(this.c.w)) {
                    a.g(this.b, "silent");
                }
                e.d(this.b, this.h);
            }
        }
    }

    public static List e(List list, List list2) {
        if (list == null) {
            return list2;
        }
        if (list2 == null) {
            return list;
        }
        C2823Ya c2823Ya = new C2823Ya(list.size() + list2.size());
        c2823Ya.addAll(list);
        c2823Ya.addAll(list2);
        return new ArrayList(c2823Ya);
    }

    public static List f(List list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            return arrayList;
        }
        AbstractC6314li0.a(it.next());
        throw null;
    }

    @Override // com.daaw.InterfaceC1297Jo0
    public Notification.Builder a() {
        return this.b;
    }

    public final void b(AbstractC1401Ko0.a aVar) {
        int i = Build.VERSION.SDK_INT;
        IconCompat iconCompatD = aVar.d();
        Notification.Action.Builder builderA = i >= 23 ? c.a(iconCompatD != null ? iconCompatD.k() : null, aVar.h(), aVar.a()) : a.e(iconCompatD != null ? iconCompatD.d() : 0, aVar.h(), aVar.a());
        if (aVar.e() != null) {
            for (RemoteInput remoteInput : LG0.b(aVar.e())) {
                a.c(builderA, remoteInput);
            }
        }
        Bundle bundle = aVar.c() != null ? new Bundle(aVar.c()) : new Bundle();
        bundle.putBoolean("android.support.allowGeneratedReplies", aVar.b());
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 24) {
            d.a(builderA, aVar.b());
        }
        bundle.putInt("android.support.action.semanticAction", aVar.f());
        if (i2 >= 28) {
            f.b(builderA, aVar.f());
        }
        if (i2 >= 29) {
            g.c(builderA, aVar.j());
        }
        if (i2 >= 31) {
            h.a(builderA, aVar.i());
        }
        bundle.putBoolean("android.support.action.showsUserInterface", aVar.g());
        a.b(builderA, bundle);
        a.a(this.b, a.d(builderA));
    }

    public Notification c() {
        Bundle bundleA;
        RemoteViews remoteViewsF;
        RemoteViews remoteViewsD;
        AbstractC1401Ko0.e eVar = this.c.p;
        if (eVar != null) {
            eVar.b(this);
        }
        RemoteViews remoteViewsE = eVar != null ? eVar.e(this) : null;
        Notification notificationD = d();
        if (remoteViewsE != null) {
            notificationD.contentView = remoteViewsE;
        } else {
            RemoteViews remoteViews = this.c.H;
            if (remoteViews != null) {
                notificationD.contentView = remoteViews;
            }
        }
        if (eVar != null && (remoteViewsD = eVar.d(this)) != null) {
            notificationD.bigContentView = remoteViewsD;
        }
        if (eVar != null && (remoteViewsF = this.c.p.f(this)) != null) {
            notificationD.headsUpContentView = remoteViewsF;
        }
        if (eVar != null && (bundleA = AbstractC1401Ko0.a(notificationD)) != null) {
            eVar.a(bundleA);
        }
        return notificationD;
    }

    public Notification d() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            return this.b.build();
        }
        if (i >= 24) {
            Notification notificationBuild = this.b.build();
            if (this.h != 0) {
                if (a.f(notificationBuild) != null && (notificationBuild.flags & AdRequest.MAX_CONTENT_URL_LENGTH) != 0 && this.h == 2) {
                    g(notificationBuild);
                }
                if (a.f(notificationBuild) != null && (notificationBuild.flags & AdRequest.MAX_CONTENT_URL_LENGTH) == 0 && this.h == 1) {
                    g(notificationBuild);
                }
            }
            return notificationBuild;
        }
        this.b.setExtras(this.g);
        Notification notificationBuild2 = this.b.build();
        RemoteViews remoteViews = this.d;
        if (remoteViews != null) {
            notificationBuild2.contentView = remoteViews;
        }
        RemoteViews remoteViews2 = this.e;
        if (remoteViews2 != null) {
            notificationBuild2.bigContentView = remoteViews2;
        }
        RemoteViews remoteViews3 = this.i;
        if (remoteViews3 != null) {
            notificationBuild2.headsUpContentView = remoteViews3;
        }
        if (this.h != 0) {
            if (a.f(notificationBuild2) != null && (notificationBuild2.flags & AdRequest.MAX_CONTENT_URL_LENGTH) != 0 && this.h == 2) {
                g(notificationBuild2);
            }
            if (a.f(notificationBuild2) != null && (notificationBuild2.flags & AdRequest.MAX_CONTENT_URL_LENGTH) == 0 && this.h == 1) {
                g(notificationBuild2);
            }
        }
        return notificationBuild2;
    }

    public final void g(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        notification.defaults &= -4;
    }
}
