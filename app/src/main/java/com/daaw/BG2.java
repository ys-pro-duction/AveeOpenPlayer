package com.daaw;

import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzw;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzffh;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class BG2 implements AG2 {
    public final ConcurrentHashMap a;
    public final zzffh b;
    public final DG2 c = new DG2();

    public BG2(zzffh zzffhVar) {
        this.a = new ConcurrentHashMap(zzffhVar.G);
        this.b = zzffhVar;
    }

    @Override // com.daaw.AG2
    public final synchronized boolean a(JG2 jg2) {
        C8992vG2 c8992vG2 = (C8992vG2) this.a.get(jg2);
        if (c8992vG2 == null) {
            return true;
        }
        return c8992vG2.b() < this.b.G;
    }

    @Override // com.daaw.AG2
    public final synchronized IG2 b(JG2 jg2) {
        IG2 ig2E;
        try {
            C8992vG2 c8992vG2 = (C8992vG2) this.a.get(jg2);
            if (c8992vG2 != null) {
                ig2E = c8992vG2.e();
                if (ig2E == null) {
                    this.c.e();
                }
                WG2 wg2F = c8992vG2.f();
                if (ig2E != null) {
                    FB1 fb1M = LB1.M();
                    DB1 db1M = EB1.M();
                    db1M.r(2);
                    HB1 hb1M = IB1.M();
                    hb1M.n(wg2F.B);
                    hb1M.o(wg2F.C);
                    db1M.n(hb1M);
                    fb1M.n(db1M);
                    ig2E.a.zzb().c().h0((LB1) fb1M.j());
                }
                e();
            } else {
                this.c.f();
                e();
                ig2E = null;
            }
        } catch (Throwable th) {
            throw th;
        }
        return ig2E;
    }

    @Override // com.daaw.AG2
    public final synchronized boolean c(JG2 jg2, IG2 ig2) {
        boolean zH;
        try {
            C8992vG2 c8992vG2 = (C8992vG2) this.a.get(jg2);
            ig2.d = zzt.zzB().a();
            if (c8992vG2 == null) {
                zzffh zzffhVar = this.b;
                C8992vG2 c8992vG22 = new C8992vG2(zzffhVar.G, zzffhVar.H * 1000);
                if (this.a.size() == this.b.F) {
                    int i = this.b.N;
                    int i2 = i - 1;
                    JG2 jg22 = null;
                    if (i == 0) {
                        throw null;
                    }
                    long jC = Long.MAX_VALUE;
                    if (i2 == 0) {
                        for (Map.Entry entry : this.a.entrySet()) {
                            if (((C8992vG2) entry.getValue()).c() < jC) {
                                jC = ((C8992vG2) entry.getValue()).c();
                                jg22 = (JG2) entry.getKey();
                            }
                        }
                        if (jg22 != null) {
                            this.a.remove(jg22);
                        }
                    } else if (i2 == 1) {
                        for (Map.Entry entry2 : this.a.entrySet()) {
                            if (((C8992vG2) entry2.getValue()).d() < jC) {
                                jC = ((C8992vG2) entry2.getValue()).d();
                                jg22 = (JG2) entry2.getKey();
                            }
                        }
                        if (jg22 != null) {
                            this.a.remove(jg22);
                        }
                    } else if (i2 == 2) {
                        int iA = Integer.MAX_VALUE;
                        for (Map.Entry entry3 : this.a.entrySet()) {
                            if (((C8992vG2) entry3.getValue()).a() < iA) {
                                iA = ((C8992vG2) entry3.getValue()).a();
                                jg22 = (JG2) entry3.getKey();
                            }
                        }
                        if (jg22 != null) {
                            this.a.remove(jg22);
                        }
                    }
                    this.c.g();
                }
                this.a.put(jg2, c8992vG22);
                this.c.d();
                c8992vG2 = c8992vG22;
            }
            zH = c8992vG2.h(ig2);
            this.c.c();
            CG2 cg2A = this.c.a();
            WG2 wg2F = c8992vG2.f();
            FB1 fb1M = LB1.M();
            DB1 db1M = EB1.M();
            db1M.r(2);
            JB1 jb1M = KB1.M();
            jb1M.n(cg2A.B);
            jb1M.o(cg2A.C);
            jb1M.p(wg2F.C);
            db1M.p(jb1M);
            fb1M.n(db1M);
            ig2.a.zzb().c().a0((LB1) fb1M.j());
            e();
        } catch (Throwable th) {
            throw th;
        }
        return zH;
    }

    @Override // com.daaw.AG2
    public final JG2 d(zzl zzlVar, String str, zzw zzwVar) {
        return new KG2(zzlVar, str, new JP1(this.b.C).a().k, this.b.I, zzwVar);
    }

    public final void e() {
        Parcelable.Creator<zzffh> creator = zzffh.CREATOR;
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.o6)).booleanValue()) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.b.E);
            sb.append(" PoolCollection");
            sb.append(this.c.b());
            int i = 0;
            for (Map.Entry entry : this.a.entrySet()) {
                i++;
                sb.append(i);
                sb.append(". ");
                sb.append(entry.getValue());
                sb.append("#");
                sb.append(((JG2) entry.getKey()).hashCode());
                sb.append("    ");
                for (int i2 = 0; i2 < ((C8992vG2) entry.getValue()).b(); i2++) {
                    sb.append("[O]");
                }
                for (int iB = ((C8992vG2) entry.getValue()).b(); iB < this.b.G; iB++) {
                    sb.append("[ ]");
                }
                sb.append("\n");
                sb.append(((C8992vG2) entry.getValue()).g());
                sb.append("\n");
            }
            while (i < this.b.F) {
                i++;
                sb.append(i);
                sb.append(".\n");
            }
            AbstractC4274eT1.zze(sb.toString());
        }
    }

    @Override // com.daaw.AG2
    public final zzffh zza() {
        return this.b;
    }
}
