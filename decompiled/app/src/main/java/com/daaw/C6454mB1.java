package com.daaw;

import android.os.Environment;
import android.util.Base64;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: renamed from: com.daaw.mB1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6454mB1 {
    public final C9250wB1 a;
    public final C5891kC1 b;
    public final boolean c;

    public C6454mB1() {
        this.b = C6179lC1.O();
        this.c = false;
        this.a = new C9250wB1();
    }

    public static C6454mB1 a() {
        return new C6454mB1();
    }

    public final synchronized void b(InterfaceC6175lB1 interfaceC6175lB1) {
        if (this.c) {
            try {
                interfaceC6175lB1.a(this.b);
            } catch (NullPointerException e) {
                zzt.zzo().u(e, "AdMobClearcutLogger.modify");
            }
        }
    }

    public final synchronized void c(int i) {
        if (this.c) {
            if (((Boolean) zzba.zzc().b(AbstractC9820yE1.N4)).booleanValue()) {
                e(i);
            } else {
                f(i);
            }
        }
    }

    public final synchronized String d(int i) {
        return String.format("id=%s,timestamp=%s,event=%s,data=%s\n", this.b.z(), Long.valueOf(zzt.zzB().b()), Integer.valueOf(i - 1), Base64.encodeToString(((C6179lC1) this.b.j()).h(), 3));
    }

    public final synchronized void e(int i) {
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        if (externalStorageDirectory == null) {
            return;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(externalStorageDirectory, "clearcut_events.txt"), true);
            try {
                try {
                    fileOutputStream.write(d(i).getBytes());
                } finally {
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused) {
                        zze.zza("Could not close Clearcut output stream.");
                    }
                }
            } catch (IOException unused2) {
                zze.zza("Could not write Clearcut to file.");
                try {
                    fileOutputStream.close();
                } catch (IOException unused3) {
                    zze.zza("Could not close Clearcut output stream.");
                }
            }
        } catch (FileNotFoundException unused4) {
            zze.zza("Could not find file for Clearcut");
        }
    }

    public final synchronized void f(int i) {
        C5891kC1 c5891kC1 = this.b;
        c5891kC1.r();
        c5891kC1.p(com.google.android.gms.ads.internal.util.zzt.zzd());
        C8971vB1 c8971vB1 = new C8971vB1(this.a, ((C6179lC1) this.b.j()).h(), null);
        int i2 = i - 1;
        c8971vB1.a(i2);
        c8971vB1.c();
        zze.zza("Logging Event with event code : ".concat(String.valueOf(Integer.toString(i2, 10))));
    }

    public C6454mB1(C9250wB1 c9250wB1) {
        this.b = C6179lC1.O();
        this.a = c9250wB1;
        this.c = ((Boolean) zzba.zzc().b(AbstractC9820yE1.M4)).booleanValue();
    }
}
