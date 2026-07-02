package com.daaw;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class LQ0 implements OQ0 {
    public final Context a;
    public final PQ0 b;
    public final MQ0 c;
    public final InterfaceC1735Nu d;
    public final C8544ti e;
    public final QQ0 f;
    public final C1739Nv g;
    public final AtomicReference h;
    public final AtomicReference i;

    public class a implements InterfaceC9066vZ0 {
        public a() {
        }

        @Override // com.daaw.InterfaceC9066vZ0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public AbstractC6963o11 a(Void r5) throws Throwable {
            JSONObject jSONObjectA = LQ0.this.f.a(LQ0.this.b, true);
            if (jSONObjectA != null) {
                BQ0 bq0B = LQ0.this.c.b(jSONObjectA);
                LQ0.this.e.c(bq0B.c, jSONObjectA);
                LQ0.this.q(jSONObjectA, "Loaded settings: ");
                LQ0 lq0 = LQ0.this;
                lq0.r(lq0.b.f);
                LQ0.this.h.set(bq0B);
                ((C7521q11) LQ0.this.i.get()).e(bq0B);
            }
            return A11.e(null);
        }
    }

    public LQ0(Context context, PQ0 pq0, InterfaceC1735Nu interfaceC1735Nu, MQ0 mq0, C8544ti c8544ti, QQ0 qq0, C1739Nv c1739Nv) {
        AtomicReference atomicReference = new AtomicReference();
        this.h = atomicReference;
        this.i = new AtomicReference(new C7521q11());
        this.a = context;
        this.b = pq0;
        this.d = interfaceC1735Nu;
        this.c = mq0;
        this.e = c8544ti;
        this.f = qq0;
        this.g = c1739Nv;
        atomicReference.set(C2185Rx.b(interfaceC1735Nu));
    }

    public static LQ0 l(Context context, String str, SX sx, AW aw, String str2, String str3, RK rk, C1739Nv c1739Nv) {
        String strG = sx.g();
        C6121l01 c6121l01 = new C6121l01();
        return new LQ0(context, new PQ0(str, sx.h(), sx.i(), sx.j(), sx, AbstractC0555Cn.h(AbstractC0555Cn.o(context), str, str3, str2), str3, str2, EnumC4141dz.a(strG).c()), c6121l01, new MQ0(c6121l01), new C8544ti(rk), new C2291Sx(String.format(Locale.US, "https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/%s/settings", str), aw), c1739Nv);
    }

    @Override // com.daaw.OQ0
    public AbstractC6963o11 a() {
        return ((C7521q11) this.i.get()).a();
    }

    @Override // com.daaw.OQ0
    public BQ0 b() {
        return (BQ0) this.h.get();
    }

    public boolean k() {
        return !n().equals(this.b.f);
    }

    public final BQ0 m(KQ0 kq0) throws Throwable {
        BQ0 bq0 = null;
        try {
            if (!KQ0.SKIP_CACHE_LOOKUP.equals(kq0)) {
                JSONObject jSONObjectB = this.e.b();
                if (jSONObjectB != null) {
                    BQ0 bq0B = this.c.b(jSONObjectB);
                    if (bq0B == null) {
                        C2106Rd0.f().e("Failed to parse cached settings data.", null);
                        return null;
                    }
                    q(jSONObjectB, "Loaded cached settings: ");
                    long currentTimeMillis = this.d.getCurrentTimeMillis();
                    if (!KQ0.IGNORE_CACHE_EXPIRATION.equals(kq0) && bq0B.a(currentTimeMillis)) {
                        C2106Rd0.f().i("Cached settings have expired.");
                        return null;
                    }
                    try {
                        C2106Rd0.f().i("Returning cached settings.");
                        return bq0B;
                    } catch (Exception e) {
                        e = e;
                        bq0 = bq0B;
                        C2106Rd0.f().e("Failed to get cached settings", e);
                        return bq0;
                    }
                }
                C2106Rd0.f().b("No cached settings data found.");
            }
            return null;
        } catch (Exception e2) {
            e = e2;
        }
    }

    public final String n() {
        return AbstractC0555Cn.s(this.a).getString("existing_instance_identifier", "");
    }

    public AbstractC6963o11 o(KQ0 kq0, Executor executor) throws Throwable {
        BQ0 bq0M;
        if (!k() && (bq0M = m(kq0)) != null) {
            this.h.set(bq0M);
            ((C7521q11) this.i.get()).e(bq0M);
            return A11.e(null);
        }
        BQ0 bq0M2 = m(KQ0.IGNORE_CACHE_EXPIRATION);
        if (bq0M2 != null) {
            this.h.set(bq0M2);
            ((C7521q11) this.i.get()).e(bq0M2);
        }
        return this.g.h(executor).p(executor, new a());
    }

    public AbstractC6963o11 p(Executor executor) {
        return o(KQ0.USE_CACHE, executor);
    }

    public final void q(JSONObject jSONObject, String str) {
        C2106Rd0.f().b(str + jSONObject.toString());
    }

    public final boolean r(String str) {
        SharedPreferences.Editor editorEdit = AbstractC0555Cn.s(this.a).edit();
        editorEdit.putString("existing_instance_identifier", str);
        editorEdit.apply();
        return true;
    }
}
