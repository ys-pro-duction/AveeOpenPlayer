package com.daaw;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class EK2 implements InterfaceC3404bK2 {
    public static final EK2 i = new EK2();
    public static final Handler j = new Handler(Looper.getMainLooper());
    public static Handler k = null;
    public static final Runnable l = new RunnableC9566xK2();
    public static final Runnable m = new RunnableC9845yK2();
    public int b;
    public long h;
    public final List a = new ArrayList();
    public boolean c = false;
    public final List d = new ArrayList();
    public final C8722uK2 f = new C8722uK2();
    public final C3961dK2 e = new C3961dK2();
    public final C9008vK2 g = new C9008vK2(new HK2());

    public static EK2 d() {
        return i;
    }

    public static /* bridge */ /* synthetic */ void g(EK2 ek2) {
        EK2 ek22;
        ek2.b = 0;
        ek2.d.clear();
        ek2.c = false;
        for (CJ2 cj2 : PJ2.a().b()) {
        }
        ek2.h = System.nanoTime();
        ek2.f.i();
        long jNanoTime = System.nanoTime();
        InterfaceC3682cK2 interfaceC3682cK2A = ek2.e.a();
        if (ek2.f.e().size() > 0) {
            for (String str : ek2.f.e()) {
                JSONObject jSONObjectZza = interfaceC3682cK2A.zza(null);
                View viewA = ek2.f.a(str);
                InterfaceC3682cK2 interfaceC3682cK2B = ek2.e.b();
                String strC = ek2.f.c(str);
                if (strC != null) {
                    JSONObject jSONObjectZza2 = interfaceC3682cK2B.zza(viewA);
                    AbstractC6491mK2.b(jSONObjectZza2, str);
                    try {
                        jSONObjectZza2.put("notVisibleReason", strC);
                    } catch (JSONException e) {
                        AbstractC6770nK2.a("Error with setting not visible reason", e);
                    }
                    AbstractC6491mK2.c(jSONObjectZza, jSONObjectZza2);
                }
                AbstractC6491mK2.f(jSONObjectZza);
                HashSet hashSet = new HashSet();
                hashSet.add(str);
                ek2.g.c(jSONObjectZza, hashSet, jNanoTime);
            }
        }
        if (ek2.f.f().size() > 0) {
            JSONObject jSONObjectZza3 = interfaceC3682cK2A.zza(null);
            ek22 = ek2;
            ek22.k(null, interfaceC3682cK2A, jSONObjectZza3, 1, false);
            AbstractC6491mK2.f(jSONObjectZza3);
            ek22.g.d(jSONObjectZza3, ek22.f.f(), jNanoTime);
        } else {
            ek22 = ek2;
            ek22.g.b();
        }
        ek22.f.g();
        long jNanoTime2 = System.nanoTime() - ek22.h;
        if (ek22.a.size() > 0) {
            Iterator it = ek22.a.iterator();
            if (it.hasNext()) {
                AbstractC6314li0.a(it.next());
                TimeUnit.NANOSECONDS.toMillis(jNanoTime2);
                throw null;
            }
        }
    }

    public static final void l() {
        Handler handler = k;
        if (handler != null) {
            handler.removeCallbacks(m);
            k = null;
        }
    }

    @Override // com.daaw.InterfaceC3404bK2
    public final void a(View view, InterfaceC3682cK2 interfaceC3682cK2, JSONObject jSONObject, boolean z) {
        int iK;
        boolean z2;
        EK2 ek2;
        View view2;
        InterfaceC3682cK2 interfaceC3682cK22;
        boolean z3;
        if (AbstractC8164sK2.b(view) != null || (iK = this.f.k(view)) == 3) {
            return;
        }
        JSONObject jSONObjectZza = interfaceC3682cK2.zza(view);
        AbstractC6491mK2.c(jSONObject, jSONObjectZza);
        String strD = this.f.d(view);
        if (strD != null) {
            AbstractC6491mK2.b(jSONObjectZza, strD);
            try {
                jSONObjectZza.put("hasWindowFocus", Boolean.valueOf(this.f.j(view)));
            } catch (JSONException e) {
                AbstractC6770nK2.a("Error with setting has window focus", e);
            }
            this.f.h();
            ek2 = this;
        } else {
            C8443tK2 c8443tK2B = this.f.b(view);
            if (c8443tK2B != null) {
                SJ2 sj2A = c8443tK2B.a();
                JSONArray jSONArray = new JSONArray();
                ArrayList arrayListB = c8443tK2B.b();
                int size = arrayListB.size();
                for (int i2 = 0; i2 < size; i2++) {
                    jSONArray.put((String) arrayListB.get(i2));
                }
                try {
                    jSONObjectZza.put("isFriendlyObstructionFor", jSONArray);
                    jSONObjectZza.put("friendlyObstructionClass", sj2A.d());
                    jSONObjectZza.put("friendlyObstructionPurpose", sj2A.a());
                    jSONObjectZza.put("friendlyObstructionReason", sj2A.c());
                } catch (JSONException e2) {
                    AbstractC6770nK2.a("Error with setting friendly obstruction", e2);
                }
                z2 = true;
            } else {
                z2 = false;
            }
            if (z || z2) {
                ek2 = this;
                view2 = view;
                interfaceC3682cK22 = interfaceC3682cK2;
                z3 = true;
            } else {
                ek2 = this;
                view2 = view;
                interfaceC3682cK22 = interfaceC3682cK2;
                z3 = false;
            }
            ek2.k(view2, interfaceC3682cK22, jSONObjectZza, iK, z3);
        }
        ek2.b++;
    }

    public final void h() {
        l();
    }

    public final void i() {
        if (k == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            k = handler;
            handler.post(l);
            k.postDelayed(m, 200L);
        }
    }

    public final void j() {
        l();
        this.a.clear();
        j.post(new RunnableC9287wK2(this));
    }

    public final void k(View view, InterfaceC3682cK2 interfaceC3682cK2, JSONObject jSONObject, int i2, boolean z) {
        interfaceC3682cK2.a(view, jSONObject, this, i2 == 1, z);
    }
}
