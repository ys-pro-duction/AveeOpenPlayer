package com.daaw;

import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: com.daaw.Jr2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1311Jr2 {
    public static final C4388er2 A0;
    public static final C4388er2 B0;
    public static final C4388er2 C0;
    public static final C4388er2 D0;
    public static final C4388er2 E0;
    public static final C4388er2 F0;
    public static final C4388er2 G0;
    public static final C4388er2 H;
    public static final C4388er2 H0;
    public static final C4388er2 I;
    public static final C4388er2 I0;
    public static final C4388er2 J;
    public static final C4388er2 J0;
    public static final C4388er2 K;
    public static final C4388er2 K0;
    public static final C4388er2 L;
    public static final C4388er2 M;
    public static final C4388er2 N;
    public static final C4388er2 O;
    public static final C4388er2 P;
    public static final C4388er2 Q;
    public static final C4388er2 R;
    public static final C4388er2 S;
    public static final C4388er2 T;
    public static final C4388er2 U;
    public static final C4388er2 V;
    public static final C4388er2 W;
    public static final C4388er2 X;
    public static final C4388er2 Y;
    public static final C4388er2 Z;
    public static final C4388er2 a0;
    public static final C4388er2 b0;
    public static final C4388er2 c0;
    public static final C4388er2 d0;
    public static final C4388er2 e0;
    public static final C4388er2 f0;
    public static final C4388er2 g0;
    public static final C4388er2 h0;
    public static final C4388er2 i0;
    public static final C4388er2 j0;
    public static final C4388er2 k0;
    public static final C4388er2 l0;
    public static final C4388er2 m0;
    public static final C4388er2 n0;
    public static final C4388er2 o0;
    public static final C4388er2 p0;
    public static final C4388er2 q0;
    public static final C4388er2 r0;
    public static final C4388er2 s0;
    public static final C4388er2 t0;
    public static final C4388er2 u0;
    public static final C4388er2 v0;
    public static final C4388er2 w0;
    public static final C4388er2 x0;
    public static final C4388er2 y0;
    public static final C4388er2 z0;
    public static final List a = DesugarCollections.synchronizedList(new ArrayList());
    public static final Set b = DesugarCollections.synchronizedSet(new HashSet());
    public static final C4388er2 c = a("measurement.ad_id_cache_time", 10000L, 10000L, new InterfaceC7746qp2() { // from class: com.daaw.kH1
        @Override // com.daaw.InterfaceC7746qp2
        public final Object zza() {
            List list = AbstractC1311Jr2.a;
            return Long.valueOf(Wj3.o());
        }
    });
    public static final C4388er2 d = a("measurement.app_uninstalled_additional_ad_id_cache_time", 3600000L, 3600000L, new InterfaceC7746qp2() { // from class: com.daaw.YB1
        @Override // com.daaw.InterfaceC7746qp2
        public final Object zza() {
            List list = AbstractC1311Jr2.a;
            return Long.valueOf(Wj3.p());
        }
    });
    public static final C4388er2 e = a("measurement.monitoring.sample_period_millis", 86400000L, 86400000L, new InterfaceC7746qp2() { // from class: com.daaw.KJ1
        @Override // com.daaw.InterfaceC7746qp2
        public final Object zza() {
            List list = AbstractC1311Jr2.a;
            return Long.valueOf(Wj3.A());
        }
    });
    public static final C4388er2 f = a("measurement.config.cache_time", 86400000L, 3600000L, new InterfaceC7746qp2() { // from class: com.daaw.GQ1
        @Override // com.daaw.InterfaceC7746qp2
        public final Object zza() {
            List list = AbstractC1311Jr2.a;
            return Long.valueOf(Wj3.r());
        }
    });
    public static final C4388er2 g = a("measurement.config.url_scheme", "https", "https", new InterfaceC7746qp2() { // from class: com.daaw.nY1
        @Override // com.daaw.InterfaceC7746qp2
        public final Object zza() {
            List list = AbstractC1311Jr2.a;
            return Wj3.m();
        }
    });
    public static final C4388er2 h = a("measurement.config.url_authority", "app-measurement.com", "app-measurement.com", new InterfaceC7746qp2() { // from class: com.daaw.t52
        @Override // com.daaw.InterfaceC7746qp2
        public final Object zza() {
            List list = AbstractC1311Jr2.a;
            return Wj3.l();
        }
    });
    public static final C4388er2 i = a("measurement.upload.max_bundles", 100, 100, new InterfaceC7746qp2() { // from class: com.daaw.Vc2
        @Override // com.daaw.InterfaceC7746qp2
        public final Object zza() {
            List list = AbstractC1311Jr2.a;
            return Integer.valueOf((int) Wj3.L());
        }
    });
    public static final C4388er2 j = a("measurement.upload.max_batch_size", 65536, 65536, new InterfaceC7746qp2() { // from class: com.daaw.Vj2
        @Override // com.daaw.InterfaceC7746qp2
        public final Object zza() {
            List list = AbstractC1311Jr2.a;
            return Integer.valueOf((int) Wj3.g());
        }
    });
    public static final C4388er2 k = a("measurement.upload.max_bundle_size", 65536, 65536, new InterfaceC7746qp2() { // from class: com.daaw.Nm2
        @Override // com.daaw.InterfaceC7746qp2
        public final Object zza() {
            List list = AbstractC1311Jr2.a;
            return Integer.valueOf((int) Wj3.K());
        }
    });
    public static final C4388er2 l = a("measurement.upload.max_events_per_bundle", 1000, 1000, new InterfaceC7746qp2() { // from class: com.daaw.sn2
        @Override // com.daaw.InterfaceC7746qp2
        public final Object zza() {
            List list = AbstractC1311Jr2.a;
            return Integer.valueOf((int) Wj3.b());
        }
    });
    public static final C4388er2 m = a("measurement.upload.max_events_per_day", 100000, 100000, new InterfaceC7746qp2() { // from class: com.daaw.MN1
        @Override // com.daaw.InterfaceC7746qp2
        public final Object zza() {
            List list = AbstractC1311Jr2.a;
            return Integer.valueOf((int) Wj3.c());
        }
    });
    public static final C4388er2 n = a("measurement.upload.max_error_events_per_day", 1000, 1000, new InterfaceC7746qp2() { // from class: com.daaw.BU1
        @Override // com.daaw.InterfaceC7746qp2
        public final Object zza() {
            List list = AbstractC1311Jr2.a;
            return Integer.valueOf((int) Wj3.a());
        }
    });
    public static final C4388er2 o = a("measurement.upload.max_public_events_per_day", 50000, 50000, new InterfaceC7746qp2() { // from class: com.daaw.p12
        @Override // com.daaw.InterfaceC7746qp2
        public final Object zza() {
            List list = AbstractC1311Jr2.a;
            return Integer.valueOf((int) Wj3.d());
        }
    });
    public static final C4388er2 p = a("measurement.upload.max_conversions_per_day", 10000, 10000, new InterfaceC7746qp2() { // from class: com.daaw.N72
        @Override // com.daaw.InterfaceC7746qp2
        public final Object zza() {
            List list = AbstractC1311Jr2.a;
            return Integer.valueOf((int) Wj3.M());
        }
    });
    public static final C4388er2 q = a("measurement.upload.max_realtime_events_per_day", 10, 10, new InterfaceC7746qp2() { // from class: com.daaw.Ke2
        @Override // com.daaw.InterfaceC7746qp2
        public final Object zza() {
            List list = AbstractC1311Jr2.a;
            return Integer.valueOf((int) Wj3.f());
        }
    });
    public static final C4388er2 r = a("measurement.store.max_stored_events_per_app", 100000, 100000, new InterfaceC7746qp2() { // from class: com.daaw.bl2
        @Override // com.daaw.InterfaceC7746qp2
        public final Object zza() {
            List list = AbstractC1311Jr2.a;
            return Integer.valueOf((int) Wj3.u());
        }
    });
    public static final C4388er2 s = a("measurement.upload.url", "https://app-measurement.com/a", "https://app-measurement.com/a", new InterfaceC7746qp2() { // from class: com.daaw.io2
        @Override // com.daaw.InterfaceC7746qp2
        public final Object zza() {
            List list = AbstractC1311Jr2.a;
            return Wj3.n();
        }
    });
    public static final C4388er2 t = a("measurement.upload.backoff_period", 43200000L, 43200000L, new InterfaceC7746qp2() { // from class: com.daaw.Mo2
        @Override // com.daaw.InterfaceC7746qp2
        public final Object zza() {
            List list = AbstractC1311Jr2.a;
            return Long.valueOf(Wj3.H());
        }
    });
    public static final C4388er2 u = a("measurement.upload.window_interval", 3600000L, 3600000L, new InterfaceC7746qp2() { // from class: com.daaw.RA1
        @Override // com.daaw.InterfaceC7746qp2
        public final Object zza() {
            List list = AbstractC1311Jr2.a;
            return Long.valueOf(Wj3.j());
        }
    });
    public static final C4388er2 v = a("measurement.upload.interval", 3600000L, 3600000L, new InterfaceC7746qp2() { // from class: com.daaw.tB1
        @Override // com.daaw.InterfaceC7746qp2
        public final Object zza() {
            List list = AbstractC1311Jr2.a;
            return Long.valueOf(Wj3.J());
        }
    });
    public static final C4388er2 w = a("measurement.upload.realtime_upload_interval", 10000L, 10000L, new InterfaceC7746qp2() { // from class: com.daaw.dD1
        @Override // com.daaw.InterfaceC7746qp2
        public final Object zza() {
            List list = AbstractC1311Jr2.a;
            return Long.valueOf(Wj3.B());
        }
    });
    public static final C4388er2 x = a("measurement.upload.debug_upload_interval", 1000L, 1000L, new InterfaceC7746qp2() { // from class: com.daaw.JD1
        @Override // com.daaw.InterfaceC7746qp2
        public final Object zza() {
            List list = AbstractC1311Jr2.a;
            return Long.valueOf(Wj3.s());
        }
    });
    public static final C4388er2 y = a("measurement.upload.minimum_delay", 500L, 500L, new InterfaceC7746qp2() { // from class: com.daaw.oE1
        @Override // com.daaw.InterfaceC7746qp2
        public final Object zza() {
            List list = AbstractC1311Jr2.a;
            return Long.valueOf(Wj3.z());
        }
    });
    public static final C4388er2 z = a("measurement.alarm_manager.minimum_interval", 60000L, 60000L, new InterfaceC7746qp2() { // from class: com.daaw.TE1
        @Override // com.daaw.InterfaceC7746qp2
        public final Object zza() {
            List list = AbstractC1311Jr2.a;
            return Long.valueOf(Wj3.y());
        }
    });
    public static final C4388er2 A = a("measurement.upload.stale_data_deletion_interval", 86400000L, 86400000L, new InterfaceC7746qp2() { // from class: com.daaw.yF1
        @Override // com.daaw.InterfaceC7746qp2
        public final Object zza() {
            List list = AbstractC1311Jr2.a;
            return Long.valueOf(Wj3.E());
        }
    });
    public static final C4388er2 B = a("measurement.upload.refresh_blacklisted_config_interval", 604800000L, 604800000L, new InterfaceC7746qp2() { // from class: com.daaw.dG1
        @Override // com.daaw.InterfaceC7746qp2
        public final Object zza() {
            List list = AbstractC1311Jr2.a;
            return Long.valueOf(Wj3.C());
        }
    });
    public static final C4388er2 C = a("measurement.upload.initial_upload_delay_time", 15000L, 15000L, new InterfaceC7746qp2() { // from class: com.daaw.GG1
        @Override // com.daaw.InterfaceC7746qp2
        public final Object zza() {
            List list = AbstractC1311Jr2.a;
            return Long.valueOf(Wj3.I());
        }
    });
    public static final C4388er2 D = a("measurement.upload.retry_time", 1800000L, 1800000L, new InterfaceC7746qp2() { // from class: com.daaw.QH1
        @Override // com.daaw.InterfaceC7746qp2
        public final Object zza() {
            List list = AbstractC1311Jr2.a;
            return Long.valueOf(Wj3.i());
        }
    });
    public static final C4388er2 E = a("measurement.upload.retry_count", 6, 6, new InterfaceC7746qp2() { // from class: com.daaw.wI1
        @Override // com.daaw.InterfaceC7746qp2
        public final Object zza() {
            List list = AbstractC1311Jr2.a;
            return Integer.valueOf((int) Wj3.h());
        }
    });
    public static final C4388er2 F = a("measurement.upload.max_queue_time", 2419200000L, 2419200000L, new InterfaceC7746qp2() { // from class: com.daaw.cJ1
        @Override // com.daaw.InterfaceC7746qp2
        public final Object zza() {
            List list = AbstractC1311Jr2.a;
            return Long.valueOf(Wj3.e());
        }
    });
    public static final C4388er2 G = a("measurement.lifetimevalue.max_currency_tracked", 4, 4, new InterfaceC7746qp2() { // from class: com.daaw.kK1
        @Override // com.daaw.InterfaceC7746qp2
        public final Object zza() {
            List list = AbstractC1311Jr2.a;
            return Integer.valueOf((int) Wj3.t());
        }
    });

    static {
        Integer numValueOf = Integer.valueOf(RCHTTPStatusCodes.SUCCESS);
        H = a("measurement.audience.filter_result_max_count", numValueOf, numValueOf, new InterfaceC7746qp2() { // from class: com.daaw.OK1
            @Override // com.daaw.InterfaceC7746qp2
            public final Object zza() {
                List list = AbstractC1311Jr2.a;
                return Integer.valueOf((int) Wj3.w());
            }
        });
        I = a("measurement.upload.max_public_user_properties", 25, 25, null);
        J = a("measurement.upload.max_event_name_cardinality", 500, 500, null);
        K = a("measurement.upload.max_public_event_params", 25, 25, null);
        L = a("measurement.service_client.idle_disconnect_millis", 5000L, 5000L, new InterfaceC7746qp2() { // from class: com.daaw.tL1
            @Override // com.daaw.InterfaceC7746qp2
            public final Object zza() {
                List list = AbstractC1311Jr2.a;
                return Long.valueOf(Wj3.D());
            }
        });
        Boolean bool = Boolean.FALSE;
        M = a("measurement.test.boolean_flag", bool, bool, new InterfaceC7746qp2() { // from class: com.daaw.XL1
            @Override // com.daaw.InterfaceC7746qp2
            public final Object zza() {
                List list = AbstractC1311Jr2.a;
                return Boolean.valueOf(C9691xm3.f());
            }
        });
        N = a("measurement.test.string_flag", "---", "---", new InterfaceC7746qp2() { // from class: com.daaw.CM1
            @Override // com.daaw.InterfaceC7746qp2
            public final Object zza() {
                List list = AbstractC1311Jr2.a;
                return C9691xm3.e();
            }
        });
        O = a("measurement.test.long_flag", -1L, -1L, new InterfaceC7746qp2() { // from class: com.daaw.iN1
            @Override // com.daaw.InterfaceC7746qp2
            public final Object zza() {
                List list = AbstractC1311Jr2.a;
                return Long.valueOf(C9691xm3.c());
            }
        });
        P = a("measurement.test.int_flag", -2, -2, new InterfaceC7746qp2() { // from class: com.daaw.sO1
            @Override // com.daaw.InterfaceC7746qp2
            public final Object zza() {
                List list = AbstractC1311Jr2.a;
                return Integer.valueOf((int) C9691xm3.b());
            }
        });
        Double dValueOf = Double.valueOf(-3.0d);
        Q = a("measurement.test.double_flag", dValueOf, dValueOf, new InterfaceC7746qp2() { // from class: com.daaw.XO1
            @Override // com.daaw.InterfaceC7746qp2
            public final Object zza() {
                List list = AbstractC1311Jr2.a;
                return Double.valueOf(C9691xm3.a());
            }
        });
        R = a("measurement.experiment.max_ids", 50, 50, new InterfaceC7746qp2() { // from class: com.daaw.zP1
            @Override // com.daaw.InterfaceC7746qp2
            public final Object zza() {
                List list = AbstractC1311Jr2.a;
                return Integer.valueOf((int) Wj3.v());
            }
        });
        S = a("measurement.upload.max_item_scoped_custom_parameters", 27, 27, new InterfaceC7746qp2() { // from class: com.daaw.dQ1
            @Override // com.daaw.InterfaceC7746qp2
            public final Object zza() {
                List list = AbstractC1311Jr2.a;
                return Integer.valueOf((int) Wj3.x());
            }
        });
        T = a("measurement.max_bundles_per_iteration", 100, 100, new InterfaceC7746qp2() { // from class: com.daaw.jR1
            @Override // com.daaw.InterfaceC7746qp2
            public final Object zza() {
                List list = AbstractC1311Jr2.a;
                return Integer.valueOf((int) Wj3.q());
            }
        });
        U = a("measurement.sdk.attribution.cache.ttl", 604800000L, 604800000L, new InterfaceC7746qp2() { // from class: com.daaw.OR1
            @Override // com.daaw.InterfaceC7746qp2
            public final Object zza() {
                List list = AbstractC1311Jr2.a;
                return Long.valueOf(Wj3.F());
            }
        });
        V = a("measurement.redaction.app_instance_id.ttl", 7200000L, 7200000L, new InterfaceC7746qp2() { // from class: com.daaw.KS1
            @Override // com.daaw.InterfaceC7746qp2
            public final Object zza() {
                List list = AbstractC1311Jr2.a;
                return Long.valueOf(Wj3.G());
            }
        });
        Boolean bool2 = Boolean.TRUE;
        W = a("measurement.collection.log_event_and_bundle_v2", bool2, bool2, new InterfaceC7746qp2() { // from class: com.daaw.oT1
            @Override // com.daaw.InterfaceC7746qp2
            public final Object zza() {
                List list = AbstractC1311Jr2.a;
                return Boolean.valueOf(Dm3.b());
            }
        });
        X = a("measurement.quality.checksum", bool, bool, null);
        Y = a("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", bool, bool, new InterfaceC7746qp2() { // from class: com.daaw.UT1
            @Override // com.daaw.InterfaceC7746qp2
            public final Object zza() {
                List list = AbstractC1311Jr2.a;
                return Boolean.valueOf(Bk3.d());
            }
        });
        Z = a("measurement.audience.refresh_event_count_filters_timestamp", bool, bool, new InterfaceC7746qp2() { // from class: com.daaw.hV1
            @Override // com.daaw.InterfaceC7746qp2
            public final Object zza() {
                List list = AbstractC1311Jr2.a;
                return Boolean.valueOf(Bk3.c());
            }
        });
        a0 = a("measurement.audience.use_bundle_timestamp_for_event_count_filters", bool, bool, new InterfaceC7746qp2() { // from class: com.daaw.NV1
            @Override // com.daaw.InterfaceC7746qp2
            public final Object zza() {
                List list = AbstractC1311Jr2.a;
                return Boolean.valueOf(Bk3.e());
            }
        });
        b0 = a("measurement.sdk.collection.retrieve_deeplink_from_bow_2", bool2, bool2, new InterfaceC7746qp2() { // from class: com.daaw.tW1
            @Override // com.daaw.InterfaceC7746qp2
            public final Object zza() {
                List list = AbstractC1311Jr2.a;
                return Boolean.valueOf(C4942go3.b());
            }
        });
        c0 = a("measurement.sdk.collection.last_deep_link_referrer_campaign2", bool, bool, new InterfaceC7746qp2() { // from class: com.daaw.bX1
            @Override // com.daaw.InterfaceC7746qp2
            public final Object zza() {
                List list = AbstractC1311Jr2.a;
                return Boolean.valueOf(Ll3.b());
            }
        });
        d0 = a("measurement.lifecycle.app_in_background_parameter", bool, bool, new InterfaceC7746qp2() { // from class: com.daaw.HX1
            @Override // com.daaw.InterfaceC7746qp2
            public final Object zza() {
                List list = AbstractC1311Jr2.a;
                return Boolean.valueOf(Rl3.b());
            }
        });
        e0 = a("measurement.integration.disable_firebase_instance_id", bool, bool, new InterfaceC7746qp2() { // from class: com.daaw.TY1
            @Override // com.daaw.InterfaceC7746qp2
            public final Object zza() {
                List list = AbstractC1311Jr2.a;
                return Boolean.valueOf(C3260ao3.c());
            }
        });
        f0 = a("measurement.collection.service.update_with_analytics_fix", bool, bool, new InterfaceC7746qp2() { // from class: com.daaw.yZ1
            @Override // com.daaw.InterfaceC7746qp2
            public final Object zza() {
                List list = AbstractC1311Jr2.a;
                return Boolean.valueOf(C6905no3.b());
            }
        });
        g0 = a("measurement.client.firebase_feature_rollout.v1.enable", bool2, bool2, new InterfaceC7746qp2() { // from class: com.daaw.d02
            @Override // com.daaw.InterfaceC7746qp2
            public final Object zza() {
                List list = AbstractC1311Jr2.a;
                return Boolean.valueOf(C7443pk3.c());
            }
        });
        h0 = a("measurement.client.sessions.check_on_reset_and_enable2", bool2, bool2, new InterfaceC7746qp2() { // from class: com.daaw.K02
            @Override // com.daaw.InterfaceC7746qp2
            public final Object zza() {
                List list = AbstractC1311Jr2.a;
                return Boolean.valueOf(C5484il3.c());
            }
        });
        i0 = a("measurement.collection.synthetic_data_mitigation", bool, bool, new InterfaceC7746qp2() { // from class: com.daaw.U12
            @Override // com.daaw.InterfaceC7746qp2
            public final Object zza() {
                List list = AbstractC1311Jr2.a;
                return Boolean.valueOf(Un3.b());
            }
        });
        j0 = a("measurement.service.storage_consent_support_version", 203600, 203600, new InterfaceC7746qp2() { // from class: com.daaw.y22
            @Override // com.daaw.InterfaceC7746qp2
            public final Object zza() {
                List list = AbstractC1311Jr2.a;
                return Integer.valueOf((int) C4076dk3.a());
            }
        });
        k0 = a("measurement.client.click_identifier_control.dev", bool, bool, new InterfaceC7746qp2() { // from class: com.daaw.c32
            @Override // com.daaw.InterfaceC7746qp2
            public final Object zza() {
                List list = AbstractC1311Jr2.a;
                return Boolean.valueOf(Ji3.b());
            }
        });
        l0 = a("measurement.service.click_identifier_control", bool, bool, new InterfaceC7746qp2() { // from class: com.daaw.G32
            @Override // com.daaw.InterfaceC7746qp2
            public final Object zza() {
                List list = AbstractC1311Jr2.a;
                return Boolean.valueOf(Pi3.b());
            }
        });
        m0 = a("measurement.service.store_null_safelist", bool2, bool2, new InterfaceC7746qp2() { // from class: com.daaw.l42
            @Override // com.daaw.InterfaceC7746qp2
            public final Object zza() {
                List list = AbstractC1311Jr2.a;
                return Boolean.valueOf(C5760jk3.c());
            }
        });
        n0 = a("measurement.service.store_safelist", bool2, bool2, new InterfaceC7746qp2() { // from class: com.daaw.P42
            @Override // com.daaw.InterfaceC7746qp2
            public final Object zza() {
                List list = AbstractC1311Jr2.a;
                return Boolean.valueOf(C5760jk3.d());
            }
        });
        o0 = a("measurement.collection.enable_session_stitching_token.first_open_fix", bool2, bool2, new InterfaceC7746qp2() { // from class: com.daaw.Y52
            @Override // com.daaw.InterfaceC7746qp2
            public final Object zza() {
                List list = AbstractC1311Jr2.a;
                return Boolean.valueOf(C6054kn3.d());
            }
        });
        p0 = a("measurement.collection.enable_session_stitching_token.client.dev", bool2, bool2, new InterfaceC7746qp2() { // from class: com.daaw.E62
            @Override // com.daaw.InterfaceC7746qp2
            public final Object zza() {
                List list = AbstractC1311Jr2.a;
                return Boolean.valueOf(C6054kn3.c());
            }
        });
        q0 = a("measurement.session_stitching_token_enabled", bool, bool, new InterfaceC7746qp2() { // from class: com.daaw.i72
            @Override // com.daaw.InterfaceC7746qp2
            public final Object zza() {
                List list = AbstractC1311Jr2.a;
                return Boolean.valueOf(C6054kn3.e());
            }
        });
        r0 = a("measurement.sgtm.client.dev", bool, bool, new InterfaceC7746qp2() { // from class: com.daaw.K82
            @Override // com.daaw.InterfaceC7746qp2
            public final Object zza() {
                List list = AbstractC1311Jr2.a;
                return Boolean.valueOf(On3.c());
            }
        });
        s0 = a("measurement.sgtm.service", bool, bool, new InterfaceC7746qp2() { // from class: com.daaw.p92
            @Override // com.daaw.InterfaceC7746qp2
            public final Object zza() {
                List list = AbstractC1311Jr2.a;
                return Boolean.valueOf(On3.d());
            }
        });
        t0 = a("measurement.redaction.retain_major_os_version", bool2, bool2, new InterfaceC7746qp2() { // from class: com.daaw.V92
            @Override // com.daaw.InterfaceC7746qp2
            public final Object zza() {
                List list = AbstractC1311Jr2.a;
                return Boolean.valueOf(Tm3.b());
            }
        });
        u0 = a("measurement.redaction.scion_payload_generator", bool2, bool2, new InterfaceC7746qp2() { // from class: com.daaw.Ba2
            @Override // com.daaw.InterfaceC7746qp2
            public final Object zza() {
                List list = AbstractC1311Jr2.a;
                return Boolean.valueOf(Tm3.c());
            }
        });
        v0 = a("measurement.service.clear_global_params_on_uninstall", bool2, bool2, new InterfaceC7746qp2() { // from class: com.daaw.gb2
            @Override // com.daaw.InterfaceC7746qp2
            public final Object zza() {
                List list = AbstractC1311Jr2.a;
                return Boolean.valueOf(C7169ol3.c());
            }
        });
        w0 = a("measurement.sessionid.enable_client_session_id", bool2, bool2, new InterfaceC7746qp2() { // from class: com.daaw.Lb2
            @Override // com.daaw.InterfaceC7746qp2
            public final Object zza() {
                List list = AbstractC1311Jr2.a;
                return Boolean.valueOf(C4658fn3.c());
            }
        });
        x0 = a("measurement.sfmc.client", bool2, bool2, new InterfaceC7746qp2() { // from class: com.daaw.rc2
            @Override // com.daaw.InterfaceC7746qp2
            public final Object zza() {
                List list = AbstractC1311Jr2.a;
                return Boolean.valueOf(In3.c());
            }
        });
        y0 = a("measurement.sfmc.service", bool2, bool2, new InterfaceC7746qp2() { // from class: com.daaw.Ad2
            @Override // com.daaw.InterfaceC7746qp2
            public final Object zza() {
                List list = AbstractC1311Jr2.a;
                return Boolean.valueOf(In3.d());
            }
        });
        z0 = a("measurement.gmscore_feature_tracking", bool2, bool2, new InterfaceC7746qp2() { // from class: com.daaw.ge2
            @Override // com.daaw.InterfaceC7746qp2
            public final Object zza() {
                List list = AbstractC1311Jr2.a;
                return Boolean.valueOf(C8842ul3.c());
            }
        });
        A0 = a("measurement.fix_health_monitor_stack_trace", bool2, bool2, new InterfaceC7746qp2() { // from class: com.daaw.of2
            @Override // com.daaw.InterfaceC7746qp2
            public final Object zza() {
                List list = AbstractC1311Jr2.a;
                return Boolean.valueOf(C3802cl3.c());
            }
        });
        B0 = a("measurement.item_scoped_custom_parameters.client", bool2, bool2, new InterfaceC7746qp2() { // from class: com.daaw.Sf2
            @Override // com.daaw.InterfaceC7746qp2
            public final Object zza() {
                List list = AbstractC1311Jr2.a;
                return Boolean.valueOf(Cl3.c());
            }
        });
        C0 = a("measurement.item_scoped_custom_parameters.service", bool, bool, new InterfaceC7746qp2() { // from class: com.daaw.wg2
            @Override // com.daaw.InterfaceC7746qp2
            public final Object zza() {
                List list = AbstractC1311Jr2.a;
                return Boolean.valueOf(Cl3.d());
            }
        });
        D0 = a("measurement.remove_app_background.client", bool, bool, new InterfaceC7746qp2() { // from class: com.daaw.ah2
            @Override // com.daaw.InterfaceC7746qp2
            public final Object zza() {
                List list = AbstractC1311Jr2.a;
                return Boolean.valueOf(Zm3.c());
            }
        });
        E0 = a("measurement.rb.attribution.service", bool, bool, new InterfaceC7746qp2() { // from class: com.daaw.Eh2
            @Override // com.daaw.InterfaceC7746qp2
            public final Object zza() {
                List list = AbstractC1311Jr2.a;
                return Boolean.valueOf(Mm3.b());
            }
        });
        F0 = a("measurement.collection.client.log_target_api_version", bool2, bool2, new InterfaceC7746qp2() { // from class: com.daaw.ji2
            @Override // com.daaw.InterfaceC7746qp2
            public final Object zza() {
                return Boolean.valueOf(C4932gm3.c());
            }
        });
        G0 = a("measurement.collection.service.log_target_api_version", bool2, bool2, new InterfaceC7746qp2() { // from class: com.daaw.Ni2
            @Override // com.daaw.InterfaceC7746qp2
            public final Object zza() {
                return Boolean.valueOf(C4932gm3.d());
            }
        });
        H0 = a("measurement.client.deep_link_referrer_fix", bool2, bool2, new InterfaceC7746qp2() { // from class: com.daaw.rj2
            @Override // com.daaw.InterfaceC7746qp2
            public final Object zza() {
                return Boolean.valueOf(Wk3.c());
            }
        });
        I0 = a("measurement.client.sessions.enable_fix_background_engagement", bool, bool, new InterfaceC7746qp2() { // from class: com.daaw.zk2
            @Override // com.daaw.InterfaceC7746qp2
            public final Object zza() {
                return Boolean.valueOf(C7737qn3.b());
            }
        });
        J0 = a("measurement.link_sst_to_sid", bool2, bool2, new InterfaceC7746qp2() { // from class: com.daaw.Fl2
            @Override // com.daaw.InterfaceC7746qp2
            public final Object zza() {
                List list = AbstractC1311Jr2.a;
                return Boolean.valueOf(C6054kn3.f());
            }
        });
        K0 = a("measurement.client.ad_id_consent_fix", bool2, bool2, new InterfaceC7746qp2() { // from class: com.daaw.jm2
            @Override // com.daaw.InterfaceC7746qp2
            public final Object zza() {
                return Boolean.valueOf(C9123vk3.c());
            }
        });
    }

    public static C4388er2 a(String str, Object obj, Object obj2, InterfaceC7746qp2 interfaceC7746qp2) {
        C4388er2 c4388er2 = new C4388er2(str, obj, obj2, interfaceC7746qp2, null);
        a.add(c4388er2);
        return c4388er2;
    }
}
