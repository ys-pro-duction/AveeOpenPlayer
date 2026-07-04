package com.daaw;

import android.content.Intent;
import android.os.Bundle;
import androidx.activity.result.ActivityResult;
import androidx.lifecycle.g;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public abstract class H2 {
    public static final b h = new b(null);
    public final Map a = new LinkedHashMap();
    public final Map b = new LinkedHashMap();
    public final Map c = new LinkedHashMap();
    public final List d = new ArrayList();
    public final transient Map e = new LinkedHashMap();
    public final Map f = new LinkedHashMap();
    public final Bundle g = new Bundle();

    public static final class a {
        public final A2 a;
        public final B2 b;

        public a(A2 a2, B2 b2) {
            G10.g(a2, "callback");
            G10.g(b2, "contract");
            this.a = a2;
            this.b = b2;
        }

        public final A2 a() {
            return this.a;
        }

        public final B2 b() {
            return this.b;
        }
    }

    public static final class b {
        public /* synthetic */ b(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public b() {
        }
    }

    public static final class c {
        public final androidx.lifecycle.g a;
        public final List b;

        public c(androidx.lifecycle.g gVar) {
            G10.g(gVar, "lifecycle");
            this.a = gVar;
            this.b = new ArrayList();
        }

        public final void a(androidx.lifecycle.j jVar) {
            G10.g(jVar, "observer");
            this.a.a(jVar);
            this.b.add(jVar);
        }

        public final void b() {
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                this.a.d((androidx.lifecycle.j) it.next());
            }
            this.b.clear();
        }
    }

    public static final class d extends AbstractC4192e90 implements LQ {
        public static final d B = new d();

        public d() {
            super(0);
        }

        @Override // com.daaw.LQ
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke() {
            return Integer.valueOf(AbstractC6465mE0.B.d(2147418112) + 65536);
        }
    }

    public static final class e extends F2 {
        public final /* synthetic */ String b;
        public final /* synthetic */ B2 c;

        public e(String str, B2 b2) {
            this.b = str;
            this.c = b2;
        }

        @Override // com.daaw.F2
        public void b(Object obj, AbstractC9762y2 abstractC9762y2) throws Exception {
            Object obj2 = H2.this.b.get(this.b);
            B2 b2 = this.c;
            if (obj2 != null) {
                int iIntValue = ((Number) obj2).intValue();
                H2.this.d.add(this.b);
                try {
                    H2.this.i(iIntValue, this.c, obj, abstractC9762y2);
                    return;
                } catch (Exception e) {
                    H2.this.d.remove(this.b);
                    throw e;
                }
            }
            throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + b2 + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
        }

        @Override // com.daaw.F2
        public void c() {
            H2.this.p(this.b);
        }
    }

    public static final class f extends F2 {
        public final /* synthetic */ String b;
        public final /* synthetic */ B2 c;

        public f(String str, B2 b2) {
            this.b = str;
            this.c = b2;
        }

        @Override // com.daaw.F2
        public void b(Object obj, AbstractC9762y2 abstractC9762y2) throws Exception {
            Object obj2 = H2.this.b.get(this.b);
            B2 b2 = this.c;
            if (obj2 != null) {
                int iIntValue = ((Number) obj2).intValue();
                H2.this.d.add(this.b);
                try {
                    H2.this.i(iIntValue, this.c, obj, abstractC9762y2);
                    return;
                } catch (Exception e) {
                    H2.this.d.remove(this.b);
                    throw e;
                }
            }
            throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + b2 + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
        }

        @Override // com.daaw.F2
        public void c() {
            H2.this.p(this.b);
        }
    }

    public static final void n(H2 h2, String str, A2 a2, B2 b2, InterfaceC1764Ob0 interfaceC1764Ob0, g.a aVar) {
        G10.g(h2, "this$0");
        G10.g(str, "$key");
        G10.g(a2, "$callback");
        G10.g(b2, "$contract");
        G10.g(interfaceC1764Ob0, "<anonymous parameter 0>");
        G10.g(aVar, "event");
        if (g.a.ON_START != aVar) {
            if (g.a.ON_STOP == aVar) {
                h2.e.remove(str);
                return;
            } else {
                if (g.a.ON_DESTROY == aVar) {
                    h2.p(str);
                    return;
                }
                return;
            }
        }
        h2.e.put(str, new a(a2, b2));
        if (h2.f.containsKey(str)) {
            Object obj = h2.f.get(str);
            h2.f.remove(str);
            a2.a(obj);
        }
        ActivityResult activityResult = (ActivityResult) AbstractC2121Rh.a(h2.g, str, ActivityResult.class);
        if (activityResult != null) {
            h2.g.remove(str);
            a2.a(b2.c(activityResult.getResultCode(), activityResult.getData()));
        }
    }

    public final void d(int i, String str) {
        this.a.put(Integer.valueOf(i), str);
        this.b.put(str, Integer.valueOf(i));
    }

    public final boolean e(int i, int i2, Intent intent) {
        String str = (String) this.a.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        g(str, i2, intent, (a) this.e.get(str));
        return true;
    }

    public final boolean f(int i, Object obj) {
        String str = (String) this.a.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        a aVar = (a) this.e.get(str);
        if ((aVar != null ? aVar.a() : null) == null) {
            this.g.remove(str);
            this.f.put(str, obj);
            return true;
        }
        A2 a2A = aVar.a();
        G10.e(a2A, "null cannot be cast to non-null type androidx.activity.result.ActivityResultCallback<O of androidx.activity.result.ActivityResultRegistry.dispatchResult>");
        if (!this.d.remove(str)) {
            return true;
        }
        a2A.a(obj);
        return true;
    }

    public final void g(String str, int i, Intent intent, a aVar) {
        if ((aVar != null ? aVar.a() : null) == null || !this.d.contains(str)) {
            this.f.remove(str);
            this.g.putParcelable(str, new ActivityResult(i, intent));
        } else {
            aVar.a().a(aVar.b().c(i, intent));
            this.d.remove(str);
        }
    }

    public final int h() {
        for (Number number : SP0.h(d.B)) {
            if (!this.a.containsKey(Integer.valueOf(number.intValue()))) {
                return number.intValue();
            }
        }
        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
    }

    public abstract void i(int i, B2 b2, Object obj, AbstractC9762y2 abstractC9762y2);

    public final void j(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
        ArrayList<String> stringArrayList = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
        if (stringArrayList == null || integerArrayList == null) {
            return;
        }
        ArrayList<String> stringArrayList2 = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
        if (stringArrayList2 != null) {
            this.d.addAll(stringArrayList2);
        }
        Bundle bundle2 = bundle.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
        if (bundle2 != null) {
            this.g.putAll(bundle2);
        }
        int size = stringArrayList.size();
        for (int i = 0; i < size; i++) {
            String str = stringArrayList.get(i);
            if (this.b.containsKey(str)) {
                Integer num = (Integer) this.b.remove(str);
                if (!this.g.containsKey(str)) {
                    V71.c(this.a).remove(num);
                }
            }
            Integer num2 = integerArrayList.get(i);
            G10.f(num2, "rcs[i]");
            int iIntValue = num2.intValue();
            String str2 = stringArrayList.get(i);
            G10.f(str2, "keys[i]");
            d(iIntValue, str2);
        }
    }

    public final void k(Bundle bundle) {
        G10.g(bundle, "outState");
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(this.b.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(this.b.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(this.d));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(this.g));
    }

    public final F2 l(String str, B2 b2, A2 a2) {
        G10.g(str, SubscriberAttributeKt.JSON_NAME_KEY);
        G10.g(b2, "contract");
        G10.g(a2, "callback");
        o(str);
        this.e.put(str, new a(a2, b2));
        if (this.f.containsKey(str)) {
            Object obj = this.f.get(str);
            this.f.remove(str);
            a2.a(obj);
        }
        ActivityResult activityResult = (ActivityResult) AbstractC2121Rh.a(this.g, str, ActivityResult.class);
        if (activityResult != null) {
            this.g.remove(str);
            a2.a(b2.c(activityResult.getResultCode(), activityResult.getData()));
        }
        return new f(str, b2);
    }

    public final F2 m(final String str, InterfaceC1764Ob0 interfaceC1764Ob0, final B2 b2, final A2 a2) {
        G10.g(str, SubscriberAttributeKt.JSON_NAME_KEY);
        G10.g(interfaceC1764Ob0, "lifecycleOwner");
        G10.g(b2, "contract");
        G10.g(a2, "callback");
        androidx.lifecycle.g gVarW = interfaceC1764Ob0.w();
        if (gVarW.b().c(g.b.STARTED)) {
            throw new IllegalStateException(("LifecycleOwner " + interfaceC1764Ob0 + " is attempting to register while current state is " + gVarW.b() + ". LifecycleOwners must call register before they are STARTED.").toString());
        }
        o(str);
        c cVar = (c) this.c.get(str);
        if (cVar == null) {
            cVar = new c(gVarW);
        }
        cVar.a(new androidx.lifecycle.j() { // from class: com.daaw.G2
            @Override // androidx.lifecycle.j
            public final void c(InterfaceC1764Ob0 interfaceC1764Ob02, g.a aVar) {
                H2.n(this.B, str, a2, b2, interfaceC1764Ob02, aVar);
            }
        });
        this.c.put(str, cVar);
        return new e(str, b2);
    }

    public final void o(String str) {
        if (((Integer) this.b.get(str)) != null) {
            return;
        }
        d(h(), str);
    }

    public final void p(String str) {
        Integer num;
        G10.g(str, SubscriberAttributeKt.JSON_NAME_KEY);
        if (!this.d.contains(str) && (num = (Integer) this.b.remove(str)) != null) {
            this.a.remove(num);
        }
        this.e.remove(str);
        if (this.f.containsKey(str)) {
            Objects.toString(this.f.get(str));
            this.f.remove(str);
        }
        if (this.g.containsKey(str)) {
            Objects.toString((ActivityResult) AbstractC2121Rh.a(this.g, str, ActivityResult.class));
            this.g.remove(str);
        }
        c cVar = (c) this.c.get(str);
        if (cVar != null) {
            cVar.b();
            this.c.remove(str);
        }
    }
}
