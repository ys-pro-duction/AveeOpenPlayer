package com.daaw;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzcaz;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.daaw.Zp2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2990Zp2 {
    public final C6454mB1 a;
    public final Context b;
    public final C10263zp2 c;
    public final zzcaz d;
    public final String e;
    public final InterfaceC6483mI2 f;
    public final zzg g = zzt.zzo().h();

    public C2990Zp2(Context context, zzcaz zzcazVar, C6454mB1 c6454mB1, C10263zp2 c10263zp2, String str, InterfaceC6483mI2 interfaceC6483mI2) {
        this.b = context;
        this.d = zzcazVar;
        this.a = c6454mB1;
        this.c = c10263zp2;
        this.e = str;
        this.f = interfaceC6483mI2;
    }

    public static final void c(SQLiteDatabase sQLiteDatabase, ArrayList arrayList) {
        int size = arrayList.size();
        long jS = 0;
        for (int i = 0; i < size; i++) {
            C5613jD1 c5613jD1 = (C5613jD1) arrayList.get(i);
            if (c5613jD1.k0() == 2 && c5613jD1.S() > jS) {
                jS = c5613jD1.S();
            }
        }
        if (jS != 0) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("value", Long.valueOf(jS));
            sQLiteDatabase.update("offline_signal_statistics", contentValues, "statistic_name = 'last_successful_request_time'", null);
        }
    }

    public final /* synthetic */ Void a(boolean z, SQLiteDatabase sQLiteDatabase) {
        if (z) {
            this.b.deleteDatabase("OfflineUpload.db");
            return null;
        }
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.r8)).booleanValue()) {
            C6204lI2 c6204lI2B = C6204lI2.b("oa_upload");
            c6204lI2B.a("oa_failed_reqs", String.valueOf(AbstractC1822Op2.a(sQLiteDatabase, 0)));
            c6204lI2B.a("oa_total_reqs", String.valueOf(AbstractC1822Op2.a(sQLiteDatabase, 1)));
            c6204lI2B.a("oa_upload_time", String.valueOf(zzt.zzB().a()));
            c6204lI2B.a("oa_last_successful_time", String.valueOf(AbstractC1822Op2.b(sQLiteDatabase, 2)));
            c6204lI2B.a("oa_session_id", this.g.zzQ() ? "" : this.e);
            this.f.a(c6204lI2B);
            ArrayList arrayListC = AbstractC1822Op2.c(sQLiteDatabase);
            c(sQLiteDatabase, arrayListC);
            int size = arrayListC.size();
            for (int i = 0; i < size; i++) {
                C5613jD1 c5613jD1 = (C5613jD1) arrayListC.get(i);
                zzg zzgVar = this.g;
                C6204lI2 c6204lI2B2 = C6204lI2.b("oa_signals");
                c6204lI2B2.a("oa_session_id", zzgVar.zzQ() ? "" : this.e);
                C10091zC1 c10091zC1T = c5613jD1.T();
                String strValueOf = c10091zC1T.Q() ? String.valueOf(c10091zC1T.S() - 1) : "-1";
                String string = AbstractC4552fQ2.b(c5613jD1.Y(), new WN2() { // from class: com.daaw.Yp2
                    @Override // com.daaw.WN2
                    public final Object apply(Object obj) {
                        return ((OB1) obj).name();
                    }
                }).toString();
                c6204lI2B2.a("oa_sig_ts", String.valueOf(c5613jD1.S()));
                c6204lI2B2.a("oa_sig_status", String.valueOf(c5613jD1.k0() - 1));
                c6204lI2B2.a("oa_sig_resp_lat", String.valueOf(c5613jD1.R()));
                c6204lI2B2.a("oa_sig_render_lat", String.valueOf(c5613jD1.Q()));
                c6204lI2B2.a("oa_sig_formats", string);
                c6204lI2B2.a("oa_sig_nw_type", strValueOf);
                c6204lI2B2.a("oa_sig_wifi", String.valueOf(c5613jD1.l0() - 1));
                c6204lI2B2.a("oa_sig_airplane", String.valueOf(c5613jD1.h0() - 1));
                c6204lI2B2.a("oa_sig_data", String.valueOf(c5613jD1.i0() - 1));
                c6204lI2B2.a("oa_sig_nw_resp", String.valueOf(c5613jD1.P()));
                c6204lI2B2.a("oa_sig_offline", String.valueOf(c5613jD1.j0() - 1));
                c6204lI2B2.a("oa_sig_nw_state", String.valueOf(c5613jD1.X().zza()));
                if (c10091zC1T.P() && c10091zC1T.Q() && c10091zC1T.S() == 2) {
                    c6204lI2B2.a("oa_sig_cell_type", String.valueOf(c10091zC1T.R() - 1));
                }
                this.f.a(c6204lI2B2);
            }
        } else {
            ArrayList arrayListC2 = AbstractC1822Op2.c(sQLiteDatabase);
            Context context = this.b;
            C5895kD1 c5895kD1M = C7020oD1.M();
            c5895kD1M.o(context.getPackageName());
            c5895kD1M.r(Build.MODEL);
            c5895kD1M.t(AbstractC1822Op2.a(sQLiteDatabase, 0));
            c5895kD1M.n(arrayListC2);
            c5895kD1M.v(AbstractC1822Op2.a(sQLiteDatabase, 1));
            c5895kD1M.p(AbstractC1822Op2.a(sQLiteDatabase, 3));
            c5895kD1M.w(zzt.zzB().a());
            c5895kD1M.u(AbstractC1822Op2.b(sQLiteDatabase, 2));
            final C7020oD1 c7020oD1 = (C7020oD1) c5895kD1M.j();
            c(sQLiteDatabase, arrayListC2);
            this.a.b(new InterfaceC6175lB1() { // from class: com.daaw.Wp2
                @Override // com.daaw.InterfaceC6175lB1
                public final void a(C5891kC1 c5891kC1) {
                    c5891kC1.x(c7020oD1);
                }
            });
            zzcaz zzcazVar = this.d;
            C10095zD1 c10095zD1M = AD1.M();
            c10095zD1M.n(zzcazVar.C);
            c10095zD1M.p(this.d.D);
            c10095zD1M.o(true == this.d.E ? 0 : 2);
            final AD1 ad1 = (AD1) c10095zD1M.j();
            this.a.b(new InterfaceC6175lB1() { // from class: com.daaw.Xp2
                @Override // com.daaw.InterfaceC6175lB1
                public final void a(C5891kC1 c5891kC1) {
                    C3649cC1 c3649cC1 = (C3649cC1) c5891kC1.o().k();
                    c3649cC1.o(ad1);
                    c5891kC1.v(c3649cC1);
                }
            });
            this.a.c(10004);
        }
        AbstractC1822Op2.f(sQLiteDatabase);
        return null;
    }

    public final void b(final boolean z) {
        try {
            this.c.a(new InterfaceC9554xH2() { // from class: com.daaw.Rp2
                @Override // com.daaw.InterfaceC9554xH2
                public final Object zza(Object obj) {
                    this.a.a(z, (SQLiteDatabase) obj);
                    return null;
                }
            });
        } catch (Exception e) {
            AbstractC4274eT1.zzg("Error in offline signals database startup: ".concat(String.valueOf(e.getMessage())));
        }
    }
}
