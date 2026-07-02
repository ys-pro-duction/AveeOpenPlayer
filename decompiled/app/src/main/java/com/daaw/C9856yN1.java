package com.daaw;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.provider.CalendarContract;
import android.text.TextUtils;
import com.google.android.gms.ads.impl.R;
import com.google.android.gms.ads.internal.zzt;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.yN1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9856yN1 extends GN1 {
    public final Map c;
    public final Context d;
    public final String e;
    public final long f;
    public final long g;
    public final String h;
    public final String i;

    public C9856yN1(InterfaceC9334wW1 interfaceC9334wW1, Map map) {
        super(interfaceC9334wW1, "createCalendarEvent");
        this.c = map;
        this.d = interfaceC9334wW1.zzi();
        this.e = l("description");
        this.h = l("summary");
        this.f = k("start_ticks");
        this.g = k("end_ticks");
        this.i = l("location");
    }

    public final Intent i() {
        Intent data = new Intent("android.intent.action.EDIT").setData(CalendarContract.Events.CONTENT_URI);
        data.putExtra("title", this.e);
        data.putExtra("eventLocation", this.i);
        data.putExtra("description", this.h);
        long j = this.f;
        if (j > -1) {
            data.putExtra("beginTime", j);
        }
        long j2 = this.g;
        if (j2 > -1) {
            data.putExtra("endTime", j2);
        }
        data.setFlags(268435456);
        return data;
    }

    public final void j() {
        if (this.d == null) {
            c("Activity context is not available.");
            return;
        }
        zzt.zzp();
        if (!new C3936dE1(this.d).b()) {
            c("This feature is not available on the device.");
            return;
        }
        zzt.zzp();
        AlertDialog.Builder builderZzJ = com.google.android.gms.ads.internal.util.zzt.zzJ(this.d);
        Resources resourcesD = zzt.zzo().d();
        builderZzJ.setTitle(resourcesD != null ? resourcesD.getString(R.string.s5) : "Create calendar event");
        builderZzJ.setMessage(resourcesD != null ? resourcesD.getString(R.string.s6) : "Allow Ad to create a calendar event?");
        builderZzJ.setPositiveButton(resourcesD != null ? resourcesD.getString(R.string.s3) : "Accept", new DialogInterfaceOnClickListenerC9298wN1(this));
        builderZzJ.setNegativeButton(resourcesD != null ? resourcesD.getString(R.string.s4) : "Decline", new DialogInterfaceOnClickListenerC9577xN1(this));
        builderZzJ.create().show();
    }

    public final long k(String str) {
        String str2 = (String) this.c.get(str);
        if (str2 == null) {
            return -1L;
        }
        try {
            return Long.parseLong(str2);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    public final String l(String str) {
        return TextUtils.isEmpty((CharSequence) this.c.get(str)) ? "" : (String) this.c.get(str);
    }
}
