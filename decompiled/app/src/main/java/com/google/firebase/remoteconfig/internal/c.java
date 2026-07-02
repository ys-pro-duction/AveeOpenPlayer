package com.google.firebase.remoteconfig.internal;

import android.text.format.DateUtils;
import com.daaw.A11;
import com.daaw.AbstractC6963o11;
import com.daaw.AbstractC7236p00;
import com.daaw.C3409bM;
import com.daaw.C3687cM;
import com.daaw.C3966dM;
import com.daaw.C4244eM;
import com.daaw.C5786jq;
import com.daaw.InterfaceC1519Ls;
import com.daaw.InterfaceC5485im;
import com.daaw.InterfaceC7569qB0;
import com.daaw.InterfaceC9066vZ0;
import com.daaw.RL;
import com.daaw.W3;
import com.google.firebase.remoteconfig.internal.d;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: loaded from: classes3.dex */
public class c {
    public static final long j = TimeUnit.HOURS.toSeconds(12);
    public static final int[] k = {2, 4, 8, 16, 32, 64, 128, PSKKeyManager.MAX_KEY_LENGTH_BYTES};
    public final RL a;
    public final InterfaceC7569qB0 b;
    public final Executor c;
    public final InterfaceC5485im d;
    public final Random e;
    public final C5786jq f;
    public final ConfigFetchHttpClient g;
    public final d h;
    public final Map i;

    public static class a {
        public final Date a;
        public final int b;
        public final com.google.firebase.remoteconfig.internal.b c;
        public final String d;

        public a(Date date, int i, com.google.firebase.remoteconfig.internal.b bVar, String str) {
            this.a = date;
            this.b = i;
            this.c = bVar;
            this.d = str;
        }

        public static a a(Date date, com.google.firebase.remoteconfig.internal.b bVar) {
            return new a(date, 1, bVar, null);
        }

        public static a b(com.google.firebase.remoteconfig.internal.b bVar, String str) {
            return new a(bVar.g(), 0, bVar, str);
        }

        public static a c(Date date) {
            return new a(date, 2, null, null);
        }

        public com.google.firebase.remoteconfig.internal.b d() {
            return this.c;
        }

        public String e() {
            return this.d;
        }

        public int f() {
            return this.b;
        }
    }

    public enum b {
        BASE("BASE"),
        REALTIME("REALTIME");

        public final String B;

        b(String str) {
            this.B = str;
        }

        public String a() {
            return this.B;
        }
    }

    public c(RL rl, InterfaceC7569qB0 interfaceC7569qB0, Executor executor, InterfaceC5485im interfaceC5485im, Random random, C5786jq c5786jq, ConfigFetchHttpClient configFetchHttpClient, d dVar, Map map) {
        this.a = rl;
        this.b = interfaceC7569qB0;
        this.c = executor;
        this.d = interfaceC5485im;
        this.e = random;
        this.f = c5786jq;
        this.g = configFetchHttpClient;
        this.h = dVar;
        this.i = map;
    }

    public static /* synthetic */ AbstractC6963o11 a(c cVar, AbstractC6963o11 abstractC6963o11, AbstractC6963o11 abstractC6963o112, Date date, Map map, AbstractC6963o11 abstractC6963o113) {
        cVar.getClass();
        return !abstractC6963o11.n() ? A11.d(new C3409bM("Firebase Installations failed to get installation ID for fetch.", abstractC6963o11.j())) : !abstractC6963o112.n() ? A11.d(new C3409bM("Firebase Installations failed to get installation auth token for fetch.", abstractC6963o112.j())) : cVar.l((String) abstractC6963o11.k(), ((AbstractC7236p00) abstractC6963o112.k()).b(), date, map);
    }

    public static /* synthetic */ AbstractC6963o11 c(c cVar, Date date, AbstractC6963o11 abstractC6963o11) {
        cVar.x(abstractC6963o11, date);
        return abstractC6963o11;
    }

    public final boolean f(long j2, Date date) {
        Date dateD = this.h.d();
        if (dateD.equals(d.e)) {
            return false;
        }
        return date.before(new Date(dateD.getTime() + TimeUnit.SECONDS.toMillis(j2)));
    }

    public final C4244eM g(C4244eM c4244eM) throws C3409bM {
        String str;
        int iB = c4244eM.b();
        if (iB == 401) {
            str = "The request did not have the required credentials. Please make sure your google-services.json is valid.";
        } else if (iB == 403) {
            str = "The user is not authorized to access the project. Please make sure you are using the API key that corresponds to your Firebase project.";
        } else {
            if (iB == 429) {
                throw new C3409bM("The throttled response from the server was not handled correctly by the FRC SDK.");
            }
            if (iB != 500) {
                switch (iB) {
                    case 502:
                    case 503:
                    case 504:
                        str = "The server is unavailable. Please try again later.";
                        break;
                    default:
                        str = "The server returned an unexpected error.";
                        break;
                }
            } else {
                str = "There was an internal server error.";
            }
        }
        return new C4244eM(c4244eM.b(), "Fetch failed: " + str, c4244eM);
    }

    public final String h(long j2) {
        return String.format("Fetch is throttled. Please wait before calling fetch again: %s", DateUtils.formatElapsedTime(TimeUnit.MILLISECONDS.toSeconds(j2)));
    }

    public AbstractC6963o11 i() {
        return j(this.h.f());
    }

    public AbstractC6963o11 j(final long j2) {
        final HashMap map = new HashMap(this.i);
        map.put("X-Firebase-RC-Fetch-Type", b.BASE.a() + "/1");
        return this.f.e().i(this.c, new InterfaceC1519Ls() { // from class: com.daaw.lq
            @Override // com.daaw.InterfaceC1519Ls
            public final Object a(AbstractC6963o11 abstractC6963o11) {
                return this.a.m(abstractC6963o11, j2, map);
            }
        });
    }

    public final a k(String str, String str2, Date date, Map map) throws C3687cM {
        Date date2;
        try {
            date2 = date;
        } catch (C4244eM e) {
            e = e;
            date2 = date;
        }
        try {
            a aVarFetch = this.g.fetch(this.g.d(), str, str2, s(), this.h.c(), map, p(), date2);
            if (aVarFetch.d() != null) {
                this.h.m(aVarFetch.d().i());
            }
            if (aVarFetch.e() != null) {
                this.h.l(aVarFetch.e());
            }
            this.h.h();
            return aVarFetch;
        } catch (C4244eM e2) {
            e = e2;
            C4244eM c4244eM = e;
            d.a aVarV = v(c4244eM.b(), date2);
            if (u(aVarV, c4244eM.b())) {
                throw new C3966dM(aVarV.a().getTime());
            }
            throw g(c4244eM);
        }
    }

    public final AbstractC6963o11 l(String str, String str2, Date date, Map map) {
        try {
            final a aVarK = k(str, str2, date, map);
            return aVarK.f() != 0 ? A11.e(aVarK) : this.f.i(aVarK.d()).p(this.c, new InterfaceC9066vZ0() { // from class: com.daaw.oq
                @Override // com.daaw.InterfaceC9066vZ0
                public final AbstractC6963o11 a(Object obj) {
                    return A11.e(aVarK);
                }
            });
        } catch (C3687cM e) {
            return A11.d(e);
        }
    }

    public final AbstractC6963o11 m(AbstractC6963o11 abstractC6963o11, long j2, final Map map) {
        final c cVar;
        AbstractC6963o11 abstractC6963o11I;
        final Date date = new Date(this.d.a());
        if (abstractC6963o11.n() && f(j2, date)) {
            return A11.e(a.c(date));
        }
        Date dateO = o(date);
        if (dateO != null) {
            abstractC6963o11I = A11.d(new C3966dM(h(dateO.getTime() - date.getTime()), dateO.getTime()));
            cVar = this;
        } else {
            final AbstractC6963o11 id = this.a.getId();
            final AbstractC6963o11 abstractC6963o11A = this.a.a(false);
            cVar = this;
            abstractC6963o11I = A11.j(id, abstractC6963o11A).i(this.c, new InterfaceC1519Ls() { // from class: com.daaw.mq
                @Override // com.daaw.InterfaceC1519Ls
                public final Object a(AbstractC6963o11 abstractC6963o112) {
                    return com.google.firebase.remoteconfig.internal.c.a(this.a, id, abstractC6963o11A, date, map, abstractC6963o112);
                }
            });
        }
        return abstractC6963o11I.i(cVar.c, new InterfaceC1519Ls() { // from class: com.daaw.nq
            @Override // com.daaw.InterfaceC1519Ls
            public final Object a(AbstractC6963o11 abstractC6963o112) {
                return com.google.firebase.remoteconfig.internal.c.c(this.a, date, abstractC6963o112);
            }
        });
    }

    public AbstractC6963o11 n(b bVar, int i) {
        final HashMap map = new HashMap(this.i);
        map.put("X-Firebase-RC-Fetch-Type", bVar.a() + "/" + i);
        return this.f.e().i(this.c, new InterfaceC1519Ls() { // from class: com.daaw.kq
            @Override // com.daaw.InterfaceC1519Ls
            public final Object a(AbstractC6963o11 abstractC6963o11) {
                return this.a.m(abstractC6963o11, 0L, map);
            }
        });
    }

    public final Date o(Date date) {
        Date dateA = this.h.a().a();
        if (date.before(dateA)) {
            return dateA;
        }
        return null;
    }

    public final Long p() {
        W3 w3 = (W3) this.b.get();
        if (w3 == null) {
            return null;
        }
        return (Long) w3.a(true).get("_fot");
    }

    public final long q(int i) {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        int[] iArr = k;
        long millis = timeUnit.toMillis(iArr[Math.min(i, iArr.length) - 1]);
        return (millis / 2) + ((long) this.e.nextInt((int) millis));
    }

    public long r() {
        return this.h.e();
    }

    public final Map s() {
        HashMap map = new HashMap();
        W3 w3 = (W3) this.b.get();
        if (w3 != null) {
            for (Map.Entry entry : w3.a(false).entrySet()) {
                map.put((String) entry.getKey(), entry.getValue().toString());
            }
        }
        return map;
    }

    public final boolean t(int i) {
        return i == 429 || i == 502 || i == 503 || i == 504;
    }

    public final boolean u(d.a aVar, int i) {
        return aVar.b() > 1 || i == 429;
    }

    public final d.a v(int i, Date date) {
        if (t(i)) {
            w(date);
        }
        return this.h.a();
    }

    public final void w(Date date) {
        int iB = this.h.a().b() + 1;
        this.h.j(iB, new Date(date.getTime() + q(iB)));
    }

    public final void x(AbstractC6963o11 abstractC6963o11, Date date) {
        if (abstractC6963o11.n()) {
            this.h.p(date);
            return;
        }
        Exception excJ = abstractC6963o11.j();
        if (excJ == null) {
            return;
        }
        if (excJ instanceof C3966dM) {
            this.h.q();
        } else {
            this.h.o();
        }
    }
}
