package com.daaw;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Build;
import android.os.RemoteException;
import com.daaw.AbstractC1401Ko0;
import com.google.android.gms.ads.AdService;
import com.google.android.gms.ads.impl.R;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.overlay.zzl;
import com.google.android.gms.ads.internal.zzt;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;

/* JADX INFO: renamed from: com.daaw.wq2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class BinderC9431wq2 extends AbstractBinderC3419bO1 {
    public final Context B;
    public final C1071Hj2 C;
    public final C5680jT1 D;
    public final C6077kq2 E;
    public final InterfaceC6483mI2 F;
    public String G;
    public String H;

    public BinderC9431wq2(Context context, C6077kq2 c6077kq2, C5680jT1 c5680jT1, C1071Hj2 c1071Hj2, InterfaceC6483mI2 interfaceC6483mI2) {
        this.B = context;
        this.C = c1071Hj2;
        this.D = c5680jT1;
        this.E = c6077kq2;
        this.F = interfaceC6483mI2;
    }

    public static void a3(Context context, C1071Hj2 c1071Hj2, InterfaceC6483mI2 interfaceC6483mI2, C6077kq2 c6077kq2, String str, String str2, Map map) {
        String strB;
        String str3 = true != zzt.zzo().x(context) ? "offline" : "online";
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.r8)).booleanValue() || c1071Hj2 == null) {
            C6204lI2 c6204lI2B = C6204lI2.b(str2);
            c6204lI2B.a("gqi", str);
            c6204lI2B.a("device_connectivity", str3);
            c6204lI2B.a("event_timestamp", String.valueOf(zzt.zzB().a()));
            for (Map.Entry entry : map.entrySet()) {
                c6204lI2B.a((String) entry.getKey(), (String) entry.getValue());
            }
            strB = interfaceC6483mI2.b(c6204lI2B);
        } else {
            C0967Gj2 c0967Gj2A = c1071Hj2.a();
            c0967Gj2A.b("gqi", str);
            c0967Gj2A.b("action", str2);
            c0967Gj2A.b("device_connectivity", str3);
            c0967Gj2A.b("event_timestamp", String.valueOf(zzt.zzB().a()));
            for (Map.Entry entry2 : map.entrySet()) {
                c0967Gj2A.b((String) entry2.getKey(), (String) entry2.getValue());
            }
            strB = c0967Gj2A.f();
        }
        c6077kq2.j(new C6635mq2(zzt.zzB().a(), str, strB, 2));
    }

    public static String h3(int i, String str) {
        Resources resourcesD = zzt.zzo().d();
        return resourcesD == null ? str : resourcesD.getString(i);
    }

    public static final PendingIntent l3(Context context, String str, String str2, String str3) {
        Intent intent = new Intent();
        intent.setClassName(context, AdService.CLASS_NAME);
        intent.setAction(str);
        intent.putExtra("offline_notification_action", str);
        intent.putExtra("gws_query_id", str2);
        intent.putExtra("uri", str3);
        return GM2.a(context, 0, intent, GM2.a | 1073741824, 0);
    }

    private final void zzq() {
        try {
            zzt.zzp();
            if (com.google.android.gms.ads.internal.util.zzt.zzy(this.B).zzf(BinderC7744qp0.Z2(this.B), this.H, this.G)) {
                return;
            }
        } catch (RemoteException e) {
            AbstractC4274eT1.zzh("Failed to schedule offline notification poster.", e);
        }
        this.E.d(this.G);
        i3(this.G, "offline_notification_worker_not_scheduled", RP2.e());
    }

    @Override // com.daaw.InterfaceC3697cO1
    public final void H(InterfaceC7934rX interfaceC7934rX) {
        AbstractC0683Dq2 abstractC0683Dq2 = (AbstractC0683Dq2) BinderC7744qp0.I(interfaceC7934rX);
        final Activity activityA = abstractC0683Dq2.a();
        final zzl zzlVarB = abstractC0683Dq2.b();
        this.G = abstractC0683Dq2.c();
        this.H = abstractC0683Dq2.d();
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.k8)).booleanValue()) {
            j3(activityA, zzlVarB);
            return;
        }
        i3(this.G, "dialog_impression", RP2.e());
        zzt.zzp();
        AlertDialog.Builder builderZzJ = com.google.android.gms.ads.internal.util.zzt.zzJ(activityA);
        builderZzJ.setTitle(h3(R.string.offline_opt_in_title, "Open ad when you're back online.")).setMessage(h3(R.string.offline_opt_in_message, "We'll send you a notification with a link to the advertiser site.")).setPositiveButton(h3(R.string.offline_opt_in_confirm, "OK"), new DialogInterface.OnClickListener() { // from class: com.daaw.qq2
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.B.e3(activityA, zzlVarB, dialogInterface, i);
            }
        }).setNegativeButton(h3(R.string.offline_opt_in_decline, "No thanks"), new DialogInterface.OnClickListener() { // from class: com.daaw.rq2
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.B.f3(zzlVarB, dialogInterface, i);
            }
        }).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.daaw.sq2
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                this.B.g3(zzlVarB, dialogInterface);
            }
        });
        builderZzJ.create().show();
    }

    @Override // com.daaw.InterfaceC3697cO1
    public final void J(Intent intent) {
        String stringExtra = intent.getStringExtra("offline_notification_action");
        if (stringExtra.equals("offline_notification_clicked") || stringExtra.equals("offline_notification_dismissed")) {
            String stringExtra2 = intent.getStringExtra("gws_query_id");
            String stringExtra3 = intent.getStringExtra("uri");
            boolean zX = zzt.zzo().x(this.B);
            HashMap map = new HashMap();
            if (stringExtra.equals("offline_notification_clicked")) {
                map.put("offline_notification_action", "offline_notification_clicked");
                c = true == zX ? (char) 1 : (char) 2;
                map.put("obvs", String.valueOf(Build.VERSION.SDK_INT));
                map.put("olaih", String.valueOf(stringExtra3.startsWith("http")));
                try {
                    Intent launchIntentForPackage = this.B.getPackageManager().getLaunchIntentForPackage(stringExtra3);
                    if (launchIntentForPackage == null) {
                        launchIntentForPackage = new Intent("android.intent.action.VIEW");
                        launchIntentForPackage.setData(Uri.parse(stringExtra3));
                    }
                    launchIntentForPackage.addFlags(268435456);
                    this.B.startActivity(launchIntentForPackage);
                    map.put("olaa", "olas");
                } catch (ActivityNotFoundException unused) {
                    map.put("olaa", "olaf");
                }
            } else {
                map.put("offline_notification_action", "offline_notification_dismissed");
            }
            i3(stringExtra2, "offline_notification_action", map);
            try {
                SQLiteDatabase writableDatabase = this.E.getWritableDatabase();
                if (c == 1) {
                    this.E.s(writableDatabase, this.D, stringExtra2);
                } else {
                    C6077kq2.I(writableDatabase, stringExtra2);
                }
            } catch (SQLiteException e) {
                AbstractC4274eT1.zzg("Failed to get writable offline buffering database: ".concat(e.toString()));
            }
        }
    }

    @Override // com.daaw.InterfaceC3697cO1
    public final void T1(String[] strArr, int[] iArr, InterfaceC7934rX interfaceC7934rX) {
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].equals("android.permission.POST_NOTIFICATIONS")) {
                AbstractC0683Dq2 abstractC0683Dq2 = (AbstractC0683Dq2) BinderC7744qp0.I(interfaceC7934rX);
                Activity activityA = abstractC0683Dq2.a();
                zzl zzlVarB = abstractC0683Dq2.b();
                HashMap map = new HashMap();
                if (iArr[i] == 0) {
                    map.put("dialog_action", "confirm");
                    zzq();
                    k3(activityA, zzlVarB);
                } else {
                    map.put("dialog_action", "dismiss");
                    if (zzlVarB != null) {
                        zzlVarB.zzb();
                    }
                }
                i3(this.G, "asnpdc", map);
                return;
            }
        }
    }

    public final /* synthetic */ void b3(Activity activity, zzl zzlVar, DialogInterface dialogInterface, int i) {
        HashMap map = new HashMap();
        map.put("dialog_action", "confirm");
        i3(this.G, "rtsdc", map);
        activity.startActivity(zzt.zzq().zzg(activity));
        zzq();
        if (zzlVar != null) {
            zzlVar.zzb();
        }
    }

    public final /* synthetic */ void c3(zzl zzlVar, DialogInterface dialogInterface, int i) {
        this.E.d(this.G);
        HashMap map = new HashMap();
        map.put("dialog_action", "dismiss");
        i3(this.G, "rtsdc", map);
        if (zzlVar != null) {
            zzlVar.zzb();
        }
    }

    public final /* synthetic */ void d3(zzl zzlVar, DialogInterface dialogInterface) {
        this.E.d(this.G);
        HashMap map = new HashMap();
        map.put("dialog_action", "dismiss");
        i3(this.G, "rtsdc", map);
        if (zzlVar != null) {
            zzlVar.zzb();
        }
    }

    public final /* synthetic */ void e3(Activity activity, zzl zzlVar, DialogInterface dialogInterface, int i) {
        HashMap map = new HashMap();
        map.put("dialog_action", "confirm");
        i3(this.G, "dialog_click", map);
        j3(activity, zzlVar);
    }

    public final /* synthetic */ void f3(zzl zzlVar, DialogInterface dialogInterface, int i) {
        this.E.d(this.G);
        HashMap map = new HashMap();
        map.put("dialog_action", "dismiss");
        i3(this.G, "dialog_click", map);
        if (zzlVar != null) {
            zzlVar.zzb();
        }
    }

    public final /* synthetic */ void g3(zzl zzlVar, DialogInterface dialogInterface) {
        this.E.d(this.G);
        HashMap map = new HashMap();
        map.put("dialog_action", "dismiss");
        i3(this.G, "dialog_click", map);
        if (zzlVar != null) {
            zzlVar.zzb();
        }
    }

    public final void i3(String str, String str2, Map map) {
        a3(this.B, this.C, this.F, this.E, str, str2, map);
    }

    public final void j3(final Activity activity, final zzl zzlVar) {
        zzt.zzp();
        if (C1712No0.b(activity).a()) {
            zzq();
            k3(activity, zzlVar);
        } else {
            if (Build.VERSION.SDK_INT >= 33) {
                activity.requestPermissions(new String[]{"android.permission.POST_NOTIFICATIONS"}, 12345);
                i3(this.G, "asnpdi", RP2.e());
                return;
            }
            zzt.zzp();
            AlertDialog.Builder builderZzJ = com.google.android.gms.ads.internal.util.zzt.zzJ(activity);
            builderZzJ.setTitle(h3(R.string.notifications_permission_title, "Allow app to send you notifications?")).setPositiveButton(h3(R.string.notifications_permission_confirm, "Allow"), new DialogInterface.OnClickListener() { // from class: com.daaw.nq2
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    this.B.b3(activity, zzlVar, dialogInterface, i);
                }
            }).setNegativeButton(h3(R.string.notifications_permission_decline, "Don't allow"), new DialogInterface.OnClickListener() { // from class: com.daaw.oq2
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    this.B.c3(zzlVar, dialogInterface, i);
                }
            }).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.daaw.pq2
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    this.B.d3(zzlVar, dialogInterface);
                }
            });
            builderZzJ.create().show();
            i3(this.G, "rtsdi", RP2.e());
        }
    }

    public final void k3(Activity activity, final zzl zzlVar) {
        String strH3 = h3(R.string.offline_opt_in_confirmation, "You'll get a notification with the link when you're back online");
        zzt.zzp();
        AlertDialog.Builder builderZzJ = com.google.android.gms.ads.internal.util.zzt.zzJ(activity);
        builderZzJ.setMessage(strH3).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.daaw.tq2
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                zzl zzlVar2 = zzlVar;
                if (zzlVar2 != null) {
                    zzlVar2.zzb();
                }
            }
        });
        AlertDialog alertDialogCreate = builderZzJ.create();
        alertDialogCreate.show();
        Timer timer = new Timer();
        timer.schedule(new C8866uq2(this, alertDialogCreate, timer, zzlVar), 3000L);
    }

    @Override // com.daaw.InterfaceC3697cO1
    public final void v0(InterfaceC7934rX interfaceC7934rX, String str, String str2) {
        String str3;
        Context context = (Context) BinderC7744qp0.I(interfaceC7934rX);
        zzt.zzq().zzh(context, "offline_notification_channel", "AdMob Offline Notifications");
        AbstractC1401Ko0.d dVarN = new AbstractC1401Ko0.d(context, "offline_notification_channel").i(h3(R.string.offline_notification_title, "View the ad you saved when you were offline")).h(h3(R.string.offline_notification_text, "Tap to open ad")).e(true).j(l3(context, "offline_notification_dismissed", str2, str)).g(l3(context, "offline_notification_clicked", str2, str)).n(context.getApplicationInfo().icon);
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        HashMap map = new HashMap();
        try {
            notificationManager.notify(str2, 54321, dVarN.b());
            str3 = "offline_notification_impression";
        } catch (IllegalArgumentException e) {
            map.put("notification_not_shown_reason", e.getMessage());
            str3 = "offline_notification_failed";
        }
        i3(str2, str3, map);
    }

    @Override // com.daaw.InterfaceC3697cO1
    public final void zzh() {
        final C5680jT1 c5680jT1 = this.D;
        this.E.l(new InterfaceC9554xH2() { // from class: com.daaw.dq2
            @Override // com.daaw.InterfaceC9554xH2
            public final Object zza(Object obj) throws Throwable {
                C6077kq2.c(c5680jT1, (SQLiteDatabase) obj);
                return null;
            }
        });
    }
}
