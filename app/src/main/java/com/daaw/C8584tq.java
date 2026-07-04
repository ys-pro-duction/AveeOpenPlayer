package com.daaw;

import android.content.Context;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.daaw.tq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C8584tq {
    public static final Map c = new HashMap();
    public final Context a;
    public final String b;

    public C8584tq(Context context, String str) {
        this.a = context;
        this.b = str;
    }

    public static synchronized C8584tq c(Context context, String str) {
        Map map;
        try {
            map = c;
            if (!map.containsKey(str)) {
                map.put(str, new C8584tq(context, str));
            }
        } catch (Throwable th) {
            throw th;
        }
        return (C8584tq) map.get(str);
    }

    public synchronized Void a() {
        this.a.deleteFile(this.b);
        return null;
    }

    public String b() {
        return this.b;
    }

    public synchronized com.google.firebase.remoteconfig.internal.b d() {
        FileInputStream fileInputStreamOpenFileInput;
        Throwable th;
        try {
            fileInputStreamOpenFileInput = this.a.openFileInput(this.b);
            try {
                int iAvailable = fileInputStreamOpenFileInput.available();
                byte[] bArr = new byte[iAvailable];
                fileInputStreamOpenFileInput.read(bArr, 0, iAvailable);
                com.google.firebase.remoteconfig.internal.b bVarB = com.google.firebase.remoteconfig.internal.b.b(new JSONObject(new String(bArr, "UTF-8")));
                fileInputStreamOpenFileInput.close();
                return bVarB;
            } catch (FileNotFoundException | JSONException unused) {
                if (fileInputStreamOpenFileInput != null) {
                    fileInputStreamOpenFileInput.close();
                }
                return null;
            } catch (Throwable th2) {
                th = th2;
                if (fileInputStreamOpenFileInput != null) {
                    fileInputStreamOpenFileInput.close();
                }
                throw th;
            }
        } catch (FileNotFoundException | JSONException unused2) {
            fileInputStreamOpenFileInput = null;
        } catch (Throwable th3) {
            fileInputStreamOpenFileInput = null;
            th = th3;
        }
    }

    public synchronized Void e(com.google.firebase.remoteconfig.internal.b bVar) {
        FileOutputStream fileOutputStreamOpenFileOutput = this.a.openFileOutput(this.b, 0);
        try {
            fileOutputStreamOpenFileOutput.write(bVar.toString().getBytes("UTF-8"));
        } finally {
            fileOutputStreamOpenFileOutput.close();
        }
        return null;
    }
}
