package com.daaw;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.daaw.Wj0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C2652Wj0 {
    public static final Charset b = Charset.forName("UTF-8");
    public final RK a;

    public C2652Wj0(RK rk) {
        this.a = rk;
    }

    public static Map d(String str) {
        JSONObject jSONObject = new JSONObject(str);
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            map.put(next, j(jSONObject, next));
        }
        return map;
    }

    public static String f(Map map) {
        return new JSONObject(map).toString();
    }

    public static void i(File file) {
        if (file.exists() && file.delete()) {
            C2106Rd0.f().g("Deleted corrupt file: " + file.getAbsolutePath());
        }
    }

    public static String j(JSONObject jSONObject, String str) {
        if (jSONObject.isNull(str)) {
            return null;
        }
        return jSONObject.optString(str, null);
    }

    public File a(String str) {
        return this.a.o(str, "internal-keys");
    }

    public File b(String str) {
        return this.a.o(str, "keys");
    }

    public File c(String str) {
        return this.a.o(str, "user-data");
    }

    public final String e(String str) {
        return j(new JSONObject(str), "userId");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [long] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v6 */
    public Map g(String str, boolean z) throws Throwable {
        FileInputStream fileInputStream;
        Exception e;
        File fileA = z ? a(str) : b(str);
        if (fileA.exists()) {
            ?? length = fileA.length();
            if (length != 0) {
                ?? r8 = 0;
                try {
                    try {
                        fileInputStream = new FileInputStream(fileA);
                    } catch (Exception e2) {
                        fileInputStream = null;
                        e = e2;
                    } catch (Throwable th) {
                        th = th;
                        AbstractC0555Cn.e(r8, "Failed to close user metadata file.");
                        throw th;
                    }
                    try {
                        Map mapD = d(AbstractC0555Cn.D(fileInputStream));
                        AbstractC0555Cn.e(fileInputStream, "Failed to close user metadata file.");
                        return mapD;
                    } catch (Exception e3) {
                        e = e3;
                        C2106Rd0.f().l("Error deserializing user metadata.", e);
                        i(fileA);
                        AbstractC0555Cn.e(fileInputStream, "Failed to close user metadata file.");
                        return Collections.EMPTY_MAP;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    r8 = length;
                    AbstractC0555Cn.e(r8, "Failed to close user metadata file.");
                    throw th;
                }
            }
        }
        i(fileA);
        return Collections.EMPTY_MAP;
    }

    public String h(String str) throws Throwable {
        FileInputStream fileInputStream;
        File fileC = c(str);
        FileInputStream fileInputStream2 = null;
        if (!fileC.exists() || fileC.length() == 0) {
            C2106Rd0.f().b("No userId set for session " + str);
            i(fileC);
            return null;
        }
        try {
            fileInputStream = new FileInputStream(fileC);
        } catch (Exception e) {
            e = e;
            fileInputStream = null;
        } catch (Throwable th) {
            th = th;
            AbstractC0555Cn.e(fileInputStream2, "Failed to close user metadata file.");
            throw th;
        }
        try {
            try {
                String strE = e(AbstractC0555Cn.D(fileInputStream));
                C2106Rd0.f().b("Loaded userId " + strE + " for session " + str);
                AbstractC0555Cn.e(fileInputStream, "Failed to close user metadata file.");
                return strE;
            } catch (Throwable th2) {
                th = th2;
                fileInputStream2 = fileInputStream;
                AbstractC0555Cn.e(fileInputStream2, "Failed to close user metadata file.");
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            C2106Rd0.f().l("Error deserializing user metadata.", e);
            i(fileC);
            AbstractC0555Cn.e(fileInputStream, "Failed to close user metadata file.");
            return null;
        }
    }

    public void k(String str, Map map, boolean z) throws Throwable {
        File fileA = z ? a(str) : b(str);
        BufferedWriter bufferedWriter = null;
        try {
            try {
                String strF = f(map);
                BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileA), b));
                try {
                    bufferedWriter2.write(strF);
                    bufferedWriter2.flush();
                    AbstractC0555Cn.e(bufferedWriter2, "Failed to close key/value metadata file.");
                } catch (Exception e) {
                    e = e;
                    bufferedWriter = bufferedWriter2;
                    C2106Rd0.f().l("Error serializing key/value metadata.", e);
                    i(fileA);
                    AbstractC0555Cn.e(bufferedWriter, "Failed to close key/value metadata file.");
                } catch (Throwable th) {
                    th = th;
                    bufferedWriter = bufferedWriter2;
                    AbstractC0555Cn.e(bufferedWriter, "Failed to close key/value metadata file.");
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
