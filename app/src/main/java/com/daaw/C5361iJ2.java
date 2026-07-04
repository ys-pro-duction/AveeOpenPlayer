package com.daaw;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzcaz;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.iJ2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5361iJ2 {
    public final C5245ht2 a;
    public final String b;
    public final String c;
    public final String d;
    public final Context e;
    public final C9546xF2 f;
    public final C9825yF2 g;
    public final InterfaceC5485im h;
    public final C7782qx1 i;

    public C5361iJ2(C5245ht2 c5245ht2, zzcaz zzcazVar, String str, String str2, Context context, C9546xF2 c9546xF2, C9825yF2 c9825yF2, InterfaceC5485im interfaceC5485im, C7782qx1 c7782qx1) {
        this.a = c5245ht2;
        this.b = zzcazVar.B;
        this.c = str;
        this.d = str2;
        this.e = context;
        this.f = c9546xF2;
        this.g = c9825yF2;
        this.h = interfaceC5485im;
        this.i = c7782qx1;
    }

    public static final List f(int i, int i2, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(j((String) it.next(), "@gw_mpe@", "2." + i2));
        }
        return arrayList;
    }

    public static final List g(List list, String str) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(j((String) it.next(), "@gw_adnetstatus@", str));
        }
        return arrayList;
    }

    public static final List h(List list, long j) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(j((String) it.next(), "@gw_ttr@", Long.toString(j, 10)));
        }
        return arrayList;
    }

    public static String i(String str) {
        return TextUtils.isEmpty(str) ? "" : C3996dT1.k() ? "fakeForAdDebugLog" : str;
    }

    public static String j(String str, String str2, String str3) {
        if (true == TextUtils.isEmpty(str3)) {
            str3 = "";
        }
        return str.replaceAll(str2, str3);
    }

    public final List c(C9267wF2 c9267wF2, C4498fF2 c4498fF2, List list) {
        return d(c9267wF2, c4498fF2, false, "", "", list);
    }

    public final List d(C9267wF2 c9267wF2, C4498fF2 c4498fF2, boolean z, String str, String str2, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            boolean z2 = true;
            String strJ = j(j(j((String) it.next(), "@gw_adlocid@", c9267wF2.a.a.f), "@gw_adnetrefresh@", true != z ? "0" : "1"), "@gw_sdkver@", this.b);
            if (c4498fF2 != null) {
                strJ = QR1.c(j(j(j(strJ, "@gw_qdata@", c4498fF2.A), "@gw_adnetid@", c4498fF2.z), "@gw_allocid@", c4498fF2.y), this.e, c4498fF2.Y);
            }
            String strJ2 = j(j(j(j(strJ, "@gw_adnetstatus@", this.a.g()), "@gw_ttr@", Long.toString(this.a.a(), 10)), "@gw_seqnum@", this.c), "@gw_sessid@", this.d);
            boolean z3 = false;
            if (((Boolean) zzba.zzc().b(AbstractC9820yE1.m3)).booleanValue() && !TextUtils.isEmpty(str)) {
                z3 = true;
            }
            boolean zIsEmpty = TextUtils.isEmpty(str2);
            boolean z4 = !zIsEmpty;
            if (z3) {
                z2 = z4;
            } else {
                if (!zIsEmpty) {
                }
                arrayList.add(strJ2);
            }
            if (this.i.f(Uri.parse(strJ2))) {
                Uri.Builder builderBuildUpon = Uri.parse(strJ2).buildUpon();
                if (z3) {
                    builderBuildUpon = builderBuildUpon.appendQueryParameter("ms", str);
                }
                if (z2) {
                    builderBuildUpon = builderBuildUpon.appendQueryParameter("attok", str2);
                }
                strJ2 = builderBuildUpon.build().toString();
            }
            arrayList.add(strJ2);
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0060 A[LOOP:0: B:13:0x005a->B:15:0x0060, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List e(com.daaw.C4498fF2 r10, java.util.List r11, com.daaw.VP1 r12) {
        /*
            r9 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.daaw.im r1 = r9.h
            long r1 = r1.a()
            java.lang.String r3 = r12.zzc()     // Catch: android.os.RemoteException -> La9
            int r12 = r12.zzb()     // Catch: android.os.RemoteException -> La9
            java.lang.String r12 = java.lang.Integer.toString(r12)     // Catch: android.os.RemoteException -> La9
            com.daaw.qE1 r4 = com.daaw.AbstractC9820yE1.n3
            com.daaw.wE1 r5 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r4 = r5.b(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L39
            com.daaw.yF2 r4 = r9.g
            if (r4 != 0) goto L32
            com.daaw.eO2 r4 = com.daaw.AbstractC4255eO2.c()
            goto L3c
        L32:
            com.daaw.xF2 r4 = r4.a
        L34:
            com.daaw.eO2 r4 = com.daaw.AbstractC4255eO2.d(r4)
            goto L3c
        L39:
            com.daaw.xF2 r4 = r9.f
            goto L34
        L3c:
            com.daaw.gJ2 r5 = new com.daaw.WN2() { // from class: com.daaw.gJ2
                static {
                    /*
                        com.daaw.gJ2 r0 = new com.daaw.gJ2
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:com.daaw.gJ2) com.daaw.gJ2.a com.daaw.gJ2
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.daaw.C4803gJ2.<clinit>():void");
                }

                {
                    /*
                        r0 = this;
                        r0.<init>()
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.daaw.C4803gJ2.<init>():void");
                }

                @Override // com.daaw.WN2
                public final java.lang.Object apply(java.lang.Object r1) {
                    /*
                        r0 = this;
                        com.daaw.xF2 r1 = (com.daaw.C9546xF2) r1
                        java.lang.String r1 = com.daaw.C5361iJ2.a(r1)
                        return r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.daaw.C4803gJ2.apply(java.lang.Object):java.lang.Object");
                }
            }
            com.daaw.eO2 r5 = r4.a(r5)
            java.lang.String r6 = ""
            java.lang.Object r5 = r5.b(r6)
            java.lang.String r5 = (java.lang.String) r5
            com.daaw.hJ2 r7 = new com.daaw.WN2() { // from class: com.daaw.hJ2
                static {
                    /*
                        com.daaw.hJ2 r0 = new com.daaw.hJ2
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:com.daaw.hJ2) com.daaw.hJ2.a com.daaw.hJ2
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.daaw.C5082hJ2.<clinit>():void");
                }

                {
                    /*
                        r0 = this;
                        r0.<init>()
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.daaw.C5082hJ2.<init>():void");
                }

                @Override // com.daaw.WN2
                public final java.lang.Object apply(java.lang.Object r1) {
                    /*
                        r0 = this;
                        com.daaw.xF2 r1 = (com.daaw.C9546xF2) r1
                        java.lang.String r1 = com.daaw.C5361iJ2.b(r1)
                        return r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.daaw.C5082hJ2.apply(java.lang.Object):java.lang.Object");
                }
            }
            com.daaw.eO2 r4 = r4.a(r7)
            java.lang.Object r4 = r4.b(r6)
            java.lang.String r4 = (java.lang.String) r4
            java.util.Iterator r11 = r11.iterator()
        L5a:
            boolean r6 = r11.hasNext()
            if (r6 == 0) goto La8
            java.lang.Object r6 = r11.next()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r7 = android.net.Uri.encode(r5)
            java.lang.String r8 = "@gw_rwd_userid@"
            java.lang.String r6 = j(r6, r8, r7)
            java.lang.String r7 = android.net.Uri.encode(r4)
            java.lang.String r8 = "@gw_rwd_custom_data@"
            java.lang.String r6 = j(r6, r8, r7)
            java.lang.String r7 = java.lang.Long.toString(r1)
            java.lang.String r8 = "@gw_tmstmp@"
            java.lang.String r6 = j(r6, r8, r7)
            java.lang.String r7 = android.net.Uri.encode(r3)
            java.lang.String r8 = "@gw_rwd_itm@"
            java.lang.String r6 = j(r6, r8, r7)
            java.lang.String r7 = "@gw_rwd_amt@"
            java.lang.String r6 = j(r6, r7, r12)
            java.lang.String r7 = r9.b
            java.lang.String r8 = "@gw_sdkver@"
            java.lang.String r6 = j(r6, r8, r7)
            android.content.Context r7 = r9.e
            boolean r8 = r10.Y
            java.lang.String r6 = com.daaw.QR1.c(r6, r7, r8)
            r0.add(r6)
            goto L5a
        La8:
            return r0
        La9:
            r10 = move-exception
            java.lang.String r11 = "Unable to determine award type and amount."
            com.daaw.AbstractC4274eT1.zzh(r11, r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C5361iJ2.e(com.daaw.fF2, java.util.List, com.daaw.VP1):java.util.List");
    }
}
