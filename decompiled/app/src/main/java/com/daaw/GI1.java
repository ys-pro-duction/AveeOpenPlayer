package com.daaw;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzca;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public abstract class GI1 {
    public static final HI1 a = new HI1() { // from class: com.daaw.YH1
        @Override // com.daaw.HI1
        public final void a(Object obj, Map map) {
            InterfaceC4579fX1 interfaceC4579fX1 = (InterfaceC4579fX1) obj;
            HI1 hi1 = GI1.a;
            String str = (String) map.get("urls");
            if (TextUtils.isEmpty(str)) {
                AbstractC4274eT1.zzj("URLs missing in canOpenURLs GMSG.");
                return;
            }
            String[] strArrSplit = str.split(",");
            HashMap map2 = new HashMap();
            PackageManager packageManager = interfaceC4579fX1.getContext().getPackageManager();
            for (String str2 : strArrSplit) {
                String[] strArrSplit2 = str2.split(";", 2);
                Boolean boolValueOf = Boolean.valueOf(packageManager.resolveActivity(new Intent(strArrSplit2.length > 1 ? strArrSplit2[1].trim() : "android.intent.action.VIEW", Uri.parse(strArrSplit2[0].trim())), 65536) != null);
                map2.put(str2, boolValueOf);
                zze.zza("/canOpenURLs;" + str2 + ";" + boolValueOf);
            }
            ((InterfaceC7327pK1) interfaceC4579fX1).U("openableURLs", map2);
        }
    };
    public static final HI1 b = new HI1() { // from class: com.daaw.aI1
        @Override // com.daaw.HI1
        public final void a(Object obj, Map map) {
            InterfaceC4579fX1 interfaceC4579fX1 = (InterfaceC4579fX1) obj;
            HI1 hi1 = GI1.a;
            if (!((Boolean) zzba.zzc().b(AbstractC9820yE1.Y7)).booleanValue()) {
                AbstractC4274eT1.zzj("canOpenAppGmsgHandler disabled.");
                return;
            }
            String str = (String) map.get("package_name");
            if (TextUtils.isEmpty(str)) {
                AbstractC4274eT1.zzj("Package name missing in canOpenApp GMSG.");
                return;
            }
            HashMap map2 = new HashMap();
            Boolean boolValueOf = Boolean.valueOf(interfaceC4579fX1.getContext().getPackageManager().getLaunchIntentForPackage(str) != null);
            map2.put(str, boolValueOf);
            zze.zza("/canOpenApp;" + str + ";" + boolValueOf);
            ((InterfaceC7327pK1) interfaceC4579fX1).U("openableApp", map2);
        }
    };
    public static final HI1 c = new HI1() { // from class: com.daaw.dI1
        @Override // com.daaw.HI1
        public final void a(Object obj, Map map) {
            GI1.b((InterfaceC4579fX1) obj, map);
        }
    };
    public static final HI1 d = new C9836yI1();
    public static final HI1 e = new C10115zI1();
    public static final HI1 f = new HI1() { // from class: com.daaw.eI1
        @Override // com.daaw.HI1
        public final void a(Object obj, Map map) {
            InterfaceC4579fX1 interfaceC4579fX1 = (InterfaceC4579fX1) obj;
            HI1 hi1 = GI1.a;
            String str = (String) map.get("u");
            if (str == null) {
                AbstractC4274eT1.zzj("URL missing from httpTrack GMSG.");
            } else {
                new zzca(interfaceC4579fX1.getContext(), ((InterfaceC6821nX1) interfaceC4579fX1).zzn().B, str).zzb();
            }
        }
    };
    public static final HI1 g = new AI1();
    public static final HI1 h = new BI1();
    public static final HI1 i = new HI1() { // from class: com.daaw.cI1
        @Override // com.daaw.HI1
        public final void a(Object obj, Map map) {
            InterfaceC6542mX1 interfaceC6542mX1 = (InterfaceC6542mX1) obj;
            HI1 hi1 = GI1.a;
            String str = (String) map.get("tx");
            String str2 = (String) map.get("ty");
            String str3 = (String) map.get("td");
            try {
                int i2 = Integer.parseInt(str);
                int i3 = Integer.parseInt(str2);
                int i4 = Integer.parseInt(str3);
                C7782qx1 c7782qx1F = interfaceC6542mX1.f();
                if (c7782qx1F != null) {
                    c7782qx1F.c().zzl(i2, i3, i4);
                }
            } catch (NumberFormatException unused) {
                AbstractC4274eT1.zzj("Could not parse touch parameters from gmsg.");
            }
        }
    };
    public static final HI1 j = new CI1();
    public static final HI1 k = new DI1();
    public static final HI1 l = new C5967kV1();
    public static final HI1 m = new C6255lV1();
    public static final HI1 n = new UH1();
    public static final WI1 o = new WI1();
    public static final HI1 p = new EI1();
    public static final HI1 q = new FI1();
    public static final HI1 r = new C4509fI1();
    public static final HI1 s = new C4798gI1();
    public static final HI1 t = new C5077hI1();
    public static final HI1 u = new C5356iI1();
    public static final HI1 v = new C5633jI1();
    public static final HI1 w = new C5915kI1();
    public static final HI1 x = new C6203lI1();
    public static final HI1 y = new C6482mI1();
    public static final HI1 z = new C6761nI1();
    public static final HI1 A = new C7040oI1();
    public static final HI1 B = new C7598qI1();
    public static final HI1 C = new C7876rI1();

    public static InterfaceFutureC8236sc0 a(InterfaceC9334wW1 interfaceC9334wW1, String str) {
        Uri uriA = Uri.parse(str);
        try {
            C7782qx1 c7782qx1F = interfaceC9334wW1.f();
            if (c7782qx1F != null && c7782qx1F.f(uriA)) {
                uriA = c7782qx1F.a(uriA, interfaceC9334wW1.getContext(), interfaceC9334wW1.h(), interfaceC9334wW1.zzi());
            }
        } catch (C8060rx1 unused) {
            AbstractC4274eT1.zzj("Unable to append parameter to URL: ".concat(str));
        }
        final String strB = QR1.b(uriA, interfaceC9334wW1.getContext());
        long jLongValue = ((Long) AF1.e.e()).longValue();
        if (jLongValue <= 0 || jLongValue > 233702200) {
            return AbstractC7360pS2.h(strB);
        }
        AbstractC4839gS2 abstractC4839gS2C = AbstractC4839gS2.C(interfaceC9334wW1.zzR());
        VH1 vh1 = new WN2() { // from class: com.daaw.VH1
            @Override // com.daaw.WN2
            public final Object apply(Object obj) {
                Throwable th = (Throwable) obj;
                HI1 hi1 = GI1.a;
                if (!((Boolean) AF1.k.e()).booleanValue()) {
                    return "failure_click_attok";
                }
                zzt.zzo().u(th, "prepareClickUrl.attestation1");
                return "failure_click_attok";
            }
        };
        PS2 ps2 = AbstractC9322wT1.f;
        return AbstractC7360pS2.e(AbstractC7360pS2.m(AbstractC7360pS2.e(abstractC4839gS2C, Throwable.class, vh1, ps2), new WN2() { // from class: com.daaw.WH1
            /* JADX WARN: Removed duplicated region for block: B:16:0x004f  */
            /* JADX WARN: Removed duplicated region for block: B:19:0x0059  */
            @Override // com.daaw.WN2
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object apply(java.lang.Object r6) {
                /*
                    r5 = this;
                    java.lang.String r6 = (java.lang.String) r6
                    com.daaw.HI1 r0 = com.daaw.GI1.a
                    java.lang.String r0 = r1
                    if (r6 != 0) goto L9
                    goto L74
                L9:
                    com.daaw.iF1 r1 = com.daaw.AF1.f
                    java.lang.Object r1 = r1.e()
                    java.lang.Boolean r1 = (java.lang.Boolean) r1
                    boolean r1 = r1.booleanValue()
                    if (r1 != 0) goto L18
                    goto L39
                L18:
                    java.lang.String r1 = ".googleadservices.com"
                    java.lang.String r2 = ".googlesyndication.com"
                    java.lang.String r3 = ".doubleclick.net"
                    java.lang.String[] r1 = new java.lang.String[]{r3, r1, r2}
                    android.net.Uri r2 = android.net.Uri.parse(r0)
                    java.lang.String r2 = r2.getHost()
                    r3 = 0
                L2b:
                    r4 = 3
                    if (r3 >= r4) goto L74
                    r4 = r1[r3]
                    boolean r4 = r2.endsWith(r4)
                    if (r4 != 0) goto L39
                    int r3 = r3 + 1
                    goto L2b
                L39:
                    com.daaw.iF1 r1 = com.daaw.AF1.a
                    java.lang.Object r1 = r1.e()
                    java.lang.String r1 = (java.lang.String) r1
                    com.daaw.iF1 r2 = com.daaw.AF1.b
                    java.lang.Object r2 = r2.e()
                    java.lang.String r2 = (java.lang.String) r2
                    boolean r3 = android.text.TextUtils.isEmpty(r1)
                    if (r3 != 0) goto L53
                    java.lang.String r0 = r0.replace(r1, r6)
                L53:
                    boolean r1 = android.text.TextUtils.isEmpty(r2)
                    if (r1 != 0) goto L74
                    android.net.Uri r1 = android.net.Uri.parse(r0)
                    java.lang.String r3 = r1.getQueryParameter(r2)
                    boolean r3 = android.text.TextUtils.isEmpty(r3)
                    if (r3 == 0) goto L74
                    android.net.Uri$Builder r0 = r1.buildUpon()
                    android.net.Uri$Builder r6 = r0.appendQueryParameter(r2, r6)
                    java.lang.String r6 = r6.toString()
                    return r6
                L74:
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.daaw.WH1.apply(java.lang.Object):java.lang.Object");
            }
        }, ps2), Throwable.class, new WN2() { // from class: com.daaw.XH1
            @Override // com.daaw.WN2
            public final Object apply(Object obj) {
                Throwable th = (Throwable) obj;
                HI1 hi1 = GI1.a;
                if (((Boolean) AF1.k.e()).booleanValue()) {
                    zzt.zzo().u(th, "prepareClickUrl.attestation2");
                }
                return strB;
            }
        }, ps2);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ void b(com.daaw.InterfaceC4579fX1 r16, java.util.Map r17) {
        /*
            Method dump skipped, instruction units count: 272
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.GI1.b(com.daaw.fX1, java.util.Map):void");
    }

    public static void c(Map map, InterfaceC1974Qb2 interfaceC1974Qb2) {
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.T9)).booleanValue() && map.containsKey("sc") && ((String) map.get("sc")).equals("1") && interfaceC1974Qb2 != null) {
            interfaceC1974Qb2.i0();
        }
    }
}
