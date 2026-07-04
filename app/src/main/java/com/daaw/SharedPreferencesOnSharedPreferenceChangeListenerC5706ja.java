package com.daaw;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Environment;
import android.os.storage.StorageManager;
import android.os.storage.StorageVolume;
import android.preference.PreferenceManager;
import com.revenuecat.purchases.common.Constants;
import com.revenuecat.purchases.common.UtilsKt;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: renamed from: com.daaw.ja, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class SharedPreferencesOnSharedPreferenceChangeListenerC5706ja implements SharedPreferences.OnSharedPreferenceChangeListener {
    public AtomicIntegerArray a = new AtomicIntegerArray(E - m);
    public AtomicIntegerArray b = new AtomicIntegerArray(Y - F);
    public AtomicReferenceArray c = new AtomicReferenceArray(y0 - Z);
    public String d = null;
    public String e = null;
    public boolean f = false;
    public static C0425Bg1 g = new C0425Bg1();
    public static C0321Ag1 h = new C0321Ag1();
    public static C0425Bg1 i = new C0425Bg1();
    public static C0321Ag1 j = new C0321Ag1();
    public static final Object k = new Object();
    public static SharedPreferencesOnSharedPreferenceChangeListenerC5706ja l = null;
    public static int m = 1000;
    public static int n = 1000;
    public static int o = 1000 + 1;
    public static int p = 1000 + 2;
    public static int q = 1000 + 3;
    public static int r = 1000 + 4;
    public static int s = 1000 + 5;
    public static int t = 1000 + 6;
    public static int u = 1000 + 7;
    public static int v = 1000 + 8;
    public static int w = 1000 + 9;
    public static int x = 1000 + 10;
    public static int y = 1000 + 11;
    public static int z = 1000 + 12;
    public static int A = 1000 + 13;
    public static int B = 1000 + 14;
    public static int C = 1000 + 15;
    public static int D = 1000 + 16;
    public static int E = 1000 + 17;
    public static int F = 2000;
    public static int G = 2000;
    public static int H = 2000 + 1;
    public static int I = 2000 + 2;
    public static int J = 2000 + 3;
    public static int K = 2000 + 4;
    public static int L = 2000 + 5;
    public static int M = 2000 + 6;
    public static int N = 2000 + 7;
    public static int O = 2000 + 8;
    public static int P = 2000 + 9;
    public static int Q = 2000 + 10;
    public static int R = 2000 + 11;
    public static int S = 2000 + 12;
    public static int T = 2000 + 13;
    public static int U = 2000 + 14;
    public static int V = 2000 + 15;
    public static int W = 2000 + 16;
    public static int X = 2000 + 17;
    public static int Y = 2000 + 18;
    public static int Z = 3000;
    public static int a0 = 3000;
    public static int b0 = 3000 + 1;
    public static int c0 = 3000 + 2;
    public static int d0 = 3000 + 3;
    public static int e0 = 3000 + 4;
    public static int f0 = 3000 + 5;
    public static int g0 = 3000 + 6;
    public static int h0 = 3000 + 7;
    public static int i0 = 3000 + 8;
    public static int j0 = 3000 + 9;
    public static int k0 = 3000 + 10;
    public static int l0 = 3000 + 11;
    public static int m0 = 3000 + 12;
    public static int n0 = 3000 + 13;
    public static int o0 = 3000 + 14;
    public static int p0 = 3000 + 15;
    public static int q0 = 3000 + 16;
    public static int r0 = 3000 + 17;
    public static int s0 = 3000 + 18;
    public static int t0 = 3000 + 118;
    public static int u0 = 3000 + 119;
    public static int v0 = 3000 + 220;
    public static int w0 = 3000 + 221;
    public static int x0 = 3000 + 222;
    public static int y0 = 3000 + 223;

    public SharedPreferencesOnSharedPreferenceChangeListenerC5706ja() {
        b0(n, false);
        b0(o, false);
        b0(p, true);
        b0(q, true);
        b0(r, false);
        b0(s, true);
        b0(t, true);
        b0(u, true);
        b0(v, true);
        b0(w, true);
        b0(x, true);
        b0(y, true);
        b0(A, true);
        b0(B, false);
        b0(D, false);
        b0(C, false);
        e0(G, 0);
        e0(H, 1);
        e0(I, 14);
        e0(J, 0);
        e0(K, 1);
        e0(L, 1);
        e0(M, 8);
        e0(N, 0);
        e0(O, 0);
        e0(P, -1000);
        e0(Q, -1);
        e0(R, 0);
        e0(S, 0);
        e0(T, 0);
        e0(U, 0);
        e0(V, 1);
        e0(W, 10);
        e0(X, 0);
        i0(a0, "");
        i0(m0, "");
        i0(v0, "");
        i0(w0, "");
        i0(x0, "");
    }

    public static boolean L(SharedPreferences sharedPreferences, String str, boolean z2) {
        try {
            return sharedPreferences.getBoolean(str, z2);
        } catch (Exception unused) {
            return z2;
        }
    }

    public static int M(SharedPreferences sharedPreferences, String str, int i2) {
        try {
            return sharedPreferences.getInt(str, i2);
        } catch (Exception unused) {
            return i2;
        }
    }

    public static long N(SharedPreferences sharedPreferences, String str, long j2) {
        try {
            return sharedPreferences.getLong(str, j2);
        } catch (Exception unused) {
            return j2;
        }
    }

    public static String P(SharedPreferences sharedPreferences, String str, String str2) {
        try {
            return sharedPreferences.getString(str, str2);
        } catch (Exception unused) {
            return str2;
        }
    }

    public static void R(SharedPreferences sharedPreferences, String str, boolean z2) {
        try {
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            editorEdit.putBoolean(str, z2);
            editorEdit.apply();
        } catch (Exception unused) {
        }
    }

    public static File a(int i2) {
        return AbstractC6831na.a("visualizer" + i2);
    }

    public static File b(File file, InputStream inputStream, String str) {
        File fileB;
        if (inputStream == null || (fileB = AbstractC0934Gb1.b(file, str)) == null) {
            return null;
        }
        try {
            AbstractC0934Gb1.a(inputStream, fileB);
            return fileB;
        } catch (IOException unused) {
            return null;
        }
    }

    public static SharedPreferencesOnSharedPreferenceChangeListenerC5706ja e() {
        SharedPreferencesOnSharedPreferenceChangeListenerC5706ja sharedPreferencesOnSharedPreferenceChangeListenerC5706ja;
        SharedPreferencesOnSharedPreferenceChangeListenerC5706ja sharedPreferencesOnSharedPreferenceChangeListenerC5706ja2 = l;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC5706ja2 != null) {
            return sharedPreferencesOnSharedPreferenceChangeListenerC5706ja2;
        }
        synchronized (k) {
            try {
                if (l == null) {
                    l = new SharedPreferencesOnSharedPreferenceChangeListenerC5706ja();
                }
                sharedPreferencesOnSharedPreferenceChangeListenerC5706ja = l;
            } catch (Throwable th) {
                throw th;
            }
        }
        return sharedPreferencesOnSharedPreferenceChangeListenerC5706ja;
    }

    public static int g(String str) {
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public static int j0(int i2) {
        if (i2 < 0) {
            return -1;
        }
        int i3 = t0;
        int i4 = s0;
        if (i2 <= i3 - i4) {
            return i2 + i4;
        }
        return -1;
    }

    public static File u(StorageVolume storageVolume) {
        try {
            Field declaredField = AbstractC5426ia.a().getDeclaredField("mPath");
            declaredField.setAccessible(true);
            return (File) declaredField.get(storageVolume);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void A(SharedPreferences sharedPreferences) {
        a0(A, L(sharedPreferences, "pref_visualizerGlobalSession", true));
    }

    public final void B(Context context) {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        defaultSharedPreferences.registerOnSharedPreferenceChangeListener(this);
        z(defaultSharedPreferences);
        A(defaultSharedPreferences);
        x(defaultSharedPreferences);
        y(defaultSharedPreferences);
    }

    public void C(String str, String str2, Context context) {
        if (str.contains(";") || str.contains(Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR) || str2.contains(";") || str2.contains(Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR)) {
            return;
        }
        SharedPreferences sharedPreferencesP = p(context);
        List listB = AbstractC1557Mb1.b(";", i(sharedPreferencesP));
        String str3 = str + Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR + str2;
        SharedPreferences.Editor editorEdit = sharedPreferencesP.edit();
        editorEdit.putString("libFolders", AbstractC1557Mb1.h(";", listB, str3, true));
        editorEdit.apply();
    }

    public void D(String str) {
        String str2;
        Context contextI = com.daaw.avee.a.i();
        if (contextI == null) {
            return;
        }
        C2138Rl0 c2138Rl0G = G(contextI);
        Random random = new Random();
        int i2 = 0;
        do {
            i2++;
            str2 = "" + random.nextInt(UtilsKt.MICROS_MULTIPLIER);
            if (!c2138Rl0G.s(str2)) {
                break;
            }
        } while (i2 < 1000000);
        C(str2, str, contextI);
    }

    public void E(Context context, String str, boolean z2) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(str);
        F(context, arrayList, z2);
    }

    public void F(Context context, List list, boolean z2) {
        String str;
        C2138Rl0 c2138Rl0H = H(context);
        ArrayList arrayList = new ArrayList();
        Random random = new Random();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (!z2 || !c2138Rl0H.v(str2)) {
                do {
                    str = "" + random.nextInt(UtilsKt.MICROS_MULTIPLIER);
                } while (c2138Rl0H.s(str));
                if (!str.contains(";") && !str.contains(Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR) && !str2.contains(";") && !str2.contains(Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR)) {
                    arrayList.add(str + Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR + str2);
                }
            }
        }
        U(arrayList, context, "libStandalonePlaylists");
    }

    public C2138Rl0 G(Context context) {
        List<String> listB = AbstractC1557Mb1.b(";", r() + i(p(context)));
        C2138Rl0 c2138Rl0 = new C2138Rl0(listB.size());
        for (String str : listB) {
            int iIndexOf = str.indexOf(Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR);
            if (iIndexOf >= 0) {
                c2138Rl0.add(new B61(str.substring(0, iIndexOf), str.substring(iIndexOf + 1)));
            }
        }
        return c2138Rl0;
    }

    public C2138Rl0 H(Context context) {
        List<String> listB = AbstractC1557Mb1.b(";", P(p(context), "libStandalonePlaylists", ""));
        C2138Rl0 c2138Rl0 = new C2138Rl0(listB.size());
        for (String str : listB) {
            int iIndexOf = str.indexOf(Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR);
            if (iIndexOf >= 0) {
                String strSubstring = str.substring(0, iIndexOf);
                String strSubstring2 = str.substring(iIndexOf + 1);
                if (AbstractC0934Gb1.m(strSubstring2)) {
                    c2138Rl0.add(new B61(strSubstring, strSubstring2));
                }
            }
        }
        return c2138Rl0;
    }

    public void I(String str, String str2) {
        Context contextI = com.daaw.avee.a.i();
        if (contextI == null) {
            return;
        }
        SharedPreferences sharedPreferencesP = p(contextI);
        List listB = AbstractC1557Mb1.b(";", i(sharedPreferencesP));
        String str3 = str + Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR + str2;
        SharedPreferences.Editor editorEdit = sharedPreferencesP.edit();
        editorEdit.putString("libFolders", AbstractC1557Mb1.i(";", listB, str3, true));
        editorEdit.apply();
    }

    public void J(String str, String str2) {
        Context contextI = com.daaw.avee.a.i();
        if (contextI == null) {
            return;
        }
        SharedPreferences sharedPreferencesP = p(contextI);
        List listB = AbstractC1557Mb1.b(";", P(sharedPreferencesP, "libStandalonePlaylists", ""));
        String str3 = str + Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR + str2;
        SharedPreferences.Editor editorEdit = sharedPreferencesP.edit();
        editorEdit.putString("libStandalonePlaylists", AbstractC1557Mb1.i(";", listB, str3, true));
        editorEdit.apply();
    }

    public boolean K(Context context, String str, boolean z2) {
        return L(p(context), str, z2);
    }

    public String O(Context context, String str, String str2) {
        return P(p(context), str, str2);
    }

    public void Q(Context context, String str, boolean z2) {
        R(p(context), str, z2);
    }

    public void S() {
        a0(t, true);
    }

    public void T(Context context) {
        if (!this.f || context == null) {
            return;
        }
        SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(context).edit();
        for (int i2 = 0; i2 < this.a.length(); i2++) {
            editorEdit.putBoolean("bool" + i2, this.a.get(i2) != 0);
        }
        for (int i3 = 0; i3 < this.b.length(); i3++) {
            editorEdit.putInt("int" + i3, this.b.get(i3));
        }
        for (int i4 = 0; i4 < this.c.length(); i4++) {
            editorEdit.putString("string" + i4, (String) this.c.get(i4));
        }
        Y(editorEdit);
        Z(editorEdit);
        X(editorEdit);
        editorEdit.apply();
    }

    public void U(List list, Context context, String str) {
        SharedPreferences sharedPreferencesP = p(context);
        List listB = AbstractC1557Mb1.b(";", P(sharedPreferencesP, str, ""));
        SharedPreferences.Editor editorEdit = sharedPreferencesP.edit();
        editorEdit.putString(str, AbstractC1557Mb1.g(";", listB, list, true));
        editorEdit.apply();
    }

    public final void V(int i2, String str, boolean z2) {
        int iJ0 = j0(i2);
        if (iJ0 < 0) {
            AbstractC0441Bk1.c("invalid _identifier");
        } else if (str == null) {
            h0(iJ0, "", z2);
        } else {
            h0(iJ0, str, z2);
        }
    }

    public void W(int i2, C2695Wu c2695Wu, boolean z2) {
        V(i2, c2695Wu != null ? c2695Wu.o() : null, z2);
    }

    public void X(SharedPreferences.Editor editor) {
        editor.putString("pref_audioVisOffset", "" + k(W));
    }

    public void Y(SharedPreferences.Editor editor) {
        editor.putBoolean("pref_visControlsTimeout", h(n));
    }

    public void Z(SharedPreferences.Editor editor) {
        editor.putBoolean("pref_visualizerGlobalSession", h(A));
    }

    public void a0(int i2, boolean z2) {
        if (z2 != (this.a.getAndSet(i2 - m, z2 ? 1 : 0) != 0)) {
            h.a(Integer.valueOf(i2), Boolean.valueOf(z2));
        }
    }

    public void b0(int i2, boolean z2) {
        this.a.set(i2 - m, z2 ? 1 : 0);
    }

    public void c() {
        StringBuilder sb = new StringBuilder();
        Context contextK = com.daaw.avee.a.k();
        if (contextK == null || Build.VERSION.SDK_INT < 24) {
            try {
                String strB = AbstractC0896Fs.b();
                if (!strB.isEmpty()) {
                    sb.append("-03");
                    sb.append(Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR);
                    sb.append(strB);
                    sb.append(";");
                }
            } catch (Exception unused) {
            }
            if (contextK != null) {
                try {
                    String strD = AbstractC0896Fs.d(contextK);
                    if (!strD.isEmpty()) {
                        sb.append("-02");
                        sb.append(Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR);
                        sb.append(strD);
                        sb.append(";");
                    }
                } catch (Exception unused2) {
                }
            }
        } else {
            Iterator it = s(contextK).iterator();
            while (it.hasNext()) {
                sb.append((String) it.next());
                sb.append(";");
            }
        }
        this.e = sb.toString();
    }

    public void c0(int i2, int i3) {
        d0(i2, i3, false);
    }

    public void d() {
        this.e = null;
    }

    public void d0(int i2, int i3, boolean z2) {
        int andSet = this.b.getAndSet(i2 - F, i3);
        if (z2 || i3 != andSet) {
            g.a(Integer.valueOf(i2), Integer.valueOf(i3), Boolean.valueOf(z2));
        }
    }

    public void e0(int i2, int i3) {
        this.b.set(i2 - F, i3);
    }

    public final String f(String str) {
        r();
        for (String str2 : this.e.split(";")) {
            if (str2.startsWith(str)) {
                int iIndexOf = str2.indexOf(58) + 1;
                int iIndexOf2 = str2.indexOf(Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR, iIndexOf);
                if (iIndexOf2 == -1) {
                    iIndexOf2 = str2.length() - 1;
                }
                return str2.substring(iIndexOf, iIndexOf2);
            }
        }
        return null;
    }

    public void f0(List list) {
        g0(u0, AbstractC1557Mb1.e(";", list));
    }

    public void g0(int i2, String str) {
        h0(i2, str, false);
    }

    public boolean h(int i2) {
        return this.a.get(i2 - m) != 0;
    }

    public void h0(int i2, String str, boolean z2) {
        String str2 = (String) this.c.getAndSet(i2 - Z, str);
        if (z2 || !AbstractC0405Bb1.g(str2, str)) {
            i.a(Integer.valueOf(i2), str, Boolean.valueOf(z2));
        }
    }

    public String i(SharedPreferences sharedPreferences) {
        String strP = P(sharedPreferences, "libFolders", "");
        if (strP.isEmpty()) {
            return j();
        }
        if (strP.split("-0\\d:").length < 2) {
            return strP;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : strP.split(";")) {
            if (!str.startsWith("-")) {
                arrayList.add(str);
            }
        }
        String strF = AbstractC1557Mb1.f(";", arrayList);
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putString("libFolders", strF);
        editorEdit.apply();
        return strF;
    }

    public void i0(int i2, String str) {
        this.c.set(i2 - Z, str);
    }

    public String j() {
        if (this.d == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("001:");
            sb.append("/storage");
            sb.append(";");
            try {
                sb.append("002:");
                sb.append(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM).getCanonicalPath());
                sb.append(";");
            } catch (IOException unused) {
            }
            try {
                sb.append("003:");
                sb.append(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MOVIES).getCanonicalPath());
                sb.append(";");
            } catch (IOException unused2) {
            }
            try {
                sb.append("004:");
                sb.append(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MUSIC).getCanonicalPath());
                sb.append(";");
            } catch (IOException unused3) {
            }
            try {
                sb.append("005:");
                sb.append(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getCanonicalPath());
            } catch (IOException unused4) {
            }
            this.d = sb.toString();
        }
        return this.d;
    }

    public int k(int i2) {
        return this.b.get(i2 - F);
    }

    public void k0(int i2) {
        a0(i2, this.a.get(i2 - m) == 0);
    }

    public String l() {
        return f("-03");
    }

    public final String m(int i2) {
        int iJ0 = j0(i2);
        if (iJ0 < 0) {
            AbstractC0441Bk1.c("invalid _identifier");
            return null;
        }
        String strT = t(iJ0);
        if (AbstractC3565bu.d(strT)) {
            strT = AbstractC3565bu.a(strT);
        }
        if (strT == null || strT.length() <= 0) {
            return null;
        }
        return strT;
    }

    public C2695Wu n(int i2, int[] iArr) {
        String strM = m(i2);
        if (iArr != null) {
            iArr[0] = g(null);
        }
        if (strM == null) {
            return null;
        }
        if (iArr != null) {
            iArr[0] = g(strM);
        }
        return C2695Wu.g(strM);
    }

    public List o() {
        List listB = AbstractC1557Mb1.b(";", t(u0));
        ArrayList arrayList = new ArrayList(listB.size());
        Iterator it = listB.iterator();
        while (it.hasNext()) {
            int iX = AbstractC0405Bb1.x((String) it.next(), -1);
            if (iX >= 0) {
                arrayList.add(Integer.valueOf(iX));
            }
        }
        return arrayList;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (str != null) {
            switch (str) {
                case "pref_audioVisOffset":
                    x(sharedPreferences);
                    break;
                case "pref_visControlsTimeout":
                    z(sharedPreferences);
                    break;
                case "pref_disableHeaderAds":
                    y(sharedPreferences);
                    break;
                case "pref_visualizerGlobalSession":
                    A(sharedPreferences);
                    break;
            }
        }
        j.a(str, this);
    }

    public SharedPreferences p(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context);
    }

    public String q() {
        return f("-02");
    }

    public String r() {
        if (this.e == null) {
            c();
        }
        return this.e;
    }

    public synchronized ArrayList s(Context context) {
        ArrayList arrayList;
        String str;
        try {
            arrayList = new ArrayList();
            Iterator it = ((StorageManager) context.getSystemService(StorageManager.class)).getStorageVolumes().iterator();
            int i2 = 0;
            while (it.hasNext()) {
                StorageVolume storageVolumeA = AbstractC4022da.a(it.next());
                if (storageVolumeA.getState().equalsIgnoreCase("mounted") || storageVolumeA.getState().equalsIgnoreCase("mounted_ro")) {
                    File fileU = u(storageVolumeA);
                    String description = storageVolumeA.getDescription(context);
                    if (storageVolumeA.isPrimary() || "Internal shared storage".equalsIgnoreCase(description)) {
                        str = "-03";
                    } else if (!storageVolumeA.isRemovable()) {
                        str = description;
                    } else if (description.toUpperCase().contains("USB") || fileU.getPath().toUpperCase().contains("USB")) {
                        str = "-01";
                    } else {
                        str = "-02" + i2;
                    }
                    arrayList.add(str + Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR + fileU + Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR + description);
                    i2++;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    public String t(int i2) {
        return (String) this.c.get(i2 - Z);
    }

    public boolean v() {
        return q() != null;
    }

    public void w(Context context) {
        if (this.f) {
            return;
        }
        this.f = true;
        B(context);
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        for (int i2 = 0; i2 < this.a.length(); i2++) {
            try {
                a0(m + i2, L(defaultSharedPreferences, "bool" + i2, this.a.get(i2) != 0));
            } catch (Exception unused) {
            }
        }
        for (int i3 = 0; i3 < this.b.length(); i3++) {
            try {
                c0(F + i3, M(defaultSharedPreferences, "int" + i3, this.b.get(i3)));
            } catch (Exception unused2) {
            }
        }
        for (int i4 = 0; i4 < this.c.length(); i4++) {
            try {
                g0(Z + i4, P(defaultSharedPreferences, "string" + i4, (String) this.c.get(i4)));
            } catch (Exception unused3) {
            }
        }
    }

    public void x(SharedPreferences sharedPreferences) {
        c0(W, AbstractC0405Bb1.w(P(sharedPreferences, "pref_audioVisOffset", "0")));
    }

    public void y(SharedPreferences sharedPreferences) {
        a0(C, L(sharedPreferences, "pref_disableHeaderAds", false));
    }

    public void z(SharedPreferences sharedPreferences) {
        a0(n, L(sharedPreferences, "pref_visControlsTimeout", false));
    }
}
