package com.daaw;

import android.content.Context;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.zzt;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.daaw.Lp2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1511Lp2 extends AbstractC1614Mp2 {
    public static final SparseArray h;
    public final Context c;
    public final C7268p62 d;
    public final TelephonyManager e;
    public final C0679Dp2 f;
    public int g;

    static {
        SparseArray sparseArray = new SparseArray();
        h = sparseArray;
        sparseArray.put(NetworkInfo.DetailedState.CONNECTED.ordinal(), EnumC6741nD1.CONNECTED);
        int iOrdinal = NetworkInfo.DetailedState.AUTHENTICATING.ordinal();
        EnumC6741nD1 enumC6741nD1 = EnumC6741nD1.CONNECTING;
        sparseArray.put(iOrdinal, enumC6741nD1);
        sparseArray.put(NetworkInfo.DetailedState.CONNECTING.ordinal(), enumC6741nD1);
        sparseArray.put(NetworkInfo.DetailedState.OBTAINING_IPADDR.ordinal(), enumC6741nD1);
        sparseArray.put(NetworkInfo.DetailedState.DISCONNECTING.ordinal(), EnumC6741nD1.DISCONNECTING);
        int iOrdinal2 = NetworkInfo.DetailedState.BLOCKED.ordinal();
        EnumC6741nD1 enumC6741nD12 = EnumC6741nD1.DISCONNECTED;
        sparseArray.put(iOrdinal2, enumC6741nD12);
        sparseArray.put(NetworkInfo.DetailedState.DISCONNECTED.ordinal(), enumC6741nD12);
        sparseArray.put(NetworkInfo.DetailedState.FAILED.ordinal(), enumC6741nD12);
        sparseArray.put(NetworkInfo.DetailedState.IDLE.ordinal(), enumC6741nD12);
        sparseArray.put(NetworkInfo.DetailedState.SCANNING.ordinal(), enumC6741nD12);
        sparseArray.put(NetworkInfo.DetailedState.SUSPENDED.ordinal(), EnumC6741nD1.SUSPENDED);
        sparseArray.put(NetworkInfo.DetailedState.CAPTIVE_PORTAL_CHECK.ordinal(), enumC6741nD1);
        sparseArray.put(NetworkInfo.DetailedState.VERIFYING_POOR_LINK.ordinal(), enumC6741nD1);
    }

    public C1511Lp2(Context context, C7268p62 c7268p62, C0679Dp2 c0679Dp2, C10263zp2 c10263zp2, zzg zzgVar) {
        super(c10263zp2, zzgVar);
        this.c = context;
        this.d = c7268p62;
        this.f = c0679Dp2;
        this.e = (TelephonyManager) context.getSystemService("phone");
    }

    public static /* bridge */ /* synthetic */ C10091zC1 b(C1511Lp2 c1511Lp2, Bundle bundle) {
        C8131sC1 c8131sC1M = C10091zC1.M();
        int i = bundle.getInt("cnt", -2);
        int i2 = bundle.getInt("gnt", 0);
        int i3 = 2;
        if (i == -1) {
            c1511Lp2.g = 2;
        } else {
            c1511Lp2.g = 1;
            if (i == 0) {
                c8131sC1M.o(2);
            } else if (i != 1) {
                c8131sC1M.o(1);
            } else {
                c8131sC1M.o(3);
            }
            switch (i2) {
                case 1:
                case 2:
                case 4:
                case 7:
                case 11:
                case 16:
                    break;
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 12:
                case 14:
                case 15:
                case C6564mc1.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    i3 = 3;
                    break;
                case 13:
                    i3 = 5;
                    break;
                default:
                    i3 = 1;
                    break;
            }
            c8131sC1M.n(i3);
        }
        return (C10091zC1) c8131sC1M.j();
    }

    public static /* bridge */ /* synthetic */ EnumC6741nD1 c(C1511Lp2 c1511Lp2, Bundle bundle) {
        return (EnumC6741nD1) h.get(RF2.a(RF2.a(bundle, "device"), "network").getInt("active_network_state", -1), EnumC6741nD1.UNSPECIFIED);
    }

    public static /* bridge */ /* synthetic */ byte[] f(C1511Lp2 c1511Lp2, boolean z, ArrayList arrayList, C10091zC1 c10091zC1, EnumC6741nD1 enumC6741nD1) {
        C5336iD1 c5336iD1U = C5613jD1.U();
        c5336iD1U.n(arrayList);
        c5336iD1U.x(g(Settings.Global.getInt(c1511Lp2.c.getContentResolver(), "airplane_mode_on", 0) != 0));
        c5336iD1U.y(zzt.zzq().zzj(c1511Lp2.c, c1511Lp2.e));
        c5336iD1U.u(c1511Lp2.f.e());
        c5336iD1U.t(c1511Lp2.f.b());
        c5336iD1U.o(c1511Lp2.f.a());
        c5336iD1U.p(enumC6741nD1);
        c5336iD1U.r(c10091zC1);
        c5336iD1U.z(c1511Lp2.g);
        c5336iD1U.A(g(z));
        c5336iD1U.w(c1511Lp2.f.d());
        c5336iD1U.v(zzt.zzB().a());
        c5336iD1U.B(g(Settings.Global.getInt(c1511Lp2.c.getContentResolver(), "wifi_on", 0) != 0));
        return ((C5613jD1) c5336iD1U.j()).h();
    }

    public static final int g(boolean z) {
        return z ? 2 : 1;
    }

    public final void e(boolean z) {
        AbstractC7360pS2.r(this.d.b(), new C1407Kp2(this, z), AbstractC9322wT1.f);
    }
}
