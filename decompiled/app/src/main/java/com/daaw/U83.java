package com.daaw;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzcl;

/* JADX INFO: loaded from: classes3.dex */
public final class U83 {
    public final Context a;
    public String b;
    public String c;
    public String d;
    public Boolean e;
    public long f;
    public zzcl g;
    public boolean h;
    public final Long i;
    public String j;

    public U83(Context context, zzcl zzclVar, Long l) {
        this.h = true;
        AbstractC7506py0.l(context);
        Context applicationContext = context.getApplicationContext();
        AbstractC7506py0.l(applicationContext);
        this.a = applicationContext;
        this.i = l;
        if (zzclVar != null) {
            this.g = zzclVar;
            this.b = zzclVar.G;
            this.c = zzclVar.F;
            this.d = zzclVar.E;
            this.h = zzclVar.D;
            this.f = zzclVar.C;
            this.j = zzclVar.I;
            Bundle bundle = zzclVar.H;
            if (bundle != null) {
                this.e = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
