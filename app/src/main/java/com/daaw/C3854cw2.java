package com.daaw;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.zzt;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.cw2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3854cw2 implements InterfaceC1343Jz2 {
    public final Context a;
    public final zzq b;
    public final List c;

    public C3854cw2(Context context, zzq zzqVar, List list) {
        this.a = context;
        this.b = zzqVar;
        this.c = list;
    }

    @Override // com.daaw.InterfaceC1343Jz2
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        List<ActivityManager.RunningTaskInfo> runningTasks;
        ActivityManager.RunningTaskInfo runningTaskInfo;
        Bundle bundle = (Bundle) obj;
        if (((Boolean) FF1.a.e()).booleanValue()) {
            Bundle bundle2 = new Bundle();
            zzt.zzp();
            String className = null;
            try {
                ActivityManager activityManager = (ActivityManager) this.a.getSystemService("activity");
                if (activityManager != null && (runningTasks = activityManager.getRunningTasks(1)) != null && !runningTasks.isEmpty() && (runningTaskInfo = runningTasks.get(0)) != null && runningTaskInfo.topActivity != null) {
                    className = runningTaskInfo.topActivity.getClassName();
                }
            } catch (Exception unused) {
            }
            bundle2.putString("activity", className);
            Bundle bundle3 = new Bundle();
            bundle3.putInt("width", this.b.zze);
            bundle3.putInt("height", this.b.zzb);
            bundle2.putBundle("size", bundle3);
            if (!this.c.isEmpty()) {
                List list = this.c;
                bundle2.putParcelableArray("parents", (Parcelable[]) list.toArray(new Parcelable[list.size()]));
            }
            bundle.putBundle("view_hierarchy", bundle2);
        }
    }
}
