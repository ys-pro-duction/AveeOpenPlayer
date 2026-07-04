package androidx.profileinstaller;

import android.content.res.AssetManager;
import android.os.Build;
import androidx.profileinstaller.c;
import com.daaw.AbstractC2194Rz0;
import com.daaw.AbstractC2300Sz0;
import com.daaw.FG;
import com.daaw.JB;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class b {
    public final AssetManager a;
    public final Executor b;
    public final c.InterfaceC0025c c;
    public final File e;
    public final String f;
    public final String g;
    public final String h;
    public JB[] j;
    public byte[] k;
    public boolean i = false;
    public final byte[] d = d();

    public b(AssetManager assetManager, Executor executor, c.InterfaceC0025c interfaceC0025c, String str, String str2, String str3, File file) {
        this.a = assetManager;
        this.b = executor;
        this.c = interfaceC0025c;
        this.f = str;
        this.g = str2;
        this.h = str3;
        this.e = file;
    }

    public static byte[] d() {
        int i = Build.VERSION.SDK_INT;
        if (i < 24 || i > 34) {
            return null;
        }
        switch (i) {
            case 24:
            case 25:
                return AbstractC2300Sz0.e;
            case 26:
                return AbstractC2300Sz0.d;
            case 27:
                return AbstractC2300Sz0.c;
            case 28:
            case 29:
            case 30:
                return AbstractC2300Sz0.b;
            case 31:
            case 32:
            case 33:
            case 34:
                return AbstractC2300Sz0.a;
            default:
                return null;
        }
    }

    public static boolean j() {
        int i = Build.VERSION.SDK_INT;
        if (i < 24 || i > 34) {
            return false;
        }
        if (i != 24 && i != 25) {
            switch (i) {
                case 31:
                case 32:
                case 33:
                case 34:
                    break;
                default:
                    return false;
            }
        }
        return true;
    }

    public final b b(JB[] jbArr, byte[] bArr) {
        InputStream inputStreamG;
        try {
            inputStreamG = g(this.a, this.h);
        } catch (FileNotFoundException e) {
            this.c.b(9, e);
        } catch (IOException e2) {
            this.c.b(7, e2);
        } catch (IllegalStateException e3) {
            this.j = null;
            this.c.b(8, e3);
        }
        if (inputStreamG == null) {
            if (inputStreamG != null) {
                inputStreamG.close();
            }
            return null;
        }
        try {
            this.j = AbstractC2194Rz0.q(inputStreamG, AbstractC2194Rz0.o(inputStreamG, AbstractC2194Rz0.b), bArr, jbArr);
            inputStreamG.close();
            return this;
        } catch (Throwable th) {
            try {
                inputStreamG.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void c() {
        if (!this.i) {
            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
        }
    }

    public boolean e() {
        if (this.d == null) {
            k(3, Integer.valueOf(Build.VERSION.SDK_INT));
            return false;
        }
        if (!this.e.exists()) {
            try {
                this.e.createNewFile();
            } catch (IOException unused) {
                k(4, null);
                return false;
            }
        } else if (!this.e.canWrite()) {
            k(4, null);
            return false;
        }
        this.i = true;
        return true;
    }

    public final InputStream f(AssetManager assetManager) {
        try {
            return g(assetManager, this.g);
        } catch (FileNotFoundException e) {
            this.c.b(6, e);
            return null;
        } catch (IOException e2) {
            this.c.b(7, e2);
            return null;
        }
    }

    public final InputStream g(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e) {
            String message = e.getMessage();
            if (message != null && message.contains("compressed")) {
                this.c.a(5, null);
            }
            return null;
        }
    }

    public b h() {
        b bVarB;
        c();
        if (this.d != null) {
            InputStream inputStreamF = f(this.a);
            if (inputStreamF != null) {
                this.j = i(inputStreamF);
            }
            JB[] jbArr = this.j;
            if (jbArr != null && j() && (bVarB = b(jbArr, this.d)) != null) {
                return bVarB;
            }
        }
        return this;
    }

    public final JB[] i(InputStream inputStream) {
        try {
            try {
                try {
                    try {
                        JB[] jbArrW = AbstractC2194Rz0.w(inputStream, AbstractC2194Rz0.o(inputStream, AbstractC2194Rz0.a), this.f);
                        try {
                            inputStream.close();
                            return jbArrW;
                        } catch (IOException e) {
                            this.c.b(7, e);
                            return jbArrW;
                        }
                    } catch (IOException e2) {
                        this.c.b(7, e2);
                        inputStream.close();
                        return null;
                    }
                } catch (IllegalStateException e3) {
                    this.c.b(8, e3);
                    inputStream.close();
                    return null;
                }
            } catch (IOException e4) {
                this.c.b(7, e4);
                return null;
            }
        } catch (Throwable th) {
            try {
                inputStream.close();
            } catch (IOException e5) {
                this.c.b(7, e5);
            }
            throw th;
        }
    }

    public final void k(final int i, final Object obj) {
        this.b.execute(new Runnable() { // from class: com.daaw.GB
            @Override // java.lang.Runnable
            public final void run() {
                this.B.c.b(i, obj);
            }
        });
    }

    public b l() {
        ByteArrayOutputStream byteArrayOutputStream;
        JB[] jbArr = this.j;
        byte[] bArr = this.d;
        if (jbArr != null && bArr != null) {
            c();
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
            } catch (IOException e) {
                this.c.b(7, e);
            } catch (IllegalStateException e2) {
                this.c.b(8, e2);
            }
            try {
                AbstractC2194Rz0.E(byteArrayOutputStream, bArr);
                if (!AbstractC2194Rz0.B(byteArrayOutputStream, bArr, jbArr)) {
                    this.c.b(5, null);
                    this.j = null;
                    byteArrayOutputStream.close();
                    return this;
                }
                this.k = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
                this.j = null;
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        return this;
    }

    public boolean m() {
        byte[] bArr = this.k;
        if (bArr == null) {
            return false;
        }
        c();
        try {
            try {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(this.e);
                    try {
                        FG.l(byteArrayInputStream, fileOutputStream);
                        k(1, null);
                        fileOutputStream.close();
                        byteArrayInputStream.close();
                        return true;
                    } finally {
                    }
                } catch (Throwable th) {
                    try {
                        byteArrayInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (FileNotFoundException e) {
                k(6, e);
                return false;
            } catch (IOException e2) {
                k(7, e2);
                return false;
            }
        } finally {
            this.k = null;
            this.j = null;
        }
    }
}
