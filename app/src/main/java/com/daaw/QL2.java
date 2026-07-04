package com.daaw;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.File;
import java.util.HashSet;

/* JADX INFO: loaded from: classes3.dex */
public final class QL2 {
    public static final Object f = new Object();
    public final Context a;
    public final SharedPreferences b;
    public final String c;
    public final InterfaceC10128zL2 d;
    public boolean e;

    public QL2(Context context, int i, InterfaceC10128zL2 interfaceC10128zL2, boolean z) {
        this.e = false;
        this.a = context;
        this.c = Integer.toString(i - 1);
        this.b = context.getSharedPreferences("pcvmspf", 0);
        this.d = interfaceC10128zL2;
        this.e = z;
    }

    public static String f(C5269hz1 c5269hz1) {
        C5828jz1 c5828jz1P = C6116kz1.P();
        c5828jz1P.t(c5269hz1.O().V());
        c5828jz1P.n(c5269hz1.O().U());
        c5828jz1P.o(c5269hz1.O().M());
        c5828jz1P.r(c5269hz1.O().O());
        c5828jz1P.p(c5269hz1.O().N());
        return RV.a(((C6116kz1) c5828jz1P.j()).h());
    }

    public final boolean a(C5269hz1 c5269hz1) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (f) {
            try {
                if (!ML2.e(new File(e(c5269hz1.O().V()), "pcbc"), c5269hz1.P().e())) {
                    i(4020, jCurrentTimeMillis);
                    return false;
                }
                String strF = f(c5269hz1);
                SharedPreferences.Editor editorEdit = this.b.edit();
                editorEdit.putString(h(), strF);
                boolean zCommit = editorEdit.commit();
                if (zCommit) {
                    i(5015, jCurrentTimeMillis);
                } else {
                    i(4021, jCurrentTimeMillis);
                }
                return zCommit;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean b(C5269hz1 c5269hz1, PL2 pl2) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (f) {
            try {
                C6116kz1 c6116kz1K = k(1);
                String strV = c5269hz1.O().V();
                if (c6116kz1K != null && c6116kz1K.V().equals(strV)) {
                    i(4014, jCurrentTimeMillis);
                    return false;
                }
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                File fileE = e(strV);
                if (fileE.exists()) {
                    j(4023, jCurrentTimeMillis2, "d:" + (true != fileE.isDirectory() ? "0" : "1") + ",f:" + (true != fileE.isFile() ? "0" : "1"));
                    i(4015, jCurrentTimeMillis2);
                } else if (!fileE.mkdirs()) {
                    j(4024, jCurrentTimeMillis2, "cw:".concat(true != fileE.canWrite() ? "0" : "1"));
                    i(4015, jCurrentTimeMillis2);
                    return false;
                }
                File fileE2 = e(strV);
                File file = new File(fileE2, "pcam.jar");
                File file2 = new File(fileE2, "pcbc");
                if (!ML2.e(file, c5269hz1.Q().e())) {
                    i(4016, jCurrentTimeMillis);
                    return false;
                }
                if (!ML2.e(file2, c5269hz1.P().e())) {
                    i(4017, jCurrentTimeMillis);
                    return false;
                }
                if (pl2 != null && !pl2.a(file)) {
                    i(4018, jCurrentTimeMillis);
                    ML2.d(fileE2);
                    return false;
                }
                String strF = f(c5269hz1);
                long jCurrentTimeMillis3 = System.currentTimeMillis();
                String string = this.b.getString(h(), null);
                SharedPreferences.Editor editorEdit = this.b.edit();
                editorEdit.putString(h(), strF);
                if (string != null) {
                    editorEdit.putString(g(), string);
                }
                if (!editorEdit.commit()) {
                    i(4019, jCurrentTimeMillis3);
                    return false;
                }
                HashSet hashSet = new HashSet();
                C6116kz1 c6116kz1K2 = k(1);
                if (c6116kz1K2 != null) {
                    hashSet.add(c6116kz1K2.V());
                }
                C6116kz1 c6116kz1K3 = k(2);
                if (c6116kz1K3 != null) {
                    hashSet.add(c6116kz1K3.V());
                }
                for (File file3 : new File(this.a.getDir("pccache", 0), this.c).listFiles()) {
                    if (!hashSet.contains(file3.getName())) {
                        ML2.d(file3);
                    }
                }
                i(5014, jCurrentTimeMillis);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final KL2 c(int i) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (f) {
            try {
                C6116kz1 c6116kz1K = k(1);
                if (c6116kz1K == null) {
                    i(4022, jCurrentTimeMillis);
                    return null;
                }
                File fileE = e(c6116kz1K.V());
                File file = new File(fileE, "pcam.jar");
                if (!file.exists()) {
                    file = new File(fileE, "pcam");
                }
                File file2 = new File(fileE, "pcbc");
                File file3 = new File(fileE, "pcopt");
                i(5016, jCurrentTimeMillis);
                return new KL2(c6116kz1K, file, file2, file3);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean d(int i) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (f) {
            try {
                C6116kz1 c6116kz1K = k(1);
                if (c6116kz1K == null) {
                    i(4025, jCurrentTimeMillis);
                    return false;
                }
                File fileE = e(c6116kz1K.V());
                if (!new File(fileE, "pcam.jar").exists()) {
                    i(4026, jCurrentTimeMillis);
                    return false;
                }
                if (new File(fileE, "pcbc").exists()) {
                    i(5019, jCurrentTimeMillis);
                    return true;
                }
                i(4027, jCurrentTimeMillis);
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final File e(String str) {
        return new File(new File(this.a.getDir("pccache", 0), this.c), str);
    }

    public final String g() {
        return "FBAMTD".concat(String.valueOf(this.c));
    }

    public final String h() {
        return "LATMTD".concat(String.valueOf(this.c));
    }

    public final void i(int i, long j) {
        this.d.b(i, j);
    }

    public final void j(int i, long j, String str) {
        this.d.a(i, j, str);
    }

    public final C6116kz1 k(int i) {
        String string = i == 1 ? this.b.getString(h(), null) : this.b.getString(g(), null);
        if (string == null) {
            return null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            byte[] bArrC = RV.c(string);
            AbstractC9213w33 abstractC9213w33 = AbstractC9213w33.C;
            return C6116kz1.T(AbstractC9213w33.T(bArrC, 0, bArrC.length), this.e ? U33.a() : U33.b());
        } catch (C8939v43 unused) {
            return null;
        } catch (NullPointerException unused2) {
            i(2029, jCurrentTimeMillis);
            return null;
        } catch (RuntimeException unused3) {
            i(2032, jCurrentTimeMillis);
            return null;
        }
    }
}
