package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import com.daaw.ExecutorC2748Xh0;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    public static final InterfaceC0025c a = new a();
    public static final InterfaceC0025c b = new b();

    public class a implements InterfaceC0025c {
        @Override // androidx.profileinstaller.c.InterfaceC0025c
        public void a(int i, Object obj) {
        }

        @Override // androidx.profileinstaller.c.InterfaceC0025c
        public void b(int i, Object obj) {
        }
    }

    public class b implements InterfaceC0025c {
        @Override // androidx.profileinstaller.c.InterfaceC0025c
        public void a(int i, Object obj) {
        }

        @Override // androidx.profileinstaller.c.InterfaceC0025c
        public void b(int i, Object obj) {
            if (i == 6 || i == 7 || i == 8) {
            }
        }
    }

    /* JADX INFO: renamed from: androidx.profileinstaller.c$c, reason: collision with other inner class name */
    public interface InterfaceC0025c {
        void a(int i, Object obj);

        void b(int i, Object obj);
    }

    public static boolean b(File file) {
        return new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat").delete();
    }

    public static void c(Context context, Executor executor, InterfaceC0025c interfaceC0025c) {
        b(context.getFilesDir());
        f(executor, interfaceC0025c, 11, null);
    }

    public static boolean d(PackageInfo packageInfo, File file, InterfaceC0025c interfaceC0025c) {
        File file2 = new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
        if (!file2.exists()) {
            return false;
        }
        try {
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file2));
            try {
                long j = dataInputStream.readLong();
                dataInputStream.close();
                boolean z = j == packageInfo.lastUpdateTime;
                if (z) {
                    interfaceC0025c.b(2, null);
                }
                return z;
            } finally {
            }
        } catch (IOException unused) {
            return false;
        }
    }

    public static void e(PackageInfo packageInfo, File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } finally {
            }
        } catch (IOException unused) {
        }
    }

    public static void f(Executor executor, final InterfaceC0025c interfaceC0025c, final int i, final Object obj) {
        executor.execute(new Runnable() { // from class: com.daaw.Mz0
            @Override // java.lang.Runnable
            public final void run() {
                interfaceC0025c.b(i, obj);
            }
        });
    }

    public static boolean g(AssetManager assetManager, String str, PackageInfo packageInfo, File file, String str2, Executor executor, InterfaceC0025c interfaceC0025c) {
        androidx.profileinstaller.b bVar = new androidx.profileinstaller.b(assetManager, executor, interfaceC0025c, str2, "dexopt/baseline.prof", "dexopt/baseline.profm", new File(new File("/data/misc/profiles/cur/0", str), "primary.prof"));
        if (!bVar.e()) {
            return false;
        }
        boolean zM = bVar.h().l().m();
        if (zM) {
            e(packageInfo, file);
        }
        return zM;
    }

    public static void h(Context context) {
        i(context, new ExecutorC2748Xh0(), a);
    }

    public static void i(Context context, Executor executor, InterfaceC0025c interfaceC0025c) {
        j(context, executor, interfaceC0025c, false);
    }

    public static void j(Context context, Executor executor, InterfaceC0025c interfaceC0025c, boolean z) {
        Context applicationContext = context.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        AssetManager assets = applicationContext.getAssets();
        String name = new File(applicationInfo.sourceDir).getName();
        boolean z2 = false;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            File filesDir = context.getFilesDir();
            if (!z && d(packageInfo, filesDir, interfaceC0025c)) {
                context.getPackageName();
                d.c(context, false);
                return;
            }
            context.getPackageName();
            if (g(assets, packageName, packageInfo, filesDir, name, executor, interfaceC0025c) && z) {
                z2 = true;
            }
            d.c(context, z2);
        } catch (PackageManager.NameNotFoundException e) {
            interfaceC0025c.b(7, e);
            d.c(context, false);
        }
    }

    public static void k(Context context, Executor executor, InterfaceC0025c interfaceC0025c) {
        try {
            e(context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0), context.getFilesDir());
            f(executor, interfaceC0025c, 10, null);
        } catch (PackageManager.NameNotFoundException e) {
            f(executor, interfaceC0025c, 7, e);
        }
    }
}
