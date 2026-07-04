package com.daaw;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.RequestConfiguration;

/* JADX INFO: loaded from: classes.dex */
public abstract class P2 {
    public static final a a = new a(null);

    public static final class a {
        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public final RequestConfiguration a() {
            RequestConfiguration requestConfigurationBuild = new RequestConfiguration.Builder().build();
            G10.f(requestConfigurationBuild, "build(...)");
            return requestConfigurationBuild;
        }

        public final AdRequest b() {
            AdRequest adRequestBuild = new AdRequest.Builder().build();
            G10.f(adRequestBuild, "build(...)");
            return adRequestBuild;
        }

        public a() {
        }
    }
}
