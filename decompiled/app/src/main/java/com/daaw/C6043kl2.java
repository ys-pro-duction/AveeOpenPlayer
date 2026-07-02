package com.daaw;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzblg;
import com.google.android.gms.internal.ads.zzbrj;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;

/* JADX INFO: renamed from: com.daaw.kl2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6043kl2 {
    public final C2242Sk2 a;
    public final C7989ri2 b;
    public final Object c = new Object();
    public final List d = new ArrayList();
    public boolean e;

    public C6043kl2(C2242Sk2 c2242Sk2, C7989ri2 c7989ri2) {
        this.a = c2242Sk2;
        this.b = c7989ri2;
    }

    public final JSONArray a() {
        JSONArray jSONArray = new JSONArray();
        synchronized (this.c) {
            try {
                if (!this.e) {
                    if (!this.a.t()) {
                        c();
                        return jSONArray;
                    }
                    d(this.a.g());
                }
                Iterator it = this.d.iterator();
                while (it.hasNext()) {
                    jSONArray.put(((C5764jl2) it.next()).a());
                }
                return jSONArray;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c() {
        this.a.s(new BinderC5483il2(this));
    }

    public final void d(List list) {
        C7711qi2 c7711qi2A;
        C7711qi2 c7711qi2A2;
        zzbrj zzbrjVar;
        synchronized (this.c) {
            try {
                if (this.e) {
                    return;
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    zzblg zzblgVar = (zzblg) it.next();
                    String string = (!((Boolean) zzba.zzc().b(AbstractC9820yE1.b9)).booleanValue() || (c7711qi2A2 = this.b.a(zzblgVar.B)) == null || (zzbrjVar = c7711qi2A2.c) == null) ? "" : zzbrjVar.toString();
                    String str = string;
                    boolean z = ((Boolean) zzba.zzc().b(AbstractC9820yE1.c9)).booleanValue() && (c7711qi2A = this.b.a(zzblgVar.B)) != null && c7711qi2A.d;
                    List list2 = this.d;
                    String str2 = zzblgVar.B;
                    list2.add(new C5764jl2(str2, str, this.b.c(str2), zzblgVar.C ? 1 : 0, zzblgVar.E, zzblgVar.D, z));
                }
                this.e = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
