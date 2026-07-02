package com.daaw;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.zzt;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class FN1 extends GN1 implements HI1 {
    public final InterfaceC9334wW1 c;
    public final Context d;
    public final WindowManager e;
    public final C3936dE1 f;
    public DisplayMetrics g;
    public float h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;

    public FN1(InterfaceC9334wW1 interfaceC9334wW1, Context context, C3936dE1 c3936dE1) {
        super(interfaceC9334wW1, "");
        this.i = -1;
        this.j = -1;
        this.l = -1;
        this.m = -1;
        this.n = -1;
        this.o = -1;
        this.c = interfaceC9334wW1;
        this.d = context;
        this.f = c3936dE1;
        this.e = (WindowManager) context.getSystemService("window");
    }

    @Override // com.daaw.HI1
    public final /* synthetic */ void a(Object obj, Map map) {
        JSONObject jSONObjectPut;
        this.g = new DisplayMetrics();
        Display defaultDisplay = this.e.getDefaultDisplay();
        defaultDisplay.getMetrics(this.g);
        this.h = this.g.density;
        this.k = defaultDisplay.getRotation();
        zzay.zzb();
        DisplayMetrics displayMetrics = this.g;
        this.i = XS1.z(displayMetrics, displayMetrics.widthPixels);
        zzay.zzb();
        DisplayMetrics displayMetrics2 = this.g;
        this.j = XS1.z(displayMetrics2, displayMetrics2.heightPixels);
        Activity activityZzi = this.c.zzi();
        if (activityZzi == null || activityZzi.getWindow() == null) {
            this.l = this.i;
            this.m = this.j;
        } else {
            zzt.zzp();
            int[] iArrZzP = com.google.android.gms.ads.internal.util.zzt.zzP(activityZzi);
            zzay.zzb();
            this.l = XS1.z(this.g, iArrZzP[0]);
            zzay.zzb();
            this.m = XS1.z(this.g, iArrZzP[1]);
        }
        if (this.c.zzO().i()) {
            this.n = this.i;
            this.o = this.j;
        } else {
            this.c.measure(0, 0);
        }
        e(this.i, this.j, this.l, this.m, this.h, this.k);
        EN1 en1 = new EN1();
        C3936dE1 c3936dE1 = this.f;
        Intent intent = new Intent("android.intent.action.DIAL");
        intent.setData(Uri.parse("tel:"));
        en1.e(c3936dE1.a(intent));
        C3936dE1 c3936dE12 = this.f;
        Intent intent2 = new Intent("android.intent.action.VIEW");
        intent2.setData(Uri.parse("sms:"));
        en1.c(c3936dE12.a(intent2));
        en1.a(this.f.b());
        en1.d(this.f.c());
        en1.b(true);
        boolean z = en1.a;
        boolean z2 = en1.b;
        boolean z3 = en1.c;
        boolean z4 = en1.d;
        boolean z5 = en1.e;
        InterfaceC9334wW1 interfaceC9334wW1 = this.c;
        try {
            jSONObjectPut = new JSONObject().put("sms", z).put("tel", z2).put("calendar", z3).put("storePicture", z4).put("inlineVideo", z5);
        } catch (JSONException e) {
            AbstractC4274eT1.zzh("Error occurred while obtaining the MRAID capabilities.", e);
            jSONObjectPut = null;
        }
        interfaceC9334wW1.l("onDeviceFeaturesReceived", jSONObjectPut);
        int[] iArr = new int[2];
        this.c.getLocationOnScreen(iArr);
        h(zzay.zzb().f(this.d, iArr[0]), zzay.zzb().f(this.d, iArr[1]));
        if (AbstractC4274eT1.zzm(2)) {
            AbstractC4274eT1.zzi("Dispatching Ready Event.");
        }
        d(this.c.zzn().B);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x006b A[PHI: r3
  0x006b: PHI (r3v1 int) = (r3v0 int), (r3v4 int) binds: [B:11:0x0042, B:17:0x0058] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(int r7, int r8) {
        /*
            r6 = this;
            android.content.Context r0 = r6.d
            boolean r1 = r0 instanceof android.app.Activity
            r2 = 0
            if (r1 == 0) goto L13
            com.google.android.gms.ads.internal.zzt.zzp()
            android.app.Activity r0 = (android.app.Activity) r0
            int[] r0 = com.google.android.gms.ads.internal.util.zzt.zzQ(r0)
            r0 = r0[r2]
            goto L14
        L13:
            r0 = 0
        L14:
            com.daaw.wW1 r1 = r6.c
            com.daaw.tX1 r1 = r1.zzO()
            if (r1 == 0) goto L28
            com.daaw.wW1 r1 = r6.c
            com.daaw.tX1 r1 = r1.zzO()
            boolean r1 = r1.i()
            if (r1 != 0) goto L84
        L28:
            com.daaw.wW1 r1 = r6.c
            int r3 = r1.getWidth()
            int r1 = r1.getHeight()
            com.daaw.qE1 r4 = com.daaw.AbstractC9820yE1.R
            com.daaw.wE1 r5 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r4 = r5.b(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L6b
            if (r3 != 0) goto L58
            com.daaw.wW1 r3 = r6.c
            com.daaw.tX1 r3 = r3.zzO()
            if (r3 == 0) goto L57
            com.daaw.wW1 r3 = r6.c
            com.daaw.tX1 r3 = r3.zzO()
            int r3 = r3.c
            goto L58
        L57:
            r3 = 0
        L58:
            if (r1 != 0) goto L6b
            com.daaw.wW1 r1 = r6.c
            com.daaw.tX1 r1 = r1.zzO()
            if (r1 == 0) goto L6c
            com.daaw.wW1 r1 = r6.c
            com.daaw.tX1 r1 = r1.zzO()
            int r2 = r1.b
            goto L6c
        L6b:
            r2 = r1
        L6c:
            android.content.Context r1 = r6.d
            com.daaw.XS1 r4 = com.google.android.gms.ads.internal.client.zzay.zzb()
            int r1 = r4.f(r1, r3)
            r6.n = r1
            android.content.Context r1 = r6.d
            com.daaw.XS1 r3 = com.google.android.gms.ads.internal.client.zzay.zzb()
            int r1 = r3.f(r1, r2)
            r6.o = r1
        L84:
            int r0 = r8 - r0
            int r1 = r6.n
            int r2 = r6.o
            r6.b(r7, r0, r1, r2)
            com.daaw.wW1 r0 = r6.c
            com.daaw.rX1 r0 = r0.zzN()
            r0.y(r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.FN1.h(int, int):void");
    }
}
