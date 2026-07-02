package com.daaw;

import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.zzac;
import com.google.android.gms.measurement.internal.zzas;
import com.google.android.gms.measurement.internal.zzau;
import com.google.android.gms.measurement.internal.zzlk;
import com.google.android.gms.measurement.internal.zzq;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes3.dex */
public final class K43 extends AbstractBinderC2168Rs2 {
    public final C8812uf3 B;
    public Boolean C;
    public String D;

    public K43(C8812uf3 c8812uf3, String str) {
        AbstractC7506py0.l(c8812uf3);
        this.B = c8812uf3;
        this.D = null;
    }

    @Override // com.daaw.InterfaceC9167vt2
    public final List A0(String str, String str2, String str3) {
        e3(str, true);
        try {
            return (List) this.B.x().o(new CallableC9622xY2(this, str, str2, str3)).get();
        } catch (InterruptedException | ExecutionException e) {
            this.B.w().n().b("Failed to get conditional user properties as", e);
            return Collections.EMPTY_LIST;
        }
    }

    public final void G(zzau zzauVar, zzq zzqVar) {
        this.B.b();
        this.B.f(zzauVar, zzqVar);
    }

    public final zzau I(zzau zzauVar, zzq zzqVar) {
        zzas zzasVar;
        if ("_cmp".equals(zzauVar.B) && (zzasVar = zzauVar.C) != null && zzasVar.zza() != 0) {
            String strD = zzauVar.C.D("_cis");
            if ("referrer broadcast".equals(strD) || "referrer API".equals(strD)) {
                this.B.w().r().b("Event has been filtered ", zzauVar.toString());
                return new zzau("_cmpx", zzauVar.C, zzauVar.D, zzauVar.E);
            }
        }
        return zzauVar;
    }

    @Override // com.daaw.InterfaceC9167vt2
    public final void I1(zzq zzqVar) {
        AbstractC7506py0.f(zzqVar.B);
        AbstractC7506py0.l(zzqVar.W);
        RunnableC5553j03 runnableC5553j03 = new RunnableC5553j03(this, zzqVar);
        AbstractC7506py0.l(runnableC5553j03);
        if (this.B.x().C()) {
            runnableC5553j03.run();
        } else {
            this.B.x().A(runnableC5553j03);
        }
    }

    @Override // com.daaw.InterfaceC9167vt2
    public final List M1(String str, String str2, boolean z, zzq zzqVar) {
        d3(zzqVar, false);
        String str3 = zzqVar.B;
        AbstractC7506py0.l(str3);
        try {
            List<If3> list = (List) this.B.x().o(new MW2(this, str3, str, str2)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (If3 if3 : list) {
                if (z || !Pf3.Y(if3.c)) {
                    arrayList.add(new zzlk(if3));
                }
            }
            return arrayList;
        } catch (InterruptedException e) {
            e = e;
            this.B.w().n().c("Failed to query user properties. appId", C6675mz2.z(zzqVar.B), e);
            return Collections.EMPTY_LIST;
        } catch (ExecutionException e2) {
            e = e2;
            this.B.w().n().c("Failed to query user properties. appId", C6675mz2.z(zzqVar.B), e);
            return Collections.EMPTY_LIST;
        }
    }

    @Override // com.daaw.InterfaceC9167vt2
    public final byte[] P2(zzau zzauVar, String str) {
        AbstractC7506py0.f(str);
        AbstractC7506py0.l(zzauVar);
        e3(str, true);
        this.B.w().m().b("Log and bundle. event", this.B.W().d(zzauVar.B));
        long jC = this.B.p().c() / 1000000;
        try {
            byte[] bArr = (byte[]) this.B.x().q(new V13(this, zzauVar, str)).get();
            if (bArr == null) {
                this.B.w().n().b("Log and bundle returned null. appId", C6675mz2.z(str));
                bArr = new byte[0];
            }
            this.B.w().m().d("Log and bundle processed. event, size, time_ms", this.B.W().d(zzauVar.B), Integer.valueOf(bArr.length), Long.valueOf((this.B.p().c() / 1000000) - jC));
            return bArr;
        } catch (InterruptedException e) {
            e = e;
            this.B.w().n().d("Failed to log and bundle. appId, event, error", C6675mz2.z(str), this.B.W().d(zzauVar.B), e);
            return null;
        } catch (ExecutionException e2) {
            e = e2;
            this.B.w().n().d("Failed to log and bundle. appId, event, error", C6675mz2.z(str), this.B.W().d(zzauVar.B), e);
            return null;
        }
    }

    @Override // com.daaw.InterfaceC9167vt2
    public final void R(zzq zzqVar) {
        d3(zzqVar, false);
        c3(new FZ2(this, zzqVar));
    }

    @Override // com.daaw.InterfaceC9167vt2
    public final void V2(zzlk zzlkVar, zzq zzqVar) {
        AbstractC7506py0.l(zzlkVar);
        d3(zzqVar, false);
        c3(new RunnableC10045z23(this, zzlkVar, zzqVar));
    }

    @Override // com.daaw.InterfaceC9167vt2
    public final void W(zzau zzauVar, String str, String str2) {
        AbstractC7506py0.l(zzauVar);
        AbstractC7506py0.f(str);
        e3(str, true);
        c3(new RunnableC7801r13(this, zzauVar, str));
    }

    @Override // com.daaw.InterfaceC9167vt2
    public final void Z(final Bundle bundle, zzq zzqVar) {
        d3(zzqVar, false);
        final String str = zzqVar.B;
        AbstractC7506py0.l(str);
        c3(new Runnable() { // from class: com.daaw.aV2
            @Override // java.lang.Runnable
            public final void run() {
                this.B.b3(str, bundle);
            }
        });
    }

    public final void a3(zzau zzauVar, zzq zzqVar) {
        if (!this.B.Z().C(zzqVar.B)) {
            G(zzauVar, zzqVar);
            return;
        }
        this.B.w().s().b("EES config found for", zzqVar.B);
        QO2 qo2Z = this.B.Z();
        String str = zzqVar.B;
        C7916rS1 c7916rS1 = TextUtils.isEmpty(str) ? null : (C7916rS1) qo2Z.j.c(str);
        if (c7916rS1 == null) {
            this.B.w().s().b("EES not loaded for", zzqVar.B);
            G(zzauVar, zzqVar);
            return;
        }
        try {
            Map mapK = this.B.g0().K(zzauVar.C.m(), true);
            String strA = AbstractC9517x83.a(zzauVar.B);
            if (strA == null) {
                strA = zzauVar.B;
            }
            if (c7916rS1.e(new C1498Lm1(strA, zzauVar.E, mapK))) {
                if (c7916rS1.g()) {
                    this.B.w().s().b("EES edited event", zzauVar.B);
                    G(this.B.g0().C(c7916rS1.a().b()), zzqVar);
                } else {
                    G(zzauVar, zzqVar);
                }
                if (c7916rS1.f()) {
                    for (C1498Lm1 c1498Lm1 : c7916rS1.a().c()) {
                        this.B.w().s().b("EES logging created event", c1498Lm1.d());
                        G(this.B.g0().C(c1498Lm1), zzqVar);
                    }
                    return;
                }
                return;
            }
        } catch (C7557q82 unused) {
            this.B.w().n().c("EES error. appId, eventName", zzqVar.C, zzauVar.B);
        }
        this.B.w().s().b("EES was not applied to event", zzauVar.B);
        G(zzauVar, zzqVar);
    }

    @Override // com.daaw.InterfaceC9167vt2
    public final List b0(String str, String str2, String str3, boolean z) {
        e3(str, true);
        try {
            List<If3> list = (List) this.B.x().o(new CallableC7380pX2(this, str, str2, str3)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (If3 if3 : list) {
                if (z || !Pf3.Y(if3.c)) {
                    arrayList.add(new zzlk(if3));
                }
            }
            return arrayList;
        } catch (InterruptedException e) {
            e = e;
            this.B.w().n().c("Failed to get user properties as. appId", C6675mz2.z(str), e);
            return Collections.EMPTY_LIST;
        } catch (ExecutionException e2) {
            e = e2;
            this.B.w().n().c("Failed to get user properties as. appId", C6675mz2.z(str), e);
            return Collections.EMPTY_LIST;
        }
    }

    public final /* synthetic */ void b3(String str, Bundle bundle) {
        C1521Ls1 c1521Ls1V = this.B.V();
        c1521Ls1V.d();
        c1521Ls1V.e();
        byte[] bArrG = c1521Ls1V.b.g0().D(new C1845Ov1(c1521Ls1V.a, "", str, "dep", 0L, 0L, bundle)).g();
        c1521Ls1V.a.w().s().c("Saving default event parameters, appId, data size", c1521Ls1V.a.D().d(str), Integer.valueOf(bArrG.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("parameters", bArrG);
        try {
            if (c1521Ls1V.P().insertWithOnConflict("default_event_params", null, contentValues, 5) == -1) {
                c1521Ls1V.a.w().n().b("Failed to insert default event parameters (got -1). appId", C6675mz2.z(str));
            }
        } catch (SQLiteException e) {
            c1521Ls1V.a.w().n().c("Error storing default event parameters. appId", C6675mz2.z(str), e);
        }
    }

    public final void c3(Runnable runnable) {
        AbstractC7506py0.l(runnable);
        if (this.B.x().C()) {
            runnable.run();
        } else {
            this.B.x().z(runnable);
        }
    }

    public final void d3(zzq zzqVar, boolean z) {
        AbstractC7506py0.l(zzqVar);
        AbstractC7506py0.f(zzqVar.B);
        e3(zzqVar.B, false);
        this.B.h0().M(zzqVar.C, zzqVar.R);
    }

    @Override // com.daaw.InterfaceC9167vt2
    public final void e0(zzac zzacVar) {
        AbstractC7506py0.l(zzacVar);
        AbstractC7506py0.l(zzacVar.D);
        AbstractC7506py0.f(zzacVar.B);
        e3(zzacVar.B, true);
        c3(new RunnableC5413iW2(this, new zzac(zzacVar)));
    }

    public final void e3(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            this.B.w().n().a("Measurement Service called without app package");
            throw new SecurityException("Measurement Service called without app package");
        }
        if (z) {
            try {
                if (this.C == null) {
                    this.C = Boolean.valueOf("com.google.android.gms".equals(this.D) || AbstractC8676u91.a(this.B.v(), Binder.getCallingUid()) || FT.a(this.B.v()).c(Binder.getCallingUid()));
                }
                if (this.C.booleanValue()) {
                    return;
                }
            } catch (SecurityException e) {
                this.B.w().n().b("Measurement Service called with invalid calling package. appId", C6675mz2.z(str));
                throw e;
            }
        }
        if (this.D == null && ET.k(this.B.v(), Binder.getCallingUid(), str)) {
            this.D = str;
        }
        if (str.equals(this.D)) {
        } else {
            throw new SecurityException(String.format("Unknown calling package name '%s'.", str));
        }
    }

    @Override // com.daaw.InterfaceC9167vt2
    public final void f2(zzq zzqVar) {
        AbstractC7506py0.f(zzqVar.B);
        e3(zzqVar.B, false);
        c3(new RunnableC3464bZ2(this, zzqVar));
    }

    @Override // com.daaw.InterfaceC9167vt2
    public final List g0(zzq zzqVar, boolean z) {
        d3(zzqVar, false);
        String str = zzqVar.B;
        AbstractC7506py0.l(str);
        try {
            List<If3> list = (List) this.B.x().o(new CallableC3887d33(this, str)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (If3 if3 : list) {
                if (z || !Pf3.Y(if3.c)) {
                    arrayList.add(new zzlk(if3));
                }
            }
            return arrayList;
        } catch (InterruptedException e) {
            e = e;
            this.B.w().n().c("Failed to get user properties. appId", C6675mz2.z(zzqVar.B), e);
            return null;
        } catch (ExecutionException e2) {
            e = e2;
            this.B.w().n().c("Failed to get user properties. appId", C6675mz2.z(zzqVar.B), e);
            return null;
        }
    }

    @Override // com.daaw.InterfaceC9167vt2
    public final void g1(zzq zzqVar) {
        d3(zzqVar, false);
        c3(new H33(this, zzqVar));
    }

    @Override // com.daaw.InterfaceC9167vt2
    public final List h1(String str, String str2, zzq zzqVar) {
        d3(zzqVar, false);
        String str3 = zzqVar.B;
        AbstractC7506py0.l(str3);
        try {
            return (List) this.B.x().o(new TX2(this, str3, str, str2)).get();
        } catch (InterruptedException | ExecutionException e) {
            this.B.w().n().b("Failed to get conditional user properties", e);
            return Collections.EMPTY_LIST;
        }
    }

    @Override // com.daaw.InterfaceC9167vt2
    public final void o1(long j, String str, String str2, String str3) {
        c3(new RunnableC5296i43(this, str2, str3, str, j));
    }

    @Override // com.daaw.InterfaceC9167vt2
    public final String r0(zzq zzqVar) {
        d3(zzqVar, false);
        return this.B.j0(zzqVar);
    }

    @Override // com.daaw.InterfaceC9167vt2
    public final void r2(zzac zzacVar, zzq zzqVar) {
        AbstractC7506py0.l(zzacVar);
        AbstractC7506py0.l(zzacVar.D);
        d3(zzqVar, false);
        zzac zzacVar2 = new zzac(zzacVar);
        zzacVar2.B = zzqVar.B;
        c3(new EV2(this, zzacVar2, zzqVar));
    }

    @Override // com.daaw.InterfaceC9167vt2
    public final void y0(zzau zzauVar, zzq zzqVar) {
        AbstractC7506py0.l(zzauVar);
        d3(zzqVar, false);
        c3(new N03(this, zzauVar, zzqVar));
    }
}
