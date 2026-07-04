package com.daaw;

import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.UUID;

/* JADX INFO: renamed from: com.daaw.xy1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9745xy1 extends AbstractCallableC3025Zy1 {
    public C9745xy1(C2813Xx1 c2813Xx1, String str, String str2, C9733xv1 c9733xv1, int i, int i2) {
        super(c2813Xx1, "9mv9Ihk+HlE8P3WJWSjhrxWrdB7cEu1gaxdteA5kBJ6DKumpWYk1Q5Vf8aocVg4i", "s7rU1m4XsqJ83s2reIjdkboWJYkg+gYouDrDcn3Ghpw=", c9733xv1, i, 24);
    }

    @Override // com.daaw.AbstractCallableC3025Zy1
    public final void a() {
        if (this.b.q()) {
            c();
            return;
        }
        synchronized (this.e) {
            this.e.t0((String) this.f.invoke(null, this.b.b()));
        }
    }

    @Override // com.daaw.AbstractCallableC3025Zy1
    public final Void b() {
        if (this.b.r()) {
            super.b();
            return null;
        }
        if (this.b.q()) {
            c();
        }
        return null;
    }

    public final void c() {
        AdvertisingIdClient advertisingIdClientH = this.b.h();
        if (advertisingIdClientH == null) {
            return;
        }
        try {
            AdvertisingIdClient.Info info = advertisingIdClientH.getInfo();
            String id = info.getId();
            char[] cArr = AbstractC3304ay1.a;
            if (id != null && id.matches("^[a-fA-F0-9]{8}-([a-fA-F0-9]{4}-){3}[a-fA-F0-9]{12}$")) {
                UUID uuidFromString = UUID.fromString(id);
                byte[] bArr = new byte[16];
                ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
                byteBufferWrap.putLong(uuidFromString.getMostSignificantBits());
                byteBufferWrap.putLong(uuidFromString.getLeastSignificantBits());
                id = AbstractC7499pw1.a(bArr, true);
            }
            if (id != null) {
                synchronized (this.e) {
                    this.e.t0(id);
                    this.e.s0(info.isLimitAdTrackingEnabled());
                    this.e.W(6);
                }
            }
        } catch (IOException unused) {
        }
    }

    @Override // com.daaw.AbstractCallableC3025Zy1, java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        b();
        return null;
    }
}
