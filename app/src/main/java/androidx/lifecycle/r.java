package androidx.lifecycle;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import com.daaw.AbstractC1473Lg0;
import com.daaw.AbstractC2331Th;
import com.daaw.AbstractC2911Yw;
import com.daaw.C5208hm0;
import com.daaw.D61;
import com.daaw.G10;
import com.daaw.InterfaceC8286sm0;
import com.daaw.YM0;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class r {
    public static final a f = new a(null);
    public static final Class[] g = {Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};
    public final Map a;
    public final Map b;
    public final Map c;
    public final Map d;
    public final YM0.c e;

    public static final class a {
        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public final r a(Bundle bundle, Bundle bundle2) {
            if (bundle == null) {
                if (bundle2 == null) {
                    return new r();
                }
                HashMap map = new HashMap();
                for (String str : bundle2.keySet()) {
                    G10.f(str, SubscriberAttributeKt.JSON_NAME_KEY);
                    map.put(str, bundle2.get(str));
                }
                return new r(map);
            }
            ClassLoader classLoader = r.class.getClassLoader();
            G10.d(classLoader);
            bundle.setClassLoader(classLoader);
            ArrayList parcelableArrayList = bundle.getParcelableArrayList("keys");
            ArrayList parcelableArrayList2 = bundle.getParcelableArrayList(DiagnosticsEntry.Histogram.VALUES_KEY);
            if (parcelableArrayList == null || parcelableArrayList2 == null || parcelableArrayList.size() != parcelableArrayList2.size()) {
                throw new IllegalStateException("Invalid bundle passed as restored state");
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            int size = parcelableArrayList.size();
            for (int i = 0; i < size; i++) {
                Object obj = parcelableArrayList.get(i);
                G10.e(obj, "null cannot be cast to non-null type kotlin.String");
                linkedHashMap.put((String) obj, parcelableArrayList2.get(i));
            }
            return new r(linkedHashMap);
        }

        public final boolean b(Object obj) {
            if (obj == null) {
                return true;
            }
            for (Class cls : r.g) {
                G10.d(cls);
                if (cls.isInstance(obj)) {
                    return true;
                }
            }
            return false;
        }

        public a() {
        }
    }

    public r(Map map) {
        G10.g(map, "initialState");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.a = linkedHashMap;
        this.b = new LinkedHashMap();
        this.c = new LinkedHashMap();
        this.d = new LinkedHashMap();
        this.e = new YM0.c() { // from class: com.daaw.UM0
            @Override // com.daaw.YM0.c
            public final Bundle a() {
                return androidx.lifecycle.r.d(this.a);
            }
        };
        linkedHashMap.putAll(map);
    }

    public static final Bundle d(r rVar) {
        G10.g(rVar, "this$0");
        for (Map.Entry entry : AbstractC1473Lg0.v(rVar.b).entrySet()) {
            rVar.e((String) entry.getKey(), ((YM0.c) entry.getValue()).a());
        }
        Set<String> setKeySet = rVar.a.keySet();
        ArrayList arrayList = new ArrayList(setKeySet.size());
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (String str : setKeySet) {
            arrayList.add(str);
            arrayList2.add(rVar.a.get(str));
        }
        return AbstractC2331Th.a(D61.a("keys", arrayList), D61.a(DiagnosticsEntry.Histogram.VALUES_KEY, arrayList2));
    }

    public final YM0.c c() {
        return this.e;
    }

    public final void e(String str, Object obj) {
        G10.g(str, SubscriberAttributeKt.JSON_NAME_KEY);
        if (!f.b(obj)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Can't put value with type ");
            G10.d(obj);
            sb.append(obj.getClass());
            sb.append(" into saved state");
            throw new IllegalArgumentException(sb.toString());
        }
        Object obj2 = this.c.get(str);
        C5208hm0 c5208hm0 = obj2 instanceof C5208hm0 ? (C5208hm0) obj2 : null;
        if (c5208hm0 != null) {
            c5208hm0.l(obj);
        } else {
            this.a.put(str, obj);
        }
        InterfaceC8286sm0 interfaceC8286sm0 = (InterfaceC8286sm0) this.d.get(str);
        if (interfaceC8286sm0 == null) {
            return;
        }
        interfaceC8286sm0.setValue(obj);
    }

    public r() {
        this.a = new LinkedHashMap();
        this.b = new LinkedHashMap();
        this.c = new LinkedHashMap();
        this.d = new LinkedHashMap();
        this.e = new YM0.c() { // from class: com.daaw.UM0
            @Override // com.daaw.YM0.c
            public final Bundle a() {
                return androidx.lifecycle.r.d(this.a);
            }
        };
    }
}
