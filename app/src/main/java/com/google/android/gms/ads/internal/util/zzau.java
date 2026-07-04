package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.PointF;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import com.daaw.AbstractC4274eT1;
import com.daaw.AbstractC9322wT1;
import com.daaw.AbstractC9820yE1;
import com.daaw.C7447pl2;
import com.daaw.EnumC6331ll2;
import com.daaw.PS2;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class zzau {
    public final Context a;
    public final C7447pl2 b;
    public String c;
    public String d;
    public String e;
    public String f;
    public int g;
    public int h;
    public PointF i;
    public PointF j;
    public Handler k;
    public Runnable l;

    public zzau(Context context) {
        this.g = 0;
        this.l = new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzah
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.g();
            }
        };
        this.a = context;
        this.h = ViewConfiguration.get(context).getScaledTouchSlop();
        com.google.android.gms.ads.internal.zzt.zzt().zzb();
        this.k = com.google.android.gms.ads.internal.zzt.zzt().zza();
        this.b = com.google.android.gms.ads.internal.zzt.zzs().zza();
    }

    public static final int o(List list, String str, boolean z) {
        if (!z) {
            return -1;
        }
        list.add(str);
        return list.size() - 1;
    }

    public final /* synthetic */ void a() {
        m(this.a);
    }

    public final /* synthetic */ void b() {
        m(this.a);
    }

    public final /* synthetic */ void c(PS2 ps2) {
        if (com.google.android.gms.ads.internal.zzt.zzs().zzj(this.a, this.d, this.e)) {
            ps2.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzan
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.b();
                }
            });
        } else {
            com.google.android.gms.ads.internal.zzt.zzs().zzd(this.a, this.d, this.e);
        }
    }

    public final /* synthetic */ void d(PS2 ps2) {
        if (com.google.android.gms.ads.internal.zzt.zzs().zzj(this.a, this.d, this.e)) {
            ps2.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzam
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.f();
                }
            });
        } else {
            com.google.android.gms.ads.internal.zzt.zzs().zzd(this.a, this.d, this.e);
        }
    }

    public final /* synthetic */ void e() {
        com.google.android.gms.ads.internal.zzt.zzs().zzc(this.a);
    }

    public final /* synthetic */ void f() {
        com.google.android.gms.ads.internal.zzt.zzs().zzc(this.a);
    }

    public final /* synthetic */ void g() {
        this.g = 4;
        zzr();
    }

    public final /* synthetic */ void h(AtomicInteger atomicInteger, int i, int i2, int i3, DialogInterface dialogInterface, int i4) {
        if (atomicInteger.get() != i) {
            if (atomicInteger.get() == i2) {
                this.b.l(EnumC6331ll2.SHAKE);
            } else if (atomicInteger.get() == i3) {
                this.b.l(EnumC6331ll2.FLICK);
            } else {
                this.b.l(EnumC6331ll2.NONE);
            }
        }
        zzr();
    }

    public final /* synthetic */ void i(String str, DialogInterface dialogInterface, int i) {
        com.google.android.gms.ads.internal.zzt.zzp();
        zzt.zzS(this.a, Intent.createChooser(new Intent("android.intent.action.SEND").setType("text/plain").putExtra("android.intent.extra.TEXT", str), "Share via"));
    }

    public final /* synthetic */ void j(int i, int i2, int i3, int i4, int i5, DialogInterface dialogInterface, int i6) {
        if (i6 != i) {
            if (i6 == i2) {
                AbstractC4274eT1.zze("Debug mode [Creative Preview] selected.");
                AbstractC9322wT1.a.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzai
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.l();
                    }
                });
                return;
            }
            if (i6 == i3) {
                AbstractC4274eT1.zze("Debug mode [Troubleshooting] selected.");
                AbstractC9322wT1.a.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzag
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.k();
                    }
                });
                return;
            }
            if (i6 == i4) {
                C7447pl2 c7447pl2 = this.b;
                final PS2 ps2 = AbstractC9322wT1.e;
                PS2 ps22 = AbstractC9322wT1.a;
                if (c7447pl2.p()) {
                    ps2.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzat
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.zza.e();
                        }
                    });
                    return;
                } else {
                    ps22.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzaf
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.zza.d(ps2);
                        }
                    });
                    return;
                }
            }
            if (i6 == i5) {
                C7447pl2 c7447pl22 = this.b;
                final PS2 ps23 = AbstractC9322wT1.e;
                PS2 ps24 = AbstractC9322wT1.a;
                if (c7447pl22.p()) {
                    ps23.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzae
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.zza.a();
                        }
                    });
                    return;
                } else {
                    ps24.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzal
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.zza.c(ps23);
                        }
                    });
                    return;
                }
            }
            return;
        }
        if (!(this.a instanceof Activity)) {
            AbstractC4274eT1.zzi("Can not create dialog without Activity Context");
            return;
        }
        String str = this.c;
        final String str2 = "No debug information";
        if (!TextUtils.isEmpty(str)) {
            Uri uriBuild = new Uri.Builder().encodedQuery(str.replaceAll("\\+", "%20")).build();
            StringBuilder sb = new StringBuilder();
            com.google.android.gms.ads.internal.zzt.zzp();
            Map mapZzO = zzt.zzO(uriBuild);
            for (String str3 : mapZzO.keySet()) {
                sb.append(str3);
                sb.append(" = ");
                sb.append((String) mapZzO.get(str3));
                sb.append("\n\n");
            }
            String strTrim = sb.toString().trim();
            if (!TextUtils.isEmpty(strTrim)) {
                str2 = strTrim;
            }
        }
        com.google.android.gms.ads.internal.zzt.zzp();
        AlertDialog.Builder builderZzJ = zzt.zzJ(this.a);
        builderZzJ.setMessage(str2);
        builderZzJ.setTitle("Ad Information");
        builderZzJ.setPositiveButton("Share", new DialogInterface.OnClickListener() { // from class: com.google.android.gms.ads.internal.util.zzaj
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface2, int i7) {
                this.zza.i(str2, dialogInterface2, i7);
            }
        });
        builderZzJ.setNegativeButton("Close", new DialogInterface.OnClickListener() { // from class: com.google.android.gms.ads.internal.util.zzak
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface2, int i7) {
            }
        });
        builderZzJ.create().show();
    }

    public final /* synthetic */ void k() {
        zzay zzayVarZzs = com.google.android.gms.ads.internal.zzt.zzs();
        String str = this.d;
        String str2 = this.e;
        String str3 = this.f;
        boolean zZzm = zzayVarZzs.zzm();
        Context context = this.a;
        zzayVarZzs.zzh(zzayVarZzs.zzj(context, str, str2));
        if (!zzayVarZzs.zzm()) {
            zzayVarZzs.zzd(context, str, str2);
            return;
        }
        if (!zZzm && !TextUtils.isEmpty(str3)) {
            zzayVarZzs.zze(context, str2, str3, str);
        }
        AbstractC4274eT1.zze("Device is linked for debug signals.");
        zzayVarZzs.a(context, "The device is successfully linked for troubleshooting.", false, true);
    }

    public final /* synthetic */ void l() {
        zzay zzayVarZzs = com.google.android.gms.ads.internal.zzt.zzs();
        Context context = this.a;
        String str = this.d;
        String str2 = this.e;
        if (!zzayVarZzs.b(context, str, str2)) {
            zzayVarZzs.a(context, "In-app preview failed to load because of a system error. Please try again later.", true, true);
            return;
        }
        if ("2".equals(zzayVarZzs.f)) {
            AbstractC4274eT1.zze("Creative is not pushed for this device.");
            zzayVarZzs.a(context, "There was no creative pushed from DFP to the device.", false, false);
        } else if ("1".equals(zzayVarZzs.f)) {
            AbstractC4274eT1.zze("The app is not linked for creative preview.");
            zzayVarZzs.zzd(context, str, str2);
        } else if ("0".equals(zzayVarZzs.f)) {
            AbstractC4274eT1.zze("Device is linked for in app preview.");
            zzayVarZzs.a(context, "The device is successfully linked for creative preview.", false, true);
        }
    }

    public final void m(Context context) {
        ArrayList arrayList = new ArrayList();
        int iO = o(arrayList, "None", true);
        final int iO2 = o(arrayList, "Shake", true);
        final int iO3 = o(arrayList, "Flick", true);
        EnumC6331ll2 enumC6331ll2 = EnumC6331ll2.NONE;
        int iOrdinal = this.b.a().ordinal();
        final int i = iOrdinal != 1 ? iOrdinal != 2 ? iO : iO3 : iO2;
        com.google.android.gms.ads.internal.zzt.zzp();
        AlertDialog.Builder builderZzJ = zzt.zzJ(context);
        final AtomicInteger atomicInteger = new AtomicInteger(i);
        builderZzJ.setTitle("Setup gesture");
        builderZzJ.setSingleChoiceItems((CharSequence[]) arrayList.toArray(new String[0]), i, new DialogInterface.OnClickListener() { // from class: com.google.android.gms.ads.internal.util.zzap
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                atomicInteger.set(i2);
            }
        });
        builderZzJ.setNegativeButton("Dismiss", new DialogInterface.OnClickListener() { // from class: com.google.android.gms.ads.internal.util.zzaq
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                this.zza.zzr();
            }
        });
        builderZzJ.setPositiveButton("Save", new DialogInterface.OnClickListener() { // from class: com.google.android.gms.ads.internal.util.zzar
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                this.zza.h(atomicInteger, i, iO2, iO3, dialogInterface, i2);
            }
        });
        builderZzJ.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.google.android.gms.ads.internal.util.zzas
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                this.zza.zzr();
            }
        });
        builderZzJ.create().show();
    }

    public final boolean n(float f, float f2, float f3, float f4) {
        return Math.abs(this.i.x - f) < ((float) this.h) && Math.abs(this.i.y - f2) < ((float) this.h) && Math.abs(this.j.x - f3) < ((float) this.h) && Math.abs(this.j.y - f4) < ((float) this.h);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append("{Dialog: ");
        sb.append(this.c);
        sb.append(",DebugSignal: ");
        sb.append(this.f);
        sb.append(",AFMA Version: ");
        sb.append(this.e);
        sb.append(",Ad Unit ID: ");
        sb.append(this.d);
        sb.append("}");
        return sb.toString();
    }

    public final void zzm(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        int historySize = motionEvent.getHistorySize();
        int pointerCount = motionEvent.getPointerCount();
        if (actionMasked == 0) {
            this.g = 0;
            this.i = new PointF(motionEvent.getX(0), motionEvent.getY(0));
            return;
        }
        int i = this.g;
        if (i == -1) {
            return;
        }
        if (i == 0) {
            if (actionMasked == 5) {
                this.g = 5;
                this.j = new PointF(motionEvent.getX(1), motionEvent.getY(1));
                this.k.postDelayed(this.l, ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().b(AbstractC9820yE1.z4)).longValue());
                return;
            }
            return;
        }
        if (i == 5) {
            if (pointerCount == 2) {
                if (actionMasked != 2) {
                    return;
                }
                boolean z = false;
                for (int i2 = 0; i2 < historySize; i2++) {
                    z |= !n(motionEvent.getHistoricalX(0, i2), motionEvent.getHistoricalY(0, i2), motionEvent.getHistoricalX(1, i2), motionEvent.getHistoricalY(1, i2));
                }
                if (n(motionEvent.getX(), motionEvent.getY(), motionEvent.getX(1), motionEvent.getY(1)) && !z) {
                    return;
                }
            }
            this.g = -1;
            this.k.removeCallbacks(this.l);
        }
    }

    public final void zzn(String str) {
        this.d = str;
    }

    public final void zzo(String str) {
        this.e = str;
    }

    public final void zzp(String str) {
        this.c = str;
    }

    public final void zzq(String str) {
        this.f = str;
    }

    public final void zzr() {
        try {
            if (!(this.a instanceof Activity)) {
                AbstractC4274eT1.zzi("Can not create dialog without Activity Context");
                return;
            }
            String str = "Creative preview (enabled)";
            if (true == TextUtils.isEmpty(com.google.android.gms.ads.internal.zzt.zzs().zzb())) {
                str = "Creative preview";
            }
            String str2 = true != com.google.android.gms.ads.internal.zzt.zzs().zzm() ? "Troubleshooting" : "Troubleshooting (enabled)";
            ArrayList arrayList = new ArrayList();
            final int iO = o(arrayList, "Ad information", true);
            final int iO2 = o(arrayList, str, true);
            final int iO3 = o(arrayList, str2, true);
            boolean zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().b(AbstractC9820yE1.U8)).booleanValue();
            final int iO4 = o(arrayList, "Open ad inspector", zBooleanValue);
            final int iO5 = o(arrayList, "Ad inspector settings", zBooleanValue);
            com.google.android.gms.ads.internal.zzt.zzp();
            AlertDialog.Builder builderZzJ = zzt.zzJ(this.a);
            builderZzJ.setTitle("Select a debug mode").setItems((CharSequence[]) arrayList.toArray(new String[0]), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.ads.internal.util.zzao
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    this.zza.j(iO, iO2, iO3, iO4, iO5, dialogInterface, i);
                }
            });
            builderZzJ.create().show();
        } catch (WindowManager.BadTokenException e) {
            zze.zzb("", e);
        }
    }

    public zzau(Context context, String str) {
        this(context);
        this.c = str;
    }
}
