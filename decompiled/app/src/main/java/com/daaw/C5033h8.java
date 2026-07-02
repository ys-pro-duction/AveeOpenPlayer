package com.daaw;

import android.content.Context;
import android.os.Looper;
import com.daaw.AbstractC8245se;
import com.daaw.AbstractC9878yT;
import com.google.android.gms.common.Feature;
import java.util.Set;

/* JADX INFO: renamed from: com.daaw.h8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5033h8 {
    public final a a;
    public final g b;
    public final String c;

    /* JADX INFO: renamed from: com.daaw.h8$a */
    public static abstract class a extends e {
        public f a(Context context, Looper looper, C2763Xl c2763Xl, Object obj, InterfaceC0359Aq interfaceC0359Aq, InterfaceC5787jq0 interfaceC5787jq0) {
            throw new UnsupportedOperationException("buildClient must be implemented");
        }

        public f b(Context context, Looper looper, C2763Xl c2763Xl, Object obj, AbstractC9878yT.a aVar, AbstractC9878yT.b bVar) {
            return a(context, looper, c2763Xl, obj, aVar, bVar);
        }
    }

    /* JADX INFO: renamed from: com.daaw.h8$b */
    public interface b {
    }

    /* JADX INFO: renamed from: com.daaw.h8$c */
    public static class c {
    }

    /* JADX INFO: renamed from: com.daaw.h8$d */
    public interface d {
        public static final a a = new a(null);

        /* JADX INFO: renamed from: com.daaw.h8$d$a */
        public static final class a implements d {
            public /* synthetic */ a(AbstractC1697Nk1 abstractC1697Nk1) {
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.h8$e */
    public static abstract class e {
    }

    /* JADX INFO: renamed from: com.daaw.h8$f */
    public interface f extends b {
        Set a();

        void connect(AbstractC8245se.c cVar);

        void disconnect();

        void disconnect(String str);

        Feature[] getAvailableFeatures();

        String getEndpointPackageName();

        String getLastDisconnectMessage();

        int getMinApkVersion();

        void getRemoteService(com.google.android.gms.common.internal.b bVar, Set set);

        boolean isConnected();

        boolean isConnecting();

        void onUserSignOut(AbstractC8245se.e eVar);

        boolean requiresGooglePlayServices();

        boolean requiresSignIn();
    }

    /* JADX INFO: renamed from: com.daaw.h8$g */
    public static final class g extends c {
    }

    public C5033h8(String str, a aVar, g gVar) {
        AbstractC7506py0.m(aVar, "Cannot construct an Api with a null ClientBuilder");
        AbstractC7506py0.m(gVar, "Cannot construct an Api with a null ClientKey");
        this.c = str;
        this.a = aVar;
        this.b = gVar;
    }

    public final a a() {
        return this.a;
    }

    public final String b() {
        return this.c;
    }
}
