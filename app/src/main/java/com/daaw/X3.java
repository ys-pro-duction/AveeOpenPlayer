package com.daaw;

import android.content.Context;
import android.os.Bundle;
import com.daaw.W3;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public class X3 implements W3 {
    public static volatile W3 c;
    public final Z9 a;
    public final Map b;

    public class a implements W3.a {
        public final /* synthetic */ String a;

        public a(String str) {
            this.a = str;
        }
    }

    public X3(Z9 z9) {
        AbstractC7506py0.l(z9);
        this.a = z9;
        this.b = new ConcurrentHashMap();
    }

    public static W3 g(C7050oL c7050oL, Context context, InterfaceC3740cZ0 interfaceC3740cZ0) {
        AbstractC7506py0.l(c7050oL);
        AbstractC7506py0.l(context);
        AbstractC7506py0.l(interfaceC3740cZ0);
        AbstractC7506py0.l(context.getApplicationContext());
        if (c == null) {
            synchronized (X3.class) {
                try {
                    if (c == null) {
                        Bundle bundle = new Bundle(1);
                        if (c7050oL.u()) {
                            interfaceC3740cZ0.a(AbstractC1947Pv.class, new Executor() { // from class: com.daaw.ym1
                                @Override // java.util.concurrent.Executor
                                public final void execute(Runnable runnable) {
                                    runnable.run();
                                }
                            }, new JH() { // from class: com.daaw.OC1
                                @Override // com.daaw.JH
                                public final void a(FH fh) {
                                    X3.h(fh);
                                }
                            });
                            bundle.putBoolean("dataCollectionDefaultEnabled", c7050oL.t());
                        }
                        c = new X3(C3831cr2.t(context, null, null, null, bundle).q());
                    }
                } finally {
                }
            }
        }
        return c;
    }

    public static /* synthetic */ void h(FH fh) {
        throw null;
    }

    @Override // com.daaw.W3
    public Map a(boolean z) {
        return this.a.m(null, null, z);
    }

    @Override // com.daaw.W3
    public W3.a b(String str, W3.b bVar) {
        AbstractC7506py0.l(bVar);
        if (!AbstractC9039vS1.d(str) || i(str)) {
            return null;
        }
        Z9 z9 = this.a;
        Object c2566Vn2 = "fiam".equals(str) ? new C2566Vn2(z9, bVar) : "clx".equals(str) ? new C9598xS2(z9, bVar) : null;
        if (c2566Vn2 == null) {
            return null;
        }
        this.b.put(str, c2566Vn2);
        return new a(str);
    }

    @Override // com.daaw.W3
    public void c(String str, String str2, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (AbstractC9039vS1.d(str) && AbstractC9039vS1.b(str2, bundle) && AbstractC9039vS1.a(str, str2, bundle)) {
            if ("clx".equals(str) && "_ae".equals(str2)) {
                bundle.putLong("_r", 1L);
            }
            this.a.n(str, str2, bundle);
        }
    }

    @Override // com.daaw.W3
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        if (str2 == null || AbstractC9039vS1.b(str2, bundle)) {
            this.a.b(str, str2, bundle);
        }
    }

    @Override // com.daaw.W3
    public int d(String str) {
        return this.a.l(str);
    }

    @Override // com.daaw.W3
    public void e(W3.c cVar) {
        String str;
        Ub3 ub3 = AbstractC9039vS1.a;
        if (cVar == null || (str = cVar.a) == null || str.isEmpty()) {
            return;
        }
        Object obj = cVar.c;
        if ((obj == null || AbstractC4877gb3.a(obj) != null) && AbstractC9039vS1.d(str) && AbstractC9039vS1.e(str, cVar.b)) {
            String str2 = cVar.k;
            if (str2 == null || (AbstractC9039vS1.b(str2, cVar.l) && AbstractC9039vS1.a(str, cVar.k, cVar.l))) {
                String str3 = cVar.h;
                if (str3 == null || (AbstractC9039vS1.b(str3, cVar.i) && AbstractC9039vS1.a(str, cVar.h, cVar.i))) {
                    String str4 = cVar.f;
                    if (str4 == null || (AbstractC9039vS1.b(str4, cVar.g) && AbstractC9039vS1.a(str, cVar.f, cVar.g))) {
                        Z9 z9 = this.a;
                        Bundle bundle = new Bundle();
                        String str5 = cVar.a;
                        if (str5 != null) {
                            bundle.putString("origin", str5);
                        }
                        String str6 = cVar.b;
                        if (str6 != null) {
                            bundle.putString("name", str6);
                        }
                        Object obj2 = cVar.c;
                        if (obj2 != null) {
                            K63.b(bundle, obj2);
                        }
                        String str7 = cVar.d;
                        if (str7 != null) {
                            bundle.putString("trigger_event_name", str7);
                        }
                        bundle.putLong("trigger_timeout", cVar.e);
                        String str8 = cVar.f;
                        if (str8 != null) {
                            bundle.putString("timed_out_event_name", str8);
                        }
                        Bundle bundle2 = cVar.g;
                        if (bundle2 != null) {
                            bundle.putBundle("timed_out_event_params", bundle2);
                        }
                        String str9 = cVar.h;
                        if (str9 != null) {
                            bundle.putString("triggered_event_name", str9);
                        }
                        Bundle bundle3 = cVar.i;
                        if (bundle3 != null) {
                            bundle.putBundle("triggered_event_params", bundle3);
                        }
                        bundle.putLong("time_to_live", cVar.j);
                        String str10 = cVar.k;
                        if (str10 != null) {
                            bundle.putString("expired_event_name", str10);
                        }
                        Bundle bundle4 = cVar.l;
                        if (bundle4 != null) {
                            bundle.putBundle("expired_event_params", bundle4);
                        }
                        bundle.putLong("creation_timestamp", cVar.m);
                        bundle.putBoolean("active", cVar.n);
                        bundle.putLong("triggered_timestamp", cVar.o);
                        z9.r(bundle);
                    }
                }
            }
        }
    }

    @Override // com.daaw.W3
    public List f(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : this.a.g(str, str2)) {
            Ub3 ub3 = AbstractC9039vS1.a;
            AbstractC7506py0.l(bundle);
            W3.c cVar = new W3.c();
            cVar.a = (String) AbstractC7506py0.l((String) K63.a(bundle, "origin", String.class, null));
            cVar.b = (String) AbstractC7506py0.l((String) K63.a(bundle, "name", String.class, null));
            cVar.c = K63.a(bundle, "value", Object.class, null);
            cVar.d = (String) K63.a(bundle, "trigger_event_name", String.class, null);
            cVar.e = ((Long) K63.a(bundle, "trigger_timeout", Long.class, 0L)).longValue();
            cVar.f = (String) K63.a(bundle, "timed_out_event_name", String.class, null);
            cVar.g = (Bundle) K63.a(bundle, "timed_out_event_params", Bundle.class, null);
            cVar.h = (String) K63.a(bundle, "triggered_event_name", String.class, null);
            cVar.i = (Bundle) K63.a(bundle, "triggered_event_params", Bundle.class, null);
            cVar.j = ((Long) K63.a(bundle, "time_to_live", Long.class, 0L)).longValue();
            cVar.k = (String) K63.a(bundle, "expired_event_name", String.class, null);
            cVar.l = (Bundle) K63.a(bundle, "expired_event_params", Bundle.class, null);
            cVar.n = ((Boolean) K63.a(bundle, "active", Boolean.class, Boolean.FALSE)).booleanValue();
            cVar.m = ((Long) K63.a(bundle, "creation_timestamp", Long.class, 0L)).longValue();
            cVar.o = ((Long) K63.a(bundle, "triggered_timestamp", Long.class, 0L)).longValue();
            arrayList.add(cVar);
        }
        return arrayList;
    }

    public final boolean i(String str) {
        return (str.isEmpty() || !this.b.containsKey(str) || this.b.get(str) == null) ? false : true;
    }
}
