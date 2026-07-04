package com.daaw;

/* JADX INFO: renamed from: com.daaw.ak3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3240ak3 implements Yj3 {
    public static final AbstractC6556ma3 A;
    public static final AbstractC6556ma3 B;
    public static final AbstractC6556ma3 C;
    public static final AbstractC6556ma3 D;
    public static final AbstractC6556ma3 E;
    public static final AbstractC6556ma3 F;
    public static final AbstractC6556ma3 G;
    public static final AbstractC6556ma3 H;
    public static final AbstractC6556ma3 I;
    public static final AbstractC6556ma3 J;
    public static final AbstractC6556ma3 K;
    public static final AbstractC6556ma3 L;
    public static final AbstractC6556ma3 M;
    public static final AbstractC6556ma3 N;
    public static final AbstractC6556ma3 O;
    public static final AbstractC6556ma3 a;
    public static final AbstractC6556ma3 b;
    public static final AbstractC6556ma3 c;
    public static final AbstractC6556ma3 d;
    public static final AbstractC6556ma3 e;
    public static final AbstractC6556ma3 f;
    public static final AbstractC6556ma3 g;
    public static final AbstractC6556ma3 h;
    public static final AbstractC6556ma3 i;
    public static final AbstractC6556ma3 j;
    public static final AbstractC6556ma3 k;
    public static final AbstractC6556ma3 l;
    public static final AbstractC6556ma3 m;
    public static final AbstractC6556ma3 n;
    public static final AbstractC6556ma3 o;
    public static final AbstractC6556ma3 p;
    public static final AbstractC6556ma3 q;
    public static final AbstractC6556ma3 r;
    public static final AbstractC6556ma3 s;
    public static final AbstractC6556ma3 t;
    public static final AbstractC6556ma3 u;
    public static final AbstractC6556ma3 v;
    public static final AbstractC6556ma3 w;
    public static final AbstractC6556ma3 x;
    public static final AbstractC6556ma3 y;
    public static final AbstractC6556ma3 z;

    static {
        U93 u93A = new U93(AbstractC9522x93.a("com.google.android.gms.measurement")).a();
        a = u93A.d("measurement.ad_id_cache_time", 10000L);
        b = u93A.d("measurement.app_uninstalled_additional_ad_id_cache_time", 3600000L);
        c = u93A.d("measurement.max_bundles_per_iteration", 100L);
        d = u93A.d("measurement.config.cache_time", 86400000L);
        e = u93A.e("measurement.log_tag", "FA");
        f = u93A.e("measurement.config.url_authority", "app-measurement.com");
        g = u93A.e("measurement.config.url_scheme", "https");
        h = u93A.d("measurement.upload.debug_upload_interval", 1000L);
        i = u93A.d("measurement.lifetimevalue.max_currency_tracked", 4L);
        j = u93A.d("measurement.store.max_stored_events_per_app", 100000L);
        k = u93A.d("measurement.experiment.max_ids", 50L);
        l = u93A.d("measurement.audience.filter_result_max_count", 200L);
        m = u93A.d("measurement.upload.max_item_scoped_custom_parameters", 27L);
        n = u93A.d("measurement.alarm_manager.minimum_interval", 60000L);
        o = u93A.d("measurement.upload.minimum_delay", 500L);
        p = u93A.d("measurement.monitoring.sample_period_millis", 86400000L);
        q = u93A.d("measurement.upload.realtime_upload_interval", 10000L);
        r = u93A.d("measurement.upload.refresh_blacklisted_config_interval", 604800000L);
        s = u93A.d("measurement.config.cache_time.service", 3600000L);
        t = u93A.d("measurement.service_client.idle_disconnect_millis", 5000L);
        u = u93A.e("measurement.log_tag.service", "FA-SVC");
        v = u93A.d("measurement.upload.stale_data_deletion_interval", 86400000L);
        w = u93A.d("measurement.sdk.attribution.cache.ttl", 604800000L);
        x = u93A.d("measurement.redaction.app_instance_id.ttl", 7200000L);
        y = u93A.d("measurement.upload.backoff_period", 43200000L);
        z = u93A.d("measurement.upload.initial_upload_delay_time", 15000L);
        A = u93A.d("measurement.upload.interval", 3600000L);
        B = u93A.d("measurement.upload.max_bundle_size", 65536L);
        C = u93A.d("measurement.upload.max_bundles", 100L);
        D = u93A.d("measurement.upload.max_conversions_per_day", 500L);
        E = u93A.d("measurement.upload.max_error_events_per_day", 1000L);
        F = u93A.d("measurement.upload.max_events_per_bundle", 1000L);
        G = u93A.d("measurement.upload.max_events_per_day", 100000L);
        H = u93A.d("measurement.upload.max_public_events_per_day", 50000L);
        I = u93A.d("measurement.upload.max_queue_time", 2419200000L);
        J = u93A.d("measurement.upload.max_realtime_events_per_day", 10L);
        K = u93A.d("measurement.upload.max_batch_size", 65536L);
        L = u93A.d("measurement.upload.retry_count", 6L);
        M = u93A.d("measurement.upload.retry_time", 1800000L);
        N = u93A.e("measurement.upload.url", "https://app-measurement.com/a");
        O = u93A.d("measurement.upload.window_interval", 3600000L);
    }

    @Override // com.daaw.Yj3
    public final long D() {
        return ((Long) H.b()).longValue();
    }

    @Override // com.daaw.Yj3
    public final long b() {
        return ((Long) I.b()).longValue();
    }

    @Override // com.daaw.Yj3
    public final String c() {
        return (String) N.b();
    }

    @Override // com.daaw.Yj3
    public final long d() {
        return ((Long) B.b()).longValue();
    }

    @Override // com.daaw.Yj3
    public final long f() {
        return ((Long) O.b()).longValue();
    }

    @Override // com.daaw.Yj3
    public final String g() {
        return (String) f.b();
    }

    @Override // com.daaw.Yj3
    public final long h() {
        return ((Long) K.b()).longValue();
    }

    @Override // com.daaw.Yj3
    public final long i() {
        return ((Long) D.b()).longValue();
    }

    @Override // com.daaw.Yj3
    public final long j() {
        return ((Long) L.b()).longValue();
    }

    @Override // com.daaw.Yj3
    public final String n() {
        return (String) g.b();
    }

    @Override // com.daaw.Yj3
    public final long zzA() {
        return ((Long) F.b()).longValue();
    }

    @Override // com.daaw.Yj3
    public final long zzB() {
        return ((Long) G.b()).longValue();
    }

    @Override // com.daaw.Yj3
    public final long zzE() {
        return ((Long) J.b()).longValue();
    }

    @Override // com.daaw.Yj3
    public final long zzH() {
        return ((Long) M.b()).longValue();
    }

    @Override // com.daaw.Yj3
    public final long zza() {
        return ((Long) a.b()).longValue();
    }

    @Override // com.daaw.Yj3
    public final long zzb() {
        return ((Long) b.b()).longValue();
    }

    @Override // com.daaw.Yj3
    public final long zzc() {
        return ((Long) c.b()).longValue();
    }

    @Override // com.daaw.Yj3
    public final long zzd() {
        return ((Long) d.b()).longValue();
    }

    @Override // com.daaw.Yj3
    public final long zze() {
        return ((Long) h.b()).longValue();
    }

    @Override // com.daaw.Yj3
    public final long zzf() {
        return ((Long) i.b()).longValue();
    }

    @Override // com.daaw.Yj3
    public final long zzg() {
        return ((Long) j.b()).longValue();
    }

    @Override // com.daaw.Yj3
    public final long zzh() {
        return ((Long) k.b()).longValue();
    }

    @Override // com.daaw.Yj3
    public final long zzi() {
        return ((Long) l.b()).longValue();
    }

    @Override // com.daaw.Yj3
    public final long zzj() {
        return ((Long) m.b()).longValue();
    }

    @Override // com.daaw.Yj3
    public final long zzk() {
        return ((Long) n.b()).longValue();
    }

    @Override // com.daaw.Yj3
    public final long zzl() {
        return ((Long) o.b()).longValue();
    }

    @Override // com.daaw.Yj3
    public final long zzm() {
        return ((Long) p.b()).longValue();
    }

    @Override // com.daaw.Yj3
    public final long zzn() {
        return ((Long) q.b()).longValue();
    }

    @Override // com.daaw.Yj3
    public final long zzo() {
        return ((Long) r.b()).longValue();
    }

    @Override // com.daaw.Yj3
    public final long zzp() {
        return ((Long) t.b()).longValue();
    }

    @Override // com.daaw.Yj3
    public final long zzq() {
        return ((Long) v.b()).longValue();
    }

    @Override // com.daaw.Yj3
    public final long zzr() {
        return ((Long) w.b()).longValue();
    }

    @Override // com.daaw.Yj3
    public final long zzs() {
        return ((Long) x.b()).longValue();
    }

    @Override // com.daaw.Yj3
    public final long zzt() {
        return ((Long) y.b()).longValue();
    }

    @Override // com.daaw.Yj3
    public final long zzu() {
        return ((Long) z.b()).longValue();
    }

    @Override // com.daaw.Yj3
    public final long zzv() {
        return ((Long) A.b()).longValue();
    }

    @Override // com.daaw.Yj3
    public final long zzx() {
        return ((Long) C.b()).longValue();
    }

    @Override // com.daaw.Yj3
    public final long zzz() {
        return ((Long) E.b()).longValue();
    }
}
