package com.daaw;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Base64;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.nio.ByteBuffer;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.daaw.pL2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7332pL2 {
    public final Context a;
    public final Executor b;
    public final SK2 c;
    public final UK2 d;
    public final InterfaceC7053oL2 e;
    public final InterfaceC7053oL2 f;
    public AbstractC6963o11 g;
    public AbstractC6963o11 h;

    public C7332pL2(Context context, Executor executor, SK2 sk2, UK2 uk2, C6495mL2 c6495mL2, C6774nL2 c6774nL2) {
        this.a = context;
        this.b = executor;
        this.c = sk2;
        this.d = uk2;
        this.e = c6495mL2;
        this.f = c6774nL2;
    }

    public static C7332pL2 e(Context context, Executor executor, SK2 sk2, UK2 uk2) {
        final C7332pL2 c7332pL2 = new C7332pL2(context, executor, sk2, uk2, new C6495mL2(), new C6774nL2());
        if (c7332pL2.d.d()) {
            c7332pL2.g = c7332pL2.h(new Callable() { // from class: com.daaw.jL2
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.a.c();
                }
            });
        } else {
            c7332pL2.g = A11.e(c7332pL2.e.zza());
        }
        c7332pL2.h = c7332pL2.h(new Callable() { // from class: com.daaw.kL2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.d();
            }
        });
        return c7332pL2;
    }

    public static C3013Zv1 g(AbstractC6963o11 abstractC6963o11, C3013Zv1 c3013Zv1) {
        return !abstractC6963o11.n() ? c3013Zv1 : (C3013Zv1) abstractC6963o11.k();
    }

    public final C3013Zv1 a() {
        return g(this.g, this.e.zza());
    }

    public final C3013Zv1 b() {
        return g(this.h, this.f.zza());
    }

    public final /* synthetic */ C3013Zv1 c() {
        C9733xv1 c9733xv1M0 = C3013Zv1.m0();
        AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(this.a);
        String id = advertisingIdInfo.getId();
        if (id != null && id.matches("^[a-fA-F0-9]{8}-([a-fA-F0-9]{4}-){3}[a-fA-F0-9]{12}$")) {
            UUID uuidFromString = UUID.fromString(id);
            byte[] bArr = new byte[16];
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
            byteBufferWrap.putLong(uuidFromString.getMostSignificantBits());
            byteBufferWrap.putLong(uuidFromString.getLeastSignificantBits());
            id = Base64.encodeToString(bArr, 11);
        }
        if (id != null) {
            c9733xv1M0.t0(id);
            c9733xv1M0.s0(advertisingIdInfo.isLimitAdTrackingEnabled());
            c9733xv1M0.W(6);
        }
        return (C3013Zv1) c9733xv1M0.j();
    }

    public final /* synthetic */ C3013Zv1 d() throws PackageManager.NameNotFoundException {
        Context context = this.a;
        return AbstractC3129aL2.a(context, context.getPackageName(), Integer.toString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode));
    }

    public final /* synthetic */ void f(Exception exc) {
        if (exc instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        }
        this.c.c(2025, -1L, exc);
    }

    public final AbstractC6963o11 h(Callable callable) {
        return A11.c(this.b, callable).d(this.b, new InterfaceC7470pq0() { // from class: com.daaw.lL2
            @Override // com.daaw.InterfaceC7470pq0
            public final void c(Exception exc) {
                this.a.f(exc);
            }
        });
    }
}
