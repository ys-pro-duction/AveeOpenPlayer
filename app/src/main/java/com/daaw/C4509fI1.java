package com.daaw;

import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.zzt;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.fI1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4509fI1 implements HI1 {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.daaw.HI1
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        InterfaceC9334wW1 interfaceC9334wW1 = (InterfaceC9334wW1) obj;
        WindowManager windowManager = (WindowManager) interfaceC9334wW1.getContext().getSystemService("window");
        zzt.zzp();
        DisplayMetrics displayMetricsZzs = com.google.android.gms.ads.internal.util.zzt.zzs(windowManager);
        int i = displayMetricsZzs.widthPixels;
        int i2 = displayMetricsZzs.heightPixels;
        int[] iArr = new int[2];
        HashMap map2 = new HashMap();
        ((View) interfaceC9334wW1).getLocationInWindow(iArr);
        map2.put("xInPixels", Integer.valueOf(iArr[0]));
        map2.put("yInPixels", Integer.valueOf(iArr[1]));
        map2.put("windowWidthInPixels", Integer.valueOf(i));
        map2.put("windowHeightInPixels", Integer.valueOf(i2));
        interfaceC9334wW1.U("locationReady", map2);
        AbstractC4274eT1.zzj("GET LOCATION COMPILED");
    }
}
