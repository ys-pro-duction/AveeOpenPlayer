package com.daaw;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.daaw.Nt0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C1732Nt0 {
    public File a;
    public final C7050oL b;

    /* JADX INFO: renamed from: com.daaw.Nt0$a */
    public enum a {
        ATTEMPT_MIGRATION,
        NOT_GENERATED,
        UNREGISTERED,
        REGISTERED,
        REGISTER_ERROR
    }

    public C1732Nt0(C7050oL c7050oL) {
        this.b = c7050oL;
    }

    public final File a() {
        if (this.a == null) {
            synchronized (this) {
                try {
                    if (this.a == null) {
                        this.a = new File(this.b.k().getFilesDir(), "PersistedInstallation." + this.b.o() + ".json");
                    }
                } finally {
                }
            }
        }
        return this.a;
    }

    public AbstractC1836Ot0 b(AbstractC1836Ot0 abstractC1836Ot0) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", abstractC1836Ot0.d());
            jSONObject.put("Status", abstractC1836Ot0.g().ordinal());
            jSONObject.put("AuthToken", abstractC1836Ot0.b());
            jSONObject.put("RefreshToken", abstractC1836Ot0.f());
            jSONObject.put("TokenCreationEpochInSecs", abstractC1836Ot0.h());
            jSONObject.put("ExpiresInSecs", abstractC1836Ot0.c());
            jSONObject.put("FisError", abstractC1836Ot0.e());
            File fileCreateTempFile = File.createTempFile("PersistedInstallation", "tmp", this.b.k().getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (!fileCreateTempFile.renameTo(a())) {
                throw new IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        } catch (IOException | JSONException unused) {
        }
        return abstractC1836Ot0;
    }

    public final JSONObject c() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            FileInputStream fileInputStream = new FileInputStream(a());
            while (true) {
                try {
                    int i = fileInputStream.read(bArr, 0, 16384);
                    if (i < 0) {
                        JSONObject jSONObject = new JSONObject(byteArrayOutputStream.toString());
                        fileInputStream.close();
                        return jSONObject;
                    }
                    byteArrayOutputStream.write(bArr, 0, i);
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        } catch (IOException | JSONException unused) {
            return new JSONObject();
        }
    }

    public AbstractC1836Ot0 d() {
        JSONObject jSONObjectC = c();
        String strOptString = jSONObjectC.optString("Fid", null);
        int iOptInt = jSONObjectC.optInt("Status", a.ATTEMPT_MIGRATION.ordinal());
        String strOptString2 = jSONObjectC.optString("AuthToken", null);
        String strOptString3 = jSONObjectC.optString("RefreshToken", null);
        long jOptLong = jSONObjectC.optLong("TokenCreationEpochInSecs", 0L);
        long jOptLong2 = jSONObjectC.optLong("ExpiresInSecs", 0L);
        return AbstractC1836Ot0.a().d(strOptString).g(a.values()[iOptInt]).b(strOptString2).f(strOptString3).h(jOptLong).c(jOptLong2).e(jSONObjectC.optString("FisError", null)).a();
    }
}
