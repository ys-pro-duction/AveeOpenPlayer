package com.daaw;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.daaw.AbstractC0348An0;
import com.daaw.AbstractC0516Cd0;
import com.daaw.AbstractC1045Hd0;
import com.daaw.AbstractC2137Rl;
import com.daaw.C1691Nj;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: renamed from: com.daaw.Nj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1691Nj implements G51 {
    public final InterfaceC2073Qv a;
    public final ConnectivityManager b;
    public final Context c;
    public final URL d;
    public final InterfaceC6333lm e;
    public final InterfaceC6333lm f;
    public final int g;

    /* JADX INFO: renamed from: com.daaw.Nj$a */
    public static final class a {
        public final URL a;
        public final AbstractC2423Ue b;
        public final String c;

        public a(URL url, AbstractC2423Ue abstractC2423Ue, String str) {
            this.a = url;
            this.b = abstractC2423Ue;
            this.c = str;
        }

        public a a(URL url) {
            return new a(url, this.b, this.c);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Nj$b */
    public static final class b {
        public final int a;
        public final URL b;
        public final long c;

        public b(int i, URL url, long j) {
            this.a = i;
            this.b = url;
            this.c = j;
        }
    }

    public C1691Nj(Context context, InterfaceC6333lm interfaceC6333lm, InterfaceC6333lm interfaceC6333lm2, int i) {
        this.a = AbstractC2423Ue.b();
        this.c = context;
        this.b = (ConnectivityManager) context.getSystemService("connectivity");
        this.d = m(C6313li.c);
        this.e = interfaceC6333lm2;
        this.f = interfaceC6333lm;
        this.g = i;
    }

    public static /* synthetic */ a d(a aVar, b bVar) {
        URL url = bVar.b;
        if (url == null) {
            return null;
        }
        AbstractC2732Xd0.b("CctTransportBackend", "Following redirect to: %s", url);
        return aVar.a(bVar.b);
    }

    public static int f(NetworkInfo networkInfo) {
        if (networkInfo == null) {
            return AbstractC0348An0.b.UNKNOWN_MOBILE_SUBTYPE.c();
        }
        int subtype = networkInfo.getSubtype();
        if (subtype == -1) {
            return AbstractC0348An0.b.COMBINED.c();
        }
        if (AbstractC0348An0.b.a(subtype) != null) {
            return subtype;
        }
        return 0;
    }

    public static int g(NetworkInfo networkInfo) {
        return networkInfo == null ? AbstractC0348An0.c.NONE.c() : networkInfo.getType();
    }

    public static int h(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            AbstractC2732Xd0.d("CctTransportBackend", "Unable to find version code for package", e);
            return -1;
        }
    }

    public static TelephonyManager j(Context context) {
        return (TelephonyManager) context.getSystemService("phone");
    }

    public static long k() {
        Calendar.getInstance();
        return TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000;
    }

    public static InputStream l(InputStream inputStream, String str) {
        return "gzip".equals(str) ? new GZIPInputStream(inputStream) : inputStream;
    }

    public static URL m(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException("Invalid url: " + str, e);
        }
    }

    @Override // com.daaw.G51
    public AbstractC2835Yd a(AbstractC2731Xd abstractC2731Xd) {
        AbstractC2423Ue abstractC2423UeI = i(abstractC2731Xd);
        URL urlM = this.d;
        if (abstractC2731Xd.c() != null) {
            try {
                C6313li c6313liC = C6313li.c(abstractC2731Xd.c());
                strD = c6313liC.d() != null ? c6313liC.d() : null;
                if (c6313liC.e() != null) {
                    urlM = m(c6313liC.e());
                }
            } catch (IllegalArgumentException unused) {
                return AbstractC2835Yd.a();
            }
        }
        try {
            b bVar = (b) AbstractC5918kJ0.a(5, new a(urlM, abstractC2423UeI, strD), new InterfaceC3707cR() { // from class: com.daaw.Lj
                @Override // com.daaw.InterfaceC3707cR
                public final Object apply(Object obj) {
                    return this.a.e((C1691Nj.a) obj);
                }
            }, new InterfaceC6764nJ0() { // from class: com.daaw.Mj
                @Override // com.daaw.InterfaceC6764nJ0
                public final Object a(Object obj, Object obj2) {
                    return C1691Nj.d((C1691Nj.a) obj, (C1691Nj.b) obj2);
                }
            });
            int i = bVar.a;
            if (i == 200) {
                return AbstractC2835Yd.e(bVar.c);
            }
            if (i < 500 && i != 404) {
                return i == 400 ? AbstractC2835Yd.d() : AbstractC2835Yd.a();
            }
            return AbstractC2835Yd.f();
        } catch (IOException e) {
            AbstractC2732Xd0.d("CctTransportBackend", "Could not make request to the backend", e);
            return AbstractC2835Yd.f();
        }
    }

    @Override // com.daaw.G51
    public KH b(KH kh) {
        NetworkInfo activeNetworkInfo = this.b.getActiveNetworkInfo();
        return kh.l().a("sdk-version", Build.VERSION.SDK_INT).c("model", Build.MODEL).c("hardware", Build.HARDWARE).c("device", Build.DEVICE).c("product", Build.PRODUCT).c("os-uild", Build.ID).c("manufacturer", Build.MANUFACTURER).c("fingerprint", Build.FINGERPRINT).b("tz-offset", k()).a("net-type", g(activeNetworkInfo)).a("mobile-subtype", f(activeNetworkInfo)).c("country", Locale.getDefault().getCountry()).c("locale", Locale.getDefault().getLanguage()).c("mcc_mnc", j(this.c).getSimOperator()).c("application_build", Integer.toString(h(this.c))).d();
    }

    public final b e(a aVar) throws IOException {
        AbstractC2732Xd0.f("CctTransportBackend", "Making request to: %s", aVar.a);
        HttpURLConnection httpURLConnection = (HttpURLConnection) aVar.a.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(this.g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", String.format("datatransport/%s android/", "3.1.9"));
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = aVar.c;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    this.a.a(aVar.b, new BufferedWriter(new OutputStreamWriter(gZIPOutputStream)));
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    AbstractC2732Xd0.f("CctTransportBackend", "Status Code: %d", Integer.valueOf(responseCode));
                    AbstractC2732Xd0.b("CctTransportBackend", "Content-Type: %s", httpURLConnection.getHeaderField("Content-Type"));
                    AbstractC2732Xd0.b("CctTransportBackend", "Content-Encoding: %s", httpURLConnection.getHeaderField("Content-Encoding"));
                    if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                        return new b(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                    }
                    if (responseCode != 200) {
                        return new b(responseCode, null, 0L);
                    }
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        InputStream inputStreamL = l(inputStream, httpURLConnection.getHeaderField("Content-Encoding"));
                        try {
                            b bVar = new b(responseCode, null, AbstractC1149Id0.b(new BufferedReader(new InputStreamReader(inputStreamL))).c());
                            if (inputStreamL != null) {
                                inputStreamL.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            return bVar;
                        } finally {
                        }
                    } catch (Throwable th) {
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                } finally {
                }
            } catch (Throwable th3) {
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                }
                throw th3;
            }
        } catch (GG e) {
            e = e;
            AbstractC2732Xd0.d("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new b(RCHTTPStatusCodes.BAD_REQUEST, null, 0L);
        } catch (ConnectException e2) {
            e = e2;
            AbstractC2732Xd0.d("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new b(500, null, 0L);
        } catch (UnknownHostException e3) {
            e = e3;
            AbstractC2732Xd0.d("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new b(500, null, 0L);
        } catch (IOException e4) {
            e = e4;
            AbstractC2732Xd0.d("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new b(RCHTTPStatusCodes.BAD_REQUEST, null, 0L);
        }
    }

    public final AbstractC2423Ue i(AbstractC2731Xd abstractC2731Xd) {
        AbstractC0516Cd0.a aVarJ;
        HashMap map = new HashMap();
        for (KH kh : abstractC2731Xd.b()) {
            String strJ = kh.j();
            if (map.containsKey(strJ)) {
                ((List) map.get(strJ)).add(kh);
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(kh);
                map.put(strJ, arrayList);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            KH kh2 = (KH) ((List) entry.getValue()).get(0);
            AbstractC1045Hd0.a aVarB = AbstractC1045Hd0.a().f(EnumC3927dC0.DEFAULT).g(this.f.a()).h(this.e.a()).b(AbstractC2137Rl.a().c(AbstractC2137Rl.b.ANDROID_FIREBASE).b(AbstractC4171e5.a().m(Integer.valueOf(kh2.g("sdk-version"))).j(kh2.b("model")).f(kh2.b("hardware")).d(kh2.b("device")).l(kh2.b("product")).k(kh2.b("os-uild")).h(kh2.b("manufacturer")).e(kh2.b("fingerprint")).c(kh2.b("country")).g(kh2.b("locale")).i(kh2.b("mcc_mnc")).b(kh2.b("application_build")).a()).a());
            try {
                aVarB.i(Integer.parseInt((String) entry.getKey()));
            } catch (NumberFormatException unused) {
                aVarB.j((String) entry.getKey());
            }
            ArrayList arrayList3 = new ArrayList();
            for (KH kh3 : (List) entry.getValue()) {
                C10105zG c10105zGE = kh3.e();
                EG egB = c10105zGE.b();
                if (egB.equals(EG.b("proto"))) {
                    aVarJ = AbstractC0516Cd0.j(c10105zGE.a());
                } else if (egB.equals(EG.b("json"))) {
                    aVarJ = AbstractC0516Cd0.i(new String(c10105zGE.a(), Charset.forName("UTF-8")));
                } else {
                    AbstractC2732Xd0.g("CctTransportBackend", "Received event of unsupported encoding %s. Skipping...", egB);
                }
                aVarJ.c(kh3.f()).d(kh3.k()).h(kh3.h("tz-offset")).e(AbstractC0348An0.a().c(AbstractC0348An0.c.a(kh3.g("net-type"))).b(AbstractC0348An0.b.a(kh3.g("mobile-subtype"))).a());
                if (kh3.d() != null) {
                    aVarJ.b(kh3.d());
                }
                arrayList3.add(aVarJ.a());
            }
            aVarB.c(arrayList3);
            arrayList2.add(aVarB.a());
        }
        return AbstractC2423Ue.a(arrayList2);
    }

    public C1691Nj(Context context, InterfaceC6333lm interfaceC6333lm, InterfaceC6333lm interfaceC6333lm2) {
        this(context, interfaceC6333lm, interfaceC6333lm2, 130000);
    }
}
