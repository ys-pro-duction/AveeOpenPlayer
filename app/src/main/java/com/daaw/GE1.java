package com.daaw;

import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzt;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public final class GE1 {
    public String d;
    public Context e;
    public String f;
    public AtomicBoolean h;
    public File i;
    public final BlockingQueue a = new ArrayBlockingQueue(100);
    public final LinkedHashMap b = new LinkedHashMap();
    public final Map c = new HashMap();
    public final HashSet g = new HashSet(Arrays.asList("noop", "activeViewPingSent", "viewabilityChanged", "visibilityChanged"));

    public static /* synthetic */ void c(GE1 ge1) throws Throwable {
        while (true) {
            try {
                VE1 ve1 = (VE1) ge1.a.take();
                PE1 pe1A = ve1.a();
                if (!TextUtils.isEmpty(pe1A.b())) {
                    ge1.g(ge1.b(ge1.b, ve1.b()), pe1A);
                }
            } catch (InterruptedException e) {
                AbstractC4274eT1.zzk("CsiReporter:reporter interrupted", e);
                return;
            }
        }
    }

    public final ME1 a(String str) {
        ME1 me1 = (ME1) this.c.get(str);
        return me1 != null ? me1 : ME1.a;
    }

    public final Map b(Map map, Map map2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        for (Map.Entry entry : map2.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            linkedHashMap.put(str, a(str).a((String) linkedHashMap.get(str), str2));
        }
        return linkedHashMap;
    }

    public final void d(Context context, String str, String str2, Map map) {
        File externalStorageDirectory;
        this.e = context;
        this.f = str;
        this.d = str2;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.h = atomicBoolean;
        atomicBoolean.set(((Boolean) AbstractC7864rF1.c.e()).booleanValue());
        if (this.h.get() && (externalStorageDirectory = Environment.getExternalStorageDirectory()) != null) {
            this.i = new File(externalStorageDirectory, "sdk_csi_data.txt");
        }
        for (Map.Entry entry : map.entrySet()) {
            this.b.put((String) entry.getKey(), (String) entry.getValue());
        }
        AbstractC9322wT1.a.execute(new Runnable() { // from class: com.daaw.FE1
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                GE1.c(this.B);
            }
        });
        Map map2 = this.c;
        ME1 me1 = ME1.b;
        map2.put("action", me1);
        this.c.put("ad_format", me1);
        this.c.put("e", ME1.c);
    }

    public final void e(String str) throws Throwable {
        if (this.g.contains(str)) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("sdkVersion", this.f);
        linkedHashMap.put("ue", str);
        g(b(this.b, linkedHashMap), null);
    }

    public final boolean f(VE1 ve1) {
        return this.a.offer(ve1);
    }

    public final void g(Map map, PE1 pe1) throws Throwable {
        Uri.Builder builderBuildUpon = Uri.parse(this.d).buildUpon();
        for (Map.Entry entry : map.entrySet()) {
            builderBuildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        String string = builderBuildUpon.build().toString();
        if (pe1 != null) {
            StringBuilder sb = new StringBuilder(string);
            if (!TextUtils.isEmpty(pe1.b())) {
                sb.append("&it=");
                sb.append(pe1.b());
            }
            if (!TextUtils.isEmpty(pe1.a())) {
                sb.append("&blat=");
                sb.append(pe1.a());
            }
            string = sb.toString();
        }
        if (!this.h.get()) {
            zzt.zzp();
            com.google.android.gms.ads.internal.util.zzt.zzK(this.e, this.f, string);
            return;
        }
        File file = this.i;
        if (file == null) {
            AbstractC4274eT1.zzj("CsiReporter: File doesn't exist. Cannot write CSI data to file.");
            return;
        }
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file, true);
                try {
                    fileOutputStream2.write(string.getBytes());
                    fileOutputStream2.write(10);
                    try {
                        fileOutputStream2.close();
                    } catch (IOException e) {
                        AbstractC4274eT1.zzk("CsiReporter: Cannot close file: sdk_csi_data.txt.", e);
                    }
                } catch (IOException e2) {
                    e = e2;
                    fileOutputStream = fileOutputStream2;
                    AbstractC4274eT1.zzk("CsiReporter: Cannot write to file: sdk_csi_data.txt.", e);
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e3) {
                            AbstractC4274eT1.zzk("CsiReporter: Cannot close file: sdk_csi_data.txt.", e3);
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e4) {
                            AbstractC4274eT1.zzk("CsiReporter: Cannot close file: sdk_csi_data.txt.", e4);
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e5) {
            e = e5;
        }
    }
}
