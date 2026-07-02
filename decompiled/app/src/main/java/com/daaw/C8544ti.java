package com.daaw;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.daaw.ti, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C8544ti {
    public final File a;

    public C8544ti(RK rk) {
        this.a = rk.e("com.crashlytics.settings.json");
    }

    public final File a() {
        return this.a;
    }

    public JSONObject b() throws Throwable {
        Throwable th;
        FileInputStream fileInputStream;
        JSONObject jSONObject;
        C2106Rd0.f().b("Checking for cached settings...");
        FileInputStream fileInputStream2 = null;
        try {
            try {
                File fileA = a();
                if (fileA.exists()) {
                    fileInputStream = new FileInputStream(fileA);
                    try {
                        jSONObject = new JSONObject(AbstractC0555Cn.D(fileInputStream));
                        fileInputStream2 = fileInputStream;
                    } catch (Exception e) {
                        e = e;
                        C2106Rd0.f().e("Failed to fetch cached settings", e);
                        AbstractC0555Cn.e(fileInputStream, "Error while closing settings cache file.");
                        return null;
                    }
                } else {
                    C2106Rd0.f().i("Settings file does not exist.");
                    jSONObject = null;
                }
                AbstractC0555Cn.e(fileInputStream2, "Error while closing settings cache file.");
                return jSONObject;
            } catch (Exception e2) {
                e = e2;
                fileInputStream = null;
            } catch (Throwable th2) {
                th = th2;
                AbstractC0555Cn.e(null, "Error while closing settings cache file.");
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            AbstractC0555Cn.e(null, "Error while closing settings cache file.");
            throw th;
        }
    }

    public void c(long j, JSONObject jSONObject) throws Throwable {
        C2106Rd0.f().i("Writing settings to cache file...");
        if (jSONObject == null) {
            return;
        }
        FileWriter fileWriter = null;
        try {
            try {
                jSONObject.put("expires_at", j);
                FileWriter fileWriter2 = new FileWriter(a());
                try {
                    fileWriter2.write(jSONObject.toString());
                    fileWriter2.flush();
                    AbstractC0555Cn.e(fileWriter2, "Failed to close settings writer.");
                } catch (Exception e) {
                    e = e;
                    fileWriter = fileWriter2;
                    C2106Rd0.f().e("Failed to cache settings", e);
                    AbstractC0555Cn.e(fileWriter, "Failed to close settings writer.");
                } catch (Throwable th) {
                    th = th;
                    fileWriter = fileWriter2;
                    AbstractC0555Cn.e(fileWriter, "Failed to close settings writer.");
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
