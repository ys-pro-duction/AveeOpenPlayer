package androidx.lifecycle;

import androidx.lifecycle.g;
import com.daaw.G10;
import com.daaw.InterfaceC1764Ob0;
import com.daaw.YM0;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.io.Closeable;

/* JADX INFO: loaded from: classes.dex */
public final class t implements j, Closeable, AutoCloseable {
    public final String B;
    public final r C;
    public boolean D;

    public t(String str, r rVar) {
        G10.g(str, SubscriberAttributeKt.JSON_NAME_KEY);
        G10.g(rVar, "handle");
        this.B = str;
        this.C = rVar;
    }

    public final void a(YM0 ym0, g gVar) {
        G10.g(ym0, "registry");
        G10.g(gVar, "lifecycle");
        if (this.D) {
            throw new IllegalStateException("Already attached to lifecycleOwner");
        }
        this.D = true;
        gVar.a(this);
        ym0.h(this.B, this.C.c());
    }

    @Override // androidx.lifecycle.j
    public void c(InterfaceC1764Ob0 interfaceC1764Ob0, g.a aVar) {
        G10.g(interfaceC1764Ob0, "source");
        G10.g(aVar, "event");
        if (aVar == g.a.ON_DESTROY) {
            this.D = false;
            interfaceC1764Ob0.w().d(this);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public final r d() {
        return this.C;
    }

    public final boolean j() {
        return this.D;
    }
}
