package com.daaw;

import android.os.Bundle;
import com.daaw.YM0;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class VM0 implements YM0.c {
    public final YM0 a;
    public boolean b;
    public Bundle c;
    public final O90 d;

    public static final class a extends AbstractC4192e90 implements LQ {
        public final /* synthetic */ InterfaceC0417Be1 B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC0417Be1 interfaceC0417Be1) {
            super(0);
            this.B = interfaceC0417Be1;
        }

        @Override // com.daaw.LQ
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final WM0 invoke() {
            return androidx.lifecycle.u.e(this.B);
        }
    }

    public VM0(YM0 ym0, InterfaceC0417Be1 interfaceC0417Be1) {
        G10.g(ym0, "savedStateRegistry");
        G10.g(interfaceC0417Be1, "viewModelStoreOwner");
        this.a = ym0;
        this.d = AbstractC3192ab0.a(new a(interfaceC0417Be1));
    }

    @Override // com.daaw.YM0.c
    public Bundle a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry entry : c().e().entrySet()) {
            String str = (String) entry.getKey();
            Bundle bundleA = ((androidx.lifecycle.r) entry.getValue()).c().a();
            if (!G10.c(bundleA, Bundle.EMPTY)) {
                bundle.putBundle(str, bundleA);
            }
        }
        this.b = false;
        return bundle;
    }

    public final Bundle b(String str) {
        G10.g(str, SubscriberAttributeKt.JSON_NAME_KEY);
        d();
        Bundle bundle = this.c;
        Bundle bundle2 = bundle != null ? bundle.getBundle(str) : null;
        Bundle bundle3 = this.c;
        if (bundle3 != null) {
            bundle3.remove(str);
        }
        Bundle bundle4 = this.c;
        if (bundle4 != null && bundle4.isEmpty()) {
            this.c = null;
        }
        return bundle2;
    }

    public final WM0 c() {
        return (WM0) this.d.getValue();
    }

    public final void d() {
        if (this.b) {
            return;
        }
        Bundle bundleB = this.a.b("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        if (bundleB != null) {
            bundle.putAll(bundleB);
        }
        this.c = bundle;
        this.b = true;
        c();
    }
}
