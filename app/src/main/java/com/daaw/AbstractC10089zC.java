package com.daaw;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import android.view.View;
import com.daaw.YM0;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: com.daaw.zC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC10089zC {
    public static final Class[] a = {Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};

    /* JADX INFO: renamed from: com.daaw.zC$a */
    public static final class a extends AbstractC4192e90 implements LQ {
        public final /* synthetic */ boolean B;
        public final /* synthetic */ YM0 C;
        public final /* synthetic */ String D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z, YM0 ym0, String str) {
            super(0);
            this.B = z;
            this.C = ym0;
            this.D = str;
        }

        @Override // com.daaw.LQ
        public /* bridge */ /* synthetic */ Object invoke() {
            m65invoke();
            return G91.a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m65invoke() {
            if (this.B) {
                this.C.j(this.D);
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.zC$b */
    public static final class b implements YM0.c {
        public final /* synthetic */ RM0 a;

        public b(RM0 rm0) {
            this.a = rm0;
        }

        @Override // com.daaw.YM0.c
        public final Bundle a() {
            return AbstractC10089zC.f(this.a.b());
        }
    }

    /* JADX INFO: renamed from: com.daaw.zC$c */
    public static final class c extends AbstractC4192e90 implements NQ {
        public static final c B = new c();

        public c() {
            super(1);
        }

        @Override // com.daaw.NQ
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Object obj) {
            G10.g(obj, "it");
            return Boolean.valueOf(AbstractC10089zC.e(obj));
        }
    }

    public static final C9810yC a(View view, InterfaceC3135aN0 interfaceC3135aN0) {
        G10.g(view, "view");
        G10.g(interfaceC3135aN0, "owner");
        Object parent = view.getParent();
        if (parent == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        View view2 = (View) parent;
        Object tag = view2.getTag(AbstractC6740nD0.H);
        String strValueOf = tag instanceof String ? (String) tag : null;
        if (strValueOf == null) {
            strValueOf = String.valueOf(view2.getId());
        }
        return b(strValueOf, interfaceC3135aN0);
    }

    public static final C9810yC b(String str, InterfaceC3135aN0 interfaceC3135aN0) {
        boolean z;
        G10.g(str, "id");
        G10.g(interfaceC3135aN0, "savedStateRegistryOwner");
        String str2 = RM0.class.getSimpleName() + ':' + str;
        YM0 ym0P = interfaceC3135aN0.p();
        Bundle bundleB = ym0P.b(str2);
        RM0 rm0A = TM0.a(bundleB != null ? g(bundleB) : null, c.B);
        try {
            ym0P.h(str2, new b(rm0A));
            z = true;
        } catch (IllegalArgumentException unused) {
            z = false;
        }
        return new C9810yC(rm0A, new a(z, ym0P, str2));
    }

    public static final boolean e(Object obj) {
        if (obj instanceof InterfaceC6808nU0) {
            InterfaceC6808nU0 interfaceC6808nU0 = (InterfaceC6808nU0) obj;
            if (interfaceC6808nU0.i() != AbstractC7923rU0.f() && interfaceC6808nU0.i() != AbstractC7923rU0.k() && interfaceC6808nU0.i() != AbstractC7923rU0.h()) {
                return false;
            }
            Object value = interfaceC6808nU0.getValue();
            if (value == null) {
                return true;
            }
            return e(value);
        }
        if ((obj instanceof InterfaceC5390iR) && (obj instanceof Serializable)) {
            return false;
        }
        for (Class cls : a) {
            if (cls.isInstance(obj)) {
                return true;
            }
        }
        return false;
    }

    public static final Bundle f(Map map) {
        Bundle bundle = new Bundle();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            bundle.putParcelableArrayList(str, list instanceof ArrayList ? (ArrayList) list : new ArrayList<>(list));
        }
        return bundle;
    }

    public static final Map g(Bundle bundle) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Set<String> setKeySet = bundle.keySet();
        G10.f(setKeySet, "this.keySet()");
        for (String str : setKeySet) {
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(str);
            if (parcelableArrayList == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.util.ArrayList<kotlin.Any?>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.Any?> }");
            }
            G10.f(str, SubscriberAttributeKt.JSON_NAME_KEY);
            linkedHashMap.put(str, parcelableArrayList);
        }
        return linkedHashMap;
    }
}
