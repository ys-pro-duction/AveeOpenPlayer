package com.daaw;

import android.content.Context;
import android.content.Intent;
import android.os.Environment;
import com.google.android.gms.ads.internal.util.zzch;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.daaw.dE1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3936dE1 {
    public final Context a;

    public C3936dE1(Context context) {
        AbstractC7506py0.m(context, "Context can not be null");
        this.a = context;
    }

    public final boolean a(Intent intent) {
        AbstractC7506py0.m(intent, "Intent can not be null");
        return !this.a.getPackageManager().queryIntentActivities(intent, 0).isEmpty();
    }

    public final boolean b() {
        return a(new Intent("android.intent.action.INSERT").setType("vnd.android.cursor.dir/event"));
    }

    public final boolean c() {
        return ((Boolean) zzch.zza(this.a, new Callable() { // from class: com.daaw.cE1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Boolean.valueOf("mounted".equals(Environment.getExternalStorageState()));
            }
        })).booleanValue() && C6878nj1.a(this.a).a("android.permission.WRITE_EXTERNAL_STORAGE") == 0;
    }
}
